Feature:  SIT Testing
 Scenario Outline: Smoke Testing
  Given Open browser and Login page
  When Enter the "username" and "password"
  Then Successful Login
  
Examples:
|username	|password	| 
|Sumanth1	|password	|
|Sumanth2	|password	|