public class VendingMachineContext {
    private int nOfItem;
    private int balance;
   private VendingMachineState state; 
    
    VendingMachineContext(int nOfItem, int balance){
        this.nOfItem = nOfItem;
        this.balance = balance;
        this.state = new IdleState();
    }
   public void setState(VendingMachineState state){
    this.state = state;
   }
   public void setBalance(int balance){
    this.balance = balance;
   }
   public void setNoItem(int nOfItem){
    this.nOfItem = nOfItem;
   }
   public int getBalance(){
    return this.balance;
   }
   public int getnOfItem(){
    return this.nOfItem;
   }
    public void selectedItem() {
        state.selectedItem();
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void dispenseItem(){
        state.dispenseItem(this);
    }

    public void setOutOfOrder() {
        state.setOutOfOrder();
    }

   
   
}
