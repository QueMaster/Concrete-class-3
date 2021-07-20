import java.util.Scanner;

public class Boxer
{
   private String boxerName;
   private double boxerWeight;

    public Boxer()
	{
	    boxerName = " ";
		boxerWeight = 0.0;

	}
	
	public Boxer(String p_BoxerName,double p_BoxerWeight)
	{
	   boxerName =p_BoxerName;
	   boxerWeight =  p_BoxerWeight;
	
	}
	
	public void setBoxerName(String p_BoxerName)
	{
	     boxerName= p_BoxerName;
	}
	
	public void setBoxerWeight(double p_BoxerWeight)
	{
	      boxerWeight = p_BoxerWeight;
	
	}

	public String getBoxerName()
	{
	
	   return boxerName;
	
	}
	
	public double getBoxerWeight()
	{
	    return boxerWeight;
	
	}
	
	public String determineWeightCategory()
	{
		String weightCategory = " ";
		if (boxerWeight >= 50 || boxerWeight <= 65)
		{
			weightCategory = "Light" ;
		}
		else if (boxerWeight > 65 || boxerWeight <= 90)
		{
			weightCategory = "Middle" ;
		}
		else if (boxerWeight > 90)
		{
			weightCategory = "Overweight" ;
		}
		   return weightCategory;
	}

}//end of class