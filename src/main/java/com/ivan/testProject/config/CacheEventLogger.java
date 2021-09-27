package com.ivan.testProject.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;

public class CacheEventLogger implements CacheEventListener<Object, Object> {

    static final Logger log = LogManager.getRootLogger();

    @Override
    public void onEvent(CacheEvent<?, ?> cacheEvent) {
        log.info("{}, {}, {}",cacheEvent.getKey(), cacheEvent.getOldValue(), cacheEvent.getNewValue());
    }
}
