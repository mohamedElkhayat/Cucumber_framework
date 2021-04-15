$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactus.feature");
formatter.feature({
  "line": 1,
  "name": "contact us",
  "description": "          user can contact us with send  massage via email",
  "id": "contact-us",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user can contact us with valid email and send  problem or any massage",
  "description": "",
  "id": "contact-us;user-can-contact-us-with-valid-email-and-send--problem-or-any-massage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user from home page click on contact us link",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter \"\u003cemail\u003e\" ,\"\u003creferance\u003e\" , \"\u003cmassage\u003e\" and click send",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "massage appears \" Your message has been successfully sent to our team.\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "contact-us;user-can-contact-us-with-valid-email-and-send--problem-or-any-massage;",
  "rows": [
    {
      "cells": [
        "email",
        "referance",
        "massage"
      ],
      "line": 9,
      "id": "contact-us;user-can-contact-us-with-valid-email-and-send--problem-or-any-massage;;1"
    },
    {
      "cells": [
        "myossif61@gmail.com",
        "dresses",
        "i cant determine the location of the product"
      ],
      "line": 10,
      "id": "contact-us;user-can-contact-us-with-valid-email-and-send--problem-or-any-massage;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "user can contact us with valid email and send  problem or any massage",
  "description": "",
  "id": "contact-us;user-can-contact-us-with-valid-email-and-send--problem-or-any-massage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user from home page click on contact us link",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter \"myossif61@gmail.com\" ,\"dresses\" , \"i cant determine the location of the product\" and click send",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "massage appears \" Your message has been successfully sent to our team.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Contactus.user_from_home_page_click_on_contact_us_link()"
});
formatter.result({
  "duration": 3694879200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "myossif61@gmail.com",
      "offset": 12
    },
    {
      "val": "dresses",
      "offset": 35
    },
    {
      "val": "i cant determine the location of the product",
      "offset": 47
    }
  ],
  "location": "Contactus.user_enter_and_click_send(String,String,String)"
});
formatter.result({
  "duration": 8504289700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Your message has been successfully sent to our team.",
      "offset": 17
    }
  ],
  "location": "Contactus.massage_appears(String)"
});
formatter.result({
  "duration": 178006900,
  "status": "passed"
});
formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "search",
  "description": "",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "user can search for any product",
  "description": "",
  "id": "search;user-can-search-for-any-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user from homepage enter \"dress\" on search box",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter search button or enter",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "system redirect to dress page",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "search;user-can-search-for-any-product;",
  "rows": [
    {
      "cells": [
        "search_word"
      ],
      "line": 8,
      "id": "search;user-can-search-for-any-product;;1"
    },
    {
      "cells": [
        "dress"
      ],
      "line": 9,
      "id": "search;user-can-search-for-any-product;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "user can search for any product",
  "description": "",
  "id": "search;user-can-search-for-any-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user from homepage enter \"dress\" on search box",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter search button or enter",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "system redirect to dress page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "dress",
      "offset": 26
    }
  ],
  "location": "Search.user_from_homepage_enter_on_search_box(String)"
});
formatter.result({
  "duration": 1858503600,
  "status": "passed"
});
formatter.match({
  "location": "Search.user_enter_search_button_or_enter()"
});
formatter.result({
  "duration": 2080585600,
  "status": "passed"
});
formatter.match({
  "location": "Search.system_redirect_to_dress_page()"
});
formatter.result({
  "duration": 7438700,
  "status": "passed"
});
formatter.uri("send_to_friend.feature");
formatter.feature({
  "line": 1,
  "name": "send to friend",
  "description": "",
  "id": "send-to-friend",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "user can send product to friend with mail",
  "description": "",
  "id": "send-to-friend;user-can-send-product-to-friend-with-mail",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user click on blouse product from home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "click on send to friendproduct page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enter \"\u003cname\u003e\",\"\u003cemail\u003e\" click send",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "appear to pop massage Your e-mail has been sent successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "send-to-friend;user-can-send-product-to-friend-with-mail;",
  "rows": [
    {
      "cells": [
        "name",
        "email"
      ],
      "line": 9,
      "id": "send-to-friend;user-can-send-product-to-friend-with-mail;;1"
    },
    {
      "cells": [
        "ali",
        "ali696@gmail.com"
      ],
      "line": 10,
      "id": "send-to-friend;user-can-send-product-to-friend-with-mail;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "user can send product to friend with mail",
  "description": "",
  "id": "send-to-friend;user-can-send-product-to-friend-with-mail;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user click on blouse product from home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "click on send to friendproduct page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enter \"ali\",\"ali696@gmail.com\" click send",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "appear to pop massage Your e-mail has been sent successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Send_friend.user_click_on_blouse_product_from_home_page()"
});
formatter.result({
  "duration": 7292838000,
  "status": "passed"
});
formatter.match({
  "location": "Send_friend.click_on_send_to_friendproduct_page()"
});
formatter.result({
  "duration": 949937800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ali",
      "offset": 7
    },
    {
      "val": "ali696@gmail.com",
      "offset": 13
    }
  ],
  "location": "Send_friend.enter_click_send(String,String)"
});
formatter.result({
  "duration": 605142700,
  "status": "passed"
});
formatter.match({
  "location": "Send_friend.appear_to_pop_massage_Your_e_mail_has_been_sent_successfully()"
});
formatter.result({
  "duration": 527827700,
  "status": "passed"
});
formatter.uri("userregisteration.feature");
formatter.feature({
  "line": 1,
  "name": "sign in",
  "description": "",
  "id": "sign-in",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "sign in with valid email and valid password",
  "description": "",
  "id": "sign-in;sign-in-with-valid-email-and-valid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user from homepage click on signin link",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter valid \"\u003cemail\u003e\" from signin page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter \"\u003cfirstname\u003e\" , \"\u003clasttname\u003e\" , \"\u003cpassword\u003e\", \"\u003ccity\u003e\", \"\u003cpostcode\u003e\", \"\u003cmobile\u003e\",\"\u003cadress2\u003e\", \"\u003cadress1\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user signin sucssefully and name account appear to homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "sign-in;sign-in-with-valid-email-and-valid-password;",
  "rows": [
    {
      "cells": [
        "email",
        "firstname",
        "lasttname",
        "password",
        "city",
        "postcode",
        "mobile",
        "adress2",
        "adress1"
      ],
      "line": 9,
      "id": "sign-in;sign-in-with-valid-email-and-valid-password;;1"
    },
    {
      "cells": [
        "shayne.jacobi1333@hotmail.com",
        "Bruce",
        "Pacocha",
        "6638785772",
        "Valletta",
        "37853",
        "710-318-2138",
        "22445566987",
        "Suite 331 896 Julio Brooks, East Davinatown,"
      ],
      "line": 10,
      "id": "sign-in;sign-in-with-valid-email-and-valid-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "sign in with valid email and valid password",
  "description": "",
  "id": "sign-in;sign-in-with-valid-email-and-valid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "user from homepage click on signin link",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter valid \"shayne.jacobi1333@hotmail.com\" from signin page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enter \"Bruce\" , \"Pacocha\" , \"6638785772\", \"Valletta\", \"37853\", \"710-318-2138\",\"22445566987\", \"Suite 331 896 Julio Brooks, East Davinatown,\"",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user signin sucssefully and name account appear to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Userregister.user_from_homepage_click_on_signin_link()"
});
formatter.result({
  "duration": 3352174100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shayne.jacobi1333@hotmail.com",
      "offset": 18
    }
  ],
  "location": "Userregister.user_enter_valid_email_from_signin_page(String)"
});
formatter.result({
  "duration": 1271413900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bruce",
      "offset": 12
    },
    {
      "val": "Pacocha",
      "offset": 22
    },
    {
      "val": "6638785772",
      "offset": 34
    },
    {
      "val": "Valletta",
      "offset": 48
    },
    {
      "val": "37853",
      "offset": 60
    },
    {
      "val": "710-318-2138",
      "offset": 69
    },
    {
      "val": "22445566987",
      "offset": 84
    },
    {
      "val": "Suite 331 896 Julio Brooks, East Davinatown,",
      "offset": 99
    }
  ],
  "location": "Userregister.user_enter_user_data(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 13319528300,
  "status": "passed"
});
formatter.match({
  "location": "Userregister.user_signin_sucssefully_and_name_account_appear_to_homepage()"
});
formatter.result({
  "duration": 17450700,
  "status": "passed"
});
});