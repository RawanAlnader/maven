package com.devops.maven;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        int num1=2,num2=4;
        System.out.println( num1+"+"+num2+"="+sum(num1,num2) );
    }

	public int calculateSomething() {
		return 0;
	}
	public static int sum(int a, int b){return a+b;}
}

