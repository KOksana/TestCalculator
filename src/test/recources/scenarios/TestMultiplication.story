Meta:
@Test

Narrative:
As a User of calculator
I want to perform multiplication (×)
So that I do not need to calculate it by myself

Scenario: Multiplication positive integer to positive integer
!-- 7×81=567
Given User is on calculator page
When User clicks on  7
And User clicks on  ×
And User clicks on 8
And User clicks on 1
And User clicks on =
Then 567 is displayed in result field

Scenario: Multiplication negative integer to positive float
!-- -51×0.04=-2.04
Given User is on calculator page
When User clicks on  -
And User clicks on  5
And User clicks on  1
And User clicks on  ×
And User clicks on 0
And User clicks on .
And User clicks on 0
And User clicks on 4
And User clicks on =
Then -2.04 is displayed in result field

Scenario: Multiplication negative float to negative float
!-- -0.98×-1.23=1.2054
Given User is on calculator page
When User clicks on  -
And User clicks on  0
And User clicks on  .
And User clicks on  9
And User clicks on  8
And User clicks on  ×
And User clicks on -
And User clicks on 1
And User clicks on .
And User clicks on 2
And User clicks on 3
And User clicks on =
Then 1.2054 is displayed in result field

Scenario: Multiplication positive integer to negative float to positive float
!-- 10×-9.2×0.5=-46
Given User is on calculator page
When User clicks on  1
And User clicks on  0
And User clicks on  ×
And User clicks on -
And User clicks on 9
And User clicks on .
And User clicks on 2
And User clicks on ×
And User clicks on 0
And User clicks on .
And User clicks on 5
And User clicks on =
Then -46 is displayed in result field