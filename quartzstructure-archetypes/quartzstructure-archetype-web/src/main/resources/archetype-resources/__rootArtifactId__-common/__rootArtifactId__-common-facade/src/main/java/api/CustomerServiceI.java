#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api;

import ${package}.dto.HelloDTO;

public interface HelloFacade {

    void sayHello(HelloDTO helloDTO);
}
