Lookup a definition
Narrative:
In order to search better
As an search analyst
I want to look up word definitions

Scenario: Looking up the definition of 'gmail'
!--Meta:
!--@manual
Given the user is on the Google home page
When the user search for the word 'gmail'
Then they should see the word 'gmail' in all results

Scenario: Looking up the definition of 'facebook'
Given the user is on the Google home page
When the user search for the word 'facebook'
Then they should see the word 'facebook' in all results

