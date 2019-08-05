package kafkainp;
import kafkainp.*;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.io.*;

public class KafkaProducer2 extends KafkaMain {
	  public static String prod(String mesg) throws IOException
	    {
	    	long events=200;
	    	String topic="tk1";
	    	String brokers="localhost:9092";
	//    	Random rnd=new Random();
	    	
	    	Properties props = new Properties();
	    	props.put("bootstrap.servers",brokers);
	    	props.put("client.id","ProducerExample");
	    	props.put("key.serializer","org.apache.kafka.common.serialization.StringSerializer");
	    	props.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");
	    	
	    	KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);
	//    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	 //   	String msg1 = bufferedReader.readLine();
	    	
	    	long t = System.currentTimeMillis();
	    //	String msg= mesg;
	    			try{
	    				producer.send(new ProducerRecord<String, String>(topic, mesg));
	    		//		producer.send(new ProducerRecord<String, String>(topic, mesg), (recordMetadata,e)->{});
	    //				producer.send(new ProducerRecord<String, String>(topic, mesg)).get();
	    			} catch(Exception ex) {
	    				ex.printStackTrace();
	    			}
	    	
	    	System.out.println("Message sent is :" + mesg);
	//    	System.out.println("LocalHost value:" + java.net.InetAddress.getLocalHost());
	//    	System.out.println("sent per second: " + events * 1000 / (System.currentTimeMillis() - t));
	    	producer.close();
	    	return mesg;
	    }
	}


