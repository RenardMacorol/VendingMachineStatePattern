public class IdleState  implements VendingMachineState{

    @Override
    public void dispenseItem(VendingMachineContext vendingMachineContext) {
        System.out.println("Dispensing not allowed in idle state");
    }


    @Override
    public void selectedItem() {
        System.out.println("Item Selected");
    }

    @Override
    public void insertCoin() {
        System.out.println("Inserting not allowed in idle state");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("Out of order");
    }
    
}
