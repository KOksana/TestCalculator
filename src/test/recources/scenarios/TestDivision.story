Meta:
@Test

Narrative:
As a User of calculator
I want to perform division (÷)
So that I do not need to calculate it by myself

Scenario: Divison by zero
!-- 9÷0=Infinity
Given User is on calculator page
When User clicks on  9
And User clicks on  ÷
And User clicks on 0
And User clicks on =
Then Infinity is displayed in result field

Scenario: Divison positive integer by positive integer
!-- 15÷4=3.75
Given User is on calculator page
When User clicks on  1
And User clicks on  5
And User clicks on  ÷
And User clicks on 4
And User clicks on =
Then 3.75 is displayed in result field

Scenario: Divison negative integer by positive float
!-- -2÷0.4=-5
Given User is on calculator page
When User clicks on  -
And User clicks on  2
And User clicks on  ÷
And User clicks on 0
And User clicks on .
And User clicks on 4
And User clicks on =
Then -5 is displayed in result field

Scenario: Divison negative float by positive float
!-- -7.95÷20.3=-0.39162561576
Given User is on calculator page
When User clicks on  -
And User clicks on  7
And User clicks on  .
And User clicks on  9
And User clicks on  5
And User clicks on  ÷
And User clicks on 2
And User clicks on 0
And User clicks on .
And User clicks on 3
And User clicks on =
Then -0.39162561576 is displayed in result field

Scenario: Divison zero by negative float
!-- 0÷-0.6=0
Given User is on calculator page
When User clicks on  0
And User clicks on  ÷
And User clicks on -
And User clicks on 0
And User clicks on .
And User clicks on 6
And User clicks on =
Then 0 is displayed in result field

Scenario: Divison positive integer by negative integer and by positive float
!-- 80÷-16÷3.01=-1.66112956811
Given User is on calculator page
When User clicks on  8
When User clicks on  0
And User clicks on  ÷
And User clicks on -
And User clicks on 1
And User clicks on 6
And User clicks on  ÷
And User clicks on 3
And User clicks on  .
And User clicks on  0
And User clicks on  1
And User clicks on =
Then -1.66112956811 is displayed in result field