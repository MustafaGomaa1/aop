package org.nti.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class DoSomething implements AutoCloseable{
    private final Logger log = LoggerFactory.getLogger(DoSomething.class);
    public void doSomethingElse() {
        System.out.println("doSomethingElse Method");
        throw  new RuntimeException();
    }

    @Override
    public void close() throws Exception {
        log.info("close");
    }
}
