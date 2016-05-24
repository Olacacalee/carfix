package com.carfix.repertory.dao;

import com.carfix.api.annotation.ApiRepository;
import com.carfix.domain.Fixings;

/**
 * Created by Administrator on 2016-05-24.
 */
@ApiRepository
public interface FixingsDao {
    int save(Fixings fixings);
}
