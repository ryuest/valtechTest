@All
Feature: valtech Search


  Scenario: Navigation to valtech page
    Given User go to valtech site
    When Do click 'About'
    Then Assert that the h1 is displayed 'About'
    When Do click 'Services'
    Then Assert that the h1 is displayed 'Services'
    When Do click 'Work'
    Then Assert that the h1 is displayed 'Work'

