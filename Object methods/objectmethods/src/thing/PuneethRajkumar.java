package thing;

public class PuneethRajkumar {

	public String firstMovie;
	public String secondMovie;
	public String thirdMovie;
	public String fourthMovie;
	public String fifthMovie;
	public String sixthMovie;
	public String seventhMovie;
	public String eightMovie;
	public String ninthMovie;
	public String tenthMovie;
	public String eleventhMovie;
	public String twelthMovie;
	public String thriteenthMovie;
	public String fourteenthMovie;
	public int total;

	public void setMovies1(String firstMovie) {
		this.firstMovie = firstMovie;

	}

	public void setMovies2(String secondMovie) {
		this.secondMovie = secondMovie;

	}

	public void setMovies3(String thirdMovie) {
		this.thirdMovie = thirdMovie;

	}

	public void setMovies4(String fourthMovie) {
		this.fourthMovie = fourthMovie;

	}

	public void setMovies5(String fifthMovie) {
		this.fifthMovie = fifthMovie;

	}

	public void setMovies6(String sixthMovie) {
		this.sixthMovie = sixthMovie;

	}

	public void setMovies7(String seventhMovie) {
		this.seventhMovie = seventhMovie;
	}

	public void setMovies8(String eightMovie) {
		this.eightMovie = eightMovie;

	}

	public void setMovies9(String ninthMovie) {
		this.ninthMovie = ninthMovie;

	}

	public void setMovies10(String tenthMovie) {
		this.tenthMovie = tenthMovie;
	}

	public void setMovies11(String eleventhMovie) {
		this.eleventhMovie = eleventhMovie;

	}

	public void setMovies12(String twelthMovie) {
		this.twelthMovie = twelthMovie;

	}

	public void setMovies13(String thriteenthMovie) {
		this.thriteenthMovie = thriteenthMovie;

	}

	public void setMovies14(String fourteenthMovie) {
		this.fourteenthMovie = fourteenthMovie;

	}

	public void setMovies15(int total) {
		this.total = total;

	}

	public String getMovies1() {
		return firstMovie;
	}

	public String getMovies2() {
		return secondMovie;
	}

	public String getMovies3() {
		return thirdMovie;
	}

	public String getMovies4() {
		return fourthMovie;
	}

	public String getMovies5() {
		return fifthMovie;
	}

	public String getMovies6() {
		return sixthMovie;
	}

	public String getMovies7() {
		return seventhMovie;
	}

	public String getMovies8() {
		return eightMovie;
	}

	public String getMovies9() {
		return ninthMovie;
	}

	public String getMovies10() {
		return tenthMovie;
	}

	public String getMovies11() {
		return eleventhMovie;
	}

	public String getMovies12() {
		return twelthMovie;
	}

	public String getMovies13() {
		return thriteenthMovie;
	}

	public String getMovies14() {
		return fourteenthMovie;
	}

	public int getMovies15() {
		return total;
	}

	public PuneethRajkumar(String firstMovie, String secondMovie, String thirdMovie, String fourthMovie,
			String fifthMovie, String sixthMovie, String seventhMovie) {

		this.firstMovie = firstMovie;
		this.secondMovie = secondMovie;
		this.thirdMovie = thirdMovie;
		this.fourthMovie = fourthMovie;
		this.fifthMovie = fifthMovie;
		this.sixthMovie = sixthMovie;
		this.seventhMovie = seventhMovie;

	}

	public PuneethRajkumar(String eightMovie, String ninthMovie, String tenthMovie, String eleventhMovie,
			String twelthMovie, String thriteenthMovie, String fourteenthMovie, int total) {

		this.eightMovie = eightMovie;
		this.ninthMovie = ninthMovie;
		this.tenthMovie = tenthMovie;
		this.eleventhMovie = eleventhMovie;
		this.twelthMovie = twelthMovie;
		this.thriteenthMovie = thriteenthMovie;
		this.fourteenthMovie = fourteenthMovie;
		this.total = total;

	}
	
	
	@Override
	
	public String toString() {
		
		System.out.println("this is string representation");
		
		return "[firstMovie==="+firstMovie+", secondMovie==="+secondMovie+", thirdMovie==="+thirdMovie+", fourthMovie==="+fourthMovie
				+", fifthMovie==="+fifthMovie+", sixthMovie==="+sixthMovie+", seventhMovie==="+seventhMovie+"]";
	}
	
	
	@Override
	
	public boolean equals(Object obj) {
		
		System.out.println("this equals method");
		
		if(this==obj) {
			return true;
		}
		
		if(obj==null) {
			return false;
		}
		
		if(this.getClass()!=obj.getClass()) {
			return false;
		}
		
		if(!(this instanceof Object)) {
			return false;
		}
		
		PuneethRajkumar appu=(PuneethRajkumar) obj;
		
		return this.firstMovie.equals(appu.firstMovie) && this.secondMovie.equals(appu.secondMovie) && this.thirdMovie.equals(appu.thirdMovie) && this.fourthMovie.equals(appu.fourthMovie)
				&& this.fifthMovie.equals(appu.fifthMovie) && this.sixthMovie.equals(appu.sixthMovie) && this.seventhMovie.equals(appu.seventhMovie) &&
				this.eightMovie.equals(appu.eightMovie) && this.ninthMovie.equals(appu.ninthMovie) && this.tenthMovie.equals(appu.tenthMovie) && this.eleventhMovie.equals(appu.eleventhMovie) && this.twelthMovie.equals(appu.twelthMovie)
				&& this.thriteenthMovie.equals(appu.thriteenthMovie) && this.fourteenthMovie.equals(appu.fourteenthMovie) && this.total==appu.total;
				
				
	}
	
	@Override
	
	public int hashCode() {
		
		final int prime=7;
		int results=3;
		
		results=results*prime+firstMovie.hashCode();
		results=results*prime+secondMovie.hashCode();
		results=results*prime+thirdMovie.hashCode();
		results=results*prime+fourthMovie.hashCode();
		results=results*prime+fifthMovie.hashCode();
		results=results*prime+seventhMovie.hashCode();
		results=results*prime+eightMovie.hashCode();
		results=results*prime+ninthMovie.hashCode();
		results=results*prime+tenthMovie.hashCode();
		results=results*prime+sixthMovie.hashCode();
		results=results*prime+eleventhMovie.hashCode();
		results=results*prime+twelthMovie.hashCode();
		results=results*prime+thriteenthMovie.hashCode();
		results=results*prime+fourteenthMovie.hashCode();
		results=results*prime+total;
		
		
		return results;
	}
	

}
