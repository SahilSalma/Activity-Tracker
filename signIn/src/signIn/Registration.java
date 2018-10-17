package signIn;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.TextField;
import java.awt.ScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import java.awt.Choice;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField FirstName_f;
	private JTextField LastName_f;
	private JTextField Username_f;
	private JTextField Email_f;
	private JTextField SeqA_f;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 327, 703);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(-116, 130, 466, 659);
		lblNewLabel_5.setIcon(new ImageIcon(Registration.class.getResource("/images/23.jpg")));
		panel.add(lblNewLabel_5);
		
		JLabel lblRegistration = new JLabel("REGISTRATION");
		lblRegistration.setForeground(new Color(255, 255, 255));
		lblRegistration.setFont(new Font("Jokerman", Font.BOLD, 26));
		lblRegistration.setBounds(48, 63, 222, 54);
		panel.add(lblRegistration);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Arial", Font.BOLD, 13));
		lblFirstName.setBounds(367, 30, 73, 16);
		contentPane.add(lblFirstName);
		
		JLabel lblNewLabel = new JLabel("Last Name");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(588, 32, 73, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(367, 115, 73, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(367, 196, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3.setBounds(367, 275, 84, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Confirm Password");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_4.setBounds(367, 363, 128, 16);
		contentPane.add(lblNewLabel_4);
		
		FirstName_f = new JTextField();
		FirstName_f.setBounds(367, 59, 160, 31);
		contentPane.add(FirstName_f);
		FirstName_f.setColumns(10);
		
		LastName_f = new JTextField();
		LastName_f.setColumns(10);
		LastName_f.setBounds(588, 59, 172, 31);
		contentPane.add(LastName_f);
		
		Username_f = new JTextField();
		Username_f.setColumns(10);
		Username_f.setBounds(367, 144, 219, 31);
		contentPane.add(Username_f);
		
		Email_f = new JTextField();
		Email_f.setColumns(10);
		Email_f.setBounds(367, 225, 219, 31);
		contentPane.add(Email_f);
		
		Choice SecQ_choice = new Choice();
		SecQ_choice.setBounds(367, 486, 219, 31);
		contentPane.add(SecQ_choice);
		
		JLabel lblSecurityQuestion = new JLabel("Security Question");
		lblSecurityQuestion.setFont(new Font("Arial", Font.BOLD, 13));
		lblSecurityQuestion.setBounds(367, 452, 142, 16);
		contentPane.add(lblSecurityQuestion);
		
		SeqA_f = new JTextField();
		SeqA_f.setColumns(10);
		SeqA_f.setBounds(367, 571, 219, 31);
		contentPane.add(SeqA_f);
		
		JLabel lblSecurityAnswer = new JLabel("Security Answer");
		lblSecurityAnswer.setFont(new Font("Arial", Font.BOLD, 13));
		lblSecurityAnswer.setBounds(367, 542, 111, 16);
		contentPane.add(lblSecurityAnswer);
		
		Button button = new Button("Sign Up");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame login=new Home();
				login.setVisible(true);
				setVisible(false);
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBackground(new Color(250, 128, 114));
		button.setForeground(Color.WHITE);
		button.setBounds(367, 631, 327, 50);
		contentPane.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(367, 308, 219, 31);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(367, 395, 219, 31);
		contentPane.add(passwordField_1);
	}
}
