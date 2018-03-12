package com.dois.springcloudscaffold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@EnableBinding(Source.class)
public class SpringCloudScaffoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudScaffoldApplication.class, args);
	}

	@Bean
	@InboundChannelAdapter(value = Source.OUTPUT)
	public MessageSource<String> publishMessage() {
		return () -> new GenericMessage<>("Hello Kafka :)");
	}

}