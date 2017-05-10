package com.tuya.penglai.web.project;

import com.tuya.penglai.client.service.project.IDemandService;
import com.tuya.penglai.client.vo.project.DemandVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hyh on 2017/3/31.
 * Description：
 */
@RestController
@RequestMapping("/demand/")
@EnableAutoConfiguration
public class DemandController {
    @Autowired
    IDemandService demandService;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public void add(DemandVO demandVO){
        demandService.add(demandVO);
    }
    @RequestMapping(value="getById")
    public void getById(Integer id){
        DemandVO demandVO = demandService.getDemandById(id);
        System.out.println("111");
    }
}
