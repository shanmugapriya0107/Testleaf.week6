Feature: Create Accounts Testcase

@regression
Scenario Outline: Create Accounts with positive data
When Click sales from App Launcher for Accounts
And Click on Accounts tab
And Click on New button for Accounts
Given Enter <AccountName> as account name
When Click Ownership
And Select Ownership as Public
And Click on save for Accounts
Then Verify account name

Examples:
|AccountName|
|'Shanmugapriya'|
|'Priya'|
|'Shan'|


