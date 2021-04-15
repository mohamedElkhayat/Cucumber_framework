Feature: send to friend
Scenario Outline: user can send product to friend with mail
Given user click on blouse product from home page
When click on send to friendproduct page
And enter "<name>","<email>" click send
Then appear to pop massage Your e-mail has been sent successfully

Examples:
|name|email|
|ali|ali696@gmail.com|