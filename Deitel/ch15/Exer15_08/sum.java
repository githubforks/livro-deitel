/*
 * Localize o(s) erro(s) no seguinte método recursivo e explique como
 * corrigí-lo(s). Esse método deve localizar a soma dos calores de 0 a n.
 */

package ch15.Exer15_08;

public class sum {

    public int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sum(n - 1);
        }
    } // fim do método sum
}