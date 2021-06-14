#Author: ju.eslogi@hotmail.com

Feature: Login and logout
  As a common user
  I want to have access to the travelocity page
  To search different travels

  Background:
    Given that a user has access to the travelocity page
    When the user try to logg-in on the page

  Scenario Outline: The user logg-in to the travelocity page
    Then the user see the <title> in the toolbar
    Examples:
      | title     |
      | different |

  @test
  Scenario Outline: The user logs out safely
    And the user try to logs out
    Then the user see the <title> in the toolbar
    Examples:
      | title   |
      | Sign in |