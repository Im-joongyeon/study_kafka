package study.kafka.model.result;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by I'm_joongyeon on 4/30/24.
 */
public class ApiResponse<T> implements ApiResponseCode {
    private static final long serialVersionUID = 2669293150219020249L;
    @JsonProperty(required = true)
    private StatusCode statusCode;

    @JsonProperty(required = true)
    private String result;

    public ApiResponse(String result) {
        this.statusCode = StatusCode.OK;
        this.result = result;
    }
}
