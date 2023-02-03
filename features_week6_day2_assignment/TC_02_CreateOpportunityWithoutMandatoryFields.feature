Feature: Create New Opportunity without Mandatory fields Testcase

@smoke @regression @functional
Scenario Outline: Create a new opportunity with Negative data
When Click Sales from App launcher for Without Mandatory fields
And Click on Opportunity tab for Without Mandatory fields
And Click on New button for Without Mandatory fields
Given Choose Close Date for Without Mandatory fields as <Close Date>
When Click on save for Without Mandatory fields
But Verify the alert message for Without Mandatory fields

Examples:
|Close Date|
|2/1/2023|
|2/2/2023|
|2/3/2023|