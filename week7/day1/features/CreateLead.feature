Feature: Leaftaps application CreateLead functionality

@functional @smoke
Scenario: Create a new lead with mandatory field
#Given Open the chrome browser
#And Load the application url
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on crmsfa hyperlink
Then MyHome page should be displayed
When Click on Leads tap
Then MyLeads page should be displayed
When Click on CreateLead tap
Then CreateLead page should be displayed
Given Enter the company name as testleaf
And Enter the first name as Aravind
And Enter the last name R
When Click on Create Lead button
Then ViewLead page should be displayed
