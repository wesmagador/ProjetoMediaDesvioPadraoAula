
import java.util.ArrayList;

public class EstatisticasUmidade {
    private final ArrayList<Double> lstUmidade;

    public EstatisticasUmidade(){
        lstUmidade = new ArrayList<>();
    }

    public void setValor(double umidade){
        lstUmidade.add(umidade);
    }
    public double media(int amostra){
        double soma = 0.0;
        for (int i = 0; i < amostra; i++) {
            soma = soma + lstUmidade.get(i);
        }
        //return soma/lstUmidade.size();
        return soma/amostra;
    }

    public double desvioPadrao(int amostra){
        double media = media(amostra);
        double st = 0.0;
        for (int i = 0; i < amostra; i++) {
            st = st + Math.pow(lstUmidade.get(i) - media, 2);
        }
        //return st/amostra;
        return Math.pow(st/amostra, 0.5);
    }

}