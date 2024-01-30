import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main {
	public static void main(String[] args) {
		var f = new JFrame("test");
		f.setSize(600, 400);
		f.setLocation(300, 300);
//		System.out.print(f.getLocation());	// 座標取得

		// ウィンドウ表示
		f.setVisible(true);
		
		// コンポーネント　その他：ボタン、テキストエリア、パネル、ラベルなどがある
		var t = new JTextField();
		f.add("North", t);	// 上：North、右：East、下：South、左：West、真：Center
		
		// 画面更新
		f.validate();
		
		t.setText("Hellow World");
		
//		System.out.print(t.getText());	// テキスト取得
		
		var t2 = new JTextField("second");
		f.add("South", t2);
		f.validate();
		
		t.setText(t2.getText());	// t2のテキスト”second"をtに反映
		
		var b = new JButton("Upper");	// ボタン コンポーネント
		f.add("Center", b);
		f.validate();
		
		// ボタンを押下すると、t2のテキストがt1に反映される
		// ラムダ式と呼ばれる書き方
		// aeは任意（今回はActionEventの頭文字から）
		 b.addActionListener(ae -> t.setText(t2.getText()));
	}
}
