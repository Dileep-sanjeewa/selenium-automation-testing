# Selenium Pixels Suite Test

## Overview
This project runs Selenium UI checks against https://www.pixelssuite.com/ using TestNG and WebDriverManager.

## Tech Stack
- Java 11
- Maven
- Selenium 4.18.1
- TestNG 7.7.1
- WebDriverManager 5.7.0

## Project Structure
- src/test/java/com/sqa/PixelsSuiteTest.java: TestNG test suite
- pom.xml: Maven configuration
- target/surefire-reports/: TestNG and Surefire reports (after running tests)

## Prerequisites
- JDK 11 installed
- Maven installed
- Google Chrome installed (WebDriverManager downloads matching driver)

## Run Tests (CMD)
1. Open a new CMD window.
2. Go to the project folder:
   cd /d "C:\Users\DELL\Desktop\sqa_assignment\Automation_Selenium\Automation_Selenium\Testing"
3. Set Java for this session:
   set "JAVA_HOME=C:\Program Files\Java\jdk-11"
   set "PATH=%JAVA_HOME%\bin;%PATH%"
4. Run all tests:
   mvn -U test

## Run a Single Test Class
mvn -U -Dtest=PixelsSuiteTest test

## Reports
After running tests, open the HTML report:
- target/surefire-reports/index.html

## Notes
- Some tests are simple presence checks and may depend on the live site content.
- If Chrome updates and Selenium logs a CDP warning, it is usually non-fatal.
