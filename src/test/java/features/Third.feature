Feature: Third Page Testing UI

  @MobileTest
  Scenario: Verify that Drag & DropSections work Properly
    Given Open Application
    Then Check that Splash screen show properly
    And Check that Menu bar button show properly
    When Click that Menu bar button
    Then Check that Drag & Drop option show properly
    When Click that Drag & Drop option
    Then Check that DragDrop and Simple DragDrop button show properly
    When Click that DragDrop button
    Then Check that DragDrop page load properly
    When Go to Drag & Drop page
    And Click that Simple DragDrop button
    Then Check that Simple DragDrop page load properly



  @MobileTest
  Scenario: Verify that user can Close application successfully
    Given Open Application
    Then Check that Splash screen show properly
    And Ckeck that Android UI Design page show properly
    And Check that Welcome text visible properly
    And Check that Android icon show properly
    And Check that OPTIONS button show properly
    When Click that OPTIONS button
    Then Ckeck that Exit option visible properly
    When Click that Exit option
    Then Check that APPLICATION close properly