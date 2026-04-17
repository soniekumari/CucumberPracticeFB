# Cucumber BDD Automation Framework (Facebook Practice)

## Project Overview
This project is a Behavior Driven Development (BDD) Test Automation Framework built using Java, Selenium WebDriver, Cucumber, JUnit, and Maven.

The framework automates test scenarios for a sample web application (Facebook-like login and registration functionality) using the Page Object Model (POM) design pattern.

---

## Tech Stack
- Java
- Selenium WebDriver
- Cucumber (BDD)
- JUnit
- Maven

---

##  Framework Structure


### src/main/java
├── com.pages → Page Object classes

├── com.qa.factory → DriverFactory (WebDriver initialization)

├── com.qa.util → Utility classes (ConfigReader, Constants, ElementUtil)

### src/test/java
├── stepdefinitions → Step Definitions

├── appHooks → Hooks (Before/After)

├── mytestrunner → Test Runner

### src/test/resources
├── com.features → Feature files (BDD scenarios)

├── config → config.properties


---

##  Key Features
- BDD framework using Cucumber
- Page Object Model (POM) design pattern
- Cross-browser support (Chrome, Firefox, Edge, Safari)
- Thread-safe WebDriver using ThreadLocal
- Screenshot capture on test failure
- Maven-based project

---

##  Configuration

Update configuration from:

src/test/resources/config/config.properties


Example:

browser=chrome
url=https://www.facebook.com/


---

##  How to Run Tests

### Using Maven

mvn clean test


### Using Test Runner
Run `MyTestRunner.java` as JUnit Test.

---

##  Key Components

### DriverFactory
- Initializes WebDriver for different browsers
- Uses ThreadLocal for parallel execution support

### Page Objects
- Contains locators and reusable methods
- Ensures separation of UI and test logic

### Step Definitions
- Maps Gherkin steps to Java methods

### Hooks
- Setup and teardown using @Before and @After
- Takes screenshot on failure

### Feature Files
- Written in Gherkin format (Given, When, Then)

---

##  Future Enhancements
- Add Extent or Allure Reports
- Integrate Log4j logging
- Implement Data-Driven Testing (Excel/JSON)
- Enable Parallel Execution
- Integrate with Jenkins (CI/CD)
