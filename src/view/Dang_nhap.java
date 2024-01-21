package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import JDBC.Connect_SQL;
import model.Account;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dang_nhap extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_DN_taikhoan;
	private JPasswordField tf_DN_matkhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dang_nhap frame = new Dang_nhap();
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
	public Dang_nhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng nhập");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(27, 21, 215, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("  Tên tài khoản");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(27, 71, 125, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("  Mật khẩu");
		lblNewLabel_1_1.setForeground(Color.GRAY);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(27, 121, 114, 40);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("ĐĂNG NHẬP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Account ac = new Account();
				ac.setUser_name(tf_DN_taikhoan.getText());
				ac.setPass(tf_DN_matkhau.getText());
				boolean loginSuccess = Connect_SQL.dangnhap(ac);
				if(tf_DN_taikhoan.getText().equals("") || tf_DN_matkhau.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Không để thông tin trống!!!");
				}else if (loginSuccess) {
	                Thong_tin_DK dk = new Thong_tin_DK();
	                dk.setVisible(true);
	                dispose();
	                JOptionPane.showMessageDialog(null, "Đăng nhập thành công!!!");
	            } else {
	                JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không đúng!!!");
	            }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(27, 203, 362, 40);
		contentPane.add(btnNewButton);
		
		tf_DN_taikhoan = new JTextField();
		tf_DN_taikhoan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_DN_taikhoan.setColumns(10);
		tf_DN_taikhoan.setBounds(27, 71, 362, 40);
		contentPane.add(tf_DN_taikhoan);
		
		tf_DN_matkhau = new JPasswordField();
		tf_DN_matkhau.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_DN_matkhau.setBounds(27, 121, 362, 40);
		contentPane.add(tf_DN_matkhau);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(419, 0, 367, 369);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel(" Hệ thống quản lý thi\r\n   ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 10, 357, 47);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(" tốt nghiệp THPT");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(10, 46, 357, 47);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Dang_nhap.class.getResource("/view/Ảnh chụp màn hình 2023-12-26 215153.png")));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(91, 103, 200, 200);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Không có tài khoản xin vui lòng nhấn");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(39, 253, 250, 28);
		contentPane.add(lblNewLabel_3);
		
		JButton btn_DK_TK = new JButton("đăng ký");
		btn_DK_TK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dang_ki dk = new Dang_ki();
				dk.setVisible(true);
				dispose();
			}
		});
		btn_DK_TK.setBackground(SystemColor.control);
		btn_DK_TK.setForeground(new Color(255, 0, 51));
		btn_DK_TK.setHorizontalAlignment(SwingConstants.LEFT);
		btn_DK_TK.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_DK_TK.setBounds(292, 253, 117, 28);
		btn_DK_TK.setBorderPainted(false);
		contentPane.add(btn_DK_TK);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
