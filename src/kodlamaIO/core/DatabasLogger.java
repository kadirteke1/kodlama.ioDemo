package kodlamaIO.core;

public class DatabasLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına loglandı : " + data);
	}

}
