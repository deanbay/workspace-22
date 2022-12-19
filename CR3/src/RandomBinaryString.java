import java.util.Random;

public class RandomBinaryString {

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
}
