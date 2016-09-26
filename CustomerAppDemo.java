package customerapp.minor;

public class CustomerAppDemo {

	public static void main(String[] args) {
        Customer[] customers = new Customer[5];
        
        //Customer1 - Regular customer
        customers[0] = new RegularCustomer(1, "Raj", "9988001156");
        customers[0].computeBill(200);
        customers[0].printCustomerInfo();

        //Customer2 - Previliged Customer
        customers[1] = new PreviligedCustomer(2, "Ram", "9654578932", "type1");
        customers[1].computeBill(500);
        customers[1].printCustomerInfo();

        //Customer3 - Previliged Customer
        customers[2] = new PreviligedCustomer(3, "Rajesh", "8976543219", "type2");
        customers[2].computeBill(1000);
        customers[2].printCustomerInfo();

        //Customer4 - Regular Customer
        customers[3] = new RegularCustomer(4, "Rosi", "7854326785");
        customers[3].computeBill(100);
        customers[3].printCustomerInfo();
    
        //Customer5 - Previliged Customer
        customers[4] = new PreviligedCustomer(5, "Sameer", "8765498076", "type2");
        customers[4].computeBill(400);
        customers[4].printCustomerInfo();



	}

}
