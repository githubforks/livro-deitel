/*
 * (A canção The Twelve Days of Christmas) Escreva um aplicativo que utiliza instruções de
 * repetição switch para imprimir a canção The Twelve Days of Christmas. Uma instrução switch
 * deve ser utilizada para imprimir o dia (isto é, 'First', 'Second' etc.) Uma instrução
 * switch separada deve ser utilizada para imprimir o restante de cada verso. Visite o site da
 * Web www.12days.com/library/carols/12daysofxmas.htm para obter a letra completa da canção.
 * 
 * 						The Twelve days of Christmas
 *
 *						On the first day of Christmas
 *						  my true love sent to me:
 * 						 A Partridge in a Pear Tree
 * 
 * 						On the second day of Christmas
 * 						   my true love sent to me:
 * 							  Two Turtle Doves
 * 						and a Partridge in a Pear Tree
 *
 * 						On the third day of Christmas
 *						   my true love sent to me:
 * 						     Three French Hens
 * 							  Two Turtle Doves
 * 						and a Partridge in a Pear Tree
 *
 * 						On the fourth day of Christmas
 * 						   my true love sent to me:
 * 							  Four Calling Birds
 * 							  Three French Hens
 * 							  Two Turtle Doves
 * 						and a Partridge in a Pear Tree
 * 
 * 						On the fifth day of Christmas
 * 						   my true love sent to me:
 * 							  Five Golden Rings
 * 							  Four Calling Birds
 * 							  Three French Hens
 * 							  Two Turtle Doves
 * 						and a Partridge in a Pear Tree
 * 
 * 						On the sixth day of Christmas
 * 						   my true love sent to me:
 * 							  Six Geese a Laying
 * 							  Five Golden Rings
 * 							  Four Calling Birds
 * 							  Three French Hens
 * 							  Two Turtle Doves
 * 						and a Partridge in a Pear Tree
 * 
 * 						On the seventh day of Christmas
 * 						   my true love sent to me:
 * 							Seven Swans a Swimming
 * 							  Six Geese a Laying
 * 							  Five Golden Rings
 * 							  Four Calling Birds
 * 							  Three French Hens
 * 							  Two Turtle Doves
 * 							  and a Partridge in a Pear Tree
 * 
 * 						On the eighth day of Christmas
 * 							my true love sent to me:
 * 							 Eight Maids a Milking
 * 							 Seven Swans a Swimming
 * 							   Six Geese a Laying
 * 							   Five Golden Rings
 * 							   Four Calling Birds
 * 							   Three French Hens
 * 							   Two Turtle Doves
 * 						and a Partridge in a Pear Tree
 * 
 * 						On the ninth day of Christmas
 * 							my true love sent to me:
 * 							  Nine Ladies Dancing
 * 							  Eight Maids a Milking
 * 							  Seven Swans a Swimming
 * 							  Six Geese a Laying
 * 							  Five Golden Rings
 * 							  Four Calling Birds
 * 							  Three French Hens
 * 							  Two Turtle Doves
 * 						and a Partridge in a Pear Tree
 * 
 * 						On the tenth day of Christmas
 * 							my true love sent to me:
 * 							  Ten Lords a Leaping
 * 							  Nine Ladies Dancing
 * 							  Eight Maids a Milking
 * 							  Seven Swans a Swimming
 * 							  Six Geese a Laying
 * 							  Five Golden Rings
 * 							  Four Calling Birds
 * 							  Three French Hens
 * 							  Two Turtle Doves
 * 						and a Partridge in a Pear Tree
 * 
 * 						On the eleventh day of Christmas
 * 							my true love sent to me:
 * 							  Eleven Pipers Piping
 * 							  Ten Lords a Leaping
 * 							  Nine Ladies Dancing
 * 							  Eight Maids a Milking
 * 							  Seven Swans a Swimming
 * 							  Six Geese a Laying
 * 							  Five Golden Rings
 * 							  Four Calling Birds
 * 							  Three French Hens
 * 							  Two Turtle Doves
 * 						and a Partridge in a Pear Tree
 * 
 * 						On the twelfth day of Christmas
 * 							my true love sent to me:
 * 							  12 Drummers Drumming
 * 							  Eleven Pipers Piping
 * 							  Ten Lords a Leaping
 * 							  Nine Ladies Dancing
 * 							  Eight Maids a Milking
 * 							  Seven Swans a Swimming
 * 							  Six Geese a Laying
 * 							  Five Golden Rings
 * 							  Four Calling Birds
 * 							  Three French Hens
 * 							  Two Turtle Doves
 * 						and a Partridge in a Pear Tree
 */

