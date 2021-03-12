




@newlogin
  Feature Login more
  Scenario: Resilix_Login_Validate user is able to login with single
    When users enter username and password
    And user clicks the submit button
    When user clicks on novartis logo
    Then the user sees page title
  Scenario Outline: Resilix_Login_Validate user is able to login with more names
    When users enters explicit <username> and <password>
    And user clicks the submit button
    When user clicks on novartis logo
    Then the user sees page title
    Examples:
      | username                                       | password |
      | temp-rth@humancaresystems.com                  | snurse   |
      | valProgramAdmin                                | snurse   |
      | resilixadmin+devsiteadmin@humancaresystems.com | user1    |
      | valnurse                                       | snurse   |