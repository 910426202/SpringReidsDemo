package RedisTest;

import java.io.Serializable;

/**
 * Created by panting1 on 2017/8/5.
 */
public class ValueEntity implements Serializable {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ValueEntity(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ValueEntity{" +
                "value='" + value + '\'' +
                '}';
    }
}
