Feature: As a admin user I want to add users,delete user and edit users
  
  @Regression
  Scenario: User should be able to add users
    Given Application is up and running
    And All APIs are working correctly
    When User login with admin credentials
    And Click on add user
    And Fills all mandatory details
    And Click on save
    Then User should be created on portal
    And Admin should be able to check in existing user.
    When Admin clicks on user
    Then User information should be displayed
		