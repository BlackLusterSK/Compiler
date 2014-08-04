package laboratorios.compiler.lib;
import java.io.*;

public class Debug{
	//FileInputStream input;
	//String list[];
	//int lim;
	String namedeb;
	public Debug(String namedeb) throws Exception{
		//input=new FileInputStream(file);
		//list=new String[input.available()];
		//lim=input.available();
		this.namedeb = namedeb;
	}
	public void toDeb() throws Exception{
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
		if(namedeb=="scan"){
			System.out.println("Debugging scan");
		}
		if(namedeb=="parse"){
			System.out.println("Debugging parse");
		}
		if(namedeb=="ast"){
			System.out.println("Debugging ast");
		}
		if(namedeb=="semantic"){
			System.out.println("Debugging semantic");
		}
		if(namedeb=="irt"){
			System.out.println("Debugging irt");
		}
		if(namedeb=="codegen"){
			System.out.println("Debugging codegen");
		}
		if(namedeb=="scan:parse"){
			System.out.println("Debugging scan");
			System.out.println("Debugging parse");
		}
		if(namedeb=="scan:parse:ast"){
			System.out.println("Debugging scan");
			System.out.println("Debugging parse");
			System.out.println("Debugging ast");
		}
		if(namedeb=="scan:parse:ast:semantic"){
			System.out.println("Debugging scan");
			System.out.println("Debugging parse");
			System.out.println("Debugging ast");
			System.out.println("Debugging semantic");
		}
		if(namedeb=="scan:parse:ast:semantic:irt"){
			System.out.println("Debugging scan");
			System.out.println("Debugging parse");
			System.out.println("Debugging ast");
			System.out.println("Debugging semantic");
			System.out.println("Debugging irt");
		}
		if(namedeb=="scan:parse:ast:semantic:irt:codegen"){
			System.out.println("Debugging scan");
			System.out.println("Debugging parse");
			System.out.println("Debugging ast");
			System.out.println("Debugging semantic");
			System.out.println("Debugging irt");
			System.out.println("Debugging codegen");
		}
	}
}