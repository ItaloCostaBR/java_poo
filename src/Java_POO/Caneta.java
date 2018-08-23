package Java_POO;

public class Caneta {
//    String modelo;
//    String cor;
//    float ponta;
//    boolean tampada;
//
//    void rabiscar()
//    {
//        if (this.tampada == false){
//            System.out.println("Rabiscando");
//        }else{
//            System.out.println("Destampe a caneta");
//        }
//    }
//
//    void tampar()
//    {
//        this.tampada = true;
//    }
//
//    void destampar()
//    {
//        this.tampada = false;
//    }
//
//    void status()
//    {
//        System.out.println("Modelo: " + this.modelo);
//        System.out.println("Caneta: " + this.cor);
//        System.out.println("Ponta: " + this.ponta);
//        System.out.println("Tampada? " + this.tampada);
//    }

    private String modelo;
    private String cor;
    private float ponta;

    public Caneta(String model, String color, float penTip)
    {
        this.setModelo(model);
        this.setCor(color);
        this.setPonta(penTip);
    }

    public String getModelo()
    {
        return this.modelo;
    }

    public void setModelo(String m)
    {
        this.modelo = m;
    }

    public String getCor()
    {
        return this.cor;
    }

    public void setCor(String c)
    {
        this.cor = c;
    }

    public float getPonta()
    {
        return this.ponta;
    }

    public void setPonta(float p)
    {
        this.ponta = p;
    }

    public void status()
    {
        System.out.println("Sobre a Caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
    }
}
