


	import java.util.ArrayList;

	public class Lab9 {

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
			
			ScalesSolutionLab8 s1 = new ScalesSolutionLab8(10);
			s1.println();

			ScalesSolutionLab8 s2 = new ScalesSolutionLab8(s1.GetSol());
			s2.println();

			
			ArrayList<Double> weights = new ArrayList();
			weights.add(1.0);
			weights.add(2.0);
			weights.add(3.0);
			weights.add(4.0);
			weights.add(10.0);
			
			//s.ScalesFitness(weights);
			
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
			
			RMHC(primes, primes.size(), 1000);
		}
		public static ScalesSolutionLab8 RMHC(ArrayList<Double> weights,int n,int iter) {
			ScalesSolutionLab8 sol = new ScalesSolutionLab8(n);
			
			double oldsol;
			
			for(int i=0;i<iter;i++)
			{
				
				oldsol = sol.ScalesFitness(weights);
				ScalesSolutionLab8 newsol = new ScalesSolutionLab8(sol.GetSol());
				sol.SmallChange();
				double newsoloutuion;	
				newsoloutuion = sol.ScalesFitness(weights);
				
				if (oldsol < newsoloutuion) {
					 sol = newsol;
				}
				System.out.println("The fitness of the iteration : "+ i + " is "+ oldsol);
			}
			return(sol);
		}
		
	}

