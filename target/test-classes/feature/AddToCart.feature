



Feature: Add To Cart
  
  Testing add to cart feature of ebay.com
  
  

  Scenario: Verify item can be added to Cart
    Given User open the browser
    And User enter the ebay website
    When User search for book
    And Click on the first book in the list
    And click on Add to cart
    Then Verify Item has been added to cart
   

 
