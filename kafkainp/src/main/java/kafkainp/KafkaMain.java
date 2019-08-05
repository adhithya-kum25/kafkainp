package kafkainp;
import kafkainp.*;
import java.io.*;
import java.util.Scanner;

public class KafkaMain{
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		while(input.toString().length() > 0) {
			String inp = input.nextLine();
		    KafkaProducer2.prod(inp);
		}
	}
}
