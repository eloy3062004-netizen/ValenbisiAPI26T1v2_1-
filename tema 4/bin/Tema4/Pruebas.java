package Tema4;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;

public class Pruebas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label;
	private JPanel panel;
	private Box horizontalBox;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Pruebas frame = new Pruebas();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Pruebas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);

		contentPane = new JPanel();
		setContentPane(contentPane);

		textField = new JTextField(15);
		contentPane.add(textField);

		JButton boton = new JButton("Saludar");
		contentPane.add(boton);

		label = new JLabel("");
		contentPane.add(label);
		
		panel = new JPanel();
		contentPane.add(panel);
		
		horizontalBox = Box.createHorizontalBox();
		contentPane.add(horizontalBox);

		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = textField.getText(); 
				label.setText("Hello world" + texto);
			}
		});
	}
}
