Feature: Create Lead Testcases

Background:
Given Launch the chrome browser
And Load the application URL as 'http://leaftaps.com/opentaps'
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on login button
And Click on CRMSFA link
And Click on leads


Scenario Outline: Create Lead with positive data
And Click on create lead
Given Enter the company name as <CompanyName>
And Enter the first name as <FirstName>
And Enter the last name as <LastName>
And Enter the mobile number as <MobileNo>
And Enter the Email as <Email>
When Click on create button
Then The lead should be created

Examples:
|CompanyName|FirstName|LastName|MobileNo|Email|
|'Testleaf'|'Shanmugapriya'|'Jayasekaran'|8861827296|'shanmugapriya.mickey@gmail.com'|
|'NTT Data'|'Priya'|'J'|9448324879|'priya.mickey@gmail.com'|