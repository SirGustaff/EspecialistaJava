public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir() {
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Data: %s%n", mesAno);
        System.out.printf("Salario: %.2f%n", valorSalario);
    }
}
