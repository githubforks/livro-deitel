package ch04.Exer04_30;

public class SubPalavra {
	boolean Sub(String s){
		boolean b=true;
		for(int i=0; i<5; i++){
			if(s.charAt(i)=='0');
			else if(s.charAt(i)=='1');
			else if(s.charAt(i)=='2');
			else if(s.charAt(i)=='3');
			else if(s.charAt(i)=='4');
			else if(s.charAt(i)=='5');
			else if(s.charAt(i)=='6');
			else if(s.charAt(i)=='7');
			else if(s.charAt(i)=='8');
			else if(s.charAt(i)=='9');
			else b=false;
		}
		return b;
	}
}
