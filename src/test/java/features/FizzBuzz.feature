#Author: Vikram.Mittu@test.com
#Date: 28-Feb-2022
#Comments: Test scenarios to check if the given input is a fizz, buzz ,fizzbuzz or invalid
#Assumptions: User enters one of these values on fizz buzz app
# 1,3,5,15,"A","",23 and the app return appropriate status as per the requirement
#1.If the value is a multiple of 3 outputs the word “Fizz”
#2.If the value is a multiple of 5 outputs the word “Buzz”
#3.If the value is a multiple of both 3 and 5 outputs the word “FizzBuzz”
#4.If the value is not numeric outputs “Invalid Item”
#5.Finally, the application returns the following outputs for each division performed.
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @P1
  Scenario Outline: Check if the user input is Fizz, Buzz, FizzBuzz or invalid
    Given The user accesses FizzBuzz app
    When The user enters <value> in the app
    Then The user verifies the <status> in the app

    Examples: 
      | value | status                             |
      |     3 | "Fizz"                             |
      |     5 | "Buzz"                             |
      |    15 | "FizzBuzz"                         |
      |     1 | "Divided 1 by 3  Divided 1 by 5"   |
      | ""    | "Invalid Item"                     |
      | "A"   | "Invalid Item"                     |
      |    23 | "Divided 23 by 3 Divided 23 by 5" |
