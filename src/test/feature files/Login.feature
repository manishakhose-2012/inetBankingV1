Feature: Login

  Scenario:Successful login for right credentials
    Given user launches chrome browser
    When user opens URL "https://admin-demo.nopcommerce.com/login"
    And user enter username "admin@yourstore.com"
    And user enters password "admin"
    And user clicks on button "Log in"
    Then page opens and it has title "Dashboard"
    And user clicks on link "logout"
    Then page opens and it has title "Your store. Login"
    Then user closes the browser

