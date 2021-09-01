package com.revature;

import java.util.Scanner;

public class HelloWorld {
/**
 * this is java documentation
 * @param args
 */
	
	  public static	Scanner scan= new Scanner(System.in);

	public static void main(String[] args) {
		 TestClass test=new TestClass();
		
		//String phrase="My favorite meal";
		//String result= test.acronym( phrase);
	//	System.out.println(result);
		 System.out.println("enter a word");
		 String word=scan.next();
		int total= getScrabbleScore(word);
		 System.out.println(total);
		
		// System.out.println("enter your phone number");
		// String phone=scan.next();
		//String thisphone= cleanPhoneNumber(phone);
	//	System.out.println(thisphone);
		 
		System.out.println("enter a number");
		System.out.println(isArmstrongNumber(scan.nextInt()));
	}
	
	
	
	public static boolean isArmstrongNumber(int input) {
		Integer num=new Integer(input);//convert to wrapperclass in order to use object method
		String cant=num.toString(); //convert to string to be able to iterate over a array
		
		int cantOfdigist=cant.length();// getting the length of th number
		int newnumber=0;
		boolean isArmstrong=false;
		for (int i = 0; i < cant.length(); i++) {
			newnumber=cant.codePointAt(i)*cantOfdigist;
			
			
		}
		if (input==newnumber) {
			isArmstrong=true;
		}else { isArmstrong=false;}
	
		return isArmstrong;
	}

	
	
	
	
	
	
	
	/*For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253*/
	
	public  static String cleanPhoneNumber(String string) {
		
		String phone="";
		if ((string.length()<=16)||( string.length()>10)) {
		for (int i = 0; i < string.length(); i++) {
			
			if ((string.charAt(i)=='+')||(string.charAt(i)==' ')||(string.charAt(i)=='-')||(string.charAt(i)=='.')|(string.charAt(i)=='1')) {
			
				
				
				phone=string.replace(string.charAt(i),' ');
				
			}
			
		}
		}
		return phone;
	}
	
	 
		public  static int getScrabbleScore(String string) {
          int cont=0;
           
          for (int i = 0; i <string.length(); i++) {
        	  
        	  if ((string.charAt(i)=='A')||(string.charAt(i)=='a')||(string.charAt(i)=='E')||(string.charAt(i)=='e')||(string.charAt(i)=='I')
        			  ||(string.charAt(i)=='i')||(string.charAt(i)=='O')||(string.charAt(i)=='o')||(string.charAt(i)=='U')||(string.charAt(i)=='u')
        			  ||(string.charAt(i)=='L')||(string.charAt(i)=='l')||(string.charAt(i)=='n')||(string.charAt(i)=='N')||(string.charAt(i)=='R')
        			  ||(string.charAt(i)=='r')||(string.charAt(i)=='S')||(string.charAt(i)=='s')||(string.charAt(i)=='t')||(string.charAt(i)=='T')) {
        		    cont++;
				
			} else {
				if ((string.charAt(i)=='D')||(string.charAt(i)=='d')||(string.charAt(i)=='G')||(string.charAt(i)=='g')) {
					cont=cont+2;
					
				}

			}if ((string.charAt(i)=='B')||(string.charAt(i)=='b')||(string.charAt(i)=='C')||(string.charAt(i)=='c')||(string.charAt(i)=='M')
					||(string.charAt(i)=='m')||(string.charAt(i)=='P')||(string.charAt(i)=='p')) {
				cont=cont+3;
				
			} if ((string.charAt(i)=='F')||(string.charAt(i)=='f')||(string.charAt(i)=='H')||(string.charAt(i)=='h')||(string.charAt(i)=='V')
					||(string.charAt(i)=='v')||(string.charAt(i)=='W')||(string.charAt(i)=='w')||(string.charAt(i)=='Y')||(string.charAt(i)=='y')) {
				cont=cont+4;
				
			}if ((string.charAt(i)=='K')||(string.charAt(i)=='K')) {
				cont=cont+5;
				
			}if ((string.charAt(i)=='J')||(string.charAt(i)=='j')||(string.charAt(i)=='X')||(string.charAt(i)=='x')) {
               cont=cont+8;
			}if ((string.charAt(i)=='Q')||(string.charAt(i)=='q')||(string.charAt(i)=='Z')||(string.charAt(i)=='z')) {
				cont=cont+10;
				
			}
          
				
			}
          return cont;
	

}

// single line comment
/* this is a multi line comment */
/*
 * System.out.println("this is my new World from the ADE"); // TODO
 * Auto-generated method stub Scanner scan= new Scanner(System.in);
 * System.out.println("Entrer a String"); String word1=scan.nextLine();
 * System.out.println(reverse(word1));
 * 
 * 
 * } public static String reverse(String word) { char[]
 * reverseWord=word.toCharArray(); String a=""; for (int i =
 * reverseWord.length-1; i >=0; i--) {
 * 
 * a+=reverseWord[i]; } return a ;
 */

/*
 * try { System.out.println("Enter a number"); int x=scan.nextInt();
 * 
 * 
 * int y=scan.nextInt();
 * 
 * int xz=x/y; System.out.println(xz); } catch ( ArithmeticException e) {
 * System.out.println(" you cannot divide by 0");
 * 
 * // TODO: handle exception }catch (InputMismatchException e) { // TODO: handle
 * exception System.out.println("enter a valid number"+ e.getMessage()); }
 */

}
