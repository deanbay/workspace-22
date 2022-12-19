import java.util.Arrays;
import java.util.Random;

//worksheet 7 related
public class RandomMatrix {
	
	public static int[][] RandomMatrix(int n,int lower,int upper){
		{
			
			if(n<=0) {
				return null;
			}
			
			Random rand;
			rand = new Random(); 
			
			rand.setSeed(System.currentTimeMillis());
			
			int res[][] = new int [n][n];
			
			int i;
			int j;
			
			for(i=0;i<n;i++) {
				
				
				for(j=0;j<n;j++) {
					if(i==j) {
						res[i][j] = lower;
						break; // prevents code from breaking
					}

					int randval = Math.abs(rand.nextInt((upper+1)-lower)+lower);
					res[i][j] = randval;
					res[j][i] = randval;
					
				}
			}
			
			//double res[][] = new double [n][n];
			System.out.println(Arrays.deepToString(res)); //allows to print multidimensional array, all the dimensions(rows)
			return (res);	
		}
		
	}
	
	public static void main(String[] args) {
		int n = 10;
		int lower = 1;
		int upper = 100;
		RandomMatrix(n, lower, upper);
	}

}
