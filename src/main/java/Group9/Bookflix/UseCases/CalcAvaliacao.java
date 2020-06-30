package Group9.Bookflix.UseCases;

import Group9.Bookflix.Entities.Livro;

//@Component
public class CalcAvaliacao {

    public void calculaAva(Livro livro, int novaAva) {
        int novaAvaG = livro.getAvaliacao() + novaAva;
        livro.setAvaliacao(novaAvaG/2);
    }
}