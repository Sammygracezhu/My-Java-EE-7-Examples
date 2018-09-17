
package org.demo.info;

import java.util.Date;
import javax.faces.flow.FlowScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@FlowScoped("registrationFlow")
public class OrderBean{
    @Inject
    private Customer customer;

    public OrderBean() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getReturnValue(){
      return "/index";
    }
}
