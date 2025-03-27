$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Foresters.feature");
formatter.feature({
  "name": "Forestersfinancial.us",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Open Foresters website",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the foresters application \"https://www.foresters.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.launch_the_foresters_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the homepage  \"https://www.foresters.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.validate_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User clicked on MyForestersLogin",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click Login",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicked on Myforesters",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_clicked_on_Myforesters()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass the username and password with onedim map",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_the_username_and_password_with_onedim_map(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Open Foresters website",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the foresters application \"https://www.foresters.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.launch_the_foresters_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the homepage  \"https://www.foresters.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.validate_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User verify Contact us",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click contactUs",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_contactUs()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user scroll down the page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_scroll_down_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate the contactUs text \"service@foresters.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_validate_the_contactUs_text(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Entering details in Need help with your certificate or finding insurance coverage that is right for you?",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click contact us",
  "keyword": "When "
});
formatter.step({
  "name": "user select option in how can we help",
  "keyword": "When "
});
formatter.step({
  "name": "user select option in subject",
  "keyword": "And "
});
formatter.step({
  "name": "user enter details in additional information \"\u003cAdditional info\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass firstName \"\u003cfirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass LastName \"\u003cLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass phoneNumber \"\u003cphoneNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass extn \"\u003cExtn\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass emailId \"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass zipcode \"\u003czipcode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user select contact preference",
  "keyword": "And "
});
formatter.step({
  "name": "user pass existing policy or certificate number \"\u003cpolicy number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click agree check box",
  "keyword": "And "
});
formatter.step({
  "name": "user click submit button",
  "keyword": "And "
});
formatter.step({
  "name": "user takes screenshot of confirmation message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Additional info",
        "firstName",
        "LastName",
        "phoneNumber",
        "Extn",
        "Email",
        "zipcode",
        "policy number"
      ]
    },
    {
      "cells": [
        "Nothing to give",
        "vinoth",
        "vicky",
        "2547898445",
        "044",
        "vvinoth54@gmail.com",
        "600051",
        "21547885vi"
      ]
    }
  ]
});
formatter.background({
  "name": "Open Foresters website",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the foresters application \"https://www.foresters.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.launch_the_foresters_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the homepage  \"https://www.foresters.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.validate_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Entering details in Need help with your certificate or finding insurance coverage that is right for you?",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click contact us",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_contact_us()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select option in how can we help",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_select_option_in_how_can_we_help()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select option in subject",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_select_option_in_subject()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter details in additional information \"Nothing to give\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_enter_details_in_additional_information(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass firstName \"vinoth\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_firstName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass LastName \"vicky\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_LastName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass phoneNumber \"2547898445\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_phoneNumber(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass extn \"044\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_extn(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass emailId \"vvinoth54@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_emailId(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass zipcode \"600051\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_zipcode(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select contact preference",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_select_contact_preference()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass existing policy or certificate number \"21547885vi\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_existing_policy_or_certificate_number(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click agree check box",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_agree_check_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user takes screenshot of confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_takes_screenshot_of_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Open Foresters website",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded6.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the foresters application \"https://www.foresters.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.launch_the_foresters_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the homepage  \"https://www.foresters.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.validate_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User verifing country icon changing or not",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click country icon",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_country_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click canada:english",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_canada_english()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify page canada:english",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_verify_page_canada_english()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click country icon second time",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_country_icon_second_time()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click canada:francais",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_canada_francais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify page canada:francais",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_verify_page_canada_francais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click country icon third time",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_country_icon_third_time()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click unitedKingdom",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_unitedKingdom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify page unitedKingdom",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_verify_page_unitedKingdom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click country icon fourth time",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_country_icon_fourth_time()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click unitedStates",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_unitedStates()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify page unitedStates",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_verify_page_unitedStates()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Get started with Foresters Financial for agents contact me",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click member benefit",
  "keyword": "When "
});
formatter.step({
  "name": "user select myForesters app",
  "keyword": "And "
});
formatter.step({
  "name": "user scrollDown the page click forAgents",
  "keyword": "And "
});
formatter.step({
  "name": "user pass firstname \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass lastName \"\u003clastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass phNumber \"\u003cphone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass extension \"\u003cExt\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass emailid \"\u003cemailid\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass comName \"\u003ccompany\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user pass city \"\u003ccity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user select state",
  "keyword": "And "
});
formatter.step({
  "name": "user select Product you are interested in",
  "keyword": "And "
});
formatter.step({
  "name": "user enter content in \"\u003cother\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click contactMe",
  "keyword": "And "
});
formatter.step({
  "name": "user validate confirmationMessage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastName",
        "phone",
        "Ext",
        "emailid",
        "company",
        "city",
        "other"
      ]
    },
    {
      "cells": [
        "vinoth",
        "vicky",
        "98745463210",
        "011",
        "vvinoth@gmail.com",
        "abcpvtltd",
        "miami",
        "i need a term life insurance 123 @"
      ]
    }
  ]
});
formatter.background({
  "name": "Open Foresters website",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded8.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the foresters application \"https://www.foresters.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.launch_the_foresters_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the homepage  \"https://www.foresters.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.validate_the_homepage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Get started with Foresters Financial for agents contact me",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click member benefit",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_member_benefit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select myForesters app",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_select_myForesters_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user scrollDown the page click forAgents",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_scrollDown_the_page_click_forAgents()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass firstname \"vinoth\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_firstname(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass lastName \"vicky\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_lastName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass phNumber \"98745463210\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_phNumber(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass extension \"011\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_extension(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass emailid \"vvinoth@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_emailid(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass comName \"abcpvtltd\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_comName(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user pass city \"miami\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_pass_city(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select state",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_select_state()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select Product you are interested in",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_select_Product_you_are_interested_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter content in \"i need a term life insurance 123 @\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_enter_content_in(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click contactMe",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_click_contactMe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate confirmationMessage",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.ForestersLifeInsurance.user_validate_confirmationMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded9.png", null);
formatter.after({
  "status": "passed"
});
});