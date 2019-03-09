
@Regression @user2
Feature: Testing Searches

    @Random1
    Scenario: sadas
      When xxx

  @Smoke @google
  Scenario Template: Google Search
    Given Environment is Ready
    When go to 'https://www.google.com' website
    Then Enter '<Products>' in search box
    * Close Browser

    Examples:
    | Products |
    | apple    |
    | yagyu    |
    | iphone   |
    | Rayisa   |
    | zohra    |
    | Uyghur   |
    | Mirzat   |
    | Kawsar   |
    | Patima   |
    | Kuddus   |
    | Ihtipar  |
    | Ramila   |


    @amazon
    Scenario Outline: xxxxx
      Given Environment is Ready
      When go to 'https://www.amazon.com' website
      And enter "<Products>" in the new Search box
      * Close Browser

      Examples:
        | Products |
        | apple    |
        | yagyu    |
        | iphone   |
        | Rayisa   |
        | zohra    |
        | Uyghur   |
        | Mirzat   |
        | Kawsar   |
        | Patima   |
        | Kuddus   |
        | Ihtipar  |
        | Ramila   |


