package test;

import java.sql.Connection;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import JDBC.Connect_SQL;
import view.Dang_nhap;
import view.Thong_tin_DK;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.invokeLater(() -> {
	            new Dang_nhap().setVisible(true);
	        });
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
