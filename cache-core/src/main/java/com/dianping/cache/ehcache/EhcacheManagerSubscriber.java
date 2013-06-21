package com.dianping.cache.ehcache;

/**
 * Created with IntelliJ IDEA.
 * User: lichenq
 * Date: 13-6-21
 * Time: 下午4:21
 */
public interface EhcacheManagerSubscriber {

    void handle(EhcacheEvent ehcacheEvent);

}
