

import java.util.ArrayList;
import java.util.Scanner;


class crazyRobot{
	
	public static final Scanner SCANNER=new Scanner(System.in);
	
	
	public crazyRobot(ArrayList<robotData> robotDataArrayList) {
		startRobot(robotDataArrayList);
	}

	public static void main(String[]args) {
		ArrayList<robotData>robotDataArrayList=new ArrayList<robotData>();
		robotDataArrayList.add(new robotData("What is your Name","I am Groot"));
		crazyRobot crazyRobotObj=new crazyRobot(robotDataArrayList); 
		
	}

	private  void startRobot(ArrayList<robotData> robotDataArrayList) {
		String Question;
		String Answer;
		//robotData Robotdata;
//		System.out.println("what is your Question");
//		Question=SCANNER.nextLine();
		try{
		for(robotData RobotDataLoop : robotDataArrayList) {
			System.out.println("what is your Question");
			Question=SCANNER.nextLine();
			if(QuestionData(Question,robotDataArrayList)) {
				robotAnswerData(Question,robotDataArrayList);
			}else {
				System.out.println("What should i answer for this Question?");
				Answer=SCANNER.nextLine();
				robotDataArrayList.add(new robotData(Question,Answer));
				System.out.println("thank");
		}
	}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	private boolean QuestionData(String Question,ArrayList<robotData> robotDataArrayList) {
		boolean flag=false;
		for(int i=0;i<robotDataArrayList.size();i++) {
		if(Question.equals(robotDataArrayList.get(i).Question)) {
			flag =true;
		}	
	}
		return flag;
	}
	private void robotAnswerData(String Question,ArrayList<robotData> robotDataArrayList) {
		String Answer=null;
		for(int i=0;i<robotDataArrayList.size();i++) {
			if(Question.equals(robotDataArrayList.get(i).Question)) {
				Answer=robotDataArrayList.get(i).Answer;
			}
		}System.out.println(Answer);
	}
		
	}

class robotData{
	String Question;
	String Answer;
	robotData(String Question,String Answer){
		this.Question=Question;
		this.Answer=Answer;
	}
}
