
import java.util.Scanner;
public class p1_15s_vb97 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		// below ask yes or no question
		
		System.out.println("Do you want to enter a string?y Please enter \"y\" for yes and \"n \" for no ");
		String str = scan.nextLine();
		//if 'y' move forward to DFA
		if(str.compareTo("y")==0){
			System.out.println("Please input the string to test the program!");
			String input = scan.nextLine();
			System.out.println("You entered: " + input);
			DFA(input);
		}
		//else close it
		else if(str.compareTo("n")==0){
			System.out.println("Program is terminated!");
		}
	
		scan.close();
		
	}
	
	public static void DFA(String input){
		String[] args = {};

		
		//index will be used to get character of the string input from that location.
		int index=0;
		int length= input.length();
		
		//initial state is q1
		System.out.println("State: q1");
		System.out.println();
		
		//if next char is w go to state q2
		if (index>=input.length()){
			System.out.println("String is REJECTED!");
			main(args);
			
		}
		if(input.charAt(index)=='w'){
			System.out.println("Character processed: " + input.charAt(index));
			//index will be increased everytime so it ready for next character
			index++;
			System.out.println("State: q2");
			System.out.println();
			
			if (index>=input.length()){
				System.out.println("String is REJECTED!");
				main(args);
				
			}
			//if next char is w go to state q3.
			if(input.charAt(index)=='w'){
				System.out.println("Character processed: " + input.charAt(index));
				index++;
				System.out.println("State: q3");
				System.out.println();

				if (index>=input.length()){
					System.out.println("String is REJECTED!");
					main(args);
					
				}
				
				//For next 5 if statement it is similar to the logic described in previous comment
				if(input.charAt(index)=='w'){
					System.out.println("Character processed: " + input.charAt(index));
					index++;
					System.out.println("State: q4");
					System.out.println();

					if (index>=input.length()){
						System.out.println("String is REJECTED!");
						main(args);
						
					}
					
					if(input.charAt(index)=='.'){
						System.out.println("Character processed: " + input.charAt(index));
						index++;
						System.out.println("State q5");
						System.out.println();
						
						if (index>=input.length()){
							System.out.println("String is REJECTED!");
							main(args);
							
						}
						
						if(input.charAt(index)=='c'){
							System.out.println("Character processed: " + input.charAt(index));
							index++;
							System.out.println("State q6");
							System.out.println();
							
							if (index>=input.length()){
								System.out.println("String is REJECTED!");
								main(args);
								
							}
							
							
							if(input.charAt(index)=='o'){
								System.out.println("Character processed: " + input.charAt(index));
								index++;
								System.out.println("State q7");
								System.out.println();
								
								if (index>=input.length()){
									System.out.println("String is REJECTED!");
									main(args);
									
								}
								
								if(input.charAt(index)=='m'){
									System.out.println("Character processed: " + input.charAt(index));
									index++;
									System.out.println("State q11");
									System.out.println();
									
									
									//Since this is made accepting state. If at this point character is the last character
									//in the string then we accept it.
									if(index == input.length()){
										System.out.println("String is Accepted!");
										main(args);
									}
									//We are in state 11. If character is "." then call fromQ9 function which handles
									//everything from state q9. Go down to function for more detail.
									else if (input.charAt(index)=='.'){
										fromQ9(input, index);
									}
									
									//Similarly,if character is lower case letter then call fromQ8 function which handles
									//everything from state q8
									else if (Character.isLowerCase(input.charAt(index))){
										fromQ8(input,index);										
									}
									// else there is no way to proceed so we reject here
									else {
										System.out.println("String is Rejected!");
										main(args);
									}
									
								}
								
								//We are at state q7. If character is lower and not m then call fromQ8
								else if (Character.isLowerCase(input.charAt(index))&&input.charAt(index)!='m' ){
									fromQ8(input,index);
								}
								
								else if (input.charAt(index)=='.' ){
									System.out.println("Character processed: " + input.charAt(index));
									index++;
									System.out.println("State q21");
									System.out.println();
									if(input.charAt(index)=='c'){
										fromQ18(input, index);
									}
									
									// At this point, we are n state q21
									else if (input.charAt(index)=='j' ){
										System.out.println("Character processed: " + input.charAt(index));
										index++;
										System.out.println("State q22");
										System.out.println();
										// At this point, we are n state q22
										if (index>=input.length()){
											System.out.println("String is REJECTED!");
											main(args);
											
										}
										if (input.charAt(index)=='p' ){
											System.out.println("Character processed: " + input.charAt(index));
											index++;
											System.out.println("State q23");
											System.out.println();
										}
										//since nothing is going out from accepting state. We accept if if we reached 
										//end of the string. Else we reject string
										if(index == input.length()){
											System.out.println("String is Accepted!");
											main(args);

										}
										else{
											System.out.println("String is REJECTED!");
											main(args);
										}
										
									}
									// next two else statement are from q21 and q7 respectively. Since there is no other
									//choices(paths) we reject it
								
									else{
										System.out.println("String is REJECTED!");
										main(args);
									}
									
								}
								else{
									System.out.println("String is REJECTED!");
									main(args);
								}

							}
							else if (Character.isLowerCase(input.charAt(index))&&input.charAt(index)!='o' ){
								fromQ8(input,index);							
							}
							// from state q6 if it after reads "." then go to q17
							else if (input.charAt(index)=='.' ){
								System.out.println("Character processed: " + input.charAt(index));
								index++;
								System.out.println("State q17");
								System.out.println();
								
								if (index>=input.length()){
									System.out.println("String is REJECTED!");
									main(args);
									
								}
								if(input.charAt(index)=='c'){
									fromQ18(input, index);
								}
								//next few else if statements are all going to q8 from q1, q2,q3,q4, and q5. They all go to q8
								//please look at DFA to see it 
								
								// next few else statements prints REJECTED because there will be no other choice of 
								//accepting string
								else{
									System.out.println("String is REJECTED!");
									main(args);
								}
								
							}
							else{
								System.out.println("String is REJECTED!");
								main(args);
							}
						}
						else if (Character.isLowerCase(input.charAt(index))&&input.charAt(index)!='c' ){
							fromQ8(input,index);
						}	
						else{
							System.out.println("String is REJECTED!");
							main(args);
						}
					}
					else if (Character.isLowerCase(input.charAt(index)) ){
						fromQ8(input,index);

					}
					else{
						System.out.println("String is REJECTED!");
						main(args);
					}
				}
				else if (Character.isLowerCase(input.charAt(index))&&input.charAt(index)!='w' ){
					fromQ8(input,index);					
				}
				else if (input.charAt(index)=='.' ){
					fromQ9(input,index);
					
				}
				else{
					System.out.println("String is REJECTED!");
					main(args);
				}
			}
			else if (Character.isLowerCase(input.charAt(index))&&input.charAt(index)!='w' ){
				fromQ8(input,index);				
			}
			else if (input.charAt(index)=='.' ){
				fromQ9(input,index);			
			}
			else{
				System.out.println("String is REJECTED!");
				main(args);
			}
			
		}
		else if (Character.isLowerCase(input.charAt(index))&&input.charAt(index)!='w' ){
			fromQ8(input,index);	
		}	
		else{
			System.out.println("String is REJECTED!");
			main(args);
		}
	}
	
	
	
	//This functions handle everything from and after state q8
	public static void fromQ8(String input, int index){
		String[] args = {};

		System.out.println("Character processed: " + input.charAt(index));
		index++;
		System.out.println("State q8");
		System.out.println();
		
		if (index >= input.length()){
			System.out.println("String is REJECTED!");
			main(args);
			
		}
		//while loop is for if next character is lower case alphabet so it goes back to q8. See the diagram for clear
		//understanding
		while (index<input.length() && Character.isLowerCase(input.charAt(index))){
			System.out.println("in method 8");

			System.out.println("Character processed: " + input.charAt(index));
			index++;
			System.out.println("State q8");
			System.out.println();

		}
		if (index>=input.length()){
			System.out.println("String is REJECTED!");
			main(args);
			
		}
		// if "." then call q9
		if (input.charAt(index)=='.' ){
			fromQ9(input, index);
			
		}
		else{
			System.out.println("String is REJECTED!");
			main(args);
		}
		
	}
	//This functions handle everything from and after state q9
	public static void fromQ9(String input, int index){
		String[] args = {};
		System.out.println("Character processed: " + input.charAt(index));
		index++;
		System.out.println("State q9");
		System.out.println();
		
		if (index>=input.length()){
			System.out.println("String is REJECTED!");
			main(args);
			
		}
		
		//Logic below is the same that was used in DFA method.
		if (input.charAt(index)=='c' ){
			System.out.println("Character processed: " + input.charAt(index));
			index++;
			System.out.println("State q10");
			System.out.println();
			
			if (index>=input.length()){
				System.out.println("String is REJECTED!");
				main(args);
				
			}
			
			if (input.charAt(index)=='o' ){
				System.out.println("Character processed: " + input.charAt(index));
				index++;
				System.out.println("State q12");
				System.out.println();
				
				if (index>=input.length()){
					System.out.println("String is REJECTED!");
					main(args);
					
				}
				else if (input.charAt(index)=='m' ){
					System.out.println("Character processed: " + input.charAt(index));
					index++;
					System.out.println("State q13");
					System.out.println();
					
					if(index == input.length()){
						System.out.println("String is Accepted!");
						main(args);
					}
					else{
						System.out.println("String is REJECTED!");
						main(args);
					}
					
				}
				else if (input.charAt(index)=='.' ){
					fromQ14(input,index);
				}
				//if there is no other choices then string can be rejected
				else{
					System.out.println("String is REJECTED!");
					main(args);
				}
			}
			else{
				System.out.println("String is REJECTED!");
				main(args);
			}
			
		}
		else{
			System.out.println("String is REJECTED!");
			main(args);
		}
		
	}
	
	//This functions handle everything from and after state q14. It has same logic as q9.
	public static void fromQ14(String input, int index){
		String[] args = {};
		System.out.println("Character processed: " + input.charAt(index));
		index++;
		System.out.println("State q14");
		System.out.println();
		
		
		if (index>=input.length()){
			System.out.println("String is REJECTED!");
			main(args);
			
		}
		
		if (input.charAt(index)=='j' ){
			System.out.println("Character processed: " + input.charAt(index));
			index++;
			System.out.println("State q15");
			System.out.println();
			
			if (index>=input.length()){
				System.out.println("String is REJECTED!");
				main(args);
				
			}
			if (input.charAt(index)=='p' ){
				System.out.println("Character processed: " + input.charAt(index));
				index++;
				System.out.println("State q16");
				System.out.println();
				
				if(index == input.length()){
					System.out.println("String is Accepted!");
					main(args);
				}
				else{
					System.out.println("String is REJECTED!");
					main(args);
				}
					
			}
		}
		else{
			System.out.println("String is REJECTED!");
			main(args);
		}
		
	}
	//This functions handle everything from and after state q18. It has same logic as q9.
	public static void fromQ18(String input, int index){
		String[] args = {};
		System.out.println("Character processed: " + input.charAt(index));
		index++;
		System.out.println("State q18");
		System.out.println();
		if (index>=input.length()){
			System.out.println("String is REJECTED!");
			main(args);
			
		}
		if (input.charAt(index)=='o' ){
			System.out.println("Character processed: " + input.charAt(index));
			index++;
			System.out.println("State q19");
			System.out.println();
			
			if (index>=input.length()){
				System.out.println("String is REJECTED!");
				main(args);
				
			}

			//from q19 there will be two edges for 'm' and '.'
			if (input.charAt(index)=='m' ){
				System.out.println("Character processed: " + input.charAt(index));
				index++;
				System.out.println("State q20");
				System.out.println();
				//q20 i accepting state
				if(index == input.length()){
					System.out.println("String is Accepted!");
					main(args);
				}
				else{
					System.out.println("String is REJECTED!");
					main(args);
				}
			}
			// At q19. if char is '.' then call q14 since it can end in .jp. See the diagram right side.
			else if (input.charAt(index)=='.' ){
				fromQ14(input, index);
				
			}
			else{
				System.out.println("String is REJECTED!");
				main(args);
			}
			
		}
		else{
			System.out.println("String is REJECTED!");
			main(args);
		}
	}

}
	
