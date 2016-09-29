

import java.util.*;
public class AgeSelect{
    int birth_year = 0;
        int age = 0;
	            
		         public AgeSelect(){}
			 
			 public void BirthInput(){
			 	Scanner Input = new Scanner(System.in);
				System.out.print("태어난 년도를 입력하십시오.  ");
				birth_year = Input.nextInt();
				}
			 public void Confirm(){
			 	age = 2012 - birth_year + 1;
				if(age < 7){System.out.print("유아입니다");}
				if(age >=7 && age < 13){System.out.print("어린이입니다");}
				if(age >=13 && age < 20){System.out.print("청소년입니다");}
				if(age >=20 && age < 30){System.out.print("청년입니다");}
				if(age >=30 && age < 60){System.out.print("중년입니다");}
				if(age >= 60){System.out.print("노인입니다");}

					}
			public static void main(String[] args){
				AgeSelect Age = new AgeSelect();

				Age.BirthInput();
				Age.Confirm();

				}
			}


