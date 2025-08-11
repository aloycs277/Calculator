import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		frame.setSize(385, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);

		JTextField t1 = new JTextField();
		t1.setBounds(40, 40, 290, 50);
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
		JButton minus = new JButton("-");
		JButton mul = new JButton("*");
		JButton div = new JButton("/");
		JButton dot = new JButton(".");
		JButton sign = new JButton("±");
		JButton eql = new JButton("=");
		JButton back = new JButton("⌫");
		JButton clr = new JButton("C");
		JToggleButton a = new JToggleButton("↑");
		JButton sqrt = new JButton("√");
		JButton square = new JButton("x²");
		JButton sin = new JButton("sin");
		JButton cos = new JButton("cos");
		JButton tan = new JButton("tan");
		JButton asin = new JButton("sin⁻¹");
		JButton acos = new JButton("cos⁻¹");
		JButton atan = new JButton("tan⁻¹");

		JButton log = new JButton("log");
		JButton ln = new JButton("ln");

		JButton mod = new JButton("%");
		JButton pow = new JButton("^");
		JButton fact = new JButton("!");

		JButton pi = new JButton("π");
		JButton res = new JButton("x⁻¹");

		b1.setBounds(40, 100, 50, 40);
		b2.setBounds(100, 100, 50, 40);
		b3.setBounds(160, 100, 50, 40);
		add.setBounds(220, 100, 50, 40);
		sign.setBounds(280, 100, 50, 40);
		b4.setBounds(40, 150, 50, 40);
		b5.setBounds(100, 150, 50, 40);
		b6.setBounds(160, 150, 50, 40);
		minus.setBounds(220, 150, 50, 40);
		back.setBounds(280, 150, 50, 40);
		b7.setBounds(40, 200, 50, 40);
		b8.setBounds(100, 200, 50, 40);
		b9.setBounds(160, 200, 50, 40);
		mul.setBounds(220, 200, 50, 40);
		clr.setBounds(280, 200, 50, 40);
		dot.setBounds(40, 250, 50, 40);
		b0.setBounds(100, 250, 50, 40);
		eql.setBounds(160, 250, 50, 40);
		div.setBounds(220, 250, 50, 40);
		a.setBounds(280, 250, 50, 40);

		sqrt.setBounds(20, 300, 64, 40);
		square.setBounds(87, 300, 64, 40);
		log.setBounds(154, 300, 64, 40);
		ln.setBounds(221, 300, 64, 40);
		mod.setBounds(288, 300, 64, 40);
		sin.setBounds(20, 350, 64, 40);
		cos.setBounds(87, 350, 64, 40);
		tan.setBounds(154, 350, 64, 40);
		pow.setBounds(221, 350, 64, 40);
		fact.setBounds(288, 350, 64, 40);
		asin.setBounds(20, 400, 64, 40);
		acos.setBounds(87, 400, 64, 40);
		atan.setBounds(154, 400, 64, 40);
		pi.setBounds(221, 400, 64, 40);
		res.setBounds(288, 400, 64, 40);

		sqrt.setVisible(false);
		square.setVisible(false);
		sin.setVisible(false);
		cos.setVisible(false);
		tan.setVisible(false);
		log.setVisible(false);
		ln.setVisible(false);
		mod.setVisible(false);
		pow.setVisible(false);
		asin.setVisible(false);
		acos.setVisible(false);
		atan.setVisible(false);
		pi.setVisible(false);
		res.setVisible(false);
		fact.setVisible(false);

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
		frame.add(sign);
		frame.add(eql);
		frame.add(a);
		frame.add(sqrt);
		frame.add(square);
		frame.add(log);
		frame.add(ln);
		frame.add(mod);
		frame.add(sin);
		frame.add(cos);
		frame.add(tan);
		frame.add(pow);
		frame.add(asin);
		frame.add(acos);
		frame.add(atan);
		frame.add(pi);
		frame.add(res);
		frame.add(fact);

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

		add.setBackground(new Color(0, 120, 230));
		add.setForeground(Color.WHITE);
		minus.setBackground(new Color(0, 120, 230));
		minus.setForeground(Color.WHITE);
		div.setBackground(new Color(0, 120, 230));
		div.setForeground(Color.WHITE);
		mul.setBackground(new Color(0, 120, 230));
		mul.setForeground(Color.WHITE);
		dot.setBackground(new Color(0, 120, 230));
		dot.setForeground(Color.WHITE);
		sign.setBackground(new Color(0, 120, 230));
		sign.setForeground(Color.WHITE);
		eql.setBackground(new Color(0, 120, 230));
		eql.setForeground(Color.WHITE);
		back.setBackground(new Color(230, 0, 50));
		back.setForeground(Color.WHITE);
		clr.setBackground(new Color(230, 0, 50));
		clr.setForeground(Color.WHITE);
		a.setBackground(new Color(176, 224, 230));

		a.addActionListener(e -> {
			boolean visible = sqrt.isVisible();
			sqrt.setVisible(!visible);
			square.setVisible(!visible);
			sin.setVisible(!visible);
			cos.setVisible(!visible);
			tan.setVisible(!visible);
			log.setVisible(!visible);
			ln.setVisible(!visible);
			mod.setVisible(!visible);
			pow.setVisible(!visible);
			asin.setVisible(!visible);
			acos.setVisible(!visible);
			atan.setVisible(!visible);
			pi.setVisible(!visible);
			res.setVisible(!visible);
			fact.setVisible(!visible);
			a.setText(visible ? "↑" : "↓");
			if (!visible) {
				frame.setSize(385, 500);
			} else {

				frame.setSize(385, 350);
			}

		});

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
				try {
					result = num1[0] / num2;
					if (Double.isInfinite(result) || Double.isNaN(result)) {
						t1.setText("Error");
						return;
					}
				} catch (Exception ex) {
					t1.setText("Error");
					return;
				}
				break;
			case "%":
				result = num1[0] % num2;
				break;
			case "^":
				result = Math.pow(num1[0], num2);
				break;
			}

			if (result == Math.floor(result)) {
				t1.setText(String.valueOf((long) result));
			} else {
				t1.setText(String.valueOf(result));
			}
		});

		clr.addActionListener(e -> t1.setText(""));

		back.addActionListener(e -> {
			String text = t1.getText();
			if (!text.isEmpty()) {
				t1.setText(text.substring(0, text.length() - 1));
			}
		});

		sign.addActionListener(e -> {
			try {
				double value = Double.parseDouble(t1.getText());
				if (value == Math.floor(value)) {
					t1.setText(String.valueOf((long) (-value)));
				} else {
					t1.setText(String.valueOf(-value));
				}
			} catch (Exception ex) {
			}
		});

		sqrt.addActionListener(e -> {
			try {
				double result = (Math.sqrt(Double.parseDouble(t1.getText())));
				if (result == Math.floor(result)) {
					t1.setText(String.valueOf((long) result));
				} else {
					t1.setText(String.valueOf(Math.sqrt(result)));
				}

			} catch (Exception ex) {
				t1.setText("Error");
			}
		});

		square.addActionListener(e -> {
			try {
				double result = Double.parseDouble(t1.getText()) * Double.parseDouble(t1.getText());
				if (result == Math.floor(result)) {
					t1.setText(String.valueOf((long) (result)));
				} else {
					t1.setText(String.valueOf(result));
				}
			} catch (Exception ex) {
				t1.setText("Error");
			}
		});

		log.addActionListener(e -> {
			try {
				t1.setText(String.valueOf(Math.log10(Double.parseDouble(t1.getText()))));
			} catch (Exception ex) {
				t1.setText("Error");
			}
		});
		ln.addActionListener(e -> {
			try {
				t1.setText(String.valueOf(Math.log(Double.parseDouble(t1.getText()))));
			} catch (Exception ex) {
				t1.setText("Error");
			}
		});

		mod.addActionListener(e -> {
			num1[0] = Double.parseDouble(t1.getText());
			op[0] = "%";
			t1.setText("");
		});
		pow.addActionListener(e -> {
			num1[0] = Double.parseDouble(t1.getText());
			op[0] = "^";
			t1.setText("");
		});
		fact.addActionListener(e -> {
			try {
				int n = Integer.parseInt(t1.getText());
				if (n < 0) {
					t1.setText("Error");
					return;
				}
				long factValue = 1;
				for (long  i = 1; i <= n; i++) {
					factValue *= i;
				}
				t1.setText(String.valueOf(factValue));
			} catch (Exception ex) {
				t1.setText("Error");
			}
		});

		sin.addActionListener(e -> {
			try {
				double value = Math.toRadians(Double.parseDouble(t1.getText()));
				t1.setText(String.valueOf(Math.sin(value)));
			} catch (Exception ex) {
				t1.setText("Error");
			}
		});
		cos.addActionListener(e -> {
			try {
				double value = Math.toRadians(Double.parseDouble(t1.getText()));
				t1.setText(String.valueOf(Math.cos(value)));
			} catch (Exception ex) {
				t1.setText("Error");
			}
		});
		tan.addActionListener(e -> {
			try {
				double value = Math.toRadians(Double.parseDouble(t1.getText()));
				t1.setText(String.valueOf(Math.tan(value)));
			} catch (Exception ex) {
				t1.setText("Error");
			}
		});

		asin.addActionListener(e -> {
			try {
				double value = Double.parseDouble(t1.getText());
				t1.setText(String.valueOf(Math.toDegrees(Math.asin(value))));
			} catch (Exception ex) {
				t1.setText("Error");
			}
		});
		acos.addActionListener(e -> {
			try {
				double value = Double.parseDouble(t1.getText());
				t1.setText(String.valueOf(Math.toDegrees(Math.acos(value))));
			} catch (Exception ex) {
				t1.setText("Error");
			}
		});
		atan.addActionListener(e -> {
			try {
				double value = Double.parseDouble(t1.getText());
				t1.setText(String.valueOf(Math.toDegrees(Math.atan(value))));
			} catch (Exception ex) {
				t1.setText("Error");
			}
		});

		pi.addActionListener(e -> {
			t1.setText(String.valueOf(Math.PI));
		});

		res.addActionListener(e -> {
			try {
				double value = Double.parseDouble(t1.getText());
				if (value == 0) {
					t1.setText("Error");
				} else {
					t1.setText(String.valueOf(1 / value));
				}
			} catch (Exception ex) {
				t1.setText("Error");
			}
		});

		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setVisible(true);

	}

}
