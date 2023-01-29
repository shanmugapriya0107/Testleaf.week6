Feature: Duplicate Lead Testcases

Background:
Given Launch the chrome browser
And Load the application URL as 'http://leaftaps.com/opentaps'
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on login button
And Click on CRMSFA link
And Click on leads

Scenario Outline: Duplicate Lead with positive data
When Click find leads Duplicate lead
And Click on Email
Given Enter Email as <Email>
When Click find leads button for Duplicate lead
Then Capture name of First resulting lead
When Click on the first resulting lead for Duplicate lead
And Click on Duplicate lead
Then Verify the title of the page of Duplicate lead
When Click on create lead of Duplicate lead
Then Confirm the duplicated lead name is same as captured name

Examples:
|Email|
|'shanmugapriya.mickey@gmail.com'|
|'priya.mickey@gmail.com'|