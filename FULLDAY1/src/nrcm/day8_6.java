package nrcm;
import java.io.*;
public class day8_6 {

	public static void main(String[] args) throws IOException{
		/*File f1=new File("C:\\Users\\venka\\OneDrive\\Desktop\\Java File");
		if(f1.createNewFile()) {
			System.out.println("file created success");
		}else {
			System.out.println("not created");
		}*/
		FileWriter f1=new FileWriter("C:\\Users\\venka\\OneDrive\\Desktop\\Java File");
		f1.write("Hi sagar What a sudden suppai");
		f1.close();
		System.out.println("Success");
	}
}
