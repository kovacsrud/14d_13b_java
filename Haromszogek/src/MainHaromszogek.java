import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;

public class MainHaromszogek extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainHaromszogek frame = new MainHaromszogek();
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
	public MainHaromszogek() {
		
		List<DHaromszog> haromszogek=new ArrayList<DHaromszog>();
		JFileChooser fc=new JFileChooser();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnBetolt = new JButton("Adatok bet\u00F6lt\u00E9se");
		btnBetolt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fc.showOpenDialog(null);
				String fajl=fc.getSelectedFile().getPath();
				System.out.println(fajl);
				List<String> sorok=Collections.emptyList();
				try {
					sorok=Files.readAllLines(Paths.get(fajl));
					for (int i = 0; i < sorok.size(); i++) {
						DHaromszog haromszog=new DHaromszog(sorok.get(i), i+1);
					}
				}
				catch (HaromszogHiba e) {
					JOptionPane.showMessageDialog(null,e.getMessage());
				}
				catch (NumberFormatException e){
					JOptionPane.showMessageDialog(null,e.getMessage());
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Hiba");
				}
				
				
			}
		});
		GridBagConstraints gbc_btnBetolt = new GridBagConstraints();
		gbc_btnBetolt.insets = new Insets(0, 0, 5, 5);
		gbc_btnBetolt.gridx = 0;
		gbc_btnBetolt.gridy = 0;
		contentPane.add(btnBetolt, gbc_btnBetolt);
		
		JList list_1 = new JList();
		GridBagConstraints gbc_list_1 = new GridBagConstraints();
		gbc_list_1.gridheight = 2;
		gbc_list_1.gridwidth = 6;
		gbc_list_1.insets = new Insets(0, 0, 5, 5);
		gbc_list_1.fill = GridBagConstraints.BOTH;
		gbc_list_1.gridx = 0;
		gbc_list_1.gridy = 1;
		contentPane.add(list_1, gbc_list_1);
		
		JLabel lblNewLabel = new JLabel("Der\u00E9ksz\u00F6g\u0171 h\u00E1romsz\u00F6gek");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Kiv\u00E1laszott der\u00E9ksz\u00F6g\u0171 h\u00E1romsz\u00F6g adatai");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 5;
		gbc_lblNewLabel_2.gridy = 4;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridwidth = 5;
		gbc_list.insets = new Insets(0, 0, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 5;
		contentPane.add(list, gbc_list);
		
		JLabel lblKerulet = new JLabel("New label");
		GridBagConstraints gbc_lblKerulet = new GridBagConstraints();
		gbc_lblKerulet.insets = new Insets(0, 0, 5, 0);
		gbc_lblKerulet.gridx = 5;
		gbc_lblKerulet.gridy = 5;
		contentPane.add(lblKerulet, gbc_lblKerulet);
		
		JLabel lblTerulet = new JLabel("New label");
		GridBagConstraints gbc_lblTerulet = new GridBagConstraints();
		gbc_lblTerulet.gridx = 5;
		gbc_lblTerulet.gridy = 6;
		contentPane.add(lblTerulet, gbc_lblTerulet);
	}

}
