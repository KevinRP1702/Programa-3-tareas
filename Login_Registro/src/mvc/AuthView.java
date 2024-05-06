package mvc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class AuthView {

	JPanel panel;
	AuthModel modelo = new AuthModel();
	
	public AuthView() {
		 panel = new JPanel();
	}
	
	public JPanel login() {
		//Diseño del login
		
		
	    panel.setBackground(new Color(105, 105, 105));
	    panel.setBounds(0, 29, 488, 700);
	    panel.setLayout(null);

	    JLabel lblTitulo = new JLabel("Iniciar sesión");
	    lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 25));
	    lblTitulo.setForeground(new Color(255, 255, 255));
	    lblTitulo.setBounds(163, 120, 180, 38);
	    panel.add(lblTitulo);

	    JLabel lblNombreUsu = new JLabel("Ingrese el nombre de usuario");
	    lblNombreUsu.setFont(new Font("Tahoma", Font.BOLD, 13));
	    lblNombreUsu.setOpaque(true);
	    lblNombreUsu.setBackground(new Color(0, 0, 0));
	    lblNombreUsu.setForeground(new Color(255, 255, 255));
	    lblNombreUsu.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNombreUsu.setBounds(104, 192, 282, 28);
	    panel.add(lblNombreUsu);

	    JTextField txtNombreUsu = new JTextField();
	    txtNombreUsu.setBounds(104, 218, 282, 46);
	    panel.add(txtNombreUsu);
	    txtNombreUsu.setColumns(10);

	    JLabel lblContra2 = new JLabel("Ingrese su contraseña");
	    lblContra2.setOpaque(true);
	    lblContra2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblContra2.setForeground(Color.WHITE);
	    lblContra2.setFont(new Font("Tahoma", Font.BOLD, 13));
	    lblContra2.setBackground(Color.BLACK);
	    lblContra2.setBounds(104, 291, 282, 28);
	    panel.add(lblContra2);

	    JTextField txtContra2 = new JTextField();
	    txtContra2.setColumns(10);
	    txtContra2.setBounds(104, 317, 282, 46);
	    panel.add(txtContra2);

	    JButton btnLogin = new JButton("Login");
	    btnLogin.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	           
	        	if(modelo.login(txtNombreUsu.getText(), txtContra2.getText()) == false){
	        		txtNombreUsu.setBorder(new LineBorder(Color.red,2,true));
	        		txtContra2.setBorder(new LineBorder(Color.red,2,true));
	        	}else {
	        		txtNombreUsu.setBorder(new LineBorder(Color.green,2,true));
	        		txtContra2.setBorder(new LineBorder(Color.green,2,true));
	        	}
	        	
	        }
	    });
	    btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
	    btnLogin.setBounds(139, 408, 191, 38);
	    panel.add(btnLogin);

	    JButton bntSinCuenta = new JButton("¿No tiene cuenta?");
	    bntSinCuenta.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            
	        }
	    });
	    bntSinCuenta.setFont(new Font("Tahoma", Font.BOLD, 13));
	    bntSinCuenta.setBounds(139, 457, 192, 23);
	    panel.add(bntSinCuenta);

	    JButton btnNewButton = new JButton("¿Olvidó su contraseña?");
	    btnNewButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	           
	        }
	    });
	    btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
	    btnNewButton.setBounds(139, 491, 193, 23);
	    panel.add(btnNewButton);

	    JButton btnMostrar = new JButton("Mostrar info JSON");
	    btnMostrar.setFont(new Font("Tahoma", Font.BOLD, 11));
	    btnMostrar.setBounds(139, 542, 191, 23);
	    panel.add(btnMostrar);
		return panel;
	}
	
	public JPanel registro() {
		panel.setBackground(Color.green);
		return panel;
	}
}
