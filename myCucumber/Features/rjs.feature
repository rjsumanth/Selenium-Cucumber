Feature: SIT Testing
   Scenario Outline: Smoke Testing 
		  Given Open browser and Login page
		  When Enter the "<username>" and "password"
		  Then Successfully login 
   
 Examples:
 |username	|password	|
 |username	|password	|
 
  