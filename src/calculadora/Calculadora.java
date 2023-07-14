package calculadora;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Calculadora implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JTextField campoDigitos;
    private JButton botao0;
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton botaoSoma;
    private JButton botaoSubtracao;
    private JButton botaoMultiplicacao;
    private JButton botaoDivisao;
    private JButton botaoIgual;
    private JButton botaoApagar;
    private JButton botaoPonto;
    private JButton botaoPotencia;
    private String valorTotalCampoDigitos;
    private double valorTotalCalculado;

    public Calculadora() {
        valorTotalCampoDigitos = "";
        frame = new JFrame();
        panel = new JPanel();
        campoDigitos = new JTextField();
        botao0 = new JButton("0");
        botao1 = new JButton("1");
        botao2 = new JButton("2");
        botao3 = new JButton("3");
        botao4 = new JButton("4");
        botao5 = new JButton("5");
        botao6 = new JButton("6");
        botao7 = new JButton("7");
        botao8 = new JButton("8");
        botao9 = new JButton("9");
        botaoSoma = new JButton("+");
        botaoSubtracao = new JButton("-");
        botaoMultiplicacao = new JButton("*");
        botaoDivisao = new JButton("/");
        botaoPotencia = new JButton("^");
        botaoIgual = new JButton("=");
        botaoApagar = new JButton("C");
        botaoPonto = new JButton(".");
        iniciarPanel();
        iniciarFrame();
        botao0.addActionListener(this);
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener(this);
        botao4.addActionListener(this);
        botao5.addActionListener(this);
        botao6.addActionListener(this);
        botao7.addActionListener(this);
        botao8.addActionListener(this);
        botao9.addActionListener(this);
        botaoPonto.addActionListener(this);
        botaoApagar.addActionListener(this);
        botaoIgual.addActionListener(this);
        botaoSoma.addActionListener(this);
        botaoSubtracao.addActionListener(this);
        botaoMultiplicacao.addActionListener(this);
        botaoDivisao.addActionListener(this);
        botaoPotencia.addActionListener(this);
    }

    public void iniciarFrame() {
        frame.setTitle("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setSize(291, 367);
        frame.add(panel);
        frame.setVisible(true);
    }

    public void iniciarPanel() {

        panel.setLayout(null);
        panel.setBackground(new Color(0x2b2c30));
        editarCampoDigitos();
        editarBotoes();

        panel.add(campoDigitos);
        panel.add(botao0);
        panel.add(botao1);
        panel.add(botao2);
        panel.add(botao3);
        panel.add(botao4);
        panel.add(botao5);
        panel.add(botao6);
        panel.add(botao7);
        panel.add(botao8);
        panel.add(botao9);
        panel.add(botaoPonto);
        panel.add(botaoIgual);
        panel.add(botaoApagar);
        panel.add(botaoSoma);
        panel.add(botaoSubtracao);
        panel.add(botaoMultiplicacao);
        panel.add(botaoDivisao);
        panel.add(botaoPotencia);

        campoDigitos.setBounds(7, 7, 277, 70);
        botao0.setBounds(7, 289, 135, 40);
        botao1.setBounds(7, 239, 65, 40);
        botao2.setBounds(77, 239, 65, 40);
        botao3.setBounds(147, 239, 65, 40);
        botao4.setBounds(7, 189, 65, 40);
        botao5.setBounds(77, 189, 65, 40);
        botao6.setBounds(147, 189, 65, 40);
        botao7.setBounds(7, 139, 65, 40);
        botao8.setBounds(77, 139, 65, 40);
        botao9.setBounds(147, 139, 65, 40);
        botaoPonto.setBounds(147, 289, 65, 40);
        botaoIgual.setBounds(219, 239, 65, 90);
        botaoApagar.setBounds(219, 189, 65, 40);
        botaoSoma.setBounds(7, 89, 65, 40);
        botaoSubtracao.setBounds(77, 89, 65, 40);
        botaoMultiplicacao.setBounds(147, 89, 65, 40);
        botaoDivisao.setBounds(219, 89, 65, 40);
        botaoPotencia.setBounds(219, 139, 65, 40);
    }

    public void editarCampoDigitos() {
        campoDigitos.setFont(new Font("Arial", Font.PLAIN, 30));
        campoDigitos.setBackground(new Color(0x2b2c30));
        campoDigitos.setForeground(new Color(0xdce0e6));
        campoDigitos.setEditable(false);
    }

    public void editarBotoes() {
        Color corBotao = new Color(0x453745);
        Color corBotaoEspecial = new Color(0xff1457);
        Color corDigitoBotao = new Color(0xdce0e6);

        botao0.setBackground(corBotao);
        botao0.setForeground(corDigitoBotao);
        botao0.setFocusable(false);

        botao1.setBackground(corBotao);
        botao1.setForeground(corDigitoBotao);
        botao1.setFocusable(false);

        botao2.setBackground(corBotao);
        botao2.setForeground(corDigitoBotao);
        botao2.setFocusable(false);

        botao3.setBackground(corBotao);
        botao3.setForeground(corDigitoBotao);
        botao3.setFocusable(false);

        botao4.setBackground(corBotao);
        botao4.setForeground(corDigitoBotao);
        botao4.setFocusable(false);

        botao5.setBackground(corBotao);
        botao5.setForeground(corDigitoBotao);
        botao5.setFocusable(false);

        botao6.setBackground(corBotao);
        botao6.setForeground(corDigitoBotao);
        botao6.setFocusable(false);

        botao7.setBackground(corBotao);
        botao7.setForeground(corDigitoBotao);
        botao7.setFocusable(false);

        botao8.setBackground(corBotao);
        botao8.setForeground(corDigitoBotao);
        botao8.setFocusable(false);

        botao9.setBackground(corBotao);
        botao9.setForeground(corDigitoBotao);
        botao9.setFocusable(false);

        botaoPonto.setBackground(corBotao);
        botaoPonto.setForeground(corDigitoBotao);
        botaoPonto.setFocusable(false);

        botaoSoma.setBackground(corBotao);
        botaoSoma.setForeground(corDigitoBotao);
        botaoSoma.setFocusable(false);

        botaoSubtracao.setBackground(corBotao);
        botaoSubtracao.setForeground(corDigitoBotao);
        botaoSubtracao.setFocusable(false);

        botaoMultiplicacao.setBackground(corBotao);
        botaoMultiplicacao.setForeground(corDigitoBotao);
        botaoMultiplicacao.setFocusable(false);

        botaoDivisao.setBackground(corBotao);
        botaoDivisao.setForeground(corDigitoBotao);
        botaoDivisao.setFocusable(false);

        botaoPotencia.setBackground(corBotao);
        botaoPotencia.setForeground(corDigitoBotao);
        botaoPotencia.setFocusable(false);

        botaoIgual.setBackground(corBotaoEspecial);
        botaoIgual.setForeground(corDigitoBotao);
        botaoIgual.setFocusable(false);
        botaoIgual.setFont(new Font("Arial", Font.PLAIN, 22));

        botaoApagar.setBackground(corDigitoBotao);
        botaoApagar.setForeground(corBotao);
        botaoApagar.setFocusable(false);
    }

    public List<String> retornarListaEquacao() {
        String novaEquacaoString;
        if(valorTotalCampoDigitos.charAt(0) == '-'
            || valorTotalCampoDigitos.charAt(0) == '+'){
        novaEquacaoString = valorTotalCampoDigitos.charAt(0) + valorTotalCampoDigitos.substring(1)
                        .replace("+", "§+§").replace(("-"), "§-§").replace("*", "§*§")
                        .replace("/", "§/§").replace("^", "§^§");
        } else {
            novaEquacaoString = valorTotalCampoDigitos.replace("+", "§+§").replace(("-"), "§-§")
                    .replace("*", "§*§").replace("/", "§/§").replace("^", "§^§");
        }

        String[] equacaoArray = novaEquacaoString.split("§");
        List<String> listaEquação = new ArrayList<>();
        for (String valor: equacaoArray) {
            listaEquação.add(valor);
        }

        return listaEquação;
    }

    public void calcula() {
        List<String> equacaoLista = retornarListaEquacao();

        double operacao = 0;
        int i = 0;
        while (equacaoLista.size() != 1) {

            if (equacaoLista.contains("^")) {

                if (equacaoLista.get(i).equals("^")) {
                    double primeiroNumero = Double.parseDouble(equacaoLista.get(i - 1));
                    double segundoNumero = Double.parseDouble(equacaoLista.get(i + 1));

                    operacao = Math.pow(primeiroNumero, segundoNumero);
                    equacaoLista.remove(i + 1);
                    equacaoLista.remove(i);
                    equacaoLista.set(i - 1, Double.toString(operacao));
                    i = -1;
                }
            } else if (equacaoLista.contains("*")
                        || equacaoLista.contains("/")) {

                if (equacaoLista.get(i).equals("*")) {
                    double primeiroNumero = Double.parseDouble(equacaoLista.get(i - 1));
                    double segundoNumero = Double.parseDouble(equacaoLista.get(i + 1));

                    operacao = primeiroNumero * segundoNumero;
                    equacaoLista.remove(i+1);
                    equacaoLista.remove(i);
                    equacaoLista.set(i - 1, Double.toString(operacao));
                    i = -1;
                } else if (equacaoLista.get(i).equals("/")) {
                    double primeiroNumero = Double.parseDouble(equacaoLista.get(i - 1));
                    double segundoNumero = Double.parseDouble(equacaoLista.get(i + 1));

                    operacao = primeiroNumero / segundoNumero;
                    equacaoLista.remove(i+1);
                    equacaoLista.remove(i);
                    equacaoLista.set(i - 1, Double.toString(operacao));
                    i = -1;
                }
            } else  {

                if (equacaoLista.get(i).equals("+")) {
                    double primeiroNumero = Double.parseDouble(equacaoLista.get(i - 1));
                    double segundoNumero = Double.parseDouble(equacaoLista.get(i + 1));

                    operacao = primeiroNumero + segundoNumero;
                    equacaoLista.remove(i+1);
                    equacaoLista.remove(i);
                    equacaoLista.set(i - 1, Double.toString(operacao));
                    i = -1;
                } else if (equacaoLista.get(i).equals("-")) {
                    double primeiroNumero = Double.parseDouble(equacaoLista.get(i - 1));
                    double segundoNumero = Double.parseDouble(equacaoLista.get(i + 1));

                    operacao = primeiroNumero - segundoNumero;
                    equacaoLista.remove(i+1);
                    equacaoLista.remove(i);
                    equacaoLista.set(i - 1, Double.toString(operacao));
                    i = -1;
                }
            }

            i++;
        }

        valorTotalCalculado = Double.parseDouble(equacaoLista.get(0));
        valorTotalCampoDigitos = equacaoLista.get(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoPonto) {
            campoDigitos.setText(valorTotalCampoDigitos + ".");
            valorTotalCampoDigitos += ".";

        } else if (e.getSource() == botaoApagar) {
            campoDigitos.setText("");
            valorTotalCampoDigitos = "";
            valorTotalCalculado = 0;

        } else if (e.getSource() == botaoIgual) {
            try {
                calcula();
                campoDigitos.setText(valorTotalCampoDigitos);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Expressão mal formada"
                                                ,"",JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JButton botao = (JButton) e.getSource();
            campoDigitos.setText(valorTotalCampoDigitos + botao.getText());
            valorTotalCampoDigitos += botao.getText();
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
    }
}