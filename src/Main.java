public class Main {
    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAsentos = 100;

        aviaoGol.desativar();
        aviaoGol.ativar();

        aviaoGol.reservarAssentos(10);

        System.out.printf("GOL (%s): %d assentos disponiveis%n",
                aviaoGol.ativo ? "ativo" : "invativo", aviaoGol.calcularAssentosDisponiveis());


        Aeronave aviaoLatam = new Aeronave();
        aviaoLatam.totalAsentos = 120;

        aviaoLatam.reservarAssentos(5);

        System.out.printf("LATAM (%s): %d assentos disponiveis%n",
                aviaoGol.ativo ? "ativo" : "invativo", aviaoLatam.calcularAssentosDisponiveis());
    }
}