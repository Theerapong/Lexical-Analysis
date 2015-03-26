import java.io.BufferedWriter;
import java.io.FileWriter;

public class LexicalAnalysis {

	private String stringOneLine = null;
	private char arrayOneLine[];
	private char nextCh;
	private StringBuffer sb = new StringBuffer();

	public void setSourceCodeInOneLine(String s) {
		stringOneLine = s;		
	}

	public void stringToCharArray() {
		arrayOneLine=stringOneLine.toCharArray();
	}

	public void checkEachChar() {
		
		for(int i=0 ; i< arrayOneLine.length ;i++){
			
			switch(arrayOneLine[i]){
			
			case ' ':
					break;

			case '(':
					System.out.println("LPAREN");
					sb.append("LPAREN" + System.getProperty("line.separator") );
					break;

			case ')':
					System.out.println("RPAREN");
					sb.append("RPAREN" + System.getProperty("line.separator") );
					break;




			case '>':
					if(arrayOneLine[i+1]=='='){
						System.out.println("GEQ");
						sb.append("GEQ" + System.getProperty("line.separator") );
						i++;
					}
					else{
						System.out.println(">");
						sb.append("G" + System.getProperty("line.separator") );
					}
					break;

			case '=':
					if(arrayOneLine[i+1]=='='){
						System.out.println("EQ");
						sb.append("EQ" + System.getProperty("line.separator") );
						i++;
					}
					else{
						System.out.println("BECOMES");
						sb.append("BECOMES" + System.getProperty("line.separator"));
					}
					break;

			case ';':
					System.out.println("SCOLON");
					sb.append("SCOLON" + System.getProperty("line.separator") );
					break;

			case '0': case '1': case '2': case '3': case '4':	
			case '5': case '6': case '7': case '8': case '9':
						
					System.out.print("INT(");
					sb.append("INT(");
				
					nextCh=arrayOneLine[i+1];
						
					if(nextCh=='0'||nextCh=='1'||nextCh=='2'||nextCh=='3'||nextCh=='4'||
					   nextCh=='5'||nextCh=='6'||nextCh=='7'||nextCh=='8'||nextCh=='9'){
							
							System.out.print(Character.toString(arrayOneLine[i]));
							sb.append(Character.toString(arrayOneLine[i]));


							i++;
							
							while(nextCh=='0'||nextCh=='1'||nextCh=='2'||nextCh=='3'||nextCh=='4'||
							      nextCh=='5'||nextCh=='6'||nextCh=='7'||nextCh=='8'||nextCh=='9'){
								System.out.print(Character.toString(nextCh)); 
								sb.append(Character.toString(nextCh));
								
								nextCh=arrayOneLine[i+1];
								if(nextCh=='0'||nextCh=='1'||nextCh=='2'||nextCh=='3'||nextCh=='4'||
								   nextCh=='5'||nextCh=='6'||nextCh=='7'||nextCh=='8'||nextCh=='9'){
									System.out.print(Character.toString(nextCh)); 
									sb.append(Character.toString(nextCh));
									i++;
									nextCh=arrayOneLine[i+1];
									i++;
								}
								else{
									break;
								}
							}//end while
						}//end if
						else{
							System.out.print(Character.toString(arrayOneLine[i]));
							sb.append(Character.toString(arrayOneLine[i]));
						}
						System.out.println(")");
						sb.append(")" + System.getProperty("line.separator") );
						break;
						
						
			case 'a':  case 'b':	case 'c':  case 'd':	case 'e': case 'f':
			case 'g':  case 'h':	case 'i':  case 'j':	case 'k': case 'l':
			case 'm':  case 'n':	case 'o':  case 'p':	case 'q': case 'r':
			case 's':  case 't':    case 'u':  case 'v':	case 'w': case 'x':
			case 'y':  case 'z':
			case 'A':  case 'B':	case 'C':  case 'D':	case 'E': case 'F':
			case 'G':  case 'H':	case 'I':  case 'J':    case 'K': case 'L':
			case 'M':  case 'N':	case 'O':  case 'P':	case 'Q': case 'R':
			case 'S':  case 'T':	case 'U':  case 'V':    case 'W': case 'X':
			case 'Y':  case 'Z':			



					if(arrayOneLine[i]=='i'&&arrayOneLine[i+1]=='f'){
						System.out.println("IF");
						sb.append("IF"+ System.getProperty("line.separator") );
						i++;
						break;
					}
					
					System.out.print("ID(");
					sb.append("ID(");
					
					nextCh=arrayOneLine[i+1];
					
					if(nextCh=='a'||nextCh=='b'||nextCh=='c'||nextCh=='d'||nextCh=='e'||
					   nextCh=='f'||nextCh=='g'||nextCh=='h'||nextCh=='i'||nextCh=='j'||
					   nextCh=='k'||nextCh=='l'||nextCh=='m'||nextCh=='n'||nextCh=='o'||
					   nextCh=='p'||nextCh=='q'||nextCh=='r'||nextCh=='s'||nextCh=='t'||
					   nextCh=='u'||nextCh=='v'||nextCh=='w'||nextCh=='x'||nextCh=='y'||
					   nextCh=='z'||
					   nextCh=='A'||nextCh=='B'||nextCh=='C'||nextCh=='D'||nextCh=='E'||
					   nextCh=='F'||nextCh=='G'||nextCh=='H'||nextCh=='I'||nextCh=='J'||
					   nextCh=='K'||nextCh=='L'||nextCh=='M'||nextCh=='N'||nextCh=='O'||
					   nextCh=='P'||nextCh=='Q'||nextCh=='R'||nextCh=='S'||nextCh=='T'||
					   nextCh=='U'||nextCh=='V'||nextCh=='W'||nextCh=='X'||nextCh=='Y'||
					   nextCh=='Z'||
					   nextCh=='0'||nextCh=='1'||nextCh=='2'||nextCh=='3'||nextCh=='4'||
					   nextCh=='5'||nextCh=='6'||nextCh=='7'||nextCh=='8'||nextCh=='9'||
					   nextCh=='_'){
						
						System.out.print(Character.toString(arrayOneLine[i])); 
						sb.append(Character.toString(arrayOneLine[i]));
						i++;
						
						while(nextCh=='a'||nextCh=='b'||nextCh=='c'||nextCh=='d'||nextCh=='e'||
						      nextCh=='f'||nextCh=='g'||nextCh=='h'||nextCh=='i'||nextCh=='j'||
							nextCh=='k'||nextCh=='l'||nextCh=='m'||nextCh=='n'||nextCh=='o'||
							nextCh=='p'||nextCh=='q'||nextCh=='r'||nextCh=='s'||nextCh=='t'||
							nextCh=='u'||nextCh=='v'||nextCh=='w'||nextCh=='x'||nextCh=='y'||
							nextCh=='z'||
							nextCh=='A'||nextCh=='B'||nextCh=='C'||nextCh=='D'||nextCh=='E'||
							nextCh=='F'||nextCh=='G'||nextCh=='H'||nextCh=='I'||nextCh=='J'||
							nextCh=='K'||nextCh=='L'||nextCh=='M'||nextCh=='N'||nextCh=='O'||
							nextCh=='P'||nextCh=='Q'||nextCh=='R'||nextCh=='S'||nextCh=='T'||
							nextCh=='U'||nextCh=='V'||nextCh=='W'||nextCh=='X'||nextCh=='Y'||
							nextCh=='Z'||
							nextCh=='0'||nextCh=='1'||nextCh=='2'||nextCh=='3'||nextCh=='4'||
							nextCh=='5'||nextCh=='6'||nextCh=='7'||nextCh=='8'||nextCh=='9'||
							nextCh=='_'){
							
							System.out.print(Character.toString(nextCh)); 
							sb.append(Character.toString(nextCh));
							
							nextCh=arrayOneLine[i+1];

							if(nextCh=='a'||nextCh=='b'||nextCh=='c'||nextCh=='d'||nextCh=='e'||
							   nextCh=='f'||nextCh=='g'||nextCh=='h'||nextCh=='i'||nextCh=='j'||
							   nextCh=='k'||nextCh=='l'||nextCh=='m'||nextCh=='n'||nextCh=='o'||
							   nextCh=='p'||nextCh=='q'||nextCh=='r'||nextCh=='s'||nextCh=='t'||
							   nextCh=='u'||nextCh=='v'||nextCh=='w'||nextCh=='x'||nextCh=='y'||
							   nextCh=='z'||
							   nextCh=='A'||nextCh=='B'||nextCh=='C'||nextCh=='D'||nextCh=='E'||
							   nextCh=='F'||nextCh=='G'||nextCh=='H'||nextCh=='I'||nextCh=='J'||
							   nextCh=='K'||nextCh=='L'||nextCh=='M'||nextCh=='N'||nextCh=='O'||
							   nextCh=='P'||nextCh=='Q'||nextCh=='R'||nextCh=='S'||nextCh=='T'||
							   nextCh=='U'||nextCh=='V'||nextCh=='W'||nextCh=='X'||nextCh=='Y'||
							   nextCh=='Z'||
							   nextCh=='0'||nextCh=='1'||nextCh=='2'||nextCh=='3'||nextCh=='4'||
							   nextCh=='5'||nextCh=='6'||nextCh=='7'||nextCh=='8'||nextCh=='9'||
							   nextCh=='_'){
									System.out.print(Character.toString(nextCh)); 
									sb.append(Character.toString(nextCh));
									i++;
									nextCh=arrayOneLine[i+1];
									i++;
							}
							else{
								break;
							}
							
						}//end while
					}//end if
					else{
						System.out.print(Character.toString(arrayOneLine[i]));
						sb.append(Character.toString(arrayOneLine[i]));
					}
					System.out.println(")");
					sb.append(")" + System.getProperty("line.separator"));
					break;


			default :
					System.out.println(" --- Program not understand systax(or error) at column "
			                               + i +" ---");
					sb.append(" --- Program not understand systax(or error) at column "
						    + Integer.toString(i) +" ---" 
						    + System.getProperty("line.separator") );
			}//end switch		
		}//end for
	}//end method



	public void writeToFile() {
		try{
			FileWriter fstream = new FileWriter("My_Output.txt");
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(sb.toString());
			
			out.close();
		}
		catch(Exception exx){
			System.out.println(" --- Cannot write ---"+exx);
		}		
	}

}//end class

