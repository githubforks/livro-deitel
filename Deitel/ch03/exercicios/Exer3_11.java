package ch03.exercicios;

public class Exer3_11 {
	private String courseName;
	private String instrutor;  //Questão A
	
	public Exer3_11( String name )                                       
	{                                                                     
		courseName = name;
	}

	public void serInstrutor(String instrutorNome){
		instrutor = instrutorNome;
	}
	public String getInstrutor(){
		return instrutor;
	}
	
	public void setCourseName( String name )
	{
		courseName = name;
	}

	public String getCourseName()
	{
		return courseName;
	}

	public void displayMessage()
	{
		System.out.printf( "Welcome to the grade book for\n%s!\n", 
				getCourseName() );
	}
}
