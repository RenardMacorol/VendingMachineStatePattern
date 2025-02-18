public interface VendingMachineState {
    public void selectedItem();
    public void insertCoin();
    public void dispenseItem(VendingMachineContext vendingMachineContext);
    public void setOutOfOrder();
    
}
