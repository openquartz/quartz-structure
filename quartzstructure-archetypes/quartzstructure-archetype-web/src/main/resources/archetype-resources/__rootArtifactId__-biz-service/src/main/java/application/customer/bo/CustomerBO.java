#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.application.customer.bo;

import lombok.Data;

@Data
public class CustomerBO {
    private String customerId;
    private String memberId;
    private String customerName;
    private String customerType;
    private String companyName;
    private String source;
}
