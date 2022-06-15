package sets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window {

    private static JFrame frame;
    private static String title;

    public Window(int largura, int altura, int tamGrid, String title, Field field){

        Window.title = title;
        frame = new JFrame(title);

        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(largura, altura));
        frame.setMinimumSize(new Dimension(largura, altura));
        frame.setMaximumSize(new Dimension(largura, altura));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel painel = new Grid(new GridLayout(tamGrid, tamGrid), field);
        frame.setContentPane(painel);
        frame.pack();

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_R)
                {

                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

}