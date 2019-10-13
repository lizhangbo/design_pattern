package create.builder;

/**
 * @author lizhangbo
 * @title: FruitMealController
 * @projectName pattern
 * @description: //收银台---导演类
 * @date 2019/8/4  13:52
 */
public class FruitMealController {
    public static void main(String[] args) {
        new FruitMealController().construct();
    }

    public void construct() {
//        Builder builder = new HolidayBuilder();
        Builder builder = new OldCustomerBuilder();
        //以下代码模板，轻易是不变的

        builder.buildApple(120);//创建苹果设置价格
        builder.buildBanana(80);//创建香蕉设置香蕉价格
        builder.buildOrange(50);//创建桔子设置价格

        FruitMeal fruitMeal = builder.getFruitMeal();

        int cost = fruitMeal.cost();
        System.out.println("本套餐花费:" + cost);
    }
}
