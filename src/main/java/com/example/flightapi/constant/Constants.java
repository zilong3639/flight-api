package com.example.flightapi.constant;

/**
 * <p>FileName：CacheConstants.java</p>
 * <p>Description: Cache constant (缓存常量) </p>
 * <p>Copyright: Copyright (c) 2025 IBM</p>
 * <p>Company: ibm.com </p>
 * @author Bims
 * @since 2025-04-18
 * @version 1.0
 */
public class Constants
{
    public final static long EXPIRATION = 720;

    /**
     * 缓存刷新时间，默认120（分钟）
     */
    public final static long REFRESH_TIME = 1200;

    /**
     * 权限缓存前缀
     */
    public final static String LOGIN_TOKEN_KEY = "login_tokens:";
}
