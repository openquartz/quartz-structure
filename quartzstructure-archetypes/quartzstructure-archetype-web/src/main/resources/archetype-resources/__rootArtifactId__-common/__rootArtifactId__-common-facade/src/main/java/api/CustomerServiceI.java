#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api;

import ${package}.dto.CustomerAddCmd;
import ${package}.dto.CustomerListByNameQry;
import ${package}.dto.data.CustomerDTO;

public interface HelloFacade {

    void sayHello();
}
