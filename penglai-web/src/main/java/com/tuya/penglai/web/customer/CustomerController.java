
package com.tuya.penglai.web.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tuya.penglai.client.vo.customer.CustomerVO;
import com.tuya.penglai.client.service.customer.ICustomerService;

/**
 * Created by smartbruce on 2017/3/29.
 */
@RestController
@EnableAutoConfiguration
public class CustomerController {

	@Autowired
	ICustomerService customerService;

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Welcome to Penglai";
	}

	@RequestMapping("/customer/{num}")
	CustomerVO customer(@PathVariable String num) {
		return customerService.findByNum(num);
	}

}
