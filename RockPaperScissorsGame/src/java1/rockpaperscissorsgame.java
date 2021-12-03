package java1;


import javax.swing.JOptionPane;

public class rockpaperscissorsgame {



	public static void main(String[] args) {
		

		String kullanýcý1;

		JOptionPane.showMessageDialog (null, "The first player who reaches 5 point" , "Let's Start!" , JOptionPane.INFORMATION_MESSAGE);

		int userscore = 0;
		int pcscore = 0;
		int round=1;
		while (userscore != 5 && pcscore != 5) {
		

			int pc_sayýsý = (int) (Math.random() * 3 + 1);

		
			kullanýcý1 = JOptionPane.showInputDialog( null,"My score= " + pcscore + "  Your score= " + userscore +  " \nRock,Paper or Scissors? ","Round: " + round++, JOptionPane.INFORMATION_MESSAGE);
			
			if (kullanýcý1.equals("Rock")  || kullanýcý1.equals("rock")   || kullanýcý1.equals("Paper")   || kullanýcý1.equals( "paper"  )||kullanýcý1.equals("Scissors" ) || kullanýcý1.equals("scissors") )
            {
			
			
			
			if (pc_sayýsý == 1 && (kullanýcý1.equals("Rock") || kullanýcý1.equals("rock"))) {
				JOptionPane.showMessageDialog(null,  "it's tie!");
				
			} else if (pc_sayýsý == 1 && (kullanýcý1.equals("paper") || kullanýcý1.equals("Paper"))) {
				JOptionPane.showMessageDialog(null,  "My answer was rock. Paper eats rock. You win!");

				

				userscore++;
			} else if (pc_sayýsý == 1 && (kullanýcý1.equals("Scissors" ) || kullanýcý1.equals( "scissors"))) {
				JOptionPane.showMessageDialog(null,  "My answer was rock. Rock breaks scissors. You lose! ");

				

				pcscore++;
			} else if (pc_sayýsý == 2 && (kullanýcý1.equals( "Rock") || kullanýcý1.equals("rock") )) {
				JOptionPane.showMessageDialog(null,   "My answer was paper. Paper eats rock. You lose!");


				pcscore++;
			} else if (pc_sayýsý == 2 && (kullanýcý1.equals("Paper")  || kullanýcý1.equals("paper") )) {
				JOptionPane.showMessageDialog(null, "it's tie!");
				
			} else if (pc_sayýsý == 2 && (kullanýcý1.equals("Scissors")  || kullanýcý1.equals("scissors") )) {
				JOptionPane.showMessageDialog(null, "My answer was paper. Scissors cuts paper. You win! ");

				userscore++;
			}

			else if (pc_sayýsý == 3 && (kullanýcý1.equals("Rock")  || kullanýcý1.equals( "rock"))) {
				JOptionPane.showMessageDialog(null,  "My answer was Scissors. Rock breaks scissors. You win! ");

				userscore++;
			}

			else if (pc_sayýsý == 3 && (kullanýcý1.equals( "Paper") || kullanýcý1.equals("paper") )) {
				JOptionPane.showMessageDialog(null, "My answer was scissors. Scissors cuts paper. You lose!");

				pcscore++;
			} else if (pc_sayýsý == 3 && (kullanýcý1.equals("Scissors")  || kullanýcý1.equals("scissors") )) {
				JOptionPane.showMessageDialog(null, "it's tie!");
				
			}
														
		}
			
			else {
				JOptionPane.showMessageDialog(null, "You entered the wrong character ! " + "\n Rock , Paper or Scissors!" , "WARNING!",JOptionPane.WARNING_MESSAGE );
				
			}
	}

		if (userscore==5    )   {
			
			JOptionPane.showMessageDialog(null,"Congrats! You Win!" );			
		}
		
		else if (pcscore==5){
			JOptionPane.showMessageDialog(null,"You Lost!" );	
			
		}
		
	}

}
