package com.newcode.commuity.wenda;

import com.newcode.commuity.wenda.dao.alphadao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = WendaApplication.class)
class WendaApplicationTests implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Test
    void contextLoads() {
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
    @Test
    public void testApplicationContext(){
        System.out.println(applicationContext);
        alphadao alphaDao=applicationContext.getBean(alphadao.class);
        System.out.println(alphaDao.select());
    }

}
