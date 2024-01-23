# Traditional Todo Application

This is a simple todo application built using Java and Spring Boot. The application allows users to create, edit, and delete todo items. It uses Thymeleaf for templating and H2 database for data storage.

## Project Structure ( Visit "./site/index.html" to view MAVEN generated documentation )

The project is structured as follows:

- **src/main/java/com/spbt/traditonaltodoapp/controllers**: Contains controllers for handling HTTP requests.
  - `HomeController.java`: Controller for the home page.
  - `TodoFormController.java`: Controller for handling todo item creation, deletion, and updates.

- **src/main/java/com/spbt/traditonaltodoapp/models**: Contains the data model.
  - `TodoItem.java`: Entity class representing a todo item.

- **src/main/java/com/spbt/traditonaltodoapp/repositories**: Contains the repository interface.
  - `TodoItemRepository.java`: Spring Data JPA repository for TodoItem entities.

- **src/main/java/com/spbt/traditonaltodoapp/services**: Contains the service class.
  - `TodoItemService.java`: Service class for performing business logic related to todo items.

- **src/main/java/com/spbt/traditonaltodoapp/TraditonalTodoAppApplication.java**: Main application class with the `main` method.

- **src/main/resources**: Contains application properties and templates.
  - `application.properties`: Configuration properties for the application.
  - **templates**: Thymeleaf templates for rendering HTML pages.
    - `edit-todo-item.html`: Template for editing a todo item.
    - `index.html`: Template for the home page displaying a list of todo items.
    - `new-todo-item.html`: Template for creating a new todo item.

- **src/test/java/com/spbt/traditonaltodoapp**: Contains test classes.
  - `TraditonalTodoAppApplicationTests.java`: Test class for testing the application.

- **target**: Output directory containing compiled classes, JAR files, and generated resources.

- **data**: Directory for storing the H2 database files.

- **Dockerfile**: Dockerfile for creating a Docker image of the application.

## Building and Running the Application

To build and run the application, follow these steps:

1. Build the project: `./mvnw clean install`
2. Run the application: `./mvnw spring-boot:run`
3. Access the application at [http://localhost:8080](http://localhost:8080)

## Docker Support

The project includes a Dockerfile that allows you to build a Docker image of the application. To build the Docker image, use the following commands:

```bash
docker build -t traditonal-todo-app .
```

To run the Docker container:

```bash
docker run -p 8080:8080 traditonal-todo-app
```

Access the application at [http://localhost:8080](http://localhost:8080)

## Additional Information

- The project uses H2 database for simplicity. You can customize the database configuration in `application.properties`.

- Thymeleaf is used for templating, and Bootstrap is included for styling.

Feel free to explore the code and modify it according to your requirements. If you have any questions or issues, please don't hesitate to open an [issue](https://github.com/yourusername/traditonal-todo-app/issues).
