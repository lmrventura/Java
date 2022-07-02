package banco;
public class ClasseBanco {
    private int codigo;
    private int conta;
    private int agencia;
    private String tipo;
    private double saldo;

    public ClasseBanco(int codigo, int conta, int agencia, double saldo) {
        this.codigo = codigo;
        this.conta = conta;
        this.agencia = agencia;
        //this.tipo = tipo;
        this.saldo = saldo;
    }

    //this identifica o atributo da classe.
    public double depositar(double saldo){
        this.setSaldo(this.getSaldo() + saldo);
        return this.getSaldo();
    }
    
    public double sacar(double saldo){
        /*
        double taxa;
        taxa = this.saldo + 2;
        if(this.saldo < saldo){
            return 0;
        }else if(this.tipo.equals("Corrente")){
            this.saldo -= saldo;
            this.saldo -= 2;
            return this.saldo;
        }else{
            this.saldo -= saldo;
            return this.saldo;   
        }
        */
        if(this.getSaldo() < saldo){
            return 0;
        }else{
            this.setSaldo(this.getSaldo() - saldo);
        }
            return this.getSaldo();
    }
    
    public double sacar(double saldo, boolean corrente){
        if(this.getSaldo() < saldo){
            return 0;
        }else{
            this.setSaldo(this.getSaldo() - 2);
            this.setSaldo(this.getSaldo() - saldo);
        }
            return this.getSaldo();
    }
    
    @Override
    public String toString() {
        return "ClasseBanco{" + "codigo=" + codigo + ", conta=" + conta + ", agencia=" + agencia + ", tipo=" + tipo + ", saldo=" + saldo + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
