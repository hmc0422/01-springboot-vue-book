package com.harsh.case4_9.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
@Order(2)
public class MyApplicationRunner2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("2-nonOptionArgs>>>" + nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        optionNames.forEach(k -> System.out.println("2-keys:" + k + ";value:" + args.getOptionValues(k)));
    }
}
