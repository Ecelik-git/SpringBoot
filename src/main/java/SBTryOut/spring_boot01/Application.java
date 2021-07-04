package SBTryOut.spring_boot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		ConfigurableApplicationContext con=
				SpringApplication.run(Application.class, args);
		
		Laptop l1 = con.getBean(Laptop.class);
		l1.use();
		Laptop l2 = con.getBean(Laptop.class);
		l2.use();
		Laptop l3 = con.getBean(Laptop.class);
		l3.use();
		
		
		con.close();
	}

}
