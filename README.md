# Cucumber BDD Framework with Rest Assured and Java

This repository demonstrates the setup and usage of Cucumber BDD framework with Rest Assured for API testing in a Java project.

## Prerequisites

- Java JDK installed (version 8 or higher)
- Apache Maven installed
- Integrated Development Environment (IDE) like IntelliJ or Eclipse

## Getting Started

1. Clone the repository to your local machine:

    ```bash
    git clone https://github.com/Vinitamalik/Practice_QA_Cucumber_BDD.git
    ```

2. Open the project in your preferred IDE.

3. Ensure Maven dependencies are downloaded. You can do this by running the following command in the project directory:

    ```bash
    mvn clean install
    ```

## Project Structure
|-- src
| |-- main
| | |-- java
| | |-- Common
| | |-- | API.java
| | |-- | ApiHelper.java
| | |--PageFactory.Implementation_Class.java
| | |-- Test_Data_Models.TestData.enum
| |-- test
| |-- java
| |-- StepDefinition.stepdefinition.java
| |-- TestRunner.TestRunner.java
| |-- resources
| |-- feature
| |-- Test_1.feature
| |-- Test_2.feature
| |-- Test_3.feature
| |-- Test_4.feature
|-- pom.xml
|-- README.md

- `src/main/java/common/API and src/main/java/common/ApiHelper`: Contains the utilities related to the API client implementation using Rest Assured.
- `src/main/java/PageFactory.Impementation_Class`: Contains the Implementations for all features files to Java code.
- `src/main/java/Test_Data_Modules/TestData.enum`: Contains the Test Data for all scenarios.
- `src/test/java/StepDefinition/stepDefinition.java`: Contains step definition files that map Gherkin steps to Java code.
- `src/test/java/TestRunner/TestRunner`: Contains the Runner file using Junit to execute all scenarios.
- `src/test/resources/feature`: Contains all the feature files in Gherkin.

## Running Tests

To run the tests, use the following Maven command:

```bash
mvn clean test

Reporting
Cucumber generates HTML reports after each test run. You can find the reports in the target/cucumber-reports directory.