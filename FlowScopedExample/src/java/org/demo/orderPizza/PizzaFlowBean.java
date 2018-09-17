/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.demo.orderPizza;

import javax.faces.flow.FlowScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@FlowScoped("pizzaFlow")
public class PizzaFlowBean {
    
    public String getReturnValue(){
      return "/index";
    }
}
