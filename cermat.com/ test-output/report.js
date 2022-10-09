$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./feature/signup.feature");
formatter.feature({
  "line": 1,
  "name": "Sign up member",
  "description": "",
  "id": "sign-up-member",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Adding new member",
  "description": "",
  "id": "sign-up-member;adding-new-member",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Open url \"https://www.cermati.com/app/gabung\"",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "enter the required information",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Daftar button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "We can view the verification methods \"Pilih Metode Verifikasi\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "testSteps.launch_browser()"
});
formatter.result({
  "duration": 3144951000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.cermati.com/app/gabung",
      "offset": 10
    }
  ],
  "location": "testSteps.open_url(String)"
});
formatter.result({
  "duration": 3707737500,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.enter_the_required_information()"
});
formatter.result({
  "duration": 10027744600,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.click_on_Daftar_button()"
});
formatter.result({
  "duration": 2065633800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pilih Metode Verifikasi",
      "offset": 38
    }
  ],
  "location": "testSteps.we_can_view_the_verification_methods(String)"
});
formatter.result({
  "duration": 17274500,
  "status": "passed"
});
formatter.match({
  "location": "testSteps.close_browser()"
});
formatter.result({
  "duration": 5364295500,
  "status": "passed"
});
});