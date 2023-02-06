Feature:Login
Scenario:
enarious:Login by using valid credentials

Given browser is open
And application is displayed
When user click on login link
And user enters valid credential
And user click on login button
Then user must be sucessfully logged in
And browser closes
