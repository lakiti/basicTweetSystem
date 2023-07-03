# tweetSystem
Basic Tweeting and Commenting System in Java Spring Boot

# Architecture Overview
The application follows a layered architecture pattern, consisting of the following layers:

Controller Layer: It receives requests from the user interface, performs any necessary validation or transformation, and delegates the business logic to the service layer. It also handles the preparation of data to be sent back.

Service Layer: The service layer contains the business logic of the application. It handles operations related to tweet creation, retrieval, and other tweet-related functionalities. It interacts with the data access layer to persist and retrieve tweet data.

Data Access Layer/ Model: The data access layer is responsible for interacting with the database or any other data source. It consists of entity classes that represent the tweet data structure and repositories or DAOs (Data Access Objects) that handle the interaction with the database.

Database: The application uses a database to persist tweet data. It can be any relational database supported by JPA, such as MySQL, PostgreSQL, or Oracle. The database schema should include a table to store tweet information, including user ID, tweet content, timestamp, etc.

Repository Layer :  It uses the Java Persistence API (JPA) to perform CRUD (Create, Read, Update, Delete) operations on tweet entities/model.

# Technologies Used
The Tweet Application utilizes the following technologies:

Java: The primary programming language used for developing the application.
Java Persistence API (JPA): The standard Java API for object-relational mapping and database operations.
Database: MySQL.
Build Tool: Maven or Gradle for managing dependencies and building the application.
IDE: IntelliJ IDEA.

# Conclusion
The Tweet Application is a Java-based application that follows a layered architecture pattern, utilizing JPA for data persistence and retrieval. It provides functionality for users to post and retrieve tweets.

