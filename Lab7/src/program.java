import java.util.*;

public class program {

	public static void main(String[] args)
	{
	long times; 
	//Arraylist TimesArray = new arraylist();	

	ArrayList<Long> myArray = new ArrayList<Long>();
		
		for(int i=0;i<100;i++) {
		long t1 = System.nanoTime();
		double res2[][] = RandomArray(i);
		//PrintArray(res2);
		//System.out.println();
		double mst[][] = MST.PrimsMST(res2);
		//PrintArray(res2);
		
		long t2 = System.nanoTime();
		System.out.println(t2-t1);
		
		times = t2-t1;
		myArray.add(times);
		}
		long sum = 0;
		 for(int i=0; i<myArray.size(); i++) {
			 sum = myArray.get(i) + sum;
		 }
		 long average;
		 average = sum/myArray.size();
		System.out.println("average is: " + average);
		
	}
	static public void PrintArray(double array[][])
	{
		for(int i=0;i<array.length;++i)
		{
			for(int j=0;j<array[i].length;++j)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	/*
	static public void PrintArray(double array[][]) {
	
		int i;
		int j;
		for(i=0;i<array.length;i++) {
			for(j=0;j<array[i].length;j++) {
				System.out.println(array[i][j] + " " );
			}
			System.out.println();
		}
	}*/
	
	static public double [][] RandomArray(int n)
	{
		Random rand;
		rand = new Random(); 
		
		rand.setSeed(System.currentTimeMillis());
		
		double res[][] = new double [n][n];
		
		int i;
		int j;
		
		for(i=0;i<n;i++) {
			
			
			for(j=0;j<n;j++) {
				
			int randval;
			randval = Math.abs(rand.nextInt() % 101);
				res[i][i] = (double)randval;
				res[i][j] = (double)randval;
				res[j][i] = res[i][j];
				
			}
			res[i][i] = 0.0;
		}
		
		//double res[][] = new double [n][n];
		
		return (res);
		
	}
	
}
