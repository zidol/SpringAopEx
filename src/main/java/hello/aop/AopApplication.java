package hello.aop;

import hello.aop.order.aop.AspectV1;
import hello.aop.order.aop.AspectV2;
import hello.aop.order.aop.AspectV3;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Slf4j
@SpringBootApplication
//@Import(AspectV1.class)
//@Import(AspectV2.class)
@Import(AspectV3.class)
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args);
	}

}
