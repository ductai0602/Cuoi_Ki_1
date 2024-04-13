package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import JDBC.Connect_SQL;
import model.Student;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Thong_tin_DK extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField tf_MaThiSinh;
	public JTextField tf_TenThiSinh;
	public JTextField tf_find_Student;
	public JTable table;
	public JComboBox comboBox_QueQuan;
	private JTextField tf_KhoiThi;
	private JTextField tf_SDT;
	private JComboBox comboBox_gioiTinh;
	private JTextField tf_ngaySinh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thong_tin_DK frame = new Thong_tin_DK();
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
	public Thong_tin_DK() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 781);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quản lí thông tin thí sinh dự thi");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(98, 0, 545, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã thí sinh");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(37, 473, 137, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên thí sinh");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(37, 516, 137, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Quê quán");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(37, 559, 137, 33);
		contentPane.add(lblNewLabel_1_2);
		
		tf_MaThiSinh = new JTextField();
		tf_MaThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_MaThiSinh.setColumns(10);
		tf_MaThiSinh.setBounds(144, 473, 222, 33);
		contentPane.add(tf_MaThiSinh);
		
		tf_TenThiSinh = new JTextField();
		tf_TenThiSinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_TenThiSinh.setColumns(10);
		tf_TenThiSinh.setBounds(144, 516, 222, 33);
		contentPane.add(tf_TenThiSinh);
		
		comboBox_QueQuan = new JComboBox();
		comboBox_QueQuan.setModel(new DefaultComboBoxModel(new String[] {"", "An Giang", "Bà Rịa-Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "TP. Hồ Chí Minh", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên - Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái"}));
		comboBox_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_QueQuan.setBounds(144, 559, 158, 33);
		contentPane.add(comboBox_QueQuan);
		
		JButton btn_Them = new JButton("Thêm");
		btn_Them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student st = new Student();
					st.setId(Integer.valueOf(tf_MaThiSinh.getText()));
				st.setName(tf_TenThiSinh.getText());
				st.setQueQuan(comboBox_QueQuan.getSelectedItem().toString());//lấy giá trị dạng chuỗi
				 try {
			            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			            Date ngaySinh = dateFormat.parse(tf_ngaySinh.getText());
			            st.setNgaySinh(ngaySinh);
			        } catch (ParseException ex) {
			            ex.printStackTrace();
			        }
				st.setKhoiThi(tf_KhoiThi.getText());
				st.setGioiTinh(comboBox_gioiTinh.getSelectedIndex());
				st.setSDT(tf_SDT.getText());
				if(tf_TenThiSinh.getText().equals("") || tf_KhoiThi.getText().equals("") || tf_SDT.getText().equals(""))  {
					JOptionPane.showMessageDialog(null, "Không được để thông tin trống!!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
				}else {
					boolean check = Connect_SQL.isStudentExists(st.getName());
					if (check) {
		                int confirmEdit = JOptionPane.showConfirmDialog(null, "Sinh viên đã tồn tại. Bạn có muốn sửa thông tin không?", "Xác nhận sửa", JOptionPane.YES_NO_OPTION);
		                if (confirmEdit == JOptionPane.YES_OPTION) {
		                    Connect_SQL.Update(st);
		                    JOptionPane.showMessageDialog(null, "Sửa thành công!!!");
		                    showData(Connect_SQL.findAll());
		                }
		            } else {
		                Connect_SQL.insert(st);
		                JOptionPane.showMessageDialog(null, "Thêm thành công!!!");
		                showData(Connect_SQL.findAll());
		            }
				}
			}
		});
		btn_Them.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Them.setBounds(37, 658, 129, 33);
		contentPane.add(btn_Them);
		
		JButton btn_DatLai = new JButton("Đặt lại");
		btn_DatLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_MaThiSinh.setText("");
				tf_TenThiSinh.setText("");
				comboBox_QueQuan.setSelectedIndex(-1);
				tf_ngaySinh.setText("");
				tf_KhoiThi.setText("");
				tf_find_Student.setText("");
				tf_SDT.setText("");
			}
		});
		btn_DatLai.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_DatLai.setBounds(236, 658, 129, 33);
		contentPane.add(btn_DatLai);
		
		JButton btn_Xoa = new JButton("Xóa");
		btn_Xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student st = new Student();
				st.setName(tf_TenThiSinh.getText());
				Object[] options = {"Xóa", "Hủy"};
		        int luaChon = JOptionPane.showOptionDialog(
		                null, 
		                "Bạn có chắc chắn xóa thí sinh này?",
		                "Xác nhận xóa",
		                JOptionPane.DEFAULT_OPTION,
		                JOptionPane.WARNING_MESSAGE,
		                null,
		                options,
		                options[0]
		        );
				if(luaChon == JOptionPane.YES_OPTION) {
					Connect_SQL.delete(st);
					showData(Connect_SQL.findAll());
				}
			}
		});
		btn_Xoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Xoa.setBounds(437, 658, 129, 33);
		contentPane.add(btn_Xoa);
		
		JButton btn_Luu = new JButton("Lưu");
		btn_Luu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveTableToNotepad();
			}
		});
		btn_Luu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Luu.setBounds(623, 658, 129, 33);
		contentPane.add(btn_Luu);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ngày sinh (YYYY/MM/DD)");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(37, 602, 222, 33);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Khối thi");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(437, 516, 137, 33);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Giới tính");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(437, 559, 137, 33);
		contentPane.add(lblNewLabel_1_5);
		
		JButton btn_DangXuat = new JButton("Đăng xuất");
		btn_DangXuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thong_tin_DK tt = new Thong_tin_DK();
				tt.setVisible(false);
				dispose();
				Dang_nhap dn = new Dang_nhap();
				dn.setVisible(true);
			}
		});
		btn_DangXuat.setIcon(new ImageIcon(Thong_tin_DK.class.getResource("/view/icon_dangxuat.png")));
		btn_DangXuat.setHorizontalAlignment(SwingConstants.LEFT);
		btn_DangXuat.setForeground(UIManager.getColor("Button.disabledForeground"));
		btn_DangXuat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_DangXuat.setBorderPainted(false);
		btn_DangXuat.setBackground(SystemColor.activeCaption);
		btn_DangXuat.setBounds(623, 713, 153, 21);
		contentPane.add(btn_DangXuat);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setFont(new Font("Dialog", Font.PLAIN, 18));
		verticalBox.setBorder(new TitledBorder(null, "Danh s\u00E1ch th\u00ED sinh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		verticalBox.setBounds(10, 117, 766, 336);
		contentPane.add(verticalBox);
		
		JScrollPane scrollPane = new JScrollPane();
		verticalBox.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "Name", "Birthplace", "Birthdate", "Block", "Number_Phone", "Sex"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.getColumnModel().getColumn(6).setPreferredWidth(30);
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		showData(Connect_SQL.findAll());
		
		JLabel lblNewLabel_1_6 = new JLabel("Tên thí sinh");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_6.setBounds(37, 74, 137, 33);
		contentPane.add(lblNewLabel_1_6);
		
		tf_find_Student = new JTextField();
		tf_find_Student.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_find_Student.setColumns(10);
		tf_find_Student.setBounds(144, 74, 418, 33);
		contentPane.add(tf_find_Student);
		
		JButton btn_TiemKiem = new JButton("Tìm kiếm");
		btn_TiemKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputName = tf_find_Student.getText().trim();
			    if (!inputName.isEmpty()) {
			        Student st = new Student();
			        st.setName(inputName);
			        showData(Connect_SQL.findByName(st));
			    } else {
			    	JOptionPane.showMessageDialog(null, "Không tìm thấy!!!");
			    }
			}
		});
		btn_TiemKiem.setIcon(new ImageIcon(Thong_tin_DK.class.getResource("/view/kinh_lup_icon.png")));
		btn_TiemKiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_TiemKiem.setBounds(618, 74, 135, 33);
		contentPane.add(btn_TiemKiem);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setFont(new Font("Dialog", Font.PLAIN, 18));
		horizontalBox.setBorder(new TitledBorder(null, "T\u00ECm th\u00ED sinh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		horizontalBox.setBounds(10, 47, 766, 71);
		contentPane.add(horizontalBox);
		
		tf_KhoiThi = new JTextField();
		tf_KhoiThi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_KhoiThi.setColumns(10);
		tf_KhoiThi.setBounds(530, 516, 222, 33);
		contentPane.add(tf_KhoiThi);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("SDT\r\n");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(437, 473, 137, 33);
		contentPane.add(lblNewLabel_1_1_1);
		
		tf_SDT = new JTextField();
		tf_SDT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_SDT.setColumns(10);
		tf_SDT.setBounds(530, 473, 222, 33);
		contentPane.add(tf_SDT);
		
		comboBox_gioiTinh = new JComboBox();
		comboBox_gioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_gioiTinh.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ"}));
		comboBox_gioiTinh.setBounds(530, 560, 137, 30);
		contentPane.add(comboBox_gioiTinh);
		
		tf_ngaySinh = new JTextField();
		tf_ngaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf_ngaySinh.setColumns(10);
		tf_ngaySinh.setBounds(251, 602, 115, 33);
		contentPane.add(tf_ngaySinh);
		
		this.setLocationRelativeTo(null);
	}
	public void saveTableToNotepad() {
		JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile() + ".txt"))) {
                int rowCount = table.getRowCount();
                int colCount = table.getColumnCount();
                for (int col = 0; col < colCount; col++) {
                    writer.write(table.getColumnName(col) + "\t");
                }
                writer.write("\n");
                for (int row = 0; row < rowCount; row++) {
                    for (int col = 0; col < colCount; col++) {
                        writer.write(String.valueOf(table.getValueAt(row, col)) + "\t");
                    }
                    writer.write("\n");
                }
                JOptionPane.showMessageDialog(this, "Đã lưu thành công.");
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Lỗi khi lưu file.");
            }
        }
	}

	public void showData(List<Student> studentl) {
		// TODO Auto-generated method stub
		List<Student> listStudent = new ArrayList<>();
		listStudent = studentl;
		DefaultTableModel tableModel;
		table.getModel();
		tableModel = (DefaultTableModel) table.getModel();
		tableModel.setRowCount(0);
		listStudent.forEach((student) -> {
		    String gender;
		    if(student.getGioiTinh() == 0) {
		        gender = "Nam";
		    } else {
		        gender = "Nữ";
		    }
		    tableModel.addRow(new Object[] {
		        student.getId(), student.getName(), student.getQueQuan(),student.getNgaySinh()
		        , student.getKhoiThi(), student.getSDT(), gender,
		    });
		});
	}
}
