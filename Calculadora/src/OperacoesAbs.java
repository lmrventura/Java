public abstract class OperacoesAbs{
    private double n1;
    private double n2;
    private String op;

    public OperacoesAbs() {
        this.n1 = 0;
        this.n2 = 0;
    }
    
    public double opPorcentagem(double n1, double n2){
        return 0;
    }
    
    public double somarESubtrair(double n1, double n2){
        return n1 + n2;
    }
    
    public float somarESubtrair(float n1, float n2){
        return n1 - n2;
    }
    
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}

