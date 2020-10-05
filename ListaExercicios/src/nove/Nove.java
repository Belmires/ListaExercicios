package nove;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Nove extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nove frame = new Nove();
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
	public Nove() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Acr\u00E9simos");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Bacon");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Queijo");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Molho");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Borda Recheada");
		
		

		
		JButton confirmar = new JButton("Confirmar");
		
		JButton limpar = new JButton("Limpar");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		
		confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(contentPane,"    Acrécimos\n" 
						+ (chckbxNewCheckBox.isSelected() ? chckbxNewCheckBox.getText() + "\n" :"") 
						+ (chckbxNewCheckBox_1.isSelected() ? chckbxNewCheckBox_1.getText() + "\n" :"")
						+ (chckbxNewCheckBox_2.isSelected() ? chckbxNewCheckBox_2.getText() + "\n" :"")
						+ (chckbxNewCheckBox_3.isSelected() ? chckbxNewCheckBox_3.getText() + "\n" :""));				
				
			}
		});
		
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
				chckbxNewCheckBox_3.setSelected(false);

			}
		});
		
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxNewCheckBox_3))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(confirmar)
							.addGap(28)
							.addComponent(limpar)))
					.addContainerGap(188, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(chckbxNewCheckBox)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox_3)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(confirmar)
						.addComponent(limpar))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
