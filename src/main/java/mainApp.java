import org.springframework.context.support.ClassPathXmlApplicationContext;
import RedisTest.*;
/**
 * Created by panting1 on 2017/8/5.
 */
public class mainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:spring-config.xml"}
        );

        context.start();

        RedisTest redisTest = (RedisTest) context.getBean("redisTest");

        redisTest.set("testKey","testValue");

        redisTest.get("testKey");

        redisTest.delete("testKey");
    }
}
