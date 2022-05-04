import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {
    @Test
    public void compraUsd(){

        Moeda moeda = new Moeda("usd");
        Compra compra = new Compra(10.00f, moeda);

        assertEquals(52.50f, compra.comprar(compra));
    }
    @Test
    public void compraR$(){

        Moeda moeda = new Moeda("r$");
        Compra compra = new Compra(35.50f, moeda);

        assertEquals(35.50f, compra.comprar(compra));
    }
}
