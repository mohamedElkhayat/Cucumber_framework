Feature: search
Scenario Outline: user can search for any product
Given user from homepage enter "dress" on search box
When  user enter search button or enter
Then  system redirect to dress page

Examples:
|search_word|
|dress|