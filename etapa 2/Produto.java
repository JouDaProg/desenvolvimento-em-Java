
public class Produto
{
    // variáveis de instância 
    private String Nome;
    private double preco;
    private Data DataValidade;

    public Produto(String nome, double preco,Data DataValidade)
    {
        // inicializa variáveis de instância
        this.Nome = Nome;
        this.preco = preco;
        this.DataValidade = DataValidade;
    }

    //getters
    public String getNome(){
        return this.Nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public Data getDataValidade(){
        return this.DataValidade;
    }

    //setters
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setDataValidade(Data DataValidade){
        this.DataValidade = DataValidade;
    }

    public boolean estaVencido(Data dataRecebida){

        if(dataRecebida.getAno() < DataValidade.getAno()) 
            return false;
        else if(dataRecebida.getAno() == DataValidade.getAno()) 
            if(dataRecebida.getMes() < DataValidade.getMes()) 
                return false;    
            else if(dataRecebida.getMes() == DataValidade.getMes()) 
                if(dataRecebida.getDia() <= DataValidade.getDia()) 
                    return false;    

        return true; 
    }
    @Override
    public String toString(){
        return Nome +" / "+ preco +" / "+ DataValidade;
    }
}



