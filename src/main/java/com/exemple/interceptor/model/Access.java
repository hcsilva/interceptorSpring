package com.exemple.interceptor.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Access {

    private String path;
    private LocalDateTime acessDateTime;
    private Duration acessDuration;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LocalDateTime getAcessDateTime() {
        return acessDateTime;
    }

    public void setAcessDateTime(LocalDateTime acessDateTime) {
        this.acessDateTime = acessDateTime;
    }

    public Duration getAcessDuration() {
        return acessDuration;
    }

    public void setAcessDuration(Duration acessDuration) {
        this.acessDuration = acessDuration;
    }
}
