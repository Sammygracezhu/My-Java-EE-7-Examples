
package org.demo.orderPizza;

import java.io.Serializable;
import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;


public class PizzaFlow implements Serializable{
    private static final Long serialVersionUID = 1L;
   @Produces
   @FlowDefinition
   public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder){
       String flowId = "pizzaFlow";
       flowBuilder.id("", flowId);
       flowBuilder.viewNode(flowId, "/" + flowId +"/" + flowId + ".xhtml").markAsStartNode();
       
       flowBuilder.returnNode("returnFromPizzaFlow").fromOutcome("#{pizzaFlowBean.returnValue}");
       
       Flow flow = flowBuilder.getFlow();
       return flow;
   }
}
