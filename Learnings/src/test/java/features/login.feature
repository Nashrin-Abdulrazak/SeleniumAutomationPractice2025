Feature: Leaftaps homepage
	Scenario: Login should be success
	Given User should navigate to Leaftaps application  by loading the url
	And User enters DemoSalesManager
	And User enters password as crmsfa
	When User click the login button
	Then login should be success



