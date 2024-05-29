Feature: Second Page Testing UI

  @MobileTest
  Scenario: Verify that Arc MenuSections work Properly
    Given Open Application
    Then Check that Splash screen show properly
    And Check that Menu bar button show properly
    When Click that Menu bar button
    Then Check that Arc Menu option show properly
    When Click that Arc Menu option
    Then Check that Arc Menu button show properly
    When Click that Arc Menu button
    And Click that Android icon button
    Then Check that Android icon button work properly


  @MobileTest
  Scenario: Verify that Chart Sections work Properly
    Given Open Application
    Then Check that Splash screen show properly
    And Check that Menu bar button show properly
    When Click that Menu bar button
    Then Check that Chart option show properly
    When Click that Chart option
    Then Check that Bar Chat and Pie Chart button show properly
    When Click that Bar Chart button
    Then Check that Bar Chart page load properly
    When Go to Chart page
    And Click that Pie Chart button
    And Check that Pie Chart page load properly