package lesson02_variables;

public class Variables {

    public static void main(String[] args){

        /*
        variable = a reusable container for a value
                   a variable behaves as if it was the value it contains

        Two categories of variables
        --------------------------
        Primitive = simple value stored directly in memory (stack)
        Reference = memory address (stack) that points to the (heap)

        If I gave you a primitive variable that would be the same as me handing you $10
        But if I give you a reference variable that would be the same as me giving you an I.O.U that says I owe you $10,
        but the actual money I owe you is at the bank
         */

        // Primitive vs Reference
        // ---------     --------
        // int           string
        // double        array
        // char          object
        // boolean

        /*
        Two steps to creating a variable:
        --------------------------
        1. Declaration
        2. Assignment
         */

        int age = 25;
        int year = 2026;
        int quantity = 2;

        double price = 30.99;
        double gpa = 3.1;
        double temperature = 37.5;

        char grade = 'B';
        char symbol = '#';
        char currency = '$';




        System.out.println("The temperature outside is " + temperature + "," + " you have a gpa of " + gpa + " and " + currency + price + " in your account ");
    }
}
