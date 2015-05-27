package com.wealoha.thrift;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

/**
 * Pool configurations all by passing to commons-pool2, see
 * {@link GenericObjectPoolConfig} for details.
 * 
 * @author javamonk
 */
public class PoolConfig extends GenericObjectPoolConfig {

    private int timeout = 0;

    private boolean failover = false;

    /**
     * get default connection socket timeout (default 0, means not timeout)
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * set default connection socket timeout
     * 
     * @param timeout timeout millis
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    /**
     * get connect to next service if one service fail(default false)
     */
    public boolean isFailover() {
        return failover;
    }

    /**
     * set connect to next service if one service fail
     */
    public void setFailover(boolean failover) {
        this.failover = failover;
    }
}
