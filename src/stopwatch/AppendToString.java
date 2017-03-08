package stopwatch;
/**
 * a class that called for append char to string.
 * 
 * @author Triwith Mutitakul
 *
 */
public class AppendToString implements Runnable {
	private int count;

	/**
	 * The Constructor
	 * 
	 * @param count
	 *            count is the number that control how many time will be
	 *            append.(set how many loop?)
	 */
	public AppendToString(int count) {
		this.count = count;
	}

	/**
	 * set the method run to add char 'a' until the end of loops. print the
	 * final string length.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		String result = "";
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;

		}
		// System.out.println("final string length = " + result.length());
	}

	@Override
	/**
	 * return the String that show what is the class doing.
	 */
	public String toString() {

		return String.format("Append %,d chars to String\nfinal string length = %d", count, count);

	}
}
