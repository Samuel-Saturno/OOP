package Exemplos.ExEvento;

public class EventoAcademico {
    private String nomeDoEvento, localDoEvento;
    private int numeroDeParticipantes;

    EventoAcademico(String nomeDoEvento, String localDoEvento, int numeroDeParticipantes){
        this.nomeDoEvento = nomeDoEvento;
        this.localDoEvento = localDoEvento;
        if (numeroDeParticipantes < 0) {
            this.numeroDeParticipantes = 0;
        } else{
            this.numeroDeParticipantes = numeroDeParticipantes;
        }
        //this.mostraEvento();
    }

    public void mostraEvento(){
        System.out.println("Nome: " + nomeDoEvento);
        System.out.println("Local: " + localDoEvento);
        System.out.println("Participantes: " + numeroDeParticipantes);
    }
}
