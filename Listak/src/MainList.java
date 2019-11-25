import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainList extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainList frame = new MainList();
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
	public MainList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		tfInput = new JTextField();
		tfInput.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_tfInput = new GridBagConstraints();
		gbc_tfInput.insets = new Insets(0, 0, 5, 0);
		gbc_tfInput.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfInput.gridx = 0;
		gbc_tfInput.gridy = 0;
		contentPane.add(tfInput, gbc_tfInput);
		tfInput.setColumns(10);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(new DefaultListModel());
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 4;
		gbc_list.insets = new Insets(0, 0, 5, 0);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 1;
		contentPane.add(list, gbc_list);
		
		JButton btnAdd = new JButton("Hozz\u00E1ad\u00E1s");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultListModel listaElemek=(DefaultListModel)list.getModel();
				listaElemek.addElement(tfInput.getText());
				list.setModel(listaElemek);
			}
		});
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.insets = new Insets(0, 0, 5, 0);
		gbc_btnAdd.gridx = 0;
		gbc_btnAdd.gridy = 6;
		contentPane.add(btnAdd, gbc_btnAdd);
		
		JButton btnDel = new JButton("T\u00F6rl\u00E9s");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel listaElemek=(DefaultListModel)list.getModel();
				if (list.getSelectedIndex()>-1) {
					listaElemek.removeElementAt(list.getSelectedIndex());
					list.setModel(listaElemek);
				}
				
			}
		});
		GridBagConstraints gbc_btnDel = new GridBagConstraints();
		gbc_btnDel.gridx = 0;
		gbc_btnDel.gridy = 7;
		contentPane.add(btnDel, gbc_btnDel);
	}

}
