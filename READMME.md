Project Description:

This project is a sample automation framework for testing the Bleu CRM application. It utilizes Selenium WebDriver for browser automation, TestNG for test execution, and Cucumber for BDD-style test scenarios.
Structure:

    src/main/java: Contains the implementation code, including page objects, driver management, and utility classes.
    src/test/java: Includes test scenarios written in Cucumber's Gherkin syntax, along with step definitions for their execution.
    src/test/resources: Holds feature files containing test scenarios in Gherkin format and TestNG XML configuration files.
    pom.xml: Maven project configuration file containing dependencies and build settings.

How to Use:

    Clone the repository to your local machine.
    Ensure you have JDK, Maven, and compatible WebDriver binaries (ChromeDriver, GeckoDriver) installed.
    Configure the necessary parameters in the codebase, such as URLs, credentials, etc.
    Run tests using Maven commands or IDE test runners.
    View test reports generated in the target directory.

Dependencies:

    Selenium WebDriver
    TestNG
    Cucumber
    Apache Commons Lang

Running Tests:

    Execute mvn clean test command to run tests.
    Test reports will be generated in the target directory.

Contribution Guidelines:

    Fork the repository.
    Create a new branch for your feature/bug fix.
    Make necessary changes and commit them.
    Create a pull request with a detailed description of changes.

License:

This project is licensed under MIT License.

Feel free to contribute, raise issues, or provide feedback. Happy testing!