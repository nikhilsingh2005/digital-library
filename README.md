# Digital Library Book Management System

## Overview
A Spring Boot-based application that enables librarians to add, update, search, and delete books with MySQL integration.

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/nikhilsingh2005/digital-library.git
   cd digital-library


2. Create the MySQL Database
Open your MySQL client (such as MySQL Workbench or the command line) and run:

CREATE DATABASE digitallibrarydb;

3. Configure the Database Connection
Open the file src/main/resources/application.properties and update it with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/digitallibrarydb?useSSL=false&serverTimezone=UTC
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect


Build & Run Instructions :

1. Build the Project
From the root of your project, run:

mvn clean install
2. Run the Application
Start your Spring Boot application with:

mvn spring-boot:run
Once running, the API endpoints will be accessible at:
http://localhost:8080/api/books

API Documentation :
Endpoints

Add a Book :
Endpoint: POST /api/books

Description: Adds a new book record.

Request Body Example:

{
  "bookId": "B001",
  "title": "The Great Gatsby",
  "author": "F. Scott Fitzgerald",
  "genre": "Classic",
  "availabilityStatus": "AVAILABLE"
}

View All Books :
Endpoint: GET /api/books

Description: Retrieves a list of all books.

Get Book by ID :
Endpoint: GET /api/books/{bookId}

Description: Retrieves details for a specific book by its ID.

Search Books by Title :
Endpoint: GET /api/books/search?title={title}

Description: Searches for books with titles containing the specified text.

Update Book Details :
Endpoint: PUT /api/books/{bookId}

Description: Updates the details of an existing book.

Request Body Example:

{
  "bookId": "B001",
  "title": "The Great Gatsby (Updated)",
  "author": "F. Scott Fitzgerald",
  "genre": "Classic",
  "availabilityStatus": "CHECKED_OUT"
}

Delete a Book Record :
Endpoint: DELETE /api/books/{bookId}

Description: Deletes a book from the catalog.

Future Improvements & Reflections

Challenges Faced:

Configuring MySQL connection and ensuring proper database creation.

Implementing a clean layered architecture and robust exception handling.

Validating input data and handling error responses gracefully.

Potential Improvements:

Integrate Spring Security for authentication and authorization.

Enhance error handling with more detailed error codes and messages.

Implement unit and integration tests for improved reliability.

Consider building a front-end UI for a complete end-to-end solution.

Optimize performance for large datasets.
