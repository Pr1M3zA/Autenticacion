import java.awt.Color;
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
		
		setBounds(200,200,405,500);
		setLocationRelativeTo(null);
		setTitle("Sign up");
		setResizable(false);
		ImageIcon image = new ImageIcon("src\\Icon.png");
		setIconImage(image.getImage());
		setLayout(null);
		
		JButton button = new JButton("Aceptar");
		button.setBounds(75, 420, 120, 30);
		button.setBackground(new Color(228, 232, 255));
		add(button);
		JButton button2 = new JButton("Cancelar");
		button2.setBounds(205, 420, 120, 30);
		button2.setBackground(new Color(255, 228, 228));
		add(button2);
		
		Image newImage = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon logo = new ImageIcon(newImage);
		JLabel lImage = new JLabel(logo);
		lImage.setBounds(145, 9, 100, 100);
		add(lImage);
		
		JLabel lNewUser = new JLabel("Nuevo Usuario");
		lNewUser.setFont(new Font("Serif", Font.BOLD,30));
		lNewUser.setBounds(100,80,500,100);
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
		cb.setBounds(100, 370, 200, 40);
		add(cb);
	}
}
