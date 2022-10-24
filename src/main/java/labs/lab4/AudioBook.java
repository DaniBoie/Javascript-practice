package labs.lab4;

/**
 * An audio book item in a library
 */
public class AudioBook extends Book {
	// ADD YOUR INSTANCE VARIABLES HERE
	private double playingTime;
	private int loan_period = 28;
	private int max_checkouts = 2;
	private int current_checkouts;
	/**
	 * Constructor
	 * 
	 * @param title			audio book title
	 * @param author		audio book author
	 * @param playingTime	audio book playing time
	 */
	public AudioBook(String title, String author, double playingTime) {
		// FILL IN
		super(title, author);
		this.playingTime = playingTime;
		current_checkouts = 0;
	}

	
	public double getPlayingTime() {
		return playingTime; // FIX ME
	}
	
	
	public void setPlayingTime(double playingTime) {
		// FILL IN
		this.playingTime = playingTime;
	}
	
	
	/**
	 * If the max number of checkouts for this item has not already been reached,
	 * this method checks this item out and returns the loan period; if no more
	 * check outs are available for this item, returns the String "NOT ALLOWED";
	 * overrides LibraryItem.checkOut()
	 */
	@Override
	public String checkOut() {
		if (current_checkouts == max_checkouts) {
			return "NOT ALLOWED";
		} else {
			current_checkouts += 1;
			return Integer.toString(loan_period) + " days";
		}
	}
	
	
	/**
	 * Checks in this item  (frees up one checkout for this item); overrides
	 * LibraryItem.checkIn()
	 */
	@Override
	public void checkIn() {
		if (current_checkouts > 0) {
			current_checkouts -= 1;
		}
	}
	
	
	/**
	 * Returns true if the parameter object is an AudioBook that has the same
	 * instance variable value(s) as this one
	 */
	public boolean equals(Object otherObject) {
		// if (!super.equals(otherObject)) { return false; }
    if (otherObject instanceof AudioBook) {
   	 	AudioBook other = (AudioBook)otherObject;  
			if (other.getTitle() == getTitle()) {
				if (other.getAuthor() == getAuthor()) {
					if (other.getPlayingTime() == getPlayingTime()) {
						return true;
					}
				}
			}
  	}
		return false;
  }




}
