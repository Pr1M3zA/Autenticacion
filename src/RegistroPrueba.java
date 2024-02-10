import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*; 

public class RegistroPrueba {
	
	public static void main(String[] args) {
		Registro frame = new Registro();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Registro extends JFrame{
	
	public Registro() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		int posWidth =  screenWidth/4;
		int posHeight = screenHeight/2;
		
		setBounds(200,200,posWidth,posHeight);
		setLocationRelativeTo(null);
		setTitle("Sign up");
		setResizable(false);
		ImageIcon image = new ImageIcon("src\\Icon.png");
		setIconImage(image.getImage());
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, screenHeight, posWidth, posHeight);
		
		JButton button = new JButton("Aceptar");
		button.setBounds(posWidth/2, posHeight-posHeight/5, 120, 30);
		button.setBackground(new Color(228, 232, 255));
		add(button);
		JButton button2 = new JButton("Cancelar");
		button2.setBounds(posWidth/6, posHeight-posHeight/5, 120, 30);
		button2.setBackground(new Color(255, 228, 228));
		add(button2);
		
		Image newImage = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon logo = new ImageIcon(newImage);
		JLabel lImage = new JLabel(logo);
		lImage.setBounds(155, 9, 100, 100);
		add(lImage);
		
		JLabel lNewUser = new JLabel("Nuevo Usuario");
		lNewUser.setFont(new Font("Serif", Font.BOLD,30));
		lNewUser.setBounds((posWidth/4),75,500,100);
		add(lNewUser);
		
		JLabel lUser = new JLabel("Usuario");
		lUser.setFont(new Font("SansSerif", Font.PLAIN,15));
		lUser.setBounds(80,130,500,100);
		add(lUser);
		
		JLabel lEmail = new JLabel("Correo");
		lEmail.setFont(new Font("SansSerif", Font.PLAIN,15));
		lEmail.setBounds(80,200,500,100);
		add(lEmail);
		
		JLabel lPassword = new JLabel("Contraseña");
		lPassword.setFont(new Font("SansSerif", Font.PLAIN,15));
		lPassword.setBounds(80,270,500,100);
		add(lPassword);
		
		JTextField tUser = new JTextField();
		tUser.setFont(new Font("SansSerif", Font.PLAIN,15));
		tUser.setBounds(75, 190, 250, 30);
		add(tUser);
		
		JTextField tEmail = new JTextField();
		tEmail.setFont(new Font("SansSerif", Font.PLAIN,15));
		tEmail.setBounds(75, 260, 250, 30);
		add(tEmail);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(75, 330, 250, 30);
		add(password);
		
		JCheckBox cb = new JCheckBox("Acepto términos y condiciones", true);
		cb.setFont(new Font("SansSerif", Font.ITALIC,12));
		cb.setBounds(80, 370, 200, 40);
		add(cb);
	}
}
