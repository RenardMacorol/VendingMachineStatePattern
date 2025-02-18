public class DispensingState implements VendingMachineState {

    @Override
    public void selectedItem() {
        System.out.println("Operation not allow during this state");
    }

    @Override
    public void insertCoin() {
        System.out.println("Operation not allow during this state");
    }

    @Override
    public void dispenseItem(VendingMachineContext vendingMachineContext) {
        System.out.println("Not allow In this state");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("Operation not allow during this state");
    }
    
}
