Feature: Create Individual Testcase

@sanity @regression
Scenario Outline: Create Individual with positive data
When Click Individuals from App launcher
And Click on New Individual
Given Enter last name as <LastName>
When Click on save for Individual
Then Verify Individuals name

Examples:
|LastName|
|'Kumar'|
|'Kiran'|
|'Priya'|