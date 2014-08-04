package laboratorios.compiler.cc4parser;
import java.io.*;

public class CC4Parser{
	//FileInputStream input;
	//String list[];
	//int lim;
	String nameparse;
	public CC4Parser(String nameparse) throws Exception{
		//input=new FileInputStream(file);
		//list=new String[input.available()];
		//lim=input.available();
		this.nameparse = nameparse;
	}
	public void toParse() throws Exception{
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
		System.out.println("stage: parsing");
	}
}