import java.io.*;
import laboratorios.compiler.output.*;
import laboratorios.compiler.scanner.*;
import laboratorios.compiler.cc4parser.*;
import laboratorios.compiler.ast.*;
import laboratorios.compiler.semantic.*;
import laboratorios.compiler.irt.*;
import laboratorios.compiler.codegen.*;
import laboratorios.compiler.opt.*;
import laboratorios.compiler.lib.*;

public class Compiler{
	public static void main(String[] args) throws Exception{
		try{
			switch(args[0]){
				case "-o":{
					OutPut out = new OutPut(args[1]);
					out.toOut();
				}break;
				case "-target":{
					switch(args[1]){
						case "scan":
							Scanner scan = new Scanner(args[1]);
							scan.toScan();
						break;
						case "parse":
							Scanner scanp = new Scanner(args[1]);
							scanp.toScan();
							CC4Parser parser = new CC4Parser(args[1]);
							parser.toParse();
						break;
						case "ast":
							Scanner scana = new Scanner(args[1]);
							scana.toScan();
							CC4Parser parsera = new CC4Parser(args[1]);
							parsera.toParse();
							Ast ast = new Ast(args[1]);
							ast.toAst();
						break;
						case "semantic":
							Scanner scans = new Scanner(args[1]);
							scans.toScan();
							CC4Parser parsers = new CC4Parser(args[1]);
							parsers.toParse();
							Ast asts = new Ast(args[1]);
							asts.toAst();
							Semantic semantic = new Semantic(args[1]);
							semantic.toSem();
						break;
						case "irt":
							Scanner scani = new Scanner(args[1]);
							scani.toScan();
							CC4Parser parseri = new CC4Parser(args[1]);
							parseri.toParse();
							Ast asti = new Ast(args[1]);
							asti.toAst();
							Semantic semantici = new Semantic(args[1]);
							semantici.toSem();
							Irt irt = new Irt(args[1]);
							irt.toIrt();
						break;
						case "codegen":
							Scanner scanc = new Scanner(args[1]);
							scanc.toScan();
							CC4Parser parserc = new CC4Parser(args[1]);
							parserc.toParse();
							Ast astc = new Ast(args[1]);
							astc.toAst();
							Semantic semanticc = new Semantic(args[1]);
							semanticc.toSem();
							Irt irtc = new Irt(args[1]);
							irtc.toIrt();
							Codegen codegen = new Codegen(args[1]);
							codegen.toCode();
						break;
						default:
							System.out.println("Error, please enter a correct value");
						break;
					}
				}break;
				case "-opt":{
					switch(args[1]){
						case "constant":
							ConstantFolding cts = new ConstantFolding(args[1]);
							cts.toCts();
						break;
						case "algebraic":
							Algebraic Alg = new Algebraic(args[1]);
							Alg.toAlg();	
							break;
						default:
							System.out.println("Error, please enter a correct value");
						break;
					}
				}break;
				case "-debug":{
					switch(args[1]){
						case "scan":
							Debug debugscan = new Debug("scan");
							debugscan.toDeb();
						break;
						case "parse":
							Debug debugscanpr = new Debug("scan");
							debugscanpr.toDeb();
							Debug debugparserpr = new Debug("parse");
							debugparserpr.toDeb();
						break;
						case "ast":
							Debug debugscanast = new Debug("scan");
							debugscanast.toDeb();
							Debug debugparserast = new Debug("parse");
							debugparserast.toDeb();
							Debug debugastast = new Debug("ast");
							debugastast.toDeb();
						break;
						case "semantic":
							Debug debugscansem = new Debug("scan");
							debugscansem.toDeb();
							Debug debugparsersem = new Debug("parse");
							debugparsersem.toDeb();
							Debug debugastsem = new Debug("ast");
							debugastsem.toDeb();
							Debug debugsemanticsem = new Debug("semantic");
							debugsemanticsem.toDeb();
						break;
						case "irt":
							Debug debugscanirt = new Debug("scan");
							debugscanirt.toDeb();
							Debug debugparserirt = new Debug("parse");
							debugparserirt.toDeb();
							Debug debugastirt = new Debug("ast");
							debugastirt.toDeb();
							Debug debugsemanticirt = new Debug("semantic");
							debugsemanticirt.toDeb();
							Debug debugirtirt = new Debug("irt");
							debugirtirt.toDeb();
						break;
						case "codegen":
							Debug debugscancd = new Debug("scan");
							debugscancd.toDeb();
							Debug debugparsercd = new Debug("parse");
							debugparsercd.toDeb();
							Debug debugastcd = new Debug("ast");
							debugastcd.toDeb();
							Debug debugsemanticcd = new Debug("semantic");
							debugsemanticcd.toDeb();
							Debug debugirtcd = new Debug("irt");
							debugirtcd.toDeb();
							Debug debugcodegencd = new Debug("codegen");
							debugcodegencd.toDeb();
						break;
						case "scan:parse":
							Debug scp = new Debug("scan:parse");
							scp.toDeb();
						break;
						case "scan:parse:ast":
							Debug scpas = new Debug("scan:parse:ast");
							scpas.toDeb();
						break;
						case "scan:parse:ast:semantic":
							Debug scpasem = new Debug("scan:parse:ast:semantic");
							scpasem.toDeb();
						break;
						case "scan:parse:ast:semantic:irt":
							Debug scpasemir = new Debug("scan:parse:ast:semantic:irt");
							scpasemir.toDeb();
						break;
						case "scan:parse:ast:semantic:irt:codegen":
							Debug scpasemirco = new Debug("scan:parse:ast:semantic:irt:codegen");
							scpasemirco.toDeb();
						break;
						default:
							System.out.println("Error, please enter a correct value");
						break;
					}
				}break;
				case "exit":{
					System.out.println("Thanks for testing the compiler.");
				}break;
				case "-h":{
					System.out.println("\n-o <outname> escribe el output a un archivo de texto llamado <outname>.");
					System.out.println("-target <stage>	donde <stage> es uno de: scan, parse, ast, semantic, irt,\ncodegen; la compilación debe proceder hasta la etapa indicada.");
					System.out.println("-opt <optimzation> donde <optimization> es uno de: constant, algebraic");
					System.out.println("-debug <stage> Imprime información de debugging. Ejeplo: scan:parse:etc.");
				}break;
				default:
					System.out.println("Error, please enter a correct value");
					System.out.println("type -h for help");
				break;
			}
		}	
        catch(ArrayIndexOutOfBoundsException e){
			System.out.println("\n-o <outname> escribe el output a un archivo de texto llamado <outname>.");
			System.out.println("-target <stage>	donde <stage> es uno de: scan, parse, ast, semantic, irt,\ncodegen; la compilación debe proceder hasta la etapa indicada.");
			System.out.println("-opt <optimzation> donde <optimization> es uno de: constant, algebraic");
			System.out.println("-debug <stage> Imprime información de debugging. Ejeplo: scan:parse:etc.");
		}
	}
}	