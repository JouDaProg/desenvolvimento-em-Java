public class Data
{
    // variáveis de instância
    private int dia;
    private int mes;
    private int ano;
    private boolean verificaAnoBissexto;
    // Construtor para objetos da classe Data
    public Data(int dia, int mes, int ano) {
        if (verificaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            System.out.println("perfeito :)");
        } else {
            System.out.println("Data inválida. Alterando para 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }
    
    //getters
    public int getDia(){
        return this.dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    //setters
    public void setDia(int Dia){
        this.dia  = Dia;
    }
    
    public void setMes(int Mes){
        this.mes = Mes;
    }
    
    public void setAno(int Ano){
        this.ano = Ano;
    }
    
    public boolean verificaAnoBissexto() {
        if(ano % 4 == 0) {
            return true;
        }else {
            return false;
        }
    }

    private boolean verificaData(int dia, int mes, int ano) {
        if(mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int diasMes = 0;

        switch(mes) {
            case 2:
                if(verificaAnoBissexto()) {
                    System.out.println("ano recebendo 29");
                    diasMes = 29;
                } else {
                    System.out.println("ano recebendo 28");
                    diasMes = 28;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;

            default: 
                diasMes = 31;
                break;
        }

        if(dia > diasMes) {
            return false;

        }return true;

    }
    public String toString(){
       return(dia + "/" + mes + "/" + ano);
    }
}