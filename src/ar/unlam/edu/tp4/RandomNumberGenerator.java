package ar.unlam.edu.tp4;

public class RandomNumberGenerator implements NumberGenerator {

	public Integer generate(){
		Double doubleResult = Math.ceil(Math.random() * 10);
		return doubleResult.intValue();
	}
	
}
