package com.github.lambdaexpression.schedulerx;

import com.github.lambdaexpression.utils.ComputePiUtil;
import org.slf4j.Logger;

import java.math.BigDecimal;

/**
 * @author lin
 * @date 2020/11/19
 */
public class TestSchedulerx {

    private TestSchedulerx() {
    }

    public static void test(Logger logger, String className) {
        logger.info("running " + className);
        int digits = (int) (System.nanoTime() % 30000 + 10000);
        BigDecimal pi = ComputePiUtil.computePi(digits);
//        logger.info("pi:" + this.getClass().getName());
    }

}
