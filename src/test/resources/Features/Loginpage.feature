Feature: verifying the facebook login Module

  Scenario Outline: verify facebook login with credentials
    Given user is on the facebook page
    When user enter "<username>" and "<password>"
    And user click the login button
    Then user should verify afer login success message

    Examples: 
      | username  | password  |
      | Greensomr | hello@123 |

  #   | bala      | hellotttytu@123omr |
  #   | mani      | hellojhjhj@123     |
  Scenario Outline: verify Amazon search with credentials
    Given user is on the facebook page
    When user enter "<username>" and "<password>"
    And user click the login button
    Then user should verify afer login success message

    Examples: 
      | username  | password  |
      | Greensomr | hello@123 |
