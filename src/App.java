import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class App {

	public static void main (String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao carregar aparencia");
		}
		
		JFrame frame = new JFrame();
		JPanel panelCadastro = new JPanel();
		JPanel panelLista = new JPanel();
		JLabel labelImagem = new PropriedadeLabel("insira a imagem aqui", Color.BLACK, Color.darkGray, 12);
		JLabel labelTitulo = new PropriedadeLabel("Título", 16);
		JLabel labelSinopse = new PropriedadeLabel("Sinopse", 16);
		JLabel labelGenero = new PropriedadeLabel("Gênero", 16);
		JLabel labelLocal = new PropriedadeLabel("Onde assistir", 16);
		JLabel labelNetflix = new PropriedadeLabel("Netflix", 12);
		JLabel labelPrime = new PropriedadeLabel("Prime Video", 12);
		JLabel labelPirate = new PropriedadeLabel("Pirate Bay", 12);
		JLabel labelAssistido = new PropriedadeLabel("Assistido", 12);
		JLabel labelAvaliacao = new PropriedadeLabel("Avaliação", 12);
		JTextArea areaSinopse = new JTextArea();
		JTabbedPane aba = new JTabbedPane(JTabbedPane.TOP);
		JTextField textTitulo = new JTextField();
		JButton botaoSalvar = new PropriedadeBotao("Salvar", Color.BLUE, Color.LIGHT_GRAY, 16);
		JButton botaoCancelar = new PropriedadeBotao("Cancelar", Color.BLACK, Color.LIGHT_GRAY, 16);
		JRadioButton radioBotaoNetflix = new JRadioButton();
		JRadioButton radioBotaoPrime = new JRadioButton();
		JRadioButton radioBotaoPirate = new JRadioButton();
		JCheckBox chkBoxAssistido = new JCheckBox();
		StarRater starRaterAvaliacao = new StarRater(5);
		
		frame.setSize(700,425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		//frame.pack();
		frame.setTitle("FIAP MOVIES - Entrega Parcial");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		aba.add("Cadastro", panelCadastro);
		aba.add("Lista", panelLista);
		frame.add(aba);
		
		panelCadastro.setLayout(null);
		
		labelImagem.setBounds(20, 30, 125 ,175);
		labelImagem.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		labelImagem.setOpaque(true);
		panelCadastro.add(labelImagem);
		
		labelTitulo.setBounds(175 , 30 , 100, 20 );
		panelCadastro.add(labelTitulo);
		
		textTitulo.setBounds(175, 55 , 200, 25);
		textTitulo.setBorder(BorderFactory.createLineBorder(Color.gray));
		panelCadastro.add(textTitulo);
		
		labelSinopse.setBounds(175, 95, 100, 20);
		panelCadastro.add(labelSinopse);
		
		areaSinopse.setBounds(175, 120, 200, 100);
		areaSinopse.setBorder(BorderFactory.createLineBorder(Color.gray));
		areaSinopse.setLineWrap(true);
		panelCadastro.add(areaSinopse);
		
		labelGenero.setBounds(175, 240, 100, 20);
		panelCadastro.add(labelGenero);
		
		labelLocal.setBounds(425 , 30 , 100, 20);
		panelCadastro.add(labelLocal);
		
		labelNetflix.setBounds(450 , 60 , 50, 30);
		panelCadastro.add(labelNetflix);
		
		labelPrime.setBounds(450, 80, 100,30);
		panelCadastro.add(labelPrime);
		
		labelPirate.setBounds(450, 100, 100, 30);
		panelCadastro.add(labelPirate);
		
		labelAssistido.setBounds(450, 140 , 100, 30);
		panelCadastro.add(labelAssistido);
		
		labelAvaliacao.setBounds(425, 180, 100, 30);
		panelCadastro.add(labelAvaliacao);
		
		radioBotaoNetflix.setBounds(425, 64 , 20, 20);
		panelCadastro.add(radioBotaoNetflix);
		
		radioBotaoPrime.setBounds(425, 84, 20, 20);
		panelCadastro.add(radioBotaoPrime);
		
		radioBotaoPirate.setBounds(425, 104 , 20, 20);
		panelCadastro.add(radioBotaoPirate);
		
		ButtonGroup buttonLocalGrupo = new ButtonGroup();
		buttonLocalGrupo.add(radioBotaoPirate);
		buttonLocalGrupo.add(radioBotaoPrime);
		buttonLocalGrupo.add(radioBotaoNetflix);
		
		chkBoxAssistido.setBounds(425, 144, 20,20);
		panelCadastro.add(chkBoxAssistido);
		
		botaoSalvar.setBounds(245, 300, 100, 30);
		panelCadastro.add(botaoSalvar);
		
		botaoCancelar.setBounds(355, 300, 100, 30);
		panelCadastro.add(botaoCancelar);
		
		
		
		starRaterAvaliacao.setBounds(425, 210, 100, 30);
		panelCadastro.add(starRaterAvaliacao);
		
		String[] generos = {"Ação", "Aventura", "Comédia", "Comédia de Ação", "Comédia de Terror", "Comédia Romântica", 
				"Dança", "Documentário", "Drama", "Espionagem", "Fantasia", "Ficção Científica", "Musical", "Romance", 
				"Suspense", "Terror"
		};
		
		
		JComboBox<String> cmbGenero = new JComboBox<String>(generos);
		cmbGenero.setVisible(true);
		cmbGenero.setFont(new Font("Arial", Font.PLAIN, 12));
		cmbGenero.setSelectedItem(null);
		panelCadastro.add(cmbGenero);
		cmbGenero.setBounds(175, 270 ,140,20);
		
		botaoCancelar.addActionListener(new BotaoCancelarListener(textTitulo, areaSinopse, cmbGenero,chkBoxAssistido,
				radioBotaoPirate, radioBotaoPrime, radioBotaoNetflix, starRaterAvaliacao));
		
		botaoSalvar.addActionListener(new BotaoSalvarListener(textTitulo, areaSinopse, cmbGenero, chkBoxAssistido,
				radioBotaoPirate, radioBotaoPrime, radioBotaoNetflix, starRaterAvaliacao));
		
	}
	
}
