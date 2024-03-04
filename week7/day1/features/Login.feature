Feature: Leaftaps application Login functionality

@Smoke
Scenario: Leaftaps application with valid credentials
#Given Open the chrome browser
#And Load the application url
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed


		