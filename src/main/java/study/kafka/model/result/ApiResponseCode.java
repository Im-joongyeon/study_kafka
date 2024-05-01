package study.kafka.model.result;

import java.io.Serializable;

/**
 * Created by I'm_joongyeon on 4/30/24.
 */
public interface ApiResponseCode extends Serializable {
    enum StatusCode {
        OK
    }
}
