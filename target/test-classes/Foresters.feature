Feature: Forestersfinancial.us

Background: Open Foresters website 
Given Launch the foresters application "https://www.foresters.com/"
Then Validate the homepage  "https://www.foresters.com/"

Scenario: User clicked on MyForestersLogin 
When user click Login 
And User clicked on Myforesters
And user pass the username and password with onedim map
|username|Vvinoth54@gmail.com| 
|password|Sogod809|
And user click login

Scenario: User verify Contact us
When user click contactUs
And user scroll down the page
Then user validate the contactUs text "service@foresters.com"

Scenario Outline: Entering details in Need help with your certificate or finding insurance coverage that is right for you?
When user click contact us
When user select option in how can we help
And user select option in subject
And user enter details in additional information "<Additional info>"
And user pass firstName "<firstName>"
And user pass LastName "<LastName>"
And user pass phoneNumber "<phoneNumber>"
And user pass extn "<Extn>"
And user pass emailId "<Email>"
And user pass zipcode "<zipcode>"
And user select contact preference
And user pass existing policy or certificate number "<policy number>"
And user click agree check box
And user click submit button
Then user takes screenshot of confirmation message

Examples:
|Additional info|firstName|LastName|phoneNumber|Extn|Email|zipcode|policy number|
|Nothing to give|vinoth|vicky|2547898445|044|vvinoth54@gmail.com|600051|21547885vi|

Scenario: User verifing country icon changing or not
When user click country icon
When user click canada:english 
Then user verify page canada:english
When user click country icon second time
When user click canada:francais
Then user verify page canada:francais
When user click country icon third time
When user click unitedKingdom
Then user verify page unitedKingdom
When user click country icon fourth time
When user click unitedStates
Then user verify page unitedStates

Scenario Outline: Get started with Foresters Financial for agents contact me
When user click member benefit
And user select myForesters app
And user scrollDown the page click forAgents
And user pass firstname "<firstname>"
And user pass lastName "<lastName>"
And user pass phNumber "<phone>"
And user pass extension "<Ext>"
And user pass emailid "<emailid>"
And user pass comName "<company>"
And user pass city "<city>"
And user select state
And user select Product you are interested in
And user enter content in "<other>"
And user click contactMe
Then user validate confirmationMessage

Examples:
|firstname|lastName|phone|Ext|emailid|company|city|other|
|vinoth|vicky|98745463210|011|vvinoth@gmail.com|abcpvtltd|miami|i need a term life insurance 123 @|


