$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12104399500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login test to TekSchool Test Environment page",
  "description": "",
  "id": "login;login-test-to-tekschool-test-environment-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@PracticeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on TekSchool page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Click on Test Environment link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should see Test Environment page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_TekSchool_page()"
});
formatter.result({
  "duration": 4836301900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_Click_on_Test_Environment_link()"
});
formatter.result({
  "duration": 1667520600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_see_Test_Environment_page()"
});
formatter.result({
  "duration": 13281800,
  "status": "passed"
});
formatter.after({
  "duration": 853860200,
  "status": "passed"
});
});