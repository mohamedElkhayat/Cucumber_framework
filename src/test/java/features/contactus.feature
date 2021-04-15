Feature: contact us 
            user can contact us with send  massage via email
Scenario Outline: user can contact us with valid email and send  problem or any massage
Given user from home page click on contact us link
When User enter "<email>" ,"<referance>" , "<massage>" and click send
Then massage appears " Your message has been successfully sent to our team."

Examples:
|email|referance|massage|
|myossif61@gmail.com|dresses|i cant determine the location of the product|