create maven project with archetype jersey-quickstart
once the project is created uncomment "json-binding"dependency is pom.xml file
create a java class to be mapped to a row of a table
add mysqldriver(in google type mysql maven dependency then click on 8.0.30 and copy dependency n paste in pom.xml) as dependency in pom.xml
create a resource folder inside src folder
add properties file application.properties
add database connection details in application.properties
create a connectionFactory class and connect database
create Repository Interface with CRUD method
implement methods of interface
create service class n invoke repository methods,handle exception
create resource class annotate it with @Path ,@GET and such annotations
create table in the Rdbms with columns matching the java class
run application
test it with postman