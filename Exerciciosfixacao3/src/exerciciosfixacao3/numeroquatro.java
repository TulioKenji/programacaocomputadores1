package exerciciosfixacao3;

import java.util.Date;

import java.util.Calendar;

public class numeroquatro {
    public static void main(String[] args) {
        Data mydate = new Data(28,02,2004);
        mydate.dataAtual();
        
        
    }        
}

class Data{
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if( (mes>0) && (mes<13) ){
            this.mes = mes;
        } else if( (dia>0) && ((dia==30) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))) && 
                ((dia==31) && ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12))) &&
                ((dia == 28) && (mes == 2)) ){
            this.dia = dia;
        }
        
        
        this.ano = ano;
    }
    
    
    
    public void dataAtual(){
        Calendar dataatual = Calendar.getInstance();
        System.out.println(dataatual.get(Calendar.DAY_OF_MONTH)+" / "+((dataatual.get(Calendar.MONTH))+1)+" / "+dataatual.get(Calendar.YEAR));
        
    }
}