Feature: Home page

Scenario: Count the Gender
Given User is on Login page
And User click on Create New Account button
Then User is on Registration form "Sign Up"
Then User gets count of gender
|Female|
|Male|
|Custom|
And User gender option should be 3