package br.com.uoldiveo.portal.gateway.uoldiveoportalgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class UoldiveoPortalGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(UoldiveoPortalGatewayApplication.class, args);
	}
}