package java1;


import javax.swing.JOptionPane;

public class rockpaperscissorsgame {



	public static void main(String[] args) {
		

		String kullan�c�1;

		JOptionPane.showMessageDialog (null, "The first player who reaches 5 point" , "Let's Start!" , JOptionPane.INFORMATION_MESSAGE);

		int userscore = 0;
		int pcscore = 0;
		int round=1;
		while (userscore != 5 && pcscore != 5) {
		

			int pc_say�s� = (int) (Math.random() * 3 + 1);

		
			kullan�c�1 = JOptionPane.showInputDialog( null,"My score= " + pcscore + "  Your score= " + userscore +  " \nRock,Paper or Scissors? ","Round: " + round++, JOptionPane.INFORMATION_MESSAGE);
			
			if (kullan�c�1.equals("Rock")  || kullan�c�1.equals("rock")   || kullan�c�1.equals("Paper")   || kullan�c�1.equals( "paper"  )||kullan�c�1.equals("Scissors" ) || kullan�c�1.equals("scissors") )
            {
			
			
			
			if (pc_say�s� == 1 && (kullan�c�1.equals("Rock") || kullan�c�1.equals("rock"))) {
				JOptionPane.showMessageDialog(null,  "it's tie!");
				
			} else if (pc_say�s� == 1 && (kullan�c�1.equals("paper") || kullan�c�1.equals("Paper"))) {
				JOptionPane.showMessageDialog(null,  "My answer was rock. Paper eats rock. You win!");

				

				userscore++;
			} else if (pc_say�s� == 1 && (kullan�c�1.equals("Scissors" ) || kullan�c�1.equals( "scissors"))) {
				JOptionPane.showMessageDialog(null,  "My answer was rock. Rock breaks scissors. You lose! ");

				

				pcscore++;
			} else if (pc_say�s� == 2 && (kullan�c�1.equals( "Rock") || kullan�c�1.equals("rock") )) {
				JOptionPane.showMessageDialog(null,   "My answer was paper. Paper eats rock. You lose!");


				pcscore++;
			} else if (pc_say�s� == 2 && (kullan�c�1.equals("Paper")  || kullan�c�1.equals("paper") )) {
				JOptionPane.showMessageDialog(null, "it's tie!");
				
			} else if (pc_say�s� == 2 && (kullan�c�1.equals("Scissors")  || kullan�c�1.equals("scissors") )) {
				JOptionPane.showMessageDialog(null, "My answer was paper. Scissors cuts paper. You win! ");

				userscore++;
			}

			else if (pc_say�s� == 3 && (kullan�c�1.equals("Rock")  || kullan�c�1.equals( "rock"))) {
				JOptionPane.showMessageDialog(null,  "My answer was Scissors. Rock breaks scissors. You win! ");

				userscore++;
			}

			else if (pc_say�s� == 3 && (kullan�c�1.equals( "Paper") || kullan�c�1.equals("paper") )) {
				JOptionPane.showMessageDialog(null, "My answer was scissors. Scissors cuts paper. You lose!");

				pcscore++;
			} else if (pc_say�s� == 3 && (kullan�c�1.equals("Scissors")  || kullan�c�1.equals("scissors") )) {
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
