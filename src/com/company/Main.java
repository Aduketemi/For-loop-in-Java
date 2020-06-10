package com.company;

public class Main {

    public static void main(String[] args) {
        /*Loops are used to create programs that should keep executing till a condition is met.
         * There are three(3) types of loops in Java
         * 1. for loops
         * 2. do while
         * 3. while
         *
         * for loops:
         * for(initialization; condition; increment/decrement){
         * statement(s)
         * }
         *
         * when a for loop program is written, the compiler goes into the condition, and keeps executing the program till the condition is met
         *
         * */
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }

        int ans = 0;
        for (int j = 1; j <= 10; j++) {
            ans += j;
        }
        System.out.println(ans);

        /*Infinite Loops
        * Infinite loops are loops that runs forever, excepte we kill the program, they are mostly
        * made by writing a condition which can never be met.
        * */
        //for example
        //you can uncomment this to run by pressing ctrl + / after highlighting
//        for (int i=0; i > -4; i++ ){
//            System.out.println("Hy");
//        }
        /*So the expression above is going to print  "Hy" forever because the condition is going to be greater than minus 4 as long as we keep incrementing
        * */
        //another basic example of for loop
        //you can uncomment this to run by pressing ctrl + / after highlighting
//        for (; ; ) {
//            System.out.println("Hello world");
//        }
        /*
        * Enhanced For loop
        * Enhanced for loop is useful when you want to iterate Array/Collections, it is easy to write and understand.
        * Let’s take the same example that we have written above and rewrite it using enhanced for loop.*/
        //comment the above codes to run this
        String scastudents[]={"Tilda","Nikki", "ChelseaQuin", "Love", "Mary"};
        for (String students : scastudents) {
            System.out.println(students);
        }
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
//Score: 10