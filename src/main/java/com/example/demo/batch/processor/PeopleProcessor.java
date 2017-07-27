package com.example.demo.batch.processor;

import com.example.demo.batch.domain.People;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class PeopleProcessor implements ItemProcessor<People, People>{

    @Override
    public People process(People people) throws Exception {
        if (people.getGender().equals("n/a")) {
            people.setGender("droid");
        }
        return people;
    }
}
