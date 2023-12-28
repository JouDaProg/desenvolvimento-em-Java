

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private char tamanhoDaLoja;
    private int gastosComSalario;
//construtor 2 = retorna apenas 2 atributos.
public Loja(String nome, int quantidadeFuncionarios ){
    this.nome = nome;
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    this.salarioBaseFuncionario = -1;
      
    
    }    
    //construtor 1 = inicializa todos os atributos.
public Loja(String Nome, int QuantidadeFuncionarios, double SalarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = QuantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
          
       
    }

public String getNome(){
    return nome;

    }

    public void setNome(String nome){
        nome = nome;
    }

    public int getQuantidadeFuncionarios(){
    return quantidadeFuncionarios;

    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
    this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
    return salarioBaseFuncionario;

    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
    this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return (salarioBaseFuncionario * quantidadeFuncionarios);
        }

    }

    // Método tamanho da loja
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

}