# maven-multimodule-assignment

Project Title: Create a multi-module Maven project with the following structure:

my-project
├── parent-pom.xml
├── webapp
│   ├── pom.xml
│   ├── src/main/java/com/example/myproject/webapp/WebApp.java
│   └── src/main/resources/application.properties
└── service
    ├── pom.xml
    └── src/main/java/com/example/myproject/service/Service.java



Description:

The parent-pom.xml file should define the following:
The project groupId should be com.example.myproject.
The project artifactId should be my-project.
The project version should be 1.0.0.
The modules tag should list the webapp and service sub-modules.
The dependencyManagement tag should manage the following dependencies:
org.springframework.boot:spring-boot-starter-web:2.6.3
junit:junit:4.13.2 with scope test

#The webapp/pom.xml file should define the following:

The project groupId should be com.example.myproject.
The project artifactId should be webapp.
The project version should be 1.0.0.
The project should have a packaging of war.
The dependencyManagement tag should inherit from the parent dependencyManagement tag.
The project should have a dependency on org.springframework.boot:spring-boot-starter-web.
The project should have a dependency on junit:junit with scope test.
The build tag should define a plugins tag with the org.springframework.boot:spring-boot-maven-plugin plugin.
The webapp/src/main/java/com/example/myproject/webapp/WebApp.java file should define a basic Spring Boot web application with a single endpoint that returns "Hello, world!".
The webapp/src/main/resources/application.properties file should define the following:
server.port=8080

#The service/pom.xml file should define the following:

The project groupId should be com.example.myproject.
The project artifactId should be service.
The project version should be 1.0.0.
The project should have a packaging of jar.
The dependencyManagement tag should inherit from the parent dependencyManagement tag.
The project should have a dependency on junit:junit with scope test.

The service/src/main/java/com/example/myproject/service/Service.java file should define a simple Java class with a method that returns a string.
Bonus: Add an integration test to the webapp module that uses the RestTemplate class to make a request to the web application endpoint and assert that the response is "Hello, world!". Use the junit:junit dependency with scope test to write the test.


