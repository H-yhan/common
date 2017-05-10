
package com.tuya.penglai.service.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuya.penglai.customer.CustomerBiz;
import com.tuya.penglai.client.vo.customer.CustomerVO;
import com.tuya.penglai.client.service.customer.ICustomerService;

/**
 * Created by smartbruce on 2017/3/29.
 */
@Service
public class CustomerService implements ICustomerService {

	@Autowired
	private CustomerBiz customerBiz;

	@Override
	public CustomerVO findByNum(String customerNum) {
		return customerBiz.findByNum(customerNum);
	}
}
