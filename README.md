# Spring-Quest

To run this project you need to do multiple tasks:

1. You need to create a database with this command-line in MySQL

   ``CREATE DATABASE IF NOT EXISTS `spring_jpa_quest`;``

2. You need to update the `application.properties` in `src/main/resources`

    ```
     spring.datasource.url=jdbc:mysql://localhost:3306/spring_jpa_quest
     spring.datasource.username=dbusername
     spring.datasource.password=dbpassword
     spring.datasource.tomcat.test-while-idle=true
     spring.datasource.tomcat.validation-query=SELECT 1
     spring.jpa.properties.hibernate.jdbc.time_zone=Europe/Paris
     spring.jpa.show-sql=true
     spring.jpa.hibernate.ddl-auto=update
    ```
3. Start the server it should run without errors
