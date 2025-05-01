public class UserBanking {
    String name ;
    int numberAccount;
    int balance;

    public UserBanking(String name,int nAccount,int vBalance){
        this.name = name;
        this.numberAccount = nAccount;
        this.balance = vBalance;
    }

    public  void deposit(String depositAccount){
        try{
            int numberAccount = Integer.parseInt(depositAccount);
            if (numberAccount <= 0){
                System.out.println("erro: Deposit must be greater than 0");
            }else{
                this.balance += numberAccount;
                System.out.println("Deposito realizado");
            }
        }catch (NumberFormatException error){
            System.out.println("error : You must enter a number ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getBalance() {
        return balance;
    }


   public void status(){
       System.out.println("name: " + name +" numberAccount " + numberAccount + " valueAccount " + balance );
   }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

