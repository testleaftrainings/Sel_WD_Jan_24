Feature: Leaftaps application Login functionality
Scenario: Leaftaps application with valid credentials
Given Open the chrome   browser
And Load the application url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed


		