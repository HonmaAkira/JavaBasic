package practice10;

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] car = new Car[3];

		Car car1= new Car();
		car1.color = "Red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.color = "Blue";
		car2.gasoline =60;

		Car car3 = new Car();
		car3.color = "Green";
		car3.gasoline = 30;

		car[0] = car1;
		car[1] = car2;
		car[2] = car3;

		final int distance = 300;


		for(int i = 0;i<car.length;i++) {

			int sum = 0;
			int count = 0;
			while(true) {
				int in = car[i].run();
				if(car[i].gasoline == 0) {
					System.out.println("目的地に到達できませんでした");
					break;
				}

				sum += in;
				System.out.println(sum);
				count++;
				 if(sum>=distance) {
					System.out.println("目的地にまで"+count+"時間かかりました。残りのガソリンは、"+(car[i].gasoline)+"リットルです");
					break;
				}
			}
		}
	}
}
