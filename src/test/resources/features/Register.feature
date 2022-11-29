Feature: Register
  I as a service user want to be able to register to log in to the page
  Scenario:  register successfully
    Given  he user is on the page
    When  he user enters his data
    Then  confirm registration