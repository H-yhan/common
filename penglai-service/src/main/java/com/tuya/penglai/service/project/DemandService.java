package com.tuya.penglai.service.project;

import com.tuya.penglai.project.DemandBiz;
import com.tuya.penglai.client.service.project.IDemandService;
import com.tuya.penglai.client.vo.project.DemandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hyh on 2017/3/31.
 * Description：
 */
@Service
public class DemandService implements IDemandService {
    @Autowired
    private DemandBiz demandBiz;
    @Override
    public void add(DemandVO demandVO) {
        demandBiz.insert(demandVO);
    }
    @Override
    public DemandVO getDemandById(Integer id) {
       return demandBiz.getDemandById(id);
    }
}
