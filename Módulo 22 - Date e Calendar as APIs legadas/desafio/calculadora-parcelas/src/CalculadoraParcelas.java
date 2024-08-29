import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculadoraParcelas {

    private final Calendar dataParcelas = Calendar.getInstance();
    private final int quantidadeParcelas;
    private final StringBuilder historicoParcelas = new StringBuilder();

    CalculadoraParcelas(Date dataPrimeiraParcela, int quantidadeParcelas) {

        this.dataParcelas.setTime(dataPrimeiraParcela);
        this.quantidadeParcelas = quantidadeParcelas;

        setHistoricoParcelas();

    }

    public void imprimirParcelas() {
        System.out.println(historicoParcelas);
    }

    private void setHistoricoParcelas() {

        DateFormat formatadorDataParaString = new SimpleDateFormat("dd/MM/yyyy");

        zerarHora();

        int dataPrimeiraParcela = dataParcelas.get(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < quantidadeParcelas; i++) {


            historicoParcelas.append("Parcela #" + (i + 1) + " - " + formatadorDataParaString.format(dataParcelas.getTime()) + "\n");

            if(dataParcelas.get(Calendar.DAY_OF_MONTH) == dataParcelas.getActualMaximum(Calendar.DAY_OF_MONTH) && dataParcelas.getActualMaximum(Calendar.DAY_OF_MONTH) < dataPrimeiraParcela) {

                dataParcelas.add(Calendar.MONTH, 1);
                dataParcelas.set(Calendar.DAY_OF_MONTH, dataPrimeiraParcela);

            } else {

                dataParcelas.add(Calendar.MONTH, 1);

            }

        }

    }

    private void zerarHora() {
        dataParcelas.set(Calendar.HOUR, 0);
        dataParcelas.set(Calendar.MINUTE, 0);
        dataParcelas.set(Calendar.SECOND, 0);
        dataParcelas.set(Calendar.MILLISECOND, 0);
    }


}

