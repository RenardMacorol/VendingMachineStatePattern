public class Main{
    public static void main(String[] args) {
        VendingMachineContext vendingMachine = new VendingMachineContext(2,300);
        //Idle state operations
        vendingMachine.selectedItem();
        vendingMachine.insertCoin();
        vendingMachine.dispenseItem();
        //Item Selection
        vendingMachine.setState(new ItemSelectedState());
        vendingMachine.insertCoin();
        vendingMachine.dispenseItem();
        vendingMachine.selectedItem();
        //Dispensing state;
        vendingMachine.setState(new DispensingState());
        vendingMachine.insertCoin();
        vendingMachine.setOutOfOrder();
        vendingMachine.selectedItem();
        vendingMachine.dispenseItem();//only this are callable
        //Out of order
        vendingMachine.setState(new OutOfOrderState());
        vendingMachine.insertCoin();
        System.out.println(vendingMachine.getnOfItem());
        vendingMachine.selectedItem();
        vendingMachine.dispenseItem();
        //Try again check if the order logic are working on dispensing state where instead of Idle state 
        //It turn into out of order state if the no Item is == 0
        vendingMachine.setState(new IdleState());
        vendingMachine.selectedItem();
        vendingMachine.setState(new ItemSelectedState());
        vendingMachine.insertCoin();
        vendingMachine.dispenseItem();//this expecte tunr the device out of order
        System.out.println("Check If out of order");
        vendingMachine.selectedItem();
        vendingMachine.insertCoin();
        vendingMachine.dispenseItem();
        vendingMachine.setOutOfOrder();

    }
}