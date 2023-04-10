#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.facade.impl.translator;

import ${package}.api.dto.CustomerDTO;

@Component
public class CustomerTranslator {

    public CustomerBO translate(CustomerDTO customerDTO){
        CustomerBO customerBO = new ConsumerBO();
        customerBO.setCustomerId(customerDTO.getCustomerId());
        customerBO.setMemberId(customerDTO.getMemberId());
        customerBO.setCustomerName(customerDTO.getCustomerName());
        customerBO.setCustomerType(customerDTO.getCustomerType());
        customerBO.setSource(customerDTO.getSource());
    }
}
