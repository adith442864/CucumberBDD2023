Feature: As a admin, user can add,edit,delete courses

@Smoke
  Scenario: Admin should be able to add courses
    Given Application is up and running
    And Admin is able to login with "admin@email.com" and "admin@123"
    When Admin clicks on add button course
    And Fill all mandatory details
    Then Admin should be able to add course

    