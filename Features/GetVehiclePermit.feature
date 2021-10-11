Feature: Get Vechicle Permit
   Scenario: Vehicle Permit
   
    Given User launch chrome browser
    And User Calaculates the Fee
    Then Verify "Step 2 of 7 : Select permit type" displayed
    And Close browser
  

