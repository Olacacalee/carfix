package com.carfix.repertory.controller;

import com.carfix.domain.Fixings;
import com.carfix.repertory.service.FixingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2016-05-24.
 */
@Controller
public class FixingsCtl {

    @Autowired
    private FixingsService fixingsService;

    @RequestMapping(value = "/fixings/addFixings", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> addFixings(@RequestBody Fixings fixings){
        return fixingsService.addFixings(fixings);
    }
}
