package p;

public class NoRecommendationException extends Exception {

	public NoRecommendationException() {
		super("There is no recommendation available for this client");
	}
	
}
