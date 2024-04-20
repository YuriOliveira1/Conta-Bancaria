import java.util.Date;

public class Transacao{

    private int id;
    @SuppressWarnings("unused")
    private double valor;
    private Date data;

    public Transacao(int id, double valor) {
        this.id = id;
        this.valor = valor;
        this.data = new Date();
    }

    public static boolean efetuarTransacao(Conta conta, boolean credito, double valor){
        if (credito) {
            conta.credito(valor);
            return true;
        } else {
            return conta.debito(valor);
        }
    }
}