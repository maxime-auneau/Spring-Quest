# Spring Quest

### Getting Started

#### To run this project you need to do multiple tasks:

1. Clone this repository


2. Install Java 17 & Maven


3. Create a database in your local MySQL server

    ```CREATE DATABASE IF NOT EXISTS spring_api;```


4. Create a user in your local MySQL server

    ```CREATE USER 'spring_jpa_quest'@'localhost' IDENTIFIED BY 'spring_jpa_quest';```


5. Grant privileges to the user

    ```GRANT ALL PRIVILEGES ON spring_jpa_quest.* TO 'spring_jpa_quest'@'localhost';```


6. Update the file ```src/main/resources/application.properties``` with your database credentials


7. Run the project with the command ```mvn spring-boot:run```