Feature: OrangeHRM Application Functinality Test
Background: 
Given user should Launch the Edge Browser

@OrangeHRMnavigation
Scenario: Validating OrangeHRM Login Page

When user enters OrangeHRM App URL address
Then user should be validate the login page
Then user should close the OrangeHRM application

@Login
Scenario: Validating OrangeHRM Login Functionality

#Given user should Launch the Edge Browser
When user enters OrangeHRM App URL address
Then user should be validate the login page
When user enter Username and password and click on LoginButton
Then user should navigated to Homepage of OrangeHRM application
Then user should close the OrangeHRM application

@Loginwithmultiletestdata
Scenario Outline: validating OrangeHRM Login functionality with multiple test data
#Given user should Launch the Edge Browser
When user enters OrangeHRM App URL address
Then user should be validate the login page
When user enter "<Username>" and "<Password>" and click on LoginButton
Then user should navigated to Homepage of OrangeHRM application
Then user should close the OrangeHRM application

Examples:

|  Username  |  Password   |
| ALavanya19 | ALavanya@19 |
| ALavanya19 | Aavanya@19  |
| ALavanya19 | AlavanyaZ@19|
