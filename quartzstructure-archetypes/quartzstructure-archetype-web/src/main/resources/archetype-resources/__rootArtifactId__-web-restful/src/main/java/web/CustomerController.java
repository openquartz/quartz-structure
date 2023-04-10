#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web;

import com.openquartz.quartzstructure.dto.MultiResponse;
import com.openquartz.quartzstructure.dto.Response;
import ${package}.api.CustomerServiceI;
import ${package}.dto.CustomerAddCmd;
import ${package}.dto.CustomerListByNameQry;
import ${package}.dto.data.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerApplication customerApplication;

    @GetMapping(value = "/helloworld")
    public String helloWorld(){
        return "Hello, welcome to quartz-strcture world!";
    }

    @PostMapping(value = "/customer")
    public void addCustomer(@RequestBody CustomerDTO customerDTO){
        customerApplication.addCustomer(customerDTO);
    }
}
