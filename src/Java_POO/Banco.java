package Java_POO;

public class Banco {

    int numConta;
    protected String tipoConta;
    private String titularConta;
    private double saldoConta;
    private boolean status;

    public Banco() {
        this.setStatus(false);
        this.setSaldoConta(0.0);
    }

    public void status()
    {
        System.out.println("Número de conta: " + this.getNumConta());
        System.out.println("Titular da Conta: " + this.getTitularConta());
        System.out.println("Tipo de conta: " + this.getTipoConta());
        System.out.println("Saldo: R$ " + this.getSaldoConta());
        System.out.println("Status da conta: " + this.isStatus());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        if(tipoConta.equals("cc")){
            this.tipoConta = "Conta corrente";
        } else if(tipoConta.equals("cp")){
            this.tipoConta = "Conta poupança";
        } else {
            this.tipoConta = "Tipo de conta inexistente";
        }
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipoConta)
    {
        this.setTipoConta(tipoConta);
        this.setStatus(true);
        if(tipoConta.equals("CC")){
            this.setSaldoConta(50.0);
        }else if(tipoConta.equals("CP")){
            this.setSaldoConta(150.0);
        }

    }

    public void fecharConta()
    {
        if(this.getSaldoConta() > 0){
            System.out.println("Saque o dinheiro para poder fechar a conta");
        }
    }

    public void depositar()
    {

    }

    public void sacar()
    {

    }

    public void pagarMensalidade()
    {

    }
}
