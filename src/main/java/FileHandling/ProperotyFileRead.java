package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProperotyFileRead {
	
	String filepath ="C:\\Users\\kumar\\eclipse-workspace\\MetaXclSDETNov2024\\Input\\Env.properties";
	
	String names ="kumar";
	public void readData() throws IOException
	{
		File F = new File(filepath); // create the file
		FileInputStream Fs = new FileInputStream(F); //open and read the file
		Properties P = new Properties();
		P.load(Fs);
		System.out.println(P.getProperty("browser"));
		System.out.println(P.getProperty("name"));
		System.out.println(P.getProperty("url"));
	}
	
	public static void main(String[] args) throws IOException
	{
		ProperotyFileRead P = new ProperotyFileRead();
		P.readData();
	}

}
