Feature: First Page Testing UI

  @MobileTest
  Scenario: Verify that user can open application successfully
  Given Open Application
  Then Check that Splash screen show properly
  And Ckeck that Android UI Design page show properly
  And Check that Welcome text visible properly
  And Check that Android icon show properly
  And Check that Menu bar button show properly
  And Check that OPTIONS button show properly


  @MobileTest
  Scenario:Verify that Animations Sections work Properly
    Given Open Application
    Then Check that Splash screen show properly
    And Check that Menu bar button show properly
    When Click that Menu bar button
    Then Check that Animations option show properly
    When Click that Animations option
    Then Check that Alpha button show properly
    When Click that Alpha button
    Then Check that Normal button show properly
    And Check that Alpha zero point five f button show properly





















