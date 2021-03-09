/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

import javax.swing.*;
import prova2.*;

/**
 *
 * @author Fernanda
 */
public class LimiteProduto {

    private ControleProduto ctrProd;

    public LimiteProduto(ControleProduto objPControleProd) throws Exception{
        ctrProd = objPControleProd;
        CapturaDados();
    }

    private void CapturaDados() throws Exception {
        int escolha;
        do {
            do {
                String escolhaInformada
                        = JOptionPane.showInputDialog(
                                "Escolha uma opção do menu:\n"
                                + "[1] Adiciona produto\n"
                                + "[2] Remove produtos\n"
                                + "[3] Altera produto\n"
                                + "[4] Consulta produto\n"
                                + "[5] Lista produtos\n"
                                + "[6] Finaliza");
                escolha = Integer.parseInt(escolhaInformada);
            } while ((escolha < 1) || (escolha > 6));
            if (escolha != 6) {
                execEscolha(escolha);
            } else {
                System.exit(0);
            }
        } while (true);
    }

    private void execEscolha(int intPEscolha) throws Exception {
        switch (intPEscolha) {
            case 1: {
                cadastraProduto();
                break;
            }
            case 2: {
                String codigoRem = JOptionPane.showInputDialog(
                        "Digite o codigo do produto a ser removido");
                int codigo = Integer.parseInt(codigoRem);
                removeProduto(codigo);
                break;
            }
            case 3: {
            try{
            int codigo = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Digite o código do produto a ser alterado"));
            float preco = Float.parseFloat(
                        JOptionPane.showInputDialog(
                                "Digite o novo preço"));
            float desconto = Float.parseFloat(
                        JOptionPane.showInputDialog(
                                "Digite o novo desconto"));
                alteraProduto(codigo, preco, desconto);
            }
            catch(Exception exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(), "Desconto inválido",
                JOptionPane.ERROR_MESSAGE);
            }
                break;
            }
            case 4: {
                int codigo = Integer.parseInt(
                        JOptionPane.showInputDialog(
                                "Digite o código do produto"));
                imprimeProduto(codigo);
                break;
            }
            case 5: {
                imprimeProdutos();
                break;
            }
        }
    }

    private void cadastraProduto() {
        try {
            String retorno = JOptionPane.showInputDialog(
                    "Informe o codigo");
            int codigo = Integer.parseInt(retorno);

            String descricao = JOptionPane.showInputDialog(
                    "Informe a descricao");

            String retorno2 = JOptionPane.showInputDialog(
                    "Informe o preco");
            float preco = Float.parseFloat(retorno2);

            String retorno3 = JOptionPane.showInputDialog(
                    "Informe o desconto");
            float desconto = Float.parseFloat(retorno3);

            ctrProd.insereProduto(codigo, descricao, preco, desconto);
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, exc.getMessage(), "Erro",
                    JOptionPane.ERROR_MESSAGE);

        }
    }

    public void imprimeProdutos() {
        JOptionPane.showMessageDialog(null, ctrProd.imprimeProdutos(), "Relação de Produtos", JOptionPane.INFORMATION_MESSAGE);
    }

    private void removeProduto(int pCodigo) {
        ctrProd.removeProduto(pCodigo);
        JOptionPane.showMessageDialog(null, "Produto removido", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void imprimeProduto(int pCodigo) {
        JOptionPane.showMessageDialog(null, ctrProd.imprimeProduto(pCodigo), "Informações do produto", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void alteraProduto(int pCodigo, float pPreco, float pDesconto) throws Exception{
        JOptionPane.showMessageDialog(null, ctrProd.alteraProduto(pCodigo, pPreco, pDesconto), "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
}
