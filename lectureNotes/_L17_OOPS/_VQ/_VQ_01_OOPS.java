package _VQ;

public class _VQ_01_OOPS {
    public static void main(String[] args) {
        // Created a Pen Object called p1
        Pen p1 = new Pen();

        p1.setColor("Red");
        p1.setTip(7);

        System.out.println(p1.color);
        System.out.println(p1.tip);

        p1.color = "Blue";
        System.out.println(p1.color);

        System.out.println();

        BankAccount raj = new BankAccount();
        
        raj.userName = "Raj Malotra";
        raj.addBalance(40);

        System.out.println(raj.getBalance());
        System.out.println(raj.getPassword());

    }
}

class BankAccount {
    public String userName;
    private int balance = 240;
    private String userPassword = "#Raj777Cash";

    // If there is no Access Modifier then the function or class will be default
    void addBalance(int add) {// This are called setters
        balance += add;
    }

    int getBalance() {// This are called Getters
        return this.balance;
    }

    String getPassword() {
        String newPass = new String();
        for (int i = 0; i < this.userPassword.length(); i++) {
            if (i >= 2 && i < userPassword.length() - 2) {
                newPass += "*";
            } else {
                newPass += this.userPassword.charAt(i);
            }
        }
        return newPass;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}