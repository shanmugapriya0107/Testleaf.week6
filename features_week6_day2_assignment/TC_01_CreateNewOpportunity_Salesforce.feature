Feature: Create New Opportunity Testcase

@functional @regression
Scenario Outline: Create a new opportunity with positive data
When Click Sales from App launcher
And Click on Opportunities tab
And Click on New button
Given Enter Opportunity name as <Opportunity Name>
And Choose Close Date as <Close Date>
And Select Stage 
And Select Need Analysis in Stage
When Click on save
Then Verify Opportunity name

Examples:
|Opportunity Name|Close Date|
|'Salesforce Application by Shanmugapriya'|1/31/2023|
|'Salesforce Application by Priya'|2/1/2023|
|'Salesforce Application by Shan'|2/2/2023|


