package dimens.generator;

import dimens.constants.DimenTypes;
import dimens.utils.MakeUtils;
import java.io.File;

public class DimenGenerator {

    /**
     * 设计稿尺寸(将自己设计师的设计稿的宽度填入)
     */
    private static final int DESIGN_WIDTH = 375;

    /**
     * 设计稿的高度  （将自己设计师的设计稿的高度填入）
     */
    private static final int DESIGN_HEIGHT = 667;

    public static void main(String[] args) {
        int smallest = DESIGN_WIDTH>DESIGN_HEIGHT? DESIGN_HEIGHT:DESIGN_WIDTH;  //     求得最小宽度
        DimenTypes[] values = DimenTypes.values();
        for (DimenTypes value : values) {
            File directory = new File("");//为了方便，设定为当前文件夹，dimens文件将会生成项目所在文件夹中，用户可自行更改
            MakeUtils.makeAll(smallest, value, directory.getAbsolutePath());
        }

    }

}
