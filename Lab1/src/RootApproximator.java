/**
 * Computes approximations to the square root of a number, using Heron's
 * algorithm
 */
public class RootApproximator {
	/**
	 * Constructs a root approximator for a given number aNumber the number from
	 * which to extract the square root (Precondition: aNumber >= 0)
	 */
	public RootApproximator(double aNumber) {
		a = aNumber;
		xold = 1;
		xnew = a;
	}

	/**
	 * Compute a better guess from the current guess. returns the next guess
	 */
	public double nextGuess() {
		xold = xnew;
		if (xold != 0) {
			xnew = (xold + a / xold) / 2;
		}
		return xnew;
	}

	/**
	 * Compute the root by repeatedly improving the current guess until two
	 * successive guesses are approximately equal.
	 * 
	 * @return the computed value for the square root
	 */
	public double getRoot() {
		while (!Numeric.approxEqual(xnew, xold)) {
			nextGuess();
		}
		return xnew;
	}

	private double a; // the number whose square root is computed
	private double xnew; // the current guess
	private double xold; // the old guess

	public static void main(String args[]) {
		
	//	double x = Double.parseDouble(input);  //for joptionpane
		double x = 10;
		RootApproximator r = new RootApproximator(x);
        double y = r.getRoot();
        System.out.println("square root of " + x + " = " + y);
		
        
        
        
        
        
        //RootApproximator.getRoot();
		//var.function_name(args);
		
		
		//RootApproximator x = new RootApproximator ();
		//int val = x.Method();
		
	//	System.out.println(RootApproximator);

	}

}