//Exercício 15.12: MysteryTest.java

package ch15.Exer15_12;

public class MysteryTest {
    public static void main ( String args[] ){
        MysteryClass mysteryObject = new MysteryClass();

        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int result = mysteryObject.mystery( array, args.length );

        System.out.printf( "Result is: %d\n", result );
    } // fim do método main
} // fim da classe MysteryClass
