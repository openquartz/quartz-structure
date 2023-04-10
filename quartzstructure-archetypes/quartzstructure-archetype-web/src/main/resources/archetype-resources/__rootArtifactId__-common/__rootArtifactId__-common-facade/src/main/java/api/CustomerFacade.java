#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api;

import ${package}.dto.CustomerDTO;

public interface CustomerFacade {

    void addCustomer(CustomerDTO customerDTO);

}
