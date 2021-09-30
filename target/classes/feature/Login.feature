Feature: Verify Login Functionality
Background:
Given Open the browser
And Load the Application as 'http://leaftaps.com/opentaps/control/main'

Scenario Outline: Login with Correct Credentials
Given Enter the Username as <username> in the field
And Enter the Password as <password>
When Click on Submit
Then Home Page is displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@negative
Scenario: login with incorrect credentials
Given Enter username as 'DemoCSR'
And Enter password as 'crmsfa123'
When Click on Login button
But Error message should be displayed