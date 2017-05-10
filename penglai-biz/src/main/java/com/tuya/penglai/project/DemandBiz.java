package com.tuya.penglai.project;

import com.tuya.penglai.assembler.BaseAssembler;
import com.tuya.penglai.client.vo.project.DemandVO;
import com.tuya.penglai.core.entity.project.DemandDO;
import com.tuya.penglai.core.repository.DemandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by hyh on 2017/3/31.
 * Description：
 */
@Component("demandBiz")
public class DemandBiz {
    @Autowired
    private DemandRepository demandRepository;

    public void insert(DemandVO demandVO){
        DemandDO demandDO = BaseAssembler.assemble(demandVO,DemandDO.class);
        demandRepository.insert(demandDO);
    }
    public DemandVO getDemandById(Integer id){
        DemandDO demandDO = (DemandDO) demandRepository.findOne(id);
        return BaseAssembler.assemble(demandDO,DemandVO.class);
    }
}
