package Java_POO;

public class Banco {

    int numConta;
    protected String tipoConta;
    private String contaCorrente = "CC";
    private String contaPoupanca = "CP";

    private String titularConta;
    private float saldoConta;
    private boolean status;

    public Banco() {
        this.setStatus(false);
        this.setSaldoConta(0);
    }

    public void status()
    {
        System.out.println("Número de conta: " + this.getNumConta());
        System.out.println("Titular da Conta: " + this.getTitularConta());
        System.out.println("Tipo de conta: " + this.getTipoConta());
        System.out.println("Saldo: R$ " + this.getSaldoConta());
        System.out.println("Status da conta: " + this.getStatus());
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
        if(tipoConta.equals(this.contaCorrente)){
            this.tipoConta = "Conta corrente";
        } else if(tipoConta.equals(this.contaPoupanca)){
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

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipoConta)
    {
        this.setTipoConta(tipoConta);
        this.setStatus(true);

        if(tipoConta.equals(this.contaCorrente)){
            this.setSaldoConta(50);
        }else if(tipoConta.equals(this.contaPoupanca)){
            this.setSaldoConta(150);
        }

    }

    public void fecharConta()
    {
        if(this.getSaldoConta() < 0){
            System.out.println("Você está em débito!");
        } else if (this.getSaldoConta() > 0) {
            System.out.println("Saque o dinheiro para poder fechar a conta");
        } else {
            System.out.println("Fechando conta...");
            this.setStatus(false);
        }
    }

    public void depositar(float valor)
    {
        if (this.getStatus()) {
            this.setSaldoConta(this.getSaldoConta() + valor);
            System.out.println("Depósito realizado na conta de: " + this.getTitularConta());
        } else {
            System.out.println("Não foi possível realizar depósito!");
        }
    }

    public void sacar(float valor)
    {
        if(this.getStatus()){
            if(this.getSaldoConta() >= valor){
                this.setSaldoConta(getSaldoConta() - valor);
                System.out.println("Saque no valor de: R$ " + valor + " na conta de: " + this.getTitularConta());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível realizar saque. Conta fechada!");
        }
    }

    public void pagarMensalidade()
    {
        float value = 0;

        if(getTipoConta().equals(this.contaCorrente)){
            value = 12;
        } else if (getTipoConta().equals(this.contaPoupanca)){
            value = 20;
        }

        if(this.getStatus()){
            this.setSaldoConta(this.getSaldoConta() - value);
            System.out.println("Anuidade paga com sucesso!");
        } else {
            System.out.println("Sua conta está fechada!");
        }
    }
}