package ch05.Exer05_29;

public class Exer05_29
{
	public static void main(String[] args)
	{
		System.out.println("The Twelve days of Christmas\n");

		for (int i = 1; i <= 12; i++)
		{
			switch(i)
			{

				case 1: System.out.println("1:\nOn the first day of Christmas");
						break;
				case 2: System.out.println("2:\nOn the second day of Christmas");
						break;
				case 3: System.out.println("3:\nOn the third day of Christmas");
						break;
				case 4: System.out.println("4:\nOn the fourth day of Christmas");
						break;
				case 5: System.out.println("5:\nOn the fifth day of Christmas");
						break;
				case 6: System.out.println("6:\nOn the sixth day of Christmas");
						break;
				case 7: System.out.println("7:\nOn the seventh day of Christmas");
						break;
				case 8: System.out.println("8:\nOn the eighth day of Christmas");
						break;
				case 9: System.out.println("9:\nOn the ninth day of Christmas");
						break;
				case 10: System.out.println("10:\nOn the tenth day of Christmas");
						break;
				case 11: System.out.println("11:\nOn the eleventh day of Christmas");
						break;
				case 12: System.out.println("12:\nOn the twelfth day of Christmas");
						break;
			}
			switch(i){
				case 1:	System.out.println("my true love sent to me:\nA Partridge in a Pear Tree\n");
				break;

				case 2: System.out.println("my true love sent to me:\nTwo Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;

				case 3: System.out.println("my true love sent to me:\nThree French Hens\nTwo Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;

				case 4: System.out.println("my true love sent to me:\nFour Calling Birds\nThree French Hens\nTwo Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;

				case 5: System.out.println("my true love sent to me:\nFive Golden Rings\nFour Calling Birds\nThree French Hens\nTwo Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;

				case 6: System.out.println("my true love sent to me:\nSix Geese a Laying\nFive Golden Rings\nFour Calling Birds\nThree French Hens\nTwo Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;

				case 7: System.out.println("my true love sent to me:\nSeven Swans a Swimming\nSix Geese a Laying\nFive Golden Rings\nFour Calling Birds\nThree French Hens\nTwo Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;

				case 8: System.out.println("my true love sent to me:\nEight Maids a Milking\nSeven Swans a Swimming\nSix Geese a Laying\nFive Golden Rings\nFour Calling Birds\nThree French Hens\nTwo Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;

				case 9: System.out.println("my true love sent to me:\nNine Ladies Dancing\nEight Maids a Milking\nSeven Swans a Swimming\nSix Geese a Laying\nFive Golden Rings\nFour Calling Birds\nThree French Hens\nTwo Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;

				case 10: System.out.println("my true love sent to me:\nTen Lords a Leaping\nNine Ladies Dancing\nEight Maids a Milking\nSeven Swans a Swimming\nSix Geese a Laying\nFive Golden Rings\nFour Calling Birds\nThree French Hens\nTwo Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;

				case 11: System.out.println("my true love sent to me:\nEleven Pipers Piping\nTen Lords a Leaping\nNine Ladies Dancing\nEight Maids a Milking\nSeven Swans a Swimming\nSix Geese a Laying\nFive Golden Rings\nFour Calling Birds\nThree French Hens\nTwo Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;

				case 12: System.out.println("my true love sent to me:\n12 Drummers Drumming\nEleven Pipers Piping\nTen Lords a Leaping\nNine Ladies Dancing\nEight Maids a Milking\nSeven Swans a Swimming\nSix Geese a Laying\nFive Golden Rings\nFour Calling Birds\nThree French Hens\nTwo Turtle Doves\nand a Partridge in a Pear Tree\n");
				break;

			}
		}
	}
}
