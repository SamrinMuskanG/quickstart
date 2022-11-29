package com.example.demo.ifaces;
import java.util.*;

public interface CrudRepository<T> {
	
  public int add(T t);
  public List<T> findAll();
  public T findById(int id);
  public T update(T t);
  public T remove(int id);
  public T update(String branch,double revisedAmount);
}
