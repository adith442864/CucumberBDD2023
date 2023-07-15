Feature: User should be able to login with different credentials

  @DDT
  Scenario Outline: User can have multiple accounts and can login with different roles
    Given User opens the application in incognito mode
    When user login with "<username>" and "<password>"
    And click on login
    Then User is able to login

    Examples: 
      | username          | password   |
      | foysal@gmail.com  | admin@123  |
      | kanchan@gmail.com | demo@123   |
      | Manula.gmailcom   | sample@123 |