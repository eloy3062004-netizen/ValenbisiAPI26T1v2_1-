package tema4;
import java.awt.Graphics;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Window {
	private JFrame frame;
	protected Graphics g;
	private static Face f =new Face();
	private static Face.BaseClass [] refArray = new Face.BaseClass[5];
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
					refArray[0] = f.new Head();
					refArray[1] = f.new LeftEye();       
					refArray[2] = f.new RightEye();       
					refArray[3] = f.new Nose();       
					refArray[4] = f.new Mouth(); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Window() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1300, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				for (Face.BaseClass e: refArray) {                          	                
					g = panel.getGraphics();
					e.draw(g); } 
			}				
		});
		panel.add(btnNewButton);
	}
}
