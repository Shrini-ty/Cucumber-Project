Feature: Register

Scenario: Register by using valid credentials


Given browser is open
And application is displayed
And click on Register Link
And enter valid credentials
And user click on register button
Then user must be sucessfully Register in
And browser closes