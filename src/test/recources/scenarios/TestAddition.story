Meta:
@Test

Narrative:
As a User of calculator
I want to perform addition (+)
So that I do not need to calculate it by myself

Scenario: Addition integer to positive integer
!-- 1+43=44
Given User is on calculator page
When User clicks on  1
And User clicks on  +
And User clicks on 4
And User clicks on 3
And User clicks on =
Then 44 is displayed in result field

Scenario: Addition zero to positive integer
!-- 13+0=13
Given User is on calculator page
When User clicks on  1
And User clicks on  3
And User clicks on  +
And User clicks on 0
And User clicks on =
Then 13 is displayed in result field

Scenario: Addition float to negative integer
!-- -19+87.6=68.6
Given User is on calculator page
When User clicks on  -
And User clicks on  1
And User clicks on  9
And User clicks on  +
And User clicks on 8
And User clicks on 7
And User clicks on .
And User clicks on 6
And User clicks on =
Then 68.6 is displayed in result field

Scenario: Addition integer to positive float
!-- 28.09+4=32.09
Given User is on calculator page
When User clicks on  2
And User clicks on  8
And User clicks on  .
And User clicks on  0
And User clicks on  9
And User clicks on  +
And User clicks on 4
And User clicks on =
Then 32.09 is displayed in result field

Scenario: Addition float and integer to negative integer
!-- -12+0.5+30=18.5
Given User is on calculator page
When User clicks on  -
And User clicks on  1
And User clicks on  2
And User clicks on  +
And User clicks on  0
And User clicks on  .
And User clicks on 5
And User clicks on +
And User clicks on 3
And User clicks on 0
And User clicks on =
Then 18.5 is displayed in result field