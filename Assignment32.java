import java.util.Scanner;



public class Assignment32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Write a Java statement to assign the value true to the boolean variable same ,
		when the String variable S1 has the same contents as the String variable S2 ,
		and false otherwise.*/

	String S1,S2;
	
	System.out.println("enter the contents of S1");
	System.out.println("enter the contents of S2");
	Scanner jam=new Scanner(System.in);
	S1= jam.nextLine();
	S2= jam.nextLine();
	boolean same=false;
	
	if(S1.contentEquals(S2)){System.out.println(same=true);}
	else{System.out.println(same);
	
	}

jam.close();
}
	
	
	}

