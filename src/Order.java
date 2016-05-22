import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

/**
 * Заказ
 */
public class Order {

    private ArrayList<Meal> orderMeal;
    private ArrayList<Integer> orderNumber;
    /**
     * Добавить одно блюдо в заказ.
     *
     * todo TESTS!
     * todo Блюдо должно быть из меню.
     * todo Блюдо должно быть не null.
     *
     * @param meal блюдо из меню
     */
    public boolean addMeal(Meal meal){
        if (new Menu().list().contains(meal)) {
            this.orderMeal.add(meal);
            this.orderNumber.add(1);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean addMeal(Meal meal, Integer number){
        if (new Menu().list().contains(meal)) {
            this.orderMeal.add(meal);
            this.orderNumber.add(number);
            return true;
        }
        else{
            return false;
        }

    }

    //todo добавить возможность добавления нескольких порций  одного блюда, например, два чая.
    //todo addMeal(teaMeal, 2)
    //todo TESTS!
}
