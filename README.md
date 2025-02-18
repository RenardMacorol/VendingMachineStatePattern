# VendingMachineStatePattern

# Vending Machine State Management

## Problem  
A vending machine needs to manage different states, including **Idle**, **ItemSelected**, **Dispensing**, and **OutOfOrder**. Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.

## Requirements  

### Idle State  
- ✅ Allow item selection.  
- ❌ Disallow dispensing items and inserting coins.  

### ItemSelected State  
- ✅ Allow inserting coins and dispensing items.  
- ❌ Disallow item selection.  

### Dispensing State  
- ❌ Allow no operations.  
- 🔄 Automatically transition back to the **Idle** state after dispensing is complete.  

### OutOfOrder State  
- ❌ Disallow all operations.  

## Current System  
The system currently relies on **conditional statements** within the `VendingMachine` class to check the machine state and determine valid actions. This approach becomes **cumbersome and error-prone** as the number of states and their associated logic grows.

## Solution: Implement the State Pattern  
To improve **code maintainability and flexibility**, we will implement the **State Pattern**.

### Steps  

1. **Define Vending Machine States**  
   - Create separate classes representing different machine states:  
     - `IdleState`  
     - `ItemSelectedState`  
     - `DispensingState`  
     - `OutOfOrderState`  

2. **Implement State Interface**  
   - Define an interface `VendingMachineState` with methods for common actions:  
     - `selectItem()`  
     - `insertCoin()`  
     - `dispenseItem()`  
     - `setOutOfOrder()`  

3. **Implement State Behaviors**  
   - Each concrete state class implements the `VendingMachineState` interface, providing specific behavior for its respective state.  
   - Example:  
     - `IdleState` allows item selection.  
     - `OutOfOrderState` disallows all operations.  

4. **Update VendingMachine Class**  
   - Include attributes for **item inventory** and **balance**.  
   - Remove state-specific logic from the `VendingMachine` class.  
   - Introduce a reference to the **current `VendingMachineState`** object.  
   - Delegate actions (`selectItem()`, `insertCoin()`, `dispenseItem()`, `setOutOfOrder()`) to the current state object through its corresponding methods.  
![Blank diagram](https://github.com/user-attachments/assets/d015916b-50c6-4eae-a46c-b9671a49bd51)

