package personal.caojx.factory;

/**
 *
 * @ClassName: LeftHair
 * @Description: 左偏分发型
 * @version: v1.0.0
 * @author: caojx
 * @date: 2017/7/2 21:45
 */
public class LeftHair implements HairInterface {
    /**
     * 画了一个左偏分发型
     */
    @Override
    public void draw() {
        System.out.println("-----左偏分发型----");
    }
}
