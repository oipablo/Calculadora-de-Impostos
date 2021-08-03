package impostos;

import java.awt.Color;
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
import java.net.URI;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;


public class CalculoNota extends JFrame {

	private JPanel contentPane;
	private JTextField txtIR;
	private JTextField txtPIS;
	private JTextField txtCOFINS;
	private JTextField txtCSLL;
	private JTextField txtValor;
	private JTextField txtIRcaixa;
	private JTextField txtLiq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoNota frame = new CalculoNota();
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
	public CalculoNota() {
		setBackground(new Color(0, 128, 128));
		setResizable(false);
		setTitle("Calcular Impostos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 391);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.MAGENTA);
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmCalcular = new JMenuItem("Calcular");
		mntmCalcular.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
		mntmCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===================================
				
	
				
				double Valor = Double.parseDouble(txtValor.getText().replace(',', '.'));
				
				DecimalFormat formatador = new DecimalFormat("#0.00");
				
				double ir = 1.50/100;
				double pis = 0.65/100;
				double cofins = 3.00/100;
				double csll = 1.00/100;
				double irCaixa = 4.80/100;
				
				if (Valor >= 225 && Valor < 667 ) {
					
					JOptionPane.showMessageDialog(null, "PARA ESTE VALOR NÃO COBRAR IRRF!");
					
					txtIR.setText("");
					txtIRcaixa.setText("");
					txtPIS.setText(String.valueOf(formatador.format(Valor * pis)));	
					txtCOFINS.setText(String.valueOf(formatador.format(Valor * cofins)));	
					txtCSLL.setText(String.valueOf(formatador.format(Valor * csll)));
					txtLiq.setText(String.valueOf(formatador.format(Valor -((Valor * pis)+(Valor * cofins)+(Valor * csll)))));
				
				
				}
				else if(Valor >= 667) {
					txtPIS.setText(String.valueOf(formatador.format(Valor * pis)));	
					txtCOFINS.setText(String.valueOf(formatador.format(Valor * cofins)));	
					txtCSLL.setText(String.valueOf(formatador.format(Valor * csll)));
					txtIR.setText(String.valueOf(formatador.format(Valor * ir)));
					txtIRcaixa.setText(String.valueOf(formatador.format(Valor * irCaixa)));
					txtLiq.setText(String.valueOf(formatador.format(Valor -((Valor * pis)+(Valor * cofins)+(Valor * csll)+(Valor * ir)))));
				}
				else {
					JOptionPane.showMessageDialog(null, "IMPOSTOS SOMENTE ACIMA DE R$225.00");
					txtValor.setText("");
					txtIR.setText("");	
					txtPIS.setText("");
					txtCOFINS.setText("");
					txtCSLL.setText("");
					txtIRcaixa.setText("");
					txtLiq.setText("");
				}
					
			
				//===================================
			}
		});
		mnMenu.add(mntmCalcular);
		
		JMenuItem mntmLimpar = new JMenuItem("Limpar");
		mntmLimpar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		mntmLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===================================
				
				txtValor.setText("");
				txtIR.setText("");	
				txtPIS.setText("");
				txtCOFINS.setText("");
				txtCSLL.setText("");
				txtIRcaixa.setText("");
				txtLiq.setText("");
				
				
				
				//===================================
			}
		});
		mnMenu.add(mntmLimpar);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mnMenu.add(mntmSair);
		
		JMenu mnNewMenu = new JMenu("Operadoras");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cnpj Operadoras");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Cnpj().setVisible(true);
			}
		});
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnAjuda = new JMenu("Sobre");
		mnAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
						
				
			}
		});
		
		JMenu mnClinisul = new JMenu("Clinisul");
		menuBar.add(mnClinisul);
		
		JMenuItem mntmEmissoDeNota = new JMenuItem("Emiss\u00E3o de Nota");
		mntmEmissoDeNota.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mntmEmissoDeNota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new Clinisul().setVisible(true);
			}
		});
		mnClinisul.add(mntmEmissoDeNota);
		
		JMenu mnOioclinic = new JMenu("OioClinic");
		menuBar.add(mnOioclinic);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Emiss\u00E3o de Nota");
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_MASK));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new OioClinic().setVisible(true);
			}
		});
		mnOioclinic.add(mntmNewMenuItem_1);
		menuBar.add(mnAjuda);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mntmAjuda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
		mntmAjuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "VALORES ABAIXO DE R$225,00 NÃO POSSUEM IMPOSTOS.\r\n" + 				
						"\r\n" +  
						"DE R$225,00 a R$667,00 COFINS CSLL E PIS.\r\n" + 
						"\r\n" + 
						"ACIMA DE R$667,00 COMBRAM-SE TODOS IMPOSTOS!.\n\n");
				
			}
		});
		mnAjuda.add(mntmAjuda);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(32, 178, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValorDaNota = new JLabel("Valor da Nota");
		lblValorDaNota.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblValorDaNota.setBounds(32, 43, 112, 20);
		contentPane.add(lblValorDaNota);
		
		JLabel lblIrrf = new JLabel("IRRF");
		lblIrrf.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIrrf.setBounds(132, 116, 40, 20);
		contentPane.add(lblIrrf);
		
		JLabel lblPis = new JLabel("PIS");
		lblPis.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPis.setBounds(132, 147, 28, 20);
		contentPane.add(lblPis);
		
		JLabel lblCofins = new JLabel("COFINS");
		lblCofins.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCofins.setBounds(132, 178, 61, 20);
		contentPane.add(lblCofins);
		
		JLabel lblCsll = new JLabel("CSLL");
		lblCsll.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCsll.setBounds(132, 209, 39, 20);
		contentPane.add(lblCsll);
		
		JButton btnCalcular = new JButton("");
		btnCalcular.setForeground(new Color(32, 178, 170));
		btnCalcular.setBackground(new Color(32, 178, 170));
		btnCalcular.addKeyListener(new KeyAdapter() {
			
			
			public void keyPressed(KeyEvent e) {
				getRootPane().setDefaultButton(btnCalcular);
			}
		});
		btnCalcular.setIcon(new ImageIcon(CalculoNota.class.getResource("/imagens/keys.png")));
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===============================
			
				
				double Valor = Double.parseDouble(txtValor.getText().replace(',', '.'));
				
				DecimalFormat formatador = new DecimalFormat("#0.00");
				
				double ir = 1.50/100;
				double pis = 0.65/100;
				double cofins = 3.00/100;
				double csll = 1.00/100;
				double irCaixa = 4.80/100;
				
				if (Valor >= 225 && Valor < 667 ) {
					
					JOptionPane.showMessageDialog(null, "PARA ESTE VALOR NÃO COBRAR IRRF!");
					
					txtIR.setText("");
					txtIRcaixa.setText("");
					txtPIS.setText(String.valueOf(formatador.format(Valor * pis)));	
					txtCOFINS.setText(String.valueOf(formatador.format(Valor * cofins)));	
					txtCSLL.setText(String.valueOf(formatador.format(Valor * csll)));
					txtLiq.setText(String.valueOf(formatador.format(Valor -((Valor * pis)+(Valor * cofins)+(Valor * csll)))));
				
				
				}
				else if(Valor >= 667) {
					txtPIS.setText(String.valueOf(formatador.format(Valor * pis)));	
					txtCOFINS.setText(String.valueOf(formatador.format(Valor * cofins)));	
					txtCSLL.setText(String.valueOf(formatador.format(Valor * csll)));
					txtIR.setText(String.valueOf(formatador.format(Valor * ir)));
					txtIRcaixa.setText(String.valueOf(formatador.format(Valor * irCaixa)));
					txtLiq.setText(String.valueOf(formatador.format(Valor -((Valor * pis)+(Valor * cofins)+(Valor * csll)+(Valor * ir)))));
				}
				else {
					JOptionPane.showMessageDialog(null, "IMPOSTOS SOMENTE ACIMA DE R$225.00");
					txtValor.setText("");
					txtIR.setText("");	
					txtPIS.setText("");
					txtCOFINS.setText("");
					txtCSLL.setText("");
					txtIRcaixa.setText("");
					txtLiq.setText("");
				}
					
			
			
				//===============================
				
			}

			private Object replace(char c, char d) {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnCalcular.setBounds(245, 263, 32, 32);
		contentPane.add(btnCalcular);
		
		txtIR = new JTextField();
		txtIR.setEditable(false);
		txtIR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtIR.setBounds(207, 116, 86, 20);
		contentPane.add(txtIR);
		txtIR.setColumns(10);
		
		txtPIS = new JTextField();
		txtPIS.setEditable(false);
		txtPIS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPIS.setColumns(10);
		txtPIS.setBounds(207, 147, 86, 20);
		contentPane.add(txtPIS);
		
		txtCOFINS = new JTextField();
		txtCOFINS.setEditable(false);
		txtCOFINS.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCOFINS.setColumns(10);
		txtCOFINS.setBounds(207, 178, 86, 20);
		contentPane.add(txtCOFINS);
		
		txtCSLL = new JTextField();
		txtCSLL.setEditable(false);
		txtCSLL.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCSLL.setColumns(10);
		txtCSLL.setBounds(207, 209, 86, 20);
		contentPane.add(txtCSLL);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtValor.setColumns(10);
		txtValor.setBounds(165, 43, 155, 20);
		contentPane.add(txtValor);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.setForeground(new Color(32, 178, 170));
		btnLimpar.setBackground(new Color(32, 178, 170));
		btnLimpar.setIcon(new ImageIcon(CalculoNota.class.getResource("/imagens/sweeping.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//======================================
				
				txtValor.setText("");
				txtIR.setText("");	
				txtPIS.setText("");
				txtCOFINS.setText("");
				txtCSLL.setText("");
				txtIRcaixa.setText("");
				txtLiq.setText("");
				
				
				//======================================
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLimpar.setBounds(318, 263, 32, 32);
		contentPane.add(btnLimpar);
		
		JLabel lblIrCaixa = new JLabel("IR CAIXA");
		lblIrCaixa.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblIrCaixa.setBounds(352, 116, 77, 20);
		contentPane.add(lblIrCaixa);
		
		txtIRcaixa = new JTextField();
		txtIRcaixa.setEditable(false);
		txtIRcaixa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtIRcaixa.setColumns(10);
		txtIRcaixa.setBounds(434, 116, 86, 20);
		contentPane.add(txtIRcaixa);
		
		JButton btnSair = new JButton("");
		btnSair.setBackground(new Color(32, 178, 170));
		btnSair.setForeground(new Color(32, 178, 170));
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				{ System.exit(0);
				}
				}
				
			
		});
		btnSair.setIcon(new ImageIcon(CalculoNota.class.getResource("/imagens/power-button.png")));
		btnSair.setBounds(530, 299, 32, 32);
		contentPane.add(btnSair);
		
		JLabel lblusePontoE = new JLabel("\"Use V\u00EDrgula somente para os Centavos Ex: 4650.50\"");
		lblusePontoE.setForeground(new Color(255, 255, 255));
		lblusePontoE.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblusePontoE.setBounds(117, 66, 303, 16);
		contentPane.add(lblusePontoE);
		
		JLabel lblCalcular = new JLabel("Calcular");
		lblCalcular.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblCalcular.setBounds(245, 297, 41, 11);
		contentPane.add(lblCalcular);
		
		JLabel lblLimpar = new JLabel("Limpar");
		lblLimpar.setFont(new Font("Tahoma", Font.BOLD, 9));
		lblLimpar.setBounds(318, 297, 41, 11);
		contentPane.add(lblLimpar);
		
		JLabel lblNewLabel = new JLabel("1,50%");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(296, 121, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0,65%");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(296, 152, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("3,00%");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(296, 183, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("1,00%");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(296, 214, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("4,80%");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(526, 121, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblValorLquido = new JLabel("Valor L\u00EDquido");
		lblValorLquido.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblValorLquido.setBounds(421, 183, 107, 20);
		contentPane.add(lblValorLquido);
		
		txtLiq = new JTextField();
		txtLiq.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLiq.setEditable(false);
		txtLiq.setColumns(10);
		txtLiq.setBounds(421, 209, 107, 20);
		contentPane.add(txtLiq);
		
		JButton btnInsta = new JButton("");
		btnInsta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//================================
				 
				try{
			            URI link = new URI("https://www.instagram.com/pa.bloh/");
			            Desktop.getDesktop().browse(link);
			        }catch(Exception erro){
			            System.out.println(erro);
			        }
				
				//================================
			
			}
		});
		btnInsta.setBackground(new Color(32, 178, 170));
		btnInsta.setIcon(new ImageIcon(CalculoNota.class.getResource("/imagens/instagram.png")));
		btnInsta.setBounds(10, 307, 24, 24);
		contentPane.add(btnInsta);
		
		JLabel lblPabloHenrique = new JLabel("Pablo Henrique");
		lblPabloHenrique.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblPabloHenrique.setBounds(39, 317, 72, 14);
		contentPane.add(lblPabloHenrique);
		
		setLocationRelativeTo( null );
		
		setIconImage(getIconImage());
	}
	public final Image getIconImage () {

		 Image ICONE = Toolkit.getDefaultToolkit().getImage( ClassLoader.getSystemResource("imagens/iconmpost.png"));

		return ICONE;
		
		
		
	}
}
