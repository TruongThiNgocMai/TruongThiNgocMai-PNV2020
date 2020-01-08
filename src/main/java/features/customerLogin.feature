Feature: Customer login

  Scenario Outline: Customer login
    Given I open website as http://www.way2automation.com/angularjs-protractor/banking/#/customer
    When I select <userSelect> in the YourName label
    When I click Login button
    Then I verify Harry Potter is already selected in the YourName label


    Examples:
      | userSelect   |
      | Harry Potter |