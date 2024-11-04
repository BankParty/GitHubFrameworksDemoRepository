package base;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class WriteToFile {
	
	public static void main(String[] args) {
		try
		{ PrintStream writer = new PrintStream(new File("C:\\Users\\Kartic Saha\\randIns.txt"));
				
				Random r = new Random();
				final int LIMIT = 10;
				
				for(int i=0; i<LIMIT; i++) 
				{
					writer.println(r.nextInt());
				}
				writer.close();
		}
		catch(IOException e)
		{System.out.println("An error occured while trying to write to the file");
	}

}
}