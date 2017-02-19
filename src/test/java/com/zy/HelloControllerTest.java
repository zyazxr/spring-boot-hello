package com.zy;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/2/19.
 */
//@RunWith(SpringRunner.class)

//@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void hello() throws Exception {

    }

    @Test
    public void test() {
        logger.debug("日志输出测试 Debug");
        logger.trace("日志输出测试 Trace");
        logger.info("日志输出测试 Info");
    }
}