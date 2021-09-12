public class Compra extends PagamentoAdapter{
   public float valor;
   public PagamentoAdapter ValorMoeda;
   public Moeda moeda;

   public Compra(float valor, Moeda moeda){
       this.valor = valor;
       this.moeda = moeda;
       PagamentoAdapter ValorMoeda = new PagamentoAdapter();
   }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public float comprar(Compra compra){

        float valorFinal = compra.valorMoeda(compra.moeda) * compra.valor;
        return valorFinal;
    }
}
