package laboratorios.compiler.output;
import java.io.*;

public class OutPut{
	//FileInputStream input;
	//String list[];
	//int lim;
	String nameout;
	public OutPut(String nameout) throws Exception{
		//input=new FileInputStream(file);
		//list=new String[input.available()];
		//lim=input.available();
		this.nameout = nameout;
	}
	public void toOut() throws Exception{
		//String men="";
		//String str="";
		//int x=0;
		//for(int i=0;i<lim;i++){
		//	list[i]=Integer.toString(input.read());
		//}
		//for(int i=0;i<lim;i++){
		//	x=Integer.parseInt(list[i]);
		//	str=String.valueOf(x);
		//	men=men+str+" ";
		//}
		//System.out.println(men);
		System.out.println(nameout);
	}
}