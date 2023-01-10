Feature:  User Data Create in Petstore application
  As a user I want to test User Application

  Scenario Outline: CRUD Test for user
    Given Pet store Application running
    When I create new user by providing the information id "<id>" username "<username>" firstName"<firstName>" lastName "<lastName>"  email "<email>" password"<password>" phone "<phone>"userStatus "<userStatus>"
    Then I get that created user  with "<username>" is created
    And I update the user with information  id "<id>" username "<username>" firstName"<firstName>" lastName "<lastName>"  email "<email>" password"<password>" phone "<phone>"userStatus "<userStatus>"
    And I verify user updated with "<username>" successfully
    And I delete created user with username "<username>"
    Then The user deleted successfully

    Examples:
      | id | username | firstName | lastName | email                | password  | phone        | userStatus |
      | 1  | BeaMc    | Bea       | McCreagh | bmccreagh0@gmail.com | jpdrmzu   | 857-145-3487 | 45         |
      | 2  | RaMa     | Raquela   | Mallion  | rmallion1@gmail.gov  | 40Z1hj95I | 557-365-6375 | 1          |
      | 3  | DonaHo   | Donall    | Houlahan | dhoulahan2@gmail.com | fjk6KZ    | 782-693-5326 | 45         |