# Digital Library Book Management System

## Project Overview
This project implements a Digital Library Book Management System that enables librarians to efficiently manage their book catalog. Users can add, update, search, and delete book records, with data stored in a MySQL database. The system follows a clean, layered architecture and is built using Spring Boot.

## Technologies Used
- Java 11+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Setup Instructions

### 1. Clone the Repository
Open your terminal and run:
```sh
git clone https://github.com/nikhilsingh2005/digital-library.git
cd digital-library
```
### 2. Create the MySQL Database
Open your MySQL client (such as MySQL Workbench or the command line) and run:
```sh
CREATE DATABASE digitallibrarydb;
```
### 3. Configure the Database Connection
Open the file src/main/resources/application.properties and update it with your MySQL credentials:
```sh
spring.datasource.url=jdbc:mysql://localhost:3306/digitallibrarydb?useSSL=false&serverTimezone=UTC
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```
## Build & Run Instructions
### 1. Build the Project
From the root of your project, run:
```sh
mvn clean install
```
### 2. Run the Application
Start your Spring Boot application with:
```sh
mvn spring-boot:run
```
Once running, the API endpoints will be accessible at:
```sh
http://localhost:8080/api/books
```
## API Documentation
### Add a Book
- Endpoint: POST /api/books
- Description: Adds a new book record.
- Request Body Example:
```sh
{
  "bookId": "B001",
  "title": "The Great Gatsby",
  "author": "F. Scott Fitzgerald",
  "genre": "Classic",
  "availabilityStatus": "AVAILABLE"
}
```
### View All Books
- Endpoint: GET /api/books
- Description: Retrieves a list of all books.

### Get Book by ID
- Endpoint: GET /api/books/{bookId}
- Description: Retrieves details for a specific book by its ID.

### Search Books by Title
- Endpoint: GET /api/books/search?title={title}
- Description: Searches for books with titles containing the specified text.

### Update Book Details
- Endpoint: PUT /api/books/{bookId}
- Description: Updates the details of an existing book.
- Request Body Example:

```sh
{
  "bookId": "B001",
  "title": "The Great Gatsby (Updated)",
  "author": "F. Scott Fitzgerald",
  "genre": "Classic",
  "availabilityStatus": "CHECKED_OUT"
}
```
### Delete a Book Record
- Endpoint: DELETE /api/books/{bookId}
- Description: Deletes a book from the catalog.

### Shutdown the Application
- Endpoint: POST /actuator/shutdown
- Description: Gracefully shuts down the application.
Configuration:
- Ensure that the following properties are set in your application.properties file:

```sh
management.endpoint.shutdown.enabled=true
management.endpoints.web.exposure.include=shutdown
```
Usage:
- Send a POST request to:
```sh
http://localhost:8080/actuator/shutdown
```
to gracefully exit the application.

## Testing
### Unit Tests:
Run your tests with:
```sh
mvn test
```
- Unit tests are implemented using JUnit and Mockito to validate core functionalities.

### API Testing:
- Use Postman to test the endpoints by sending HTTP requests with the provided examples.

## Future Improvements & Reflections
### Challenges Faced:

- Configuring MySQL connection and ensuring proper database creation.

- Implementing a clean layered architecture and robust exception handling.

- Validating input data and handling error responses gracefully.

### Potential Improvements:

- Integrate Spring Security for authentication and authorization.

- Enhance error handling with more detailed error codes and messages.

- Implement additional unit and integration tests for improved reliability.

- Consider building a front-end UI for a complete end-to-end solution.

- Optimize performance for large datasets.

## 
### Author: Nikhil Singh
### GitHub: nikhilsingh2005
