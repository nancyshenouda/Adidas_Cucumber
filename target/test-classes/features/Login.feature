Feature: Adidas navigation functionalities
  Agile story: As a user, when I am on the adidas home page,
  I should be able to search whatever I want and see relevant information

  #You have to implement the following Web automated checks over our DEMO ONLINE SHOP:
  # https://www.demoblaze.com/index.html
  #• Customer navigation through product categories: Phones, Laptops and Monitors
  #• Navigate to "Laptop" → "Sony vaio i5" and click on "Add to cart". Accept pop up confirmation.
  #• Navigate to "Laptop" → "Dell i7 8gb" and click on "Add to cart". Accept pop up confirmation.
  #• Navigate to "Cart" → Delete "Dell i7 8gb" from cart.
  #• Click on "Place order".
  #• Fill in all web form fields.
  #• Click on "Purchase"
  #• Capture and log purchase Id and Amount.
  #• Assert purchase amount equals expected.
  #• Click on "Ok"

  Scenario: User search adidas home page
    Given User is on Adidas home page
    Then User should see title is Adidas


  Scenario: User navigates through product categories
    Given User is on Adidas home page
    When user searches for phones, Laptops, Monitors
    Then User navigates to Laptops
    Then User sees Sony vaio i5
    Then user clicks on Add to cart
    Then user accepts pop up confirmation

  Scenario: User navigates through product categories
    Given User navigates back to home page
    Then User clicks on Laptops
    Then User clicks Dell i7 8gb
    Then user clicks on Add to cart
    Then user accepts pop up confirmation

  Scenario: User navigates to cart
    Given User navigates to cart
    Then user clicks on delete

  Scenario: User places order
    Given User is on placing order page
    Then User clicks on place order
    And user fills all the form details
    Then user clicks Ok

    #• Capture and log purchase Id and Amount.
  #• Assert purchase amount equals expected.
  #• Click on "Ok"
  Scenario: Capture and log purchase and amount
    Given User got the payment confirmation
    Then User should see purchase ID and amount
    Then User click Ok