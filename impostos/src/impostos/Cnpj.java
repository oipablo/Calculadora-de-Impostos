package impostos;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Cnpj extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtCNPJ;
	private JComboBox comboOper;
	private JButton btnTab;
	private JButton btnPoa;
	private JButton btnOsa;
	private JTextField txtDesc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cnpj frame = new Cnpj();
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
	public Cnpj() {
		setTitle("CNPJ OPERADORAS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Operadoras");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(63, 36, 88, 19);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("CNPJ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(103, 71, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtCNPJ = new JTextField();
		txtCNPJ.setEditable(false);
		txtCNPJ.setColumns(10);
		txtCNPJ.setBounds(162, 69, 205, 20);
		contentPane.add(txtCNPJ);
		
		comboOper = new JComboBox();
		comboOper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(comboOper.getSelectedItem().equals("AFRESP")) {
						
					txtCNPJ.setText("62.635.990/0001-91");
				}else if(comboOper.getSelectedItem().equals("ALLIANZ")) {
					txtCNPJ.setText("04.439.627/0001-02");
				}else if(comboOper.getSelectedItem().equals("AMENO")) {
					txtCNPJ.setText("62.707.369/0001-96");
				}else if(comboOper.getSelectedItem().equals("AMEPLAN")) {
					txtCNPJ.setText("67.839.969/0001-21");
				}else if(comboOper.getSelectedItem().equals("AMICO SAUDE")) {
					txtCNPJ.setText("51.722.957/0001-82");
				}else if(comboOper.getSelectedItem().equals("AMIL")) {
					txtCNPJ.setText("29.309.127/0001-79");
				}else if(comboOper.getSelectedItem().equals("ASSEFAZ")) {
					txtCNPJ.setText("00.628.107/0019-08");
				}else if(comboOper.getSelectedItem().equals("CLASSES LABORIOSAS")) {
					txtCNPJ.setText("61.740.791/0001-80");
				}else if(comboOper.getSelectedItem().equals("ALBERT EINSTEIN")) {
					txtCNPJ.setText("60.765.823/0001-30");
				}else if(comboOper.getSelectedItem().equals("BANCO CENTRAL DO BRASIL")) {
					txtCNPJ.setText("00.038.166/0009-54");
				}else if(comboOper.getSelectedItem().equals("BIO SAUDE")) {
					txtCNPJ.setText("03.123.146/0001-12");
				}else if(comboOper.getSelectedItem().equals("BIO VIDA")) {
					txtCNPJ.setText("04.299.138/0001-94");
				}else if(comboOper.getSelectedItem().equals("BR PETROBRAS DISTRIBUIDORA")) {
					txtCNPJ.setText("34.274.233/0001-02");
				}else if(comboOper.getSelectedItem().equals("BRADESCO OPERADORA")) {
					txtCNPJ.setText("15.011.651/0001-54");
				}else if(comboOper.getSelectedItem().equals("CABESP")) {
					txtCNPJ.setText("62.231.527/0001-84");
				}else if(comboOper.getSelectedItem().equals("SAÚDE CAIXA")) {
					txtCNPJ.setText("00.360.305/0001-04");
				}else if(comboOper.getSelectedItem().equals("CARE PLUS")) {
					txtCNPJ.setText("02.725.347/0001-27");
				}else if(comboOper.getSelectedItem().equals("CASSI")) {
					txtCNPJ.setText("33.719.485/0018-75");
				}else if(comboOper.getSelectedItem().equals("CENTRAL NACIONAL UNIMED")) {
					txtCNPJ.setText("02.812.468/0001-06");
				}else if(comboOper.getSelectedItem().equals("CET")) {
					txtCNPJ.setText("47.902.648/0001-17");
				}else if(comboOper.getSelectedItem().equals("CGUP")) {
					txtCNPJ.setText("09.368.225/0001-70");
				}else if(comboOper.getSelectedItem().equals("CRUZ AZUL")) {
					txtCNPJ.setText("03.849.449/0001-17");
				}else if(comboOper.getSelectedItem().equals("CETESB")) {
					txtCNPJ.setText("43.776.491/0001-70");
				}else if(comboOper.getSelectedItem().equals("CNEN")) {
					txtCNPJ.setText("00.402.552/0005-50");
				}else if(comboOper.getSelectedItem().equals("ECONOMUS")) {
					txtCNPJ.setText("49.320.799/0001-92");
				}else if(comboOper.getSelectedItem().equals("ENGEPRON")) {
					txtCNPJ.setText("27.816.487/0001-31");
				}else if(comboOper.getSelectedItem().equals("FUNCAÇÃO CESP")) {
					txtCNPJ.setText("62.465.117/0001-06");
				}else if(comboOper.getSelectedItem().equals("FUNDAÇÃO ITAU")) {
					txtCNPJ.setText("73.809.352/0001-66");
				}else if(comboOper.getSelectedItem().equals("FUNDAÇÃO SABESP")) {
					txtCNPJ.setText("65.471.914/0001-86");
				}else if(comboOper.getSelectedItem().equals("GAMA SAUDE")) {
					txtCNPJ.setText("02.009.924/0001-84");
				}else if(comboOper.getSelectedItem().equals("GARANTIA DE SAUDE")) {
					txtCNPJ.setText("45.572.583/0001-63");
				}else if(comboOper.getSelectedItem().equals("GEAP")) {
					txtCNPJ.setText("03.658.432/0020-45");
				}else if(comboOper.getSelectedItem().equals("GOLDEN CROSS")) {
					txtCNPJ.setText("01.518.211/0005-07");
				}else if(comboOper.getSelectedItem().equals("GREEN LINE")) {
					txtCNPJ.setText("61.849.980/0001-96");
				}else if(comboOper.getSelectedItem().equals("INFRAERO")) {
					txtCNPJ.setText("00.352.294/0157-38");
				}else if(comboOper.getSelectedItem().equals("IAMSPE")) {
					txtCNPJ.setText("60.747.318/0001-62");
				}else if(comboOper.getSelectedItem().equals("INTERMEDICA")) {
					txtCNPJ.setText("44.649.812/0001-38");
				}else if(comboOper.getSelectedItem().equals("LIFE EMPRESARIAL")) {
					txtCNPJ.setText("04.558.034/0001-57");
				}else if(comboOper.getSelectedItem().equals("MEDICAL HEALTH")) {
					txtCNPJ.setText("02.282.844/0001-06");
				}else if(comboOper.getSelectedItem().equals("MEDISANITAS")) {
					txtCNPJ.setText("62.550.256/0001-20");
				}else if(comboOper.getSelectedItem().equals("MEDSERVICE")) {
					txtCNPJ.setText("57.746.455/0001-78");
				}else if(comboOper.getSelectedItem().equals("METRUS")) {
					txtCNPJ.setText("44.857.357/0001-66");
				}else if(comboOper.getSelectedItem().equals("NOTRE DAME / INTERMEDICA")) {
					txtCNPJ.setText("44.649.812/0001-38");
				}else if(comboOper.getSelectedItem().equals("OMINT")) {
					txtCNPJ.setText("44.673.382/0001-90");
				}else if(comboOper.getSelectedItem().equals("PETROBRAS")) {
					txtCNPJ.setText("33.000.167/0108-40");
				}else if(comboOper.getSelectedItem().equals("PLASAC")) {
					txtCNPJ.setText("02.716.508/0001-16");
				}else if(comboOper.getSelectedItem().equals("PORTO SEGURO")) {
					txtCNPJ.setText("04.540.010/0001-70");
				}else if(comboOper.getSelectedItem().equals("PORTOMED")) {
					txtCNPJ.setText("11.564.995/0001-54");
				}else if(comboOper.getSelectedItem().equals("POSTAL SAUDE")) {
					txtCNPJ.setText("18.275.071/0001-62");
				}else if(comboOper.getSelectedItem().equals("PREVENT SENIOR")) {
					txtCNPJ.setText("00.461.478/0001-63");
				}else if(comboOper.getSelectedItem().equals("SÃO CRISTOVÃO")) {
					txtCNPJ.setText("60.975.174/0001-00");
				}else if(comboOper.getSelectedItem().equals("SBC SAUDE")) {
					txtCNPJ.setText("03.977.567/0001-81");
				}else if(comboOper.getSelectedItem().equals("SEPACO")) {
					txtCNPJ.setText("60.961.422/0001-55");
				}else if(comboOper.getSelectedItem().equals("SERPRO")) {
					txtCNPJ.setText("33.683.111/0009-56");
				}else if(comboOper.getSelectedItem().equals("SPA SAUDE")) {
					txtCNPJ.setText("69.259.356/0001-40");
				}else if(comboOper.getSelectedItem().equals("SP TRANS")) {
					txtCNPJ.setText("60.498.417/0001-58");
				}else if(comboOper.getSelectedItem().equals("SULAMERICA")) {
					txtCNPJ.setText("01.685.053/0001-56");
				}else if(comboOper.getSelectedItem().equals("TEMPO SAUDE SEGURADORA")) {
					txtCNPJ.setText("04.570.715/0001-30");
				}else if(comboOper.getSelectedItem().equals("TRASMONTANO SAUDE")) {
					txtCNPJ.setText("62.638.374/0012-47");
				}else if(comboOper.getSelectedItem().equals("UNAFISCO SAUDE")) {
					txtCNPJ.setText("03.657.699/0001-55");
				}else if(comboOper.getSelectedItem().equals("UNIMED RIO")) {
					txtCNPJ.setText("42.163.881/0001-01");
				}else if(comboOper.getSelectedItem().equals("UNIMED SEGUROS")) {
					txtCNPJ.setText("04.487.255/0001-81");
				}else if(comboOper.getSelectedItem().equals("SOMPO")) {
					txtCNPJ.setText("47.184.510/0001-20");
				}else if(comboOper.getSelectedItem().equals("Selecione uma Opção")) {
					txtCNPJ.setText("");
				}else if(comboOper.getSelectedItem().equals("SANTARIS")) {
					txtCNPJ.setText("04.004.287/0001-89");
				}else if(comboOper.getSelectedItem().equals("INTERCLINICAS")) {
					txtCNPJ.setText("22.694.698/0001-25");
				}else if(comboOper.getSelectedItem().equals("SANTA CASA DE MAUÁ")) {
					txtCNPJ.setText("08.225.953/0001-60");
				}else if(comboOper.getSelectedItem().equals("SÃO MIGUEL SAÚDE")) {
					txtCNPJ.setText("66.854.779/0001-10");
				}else if(comboOper.getSelectedItem().equals("PLENA SAÚDE")) {
					txtCNPJ.setText("00.338.763/0001-47");
				
				
					
			}}
		});
		comboOper.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma Op\u00E7\u00E3o", "AFRESP", "ALLIANZ", "AMENO", "AMEPLAN", "AMICO SAUDE", "AMIL", "ASSEFAZ", "ALBERT EINSTEIN", "BANCO CENTRAL DO BRASIL", "BIO SAUDE", "BIO VIDA", "BR PETROBRAS DISTRIBUIDORA", "BRADESCO OPERADORA", "CABESP", "CARE PLUS", "CLASSES LABORIOSAS", "CASSI", "CENTRAL NACIONAL UNIMED", "CET", "CGUP", "CRUZ AZUL", "CETESB", "CNEN", "ECONOMUS", "ENGEPRON", "FUNCA\u00C7\u00C3O CESP", "FUNDA\u00C7\u00C3O ITAU", "FUNDA\u00C7\u00C3O SABESP", "GAMA SAUDE", "GARANTIA DE SAUDE", "GEAP", "GOLDEN CROSS", "GREEN LINE", "INFRAERO", "IAMSPE", "INTERCLINICAS", "INTERMEDICA", "LIFE EMPRESARIAL", "MEDICAL HEALTH", "MEDISANITAS", "MEDSERVICE", "METRUS", "NOTRE DAME / INTERMEDICA", "OMINT", "PETROBRAS", "PLASAC", "PLENA SA\u00DADE", "PORTO SEGURO", "PORTOMED", "POSTAL SAUDE", "PREVENT SENIOR", "SOMPO", "S\u00C3O CRISTOV\u00C3O", "S\u00C3O MIGUEL SA\u00DADE", "SANTARIS", "SANTA CASA DE MAU\u00C1", "SBC SAUDE", "SEPACO", "SERPRO", "SPA SAUDE", "SP TRANS", "SULAMERICA", "SA\u00DADE CAIXA", "TEMPO SAUDE SEGURADORA", "TRASMONTANO SAUDE", "UNAFISCO SAUDE", "UNIMED RIO", "UNIMED SEGUROS"}));
		comboOper.setBounds(162, 36, 205, 22);
		contentPane.add(comboOper);
		
		JButton btnNfeSp = new JButton("S\u00E3o Paulo");
		btnNfeSp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNfeSp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     try{
			            URI link = new URI("https://nfe.prefeitura.sp.gov.br/login.aspx");
			            Desktop.getDesktop().browse(link);
			        }catch(Exception erro){
			            System.out.println(erro);
			        }
			}
		});
		btnNfeSp.setBounds(63, 204, 106, 23);
		contentPane.add(btnNfeSp);
		
		btnTab = new JButton("Tabo\u00E3o");
		btnTab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				try{
			            URI link = new URI("https://nfe.etransparencia.com.br/sp.taboaodaserra/nfe/principal.aspx");
			            Desktop.getDesktop().browse(link);
			        }catch(Exception erro){
			            System.out.println(erro);
			        }
			
			}
		});
		btnTab.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTab.setBounds(63, 238, 106, 23);
		contentPane.add(btnTab);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(0, 268, 444, -110);
		contentPane.add(horizontalBox);
		
		JButton btnSc = new JButton("S\u00E3o Caetano");
		btnSc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 try{
			            URI link = new URI("https://saocaetano.ginfes.com.br/");
			            Desktop.getDesktop().browse(link);
			        }catch(Exception erro){
			            System.out.println(erro);
			        }
			}
		});
		btnSc.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSc.setBounds(179, 204, 106, 23);
		contentPane.add(btnSc);
		
		JButton btnSbc = new JButton("SBC");
		btnSbc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try{
			            URI link = new URI("https://nfse.isssbc.com.br/");
			            Desktop.getDesktop().browse(link);
			        }catch(Exception erro){
			            System.out.println(erro);
			        }
				
			}
		});
		btnSbc.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSbc.setBounds(179, 238, 106, 23);
		contentPane.add(btnSbc);
		
		btnPoa = new JButton("Po\u00E1");
		btnPoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
		            URI link = new URI("https://nfe.etransparencia.com.br/sp.poa/nfe/principal.aspx");
		            Desktop.getDesktop().browse(link);
		        }catch(Exception erro){
		            System.out.println(erro);
		        }
				
			}
		});
		btnPoa.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPoa.setBounds(295, 238, 106, 23);
		contentPane.add(btnPoa);
		
		btnOsa = new JButton("Osasco");
		btnOsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try{
			            URI link = new URI("https://nfe.osasco.sp.gov.br/IssWeb/portal/homeportal.aspx");
			            Desktop.getDesktop().browse(link);
			        }catch(Exception erro){
			            System.out.println(erro);
			        }
			}
		});
		btnOsa.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOsa.setBounds(295, 204, 106, 23);
		contentPane.add(btnOsa);
		
		JLabel lblSitesParaEmisso = new JLabel("Sites para emiss\u00E3o de Notas Fiscais");
		lblSitesParaEmisso.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSitesParaEmisso.setBounds(86, 171, 315, 22);
		contentPane.add(lblSitesParaEmisso);
		
		txtDesc = new JTextField();
		txtDesc.setEditable(false);
		txtDesc.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtDesc.setText(" REFERENTE AOS SERVI\u00C7OS M\u00C9DICOS PRESTADOS - ATENDIMENTOS   /2021");
		txtDesc.setColumns(10);
		txtDesc.setBounds(34, 128, 382, 20);
		contentPane.add(txtDesc);
		
		JLabel lblNewLabel_2 = new JLabel("Discrimina\u00E7\u00E3o do Servi\u00E7o:");
		lblNewLabel_2.setBounds(34, 111, 168, 14);
		contentPane.add(lblNewLabel_2);
		
		setLocationRelativeTo( null );
		
		setIconImage(getIconImage());
		}
		public final Image getIconImage () {

			 Image ICONE = Toolkit.getDefaultToolkit().getImage( ClassLoader.getSystemResource("imagens/iconmpost.png"));

			return ICONE;
	}
}
