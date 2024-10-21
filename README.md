# Daily-Expenses-Sharing-Application
Project Setup
Prerequisites: 1. Java Development Kit (JDK) 8 or later
               2. Spring Boot
               3. Maven or Gradle
               4. A NoSQL database like MongoDB
Steps: 
    1. Clone the repository: git clone <your-repository-url>

Set up the database: 
    1. Create a MongoDB database and collection.
    2. Configure your database connection details in the application.properties file.

Build the project: Use Maven or Gradle to build the project. For example, using Maven: mvn clean package.

Run the application: 
    Start the Spring Boot application: java -jar target/<your-project-name>.jar

Procedure:
1. Access the API endpoints:
           a. Use a REST client like Postman or curl to interact with the API. For example, to create a new user: curl -X POST http://localhost:8080/api/users -H "Content-Type: application/json" -d '{"email": "user@example.com", "name": "John Doe", "mobileNumber": "1234567890"}'

2. Manage expenses:
           a. Use the API endpoints to add expenses, retrieve user expenses, and generate balance sheets.

Configuration
1. Database connection: Configure your MongoDB connection details in the application.properties file.
2. Other settings: Customize other settings as needed (e.g., port number, security configuration).
