

import java.util.*;
public class ScoreCal{
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	            
		         public ScoreCal(){}
			 
			 public void ScoreInput(){
			 	Scanner Input = new Scanner(System.in);
				System.out.print("국어점수를 입력하세요. ");
				kor = Input.nextInt();
				System.out.print("영어점수를 입력하세요. ");
				eng = Input.nextInt();
				System.out.print("수학점수를 입력하세요. ");
				math = Input.nextInt();
				}

			 public void ScoreSum(){
			 	sum = kor+eng+math;
				System.out.println("입력 하신 점수의 총점은 "+sum+"이고,");
				}

			public void ScoreAvg(){	
				avg = sum/3;
				System.out.println("평균은 "+avg+"입니다");
				}

			public void HighScore(){
				if(kor>=95){System.out.println("국어점수가 우수합니다.");}
				if(eng>=95){System.out.println("영어점수가 우수합니다.");}
				if(math>=95){System.out.println("수학점수가 우수합니다.");}
			}
			public static void main(String[] args){
				ScoreCal score = new ScoreCal();

				score.ScoreInput();
				score.ScoreSum();
				score.ScoreAvg();
				score.HighScore();

				}
			}


