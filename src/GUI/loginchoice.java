//\\package GUI;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import GUI.registrationForm;
//
//public class loginchoice {
//    private JPanel panel1;
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("loginchoice");
//        frame.setContentPane(new loginchoice().panel1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//    private JTextArea wouldYouLikeToTextArea;
//    private JButton loginButton;
//    private JButton createAccountButton;
//
//    public loginchoice() {
//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//
//            }
//        });
//        createAccountButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//             registrationForm regform =   new registrationForm();
//             registrationForm.setVisible(true);
//            }
//        });
//    }
//}
