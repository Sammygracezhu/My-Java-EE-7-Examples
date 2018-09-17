

package org.demo.orderPizza;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@Named
@FlowScoped("pizzaFlow")
public class PizzaBean {
    private String size;
    private int quantity;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   

}
