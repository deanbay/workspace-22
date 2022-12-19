

import java.util.*;

public class ScalesSolutionLab8
{
	private String scasol;
	//Creates a new scales solution based on a string parameter
	//The string parameter is checked to see if it contains all zeros and ones
	//Otherwise the random binary string generator is used (n = length of parameter)
	public ScalesSolutionLab8(String s)
	{
		boolean ok = true;
		int n = s.length();
		for(int i=0;i<n;++i)
		{
			char si = s.charAt(i);
			if (si != '0' && si != '1') ok = false;
		}
		if (ok)
		{
			scasol = s;
		}
		else
		{
			scasol = RandomBinaryString(n);
		}
	}
	
	private static String RandomBinaryString(int n)
	{
		String s = new String();
		
		
		for(int i=0; i<n; i++)
		{
		
			Random rand;
			rand = new Random();
			
			String BinAlphabet = "01"; 
			
			String str = String.valueOf(BinAlphabet.charAt(rand.nextInt(BinAlphabet.length())));
			
		//	String randchar = BinAlphabet.charAt(rand.nextInt(BinAlphabet.length())); // use string value of for converting	
			s = s + str;
		}
		//Code goes here
		//Create a random binary string of just ones and zeros of length n
		return(s);
		
		
		
	}
	public ScalesSolutionLab8(int n) 
	{
		scasol = RandomBinaryString(n);	
	}
	//This is the fitness function for the Scales problem
	//This function returns -1 if the number of weights is less than
	//the size of the current solution
	public double ScalesFitness(ArrayList<Double> weights)
	{
		if (scasol.length() > weights.size()) return(-1);  
		double lhs = 0.0, rhs = 0.0;
		int n = scasol.length();
		
		for(int i=0; i<n;i++) {
			
			if (scasol.charAt(i) == '1') {
			rhs += weights.get(i);
			}
			else {
				lhs += weights.get(i);
			}
			
		}
		//Code goes here
		//Check each element of scasol for a 0 (lhs) and 1 (rhs) add the weight wi
		//to variables lhs and rhs as appropriate
		return(Math.abs(lhs-rhs));
	}
	//Display the string without a new line
	public void print()
	{
		System.out.print(scasol);
	}
	//Display the string with a new line
	public void println()
	{
		print();
		System.out.println();
	}
	
	//lab 9 small change.
	public void SmallChange() {

		{
			int n = scasol.length();

			StringBuilder smallchng = new StringBuilder();

			int randint = CS2004lab8.UI(0, n - 1); // access the cs2004

			for (int i = 0; i < randint; i++) {
				smallchng.append(scasol.charAt(i));
			}
			if (scasol.charAt(randint) == 0) {
				smallchng.append("1");
			} else
				smallchng.append("0");
			for (int j = randint; j < n - 1; j++) {
				smallchng.append(scasol.charAt(j));
			}
			String newscasol = smallchng.toString();
			if (newscasol.equals(scasol)) {
				SmallChange();
			} else {
				scasol = newscasol;
			}
		}
	}

	public String GetSol() {
		return (scasol);
		
	}
	
//This method takes in an ArrayList of weights and a parameter n of what sized solution we are searching for and will return a ScalesSolution representation of the best solution (as found by RMHC) for solving the Scales problem applied to the first n weights of the ArrayList weights. The hill climbing algorithm will run for iter iterations.

}

	/*	
		StringBuilder smallchange = new StringBuilder();
		s3*mallchange.append();
		smallchange.toString();
		
		int randint = CS2004lab8.UI(0, scalsol.length-1);
		
		for(int i=1; i>scalsol.length(10);i++);
		return scalsol;
				
		*/		
	
	

