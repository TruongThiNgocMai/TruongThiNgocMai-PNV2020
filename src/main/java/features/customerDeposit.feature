Feature: Customer Deposit

  Scenario Outline: Customer Deposit
    Given I open website as http://www.way2automation.com/angularjs-protractor/banking/#/customer
    When I click DepositTop button
    When I type Amount to be Deposited as <number>
    When I click DepositBottom button
    Then I verify Deposit Successful

    Examples:
      | number |
      | 2000   |