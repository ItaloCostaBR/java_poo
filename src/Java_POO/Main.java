package Java_POO;

public class Main {

    public static void main(String[] args) {
//        Caneta c1 = new Caneta();
//        c1.cor = "Azul";
//        c1.ponta = 0.5f;
//        c1.tampada = false;
//        c1.tampar();
////        c1.status();
//        c1.rabiscar();
//
//        System.out.println("");
//
//        Caneta c2 = new Caneta();
//        c2.modelo = "BIC";
//        c2.cor = "Preta";
//        c2.destampar();
////        c2.status();
//        c2.rabiscar();

//        Caneta c3 = new Caneta("BIC", "Vermelho", 1f);
//        c3.setModelo("BIC");
//        c3.setPonta(0.5f);
//        c3.status();


        Banco processo1 = new Banco();
        processo1.abrirConta("CC");
        processo1.setNumConta(11111);
        processo1.setTitularConta("Titular 1");
        processo1.depositar(100);
        processo1.sacar(150);
        processo1.fecharConta();

        Banco processo2 = new Banco();
        processo2.abrirConta("CP");
        processo2.setNumConta(22222);
        processo2.setTitularConta("Titular 2");
        processo2.depositar(500);
        processo2.sacar(550);


        System.out.println("-------------------");
        processo1.status();
        System.out.println("-------------------");
        processo2.status();

    }
}
