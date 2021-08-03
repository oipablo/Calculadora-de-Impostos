package impostos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.text.DecimalFormat;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class Clinisul extends JFrame {

	private JPanel contentPane;
	private JTextField txtVal;
	private JTextArea txtResul;
	private JTextField txtIn;
	private JTextField txtIss;
	protected Object cbnCon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clinisul frame = new Clinisul();
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
	public Clinisul() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValorDaNota = new JLabel("Valor da Nota:");
		lblValorDaNota.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorDaNota.setBounds(10, 135, 112, 20);
		contentPane.add(lblValorDaNota);
		
		txtVal = new JTextField();
		txtVal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtVal.setColumns(10);
		txtVal.setBounds(114, 135, 173, 20);
		contentPane.add(txtVal);
		
		JButton btnCal = new JButton("");
		btnCal.setForeground(new Color(153, 204, 204));
		btnCal.setBackground(new Color(153, 204, 204));
		btnCal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				  {
				     

				    
			}}
			
		
			
			
		});
		btnCal.addActionListener(new ActionListener() 
				
		{
			public void actionPerformed(ActionEvent arg0) {
				
				//======================================
				

			    
				double Valr = Double.parseDouble(txtVal.getText().replace(',', '.'));
				
				DecimalFormat formatador = new DecimalFormat("#0.00");
				
				double federal = 13.45/100;
				double municipal = 2.69/100;
				
				
				
				
					
				txtResul.setText(String.valueOf(("Tributos Aproximados:\nFederal R$ ")+formatador.format(Valr * federal)+
						("\nMunicipal R$ ")+formatador.format(Valr * municipal)+("\n\nFonte: IBPT \n\n \"ARE N.0 12.017,PROCESSO 2013-0.224-39 3-0\"")));	
				
					
		
				
				//======================================
			}
		});
		btnCal.setIcon(new ImageIcon(Clinisul.class.getResource("/imagens/keys.png")));
		btnCal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCal.setBounds(311, 166, 32, 32);
		contentPane.add(btnCal);
		
		JComboBox cbnCon = new JComboBox();
		cbnCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//==================================
				if(cbnCon.getSelectedItem().equals("ALLIANZ SAÚDE S.A")) {
					
					txtIn.setText("NÃO INFORMAR");
					txtIss.setText("NÃO");
					
				}else if (cbnCon.getSelectedItem().equals("AMIL ASSISTÊNCIA MÉDICA INTERNACIONAL S.A")) {
					txtIn.setText("29309127/0001-79 - AMIL");
					txtIss.setText("SIM");
				}else if (cbnCon.getSelectedItem().equals("AMR (ECOLE SERVIÇOS MÉDICOS LTDA)")) {
					txtIn.setText("71737001/0001-61 - ECOLE");
					txtIss.setText("SIM");
				}else if (cbnCon.getSelectedItem().equals("BLUE MED (ALVORECER ASSOCIAÇÃO DE SOCORROS MÚTUOS)")) {
					txtIn.setText("NÃO INFORMAR");
					txtIss.setText("NÃO");
				}else if (cbnCon.getSelectedItem().equals("CESP (FUNDAÇÃO CESP)")) {
					txtIn.setText("NÃO INFORMAR");
					txtIss.setText("SIM");
				}else if (cbnCon.getSelectedItem().equals("CNU (CENTRAL NACIONAL UNIMED COOPERATIVA CENTRAL)")) {
					txtIn.setText("02812468/0001-06 - CNU");
					txtIss.setText("SIM");
				}else if (cbnCon.getSelectedItem().equals("DONA SAÚDE")) {
					txtIn.setText("NÃO INFORMAR");
					txtIss.setText("NÃO");
				}else if (cbnCon.getSelectedItem().equals("LEADER ASSISTÊNCIA MÉDICA E HOSPITALAR")) {
					txtIn.setText("NÃO INFORMAR");
					txtIss.setText("NÃO");
				}else if (cbnCon.getSelectedItem().equals("MEDISERVICE OPERADORA DE PLANOS DE SAÚDE S.A")) {
					txtIn.setText("NÃO INFORMAR");
					txtIss.setText("NÃO");
				}else if (cbnCon.getSelectedItem().equals("METRUS INSTITUTO DE SEGURIDADE SOCIAL")) {
					txtIn.setText("NÃO INFORMAR");
					txtIss.setText("SIM");
				}else if (cbnCon.getSelectedItem().equals("PLENA SAÚDE LTDA")) {
					txtIn.setText("00338763/0001-47 - PLENA");
					txtIss.setText("SIM");
				}else if (cbnCon.getSelectedItem().equals("POSTAL SAÚDE CAIXA DE ASSIST.E SAÚDE EMPR.CORREIOS")) {
					txtIn.setText("NÃO INFORMAR");
					txtIss.setText("NÃO");
				}else if (cbnCon.getSelectedItem().equals("SEGUROS UNIMED (UNIMED SEGUROS S/A)")) {
					txtIn.setText("NÃO INFORMAR");
					txtIss.setText("NÃO");
				}else if (cbnCon.getSelectedItem().equals("SOMPO SAÚDE SEGUROS S/A")) {
					txtIn.setText("47184510/0001-20 - SOMPO");
					txtIss.setText("NÃO");
				}else if (cbnCon.getSelectedItem().equals("SUL AMÉRICA SERVIÇOS DE SAÚDE S/A")) {
					txtIn.setText("02866602/0001-51 - SUL AMÉRICA");
					txtIss.setText("SIM");
				}else if (cbnCon.getSelectedItem().equals("TRASMONTANO (CENTRO TRASMONTANO DE SÃO PAULO)")) {
					txtIn.setText("62638374/0012-47 - TRASMONTANO");
					txtIss.setText("SIM");
				}else if (cbnCon.getSelectedItem().equals("UNIHOSP SAÚDE S/A")) {
					txtIn.setText("NÃO INFORMAR");
					txtIss.setText("NÃO");
				}
				
				
				//==================================
			}
		});
		cbnCon.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma op\u00E7\u00E3o", "ALLIANZ SA\u00DADE S.A", "AMIL ASSIST\u00CANCIA M\u00C9DICA INTERNACIONAL S.A", "AMR (ECOLE SERVI\u00C7OS M\u00C9DICOS LTDA)", "BLUE MED (ALVORECER ASSOCIA\u00C7\u00C3O DE SOCORROS M\u00DATUOS)", "CESP (FUNDA\u00C7\u00C3O CESP)", "CNU (CENTRAL NACIONAL UNIMED COOPERATIVA CENTRAL)", "DONA SA\u00DADE", "LEADER ASSIST\u00CANCIA M\u00C9DICA E HOSPITALAR", "MEDISERVICE OPERADORA DE PLANOS DE SA\u00DADE S.A", "METRUS INSTITUTO DE SEGURIDADE SOCIAL", "PLENA SA\u00DADE LTDA", "POSTAL SA\u00DADE CAIXA DE ASSIST.E SA\u00DADE EMPR.CORREIOS", "SEGUROS UNIMED (UNIMED SEGUROS S/A)", "SOMPO SA\u00DADE SEGUROS S/A", "SUL AM\u00C9RICA SERVI\u00C7OS DE SA\u00DADE S/A", "TRASMONTANO (CENTRO TRASMONTANO DE S\u00C3O PAULO)", "UNIHOSP SA\u00DADE S/A"}));
		cbnCon.setBounds(22, 29, 400, 20);
		contentPane.add(cbnCon);
		
		JLabel lblNewLabel = new JLabel("INTERMEDI\u00C1RIO");
		lblNewLabel.setBounds(92, 60, 96, 14);
		contentPane.add(lblNewLabel);
		
		txtIn = new JTextField();
		txtIn.setEditable(false);
		txtIn.setBounds(22, 77, 215, 20);
		contentPane.add(txtIn);
		txtIn.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ISS RETIDO");
		lblNewLabel_1.setBounds(318, 60, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		txtIss = new JTextField();
		txtIss.setEditable(false);
		txtIss.setColumns(10);
		txtIss.setBounds(275, 77, 147, 20);
		contentPane.add(txtIss);
		
		JButton btnLim = new JButton("");
		btnLim.setForeground(new Color(153, 204, 204));
		btnLim.setBackground(new Color(153, 204, 204));
		btnLim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//==========================
				txtResul.setText("");
				txtVal.setText("");	
				txtIss.setText("");
				txtIn.setText("");
				cbnCon.setSelectedItem("Selecione uma opção");
				
				//==========================
				
			}
		});
		btnLim.setIcon(new ImageIcon(Clinisul.class.getResource("/imagens/sweeping.png")));
		btnLim.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLim.setBounds(353, 166, 32, 32);
		contentPane.add(btnLim);
		
		JButton btnNfeSp = new JButton("NFE SP");
		btnNfeSp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===========================
				try{
		            URI link = new URI("https://nfe.prefeitura.sp.gov.br/login.aspx");
		            Desktop.getDesktop().browse(link);
		        }catch(Exception erro){
		            System.out.println(erro);
		        }
				//===========================
				
			}
		});
		btnNfeSp.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNfeSp.setBounds(335, 228, 89, 23);
		contentPane.add(btnNfeSp);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 50, 14);
		contentPane.add(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmCalcular = new JMenuItem("Calcular");
		mntmCalcular.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
		mntmCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//======================
 
				
				double Valr = Double.parseDouble(txtVal.getText().replace(',', '.'));
				
				DecimalFormat formatador = new DecimalFormat("#0.00");
				
				double federal = 13.45/100;
				double municipal = 2.69/100;
				
				
				
				
					
				txtResul.setText(String.valueOf(("Tributos Aproximados:\nFederal R$ ")+formatador.format(Valr * federal)+
						("\nMunicipal R$ ")+formatador.format(Valr * municipal)+("\n\nFonte: IBPT \n\n \"ARE N.0 12.017,PROCESSO 2013-0.224-39 3-0\"")));	
				
		
				
				//======================
			}
		});
		mnMenu.add(mntmCalcular);
		
		JMenuItem mntmLimpar = new JMenuItem("Limpar");
		mntmLimpar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		mntmLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=====================
				
				txtResul.setText("");
				txtVal.setText("");	
				txtIss.setText("");
				txtIn.setText("");
				cbnCon.setSelectedItem("Selecione uma opção");
				
				//=====================
			}
			
		});
		mnMenu.add(mntmLimpar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 166, 294, 83);
		contentPane.add(scrollPane);
		
		txtResul = new JTextArea();
		txtResul.setWrapStyleWord(true);
		scrollPane.setViewportView(txtResul);
		
		
		
		
		txtResul.setEditable(false);
		
		setLocationRelativeTo( null );
		
		setIconImage(getIconImage());
		}
		public final Image getIconImage () {

			 Image ICONE = Toolkit.getDefaultToolkit().getImage( ClassLoader.getSystemResource("imagens/iconmpost.png"));

			return ICONE;
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
		
	
		}
		
	}

