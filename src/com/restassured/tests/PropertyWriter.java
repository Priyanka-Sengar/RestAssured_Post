package com.restassured.tests;

import java.util.*;  
import java.io.*;  
public class PropertyWriter {  
public static void main(String[] args)throws Exception{  
  
Properties p=new Properties();  
p.setProperty("authorization","Bearer 0431655cfe7ba40a791e0ce32d83ad33363348919c11627f409a3228f205e15f");  
p.setProperty("name", "Test Automation1");  
p.setProperty("gender", "Male");  
p.setProperty("email", "testAutomation14@gmail.com");  
p.setProperty("status", "Active");  
  
p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");  
  
}  
} 