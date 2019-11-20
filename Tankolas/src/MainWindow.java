import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tfMegtettKm;
	private JTextField tfTankoltMennyiseg;
	private JTextField tfUzemanyagAr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					
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
	public MainWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Megtett km:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		tfMegtettKm = new JTextField();
		GridBagConstraints gbc_tfMegtettKm = new GridBagConstraints();
		gbc_tfMegtettKm.insets = new Insets(0, 0, 5, 0);
		gbc_tfMegtettKm.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfMegtettKm.gridx = 1;
		gbc_tfMegtettKm.gridy = 0;
		contentPane.add(tfMegtettKm, gbc_tfMegtettKm);
		tfMegtettKm.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tankolt mennyis\u00E9g:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tfTankoltMennyiseg = new JTextField();
		GridBagConstraints gbc_tfTankoltMennyiseg = new GridBagConstraints();
		gbc_tfTankoltMennyiseg.insets = new Insets(0, 0, 5, 0);
		gbc_tfTankoltMennyiseg.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfTankoltMennyiseg.gridx = 1;
		gbc_tfTankoltMennyiseg.gridy = 1;
		contentPane.add(tfTankoltMennyiseg, gbc_tfTankoltMennyiseg);
		tfTankoltMennyiseg.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u00DCzemanyag \u00E1ra:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		tfUzemanyagAr = new JTextField();
		GridBagConstraints gbc_tfUzemanyagAr = new GridBagConstraints();
		gbc_tfUzemanyagAr.insets = new Insets(0, 0, 5, 0);
		gbc_tfUzemanyagAr.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfUzemanyagAr.gridx = 1;
		gbc_tfUzemanyagAr.gridy = 2;
		contentPane.add(tfUzemanyagAr, gbc_tfUzemanyagAr);
		tfUzemanyagAr.setColumns(10);
		
		JLabel lblAtlagFogyasztas = new JLabel("New label");
		lblAtlagFogyasztas.setFont(new Font("Tahoma", Font.BOLD, 24));
		GridBagConstraints gbc_lblAtlagFogyasztas = new GridBagConstraints();
		gbc_lblAtlagFogyasztas.insets = new Insets(0, 0, 5, 0);
		gbc_lblAtlagFogyasztas.gridwidth = 2;
		gbc_lblAtlagFogyasztas.gridx = 0;
		gbc_lblAtlagFogyasztas.gridy = 3;
		contentPane.add(lblAtlagFogyasztas, gbc_lblAtlagFogyasztas);
		
		JLabel lblKmKoltseg = new JLabel("New label");
		lblKmKoltseg.setFont(new Font("Tahoma", Font.BOLD, 24));
		GridBagConstraints gbc_lblKmKoltseg = new GridBagConstraints();
		gbc_lblKmKoltseg.gridwidth = 2;
		gbc_lblKmKoltseg.insets = new Insets(0, 0, 5, 5);
		gbc_lblKmKoltseg.gridx = 0;
		gbc_lblKmKoltseg.gridy = 4;
		contentPane.add(lblKmKoltseg, gbc_lblKmKoltseg);
		
		
		JButton btnSzamolas = new JButton("Sz\u00E1mol\u00E1s");
		btnSzamolas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					double megtettKM=Double.parseDouble(tfMegtettKm.getText());
					double tankoltMennyiseg=Double.parseDouble(tfTankoltMennyiseg.getText());
					double atlagFogyasztas=tankoltMennyiseg/(megtettKM/100);
					double uzemanyagAr=Double.parseDouble(tfUzemanyagAr.getText());
					double kmKoltseg=(atlagFogyasztas/100)*uzemanyagAr;
					
					//lblAtlagFogyasztas.setText(String.valueOf(atlagFogyasztas));
				lblAtlagFogyasztas.setText(String.format("%.2f", atlagFogyasztas));
				lblKmKoltseg.setText(String.format("%.2f", kmKoltseg));
				
				}
				catch (NumberFormatException e){
					JOptionPane.showMessageDialog(null, "A mezõ nem lehet üres, számot kell megadni!");
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Hiba!");
				}
				
				
			}
		});
		
	
		btnSzamolas.setFont(new Font("Tahoma", Font.BOLD, 14));
		GridBagConstraints gbc_btnSzamolas = new GridBagConstraints();
		gbc_btnSzamolas.gridwidth = 2;
		gbc_btnSzamolas.gridx = 0;
		gbc_btnSzamolas.gridy = 6;
		contentPane.add(btnSzamolas, gbc_btnSzamolas);
	}

}
