package com.cn.edu.util;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TaskOne extends QuartzJobBean {
	
	protected static final Logger log=Logger.getLogger(TaskOne.class);
	
	private int timeout;

    /**
     * Setter called after the ExampleJob is instantiated
     * with the value from the JobDetailBean (5)
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
	
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		// TODO Auto-generated method stub
		log.info("-----定时任务执行-----");
		HttpClient httpClient = null;
    	HttpResponse response = null;
    	try {
    		httpClient = new DefaultHttpClient();
    		HttpPost httpPost=new HttpPost("http://www.sina.com.cn/");
    		response=httpClient.execute(httpPost);
    		int statusCode = response.getStatusLine().getStatusCode();
    		if(statusCode != HttpStatus.SC_OK){
                log.error("response code "+statusCode);
            }else{
            	this.log.debug("sending succeed");
            }
    		System.out.println(statusCode);

		} catch (Exception e) {
			this.log.error("detail error info:"+e.getMessage());
		}
	}

	
}