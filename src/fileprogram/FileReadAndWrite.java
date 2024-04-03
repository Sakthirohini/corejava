package fileprogram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {

	public static void main(String[] args) throws IOException 
	{
		//Byte Stream
        //Write the data
        File f=new File("C:/Sakthi/Sakthi.txt");
        FileOutputStream fos=new FileOutputStream(f);
//        String s = "...Hello Everyone...Java Full Stack...Java provides I/O Streams to read and write data where, a Stream represents an input source or an output destination which could be a file, i/o devise, other program etc. InputStream − This is used to read (sequential) data from a source";
        String s = "  Hi Everyone  ";
        
        byte b[] = s.getBytes();
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.write(b);
        System.out.println("Content Written Successfully.");
        FileInputStream fis = new FileInputStream("C:/Sakthi/Sakthi.txt");
        System.out.println("File Content.");
        int i = fis.read();
        while (i != -1) 
        {
        	//-1-->end of file
            System.out.print((char)i);
            i = fis.read();
        }
        fis.close();

        
        
        
        
        
        FileWriter fw=new FileWriter("C:/Sakthi/Sakthi1.txt");//automatically file created
        fw.write("...Hello Everyone...Java Full Stack course sponsered by capegemini...");
        fw.close();
        System.out.println("Content written successfully");
        FileReader fReader = new FileReader("C:/Sakthi/Sakthi1.txt");
        BufferedReader bReader = new BufferedReader(fReader);
        int records;
        System.out.println("My content:");
        while((records = bReader.read()) != -1) { 
        System.out.print((char)records);
        } 
        bReader.close(); 
        fReader.close();
	}

}
