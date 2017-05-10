
package com.tuya.penglai.client.service.customer;

import com.tuya.penglai.client.vo.customer.CustomerVO;

/**
 * Created by smartbruce on 2017/3/30.
 */
public interface ICustomerService {

	CustomerVO findByNum(String customerNum);
}
