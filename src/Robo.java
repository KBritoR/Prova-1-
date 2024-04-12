public class Robo {

    private int energia;
    private String nome;
    private int totalDeRobos;
    private int energiaMaxima;

    public int getEnergia() {
        return energia;
    }

    public Robo(int energia, String nome, int totalDeRobos, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.totalDeRobos = totalDeRobos;
        this.energiaMaxima = energiaMaxima;
    }

    public void trabalhar(int tempo){
         if(this.energia >= 20){
             this.energia =- (4*tempo);
         }
    }


    public void trocaEnergia(Robo roboalvo, int temporecarga)
    {
        if(this.energia > 0 && this.energia > temporecarga*2){
            roboalvo.energia =+ 2*temporecarga;
            this.energia -= 2*temporecarga;
        }

    }
    public void recarregar(int horas)
    {
       if(this.energia < this.energiaMaxima && this.energia < 20){
           this.energia =+ (2*horas);
       }
       else
       {
           System.out.println("O Robo ja está com a carga maxima");
       }
    }





}
