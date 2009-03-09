/*
 * (Simulação: a tartaruga e a lebre) Neste problema, você recriará a clássica
 * corrida da tartaruga e da lebre. Você utilizará geração de números aleatórios
 * para desenvolver uma simulação desse memorável evento.
 *      Nossos competidores começam a corrida no quadrado 1 de 70 quadrados. Cada
 * quadrado representa uma possível posição ao longo do percurso da competição.
 * A linha de chegada está no quadrado 70. O primeiro competidor a alcançar ou
 * passar o quadrado 70 é recompensado com um cesto de cenouras frescas e alface.
 * O percurso envolve subir uma montanha escorregadia, então ocasionalmente os
 * competidores perdem terreno.
 *      Um relógio emite um tique por segundo. A cada tique do relógio, seu
 * aplicativo deve ajustar a posição dos animais de acordo com as regras na
 * Figura 7.34. Utilize variáveis para monitorar a posição dos animais (isto é,
 * os números de posição são 1-70). Inicie cada animal na posição 1 (a 'partida').
 * Se um animal escorregar para a esquerda do quadrado 1, mova-o novamente para
 * o quadrado 1.
 *      Gere as percentagens na Figura 7.34 produzindo um inteiro aleatório i no
 * intervalo 1 <= i <= 10. Para a tartaruga, realize uma 'caminhada rápida'
 * quando 1 <= i <= 5, um 'escorregão' quando 6 <= i <= 7 ou uma 'caminhada lenta'
 * quando 8 <= i <= 10. Utilize uma técnica semelhante para mover a lebre.
 *      Comece a corrida exibindo
 *                      BANG !!!!!
 *                      A corrida começou !!!!!
 *      Então, para cada tique do relógio (istó é, para cada repetição de um loop),
 * exiba uma linha de 70 posições mostrando a letra T na posição da tartaruga e
 * a letra L na posição da lebre. Ocasionalmente os competidores aterrisarão no
 * mesmo quadrado. Nesse caso, a tartaruga morde a lebre e seu aplicativo deve
 * exibir AI!!! começando nessa posição. Todas as outras posições de saída
 * diferentes de T, L ou AI!!! (no caso de um empate) devem estar em branco.
 *      Depois de cada linha a ser exibida, teste se o animal alcançou o quadrado
 * 70. Se tiver alcançado, exiba o vencedor e termine a aplicação. Se a tartaruga
 * ganhar, exiba A TARTARUGA VENDEU!!!EH!!! Se a lebre ganhar, exiba  A LEBRE GANHOU. OH!
 * Se as duas ganharem na mesma hora, você pode querer favorecer a tartarua
 * (a 'coitadinha') ou pode querer exibir OCORREU UM EMPATE. Se nenhum animal
 * ganhar, realize o loop novamente para simular o próximo tique do relógio. Quando
 * você estiver pronto para executar seu aplicativo, monte um grupo de fãs para
 * observar a corrida. Você se surpreenderá com a empolgação da sua audiência!
 *
 * ANIMAL       Tipo de movimento    Porcentagem do tempo     Movimento Real
 * Tartaruga    Caminhada rápida            50%               3 quadrados à direita
 *              Escorregão                  20%               6 quadrados à esquerda
 *              Caminhada lenta             30%               1 quadrados à direita
 *
 * Lebre        Dormir                      20%               Nenhum movimento
 *              Salto grande                20%               9 quadrados à direita
 *              Escorregão grande           10%               12 quadrados à esquerda
 *              Salto pequeno               30%               1 quadrados à direita
 *              Escorregão pequeno          20%               2 quadrados à esquerda
 * Figura 7.34 Regras para ajustar as posições da tartaruga e da lebre
 *
 *      Mais adiante no livro, introduzimos várias capacidades do Java, imagens,
 * animação, som e multothreading. À medida que estudar esses recursos, você pode
 * se divertir aprimorando sua simulação da competição entre a lebre e a tartaruga.
 */

package ch07.Exer07_28;

public class Exer07_28 {

}
