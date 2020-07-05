Feature: AUT Mercury Tours Flight Finder

Scenario: Find flights

Given Launch Browser1
And maximise browser1
And load url1
And set timeout1
When user enter the username1
And user enter the password1
And user click on signIn button1
Then user should be on search page
And user should be able to select trip type
And user should be able to select passenger count
And user should be able to select departing from
And user should be able to select departing on month
And user should be able to select departing on day
And user should be able to select arriving in
And user should be able to select returning on month
And user should be able to select returning on day
And user should be able to select service class
And user should be able to select airline
And user should be able to click signoff
