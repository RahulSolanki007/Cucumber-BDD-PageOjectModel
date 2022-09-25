Feature: feature to test google search functionality

  Scenario Outline: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a <text> in search box
    And hits enters
    Then user is navigated to search results

    Examples: 
      | text                    |
      | Automation step by step |
      | selenium                |

      