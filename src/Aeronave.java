public class Aeronave {

    boolean ativo = true;
    int totalAsentos;
    int assentosReservardos;

    int calcularAssentosDisponiveis() {
        return totalAsentos - assentosReservardos;
    }

    void reservarAssentos(int numeroAssentos) {
        if (ativo){
            assentosReservardos += numeroAssentos;
        } else {
            System.out.println("Aero-Nave desativada. Assentos não disponiveis!");
        }
    }

    void desativar(){
        ativo = false;
    }

    void ativar(){
        ativo = true;
    }
}
