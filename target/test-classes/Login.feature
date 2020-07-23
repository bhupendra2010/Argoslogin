Feature: Login Scenario

  Scenario Outline:
    Given user is on homepage
    When user enter "<Email>" and "<password>"
    Then User should log in securly

    Examples:
      |Email|                                              password|
      |bhupendra2010@hotmail.com| Bhupen2010                      |
      |bhupendranayee1979@gmail.com| Bhupen1983                   |
      |vishnuknayi@gmail.com       | nayi58              |