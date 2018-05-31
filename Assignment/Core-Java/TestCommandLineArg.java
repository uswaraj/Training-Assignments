/**
	Author : udakhe.swaraj
	Date : 31-May-2018
	Desc : Command Line Example
	Run as below command : TestCommandLineArg A B C
*/
class TestCommandLineArg{
	public static void main(String[] args){
		System.out.println("Length of args : " + args.length);
		for(String e : args){
			System.out.println(e);
		}
	}
}