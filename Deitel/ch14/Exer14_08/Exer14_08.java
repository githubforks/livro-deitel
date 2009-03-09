/*
 * (Correspondência de arquivos) O Exercício 14.3 de revisão pede que o leitor
 * escreva uma série de instruções únicas. De fato, essas instruções formar o
 * núcleo de um importante tipo de programa processador de arquivos, a saber,
 * um programa de correspondência de arquivo (file-matching-program). Em
 * processamento de dados comercial, é comum ter vários arquivos em cada sistema
 * de aplicativo. Em um sistema de contas a receber, por exemplo, há em geral um
 * arquivo-mestre contendo informações detalhadas sobre cada cliente, como seu
 * nome, endereço, número de telefone, saldo, limite de crédito, termos de
 * desconto, arranjos de contrato e possivelmente um histórico condensado de
 * compras recentes e pagamentos de conta.
 *      À medida que as transações ocorrem (isto é, são feitas vendas e
 * pagamentos chegam pelo correio), as informações sobre elas são inseridas em
 * um arquivo. No fim de cada período de negócio (um mês para algumas empresas,
 * uma semana para outras e um dia em alguns casos), o arquivo de transações
 * (chamado "trans.txt") é aplicado ao arquivo-mestre (chamado "oldmast.txt")
 * para atualizar o registro de compras e pagamento e pagamento de cada conta.
 * Durante uma atualização, o arquivo-mestre é regravado como o arquivo
 * "newmast.txt", que é então utilizado no fim do próximo período de negócio
 * para começar o processo de atualização novamente.
 *      Programas de correspondência de arquivo devem lidar com certos problemas
 * que não surgem em programas de um único arquivo. Por exemplo, nem sempre
 * ocorre uma correspondência. Se um cliente no arquivo-mestre não fez nenhuma
 * compra ou pagamento à vista no período de negócio atual, nenhum registro para
 * esse cliente aparecerá no arquivo de transações. De maneira semelhante, um
 * cliente que fez alguma compra ou pagamento em finheiro poderia apenas ter
 * mudado para essa comunidade e a empresa pode não ter tido uma oportunidade de
 * criar um registro mestre para esse cliente.
 *      Escreva um programa completo de correspondência de arquivos de contas a
 * receber. Utilize o número de conta em cada arquivo como a chave de registro
 * para propósitos de correspondência. Assima que cada arquivo é um arquivo é um
 * arquivo de texto seqüencial com registros armazenados em ordem de número de
 * conta crescente.
 *
 *      a) Defina a classe TransactionRecord. Os objetos dessa classe contêm um
 * número de conta e o valor monetário para a transação. Forneça métodos para
 * modificar e recuperar esses valores monetários.
 *      b) Modifique a classe AccountRecord na Figura 14.6 para incluir o método
 * combine, que recebe um objeto AccountRecord e o valor daquantidade monetária
 * do objeto TransationRecord.
 *      c) Escreva um programa para criar dados a fim de testar o programa.
 * Utilize os dados da conta de exemplo das figuras 14.39 e 14.40. Execute o
 * programa para criar os arquivos trans.txt e oldmast.txt a serem utilizados
 * pelo seu programa de correspondência de arquivos.
 *      d) Crie a classe FileMatch para realizar a funcionalidade de
 * correspondência de arquivos. A classe deve conter métodos que lêem
 * oldmast.txt e trans.txt. Quando uma correspondência ocorre (isto é, registros
 * com o mesmo número de conta aparecem tanto no arquivo-mestre como no arquivo
 * de transações), adicione o valor monetário no registro de transação ao saldo
 * atual no registro-mestre e grave o registro rm "newmast.txt". (Suponha que
 * compras são indicadas por valores monetários positivos no arquivo de
 * transações e os pagamentos por valores monetários negativos.) Quando houver
 * um registro-mestre para uma conta particular, mas nenhum registro de
 * transação correspondente, simplesmente grave o registro-mestre em
 * "newmas.txt". Se houver um registro de transação, mas nenhum registro-mestre
 * correspondente, imprima a mensagem "Unmatched transaction record for account
 * number..." [Registro de transação não-correspondido para o número de conta]
 * em um arquivo de log (preencha o número da conta a partir do registro de
 * transação). O arquivo de log deve ser um arquivo de texto chamado "log.txt".
 *
 *          Arquivo-mestre
 *          Número de conta         Nome            Saldo
 *          100                     Alan Jones      348.17
 *          300                     Mary Smith      27.19
 *          500                     Sam Sharp       0.00
 *          700                     Suzy Green      -14.22
 *          Figura 14.39 Dados de exemplo para o arquivo mestre
 *
 *          Arquivo de transações
 *          Número de conta         Quantia da transação
 *          100                     27.14
 *          300                     62.11
 *          400                     100.56
 *          900                     82.17
 *          Figura 14.40 Dados de exemplo para o arquivo de transações.
 */

package ch14.Exer14_08;

public class Exer14_08 {

}
