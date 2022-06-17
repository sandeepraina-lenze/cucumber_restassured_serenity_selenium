Feature: Employees
  I want add a new employee detail and later search the newly added employee detail

  @debug
  Scenario Outline: Add a new employee detail
    Given I want to a add a new employee
    When I give the employee name '<employeename>' , employee age '<employeeage>' and employee salary '<employeesalary>'
    Then I verify the response code received as '<responsecode>' to ensure data is added successfully

    Examples: 
      | responsecode | employeename | employeeage | employeesalary |
      |          200 | sandeep      |          38 |        2500.50 |
      |          200 | bijimol      |          28 |        2500.00 |

  @debug
  Scenario Outline: Search the newly added employee name
    Given I want to get the list of all the employee details
    When I give the URL '<url>'
    Then I verify the response code received as '<responsecode>'
    And Verify the employee with name '<employeename>' is present in the list

    Examples: 
      | url       | responsecode | employeename |
      | employees |          200 | sandeep      |
