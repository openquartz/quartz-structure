#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.facade;

import ${package}.facade.dto.CustomerDTO;

public interface CustomerFacade {

    void addCustomer(CustomerDTO customerDTO);

}
