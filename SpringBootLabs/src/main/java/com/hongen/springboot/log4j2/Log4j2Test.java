package com.hongen.springboot.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Log4j2Test {
    private final static Logger log = LoggerFactory.getLogger(Log4j2Test.class);
    
    public Log4j2Test() {
        log.trace("trace...");
        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");
        System.out.println("system.out.pringln...");
    }

}
