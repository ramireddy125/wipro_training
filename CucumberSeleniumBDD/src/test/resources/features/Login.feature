Feature: Amazon Login
Scenario: Login with valid credentials
Given I open Amazon login page
When I enter UserName and password
When I click on login button
Then I redirected to the HomePage