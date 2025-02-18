public class ItemSelectedState implements VendingMachineState {

    @Override
    public void selectedItem() {
        System.out.println("Item Selection are not Allowed In this state");
    }

    @Override
    public void insertCoin() {
        System.out.println("You Can Insert coin");
    }

    @Override
    public void dispenseItem(VendingMachineContext vendingMachineContext) {
        int balance = vendingMachineContext.getBalance()-100;
        int currentItem = vendingMachineContext.getnOfItem()-1;
        System.out.println("Previous Balance: " + vendingMachineContext.getBalance());
        System.out.println("Current Balance: " + vendingMachineContext.getBalance());
        vendingMachineContext.setBalance(balance);
        vendingMachineContext.setNoItem(currentItem);
        System.out.println("Dispensing Item....");
        if(currentItem ==0){
            vendingMachineContext.setState(new OutOfOrderState());
        }else
        vendingMachineContext.setState(new IdleState());


    }

    @Override
    public void setOutOfOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setOutOfOrder'");
    }
    
}
