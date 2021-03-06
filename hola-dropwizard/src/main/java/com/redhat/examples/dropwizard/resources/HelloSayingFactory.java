package com.redhat.examples.dropwizard.resources;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class HelloSayingFactory {

    @NotEmpty
    private String saying;

    public HelloSayingFactory(String saying) {
        this.saying = saying;
    }

    @JsonProperty
    public String getSaying() {
        return saying;
    }

    @JsonProperty
    public void setSaying(String saying) {
        this.saying = saying;
    }
}
