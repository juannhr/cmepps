/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author juanh_hj7z1sj
 */
public class Cuenta {
    
     private int id, balance;

    public Cuenta(int id, int balance) {
        this.id = id;
        this.balance = balance;

    }

    public void Withdraw(int x) throws Exception {

        if ((this.balance - x) < -500) {

            throw new Exception("No puedes retirar saldo");
        }

        this.balance -= x;
    }

    public void Deposit(int x) {

        this.balance += x;
    }

    public int getBalance() {
        return this.balance;
    }
}