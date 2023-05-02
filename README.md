# morsum_challenge

The goal is to create an automation project with playright framework to evaluate my knowledge. This project will be intended to evaluate my performance as part of the selection process for the company morsum(https://morsum.co/).

>AUTOMATION CHALLENGE

Using Java as main language, Playwright for UI automation, please create test cases for the scenarios listed below using the following test website.
URL: Java as main language, Playwright for UI automation Test Scenarios:
1) Test case: [001] Add product to cart from PDP
    ```
   Given user logged into the app as 'standard_user'
   When user sorts by prices high to low
   And user selects second item from the list
   And user add this element to cart
   And user goes to cart
   Then user validate that all products selected are in the cart
   ```
2) Test case: [002] Add product "Sauce Labs Bike Light" to cart from PDP
    ```
   Given user logged into the app as 'standard_user'
   When user sorts by prices high to low
   And user selects 'Sauce Labs Bike Light' product from the list
   And user add this element to cart
   And user goes to cart
   Then user validate that all products selected are in the cart
   ```
3) Test case: [003] Add products to cart from index
    ```
   Given user logged into the app as 'standard_user'
   When user sorts by prices high to low
   And user add to cart the first 3 elements
   And user goes to cart
   Then user validate that all products selected are in the cart
   ```

> Remarks requested

Preferably develop with Javas language, using playwright framework, and as test runner it could be Junit, TestNG or Cucumber.

---
## Index

- [Used technologies](#used-technologies)
- [Run test](#run-test)
- [Final Considerations](#final-considerations)
---
## Used technologies
---
For this challenge, The following technologies were used:
- Java
- Cucumber
- JUnit
- Maven
- PlayWright
---

## Run tests

To run the projec it is necessary install some technologies:
* Maven: https://maven.apache.org/
* IDE: https://www.jetbrains.com/idea/download/#section=windows
* Cucumber plugin: https://plugins.jetbrains.com/plugin/7212-cucumber-for-java

It is possible to run all tests using your IDE, just go to Saucedemo.java class inside the package below:
`src.test.java.com.saucedemo.runner`

Or just go in your favorite terminal to the project directory and execute the following command:

This command installs a package, and any packages that it depends on.
```bash
  $ mvn install
```
This command is responsible for running the tests.
```bash
  $ mvn test
or
  $ mvn test -Dcucumber.options="src/test/resources/features/addProduct.feature"
```
---
## Final Considerations
```
In summary, the challenge was funny, I was able to apply some techniques in the tests and try to make it as simple as possible. 
I hope I was able to show what was requested.
```

[Go To TOP](#TOP)


