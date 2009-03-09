// Exercício 15.12: MysteryClass.java

package ch15.Exer15_12;

public class MysteryClass {
    public int mystery( int array2[], int size){
        if( size == 1 )
            return array2[ 0 ];
        else
            return array2[ size - 1 ] + mystery( array2, size - 1 );
    } // fim do método mystery
} // fim da classe Mystery
