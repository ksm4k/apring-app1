package ru.ssendazhy.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classicalMusic")
@Scope("prototype")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Vivaldi";
    }

}
