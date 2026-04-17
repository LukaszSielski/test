# Interview Task: CRUD API for Order Domain Model

## Objective
Implement a set of RESTful CRUD operations for the `Order` domain model in a Spring Boot application, following the hexagonal architecture. The repository should be a stub (in-memory) implementation, as no database is available. You will also expose and document your API using Swagger.

## Domain Model
The [Order](src/main/java/com/example/hexagonal/domain/model/Order.java) model is defined as:
```java
public record Order(int id, String customerName, String productCategory, double amount, LocalDate orderDate) { }
```
Located at: `src/main/java/com/example/hexagonal/domain/model/Order.java`

## Requirements

### 1. CRUD Endpoints
- Implement REST endpoints for Create, Read (single & all), Update, and Delete operations for `Order`.
- Design endpoints according to REST best practices.

### 2. Repository Stub
- Implement a stub/in-memory repository for `Order` (no database).

### 3. Hexagonal Architecture
- Maintain the existing hexagonal package structure.
- Use ports and adapters appropriately.

### 4. Swagger Documentation
- Annotate your controller and endpoints to generate Swagger/OpenAPI documentation.
- Ensure Swagger UI is accessible and documents all endpoints.

## Deliverables
- Source code for controller, service, repository stub, and any necessary DTOs.
- Swagger UI should display all endpoints with clear documentation.

## Bonus
- Add basic validation to the `Order` input.
- Use meaningful HTTP status codes and error responses.
- Create a Dockerfile (with good practices) that can be used to build and run this application.

## Notes
- No database setup is required or expected.
- Focus on code clarity, structure, and adherence to hexagonal architecture principles.
- You may use Java 21 features.

---
Good luck! If you have any questions, please ask your interviewer.
