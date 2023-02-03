Feature: Create New Dashboard Testcase

@smoke
Scenario Outline: Create New dashboard with positive data
When Click Dashboards from App launcher
And Click on New Dashboard option
Given Enter Name as <Name> for New Dashboard
When Click on create for New Dashboard
And Click on save for New Dashboard
Then Verify Dashboard name for New Dashboard

Examples:
|Name|
|'Salesforce Automation by Shanmugapriya'|
|'Salesforce Automation by Shan'|
|'Salesforce Automation by Priya'|
