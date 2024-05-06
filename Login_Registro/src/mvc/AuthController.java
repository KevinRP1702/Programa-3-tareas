package mvc;

import javax.swing.JFrame;

public class AuthController {
private JFrame frame;
private AuthView view;
	
	
	public AuthController() {
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 504, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		view = new AuthView();
	}
	
	public void login() {
		frame.add(view.login());
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
}
