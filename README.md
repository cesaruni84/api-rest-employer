# Spring Boot Employer API

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Raouf25_Spring-boot-employer-management-API&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Raouf25_Spring-boot-employer-management-API)

This is a Spring Boot application that provides a RESTful API for managing employers. It uses Java, H2 SQL, Spring Boot, and Maven.

## Features

- CRUD operations for employers
- Exception handling for null entities and mismatched IDs
- Unit tests for service methods
- Integration with GitActions for CI/CD 
- Deployment to Azure Web Apps.

### Prerequisites

- Java 11.
- Maven.
- Docker (for containerization)
- Account of GitHub.
- Account of Azure. 


## Getting Started
Run in local
http://localhost:8443/api/employers





### Compile

To compile the application, run:

```bash
mvn compile
```

### Testing
To run the unit tests, execute:

```bash
mvn test
```

### Building
To package the application, run:

```bash
mvn -B package --file pom.xml -Dmaven.test.skip=true
```

### Deployment
The application is set up for deployment to Azure Web Apps. See the GitHub Actions workflow in .github/workflows/ci_cd_employer-api-rest.yml for details.

### Docker
To build a Docker image of the application, run:

```bash
docker build -t api-rest-employer .
```

To create a Docker container from the image, run:
```bash
docker run -it -p 8443:8443 --name container-api-rest-employer api-rest-employer
```


### Contributing
Please read `CONTRIBUTING.md` for details on our code of conduct, and the process for submitting pull requests to us.  

### License
This project is licensed under the terms of the MIT license. See the LICENSE file for details.