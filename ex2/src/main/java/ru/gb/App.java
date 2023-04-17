package ru.gb;

/**
 * Если необходимо, исправьте данный код
 *  try {
 *  int d = 0;
 *  double catchedRes1 = intArray[8] / d;
 *  System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *  System.out.println("Catching exception: " + e);
 * }
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            int d = 0;
            int[] intArray = { 8, 7, 3, 6, 5, 1, 4, 2, 9 };
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
}
