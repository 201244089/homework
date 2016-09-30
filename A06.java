import java.util.*;
	public class A06{
		
		String name;
		int kor;
		int math;
		int eng;
		double avg;
		String avg2 = String.format("%.2f", avg);
		String grade;
		
		A06(){}

		public void Input(){
			Scanner input = new Scanner(System.in);
			
			System.out.print("이름 : ");
			name = input.next();
			
			System.out.print("국어점수 입력 : ");
			kor = input.nextInt();
			
			System.out.print("수학점수 입력 : ");
			math = input.nextInt();

			System.out.print("영어점수 입력 : ");
			eng = input.nextInt();

			System.out.println("==================");
		}

		public void Avgcal(){
			avg = (kor+math+eng)/3;
		}

		public void GradeSelect(){
			if(avg >=95 && avg <100){grade = "A+";}
			if(avg >=90 && avg <95){grade = "A";}
			if(avg >=85 && avg <90){grade = "B+";}
			if(avg >=80 && avg <85){grade = "B";}
			if(avg >=75 && avg <80){grade = "C+";}
			if(avg >=70 && avg <75){grade = "C";}
			if(avg >=65 && avg <70){grade = "D+";}
			if(avg >=60 && avg <65){grade = "D";}
			if(avg >=0 && avg <60){grade = "F";}
		}

		public void Output(){
			System.out.println("["+name+"]님은");
			System.out.println("평균은 "+ avg2 + "이고");
			System.out.print("학점은 "+grade+"입니다");
		}

		public static void main(String[] args){
			A06 a = new A06();
			a.Input();
			a.Avgcal();
			a.GradeSelect();
			a.Output();
		}


}

