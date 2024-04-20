import java.util.Date;
import java.text.DateFormat;

public class Transacao{

    private static int id = 1000;
    @SuppressWarnings("unused")
    private double valor;
    @SuppressWarnings("unused")
    private static DateFormat data;

    public static boolean efetuarTransacao(Conta conta, boolean credito, double valor){
        if (credito) {
            conta.credito(valor);
            return true;
        } else {
            return conta.debito(valor);
        }
    }

     public static String getData() {
        DateFormat dtHora = DateFormat.getDateTimeInstance();
		return dtHora.format(new Date());
    }

    public static int getId() {
        return id++;
    }
}