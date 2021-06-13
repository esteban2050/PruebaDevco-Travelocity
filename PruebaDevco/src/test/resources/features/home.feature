#Author: ju.eslogi@hotmail.com

Feature:
  As a common user
  I want to interact with the different
  functions on the page

  Background:
    Given that a user has access to the travelocity page

  Scenario: The user change the language
    When the user change the language on the page
    Then sees that the language change to english

  Scenario Outline: The user sees the different travels
    When the user see the <travel> type
    Then sees the title of the search is the correct with <travel>
    Examples:
      | travel   |
      | PACKAGES |
      | STAYS    |

  Scenario Outline: The user search a stay
    When the user fills the information with <destination>, <fchInicio>, <fchFin>, <adults> and <children>
    Then saw that the search was successful

    Examples:
      | destination | fchInicio | fchFin | children | adults |
      | toronto     |           |        | 0        | 1      |
