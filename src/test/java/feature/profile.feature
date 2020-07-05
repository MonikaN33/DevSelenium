Feature: AUT Mercury Tours Profile

Scenario: Set Profile

Given Launch Browser2
And maximise browser2
And load url2
And set timeout2
When user enter the username2
And user enter the password2
And user click on signIn button2
Then user should be able to click profile option
And user should be able to give first name
And user should be able to give last name
And user should be able to give phone number
And user should be able to click signoff