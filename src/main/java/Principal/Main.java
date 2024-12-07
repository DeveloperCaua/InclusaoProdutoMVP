/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

import Presenter.InclusaoProdutoPresenter;

/**
 *
 * @author Cauã
 */
public class Main {
    public static void main(String[] args) {
        ProdutoCollection produtos = new ProdutoCollection();
        new InclusaoProdutoPresenter(produtos);
    }
}
