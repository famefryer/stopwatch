package stopwatch;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Triwith Mutitakul
 * @version 1.0
 */

public class Stopwatch {
	/** time that the stopwatch was started, in nanoseconds. */
	long startTime;
	/** time that the stopwatch was stopped, in nanoseconds. */
	long stopTime;
	/** variable for show you that the stopwatch is running or not. */
	boolean running;
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;

	/**
	 * the contructor of stopwatch.
	 */
	public Stopwatch() {

	}

	/**
	 * Start the stopwatch if it is not already running.
	 */
	public void start() {
		if (!isRunning()) {
			this.startTime = System.nanoTime();
			running = true;
		}
	}

	/**
	 * Stop the stopwatch if it is not already running.
	 */
	public void stop() {
		if (isRunning()) {
			this.stopTime = System.nanoTime();
			running = false;
		}

	}

	/**
	 * 
	 * return the elapsed time.
	 * 
	 * @return if the stopwatch is still running return the elapsed time until
	 *         now,if the stopwatch is stop return the elapsed time between
	 *         start and stop.
	 */
	public double getElapsed() {
		if (isRunning()) {
			return (System.nanoTime() - startTime) * NANOSECONDS;
		} else {
			return (stopTime - startTime) * NANOSECONDS;
		}
	}

	/**
	 * check the stopwatch is running or not.
	 * 
	 * @return true if stopwatch is running and return false if stopwatch is
	 *         stop.
	 */
	public boolean isRunning() {
		return running;
	}

}
