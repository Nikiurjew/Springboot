package com.example.demo.entity;

import java.util.HashMap;
import java.util.Map;

public enum Category {

    DAIRYPRODUCT(0),
    SNACKS(1),
    CERALS(2),
    MAKEUP(3),
	SKINCARE(4),
	ORALCARE(5);

    private int value;
    private static Map map = new HashMap<>();

    private Category(int value) {
        this.value = value;
    }

    static {
        for (Category category : Category.values()) {
            map.put(category.value, category);
        }
    }

    public static Category valueOf(int category) {
        return (Category) map.get(category);
    }

    public int getValue() {
        return value;
    }
}
