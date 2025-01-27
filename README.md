Automated Testing: Booking.com and Sinsay App

This project documents the automated testing process performed for two popular applications: Booking.com and Sinsay App, using Java alongside dedicated testing frameworks and tools. The objective was to validate the core functionalities of the applications and automate critical scenarios.

🛠️ Technologies and Tools Used

Java – Programming language for implementing tests.
Selenium WebDriver – For testing web functionalities.
Appium – For automating mobile app tests (Sinsay App).
JUnit/TestNG – Frameworks for writing and executing tests.
Maven – For dependency management and project builds.
Allure Reports – For generating detailed visual test reports.
Git – For version control of the source code.

📋 Testing Goals

Booking.com:

Validation of essential functionalities:
Searching for destinations and filtering results.
Selecting and booking a hotel.
Verifying the checkout page.
UI interactions and cross-browser compatibility testing.

Sinsay App:

Testing primary workflows:
Navigating through product categories.
Adding products to the cart.
Completing orders and verifying payments.
Identifying performance and compatibility issues on various mobile devices.

🚀 Testing Process

Requirements Analysis:
Reviewed key functionalities and use case scenarios for the applications.

Setting Up the Testing Environment:

Configured Selenium for Booking.com web tests.
Configured Appium for running tests on Android/iOS devices for Sinsay App.
Established a modular and reusable testing framework.
Writing Test Cases:

Defined functional test scenarios and End-to-End (E2E) tests.
Implemented tests using the Page Object Model (POM) for better structure and maintainability.
Executing Tests:

Tests were run locally and in the cloud using platforms like BrowserStack for cross-platform compatibility.
Generating Reports:

Results were consolidated into reports generated with Allure, including screenshots of failures and detailed scenario logs.

📊 Results and Observations
Booking.com:

All essential functionalities were successfully validated.
Minor issues were identified in the filtering module and reported to the team.
Sinsay App:

Navigation and adding products to the cart worked as expected.
Performance issues were observed on older devices, requiring optimization.


📂 Project Structure


plaintext
Copiază
Editează
|-- src/
|   |-- main/
|   |   |-- java/  # Source code for the testing framework
|   |-- test/
|       |-- java/  # Implemented test cases
|-- pom.xml         # Maven file for dependency management
|-- README.md       # Project documentation


💡 Conclusion

This project highlights the importance of automated testing in quickly identifying critical issues. Using tools like Selenium and Appium enabled efficient validation of the applications across multiple platforms. Future plans include adding more complex test cases and integrating CI/CD for automated test execution.

