import java.util.*;
import java.util.ArrayList;

public class lab6 
{
	
public static void main(String args[]) {
//ShowArray(ThreeSorts.SortA(RandomArray(5)));
   // RunExperiments();
	long start = System.currentTimeMillis();
	ArrayList<Integer> sorter = RandomArray(25);
	ArrayList<Integer> arr4 = ThreeSorts.SortC(sorter);
	ShowArray(arr4);
	long end = System.currentTimeMillis();
	System.out.println(end-start + " is the time");
	
   
	//ShowArray(sorter);//first show of the array
	
	//ArrayList<Integer> arr2 = ThreeSorts.SortA(sorter);
	//ShowArray(arr2);

	//ArrayList<Integer> arr3 = ThreeSorts.SortB(sorter);
	//ShowArray(arr3);
    
}
	


public static void RunExperiments() 
{
	
}
	
public static ArrayList<Integer> RandomArray(int n){
	ArrayList<Integer> res = new ArrayList<Integer>();
	Random rand = new Random();
	rand.setSeed(System.currentTimeMillis());
	
	for(int i=0;i<n;++i) {
		
		Integer r = Math.abs(rand.nextInt() % 256);
		res.add(r);
	}
	
	
return(res);

}

public static void ShowArray(ArrayList<Integer> arr) {
	for (int i = 0; i < arr.size(); i++) {
		System.out.println(arr.get(i));
		}

	}
}




















/*
 
 import java.util.Scanner;
import java.util.Random;

{public static void main(String [] args)
   {
     Scanner MyScan = new Scanner(System.in);
     int Number;
     System.out.println("How many integers do you want in your array?");
     Number = MyScan.nextInt();
     int[] MyArray = new int[Number];

    }//end main
}//end class
 
 
int Low = 10;
int High = 100;

for(int i = 0; i < MyArray .length; i++){
        MyArray [i]  = r.nextInt(High-Low) + Low;
    }

*/