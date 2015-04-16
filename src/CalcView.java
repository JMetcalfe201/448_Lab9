import java.util.Scanner;

public class CalcView 
{
	private Scanner scan;
	
	public CalcView()
	{
		scan = new Scanner(System.in);
	}
	
	public String Prompt_Menu()
	{
		Pln("Please choose an operation: ");
		Pln("1) + (Addition)");
		Pln("2) - (Subtraction)");
		Pln("3) * (Multiplication)");
		Pln("4) / (Division)");
		Pln("5) Exit");
		

		return scan.nextLine();
	}
	
	public String Prompt_UseLast(double prev)
	{
		Pln("Would you like to use the previous answer (y/n)? (" + prev + ")");
		
		return scan.nextLine();

	}
	
	public String[] Prompt_Args()
	{
		String[] args = new String[2];
		Pln("Which two number would you like the preform the operation on?\n Input one number at a time.");
		args[0] = scan.nextLine();
		Pln("and...");
		args[1] = scan.nextLine();
		return args;
	}
	
	public String Prompt_Arg()
	{
		Pln("Which number, besides the previous answer, would you like to preform the operation on?");
		
		return scan.nextLine();
	}
	
	public void Print_Answer(double d, String[] prevOps)
	{
		Pln(prevOps[0] + " " + prevOps[1] + " " + prevOps[2] + " = " + d);
	}
	
	public void Print_InvalidInput()
	{
		Pln("Invalid input please try again.");
	}
	
	protected void Pln(String s)
	{
		System.out.println(s);
	}
	
	protected void P(String s)
	{
		System.out.print(s);
	}
}
