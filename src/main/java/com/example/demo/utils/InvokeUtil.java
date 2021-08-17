package com.example.demo.utils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author: zw.wen
 */
public class InvokeUtil {
    private final SeleniumUtil seleniumUtil;

    public InvokeUtil(SeleniumUtil seleniumUtil) {
        this.seleniumUtil = seleniumUtil;
    }

    public void invokeEndScript(String elementType, String element, String action, String value) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (elementType == null && element == null) {
            SeleniumUtil.class.getMethod(action).invoke(seleniumUtil);
            return;
        }

        if (value != null) {
            seleniumUtil.setValue(value);
        }

        seleniumUtil.findElement(elementType, element);
        SeleniumUtil.class.getMethod(action).invoke(seleniumUtil);
    }


}
