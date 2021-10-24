package code2rithik.github.io;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of America");

        if(bank.addBranch("New York")) {
            System.out.println("New York branch created");
        }

        bank.addCustomer("New York", "Rick", 50.05);
        bank.addCustomer("New York", "Mike", 175.34);
        bank.addCustomer("New York", "Harry", 220.12);

        bank.addBranch("Washington DC");

        bank.addCustomer("Washington DC", "Bob", 150.54);

        bank.addCustomerTransaction("New York", "Rick", 42.22);
        bank.addCustomerTransaction("New York", "Rick", 12.44);
        bank.addCustomerTransaction("New York", "Mike", 1.65);

        bank.listCustomers("New York", true);
        bank.listCustomers("Washington DC", true);

        bank.addBranch("Texas");

        if(!bank.addCustomer("Texas", "Brian", 5.53)) {
            System.out.println("Error Texas branch does not exist");
        }

        if(!bank.addBranch("New York")) {
            System.out.println("New York branch already exists");
        }

        if(!bank.addCustomerTransaction("New York", "Martin", 52.33)) {
            System.out.println("Customer does not exist at branch.");
        }

        if(!bank.addCustomer("New York", "Rick", 12.21)) {
            System.out.println("Customer Rick already exists");
        }
    }
}
