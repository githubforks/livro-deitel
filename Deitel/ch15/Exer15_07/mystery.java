/*
 * O que faz o seguinte código ?
 */

package ch15.Exer15_07;

public class mystery {

    public int mystery(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a + mystery(a, b - 1);
        }
    } // fim do método mystery
}