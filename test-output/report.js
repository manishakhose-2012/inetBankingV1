$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("target/test-classes/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successful login for right credentials",
  "description": "",
  "id": "login;successful-login-for-right-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter username \"admin@yourstore.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters password \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on button \"Log in\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "page opens and it has title \"Dashboard\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on link \"logout\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "page opens and it has title \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});