# Cli

Herramienta CASE de tipo CLI que permite generar un proyecto con arquitectura orientada a microservicios sustentado 
en el lenguaje de programación Java y Spring framework en conjunto con el framework de componentes gráficos Vue.js

Project created with [IntelliJ IDEA](https://www.jetbrains.com/idea/) and [Spring Initializr](https://start.spring.io/).

## Dependency Management

###### Maven

**picocli**
```xml
<dependency>
    <groupId>info.picocli</groupId>
    <artifactId>picocli-spring-boot-starter</artifactId>
    <version>4.6.1</version>
</dependency>
```

**Thymeleaf**
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

## Run

Use the maven wrapper [mvnw](https://github.com/takari/maven-wrapper) to compile and run.

```bash
mvnw spring-boot:run
```

```bash
mvnw spring-boot:run -Dspring-boot.run.arguments=""
```