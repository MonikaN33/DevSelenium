Feature: AUT MercuryTours Login

Scenario: Login Positive
Given Launch Browser
And maximise browser
And load url
And set timeout
When user enter the username
And user enter the password
And user click on signIn button
Then login should be successful