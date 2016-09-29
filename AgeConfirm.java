package ageconfirm;

import java.util.*;
public class AgeConfirm {
    int birth_year = 0;
        int age = 0;
	            
		         public AgeConfirm(){}
			 
			 public void BirthInput(){
			 	Scanner Input = new Scanner(System.in);
				System.out.print("태어난 년도를 입력하십시오.  ");
				birth_year = Input.nextInt();
				}
			 public void Confirm(){
			 	age = 2016 - birth_year;
				if(age < 20)
					System.out.print("미성년자입니다. ");
				else
					System.out.print("미성년자가 아닙니다.  ")

					}
			public static void main(String[] args){
				AgeConfirm Age = new AgeConfrim();

				age.BirthInput();
				Age.Confirm();

				}
			}


