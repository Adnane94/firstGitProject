import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame {
	private JTextArea Chatarea = new JTextArea();
	private JTextField chatbox = new JTextField();

	public Bot() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("ChatBot");
		frame.add(Chatarea);
		frame.add(chatbox);
		// for TextArea
		Chatarea.setSize(500, 400);
		Chatarea.setLocation(2, 2);

		// for TextField
		chatbox.setSize(540, 30);
		chatbox.setLocation(2, 500);

		chatbox.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String gtext = chatbox.getText();
				Chatarea.append("Vous : " + gtext + "\n");
				chatbox.setText("");

				if (gtext.contains("Salut")) {
					bot("Salut ça va ?");
				} else {
					int rand = (int) (Math.random() * 3 + 1);
					if(rand == 1) {
						bot("Je n'ai pas compris ton message");
					}else if(rand == 2) {
						bot("J'ai pas compris ton message mec");
					}else if(rand == 1) {
						bot("Reviens plus tard");
					}
				}
			}

		});

		
	}
	
	private void bot(String string) {
		Chatarea.append("Bot : " + string + "\n");
	}

	public static void main(String args[]) {
		new Bot();
	}
}
