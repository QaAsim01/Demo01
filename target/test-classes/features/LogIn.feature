Feature: Appilcation LogIn

@smokeTest
Scenario: LogIn with valid credentials
Given user is on landing page
When user enter "9403080677" and pass "Asim@1234"
Then homepage directed is "true"
And validate the profile icon is displaying

@sanityTest
Scenario: LogIn with invalid credentials
Given user is on landing page
When user enter "9403080677" and pass "Asim@4321"
Then homepage directed is "fail"
And error message should displayed

@reggTest
Scenario Outline: LogIn with multiple credentials
Given user is on landing page
When user enters <user> and pass <pass>
Then validate the profile icon is displaying

Examples:
| user | pass |
| 1234 | 4321 |
| 4567 | 7654 |
| 7890 | 0987 |
| 1010 | 0101 |


