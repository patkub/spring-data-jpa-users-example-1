# users

Spring Data JPA example

### Usage

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
