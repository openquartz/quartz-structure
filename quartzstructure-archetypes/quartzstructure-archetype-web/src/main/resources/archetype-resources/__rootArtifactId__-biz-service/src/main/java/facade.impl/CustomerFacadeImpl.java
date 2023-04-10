#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.facade.impl;

import ${package}.facade.impl.translator.CustomerTranslator;

/**
 * CustomerFacadeImpl
 *
 * @author svnee
 * @date 2020-10-27 8:04 PM
 */
@Service
public class CustomerFacadeImpl implements CustomerFacade {

    @Resource
    private CustomerApplication customerApplication;
    @Resource
    private CustomerTranslator customerTranslator;

    public void addCustomer(CustomerDTO customerDTO) {
        CustomerBO customerBO = customerTranslator.translate(customerDTO);
        customerApplication.addConsumer(customerBO);
    }

}
