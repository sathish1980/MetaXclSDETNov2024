package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	static String filepath = System.getProperty("user.dir")+"//Environment//env.properties";
	public static Properties readData() throws IOException
	{
		File F = new File(filepath); // create the file
		FileInputStream Fs = new FileInputStream(F); //open and read the file
		Properties P = new Properties();
		P.load(Fs);
		return P;
		
	}
}
