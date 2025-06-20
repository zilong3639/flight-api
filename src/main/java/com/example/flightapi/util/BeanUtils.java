package com.example.flightapi.util;

public class BeanUtils extends org.springframework.beans.BeanUtils
{
    public static void copyBeanProp(Object dest, Object src)
    {
        try
        {
            copyProperties(src, dest);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
