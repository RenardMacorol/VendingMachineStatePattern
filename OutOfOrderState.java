public class OutOfOrderState implements VendingMachineState {

    @Override
    public void selectedItem() {
        System.out.println("Out of stock. Unable to do operation");
    }

    @Override
    public void insertCoin() {
        System.out.println("Out of stock. Unable to do operation");
    }

    @Override
    public void dispenseItem(VendingMachineContext vendingMachine) {
        System.out.println("Out of stock. Unable to do operation");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("Out of stock. Unable to do operation");
    }
    
}
