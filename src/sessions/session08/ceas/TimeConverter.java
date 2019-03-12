package sessions.session08.ceas;

public class TimeConverter {

	public String getTimeAsString() {
		long time = System.currentTimeMillis();
		long secondsInDay = time % (24 * 60 * 60 * 1000) / 1000;
		long ss = secondsInDay % 60;
		long mm = secondsInDay / 60 % 60;
		long hh = secondsInDay / (60 * 60) % (60 * 60) + 2;
		return padWithZeroes(hh) + ":" + padWithZeroes(mm) + ":" + padWithZeroes(ss);
	}

	private String padWithZeroes(long n) {
		// daca n < 10 returneaza "0"+n
		// altfel returneaza n
		return null;
	}

}
