package advuni.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ADMainWindow extends JFrame {

	private static final long serialVersionUID = 4742581141544834435L;
	private JPanel contentPane;
	
	private JTextField txtUserInput;
	private JScrollPane scrollPane;
	private JTextPane txtpnMainView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADMainWindow frame = new ADMainWindow();
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
	public ADMainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtUserInput = new JTextField();
		txtUserInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (txtUserInput.getText().equals("")) return;
				int key_code = arg0.getKeyCode();
				if (key_code == arg0.VK_ENTER) {
					sendInput();
				}
			}
		});
		contentPane.add(txtUserInput, BorderLayout.SOUTH);
		txtUserInput.setColumns(10);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		txtpnMainView = new JTextPane();
		txtpnMainView.setEditable(false);
		txtpnMainView.setText("Main view");
		scrollPane.setViewportView(txtpnMainView);
	}

	public void sendInput() {
		disp(txtUserInput.getText());
		txtUserInput.setText("");
	}
	
	public void disp(String str)
	{
		txtpnMainView.setText(txtpnMainView.getText() + "\n" + str);
	}

}
