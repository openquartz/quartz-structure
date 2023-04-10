#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.facade.impl.translator;

import ${package}.common.facade.dto.CustomerDTO;
import ${package}.application.customer.bo.CustomerBO;
import org.springframework.stereotype.Component;

@Component
public class CustomerTranslator {

    public CustomerBO translate(CustomerDTO customerDTO){
        CustomerBO customerBO = new ConsumerBO();
        customerBO.setCustomerId(customerDTO.getCustomerId());
        customerBO.setMemberId(customerDTO.getMemberId());
        customerBO.setCustomerName(customerDTO.getCustomerName());
        customerBO.setCustomerType(customerDTO.getCustomerType());
        customerBO.setSource(customerDTO.getSource());
        return customerBO;
    }
}
