package banking;

public class Customer {

    private String bankName; // 단일 은행 이름
    private String customers;     // 고객 이름 리스트
    private String accountNum;    // 계좌번호 리스트
    private int balance;      // 잔액 리스트

    public Customer() {}

    public Customer(String bankName, String customerName, 
    				String accountNum, int balance) {
        this.bankName = bankName;
        this.customers = customerName;
        this.accountNum = accountNum;
        this.balance = balance;
    }
    
    public boolean findCustomer(String name) {
        return this.customers.equals(name);
    }
    
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
