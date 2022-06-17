Feature: AmazonLogin
  I want to log inside the Amazon webpage through different login credentials

  @debug1
  Scenario Outline: Successful Login with Valid Credentials
    Given User is on page '<pageaddress>'
    When User Navigate to LogIn Page
    And User enters '<username>' and '<password>'
    Then Message displayed Login Successfully

    Examples: 
      |	pageaddress							| username   | password |
      |	https://www.amazon.com/	| testuser_1 | Test@153 |
      |	https://www.amazon.com/	| testuser_2 | Test@153 |
