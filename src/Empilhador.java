public class Empilhador extends Robo {

    private Pacote[] pacotes;
    private int pesomaximo = 0;

    public Empilhador(int energia, String nome, int totalDeRobos, int energiaMaxima) {
        super(energia, nome, totalDeRobos, energiaMaxima);
        this.pacotes = new Pacote[200];
    }

    public void adicionarPacote(int peso)
    {
        for (int i = 0; i < pacotes.length; i++) {

            if(pacotes[i] == null)
            {
                if(pesomaximo < 1000) {
                    pacotes[i] = new Pacote();
                    pesomaximo =+ peso;

                }
                else
                {
                    System.out.println("Peso maximo, nao tem como colocar mais pacotes");
                    break;
                }
            }


        }
    }
    public void removerPacote(int posicao){
        for (int i = 0; i < pacotes.length; i++) {
            if(pacotes[i] == null)
            {
                pacotes[posicao] = null;
                break;
            }
        }
    }
    public void mostrarPacotes()
    {
        for (int i = 0; i < pacotes.length; i++) {
            if (pacotes[i] != null)
            {
                System.out.println(pacotes[i]);
            }
        }
    }


}
