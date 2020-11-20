//package com.github.lambdaexpression.schedulerx;
//
//import com.alibaba.schedulerx.worker.domain.JobContext;
//import com.alibaba.schedulerx.worker.processor.JavaProcessor;
//import com.alibaba.schedulerx.worker.processor.ProcessResult;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
///**
// * @author lin
// * @date 2020/11/19
// */
//@Component
//public class Test20JobProcessor extends JavaProcessor {
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Override
//    public ProcessResult process(JobContext context) throws Exception {
//        TestSchedulerx.test(logger, this.getClass().getName());
//        return new ProcessResult(true);
//    }
//}
