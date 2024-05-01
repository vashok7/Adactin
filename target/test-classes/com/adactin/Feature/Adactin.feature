Feature: Hotel booking in Adactin Web Application
Scenario: User Login in The Web Application
Given user Launch The Adactin Application
When user Enter The Username in the Username Field
And user Enter The Password in the Password Field
Then user Clicked the login and It navigated to the search hotel page

Scenario: User search hotels in the search Hotel page
When user select the Location in the Location field
And User Select the Hotel in the Hotels field
And User Select the Room type in the Room type field
And User select the number of room in the Number of Rooms field
And User select the number of Adults per room in the Adults per room field
Then user clicked the Search button and Its navigated to the select hotel page

Scenario: user select the Hotel in the Select Hotel Page
When user Selects The Hotel by Clicking on the Radio button field
Then user Clicked the continue Button and Its navigated to the Book A Hotel page

Scenario: User Entering his details in the Book A Hotel page
When User Enter First name in the First Name field
And User Enter Last name in the Last Name field
And User enter address in the Billing Address field
And User enter Credit Card No in the Credit Card No field
And User select the credit card type in the Credit Card Type field
And User select the month in the Expiry Date field
And User select the year in the Expiry Date field
And User enter CVV number in the CVV number field
Then User Clicked the Book Now And Its navigated to the Booking Confirmation page

Scenario: User verify the booking details and logout the adactin
Then user click the logout button  