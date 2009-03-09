/*
 * (Simulação de supermercado) Escreva um programa que simula uma fila de caixa 
 * em um supermercado. A fila é um objeto fila. Os clientes, (isto é, os objetos
 * cliente) chegam em intervalos aleatórios inteiros de 1 a 4 minutos. Além
 * disso, cada cliente é atendido em intervalos aleatórios inteiros de 1 a 4
 * minutos. Obviamente, as taxas precisam ser equilibradas. Se a taxa média de
 * chagada for maior que a taxa média de atendimento, a fila crescerá
 * infinitamente. Mesmo com taxas 'equilibradas', a aleatoriedade ainda pode
 * provocar filas longas. Execute a simulação de supermercado para um dia de 12
 * horas (720 minutos) utilizando o seguinte algoritmo:
 *
 *      a) Escolha um inteiro aleatório entre 1 e 4 para determinar o minuto em
 *         que o primeiro cliente chega.
 *      b) Na hora da chegada do primeiro cliente, faça o seguinte:
 *              Determine o tempo de atendimento do serviço ao cliente (inteiro
 *                  aleatório de 1 a 4).
 *              Comece atendendo ao cliente.
 *              Agende a hora de chegada do próximo cliente (inteiro aleatório
 *                  de 1 a 4 adicionado à hora atual).
 *      c) Para cada minuto do dia, considere o seguinte:
 *              Se o próximo cliente chegar, prosseguir da seguinte maneira:
 *              Expresse isso.
 *              Coloque o cliente na fila.
 *              Agende a hora de chegada do próximo cliente.
 *
 * Se o atendimento do último cliente tiver sido concluído, faça o seguinte:
 *      Expresse isso.
 *      Tire da fila o próximo cliente a ser atendido.
 *      Determine o tempo de atendimento do cliente (inteiro aleatório de 1 a 4
 *          adicionado à hora atual.
 *
 * Agora execute sua simulação para 720 minutos e responda a cada um dos
 * seguintes:
 *      a) Qual é o número máximo de clientes na fila a qualquer hora?
 *      b) Qual é a espera mais longa que qualquer cliente experimenta?
 *      c) O que acontece se o intervalo de chegada é alterado de 1 a 4 minutos
 *          para 1 a 3 minutos?
 */

package ch17.Exer17_15;

public class Exer17_15 {

}
