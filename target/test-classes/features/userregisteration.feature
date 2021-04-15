Feature: sign in
Scenario Outline: sign in with valid email and valid password
Given user from homepage click on signin link
When user enter valid "<email>" from signin page
And user enter "<firstname>" , "<lasttname>" , "<password>", "<city>", "<postcode>", "<mobile>","<adress2>", "<adress1>"
Then user signin sucssefully and name account appear to homepage

Examples:
|email|firstname|lasttname|password|city|postcode|mobile|adress2|adress1|
|shayne.jacobi1333@hotmail.com|Bruce|Pacocha|6638785772| Valletta|37853|710-318-2138|22445566987|Suite 331 896 Julio Brooks, East Davinatown,|