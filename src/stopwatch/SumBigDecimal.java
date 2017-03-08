package stopwatch;
import java.math.BigDecimal;

/**
 * add number in BigDecimal class into an array. Calculating summary of 1 to
 * input number.
 * 
 * @author Triwith Mutitakul
 *
 */
public class SumBigDecimal implements Runnable {
	static final int ARRAY_SIZE = 500000;
	private int counter;
	private BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
	private BigDecimal sum = new BigDecimal(0.0);

	/**
	 * the Constructor
	 * 
	 * @param counter
	 *            is the last number that add to an array.
	 */
	public SumBigDecimal(int counter) {
		this.counter = counter;
	}

	/**
	 * add a number from 1 - ARRAY_SIZE into an arrays by using BigDecimal
	 * class. Calculating summary of 1 to input number(counter).And reset
	 * number(i) to zero when it more than ARRAY_SIZE
	 */
	@Override
	public void run() {
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);
		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}
	}

	/**
	 * return the String that show what is the class doing.
	 */
	@Override
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\nsum = %s", counter, sum.toString());
	}

}
