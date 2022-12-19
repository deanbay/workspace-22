import java.util.ArrayList;

public class lab10__1 {

	public static void main(String[] args) {
		double r = lab10.GetMaxRange(40.0,1575.0);
		System.out.println(r);
		ArrayList<Double> xt = lab10.GetX();
		ArrayList<Double> yt = lab10.GetY();
		System.out.println(xt.size());
		
		for (int i=0; i < xt.size()  ;i++) {
						
			System.out.println(xt.get(i) + " " + (yt.get(i)));
		}
		
		System.out.println(yt.size());
		System.out.println(yt.size());
	
		
	}// enter results into excel.  

	
	
}
