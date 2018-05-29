/**
	Author : udakhe.swaraj
	Date : 28-May-2018
	Desc : Loop demo- for and if condition 
*/

class ForDemo{
	public static void main(String[] args){
		
		int sum =  0;
		for(int i=1; i<=10; i++){
				
			if(i%2==0){
				System.out.println(i);
				sum = sum + i;
			}
			
			
		}
		
		System.out.println("Value of Sum : " + sum);
	}
}