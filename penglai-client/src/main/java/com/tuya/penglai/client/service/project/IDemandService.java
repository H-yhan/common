package com.tuya.penglai.client.service.project;

import com.tuya.penglai.client.vo.project.DemandVO;

/**
 * Created by hyh on 2017/3/31.
 * Description：
 */
public interface IDemandService {
    void add(DemandVO demandVO);

    DemandVO getDemandById(Integer id);
}
