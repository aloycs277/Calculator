import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		frame.setSize(305, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);

		JTextField t1 = new JTextField();
		t1.setBounds(30, 40, 230, 50);
		t1.setEditable(false);
		frame.add(t1);

		final double[] num1 = new double[1];
		final String[] op = new String[1];

		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");
		JButton add = new JButton("+");
		JButton minus = new JButton("–");
		JButton mul = new JButton("×");
		JButton div = new JButton("÷");
		JButton dot = new JButton(".");
		JButton eql = new JButton("=");
		JButton back = new JButton("⌫");
		JButton clr = new JButton("C");

		b1.setBounds(30, 100, 50, 40);
		b2.setBounds(90, 100, 50, 40);
		b3.setBounds(150, 100, 50, 40);
		add.setBounds(210, 100, 50, 40);
		b4.setBounds(30, 150, 50, 40);
		b5.setBounds(90, 150, 50, 40);
		b6.setBounds(150, 150, 50, 40);
		minus.setBounds(210, 150, 50, 40);
		b7.setBounds(30, 200, 50, 40);
		b8.setBounds(90, 200, 50, 40);
		b9.setBounds(150, 200, 50, 40);
		mul.setBounds(210, 200, 50, 40);
		dot.setBounds(30, 250, 50, 40);
		b0.setBounds(90, 250, 50, 40);
		back.setBounds(150, 250, 50, 40);
		div.setBounds(210, 250, 50, 40);
		clr.setBounds(150, 300, 50, 40);
		eql.setBounds(90, 300, 50, 40);

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(add);
		frame.add(b4);
		frame.add(b6);
		frame.add(b5);
		frame.add(minus);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(mul);
		frame.add(b0);
		frame.add(dot);
		frame.add(back);
		frame.add(clr);
		frame.add(div);
		frame.add(eql);

		b1.setBackground(Color.WHITE);
		b2.setBackground(Color.WHITE);
		b3.setBackground(Color.WHITE);
		b4.setBackground(Color.WHITE);
		b5.setBackground(Color.WHITE);
		b6.setBackground(Color.WHITE);
		b7.setBackground(Color.WHITE);
		b8.setBackground(Color.WHITE);
		b9.setBackground(Color.WHITE);
		b0.setBackground(Color.WHITE);
		add.setBackground(new Color(0, 80, 230));
		add.setForeground(Color.WHITE);
		minus.setBackground(new Color(0, 80, 230));
		minus.setForeground(Color.WHITE);
		div.setBackground(new Color(0, 80, 230));
		div.setForeground(Color.WHITE);
		mul.setBackground(new Color(0, 80, 230));
		mul.setForeground(Color.WHITE);
		dot.setBackground(new Color(0, 80, 230));
		dot.setForeground(Color.WHITE);
		eql.setBackground(new Color(0, 80, 230));
		eql.setForeground(Color.WHITE);
		back.setBackground(new Color(255, 70, 50));
		back.setForeground(Color.WHITE);
		clr.setBackground(new Color(255, 70, 50));
		clr.setForeground(Color.WHITE);

		ActionListener numAction = e -> {
			JButton btn = (JButton) e.getSource();
			t1.setText(t1.getText() + btn.getText());
		};

		b0.addActionListener(numAction);
		b1.addActionListener(numAction);
		b2.addActionListener(numAction);
		b3.addActionListener(numAction);
		b4.addActionListener(numAction);
		b5.addActionListener(numAction);
		b6.addActionListener(numAction);
		b7.addActionListener(numAction);
		b8.addActionListener(numAction);
		b9.addActionListener(numAction);
		dot.addActionListener(numAction);

		add.addActionListener(e -> {
			num1[0] = Double.parseDouble(t1.getText());
			op[0] = "+";
			t1.setText("");
		});

		minus.addActionListener(e -> {
			num1[0] = Double.parseDouble(t1.getText());
			op[0] = "-";
			t1.setText("");
		});

		mul.addActionListener(e -> {
			num1[0] = Double.parseDouble(t1.getText());
			op[0] = "*";
			t1.setText("");
		});

		div.addActionListener(e -> {
			num1[0] = Double.parseDouble(t1.getText());
			op[0] = "/";
			t1.setText("");
		});

		eql.addActionListener(e -> {
			double num2 = Double.parseDouble(t1.getText());
			double result = 0;

			switch (op[0]) {
			case "+":
				result = num1[0] + num2;
				break;
			case "-":
				result = num1[0] - num2;
				break;
			case "*":
				result = num1[0] * num2;
				break;
			case "/":
				if (num2 == 0) {
					t1.setText("Error");
					return;
				} else {
					result = num1[0] / num2;
				}
				break;
			}

			if (result == Math.floor(result)) {
				t1.setText(String.valueOf((long) result));
			} else {
				t1.setText(String.valueOf(result));
			}
		});
		back.addActionListener(e -> {
			String text = t1.getText();
			if (!text.isEmpty()) {
				t1.setText(text.substring(0, text.length() - 1));
			}
		});

		clr.addActionListener(e -> t1.setText(""));
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(135, 206, 235));
	}

}
