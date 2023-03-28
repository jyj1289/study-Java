package interaction;

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
}

class Car {
	String model;
	int speed;
	Person driver;
	
	Car(String model){
		this.model = model;
	}
	
	void showCar() {
		String result = "%s (%d km/h, %s)\n\n";
		String name = (driver == null) ? "없음" : driver.name;
		
		System.out.printf(result, model, speed, name);
	}
	
	void accel(int speed) {
		if (driver == null) {
			System.out.println("운전자가 없습니다!!!");
			showCar();
			
			return;
		}
		
		this.speed += speed;
		
		System.out.println(speed + "km/h 가속!!!");
		
		showCar();
	}
	
	void rideOn(Person driver) {
		this.driver = driver;
		
		System.out.println(driver.name + "님이 탑승");
		
		showCar();
	}
	
	void _break(int speed) {
		if (driver == null) {
			System.out.println("운전자가 없습니다!!!");
			showCar();
			
			return;
		}
		
		this.speed -= speed;
		
		System.out.println(speed + "km/h 감속!!!");
		
		showCar();
	}
	
	void rideOff() {
		if (speed != 0) {
			System.out.println("정차 후 하차해 주세요!!!");
			
			showCar();
			return;
		}
		
		System.out.println(driver.name + "님이 하차");
		
		driver = null;
		
		showCar();
	}
	
	
}

public class Quiz {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 한다
		Person per = new Person("홍길동");		// 필드는 이름
		Car car = new Car("모닝");			// 필드는 모델명
		
		car.showCar(); 		// 모닝 (0 km/h, 없음)
			
		car.accel(30);		// 자동차가 가속하는 메서드
							// 단, 운전자가 없으면 동작하지 않는다
		
		car.rideOn(per);	// 자동차에 사람이 탑승하는 메서드
		
		car.accel(30);		// 30 km/h 가속
		
		car._break(30);		// 20 km/h 감속
		
		car.rideOff();		// 사람이 하차하는 메서드
							// 단, 속도가 0아니면 하차 불가능
	}
}
