package com.example.demo.config;

import java.util.List;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.example.demo.entity.Student;
import com.example.demo.repos.StudentRepository;



@Configuration
@EnableBatchProcessing
public class BatchConfig {
	
	
	//Traditional method of above method
	//class Dummy implements ItemWriter<Student>{
	//@Autowired
//		StudentRepository repo;
//		@Override
//		public void write(List<? extends Student> items) throws Exception {
//		this.repo.saveAll(items);	
//			
//		}
	//}	
	
@Bean
public ItemWriter<Student> writer(StudentRepository repo){
	
	return students -> repo.saveAll(students);
	
	
          }

@Bean
public ItemProcessor<Student, Student> processor(){

	return student ->{
		
		if(student.getMarkScored()<60) {
			student.setMarkScored(student.getMarkScored()+7);
		}
		return student;
	};
 }
@Bean
public DefaultLineMapper<Student> mapper(){
	
	DefaultLineMapper<Student> mapper=new DefaultLineMapper();
	DelimitedLineTokenizer tokenizer=new DelimitedLineTokenizer();
	tokenizer.setNames("rollNumber","studentName","markScored");
	
	BeanWrapperFieldSetMapper<Student> fieldMapper= new BeanWrapperFieldSetMapper<>();
	fieldMapper.setTargetType(Student.class);
	
	mapper.setFieldSetMapper(fieldMapper);
	mapper.setLineTokenizer(tokenizer);
	
	return mapper;
}
@Bean
public FlatFileItemReader<Student> reader(){
	
	FlatFileItemReader<Student> reader=new FlatFileItemReader<>();
	reader.setResource(new ClassPathResource("/students.csv"));
	reader.setLinesToSkip(1);
	reader.setLineMapper(mapper());
	
	return reader;
	
}

@Bean
public Step stepOne(StepBuilderFactory sbf,StudentRepository repo) {
return sbf.get	("studentJob").<Student,Student>chunk(4).reader(reader()).processor(processor()).writer(writer(repo)).build();
}

@Bean
public Job jobOne(JobBuilderFactory jbf,Step stepOne) {
	return jbf.get("studentJob").start(stepOne).build();
	
}
	
}

