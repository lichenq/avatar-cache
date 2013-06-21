package com.dianping.cache.ehcache;

import net.sf.ehcache.CacheManager;

/**
 * Created with IntelliJ IDEA.
 * User: lichenq
 * Date: 13-6-21
 * Time: 下午4:40
 */
public class EhcacheEvent {

    private CacheManager cacheManager;

    public EhcacheEvent(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public CacheManager getCacheManager() {
        return cacheManager;
    }
}
