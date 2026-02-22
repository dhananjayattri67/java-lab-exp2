class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method Overloading
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited (int): " + amount);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited (double): " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    // Method Overriding
    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Savings Withdraw Successful");
        } else {
            System.out.println("Minimum balance of 1000 required");
        }
    }
}

class CurrentAccount extends Account {

    CurrentAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    // Method Overriding
    void withdraw(double amount) {
        if (balance - amount >= -5000) {
            balance -= amount;
            System.out.println("Current Withdraw Successful");
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, 5000);
        s.deposit(1000);
        s.withdraw(4500);
        s.display();

        CurrentAccount c = new CurrentAccount(102, 2000);
        c.withdraw(6000);
        c.display();
    }
}
