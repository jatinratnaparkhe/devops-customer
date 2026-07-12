# DevOps Customer Management System

A simple Spring Boot REST API developed for practicing modern DevOps tools and CI/CD pipelines.

## Tech Stack

- Java 21
- Spring Boot 3.5
- Spring Data JPA
- PostgreSQL
- Swagger / OpenAPI
- Maven

## Features

- Create Customer
- Get All Customers
- Get Customer By ID
- Delete Customer

## Project Structure

```
Controller
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL
```

## Run Locally

### Clone

```bash
git clone https://github.com/<your-username>/devops-customer.git
```

### Configure Database

Create PostgreSQL database

```sql
CREATE DATABASE customerdb;
```

Update

```
src/main/resources/application.properties
```

```
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD
```

### Run

```bash
./mvnw spring-boot:run
```

Windows

```cmd
mvnw.cmd spring-boot:run
```

---

## Swagger UI

```
http://localhost:8080/swagger-ui/index.html
```

---

## APIs

| Method | Endpoint |
|---------|----------|
| GET | /customers |
| GET | /customers/{id} |
| POST | /customers |
| DELETE | /customers/{id} |

---

## Sample POST Request

```json
{
  "firstName":"Jatin",
  "lastName":"Ratnaparkhe",
  "email":"jatin@example.com",
  "phone":"9876543210",
  "accountNumber":"ACC1001",
  "balance":15000
}
```

---

## Future Improvements

- Docker
- Jenkins Pipeline
- Docker Hub
- Kubernetes
- Terraform
- Ansible