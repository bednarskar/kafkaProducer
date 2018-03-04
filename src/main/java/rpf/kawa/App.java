package rpf.kawa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.connect.json.JsonSerializer;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Properties;

public class App {
	private final static String TOPIC = "my-example-topic";
	private final static String BOOTSTRAP_SERVERS = "localhost:9092";

	private static Producer<Long, JsonNode> createProducer() {
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
		props.put(ProducerConfig.CLIENT_ID_CONFIG, "KafkaExampleProducer");

		// props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
		// LongSerializer.class.getName());
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());

		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class.getName());
		// props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
		// StringSerializer.class.getName());
		return new KafkaProducer<>(props);
	}

	// public static Producer<Long, String> prod() {
	// Producer<Long, String> producer = createProducer();
	// return producer;
	// }
	public static Producer<Long, JsonNode> prod() {
		Producer<Long, JsonNode> producer = createProducer();
		return producer;
	}

	static void runProducer(final int sendMessageCount) throws Exception {
		// final Producer<Long, String> producer = createProducer();
		long time = System.currentTimeMillis();
		// Producer<Long, String> producer = prod();
		Producer<Long, JsonNode> producer = prod();

		try {
			long index = 0;
			File jsonData = new File("/opt/tweeter.json");
			BufferedReader br = new BufferedReader(new FileReader(jsonData));
			ObjectMapper objectMapper = new ObjectMapper();
			// for (long index = time; index < time + sendMessageCount; index++) {
			String line;
			while ((line = br.readLine()) != null) {
				// for (int i=0; i<10; i++) {
				index = index++;
				Tweet tweet = objectMapper.readValue(jsonData, Tweet.class);
				JsonNode jsonNode = objectMapper.valueToTree(tweet);
				final ProducerRecord<Long, JsonNode> record = new ProducerRecord<>(TOPIC, index, jsonNode);

				RecordMetadata metadata = producer.send(record).get();

				long elapsedTime = System.currentTimeMillis() - time;
				System.out.printf("sent record(key=%s value=%s) " + "meta(partition=%d, offset=%d) time=%d\n",
						record.key(), record.value(), metadata.partition(), metadata.offset(), elapsedTime);

			}
		} finally {
			producer.flush();
			producer.close();
		}
	}

	public static void main(String[] args) {
		try {
			if (args.length == 0) {
				runProducer(5);
			} else {
				runProducer(Integer.parseInt(args[0]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello World!");
	}
}
