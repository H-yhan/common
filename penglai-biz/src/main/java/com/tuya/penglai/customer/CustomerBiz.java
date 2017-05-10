
package com.tuya.penglai.customer;

import com.tuya.penglai.assembler.BaseAssembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tuya.penglai.client.vo.customer.CustomerVO;
import com.tuya.penglai.core.entity.customer.CustomerDO;
import com.tuya.penglai.core.repository.CustomerRepository;

/**
 * Created by smartbruce on 2017/3/30.
 */
@Component
public class CustomerBiz {

	@Autowired
	private CustomerRepository customerRepository;

	public CustomerVO findByNum(String customerNum) {
		CustomerDO customerDO = customerRepository.findByNum(customerNum);
		return BaseAssembler.assemble(customerDO, CustomerVO.class);
	}
}
