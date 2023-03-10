import java.util.ArrayList;

public class Lab11 
{
	public static void main(String args[])
	{
		//Read in the weights
		//Make sure you change the filename as appropriate!
		//This will only work if "c:\temp\1000 Primes.txt" exists!
		ArrayList<Double> w = CS2004lab8.ReadNumberFile("C:\\Users\\Public\\OneDrive\\Desktop\\1000-primes.txt");
		//Set the weights
		ScalesChrome.SetWeights(w);
		//Run 10 repeats
		for(int i=0;i<10;++i)
		{
			//Reset the fitness count
			ScalesChrome.ClearFC();
			//The following parameters are not very good!
			//These are the ones you should try and optimise!
			int popsize = 10;
			double mrate = 1.0;
			double crate = 0.0;
			//You will not need to change the following
			SimpleGeneticAlgorithm ga = new SimpleGeneticAlgorithm(popsize,10,1000,mrate,crate);
			//Run the GA for 10,000 function calls
			double f = ga.RunSGA(10000,false).GetFitness();
			System.out.println(f);
		}
	}
}

/*
public SimpleGeneticAlgorithm(int ps,int gs,int nb,double mr,double cr)
{
	nbits = nb;
	popsize = ps;
	gensize = gs;
	mrate = mr;
	crate = cr;
}
*/