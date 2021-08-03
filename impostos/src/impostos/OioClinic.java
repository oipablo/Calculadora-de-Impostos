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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class OioClinic extends JFrame {

	private JPanel contentPane;
	private JTextField txtValO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OioClinic frame = new OioClinic();
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
	public OioClinic() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValorDaNota = new JLabel("Valor da Nota:");
		lblValorDaNota.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorDaNota.setBounds(72, 38, 112, 20);
		contentPane.add(lblValorDaNota);
		
		txtValO = new JTextField();
		txtValO.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtValO.setColumns(10);
		txtValO.setBounds(176, 38, 188, 20);
		contentPane.add(txtValO);
		
		JButton btnNfeO = new JButton("NFE SP");
		btnNfeO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  try{
			            URI link = new URI("https://nfe.prefeitura.sp.gov.br/login.aspx");
			            Desktop.getDesktop().browse(link);
			        }catch(Exception erro){
			            System.out.println(erro);
			        }
				
			}
		});
		btnNfeO.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNfeO.setBounds(335, 228, 89, 23);
		contentPane.add(btnNfeO);
		
		JTextArea txtResultado = new JTextArea();
		txtResultado.setEditable(false);
		txtResultado.setWrapStyleWord(true);
		txtResultado.setBounds(72, 85, 292, 114);
		contentPane.add(txtResultado);
		
		JButton btC = new JButton("");
		btC.setForeground(new Color(153, 204, 204));
		btC.setBackground(new Color(153, 204, 204));
		btC.setIcon(new ImageIcon(OioClinic.class.getResource("/imagens/keys.png")));
		btC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				double ValrO = Double.parseDouble(txtValO.getText().replace(',', '.'));
				
				DecimalFormat formatador = new DecimalFormat("#0.00");
				
				double retenir = 1.50/100;
				double retenlei = 4.65/100;
				double reteniss = 2.00/100;
				
				double total = (retenir*ValrO)+(retenlei*ValrO)+(reteniss*ValrO);
				double total2 =(retenlei*ValrO)+(reteniss*ValrO);
				double total3 =(reteniss*ValrO);
				
				if (ValrO >= 225 && ValrO < 667 ) {
					
					JOptionPane.showMessageDialog(null, "PARA ESTE VALOR NÃO COBRAR IRRF!");					
					
		txtResultado.setText(String.valueOf(("PRESTAÇÃO DE SERVIÇOS MÉDICOS.\n\nRETENÇÃO LEI 10833  4,65% =  R$ ")+formatador.format(ValrO * retenlei)+("\nRETENÇÃO ISS 2%=                      R$ ")+formatador.format(ValrO * reteniss)+
		("\n\nValor Liquido =  R$ ")+formatador.format(ValrO-total2)));	
				
				}else if(ValrO >= 667) {
					
					txtResultado.setText(String.valueOf(("PRESTAÇÃO DE SERVIÇOS MÉDICOS.\n\nRETENÇÃO IR 1,5% =     	  R$ ")+formatador.format(ValrO * retenir)+
							("\nRETENÇÃO LEI 10833  4,65% =  R$ ")+formatador.format(ValrO * retenlei)+("\nRETENÇÃO ISS 2% =               	  R$ ")+formatador.format(ValrO * reteniss)+
							("\n\nValor Liquido =  R$ ")+formatador.format(ValrO-total)));	
				
				}else {
					txtResultado.setText(String.valueOf(("PRESTAÇÃO DE SERVIÇOS MÉDICOS.\n\nRETENÇÃO ISS 2%=                      R$ ")+formatador.format(ValrO * reteniss)+
							("\n\nValor Liquido =  R$ ")+formatador.format(ValrO-total3)));	
				}
				
				
				
			}
		});
		btC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btC.setBounds(233, 210, 32, 32);
		contentPane.add(btC);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 50, 14);
		contentPane.add(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmCalcular = new JMenuItem("Calcular");
		mntmCalcular.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
		mntmCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=============================
				
	
				
				double ValrO = Double.parseDouble(txtValO.getText().replace(',', '.'));
				
				DecimalFormat formatador = new DecimalFormat("#0.00");
				
				double retenir = 1.50/100;
				double retenlei = 4.65/100;
				double reteniss = 2.00/100;
				
				double total = (retenir*ValrO)+(retenlei*ValrO)+(reteniss*ValrO);
				double total2 =(retenlei*ValrO)+(reteniss*ValrO);
				double total3 =(reteniss*ValrO);
				
				if (ValrO >= 225 && ValrO < 667 ) {
					
					JOptionPane.showMessageDialog(null, "PARA ESTE VALOR NÃO COBRAR IRRF!");					
					
		txtResultado.setText(String.valueOf(("PRESTAÇÃO DE SERVIÇOS MÉDICOS.\n\nRETENÇÃO LEI 10833  4,65% =  R$ ")+formatador.format(ValrO * retenlei)+("\nRETENÇÃO ISS 2%=                      R$ ")+formatador.format(ValrO * reteniss)+
		("\n\nValor Liquido =  R$ ")+formatador.format(ValrO-total2)));	
				
				}else if(ValrO >= 667) {
					
					txtResultado.setText(String.valueOf(("PRESTAÇÃO DE SERVIÇOS MÉDICOS.\n\nRETENÇÃO IR 1,5% =     	  R$ ")+formatador.format(ValrO * retenir)+
							("\nRETENÇÃO LEI 10833  4,65% =  R$ ")+formatador.format(ValrO * retenlei)+("\nRETENÇÃO ISS 2% =               	  R$ ")+formatador.format(ValrO * reteniss)+
							("\n\nValor Liquido =  R$ ")+formatador.format(ValrO-total)));	
				
				}else {
					txtResultado.setText(String.valueOf(("PRESTAÇÃO DE SERVIÇOS MÉDICOS.\n\nRETENÇÃO ISS 2%=                      R$ ")+formatador.format(ValrO * reteniss)+
							("\n\nValor Liquido =  R$ ")+formatador.format(ValrO-total3)));	
				}
				
				
				//=============================
				
				
			}
		});
		mnMenu.add(mntmCalcular);
		
		JMenuItem mntmLimpar = new JMenuItem("Limpar");
		mntmLimpar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_MASK));
		mntmLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValO.setText("");
				txtResultado.setText("");	
				
			}
		});
		mnMenu.add(mntmLimpar);
		
		JButton btcLim = new JButton("");
		btcLim.setForeground(new Color(153, 204, 204));
		btcLim.setBackground(new Color(153, 204, 204));
		btcLim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtValO.setText("");
				txtResultado.setText("");	
				
			}
		});
		btcLim.setIcon(new ImageIcon(OioClinic.class.getResource("/imagens/sweeping.png")));
		btcLim.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btcLim.setBounds(275, 210, 32, 32);
		contentPane.add(btcLim);
		
		setLocationRelativeTo( null );
		
		setIconImage(getIconImage());
		}
		public final Image getIconImage () {

			 Image ICONE = Toolkit.getDefaultToolkit().getImage( ClassLoader.getSystemResource("imagens/iconmpost.png"));

			return ICONE;
	}
}
