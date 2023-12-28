
public class Produto
{
    // variáveis de instância 
    private String Nome;
    private double Preco;
    

    public Produto(String Nome, double Preco)
    {
        // inicializa variáveis de instância
        this.Nome = Nome;
        this.Preco = Preco;
        
    }

    //getters
    public String getNome(){
        return this.Nome;
    }

    public double getPreco(){
        return this.Preco;
    }

    
    //setters
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public void setPreco(double Preco){
        this.Preco = Preco;
    }

    public String toString(){
        return("Nome: " + Nome + " Preço: " + Preco );
    }

    
    }

   

