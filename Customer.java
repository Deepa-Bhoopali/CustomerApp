package customerapp.minor;

abstract class Customer {
    int customerId;
    String customerName;
    String phoneNum;
    double billAmount;

    public Customer(int customerId, String customerName, String phoneNum) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNum = phoneNum;
        this.billAmount = 0;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerName=" + customerName + ", phoneNum=" + phoneNum + ", billAmount=" + billAmount + '}';
    }
    
    abstract public double computeBill(double actualBillAmount);
    
    public void printCustomerInfo(){
        System.out.println(toString());
    }
}

class RegularCustomer extends Customer{
    double discount = 5.00;
    public RegularCustomer(int customerId, String customerName, String phoneNum) {
        super(customerId, customerName, phoneNum);
    }

    public double computeBill(double actualBillAmount) {
        billAmount = actualBillAmount - actualBillAmount * (discount/100);
        return billAmount;
    }
}

class PreviligedCustomer extends Customer{
    String memberCardType;
    public PreviligedCustomer(int customerId, String customerName, String phoneNum, String memberCardType) {
        super(customerId, customerName, phoneNum);
        this.memberCardType = memberCardType;
    }

    public double computeBill(double actualBillAmount) {
        if("type1".equals(memberCardType))
            billAmount = actualBillAmount - actualBillAmount*(10.00/100); //10% disc
        if("type2".equals(memberCardType))
            billAmount = actualBillAmount - actualBillAmount * (20.00/100); //20% disc
        return billAmount;
    }
}
