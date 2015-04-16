
public class CalcController 
{
	private CalcModel model;
	private CalcView view;
	
	public CalcController()
	{
		model = new CalcModel();
		view = new CalcView();
	}
	
	public void Control()
	{
		int input = 0;
		boolean inputValid = true;
		boolean useLast = false;
		double[] args = new double[2];
		
		do
		{
			try{
				input = Integer.parseInt(view.Prompt_Menu());
				inputValid = true;
			}catch(NumberFormatException e){
				inputValid = false;
				view.Print_InvalidInput();
			}
		}while(!inputValid);
		
		while(input != 5)
		{
			useLast = model.CharToBool(view.Prompt_UseLast(model.GetPrevAnswer()));
			
			if(useLast)
			{
				do
				{
					try{
						args[0] = Double.parseDouble(view.Prompt_Arg());
						inputValid = true;
					}catch(NumberFormatException e){
						inputValid = false;
						view.Print_InvalidInput();
					}
				}while(!inputValid);
			}else
			{
				String[] temp = new String[2];
				
				do
				{
					try{
						temp = view.Prompt_Args();
						args[0] = Double.parseDouble(temp[0]);
						args[1] = Double.parseDouble(temp[1]);
						inputValid = true;
					}catch(NumberFormatException e){
						inputValid = false;
						view.Print_InvalidInput();
					}
				}while(!inputValid);
			}
			
			switch(input)
			{
			case 1:
				if(useLast){
					model.AddLast(args[0]);
				}else{
					model.Add(args[0], args[1]);
				}
				break;
			case 2:
				if(useLast){
					model.SubLast(args[0]);
				}else{
					model.Sub(args[0], args[1]);
				}
				break;
			case 3:
				if(useLast){
					model.MultLast(args[0]);
				}else{
					model.Mult(args[0], args[1]);
				}
				break;
			case 4:
				if(useLast){
					model.DivLast(args[0]);
				}else{
					model.Div(args[0], args[1]);
				}
				break;
			default:
				view.Print_InvalidInput();
			}
			
			view.Print_Answer(model.GetPrevAnswer(), model.GetPrevOp());
			
			do
			{
				try{
					input = Integer.parseInt(view.Prompt_Menu());
					inputValid = true;
				}catch(NumberFormatException e){
					inputValid = false;
					view.Print_InvalidInput();
				}
			}while(!inputValid);
		}	
	}
}
