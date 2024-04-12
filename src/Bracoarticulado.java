public class Bracoarticulado extends Robo
{
    private int numerodeArticulacoes;
    private Camera camera;
    private Garra garra;


    public Bracoarticulado(int energia, String nome, int totalDeRobos, int energiaMaxima, int numerocamera) {
        super(energia, nome, totalDeRobos, energiaMaxima);
        this.camera = new Camera(numerocamera);
        this.garra = new Garra();
    }



    public void trabalhar(int posicao)
    {
        if(camera.getQuantidade() > 0)
        {
            camera.acharPecas();
        }
        if(posicao == 0)
        {
            garra.agarrarPeca();
        }
        else
        {
            garra.agarrarPeca(posicao);
        }

    }


}
