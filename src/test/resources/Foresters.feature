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

