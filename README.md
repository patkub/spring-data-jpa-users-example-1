# users

[![Build](https://github.com/patkub/spring-data-jpa-users-example-1/actions/workflows/build.yml/badge.svg)](https://github.com/patkub/spring-data-jpa-users-example-1/actions/workflows/build.yml)

Spring Data JPA example

- Spring Data JPA
- Basic HTTP Auth using Spring Security
- WebMvcTest unit tests

### Usage

Java 21

See [test.http](./test.http) file for example requests.

### Commands

- `./gradlew build` - build application
- `./gradlew bootRun` - run application
- `./gradlew test` - run unit tests
- `./gradlew spotlessCheck` - run spotless formatting checks without changing files
- `./gradlew spotlessApply` - use spotless to fix up code in-place

### Run as JAR Application

Path to JAR: `.../users/build/libs/users-0.0.1-SNAPSHOT.jar`

VM Options:
```
-Dspring.config.location=src/main/resources/application.properties
```

Working directory: `.../users`
