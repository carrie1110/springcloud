package com.ue.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务消费控制层
 * @author qianhe
 *
 */

@RestController
public class HelloController{
	
	/** 注入服务service-hi的Feign客户端*/
	@Autowired
	private ServiceHi serviceHi;
	
	/**
	 * 调用Feign客户端提供的服务, 自带负载均衡
	 */
	@GetMapping("/hello/{name}")
	public String sayHi(@PathVariable String name) {
       //调用Feign客户端ScheduleServiceHi的接口
		return serviceHi.sayHiFromServiceHi(name);
	}
}