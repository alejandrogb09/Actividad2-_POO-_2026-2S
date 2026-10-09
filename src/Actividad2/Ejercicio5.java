package Actividad2;

public class Ejercicio5 {
    public static void main(String[] args) {
        CuentaBancaria account1 = new CuentaBancaria("Jose", "Gomez", 123456789, CuentaBancaria.TypeAccount.CHECKING, 1.5f);
        
        account1.print();
        account1.enterBalance(200000);
        account1.enterBalance(300000);
        account1.withdrawAmount(400000);
        account1.applyMonthlyInterest(); 
    }
}