# About project

This is just a simple login project that makes use of JUnit5, Cucumber, SelenIDE and TestContainers to run UI automated tests.

__NOTE:__ With spring boot you can simply write an integration test without the need of a container, but sometimes you do not have access to the production source code but just a container of a given application, and that is why this demo was created.

## Build Docker image

`docker build -tag simple-authentication-demo --rm=true .`

## Run Cucumber tests

`./gradlew clean test` 





