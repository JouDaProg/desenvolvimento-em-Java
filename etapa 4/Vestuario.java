

public class Vestuario extends Loja {

    boolean produtosImportados;

    public Vestuario(String nomeLojaVestuario,
            int quantidadeFuncionariosLojaVestuario,
            double salarioBaseFuncionarioLojaVestuario,
            Endereco enderecoLojaVestuario,
            Data dataFundacaoLojaVestuario,
            boolean produtosImportados,
            int tamanhoEstoqueLojaVestuario) {
        super(nomeLojaVestuario,
                quantidadeFuncionariosLojaVestuario,
                salarioBaseFuncionarioLojaVestuario,
                enderecoLojaVestuario,
                dataFundacaoLojaVestuario,
                tamanhoEstoqueLojaVestuario);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return getNome() 
        + "/" + getQuantidadeFuncionarios() 
        + "/" + getSalarioBaseFuncionario() 
        + "/" + getEndereco() 
        + "/" + getDataFundacao() 
        + "/" + produtosImportados;
    }
}