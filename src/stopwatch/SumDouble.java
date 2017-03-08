package stopwatch;
/**
 * add Double wrapper class into an array. Calculating summary of 1 to input
 * number.
 * 
 * @author Triwith Mutitakul
 *
 */
public class SumDouble implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int counter;
	private Double sum = new Double(0.0);

	/**
	 * The Constructor
	 * 
	 * @param counter
	 *            is the last number that add to an array.
	 */
	public SumDouble(int counter) {
		this.counter = counter;
	}

	/**
	 * add a number from 1 - ARRAY_SIZE into an arrays by using Double wrapper
	 * class. Calculating summary of 1 to input number(counter).And reset
	 * number(i) to zero when it more than ARRAY_SIZE
	 */
	@Override
	public void run() {
		Double[] values = new Double[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new Double(i + 1);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];
		}
	}

	/**
	 * return the String that show what is the class doing.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of Double objects with count=%,d\nsum = %.0f", counter, sum);
	}

}
