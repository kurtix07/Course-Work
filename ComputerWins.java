package Game;

public class Main {
	public static boolean playerTurn = true;
	public static boolean playerWon = false;
	public static boolean computerWon = true;
	
	public static TicTacToe board = new TicTacToe();
	
	public static void main(String[] args)
		if(board.isVisible() == false) {
			board.setVisible(true);
		}
	}	
	
	public static void checkforwin () {
		if(board.button1.getText().equals("O"); {
			if(board.button4.getText().equals("O"); {
				if(board.button7.getText().equals("O"); {
					playerWon = false;
					computerWon = true;
					System.out.println("Player 2 Won!");
				}
			}
		}			
		if(board.button1.getText().equals("O"); {
			if(board.button5.getText().equals("O"); {
				if(board.button9.getText().equals("O"); {
					playerWon = false;
					computerWon = true;
					System.out.println("Player 2 Won!");
				}	
			}
		}
		if(board.button1.getText().equals("O"); {
			if(board.button2.getText().equals("O"); {
				if(board.button3.getText().equals("O"); {
					playerWon = false;
					computerWon = true;
					System.out.println("Player 2 Won!");	
				}
			}
		}	
		if(board.button2.getText().equals("O"); {
			if(board.button5.getText().equals("O"); {
				if(board.button8.getText().equals("O"); {
					playerWon = false;
					computerWon = true;
					System.out.println("Player 2 Won!");	
				}
			}
		}
		if(board.button3.getText().equals("O"); {
			if(board.button6.getText().equals("O"); {
				if(board.button9.getText().equals("O"); {
					playerWon = false;
					computerWon = true;
					System.out.println("Player 2 Won!");	
				}
			}
		}
		if(board.button4.getText().equals("O"); {
			if(board.button5.getText().equals("O"); {
				if(board.button6.getText().equals("O"); {
					playerWon = false;
					computerWon = true;
					System.out.println("Player 2 Won!");	
				}
			}
		}			
		if(board.button7.getText().equals("O"); {
			if(board.button8.getText().equals("O"); {
				if(board.button9.getText().equals("O"); {
					playerWon = false;
					computerWon = true;
					System.out.println("Player 2 Won!");	
				}
			}
		}	
		if(board.button3.getText().equals("O"); {
			if(board.button5.getText().equals("O"); {
				if(board.button7.getText().equals("O"); {
					playerWon = false;
					computerWon = true;
					System.out.println("Player 2 Won!");	
				}
			}
		}	
	}
}	