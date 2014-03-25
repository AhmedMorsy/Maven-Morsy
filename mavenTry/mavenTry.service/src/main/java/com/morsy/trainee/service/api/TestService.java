package com.morsy.trainee.service.api;

import com.morsy.trainee.domain.SampleObject;

/**
 * User: Andrew
 * Date: 6/20/13
 */
public interface TestService {
    
    public SampleObject getSampleObjectById(Long id) throws Exception;
}
