package interaction;


class Ball {
	String type;
	
	Ball(String type){
		this.type = type;
	}
}

class Child {
	String name;		// 참조 타입의 기본 값은 null
	Ball ball;			// null은 데이터가 없음을 의미한다
	
	Child(String name){
		this.name = name;
	}
	
	void show() {
		String result = "%s (공 : %s)\n";
		String type = (ball == null) ? "없음" : ball.type;
		
		System.out.printf(result, name, type);
	}
	
	void takeBall(Ball ball) {
		this.ball = ball;
		
		String result = "\n%s(이)가 %s을 얻었다\n";
		
		System.out.printf(result, name, ball.type);
	}
	
	void throwBall(Child tar) {
		tar.ball = ball;
		
		String result = "\n%s(이)가 %s에게 %s(을)를 던졌다\n";
		System.out.printf(result, name, tar.name, ball.type);
		
		ball = null;
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Child minsu = new Child("민수");
		Child jinho = new Child("진호");
		
		minsu.show();
		jinho.show();
		
		Ball base = new Ball("야구공");
		
		minsu.takeBall(base);
		
		minsu.show();
		jinho.show();
		
		minsu.throwBall(jinho);
		
		minsu.show();
		jinho.show();
	}
}
