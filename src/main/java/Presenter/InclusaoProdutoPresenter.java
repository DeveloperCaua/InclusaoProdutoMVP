/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presenter;

import Model.Produto;
import Principal.ProdutoCollection;
import View.InclusaoProdutoView;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Cauã
 */
public class InclusaoProdutoPresenter {
    private Produto produto;
    private final InclusaoProdutoView view;
    private final ProdutoCollection produtos;
    private final JFrame frame;

    public InclusaoProdutoPresenter(ProdutoCollection produtos) {
        this.produtos = produtos;

        this.frame = new JFrame("Inclusão de Produto");
        this.view = new InclusaoProdutoView();
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(view);
        frame.pack();
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);

        configuraView();
    }

    private void configuraView() {
        this.view.getBtnIncluir().addActionListener(e -> {
            try {
                salvar();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
        });

        this.view.getBtnCancelar().addActionListener(e -> cancelar());
    }

    private void salvar() {
        String nome = view.getTxtNome().getText();
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome do produto é obrigatório");
        }

        double precoCusto = Double.parseDouble(view.getTxtPrecoCusto().getText());
        if (precoCusto <= 0) {
            throw new IllegalArgumentException("Preço de custo deve ser maior que zero");
        }

        double percentualLucro = Double.parseDouble(view.getTxtPercentualLucro().getText());
        if (percentualLucro <= 0) {
            throw new IllegalArgumentException("Percentual de lucro deve ser maior que zero");
        }

        produto = new Produto(nome, precoCusto, percentualLucro);
        produtos.incluir(produto);
   
        double valorFinal = produto.calcularPrecoVenda();
        view.setTxtPrecoVenda(valorFinal);

        JOptionPane.showMessageDialog(frame, "Produto incluído com sucesso!");
    }

    private void cancelar() {
        frame.dispose();
    }
}
