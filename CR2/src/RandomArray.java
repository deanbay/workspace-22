import java.util.ArrayList;
import java.util.Random;

//worksheet 6
public class RandomArray {
	
	public static ArrayList<Short> RandomArray(int n, short maxVal, short minVal){
		
		if (n<=0)
		{
			return null;	
		}
		
		ArrayList<Short> res = new ArrayList<Short>();
		if (minVal>maxVal) 
		{
			return res;
		}
		
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		for(int i=0;i<n;++i) {
			
			int r = Math.abs(rand.nextInt((maxVal+1)-minVal)+minVal);			
			short rs = (short) r;
			res.add(rs);
		}
		System.out.println(res);
		
	return(res);

	}
	public static void main(String[] args) {
		int n = 10;
		short maxVal = 10 ;
		short minVal = 100;
		RandomArray(n, minVal, maxVal);
	}
}
/*
public static ArrayList<Short> RandomArray(int n, short maxVal, short minVal)
{
	if(n<=0)
	{
		return null;
	}
	ArrayList<Short> RandomNumber = new ArrayList<Short>(n);
	if(minVal>maxVal)
	{
		return RandomNumber;
	}
	Random rand = new Random();
	rand.setSeed(System.currentTimeMillis());
	for(int i=0;i<n;i++)
	{
		int r = Math.abs(rand.nextInt((maxVal+1)-minVal)+minVal);
		short Random_Short = (short)r;
		RandomNumber.add(Random_Short);
	}
	System.out.println(RandomNumber);
	return RandomNumber;
}






