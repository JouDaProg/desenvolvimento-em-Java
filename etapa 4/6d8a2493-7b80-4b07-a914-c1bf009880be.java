public class TesteFruta{
    public static void main(String[] args){
        Fruta f1 = new Fruta("Maça", 78.3);
        System.out.println("O preço da "+f1.getNome()+" é R$"+f1.getPreco());
        f1.setNome("Laranja");
        System.out.println("O nome novo da fruta é "+f1.getNome());
        f1.setPreco(8.3);
        System.out.println("O novo valor da fruta é: R$"+f1.getPreco());
        Fruta f2 = new Fruta("Abacate", 32.5);
        Fruta f3;
        f3 = new Fruta("Pêssego", 10.8);
        System.out.println("Valor das frutas com 10% de imposto:");
        double imposto = 0.1;
        System.out.println("- "+f1.getNome()+": "+f1.calculaPreco(imposto));
        System.out.println("- "+f2.getNome()+": "+f2.calculaPreco(imposto));
        System.out.println("- "+f3.getNome()+": "+f3.calculaPreco(imposto));
    }
}