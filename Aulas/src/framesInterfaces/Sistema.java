package framesInterfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;// importando a classe JFrame
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


public class Sistema {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Meu frame");// Intanciando o componente
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Defininco algumasc configura��es co componente
		frame.setSize(400, 300);
		frame.setLayout(null);
		
		//frame.setVisible(true);// Tornando o componente visivel
		
		//JLabel
		
		//JLabel label = new JLabel("Hello World ",JLabel.CENTER);// instanciando componente
		//label.setBounds(20,130,360,40);
		
		//frame.add(label);// adicionando ocomponente no frame
		
		//TexteField
//		JTextField textField = new JTextField();// instanciando componente
//		textField.setBounds(20, 130, 360,40); // difininco o posicionamento e tamanho do componente
//		frame.add(textField);// adicionando o componente no Jframe
		
		//Password
//		JPasswordField passworldTextField = new JPasswordField();// instanciando o componente
//		passworldTextField.setBounds(20, 130, 360, 40);// definindo o posicionamentoe tamanho do componente
//		frame.add(passworldTextField); //adicionando componente no frame
//		
		//JButton
//		JButton button = new JButton("Bot�o");
//		button.setBounds(20, 130, 360, 40);
//		
//		frame.add(button);// adicionadno component no frame
		
		//JMenu adicona um Menu no formulario
//		JMenuBar menuBar = new JMenuBar(); //Instanciando
//		JMenu menu = new JMenu("Menu"); // instanciando
//		JMenuItem menuItem = new JMenuItem("Ol�!");// instanciando
//		
//		menu.add(menuItem); // adicionando o menuItem no menu
//		menuBar.add(menu); // e o menu no MenuBar
//		
//		frame.setJMenuBar(menuBar);// adicionando componente
		
		
		//JCheckBox � a classe utilizada para criar caixas de op��o que permitem
		//representar uma op��o selecionada (true) e outra n�o selecionada (false)
		
//		JCheckBox checkBox = new JCheckBox("checkBox"); // instanciando componente
//		checkBox.setBounds(20, 130, 360, 40);
//		frame.add(checkBox);// adicionando componente no frame
		
		/*A classe JRadioButton nos permite criar os chamados bot�es de r�dio. 
		 * Ao utilizarmos bot�es de r�dio, precisamos sempre agrup�-los em um objeto ButtonGroup.*/
//		JRadioButton radioButton = new JRadioButton("radioButton");
//		radioButton.setBounds(20, 130, 360, 40);
//		frame.add(radioButton);
		
		/*JList
		 * Para criarmos listas de sele��o, utilizamos a classe JList. Essa classe possibilita que 
		 * o usu�rio escolha um ou v�rios valores armazenados em uma lista
		 * */
//		String[] itens = {"item 1", "item 2"};
//		JList list = new JList(itens);
//		list.setBounds(20, 130, 360, 40);
//		frame.add(list);
		/*JComboBox
		 * A classe JComboBox funciona de forma semelhante � classe JList, por�m nos permite 
		 * selecionar apenas um item.*/
//		String[] itens = {"item 1", "item 2", "item 3"};
//		JComboBox comboBox = new JComboBox(itens);
//		comboBox.setBounds(20, 130, 360, 40);
//		frame.add(comboBox);
//		
		/*JTextArea
		 * Com a classe JTextArea, podemos criar um campo para o usu�rio digitar um texto, 
		 * semelhante ao que � criado por meio do JTextField, mas com diversas linhas.*/
//		JTextArea textArea = new JTextArea();
//		textArea.setBounds(20, 130, 360, 120);
//		frame.add(textArea);
		
		/*JOptionPane
		 * Essa classe � a mais simples da biblioteca Swing. Ela possibilita uma intera��o com o
		 * usu�rio por meio de janelas de mensagem, confirma��o, erros, entre outras informa��es.*/
		//JOptionPane.showMessageDialog(null, "Ol� usu�rio");
		
		//JScrollBar
//		JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 1, 0, 100);
//		
//		scrollBar.setBounds(20, 130,360, 15);
//		frame.add(scrollBar);
		
		//JProgressBar
		//Utilizando a classe JProgressBar, podemos mostrar ao usu�rio o andamento de determinada a��o,
		//como o carregamento de uma imagem externa.
//		JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 1, 100);
//		progressBar.setValue(10);
//		progressBar.setBounds(20, 130, 360, 15);
//		frame.add(progressBar);
//		
//		//JFileChooser
//		//Utilizamos a classe JFileChooser para permitir que o usu�rio escolha um ou mais arquivos 
//		//em sua pr�pria m�quina,
//		JFileChooser fileChooser = new JFileChooser();
//		int retorno = fileChooser.showOpenDialog(null);
//		if(retorno == JFileChooser.APPROVE_OPTION) {
//			java.io.File file = fileChooser.getSelectedFile();
//			System.out.println(file.toString());
//			
//		}
//		else {
//			System.out.println("Nenhum arquivo soi selecionando");
//		}
		
		JButton button = new JButton("Bot�o");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bot�o acionado");
				
			}
		});
		button.setBounds(20, 130,360, 40);
		frame.add(button);
		frame.setVisible(true);// Tornando o componente visivel
		
		

	}

}
