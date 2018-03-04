package rpf.kawa;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.MockProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest {
	
	    MockProducer<Long, String> producer;

//	    @Before
//	    public void setUp() {
//	        producer = new MockProducer<Long, String>(
//	            true, new LongSerializer(), new StringSerializer());
//	    }
//
//	    @Test
//	    public void testProducer() throws IOException, InterruptedException, ExecutionException {
//	    	App app = new App();
//	     //   MyTestKafkaProducer myTestKafkaProducer = new MyTestKafkaProducer();
//	    	Producer<Long, String> prod = app.prod();
//	        prod = producer;
//	        long time = System.currentTimeMillis();
//
//	        try {
//	        	System.out.println("startuje testy bo tak");
//	            for (long index = time; index < time + 5; index++) {
//	                final ProducerRecord<Long, String> record =
//	                        new ProducerRecord<>("my-example-topic", index,
//	                                    "Hello Mom " + index);
//
//	                RecordMetadata metadata = producer.send(record).get();
//
//	                long elapsedTime = System.currentTimeMillis() - time;
//	                System.out.printf("sent test record(key=%s value=%s) " +
//	                                "meta(partition=%d, offset=%d) time=%d\n",
//	                        record.key(), record.value(), metadata.partition(),
//	                        metadata.offset(), elapsedTime);
//
//	            }
//	        } finally {
//	            producer.flush();
//	            producer.close();
//	        }
//	        System.out.println("chuj");
//	        assertTrue(producer.history().size() == 5);
//	        
//	     //  myTestKafkaProducer.send();
//
//	       // List<ProducerRecord<Long, String>> history = producer.history();
//
//	       
//	    }
	
	
}
