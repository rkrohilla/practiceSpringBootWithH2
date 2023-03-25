# practiceSpringBootWithH2

How to Run the application on IntelliJ:

  1. Go to Maven and first clean and then install 
  2. Run the java application

NOTE: All the db configs are already mentioned in db file, so you do not have to seperately configure the db.

NOTE: H2 will be used as the database.
DB configs are mentioned in /src/main/resources/application.properties file.

You may access H2 Console by reloading the application http://localhost:8080/h2-console
Enter jdbc:h2:mem:testdb as JDBC URL and then click OK ( No need for enter password ).
