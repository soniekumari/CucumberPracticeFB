Feature: Login Page Feature

Scenario: Login page title
Given User is on login page
When User gets the title of the page
Then Page title should be "Facebook – log in or sign up"

Scenario: Forgot Password Link
Given User is on login page
Then Forgot password link should be displayed

Scenario: Login with correct credentials
Given User is on login page
When User enters Username "enterPassword@gmail.com"
And User enters Password "enterPassword"
And User click on login button
Then User gets the title of the page
And Page title should be "Facebook"
