
@Regression @user2
Feature: Testing Searches

    @Random1
    Scenario: sadas
      When xxx



  @Smoke @google
  Scenario Template: Google Search
    When go to 'https://www.google.com' website
    Then Enter '<Products>' in search box

    Examples:
    | Products |
    | apple    |
    | yagyu    |
    | iphone   |
    | Rayisa   |
    | zohra    |
    | Uyghur   |



    @amazon
    Scenario Outline: xxxxx
      When go to 'https://www.amazon.com' website
      And enter "<Products>" in the new Search box

      Examples:
        | Products |
        | apple    |
        | yagyu    |
        | iphone   |
        | Rayisa   |
        | zohra    |
        | Uyghur   |

