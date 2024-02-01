# Project MVN TestNG Unit & E2E

This Java project showcases the integration of business code with unit and end-to-end (e2e) tests, using Maven to manage and execute these tests. The core business logic is implemented in a simple Calculator. The project employs TestNG as the test runner and Allure for reporting. It supports separate execution of unit and e2e tests.

## Features

- **Business Logic**: A simplistic Calculator.
- **Unit Tests**: Implemented with listeners.
- **E2E Test**: A single e2e test, excluding UI/API logic.
- **Testing Framework**: Utilizes TestNG.
- **Reporting**: Incorporates Allure for detailed test reports.

## Prerequisites

- Java JDK 17 or higher.
- Maven 3.6.0 or higher.

## Running Tests

You can run unit and e2e tests separately:

- To run only the unit tests, use the appropriate Maven command.
  - mvn clean test site
- For executing only the e2e tests, another specific Maven command is required.
  - mvn clean test-compile failsafe:integration-test site

## Dependencies

This project includes several key dependencies:

- **TestNG**: For organizing and running tests.
- **Allure**: For generating test reports.
- **Lombok**: To reduce boilerplate code in Java.
- **SLF4J and Logback**: For effective logging.
- **Selenium and Rest-Assured**: For implementing e2e tests.

## pom.xml Configuration

The `pom.xml` is fully configured with all necessary dependencies, plugins, and properties to support the project's functionality. Key sections of the `pom.xml` are as follows:

<groupId>org.example</groupId>
<artifactId>project-mvn-testng-unit-e2e</artifactId>
<version>1.0</version>
...

Refer to the project's `pom.xml` file for complete configuration details.

## Test Reporting

Test results are made available through Allure reports, which can be generated post-test execution for a comprehensive analysis.
