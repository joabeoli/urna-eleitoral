package projetourna;

import javax.swing.*;

public class Aplicacao {

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() ->{
                UrnaEle  urna1 = new UrnaEle();
                urna1.setVisible(true);
            });

        }
    }



