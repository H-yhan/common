
package com.tuya.penglai.core.repository;

import org.springframework.data.mybatis.repository.support.MybatisRepository;
import org.springframework.stereotype.Repository;

import com.tuya.penglai.core.entity.customer.CustomerDO;

/**
 * Created by smartbruce on 2017/3/29.
 */
@Repository
public interface CustomerRepository extends MybatisRepository {

	CustomerDO findByNum(String num);
}
