# Hibernate
JAVA FULL STACK- Hibernate
18 July 2024
06:08 PM

Hibernate

List of topics:

	1. Introduction
	2. Why hibernate
	3. Advantages of hibernate
	4. Architecture 
	5. POJO class 
	6. Mapping file(XML)
	7. Configuration file(XML) 
	8. Hibernate examples(CRUD operations)
	9. Hibernate query language(HQL) 
	10.  Hibernate criteria query language 11. Inheritance mapping 

Introduction:

	• Hibernate is a java framework developed by Gavin King
	• It is a framework which simplifies the development of java application to interact with database 
	• it is an open source, light weight and works based on ORM tool 
	• ORM tool:
		a. Object relational mapping
		b. ORM is a technique for converting the data b/w java object.
		c. ORM implements responsibility of mapping the java object to relational object
		d.  java application -> ORM(Hibernate) -> Database  
		e. Some of the popular ORM tools are Hibernate,iBatis,MBatis,TopLink,etc..

Why Hibernate ?:

	• Simplifies database interactions 
	• Cross database portability(Hibernate interacts with any database)

Advantages of Hibernate:

	• Open source and light weight 
	• Fast performance 
	• Database independent
	• Automatic database table creations 
	• Exception handling 

Architecture:

Hibernate consists of three layer:
	• Application layer (java application) 
	• Hibernate ( mapping file , config file) 
	• Database (Mysql,oracle) 



Hibernate arch consists of predefined objects :
	• SessionFactory 
	• ConfigurationFactory 
	• TransactionFactory 

POJO Class: 

	• POJO stands for plain old java object 
	• POJO is java bean 
	• Hibernate allows only POJO class 
	• POJO class consists of setter and getter

	Example:
		Class Employee  {
			private Int eid;
			private String ename;
			
			-> 1 Setter and 1 Getter method for eid;
			-> 1 setter and 1 getter method for ename;
			
			getEid() {
			}
			setEid(){
			}
			getEname() {
}
			setEname(){
			}
		}
		
		
Configuration File:

	• The purpose of configuration file is to define the property of a database.
	• Configuration file can be defined in two ways.
		○ Either in XML or Annotations (XML)
	• The Configuration file has to be denoted by : hibernate.cfg.xml (save) 
	• Configuration file is loaded in the Hibernate application during the runtime of an application.
	• The configuration file must contain the following information:
		○ Connection Properties
		○ Hibernate properties
		○ Mapping file resources

Note:  Number of configuration files = No of databases that we are working with

Syntax:
	Hibernate.cfg.xml :
	<hibernate-configuration>
	        <session-factory>
	        
	                <!Connection Properties>
	                        <property name="connection.driver_class">
	                                Load Drivers
	                        </property>
	                        <property name="connection.url">
	                                Connection  URL Establishment
	                        </property>
	                        <property name="connection.username">
	                                UserName
	                        </property>
	                        <property name="connection.password">
	                                Password
	                        </property>
	        
	                <!hibernate properties>
	                        <property name="show_sql">
	                                true/false (either can be true or false)
	                        </property>
	                        <property name="dailect">
	                                Database Name
	                        </property>
	                        <property name="hbm2ddl2.auto" >
	                                create  (creates table automatically)
	                        </property>
	                        
	                <! Mapping files>
	                        <mapping resource="file(mapping)">
	                        <mapping resource="file(mapping)">
	                        <mapping resource="file(mapping)">

	        
