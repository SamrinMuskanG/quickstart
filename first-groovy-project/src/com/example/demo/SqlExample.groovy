package com.example.demo
import groovy.sql.Sql
class SqlExample {
	
	static void main(String[]args) {
		
		def sqlConn=
//		Sql.newInstance(url:"jdbc:mysql://localhost:3306/tieto_customer",user:"root",password:"123456",driverClassName:"com.mysql.cj.jdbc.Driver")
//       sqlConn.eachRow('select * from product_sep_2022') { 
//	tp->
//	println([tp.id,tp.product_name,tp.rate_per_unit])
	//}
		Sql.newInstance(url:"jdbc:mysql://localhost:3306/tieto_customer",user:"root",password:"123456",driverClassName:"com.mysql.cj.jdbc.Driver")
		sqlConn.eachRow('select * from product_sep_2022') {
	 tp->
	 Product obj=new Product(tp.id,tp.product_name,tp.rate_per_unit)
	 println(obj)
	// println([tp.id,tp.product_name,tp.rate_per_unit])
		}
		//for loop in groovy
		1.upto(20) {println "$it"}
	  sqlConn.close();
		
			}
}
