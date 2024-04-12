import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Robo robo1 = new Robo(100,"ROBOT01",1,100);
        Robo robo2 = new Robo(100,"ROBOT02",1,100);

        Bracoarticulado bracoarticulado1 = new Bracoarticulado(100,"BRACA01",1,100,10);
        Empilhador empilhador1 = new Empilhador(100,"EMPIL01",1,100);

        empilhador1.adicionarPacote(2000);
        bracoarticulado1.trabalhar(0);

        empilhador1.mostrarPacotes();
        empilhador1.removerPacote(1);

        robo2.trabalhar(200);
        robo2.trocaEnergia(robo1,3);
        robo2.recarregar(10);

        System.out.println(robo2.getEnergia());






    }
}