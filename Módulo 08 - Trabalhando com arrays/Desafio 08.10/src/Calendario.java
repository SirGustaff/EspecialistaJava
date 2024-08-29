public class Calendario {

    static String obterNomeMes(int numeroMes) {
        if (numeroMes > 0 && numeroMes <= 12) {
            String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril",
                    "Maio", "Junho", "Julho", "Agosto", "Setembro",
                    "Outubro", "Novembro", "Dezembro"
            };
            return meses[numeroMes - 1];
        }
        else
            return "Numero passado como parametro nao corresponde a um mes";
    }
}
