package com.carfix.repertory.service;

import com.carfix.domain.Fixings;
import com.carfix.repertory.dao.FixingsDao;
import com.carfix.utils.StringTools;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016-05-24.
 */
public class FixingsService {

    @Autowired
    private FixingsDao fixingsDao;

    public Map<String,Object> addFixings(Fixings fixings) {
        Map<String,Object> result = new HashMap<String, Object>();
        if(StringTools.isBlank(fixings.getFixingsName())){
            result.put("status",false);
            result.put("message","名称不能为空");
        }
        return result;
    }
}
