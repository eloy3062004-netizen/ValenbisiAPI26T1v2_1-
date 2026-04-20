package Tema4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Scanner;
public class Prueba2 extends JFrame {

	    private JTextField txtFile;
	    private JTextArea txtArea;
	    private JButton btnBrowse;

	    public Prueba2() {
	        setTitle("Reading from a Text File");
	        setSize(500, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        JPanel topPanel = new JPanel(new BorderLayout(5, 5));

	        JLabel lblFile = new JLabel("File:");
	        txtFile = new JTextField();
	        btnBrowse = new JButton("...");

	        topPanel.add(lblFile, BorderLayout.WEST);
	        topPanel.add(txtFile, BorderLayout.CENTER);
	        topPanel.add(btnBrowse, BorderLayout.EAST);

	        txtArea = new JTextArea();
	        JScrollPane scrollPane = new JScrollPane(txtArea);

	        add(topPanel, BorderLayout.NORTH);
	        add(scrollPane, BorderLayout.CENTER);

	        btnBrowse.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                openFile();
	            }
	        });
	    }

	    private void openFile() {
	        JFileChooser f = new JFileChooser();

	        int sele = f.showOpenDialog(this);

	        if (sele == JFileChooser.APPROVE_OPTION) {

	            File file = f.getSelectedFile();

	            txtFile.setText(file.getAbsolutePath());

	            try {
	                Scanner s = new Scanner(file);
	                txtArea.setText(""); 

	                while (s.hasNextLine()) {
	                    txtArea.append(s.nextLine() + "\n");
	                }

	                s.close();

	            } catch (Exception ex) {
	                JOptionPane.showMessageDialog(this,
	                        "Error reading file",
	                        "Error",
	                        JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        new Prueba2().setVisible(true);
	    }
	

	}


