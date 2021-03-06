package com.easytoolsoft.easyreport.engine.data;

/**
 * 报表布局类型
 *
 * @author Wujun
 */
public enum LayoutType {
    /**
     * 横向布局
     */
    HORIZONTAL(1),

    /**
     * 纵向布局;
     */
    VERTICAL(2);

    private final int value;

    LayoutType(final int value) {
        this.value = value;
    }

    public static LayoutType valueOf(final int arg) {
        if (arg == 1) {
            return HORIZONTAL;
        }
        if (arg == 2) {
            return VERTICAL;
        }
        return HORIZONTAL;
    }

    public int getValue() {
        return this.value;
    }
}
