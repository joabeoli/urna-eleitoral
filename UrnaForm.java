package projetourna;

import javax.swing.text.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;

import javax.swing.JButton;


public abstract class UrnaForm extends JFrame {

    private static final int TAMANHO_TXT = 20;
    protected JPanel pnlForm1;
    protected JPanel pnlForm;
    protected JPanel pnlRodape;
    protected JButton btnUm;
    protected JButton btnDois;
    protected JButton btnTres;
    protected JButton btnQuatro;
    protected JButton btnCinco;
    protected JButton btnSeis;
    protected JButton btnSete;
    protected JButton btnOito;
    protected JButton btnNove;
    protected JButton btnZero;
    protected JButton btnBranco;
    protected JButton btnCorrigir;
    protected JButton btnConfirmar;
    protected JTextField txtCampo;

    public UrnaForm() {
        this.inicializar();
    }



    private void inicializar() {
        this.setTitle("Urna Eleitoral");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());

        this.getContentPane().add(getPnlForm(), BorderLayout.PAGE_START);
        this.getContentPane().add(getPnlForm1(), BorderLayout.CENTER);

        this.getContentPane().add(getPnlRodape(), BorderLayout.PAGE_END);
        this.pack();

    }
    JLabel lblInfo = new JLabel("<html>Digite o número do seu Voto: <br> <html> 55 para Marvel<br> <html> 50 para DC <br></html>");


    public JPanel getPnlForm() {
        if (pnlForm == null) {

            pnlForm = new JPanel(new FlowLayout(FlowLayout.CENTER));
            txtCampo = new JTextField(TAMANHO_TXT);
            txtCampo.setEditable(false);
            pnlForm.add(lblInfo, BorderLayout.NORTH);
            lblInfo.setFont(new Font("Arial", Font.BOLD, 15));
            lblInfo.setForeground(Color.GRAY);

            pnlForm.add(txtCampo);
            txtCampo.setForeground(Color.RED);


            txtCampo.setPreferredSize(new Dimension(100, 100));
            txtCampo.setHorizontalAlignment(JTextField.CENTER);


            txtCampo.setFont(new Font("Arial", Font.PLAIN, 20));
            ((AbstractDocument) txtCampo.getDocument()).setDocumentFilter(new DocumentFilter() {
                @Override
                public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                    String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
                    currentText = currentText.substring(0, offset) + text + currentText.substring(offset + length);
                    if (currentText.length() > 2) {
                        return;
                    }
                    super.replace(fb, offset, length, text, attrs);
                }
            });



        }
        return pnlForm;
    }


    public JPanel getPnlForm1() {
            if (pnlForm1 == null) {
                pnlForm1 = new JPanel(new GridLayout(4, 3,10,10));
                btnUm = new JButton(String.valueOf(1));
                btnDois = new JButton(String.valueOf(2));
                btnTres = new JButton(String.valueOf(3));
                btnQuatro = new JButton(String.valueOf(4));
                btnCinco = new JButton(String.valueOf(5));
                btnSeis = new JButton(String.valueOf(6));
                btnSete = new JButton(String.valueOf(7));
                btnOito = new JButton(String.valueOf(8));
                btnNove = new JButton(String.valueOf(9));
                btnZero = new JButton(String.valueOf(0));

                btnUm.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textoAtual = txtCampo.getText();
                        txtCampo.setText(textoAtual + "1");
                    }
                });
                btnDois.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textoAtual = txtCampo.getText();
                        txtCampo.setText(textoAtual + "2");
                    }
                });
                btnTres.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textoAtual = txtCampo.getText();
                        txtCampo.setText(textoAtual + "3");
                    }
                });
                btnQuatro.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textoAtual = txtCampo.getText();
                        txtCampo.setText(textoAtual + "4");
                    }
                });
                btnCinco.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textoAtual = txtCampo.getText();
                        txtCampo.setText(textoAtual + "5");
                    }
                });
                btnSeis.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textoAtual = txtCampo.getText();
                        txtCampo.setText(textoAtual + "6");
                    }
                });
                btnSete.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textoAtual = txtCampo.getText();
                        txtCampo.setText(textoAtual + "7");
                    }
                });
                btnOito.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textoAtual = txtCampo.getText();
                        txtCampo.setText(textoAtual + "8");
                    }
                });
                btnNove.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textoAtual = txtCampo.getText();
                        txtCampo.setText(textoAtual + "9");
                    }
                });
                btnZero.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textoAtual = txtCampo.getText();
                        txtCampo.setText(textoAtual + "0");
                    }
                });
                Font fonteNumeros = new Font("Arial", Font.PLAIN, 20);


                btnUm.setFont(fonteNumeros);
                btnDois.setFont(fonteNumeros);
                btnTres.setFont(fonteNumeros);
                btnQuatro.setFont(fonteNumeros);
                btnCinco.setFont(fonteNumeros);
                btnSeis.setFont(fonteNumeros);
                btnSete.setFont(fonteNumeros);
                btnOito.setFont(fonteNumeros);
                btnNove.setFont(fonteNumeros);
                btnZero.setFont(fonteNumeros);

                pnlForm1.add(btnUm);
                pnlForm1.add(btnDois);
                pnlForm1.add(btnTres);
                pnlForm1.add(btnQuatro);
                pnlForm1.add(btnCinco);
                pnlForm1.add(btnSeis);
                pnlForm1.add(btnSete);
                pnlForm1.add(btnOito);
                pnlForm1.add(btnNove);
                pnlForm1.add(new JLabel(""));
                pnlForm1.add(btnZero);


            }
            return pnlForm1;
        }
        public JPanel getPnlRodape() {
            if (pnlRodape == null) {
                pnlRodape = new JPanel(new FlowLayout(FlowLayout.CENTER));

                btnBranco = new JButton("Branco");
                btnCorrigir = new JButton("Corrigir");
                btnConfirmar = new JButton("Confirmar");
                btnConfirmar.setBackground(Color.GREEN);
                btnCorrigir.setBackground(Color.ORANGE);
                btnConfirmar.setPreferredSize(new Dimension(150, 50));
                btnCorrigir.setPreferredSize(new Dimension(150, 50));
                btnBranco.setPreferredSize(new Dimension(150, 50));


                pnlRodape.add(btnBranco);
                pnlRodape.add(btnCorrigir);
                pnlRodape.add(btnConfirmar);
            }
            return pnlRodape;

        }
    }


