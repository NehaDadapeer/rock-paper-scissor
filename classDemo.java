package demo2;

import java.util.Random;

import java.util.Scanner;

public class classDemo {
	public static void main(String[]args) {
		
		System.out.println("**************************************************************");
		System.out.println("*         ROCK PAPER SCISSORS          ");
		System.out.println("**************************************************************");
int a=10;
int H=0;
int AI=0;
int no=0;
while(a>0) {
	display();
	System.out.println("Enter your option:");
	Scanner s=new Scanner(System.in); 
    String c=s.next();
	Random r=new Random();
	if(no>5) {
		System.out.println("Final score:");
		System.out.println("Human:"+H+"| AI:"+AI);
		System.exit(0);
	}
	if(c.equals("R")) {
		int comp=10+r.nextInt(3)+1;
		if(comp==11) {
			System.out.println("You:Rock");
			System.out.println("AI:Rock");
			System.out.println("Result:Draw");
			no=no+1;
			H=H+1;
			AI=AI+1;
			System.out.println("Human:"+H+"| AI:"+AI);
		}else if(comp==12) {
			System.out.println("You:Rock");
			System.out.println("AI:Paper");
			System.out.println("Result:Lost");
			no=no+1;
			H=H+0;
			AI=AI+1;
			System.out.println("Human:"+H+"| AI:"+AI);
		}else if(comp==13) {
			System.out.println("You:Rock");
			System.out.println("AI:scissor");
			System.out.println("Result:win");
			no=no+1;
			H=H+0;
			AI=AI+0;
			System.out.println("Human:"+H+"| AI:"+AI);

		}
			
		}
	if(c.equals("P")) {
		int comp=20+r.nextInt(3)+1;
		if(comp==21) {
			System.out.println("you:paper");
			System.out.println("AI:Rock");
			System.out.println("Result:WIN");
			no=no+1;
			H=H+1;
			AI=AI+0;
			System.out.println("Human:"+H+"| AI:"+AI);
		}
		else if(comp==22) {
			System.out.println("you:Paper");
			System.out.println("AI:Paper");
			System.out.println("Result:DRAW");
			no=no+1;
			H=H+1;
			AI=AI+1;
			System.out.println("Human:"+H+"| AI:"+AI);
		}
		else if(comp==23) {
			System.out.println("you:Paper");
			System.out.println("AI:Scissor");
			System.out.println("Result:LOST");
			no=no+1;
			H=H+1;
			AI=AI+1;
			System.out.println("Human:"+H+"| AI:"+AI);
		}
	}
	if(c.equals("S")) {
		int comp=30+r.nextInt(3)+1;
		if(comp==31) {
			System.out.println("you:Scissor");
			System.out.println("AI:Rock");
			System.out.println("Result:LOST");
			no=no+1;
			H=H+1;
			AI=AI+1;
			System.out.println("Human:"+H+"| AI:"+AI);
		}
		else if(comp==32) {
			System.out.println("you:Scissor");
			System.out.println("AI:Paper");
			System.out.println("Result:WIN");
			no=no+1;
			H=H+0;
			AI=AI+0;
			System.out.println("Human:"+H+"| AI:"+AI);
		}
		else if(comp==33) {
			System.out.println("you:Scissor");
			System.out.println("AI:Scissor");
			System.out.println("Result:DRAW");
			no=no+1;
			H=H+1;
			AI=AI+1;
			System.out.println("Human:"+H+"| AI:"+AI);
		}}
}}
	public static void display() {
		System.out.println("1.Rock:R");
		System.out.println("2.Paper:P");
		System.out.println("3.scissor:S");
		System.out.println("********************************");
		// TODO Auto-generated method stub
		
	}
}