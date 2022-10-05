public class CarTest{

	public static void main(String[] args){

		// Car car = new Car();
		// car.type = "Caldina";
		// car.model = "2016";

		// car.showInfo();

		Car car = new Car("Caldina","2016");
		car.showInfo();

		Car fit = new Car("Hondafit","2010");
		fit.showInfo();

	}

}