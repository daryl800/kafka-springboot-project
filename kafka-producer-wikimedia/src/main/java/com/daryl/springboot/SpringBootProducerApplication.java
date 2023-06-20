package com.daryl.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {

    @Autowired
    private WikimediaChangesProducer wikimediaChangesProducer;

    public static void main(String[] args) {

        SpringApplication.run(SpringBootProducerApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();
    }

//    public class SpringBootProducerApplication  {
//    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootProducerApplication.class);

//    public static void main(String[] args) {
//        LOGGER.info("I am a Kafka Producer");
//
//        String bootstrapServers = "127.0.0.1:9092";
//
//        // create Producer properties
//        Properties properties = new Properties();
//        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
//        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
//
//        // create the producer
//        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
//
//        // create a producer record
//        ProducerRecord<String, String> producerRecord =
//                new ProducerRecord<>("wikimedia_recentchange", "hello world");
//
//        // send data - asynchronous
//        producer.send(producerRecord);
//
//        // flush data - synchronous
//        producer.flush();
//        // flush and close producer
//        producer.close();
//    }

}
