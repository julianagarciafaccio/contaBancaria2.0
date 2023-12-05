package model.entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;
    public Account(){
    }
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit(double amount){
        balance += amount;
    }
    //aqui nessa parte onde so cuidamos das regras de negocio nao podemos ter sout pq isso e funçao da funçao
    public void withdraw(double amount){
        validateWithdraw(amount);
        balance -= amount;
    }
    public void validateWithdraw(double amount){
        if (amount > getWithdrawLimit() ){
            throw new RuntimeException("ERRO DE SAQUE A QUANTIA EXCEDE O LIMITE A CONTA");
        }
        if (amount > balance){
            throw new RuntimeException("SALDO INSUFICIENTE");
        }

    }
    @Override
    public String toString(){
        return "numero da conta" + number +
                "titular da conta" + holder +
                "saldo na conta" + balance ;
    }

}
