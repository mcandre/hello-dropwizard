package us.yellosoft.hellodropwizard;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
* An example service configuration definition
*/
public class HelloWorldConfiguration extends Configuration {
    @NotBlank
    private String greetingTemplate;

    /**
    * @return a configured message template
    */
    @JsonProperty
    public String getGreetingTemplate() {
        return greetingTemplate;
    }

    /**
    * @param greetingTemplate a configurable message template
    */
    @JsonProperty
    public void setGreeting(final String greetingTemplate) {
        this.greetingTemplate = greetingTemplate;
    }
}
