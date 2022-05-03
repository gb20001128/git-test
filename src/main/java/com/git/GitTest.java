package com.git;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("Hello Git!");
        System.out.println("Hello Git2!");
        System.out.println("Hello Git3!");
        System.out.println("Hello Git4!");
        System.out.println("master Test");
        System.out.println("hot-fix Test");
        System.out.println("push Test");
        System.out.println("pull Test");
public class Test {

	public static void main(String[] args) {
		
		Test.Inner1 test1=new Test().new Inner1 ();
		Test.Inner2 test2=new Test.Inner2();
		System.out.println(test1.fun());
		System.out.println(test2.fun());
		
		
		Op opp=new Op(){
			public void opp() {
				;
			}
		};
		
		
	}
	
	
	static int a=011;
	 int v=100;
	
	 class Inner1{
		int b=10;
		 int v=100;
		int fun() {
		System.out.println(v);
	   System.out.println(Test.this.v);
			return a;
		}
	}
	
	static class Inner2{
		int b=10;
		 
		int fun() {
	System.out.println();
	System.out.println(b);
			return a;
		}
	}

}
    interface Op{
    	void opp();
    }
