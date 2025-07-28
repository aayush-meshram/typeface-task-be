# Bad Jokes API

A simple Spring Boot backend that serves random dad/programmer jokes via a REST API endpoint. Built as a containerized Java application with Maven and Docker.

## Features

- **REST Endpoint:** Provides `/joke`, which returns a random joke as plain text.
- **Joke Variety:** Contains a curated list of dad jokes and programmer jokes.
- **Stateless:** No database or external dependencies required.
- **Dockerized:** Easily deployable using Docker.

## How it Works

- The main application is defined in `BadJokesApplication.java`.
- The core business logic resides in `BadJokesController.java`, which exposes a single endpoint:
  - `GET /joke`: Returns a random joke from a predefined array.
- The jokes include programming puns, dad jokes, and general one-liners.
- The application is containerized using a multi-stage Dockerfile:
  - Stage 1: Uses Maven to build the application.
  - Stage 2: Runs the built JAR in a lightweight JVM container.

## API Usage

### Get a Random Joke

```http
GET /joke
```

**Response:**
- `200 OK` with a plain text joke.

Example:
```
Why did the programmer quit his job? Because he didn't get arrays (a raise).
```

## Local Development

### Prerequisites

- Java 17+
- Maven

### Run Directly

```bash
mvn clean spring-boot:run
```

### Build JAR

```bash
mvn clean package
java -jar target/*.jar
```

### Run with Docker

Build the image:

```bash
docker build -t bad-jokes-api .
```

Run the container:

```bash
docker run -p 8080:8080 bad-jokes-api
```

Access the API at [http://localhost:8080/joke](http://localhost:8080/joke)

## Testing

Basic context loading test is included:

- `BadJokesApplicationTests.java` ensures the Spring Boot context loads correctly.

## File Structure

```
src/
  main/
    java/
      com/typeface/task/
        BadJokesApplication.java
        controller/
          BadJokesController.java
  test/
    java/
      com/typeface/task/
        BadJokesApplicationTests.java
Dockerfile
pom.xml
```

## Extending

- Add more jokes by editing the `dadJokes` array in `BadJokesController.java`.
- Add more endpoints or features as needed.

---

**Made for fun & demonstration purposes.**
