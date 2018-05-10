package com.jd.QuartzJobDemo.job;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * User: xiongyanru
 * Date: 2018/5/10
 * Time: 9:47
 */
public class ExampleJob extends QuartzJobBean {
    private Logger log = Logger.getLogger(this.getClass());
    /**
     * Execute the actual job. The job data map will already have been
     * applied as bean property values by execute. The contract is
     * exactly the same as for the standard Quartz execute method.
     *
     * @param context
     * @see #execute
     */
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println(new Date(System.currentTimeMillis())+"running ExampleJob...................................");
        log.info("running ExampleJob...................................");
    }
}
