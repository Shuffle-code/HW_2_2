
package Graphics;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationFrame {

    private static final int EXIT_CODE = 22;
    private final JFrame mainFrame;
    private JTextArea textArea = new JTextArea();
    private JScrollPane scrollPane;

    public ApplicationFrame(){
        mainFrame = new JFrame();
        mainFrame.setTitle("Chat V 1.0");
        mainFrame.setBounds(new Rectangle(100,100, 300, 500));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setJMenuBar(getJMenuBar());
        mainFrame.setLayout(new BorderLayout(0, 2));
        mainFrame.add(bigScreen(), BorderLayout.CENTER);
        mainFrame.add(createBottomPanel(textArea), BorderLayout.SOUTH);
        mainFrame.setVisible(true);
    }

    private JScrollPane bigScreen(){
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        mainFrame.add(scrollPane, BorderLayout.CENTER);
        return scrollPane;
    }

    private JPanel createBottomPanel(JTextArea textArea) {
        JPanel bottom = new JPanel();
        bottom.setLayout(new BorderLayout());
        JTextField textField = new JTextField();
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (!text.isEmpty()) {
                    textArea.setText(String.format("%s%s %s", textArea.getText(), "\n", textField.getText()));
                    textField.setText("");
                }
            }
        });
        JButton send = new JButton("Send");
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String text = textField.getText();
                if (!text.isEmpty()) {
                    textArea.setText(String.format("%s%s %s", textArea.getText(), "\n", textField.getText()));
                    textField.setText("");
                }
            }
        });
        bottom.add(textField, BorderLayout.CENTER);
        bottom.add(send, BorderLayout.EAST);

        return bottom;
    }




    private JMenuBar getJMenuBar(){
        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.add(getFilejMenu());
//        jMenuBar.add(getFilejMenu());
        jMenuBar.add(getToolsJMenu());

//        jMenuBar.add(getFilejMenu());
        return jMenuBar;
    }
    private JMenu getFilejMenu(){
        JMenu jMenu = new JMenu();
        jMenu.setText("File");

        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem closeMenuItem = new JMenuItem("Close");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        exitMenuItem.addActionListener(e -> System.exit(EXIT_CODE));
//        {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(EXIT_CODE);
//            }
//        });

        jMenu.add(openMenuItem);
        jMenu.add(closeMenuItem);
        jMenu.add(exitMenuItem);
        return jMenu;
    }

    private JMenu getToolsJMenu(){
        JMenu jMenu = new JMenu("Tools");
        JMenuItem setFileAsTemplateJMenu = new JMenuItem("Set file as template ...");
        JMenuItem httpClientJMenu = new JMenuItem("Http client");
        jMenu.add(setFileAsTemplateJMenu);
        jMenu.add(httpClientJMenu);
        return jMenu;
    }

    private MenuBar getMenuBar(){
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu();
        MenuItem file = new MenuItem();
        file.setLabel("file");


        menu.add(file);
        menuBar.add(menu);

        return menuBar;
    }

}
