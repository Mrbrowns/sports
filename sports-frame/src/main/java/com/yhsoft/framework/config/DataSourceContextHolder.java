package com.yhsoft.framework.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * 本地线程全局变量
 */
@Slf4j
public class DataSourceContextHolder {
    private static Log log = LogFactory.getLog(DataSourceContextHolder.class);
    private static final ThreadLocal<String> local = new ThreadLocal<String>();
    public static ThreadLocal<String> getLocal() {
        return local;
    }/**
     * 读可能是多个库
     */
    public static void read() {

        local.set(DataSourceType.read.getType());
    }

    /**
     * 写只有一个库
     */
    public static void write() {
        log.debug("writewritewrite");
        local.set(DataSourceType.write.getType());
    }

    public static String getJdbcType() {
        return local.get();
    }

}
