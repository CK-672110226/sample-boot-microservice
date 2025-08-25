package lab.microservice.hello;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@LoadBalancerClient(name = "user-service")
public class LoadBalancerConfig {
    // This configuration enables load balancing for the user-service
    // Spring Cloud LoadBalancer will automatically distribute requests
    // between the available instances registered with Eureka
}
