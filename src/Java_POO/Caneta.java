package Java_POO;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    boolean tampada;

    void rabiscar()
    {
        if (this.tampada == false){
            System.out.println("Rabiscando");
        }else{
            System.out.println("Destampe a caneta");
        }
    }

    void tampar()
    {
        this.tampada = true;
    }

    void destampar()
    {
        this.tampada = false;
    }

    void status()
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Tampada? " + this.tampada);
    }
}
