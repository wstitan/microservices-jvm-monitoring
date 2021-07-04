package pl.piomin.microservices.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.MongoRepository;
import pl.piomin.microservices.account.model.Account;

import java.util.List;


@SpringBootApplication
@EnableDiscoveryClient
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

	public interface AccountRepository extends MongoRepository {

		public Account findByNumber(String number);
		public List findByCustomerId(String customerId);

	}
}

