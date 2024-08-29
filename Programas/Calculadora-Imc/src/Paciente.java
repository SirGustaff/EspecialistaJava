public class Paciente {

    double peso;
    double altura;

    Imc calcularImc() {
        double imcCalculado = peso / (altura * altura);
        Imc imc = new Imc();
        imc.valorImc = imcCalculado;
        imc.altura = this.altura;
        imc.peso = this.peso;
        return imc;
    }


}
