package fileprogram;

import java.io.File;
import java.io.IOException;

public class FileCreation 
{

	public static void main(String[] args) throws IOException 
	{
		File newFile=new File("Sakthi.txt");
        if (newFile.createNewFile())
        { 
        System.out.println("File created.");
        }
        else 
        {
        System.out.println("File exists.");

        }

}
}
