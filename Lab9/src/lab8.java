

import java.util.ArrayList;

public class lab8 {

	public static void main(String args[])
	{
		for(int i=0;i<10;++i)
		{
			int x = CS2004lab8.UI(-1, 1);
			System.out.println(x);
		}
		ScalesSolutionLab8 s = new ScalesSolutionLab8("10101");
		s.println();
		
		ScalesSolutionLab8 x = new ScalesSolutionLab8("10101x");
		x.println();
		
		ArrayList<Double> weights = new ArrayList();
		weights.add(1.0);
		weights.add(2.0);
		weights.add(3.0);
		weights.add(4.0);
		weights.add(10.0);
		
		s.ScalesFitness(weights);
		
		CS2004lab8 i = new CS2004lab8 ();
		
		ArrayList<Double> primes = new ArrayList();
		primes = i.ReadNumberFile("C:\\Users\\Student\\Downloads\\1000-primes.txt");
		s.ScalesFitness(primes);
		System.out.println(primes);
		
		System.out.println(s.ScalesFitness(weights));
		System.out.println(s.ScalesFitness(primes));
		
		
		//s.RandomBinaryString(6);
		
		//ScalesSolutionLab8(RandomBinaryString);
		
		//System.out.print();
	}

	
}
