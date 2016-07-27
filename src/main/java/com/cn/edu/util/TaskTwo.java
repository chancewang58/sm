package com.cn.edu.util;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;

public class TaskTwo {
	protected static final Logger log=Logger.getLogger(TaskTwo.class);
	
	public void doIt(){
		log.info("-----定时任务执行-----");
		HttpClient httpClient = null;
    	HttpResponse response = null;
    	try {
    		httpClient = new DefaultHttpClient();
    		HttpPost httpPost=new HttpPost("http://192.168.2.150:8088/sm/user/showUser?id=1&show+user=%E7%94%A8%E6%88%B7%E6%9F%A5%E8%AF%A2");
    		response=httpClient.execute(httpPost);
    		int statusCode = response.getStatusLine().getStatusCode();
    		if(statusCode != HttpStatus.SC_OK){
                System.out.println(statusCode);
            }else{
            	System.out.println(2);
            }
    		System.out.println(statusCode);

		} catch (Exception e) {
			System.out.println(1);
		}
	}
	
	public static void main(String[] args) {
		HttpClient httpClient = null;
    	HttpResponse response = null;
    	try {
    		httpClient = new DefaultHttpClient();
    		HttpPost httpPost=new HttpPost("http://192.168.2.150:8088/sm/user/showUser?id=1&show+user=%E7%94%A8%E6%88%B7%E6%9F%A5%E8%AF%A2");
    		response=httpClient.execute(httpPost);
    		int statusCode = response.getStatusLine().getStatusCode();
    		if(statusCode != HttpStatus.SC_OK){
                System.out.println(statusCode);
            }else{
            	System.out.println(2);
            }
    		System.out.println(statusCode);

		} catch (Exception e) {
			System.out.println(1);
		}
	}
}
