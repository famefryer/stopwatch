package stopwatch;
/**
 * add double primitives into an array. Calculating summary of 1 to input
 * number.
 * 
 * @author Triwith Mutitakul
 *
 */
public class SumDoublePrimitive implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int counter;
	private double sum = 0.0;

	/**
	 * The Constructor
	 * 
	 * @param counter
	 *            is the last number that add to an array.
	 */
	public SumDoublePrimitive(int counter) {
		this.counter = counter;
	}

	/**
	 * add a number from 1 - ARRAY_SIZE into an arrays. Calculating summary of 1
	 * to input number(counter).And reset number(i) to zero when it more than
	 * ARRAY_SIZE
	 */
	@Override
	public void run() {
		double[] values = new double[ARRAY_SIZE];
		for (int k = 0; k < ARRAY_SIZE; k++)
			values[k] = k + 1;
		// count = loop counter, i = array index value
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0; // reuse the array when get to last value
			sum = sum + values[i];
		}
	}

	/**
	 * return the String that show what is the class doing.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double Primitive with count=%,d\nsum = %.0f", counter, sum);
	}

}
