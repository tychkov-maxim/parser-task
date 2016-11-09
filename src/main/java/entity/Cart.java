package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart extends BaseEntity{
    private List<Goods> cart;

    public Cart() {
        cart = new ArrayList<Goods>();
    }

    public Cart(List<Goods> cart) {
        this.cart = cart;
    }

    public List<Goods> getCart() {
        return new ArrayList<Goods>(cart);
    }

    public boolean addGoods(Goods goods){
        return cart.add(goods);
    }

}
