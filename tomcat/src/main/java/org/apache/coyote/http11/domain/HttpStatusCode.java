package org.apache.coyote.http11.domain;

import java.util.Arrays;

public enum HttpStatusCode {
    OK(200),
    CREATED(201),
    FOUND(302),
    UNAUTHORIZED(401);

    private final int code;

    HttpStatusCode(int code) {
        this.code = code;
    }

    public static HttpStatusCode valueOf(int code) {
        return Arrays.stream(values())
                .filter(value -> value.code == code)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid HttpStatusCode code: " + code));
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name();
    }

    public String toString() {
        return code + " " + name();
    }
}
