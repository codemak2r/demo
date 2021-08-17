package com.example.demo.enums;

import lombok.Getter;

/**
 * @author: zw.wen
 */
@Getter
public enum BrowserType {
    CHROME(1, "chrome"),
    FIREBOX(2, "firebox");

    private final int index;
    private final String name;

    BrowserType(int index, String name) {
        this.index = index;
        this.name = name;
    }
}
