package generics;

import java.util.Objects;

public class Par<C, V> {

    private C chave;
    private V valor;


    public Par(V valor, C chave) {
        this.valor = valor;
        this.chave = chave;
    }

    public C getChave() {
        return chave;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return Objects.equals(chave, par.chave) && Objects.equals(valor, par.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chave, valor);
    }
}

