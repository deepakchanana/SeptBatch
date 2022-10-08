package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copypaste
{
	public void ReadWrite() throws IOException
	{
		System.out.println("Changes done by deepak");
		File f1=new File("../ABCD/inputfile.txt");
		File f2=new File("../ABCD/inputfile2.txt");
		FileReader fr=new FileReader(f1);
		FileWriter fw=new FileWriter(f2);
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		String s;
		while((s=br.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();
		}
		bw.close();
	}
	public static void main(String[] args) throws IOException 
	{
		copypaste c=new copypaste();
		c.ReadWrite();
	}
}
