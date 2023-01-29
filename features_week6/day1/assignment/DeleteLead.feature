Feature: Delete Lead Testcases

Background:
Given Launch the chrome browser
And Load the application URL as 'http://leaftaps.com/opentaps'
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on login button
And Click on CRMSFA link
And Click on leads

Scenario Outline: Delete Lead with positive data
When Click find leads Delete lead
And Click on Phone
Given Enter Phone number Delete Lead as <PhoneNo>
When Click find leads button Delete lead
Then Capture lead ID for first resulting lead
When Click first resulting lead Delete lead
And Click Delete
And Click find leads button for Delete lead
Given Enter captured lead ID
When Click find leads button for Delete lead final
Then Verify deleted message

Examples:
|PhoneNo|
|8861827296|
|9448324879|
