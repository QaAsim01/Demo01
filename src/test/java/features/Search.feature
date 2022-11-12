Feature: search and palce order

@searchTest
Scenario: user should have both same search experience in both home and offers page
Given user is on greencart page landing page
When when user search with search name "tom"
Then user search "tom" shortname on offerspage
And validate product with both homepage and offerpage

