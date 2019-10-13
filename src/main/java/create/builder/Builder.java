package create.builder;

/**
 * @author lizhangbo
 * @title: Builder
 * @projectName pattern
 * @description: 创建一个MealBuilder类，实际的builder类负责创建套餐Meal对象。
 * @date 2019/8/4  13:32
 */
public interface Builder {//也是工厂

    void buildApple(int price);//设置苹果

    void buildBanana(int price);//设置香蕉

    void buildOrange(int price);//设置橘子

    FruitMeal getFruitMeal();//返回创建的套餐
}
