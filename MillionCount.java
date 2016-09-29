

import java.util.*;
public class MillionCount{
	int days;
	int seconds;
	int m_count;
	            
		         public MillionCount(){}
			 
			 public void DaysInput(){
			 	Scanner Input = new Scanner(System.in);
				System.out.print("날수를 입력하세요. ");
				days = Input.nextInt();
				}
			 public void SecondCount(){
			 	seconds = days*24*60*60;
				System.out.print("날수에 해당되는 기간은 모두 "+seconds+" 초입니다.");
				}
			 public void MilsecCount(){	
				if(seconds >= 1000000){
					m_count = seconds/1000000;
					System.out.print("100만 초가 모두 "+m_count+" 번이나 포합됩니다.");
					}
				}
			public static void main(String[] args){
				MillionCount count = new MillionCount();

				count.DaysInput();
				count.SecondCount();
				count. MilsecCount();

				}
			}


