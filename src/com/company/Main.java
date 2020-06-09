package com.company;

public class Main {

    public static void main(String[] args) {
	for(int i = 1; i <= 200; i++){
	    System.out.println(i);
    }
    int ans = 0;
	for(int j = 1; j <= 10; j++){
	    ans += j;
    }System.out.println(ans);
    }
}
/*
1. What is instance variable: instance variable are variables declared inside a class
and its value is specific to the instance. it is declared outside a method and
that is what differentiates it from a local variable.

2. What is a static field, and another name for a static field: a static field
also known as a static class variable is accessible to the class and everything that can see the class.
It does not require for the class to be instantiated. All the instances of the class
will have access to the static variable.

3. What are the 8 primitive data types supported by the Java language:
i.   boolean data type
ii.  byte data type
iii. char data type
iv.  short data type
v.   int data type
vi.  long data type
vii. float data type
viii.double data type
 */