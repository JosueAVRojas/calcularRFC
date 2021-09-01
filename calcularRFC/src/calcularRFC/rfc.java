package calcularRFC;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rfc extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombres;
	private JTextField txtApellidoP;
	private JTextField txtApellidoM;
	private JTextField txtDiaN;
	private JLabel lblNewLabel;
	private JTextField txtAnioN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rfc frame = new rfc();
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
	public rfc() {
		setTitle("Calcular RFC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lbtNombres = new JLabel("Ingresa tu nombre(s):");
		lbtNombres.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtNombres = new JTextField();
		txtNombres.setColumns(10);
		
		JLabel lbtApellidoP = new JLabel("Ingresa tu apellido paterno:");
		lbtApellidoP.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtApellidoP = new JTextField();
		txtApellidoP.setColumns(10);
		
		JLabel lbtApellidoM = new JLabel("Ingresa tu apellido materno:");
		lbtApellidoM.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtApellidoM = new JTextField();
		txtApellidoM.setColumns(10);
		
		JLabel lbtFechaN = new JLabel("Ingresa el dia de nacimiento:");
		lbtFechaN.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtDiaN = new JTextField();
		txtDiaN.setColumns(10);
		
		lblNewLabel = new JLabel("Ingresa el mes de nacimiento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JComboBox cBMesN = new JComboBox();
		cBMesN.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa el a\u00F1o de nacimeinto:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txtAnioN = new JTextField();
		txtAnioN.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Programa que permite calcular el RFC de una persona");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JTextPane txtPDatos = new JTextPane();
		JTextPane txtPRFC = new JTextPane();

		
		JLabel lblNewLabel_3 = new JLabel("Aqu\u00ED se mostrara la informacion del usuario:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Boton que nos permitira imprimir los datos ingresados en el formulario
				txtPDatos.setText("NOMBRE(S):" +txtNombres.getText().toUpperCase() + "\nAPELLIDO PATERNO: "+txtApellidoP.getText().toUpperCase()+ 
						"\nAPELLIDO MATERNO: "+txtApellidoM.getText().toUpperCase() + "\nDÍA DE NACIMEINTO: "+txtDiaN.getText().toUpperCase() +
						"\nMES DE NACIMIENTO: "+((String) cBMesN.getSelectedItem()).toUpperCase() + 
						"\nAÑO DE NACIMIENTO: "+txtAnioN.getText().toUpperCase());
				
			}
		});
		
		JButton btnCalcular = new JButton("Calcular RFC");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = txtNombres.getText().toUpperCase();
				String nombre2 = nombre.substring(0,1);
				
				String apellidoP = txtApellidoP.getText().toUpperCase();
				String apellidoP2 = apellidoP.substring(0,2);
				
				String apellidoM = txtApellidoM.getText().toUpperCase();
				String apellidoM2 = "";
				
				
				String dia = txtDiaN.getText().toUpperCase();
				
				String anio = txtAnioN.getText().toUpperCase();
				String anio2 = anio.substring(2,4);
				
				String mes = ((String) cBMesN.getSelectedItem()).toUpperCase();
	
				if(apellidoM.equals("")) {
					apellidoM2 = "X";
				}
				else {
					apellidoM2 = apellidoM.substring(0,1);;
				}
				
				
				switch(apellidoM2) {
				case "Ñ":
					apellidoM2 = "X";
					break;
				}
				
				
				
				switch(mes) {
				case "ENERO":
					mes = "01";
				break;
				case "FEBRERO":
					mes = "02";
				break;
				case "MARZO":
					mes = "03";
				break;
				case "ABRIL":
					mes = "04";
				break;
				case "MAYO":
					mes = "05";
				break;
				case "JUNIO":
					mes = "06";
				break;
				case "JULIO":
					mes = "07";
				break;
				case "AGOSTO":
					mes = "08";
				break;
				case "SEPTIEMBRE":
					mes = "09";
				break;
				case "OCTUBE":
					mes = "10";
				break;
				case "NOVIEMBRE":
					mes = "11";
				break;
				case "DICIEMBRE":
					mes = "12";
				break;
				
				}
				
				//PRIMERA LETRA DEL APELLIDO PATERNO
				String apellidoP2P = apellidoP2.substring(0,1);
				//SEGUNDA LETRA DEL APELLIDO PATERNO
				String apellidoP2X = apellidoP2.substring(1,2);
				String apellidoPBandera = "";
				
				
				
				
				switch(apellidoP2P) {
				case "Ñ":
					apellidoP2P = "X";
					break;
				}
				
				switch(apellidoP2X) {
					case  "A":
						apellidoPBandera = "A";
						break;
					case  "B":
						apellidoPBandera = "X";
						break;
					case "C":
						apellidoPBandera = "X";
						break;
					case "D":
						apellidoPBandera = "X";
						break;
					case "E":
						apellidoPBandera = "E";
						break;
					case "F":
						apellidoPBandera = "X";
						break;
					case "G":
						apellidoPBandera = "X";
						break;
					case "H":
						apellidoPBandera = "X";
						break;
					case "I":
						apellidoPBandera = "I";
						break;
					case "J":
						apellidoPBandera = "J";
						break;
					case "K":
						apellidoPBandera = "X";
						break;
					case "L":
						apellidoPBandera = "X";
						break;
					case "M":
						apellidoPBandera = "X";
						break;
					case "N":
						apellidoPBandera = "X";
						break;
					case "Ñ":
						apellidoPBandera = "X";
						break;
					case "O":
						apellidoPBandera = "O";
						break;
					case "P":
						apellidoPBandera = "X";
						break;
					case "Q":
						apellidoPBandera = "X";
						break;
					case "R":
						apellidoPBandera = "X";
						break;
					case "S":
						apellidoPBandera = "X";
						break;
					case "T":
						apellidoPBandera = "X";
						break;
					case "U":
						apellidoPBandera = "U";
						break;
					case "V":
						apellidoPBandera = "X";
						break;
					case "W":
						apellidoPBandera = "X";
						break;
					case "X":
						apellidoPBandera = "X";
						break;
					case "Y":
						apellidoPBandera = "X";
						break;
					case "Z":
						apellidoPBandera = "X";
						break;
				}
				
				
				txtPRFC.setText(apellidoP2P+apellidoPBandera+apellidoM2+nombre2+anio2+mes+dia);
				
			}
		});
		
		JLabel lblNewLabel_3_1 = new JLabel("Aqu\u00ED se muestra el RFC del usuario:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lbtNombres)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtNombres, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lbtApellidoP)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtApellidoP, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lbtApellidoM)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtApellidoM, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel_1)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(txtAnioN))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(cBMesN, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lbtFechaN)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(txtDiaN))))
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(27))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3)
					.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtPDatos, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(100, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtPRFC, GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(70)
					.addComponent(btnImprimir)
					.addGap(51)
					.addComponent(btnCalcular)
					.addContainerGap(73, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_2)
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbtNombres)
						.addComponent(txtNombres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbtApellidoP)
						.addComponent(txtApellidoP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbtApellidoM)
						.addComponent(txtApellidoM, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbtFechaN)
						.addComponent(txtDiaN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(cBMesN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtAnioN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtPDatos, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_3_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtPRFC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnImprimir)
						.addComponent(btnCalcular))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
