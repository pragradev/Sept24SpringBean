package io.pragra.learning.july24springbean;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Component
public class Movie {
    private String name;
    private String genre;
    private String year;
}
