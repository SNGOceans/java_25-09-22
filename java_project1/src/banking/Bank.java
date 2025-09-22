package banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String bankName;
    private List<Customer> customers = new ArrayList<>();
    
    public Bank() {}
    
    public Bank(String bankName) {
        this.bankName = bankName;
    }
    
    public void addCustomer(Customer customer) {
    	customers.add(customer);
    }
    
    public Customer findCustomer(String accountNum) {
    	for(Customer c : customers) {
    		if(c.getAccountNum().equals(accountNum)) {
    			return c;
    		}
    	}
		return null;
    }
    
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
