public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente();
        paciente.altura = 1.68;
        paciente.peso = 65;

        Imc imc = paciente.calcularImc();

        System.out.println(imc.valorImc);

    }
}
