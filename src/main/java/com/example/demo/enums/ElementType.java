package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum ElementType {
    ID(1),
    NAME(2),
    XPATH(3),
    CSS(4),
    TAG(5),
    CLASS(6);

    private final int num;


    ElementType(int num) {
        this.num = num;
    }
}
