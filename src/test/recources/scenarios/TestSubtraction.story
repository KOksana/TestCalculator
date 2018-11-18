Meta:
@Test

Narrative:
As a User of calculator
I want to perform subtraction (-)
So that I do not need to calculate it by myself

Scenario: Subtraction integer from positive integer
!-- 98-10=88
Given User is on calculator page
When User clicks on  9
And User clicks on  8
And User clicks on  -
And User clicks on  1
And User clicks on 0
And User clicks on =
Then 88 is displayed in result field

Scenario: Subtraction float zero from positive integer
!-- 5-0.0=5
Given User is on calculator page
When User clicks on  5
And User clicks on  -
And User clicks on  0
And User clicks on .
And User clicks on 0
And User clicks on =
Then 5 is displayed in result field

Scenario: Subtraction float from negative integer
!-- -7-0.65=-7.65
Given User is on calculator page
When User clicks on  -
And User clicks on  7
And User clicks on  -
And User clicks on  0
And User clicks on .
And User clicks on 6
And User clicks on 5
And User clicks on =
Then -7.65 is displayed in result field

Scenario: Subtraction float from zero
!-- 0-40.03=-40.03
Given User is on calculator page
When User clicks on  0
And User clicks on  -
And User clicks on  4
And User clicks on 0
And User clicks on .
And User clicks on 0
And User clicks on 3
And User clicks on =
Then -40.03 is displayed in result field

Scenario: Subtraction float and integer from negatine integer
!-- -240-9.1-70=-319.1
Given User is on calculator page
When User clicks on  -
And User clicks on  2
And User clicks on  4
And User clicks on 0
And User clicks on -
And User clicks on 9
And User clicks on .
And User clicks on 1
And User clicks on -
And User clicks on 7
And User clicks on 0
And User clicks on =
Then -319.1 is displayed in result field