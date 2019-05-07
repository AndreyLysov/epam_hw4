Feature: Search something in google.com

  Scenario: Search text
    When Search for "text"
    Then Search result is displayed