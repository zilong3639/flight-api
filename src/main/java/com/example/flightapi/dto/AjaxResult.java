package com.example.flightapi.dto;

import com.example.flightapi.constant.HttpStatus;
import com.example.flightapi.util.StringUtils;

import java.util.HashMap;
import java.util.Objects;

public class AjaxResult extends HashMap<String, Object>
{
    private static final long serialVersionUID = 1L;

    /** 处理结果 */
    public static final String SUCCESS_TAG = "success";

    /** 状态码 */
    public static final String CODE_TAG = "code";

    /** 返回内容 */
    public static final String MSG_TAG = "message";

    /** 数据对象 */
    public static final String DATA_TAG = "data";

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public AjaxResult()
    {
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     * 
     * @param code 状态码
     * @param msg 返回内容
     * @param data 数据对象
     */
    public AjaxResult(boolean success, int code, String msg, Object data)
    {
        super.put(SUCCESS_TAG, success);
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
        if (StringUtils.isNotNull(data))
        {
            super.put(DATA_TAG, data);
        } else {
            super.put(DATA_TAG, null);
        }
    }

    /**
     * 返回成功消息
     *
     * @param data 数据对象
     * @return 成功消息
     */
    public static AjaxResult success(int code, Object data)
    {
        return new AjaxResult(true, code, "OK", data);
    }

    /**
     * 返回成功消息
     *
     * @param data 数据对象
     * @return 成功消息
     */
    public static AjaxResult success(Object data)
    {
        return new AjaxResult(true, HttpStatus.SUCCESS, "OK", data);
    }

    /**
     * 返回错误消息
     * 
     * @return 错误消息
     */
    public static AjaxResult error(int code)
    {
        return new AjaxResult(false, code, "Invalid request", null);
    }

    /**
     * 返回错误消息
     *
     * @return 错误消息
     */
    public static AjaxResult error(int code, String msg)
    {
        return new AjaxResult(false, code, msg, null);
    }
}
