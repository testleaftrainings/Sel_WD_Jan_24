Feature: Leaftaps application Login functionality

Background: 
Given Open the chrome browser
And Load the application url

Scenario Outline: Leaftaps application with valid credentials

Given Enter the username as <userName>
And Enter the password as <password>
When Click on Login button
Then Homepage should be displayed
Examples:
|userName|password|
|'Demosalesmanager'|'crmsfa'|
|'Democsr'|'crmsfa'|
|'DemoCSR2'|'crmsfa'|


Scenario: Leaftaps application with Negative credentials
#Given Open the chrome browser    comment ctrl+/
#And Load the application url
Given Enter the username as 'Demosalesmanager123'
And Enter the password as 'crmsfa'
When Click on Login button
But Error messge should be displayed
