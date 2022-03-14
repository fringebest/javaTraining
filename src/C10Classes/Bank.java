package C10Classes;

public class Bank {
    private String firstName;
    private String lastName;
    private int accountBalance;

    private static String bankSWIFT;

    public void initializeBankAccount (String personFirstName, String personLastName,
                                       int initialAccountBalance) {
        firstName = personFirstName;
        lastName = personLastName;
        accountBalance = initialAccountBalance;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFullName(String personFirstName, String personLastName) {
        firstName = personFirstName;
        lastName = personLastName;
    }

    public boolean debitAccount(int amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }

    public void creditAccount(int amount) {
        accountBalance += amount;
    }

    protected void adminBlockAccount() {
        accountBalance = -1;
    }

    public static String getBankSWIFT() {
        return bankSWIFT;
    }

    public static void setBankSWIFT(String newBankSWIFT) {
        bankSWIFT = newBankSWIFT;
    }


    public Bank(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Bank(String firstName, String lastName, int bankAccount){
        this("UNKNOWN_FIRST_NAME", "UNKNOWN_LAST_NAME");
        this.accountBalance = accountBalance;
    }

    public Bank(){
        this.lastName = "UNKNOWN_FIRST_NAME";
        this.firstName = "UNKNOWN_FIRST_NAME";
        this.accountBalance = 0;
    }
    
}