
@Regression @User1
Feature: Testing Logins


  Background:



  @Smoke
  Scenario Outline: Testing Gmail Logins
    When go to 'https://www.gmail.com' website
    And User Enters '<UserName>' and '<PassWord>'
    Then title should contain 'Muh'


    Examples:
      | UserName                    | PassWord  |
      | Muhtar.Mahmut0519@gmail.com | 213123 |
      | Muhtar.Mahmut0519@gmail.com | mmassa |
      |Muhtar.Mahmut0519@gmail.com  | ****   |