/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Produto;
import model.ProdutoCollection;
import view.InclusaoProdutoView;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cauã
 */
public class InclusaoProdutoPresenter {
    private Produto produto;
    private final InclusaoProdutoView view;
    private final ProdutoCollection produtos;

    public InclusaoProdutoPresenter(ProdutoCollection produtos) {
        this.produtos = produtos;
        this.view = new InclusaoProdutoView();
        
        this.view.setVisible(false);
        configuraView();
        this.view.setVisible(true);
    }

    private void configuraView() {
        view.getBtnIncluir().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    salvar();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        
        view.getBtnCancelar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                cancelar();
            }
        });
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
   
        double valor = produto.calcularPrecoVenda();
        String valorFormatado = String.valueOf(valor);
        view.getTxtPrecoVenda().setText(valorFormatado);

        inserirProdutosTabela();
        JOptionPane.showMessageDialog(view, "Produto incluído com sucesso!");
        limparCampos();
    }
    
    
    private void limparCampos(){
        view.getTxtNome().setText(null);
        view.getTxtPrecoCusto().setText(null);
        view.getTxtPercentualLucro().setText(null);
        view.getTxtPrecoVenda().setText(null);  
    }
    
    private void inserirProdutosTabela(){
        DefaultTableModel model = (DefaultTableModel) view.getTblProdutos().getModel();
        model.setRowCount(0);
        
        view.getTblProdutos().setModel(model);

            for (Produto produto : produtos.getProdutos()) {
                model.addRow(new Object[]{
                    produto.getNome(),
                    produto.getPrecoCusto(),
                    produto.getPercentualLucro(),
                    produto.getPrecoVenda()
                });
            }
    }

    private void cancelar() {
        view.dispose();
    }
}
