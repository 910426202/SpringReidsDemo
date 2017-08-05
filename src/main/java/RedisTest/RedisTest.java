package RedisTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * Created by panting1 on 2017/8/5.
 */
@Component
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate<String,ValueEntity> redisTemplate;

    public void set(String key, String value){
        stringRedisTemplate.opsForValue().set(key,value);

        ValueOperations<String,ValueEntity> ops = redisTemplate.opsForValue();
        ops.set(key+"_redisTemplate",new ValueEntity(value+"_redisTemplate"));
    }

    public void get(String key){
        System.out.println(stringRedisTemplate.opsForValue().get(key));

        System.out.println(redisTemplate.opsForValue().get(key + "_redisTemplate"));
    }

    public void delete(String key){
        stringRedisTemplate.opsForValue().getOperations().delete(key);

        redisTemplate.opsForValue().getOperations().delete(key + "_redisTemplate");
    }
}
