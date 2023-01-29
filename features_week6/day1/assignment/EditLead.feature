Feature: Edit Lead Testcases

Background:
Given Launch the chrome browser
And Load the application URL as 'http://leaftaps.com/opentaps'
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on login button
And Click on CRMSFA link
And Click on leads

Scenario Outline: Edit Lead with positive data
When Click find leads
Given Enter the first name to Edit as <FirstName>
When Click find leads button
And Click on the first resulting lead
And Verify the title of the page
And Click on Edit
Given Change the company name as <CompanyName>
When Click on update
Then Confirm the changed name appears

Examples:
|CompanyName|FirstName|
|'Quest Gloabl'|'Shanmugapriya'|
|'Infosys'|'Priya'|