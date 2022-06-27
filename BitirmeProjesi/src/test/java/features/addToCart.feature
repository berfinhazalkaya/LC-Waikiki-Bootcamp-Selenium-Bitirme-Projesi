@SignUpAndAddProductToCart
Feature: Sign Up And Add Product To Cart

  @TrueSignUp
  Scenario: True Sign Up
    Given Berfin is on Home page
    Then check "homepage" title
    Then check login button image
    When click login button
    Then check login page title
    Then check sign up button
    When click sign up button
    When write "ipekhazal@gmail.com" in email part
    When write "berfin12345" in password part
    When click show password button in sign up page
    When write "050505050" in telephone part
    When click check boxes
    When click memberPrivacyApprove button
    When click register button
    Then check verification code screen

  @FalseSignUp
  Scenario: False Sign Up
    Given Berfin is on Home page
    Then check "homepage" title
    Then check login button image
    When click login button
    Then check login page title
    Then check sign up button
    When click sign up button
    When write "@gmail.c" in email part
    When write "123" in password part
    When click show password button in sign up page
    When click register button
    Then check email error message
    When print email error message
    Then check password error message
    When print password error message
    Then check phone error message
    When print phone error message
    Then check contract error message
    When print contract error message


    @Cart
    Scenario: Add To Cart
      Given Berfin is on Home page
      Then check "homepage" title
      Then check login button image
      When click login button
      Then check login page title
      When write "berfinhazalkaya@gmail.com" in email part
      When write "berfin12345" in password part
      When click show password button
      When click login button again
      Then check "homepage" title
      When click understood button
      When click on woman page
      When click on blouse page
      Then check blouse page
      When write "siyah" in the color search box
      When click black button
      When click medium size button
      When click 2. product
      Then check product page
      When click medium
      When click add to shopping cart button
      When click shopping cart button
      Then check shopping cart page
      Then check product name
      Then check product code
      Then check how many product
      Then check size of product
      Then check total price
      When click pay button
      When click debit-credit card
      When click give up button
      Then check name surname box
      Then check credit cart no box
      Then check expiration date boxes
      Then check cvv box
