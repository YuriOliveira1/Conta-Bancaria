public class Conta {

    private int id;
    private double saldo;

    public boolean debito(Double valor){
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public void credito(Double valor){
        saldo += valor;
    }

    public void mostrar(){
        System.out.println("ID da CONTA: " + getId());
        System.out.println("Saldo: " + getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
