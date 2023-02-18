# CBDDFW_JAN_2023
CucumberBDD FW with TestNG and Maven

# How to run the test, paste this in the terminal
mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@smoke"