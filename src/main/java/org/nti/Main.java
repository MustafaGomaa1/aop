package org.nti;

import org.nti.config.AppConfig;
import org.nti.service.DoSomething;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static Logger log =  LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        try(DoSomething myBean = context.getBean("doSomething", DoSomething.class)){
            myBean.doSomethingElse();
            log.info("doSomething");
        }catch(Exception e){
            log.info("Exception caught");
        }
    }
}
