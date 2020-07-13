package pattern23.builder;

import pattern23.factory.simplefactory.Apple;
import pattern23.factory.simplefactory.FoodFactory.Orange;
import pattern23.factory.simplefactory.FoodFactory.Peach;
/**
 * TODO 建造者模式-建造器
 *
 * @author Mr.He
 * 2020/7/13 13:28
 * mail crabapples.cn@gmail.com
 * qq 294046317
 * pc-name crabapples
 */
public interface FoodBuilder {
    Apple builderApple();

    Orange builderOrange();

    Peach builderPeach();
}
