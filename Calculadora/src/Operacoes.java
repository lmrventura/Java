public class Operacoes extends OperacoesAbs implements Calculos{
    @Override
    public double dividir(double n1, double n2){
        if(n2 == 0){
            return 0;
        }else{
            return n1 / n2;
        }
    }
    
    @Override
    public double multiplicar(double n1, double n2){
        return n1 * n2;
    }
    
    @Override
    public double opPorcentagem(double n1, double n2){
        return (n1 * n2) / 100;
    }
}
