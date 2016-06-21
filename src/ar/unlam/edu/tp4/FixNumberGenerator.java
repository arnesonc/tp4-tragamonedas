package ar.unlam.edu.tp4;

public class FixNumberGenerator implements NumberGenerator {
	
	private Integer fixedNumber;
	
	public FixNumberGenerator(Integer number) {
		this.fixedNumber = number;
	}

	public Integer generate(){
		return this.fixedNumber;
	}
	
}
