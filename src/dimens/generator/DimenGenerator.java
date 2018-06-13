package dimens.generator;

import dimens.constants.DimenTypes;
import dimens.utils.MakeUtils;

public class DimenGenerator {

    /**
     * 设计稿尺寸(根据自己设计师的设计稿的宽度填入)
     */
    private static final int DESIGN_WIDTH = 375;

    /**
     * 设计稿高度  没用到
     */
    private static final int DESIGN_HEIGHT = 667;

    public static void main(String[] args) {

        DimenTypes[] values = DimenTypes.values();
        for (DimenTypes value : values) {
            MakeUtils.makeAll(DESIGN_WIDTH, value, "/androidui/adapter");
        }

    }

}