</session-factory>
	</hibernate-configuration>
	
	Example: (Oracle):
	 
		Oracle:	<hibernate-configuration>
			        <session-factory>
			        
			                <!Connection Properties>
			                        <property name="connection.driver_class">Oracle.jdbs.driver.OracleDriver</property>
			                        <property name="connection.url">jdbc:oracle:thin:@localhost:1521:xe</property>
			                        <property name="connection.username">system</property>
			                        <property name="connection.password">admin</property>
			        
			                <!hibernate properties>
			                        <property name="show_sql">true</property>
			                        <property name="dailect">oracle</property>
			                        <property name="hbm2ddl2.auto" >create</property>
			        
			        <! Mapping files>
			                <mapping resource="employee1.hbm.xml"/>
			                <mapping resource="employee2.hbm.xml"/>
			                <mapping resource="employee3.hbm.xml"/>
			                
			                </session-factory>
			</hibernate-configuration>
		
	Example : (MySql):
	
		MySql	<hibernate-configuration>
			        <session-factory>
			        
			                <!Connection Properties>
			                        <property name="connection.driver_class"> com.mysql.cf.Driver</property>
			                        <property name="connection.url">jdbc:mysql://localhost:3306/klu</property>
			                        <property name="connection.username">root</property>
			                        <property name="connection.password">admin</property>
			        
			                <!hibernate properties>
			                        <property name="show_sql">true</property>
			                        <property name="dailect">mysql</property>
			                        <property name="hbm2ddl2.auto" >create</property>
			        
			        <! Mapping files>
			                <mapping resource="employee1.hbm.xml"/>
			                <mapping resource="employee2.hbm.xml"/>
			                <mapping resource="employee3.hbm.xml"/>
			                
			                </session-factory>
			</hibernate-configuration>
	

Mapping File:

	• It is a part of Hibernate application
	• Mapping file is denoted as and can be implemented : XML or Annotations ( XML is preferred)
	• Every ORM needs a Mapping file
	• It is a mechanism of placing the object properties  ( java object)  to the specific column of the table
	• This mapping file contains :
		○ How a mapping can be done a POJO class to DB name and from Class properties to Column names.
			§ POJO Class 	->	Table Name
			 Prop1	->	Column1
			Prop2	->	Column2
	• While creating the mapping file we can create one or multiple number of mapping files based on Application requirements 

Note:    
	Java object	-> 	table

	
	Every object will have the following properties:
		a. Identity (Object name)
		b. State (Object Value)
		c. Behaviour (Object Method)
	
Syntax:
	Filename.hbm.xml	<hibernate-mapping>	
		        <class name=" POJO Class Name " table="Table name in DB "/>
		                <id name="class-property" column="column name in table"/ >
		                <property name="class-propery" column="column name in table" />
		                |
		                |
		        </class>
		</hibernate-mapping>
		Table is created by user	
	
Example:
	Employee.hbm.xml	<hibernate-mapping>	
		        <class name=" Employee " table="emp "/>
		                <id name="eid" column="tid"/ >
		                <property name="ename" column="tname" />
		        </class>
		</hibernate-mapping>
		        
		Table is created by user with  table name as emp and col name as tid and tname	
	
	Note:  Significance of Hibernate (Table must be created automatically)
	
	Syntax	<hibernate-mapping>
		        <class name=" POJO class name" />
		                <id name="class-property" />
		                <property name="class-property" />
		        </class>
		</hibernate-mapping>
	
	Example	Employee.hbm.xml
		<hibernate-mapping>
		        <class name=" Employee" />
		                <id name="eid" />
		                <property name="ename" />
		        </class>
		</hibernate-mapping>
	
	Table will be created by Hibernate framework with table name as "Employee" and column name "eid and ename".
	
	
Hibernate Example : (Curd Operations):

	• Every Hibernate application MUST have the following 4 files :
		○ POJO Class (.java)
		○ Configuration file (hibernate.cfg.xml)
		○ Mapping File (filename.hbm.hml)
		○ Logic file (.java file) (main method) (execute)
	
	• Skeleton of Hibernate of Application
		○ Step-1:   Create a Maven Project 
			§ Archetypes:   maven-archetype-quickstart
		○ Step-2: pom.xml
			§ Update compiler version from 1.7 to 1.8
			§ Dependencies 
				□ Hibernate Core
				□ Hibernate Entity Manager
				□ Mysql 
				□ Oracle
		○ Step-3:  Update maven project 
		○ Step-4:   Create a new folder naming as 'resources' (config and mapping files are defined here)
			§ Src->main->right click-> new-> folder -> (resources) 
		○ Step-5:  Implement Hibernate Concepts
			§ POJO Class (src/main/java)  ->filename.java
			§ Configuration file (src/main/resources)  -> hibernate.cfg.xml
			§ Mapping File (src/main/resources)  ->filename.hbm.xml
			§ Logic file (src//main/java)     ->filename.java
		○ Step-6:  Run Logic File 
			§ Right click 
				□ Run as 
					® Java application
![image](https://github.com/user-attachments/assets/1ef35841-ad3c-4c06-9c36-2e2c916db041)
