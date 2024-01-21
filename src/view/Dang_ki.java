package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import JDBC.Connect_SQL;
import model.Account;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Dang_ki extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_DK_taiKhoan;
	private JPasswordField tf_DK_MK;
	private JPasswordField tf_DK_lai_MK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dang_ki frame = new Dang_ki();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dang_ki() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 406);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(417, 0, 369, 369);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel(" tốt nghiệp THPT");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(10, 46, 357, 47);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Hệ thống quản lý thi\r\n   ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 10, 357, 47);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Dang_ki.class.getResource("/view/education_2.png")));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(91, 103, 200, 200);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("Đăng ký");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(27, 21, 215, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("   Tên tài khoản");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 56, 129, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("   Nhập mật khẩu");
		lblNewLabel_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 121, 152, 40);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("   Nhập lại mật khẩu");
		lblNewLabel_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(10, 188, 174, 40);
		contentPane.add(lblNewLabel_1_1_1);
		
		tf_DK_taiKhoan = new JTextField();
		tf_DK_taiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_DK_taiKhoan.setBounds(27, 88, 362, 40);
		contentPane.add(tf_DK_taiKhoan);
		tf_DK_taiKhoan.setColumns(10);
		
		tf_DK_MK = new JPasswordField();
		tf_DK_MK.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_DK_MK.setBounds(27, 156, 362, 40);
		contentPane.add(tf_DK_MK);
		
		tf_DK_lai_MK = new JPasswordField();
		tf_DK_lai_MK.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_DK_lai_MK.setBounds(27, 224, 362, 40);
		contentPane.add(tf_DK_lai_MK);
		
		JButton btnNewButton = new JButton("ĐĂNG KÝ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Account ac = new Account();
				ac.setUser_name(tf_DK_taiKhoan.getText());
				ac.setPass(tf_DK_MK.getText());
				ac.setPass_conf(tf_DK_lai_MK.getText());
				if(tf_DK_taiKhoan.getText().equals("") || tf_DK_MK.getText().equals("") || tf_DK_lai_MK.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Không để thông tin trống!!!");
				}else {
					Dang_nhap dn = new Dang_nhap();
					dn.setVisible(true);
					dispose();
					Connect_SQL.dangKi(ac);
					JOptionPane.showMessageDialog(null, "Đăng kí thành công!!!");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(27, 287, 362, 40);
		contentPane.add(btnNewButton);
		
		JButton btn_comeback = new JButton("Trở lại");
		btn_comeback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dang_nhap dn = new Dang_nhap();
				dn.setVisible(true);
				dispose();
			}
		});
		btn_comeback.setIcon(new ImageIcon(Dang_ki.class.getResource("/view/icon_dangxuat.png")));
		btn_comeback.setBackground(SystemColor.control);
		btn_comeback.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_comeback.setBounds(289, 334, 111, 35);
		btn_comeback.setBorderPainted(false);
		contentPane.add(btn_comeback);
		
		this.setLocationRelativeTo(null);
	}
}
