

import java.util.*;
public class DegreeTrans{
	Scanner Input = new Scanner(System.in);
	double input_degree;
	String kind;
	double output_degree;
	            
		        public DegreeTrans(){}
			 
			public void DegreeInput(){
			 	System.out.print("온도를 입력하세요.  ");
				input_degree = Input.nextDouble();
				}
			public void Trans(){
			 	System.out.print("입력하신 온도가 섭씨온도이면 C를 화씨 온도이면 F를 입력하세요");
				kind = Input.next().toString();
				}
			public void DegreeOutput(){
				if(kind.equals("F")){
					output_degree = (input_degree-32)/1.8;
					System.out.print("변환된 온도는 "+output_degree+"입니다");
				}
				if(kind.equals("C")){
					output_degree = (input_degree*1.8)+32;
					System.out.print("변환된 온도는 "+output_degree+"입니다");
				}
				

			}

			public static void main(String[] args){
				DegreeTrans degree = new DegreeTrans();

				degree.DegreeInput();
				degree.Trans();
				degree.DegreeOutput();

				}
			}


