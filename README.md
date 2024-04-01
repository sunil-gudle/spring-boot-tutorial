Department Management Application

#Basic Spring Boot Concepts

We tried cover the basic concepts of spring boot
 - Controller Layer
 - Service Layer
 - Repository Layer
 - Full CRUD Operations
 - Spring Boot Annotations
 - In-Memory Database(H2 Database)
 - MySQL Database & JPA Dependency
 - Logging
 - Exception Handling
 - Unit Testing (JUnit5, Mockito)
 - Application.yml file configuration
 - Actuator Endpoints

##How To run the application Locally:
 - Un-comment H2 Database configuration and try running the SpringBootTutorialApplication class
 - Or Add your local database credentials and try running tha app

##Mapped URLs:
- GET: http://localhost:8080/hello
- POST: http://localhost:8080/departments

JSON Body:

  {
  "departmentName": "IT",
  "departmentAddress": "Bangalore",
  "departmentCode": "IT-01"
  }

- GET: http://localhost:8080/departments
- GET: http://localhost:8080/departments/1
- GET: http://localhost:8080/departments/name/CS
- PUT: http://localhost:8080/departments/2


JSON Body:
  {
  "departmentName": "CS",
  "departmentAddress": "Delhi"
  }
- DELETE: http://localhost:8080/departments/1
