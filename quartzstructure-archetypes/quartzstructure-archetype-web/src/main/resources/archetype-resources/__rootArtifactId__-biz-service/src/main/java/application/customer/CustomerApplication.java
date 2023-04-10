#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.application.customer;

/**
 * CustomerApplication
 *
 * @author svnee
 */
public interface CustomerApplication {

    void addCustomer(CustomerBO customerBO);
}
