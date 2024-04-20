# Jakarta Persistence API (JPA) example application: Northwind sample database
[https://github.com/saladlam/jpa-northwind](https://github.com/saladlam/jpa-northwind)

## Introduction
Northwind database is a sample database that is used in the tutorial of Microsoft's database product. Provided database mapping on entity classes and simple repository base on Spring Data JPA. So that may base on it to practice to access the database by JPA feature such as JPQL and Criteria API.

Database schema and data is from [here](https://github.com/harryho/db-samples/blob/master/mysql/northwind.sql). Typo of field name of table is kept and corrected on the field name of entity class. Table field type and Java data type mapping is based on [this](https://zontroy.com/mysql-to-java-type-mapping).

## Main component used
- Spring Boot 2.7.X
- Spring Framework 5.3.X
- Spring Data JPA 2.7.X
- Liquibase 4.9.X
- MySQL Connector/J 8.0.X

## Modules in this project
- entities: Entity classes
- repositories: Spring Data JPA repositories for accessing databases
- sample-app: Command line application of running some query

## Database
Recommend to use MySQL 8.0 database. Schema and data will be imported when application starts, data will be kept after application shutdown, so please prepare an empty database for the first time of application starting. Application using following parameter to connect the database.

```
host: localhost
port: 3306
username: root
password: root
database: northwind
```

## Prerequisite
- Java SE Development Kit 8 or above
- MySQL 8.0 database
- Internet connection

## Compile and run
Apache Maven wrapper is included, no addition package manager is necessary.

### Compile (On Microsoft Windows)
```
mvnw package
```

### Run (On Microsoft Windows)
```
java -jar sample-app\target\jpa-northwind-sample-app-0.1.jar
```
