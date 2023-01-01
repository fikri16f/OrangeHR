Feature: As user want add Candidate

       Scenario: user can click button add
           When User go to recruitment page
				   And User click button add
				   Then User go to add candidate page

				 Scenario: user input true all field
           When user Input field dengan benar
				   And user klik button save
				   Then User success input  
				   
#				 Scenario: user Approve candidate
           #When User back to recruitment page
#				   And User click button approve
#				   Then User success approve candidate