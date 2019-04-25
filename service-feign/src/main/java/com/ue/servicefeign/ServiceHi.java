package com.ue.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 一个Feign服务消费者接口
 * @author qianhe
 *
 */
@FeignClient(name="service-hi", fallback=ServiceHiHystrix.class)
public interface ServiceHi{
	
	/**
	 * 通过Feign伪Http客户端调用service-hi提供的服务
	 */ 
	@GetMapping("/hi/{name}")
	String sayHiFromServiceHi(@PathVariable(value="name") String name);
	
}