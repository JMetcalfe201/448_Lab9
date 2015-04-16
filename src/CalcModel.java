
public class CalcModel 
{
	private String[] prevOperation;
	private double previousAnswer;
	
	public CalcModel()
	{
		prevOperation = new String[3];
		previousAnswer = 0;
	}
	
	public double Add(double d1, double d2)
	{
		previousAnswer = d1+d2;
		prevOperation[0] = String.valueOf(d1);
		prevOperation[1] = new String("+");
		prevOperation[2] = String.valueOf(d2);
		return previousAnswer;
	}
	
	public double AddLast(double d)
	{
		prevOperation[0] = String.valueOf(previousAnswer);
		previousAnswer = d + previousAnswer;
		prevOperation[1] = new String("+");
		prevOperation[2] = String.valueOf(d);
		return previousAnswer;
	}
	
	public double Mult(double d1, double d2)
	{
		previousAnswer = d1 * d2;
		prevOperation[0] = String.valueOf(d1);
		prevOperation[1] = new String("*");
		prevOperation[2] = String.valueOf(d2);
		return previousAnswer;
	}
	
	public double MultLast(double d)
	{
		prevOperation[0] = String.valueOf(previousAnswer);
		previousAnswer = d * previousAnswer;
		prevOperation[1] = new String("*");
		prevOperation[2] = String.valueOf(d);
		return previousAnswer;
	}
	
	public double Sub(double d1, double d2)
	{
		previousAnswer = d1 - d2;
		prevOperation[0] = String.valueOf(d1);
		prevOperation[1] = new String("-");
		prevOperation[2] = String.valueOf(d2);
		return previousAnswer;
	}
	
	public double SubLast(double d)
	{
		prevOperation[0] = String.valueOf(previousAnswer);
		previousAnswer = previousAnswer - d;
		prevOperation[1] = new String("-");
		prevOperation[2] = String.valueOf(d);
		return previousAnswer;
	}
	
	public double Div(double d1, double d2)
	{
		previousAnswer = d1 / d2;
		prevOperation[0] = String.valueOf(d1);
		prevOperation[1] = new String("/");
		prevOperation[2] = String.valueOf(d2);
		return previousAnswer;
	}
	
	public double DivLast(double d)
	{
		prevOperation[0] = String.valueOf(previousAnswer);
		previousAnswer = previousAnswer / d;
		prevOperation[1] = new String("/");
		prevOperation[2] = String.valueOf(d);
		return previousAnswer;
	}
	
	public double GetPrevAnswer()
	{
		return previousAnswer;
	}
	
	public String[] GetPrevOp()
	{
		return prevOperation;
	}
	
	public boolean CharToBool(String s)
	{
		return (s.charAt(0) == 'y' || s.charAt(0) == 'Y');
	}
}
