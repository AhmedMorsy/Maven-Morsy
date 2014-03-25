package com.morsy.trainee.service.impl;

import com.morsy.trainee.dao.SampleObjectDao;
import com.morsy.trainee.domain.SampleObject;
import com.morsy.trainee.service.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Andrew
 * Date: 6/20/13
 */
@Service
public class TestServiceImpl implements TestService {
    
    @Autowired
    private SampleObjectDao sampleObjectDao;
    
    @Override
    public SampleObject getSampleObjectById(Long id) throws Exception {
        return sampleObjectDao.findById2(id);
    }
}
