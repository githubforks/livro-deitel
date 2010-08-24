package ch07.Exer07_28;

public class Caminho
{
	String[] caminho;
	int posicaoLebre, posicaoTartaruga;
	
	public Caminho()
	{
		caminho = new String[70];
		for (int i = 0; i < caminho.length; i++)
			caminho[i]= (i<10) ? " "+i : ""+i;
		
		posicaoLebre = 0;
		posicaoTartaruga = 0;
		caminho[0]="TL";
	}
	
	public void inicio()
	{
		System.out.println("BANG !!!!!");
		System.out.println("A corrida começou !!!!!");
	}
	
	public void imprimeCaminho()
	{
		// ╣ ║ ╗ ╝ ╚ ╔ ╩ ╦ ╠ ═ ╬ ǁ =
		System.out.printf("    ╔═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╗\n" +
						  "    ║ %s║ %s║ %s║ %s║ %s║ %s║ %s║ %s║ %s║ %s║\n" +
						  "    ╚═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╬═══╣\n" +
						  "                                        ║ %s║\n" +
						  "╔═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╗   ╠═══╣\n" +
						  "║ %s║ %s║ %s║ %s║ %s║ %s║ %s║ %s║ %s║   ║ %s║\n" +
						  "╠═══╬═══╩═══╩═══╩═══╩═══╩═══╩═══╬═══╣   ╠═══╣\n" +
						  "║ %s║                           ║ %s║   ║ %s║\n" +
						  "╠═══╣   ╔═══╦═══╦═══╦═══╦═══╗   ╠═══╣   ╠═══╣\n" +
						  "║ %s║   ║ %s║ %s║ %s║ %s║ %s║   ║ %s║   ║ %s║\n" +
						  "╠═══╣   ╠═══╬═══╩═══╩═══╬═══╣   ╠═══╣   ╠═══╣\n" +
						  "║ %s║   ║ %s║           ║ %s║   ║ %s║   ║ %s║\n" +
						  "╠═══╣   ╠═══╣   ╔═══╦═══╬═══╣   ╠═══╣   ╠═══╣\n" +
						  "║ %s║   ║ %s║   ║ %s║ %s║ %s║   ║ %s║   ║ %s║\n" +
						  "╠═══╣   ╠═══╣   ╚═══╩═══╩═══╝   ╠═══╣   ╠═══╣\n" +
						  "║ %s║   ║ %s║                   ║ %s║   ║ %s║\n" +
						  "╠═══╣   ╠═══╬═══╦═══╦═══╦═══╦═══╬═══╣   ╠═══╣\n" +
						  "║ %s║   ║ %s║ %s║ %s║ %s║ %s║ %s║ %s║   ║ %s║\n" +
						  "╠═══╣   ╚═══╩═══╩═══╩═══╩═══╩═══╩═══╝   ╠═══╣\n" +
						  "║ %s║                                   ║ %s║\n" +
						  "╠═══╬═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╬═══╣\n" +
						  "║ %s║ %s║ %s║ %s║ %s║ %s║ %s║ %s║ %s║ %s║ %s║\n" +
						  "╚═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╝\n",

						  caminho[0] ,caminho[1], caminho[2], caminho[3], caminho[4],
						  caminho[5], caminho[6], caminho[7], caminho[8], caminho[9],
						  caminho[10],caminho[37],caminho[38],caminho[39],caminho[40],
						  caminho[41],caminho[42],caminho[43],caminho[44],caminho[45],
						  caminho[11],caminho[36],caminho[46],caminho[12],caminho[35],
						  caminho[61],caminho[62],caminho[63],caminho[64],caminho[65],
						  caminho[47],caminho[13],caminho[34],caminho[60],caminho[66],
						  caminho[48],caminho[14],caminho[33],caminho[59],caminho[69],
						  caminho[68],caminho[67],caminho[49],caminho[15],caminho[32],
						  caminho[58],caminho[50],caminho[16],caminho[31],caminho[57],
						  caminho[56],caminho[55],caminho[54],caminho[53],caminho[52],
						  caminho[51],caminho[17],caminho[30],caminho[18],caminho[29],
						  caminho[28],caminho[27],caminho[26],caminho[25],caminho[24],
						  caminho[23],caminho[22],caminho[21],caminho[20],caminho[19]
						  );
	}

	public void moveLebre(int casas)
	{
		if (posicaoLebre == posicaoTartaruga) 	// Se estiverem na mesma posição
			caminho[posicaoLebre] = " T";		// deixa só a tartaruga na posição
		else caminho[posicaoLebre]= (posicaoLebre<10) ? " "+posicaoLebre : ""+posicaoLebre;
		
		if(casas <= 1){/* Não move */}
		else if(casas <= 3){posicaoLebre+=9;}
		else if(casas <= 4){posicaoLebre-=12;}
		else if(casas <= 7){posicaoLebre+=1;}
		else if(casas <= 9){posicaoLebre-=2;}
		
		if(posicaoLebre < 0)
			posicaoLebre = 0;
		if(posicaoLebre > 69)
			posicaoLebre = 69;
		
		if(posicaoLebre == posicaoTartaruga)
		{
	    	  System.out.println("AI !!!");
	    	  caminho[posicaoLebre] += "TL";
		}
		else caminho[posicaoLebre] = " L";
	}
	
	public void moveTartaruga(int casas)
	{
		if (posicaoLebre == posicaoTartaruga) 	// Se estiverem na mesma posição
			caminho[posicaoTartaruga] = " L";		// deixa só a lebre na posição
		else caminho[posicaoTartaruga] = (posicaoTartaruga<10) ? " "+posicaoTartaruga : ""+posicaoTartaruga;
		
		if(casas <= 4){posicaoTartaruga+=3;}
		else if(casas <= 6){posicaoTartaruga-=6;}
		else if(casas <= 9){posicaoTartaruga+=1;}
		
		if(posicaoTartaruga < 0)
			posicaoTartaruga = 0;
		if(posicaoTartaruga > 69)
			posicaoTartaruga = 69;
		
		if(posicaoLebre == posicaoTartaruga)
		{
	    	  System.out.println("AI !!!");
	    	  caminho[posicaoTartaruga] = "TL";
		} else caminho[posicaoTartaruga] = " T";
	}

	public void fim()
	{
		if(posicaoLebre != posicaoTartaruga)
		{
			if(posicaoLebre==69)
				System.out.println("A LEBRE GANHOU. OH!");
			else System.out.println("A TARTARUGA VENCEU!!! EH!!!");
		} else
			System.out.println("OCORREU UM EMPATE.");
	}
}
