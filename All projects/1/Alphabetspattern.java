
//importing packages for input/output.

package stellarscript.ss;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class AlphabetsPattern {

    public static void main(String[] args) throws IOException {

        // creating objects.

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
	
	System.out.println("*** WELCOME TO STELLAR SCRIPT!! ***\n");
	
        //Declaring variable.

        boolean end = false;

	//Input from user.

        System.out.println("Please Enter any Alphabet(UPPERCASE):\n");

        System.out.println("Enter 0 to exit the program!!\n");

        //Starting while loop.

        while (end != true) {

            //Accepting Input using readLine() method.

            String str = br.readLine();
            
            System.out.println();

            //Starting of Switch case.  

            switch (str) {

                case "A":

                    //Printing pattern for 'A' using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if (j == 1 || j == 3) {
                                System.out.print("* ");
                            } else if (i == 1 || i == 4) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "B":

                    //Printing pattern for 'B'using for loops.


                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if (j == 1 || j == 3 || j == 5) {
                                System.out.print("* ");
                            } else if (i == 1 || i == 4) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case "C":

                    //Printing pattern for'C'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if (j == 1 || j == 5) {
                                System.out.print("* ");
                            } else if (i == 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }

                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "D":

                    //Printing pattern for for'D'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if ((j == 1 || j == 5) && i != 4) {
                                System.out.print("* ");
                            } else if ((j == 2 || j == 3 || j == 4) && (i == 1 || i == 4)) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }

                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "E":

                    //Printing pattern for 'E'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if (j == 1 || j == 3 || j == 5) {
                                System.out.print("* ");
                            } else if (i == 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }

                        System.out.println();
                    }
                    System.out.println();
                    break;



                case "F":

                    //Printing pattern for 'F'using for loops.


                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if (j == 1 || j == 3) {
                                System.out.print("* ");
                            } else if (i == 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "G":

                    //Printing pattern for 'G'using for loops.

                    for (int j = 1; j <= 6; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if (j == 1 || j == 6) {
                                System.out.print("* ");
                            } else if (j == 4 || j == 5) {
                                if (i != 2) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else {
                                if (i == 1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            }

                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "H":

                    //Printing pattern for 'H'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if (j == 3) {
                                System.out.print("* ");
                            } else if (i == 1 || i == 4) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }

                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "I":

                    //Printing pattern for 'I'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 5; i++) {
                            if (j == 1 || j == 5) {
                                System.out.print("* ");
                            } else if (i == 3) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "J":

                    //Printing pattern for 'J'using for loops.


                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 5; i++) {
                            if (j == 1 || (j == 5 && (i != 4 && i != 5)) || (j == 4 && i == 1)) {
                                System.out.print("* ");
                            } else if (i == 3) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "K":

                    //Printing pattern for 'K'using for loops.


                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 3; i++) {
                            if (((j == 1 || j == 5) && i != 2) || ((j == 2 || j == 4) && i != 3)) {
                                System.out.print("* ");
                            } else if (i == 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "L":

                    //Printing pattern for 'L'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if ((j == 1 || j == 2 || j == 3 || j == 4) && (i != 2 && i != 3 && i != 4)) {
                                System.out.print("* ");
                            } else if (i == 1 || j == 5) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "M":

                    //Printing pattern for 'M'using for loops.


                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 5; i++) {
                            if (((j == 1 || j == 5) && (i != 2 && i != 3 && i != 4)) || (j == 2 && i != 3) || (j == 3 && (i != 2 && i != 4))) {
                                System.out.print("* ");
                            } else if (i == 1 || i == 5) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "N":

                    //Printing pattern for 'N'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 5; i++) {
                            if ((j == 2 && i == 2) || (j == 3 && i == 3) || (j == 4 && i == 4)) {
                                System.out.print("* ");
                            } else if (i == 1 || i == 5) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "O":

                    //Printing pattern for 'O'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 5; i++) {
                            if (j == 1 || j == 5) {
                                System.out.print("* ");
                            } else if (i == 1 || i == 5) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "P":

                    //Printing pattern for 'P'using for loops.


                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if ((j == 1 || j == 3) || (j == 2 && (i != 2 && i != 3))) {
                                System.out.print("* ");
                            } else if (i == 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;



                case "Q":

                    //Printing pattern for 'Q'using for loops.


                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 5; i++) {
                            if ((j == 1 && i != 5) || j == 5 || ((j == 2 || j == 4) && (i == 1 && i == 4)) || ((j == 3 || j == 4) && (i != 2 && i != 5))) {
                                System.out.print("* ");
                            } else if (i == 1 || i == 4) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;



                case "R":

                    //Printing pattern for 'R'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if (((j == 1 || j == 3) && i != 4) || ((j == 2 || j == 4 || j == 5) && (i != 2 && i != 3))) {
                                System.out.print("* ");
                            } else if (i == 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "S":

                    //Printing pattern for 'T'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if ((j == 1 || j == 3 || j == 5) || (j == 2 && i == 1) || (j == 4 && i == 4)) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "T":

                    //Printing pattern for'T'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 5; i++) {
                            if (j == 1 || i == 3) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "U":

                    //Printing pattern for 'U'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 4; i++) {
                            if (j == 5 || i == 1 || i == 4) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "V":

                    //Printing pattern for 'V'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        if (j <= 3)
                            System.out.print("* ");
                        else
                            System.out.print("  ");
                        for (int i = 2; i <= 4; i++) {
                            if (j == 4) {
                                if (i != 3)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            } else if (j == 5) {
                                if (i == 3)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            } else
                                System.out.print("  ");
                        }
                        if (j <= 3)
                            System.out.print("* ");
                        else
                            System.out.print("  ");
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "W":

                    //Printing pattern for 'W'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        System.out.print("* ");
                        for (int i = 2; i <= 4; i++) {
                            if (j == 3) {
                                if (i == 3)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            } else if (j == 4) {
                                if (i != 3)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            } else
                                System.out.print("  ");
                        }
                        System.out.print("* ");
                        System.out.println();

                    }
                    System.out.println();
                    break;


                case "X":

                    //Printing pattern for 'X'using for loops.

                    int k = 5;
                    for (int j = 0; j < k; j++) {
                        for (int i = 0; i < k; i++) {
                            if (j == i || i == k - j - 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                case "Y":

                    //Printing pattern for 'Y'using for loops.

                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 5; i++) {
                            if (j == 1) {
                                if ((i == 1) || (i == 5))
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            } else if (j == 2) {
                                if ((i == 2) || (i == 4))
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            } else {
                                if (i == 3)
                                    System.out.print("* ");
                                else
                                    System.out.print("  ");
                            }
                        }
                        System.out.println();

                    }
                    System.out.println();
                    break;


                case "Z":

                    //Printing pattern for 'Z'using for loops.


                    for (int j = 1; j <= 5; j++) {
                        for (int i = 1; i <= 5; i++) {
                            if ((j == 1 || j == 5) || (j >= 1 && i == 6 - j)) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;


                    //Default case if Entered string doesn't match the above cases.

                default:

                    System.out.println("Invalid Choice!");
		    break;

                    //case to exit program.

                case "0":
                    System.out.println("Thanks! Successfully exiting the Program.");
                    end = true;



            }//end of switch case.

        }//end of while loop.


    }//end of main function.

}//end of class.