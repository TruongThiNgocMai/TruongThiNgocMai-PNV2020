Feature: Open Website

  Scenario Outline: Open Website
    Given I open website as <website>
    Examples:
      | website                                                               |
      | http://www.way2automation.com/angularjs-protractor/banking/#/customer |