package p6;

/**
 * 
 * Class that contains all the characters used in the project.
 * 
 * @author Grupp 14
 *
 */
public class Characters {
	private Array7x7 charArray;
	
	/**
	 * Returns the Array7x7 array that contains the character that is assigned to it.
	 * @param chr, character
	 * @return the characterArray with specified char.
	 */
	public Array7x7 getCharacterArray(char chr) {
			switch (chr) {
			case 'A':
				charArray = new Array7x7(charA);
				break;

			case 'B':
				charArray = new Array7x7(charB);
				break;

			case 'C':
				charArray = new Array7x7(charC);
				break;

			case 'D':
				charArray = new Array7x7(charD);
				break;

			case 'E':
				charArray = new Array7x7(charE);
				break;

			case 'F':
				charArray = new Array7x7(charF);
				break;

			case 'G':
				charArray = new Array7x7(charG);
				break;

			case 'H':
				charArray = new Array7x7(charH);
				break;

			case 'I':
				charArray = new Array7x7(charI);
				break;

			case 'J':
				charArray = new Array7x7(charJ);
				break;

			case 'K':
				charArray = new Array7x7(charK);
				break;

			case 'L':
				charArray = new Array7x7(charL);
				break;

			case 'M':
				charArray = new Array7x7(charM);
				break;

			case 'N':
				charArray = new Array7x7(charN);
				break;

			case 'O':
				charArray = new Array7x7(charO);
				break;

			case 'P':
				charArray = new Array7x7(charP);
				break;

			case 'Q':
				charArray = new Array7x7(charQ);
				break;

			case 'R':
				charArray = new Array7x7(charR);
				break;

			case 'S':
				charArray = new Array7x7(charS);
				break;

			case 'T':
				charArray = new Array7x7(charT);
				break;

			case 'U':
				charArray = new Array7x7(charU);
				break;

			case 'V':
				charArray = new Array7x7(charV);
				break;

			case 'W':
				charArray = new Array7x7(charW);
				break;

			case 'X':
				charArray = new Array7x7(charX);
				break;

			case 'Y':
				charArray = new Array7x7(charY);
				break;

			case 'Z':
				charArray = new Array7x7(charZ);
				break;

			case '0':
				charArray = new Array7x7(charZero);
				break;

			case '1':
				charArray = new Array7x7(charOne);
				break;

			case '2':
				charArray = new Array7x7(charTwo);
				break;

			case '3':
				charArray = new Array7x7(charThree);
				break;

			case '4':
				charArray = new Array7x7(charFour);
				break;

			case '5':
				charArray = new Array7x7(charFive);
				break;

			case '6':
				charArray = new Array7x7(charSix);
				break;

			case '7':
				charArray = new Array7x7(charSeven);
				break;

			case '8':
				charArray = new Array7x7(charEight);
				break;

			case '9':
				charArray = new Array7x7(charNine);
				break;

			case '+':
				charArray = new Array7x7(charPlus);
				break;

			case '-':
				charArray = new Array7x7(charMinus);
				break;

			case '!':
				charArray = new Array7x7(charExclMark);
				break;

			case '*':
				charArray = new Array7x7(charMulti);
				break;

			case ',':
				charArray = new Array7x7(charComma);
				break;

			case '.':
				charArray = new Array7x7(charDot);
				break;

			case '$':
				charArray = new Array7x7(charDollar);
				break;

			case '=':
				charArray = new Array7x7(charEquals);
				break;

			case '/':
				charArray = new Array7x7(charFrontSlash);
				break;

			case '\\':
				charArray = new Array7x7(charBackSlash);
				break;

			case '>':
				charArray = new Array7x7(charGreaterThan);
				break;

			case '<':
				charArray = new Array7x7(charLesserThan);
				break;

			case '&':
				charArray = new Array7x7(charAnd);
				break;

			case ' ':
				charArray = new Array7x7(charSpace);
				break;

			case '?':
				charArray = new Array7x7(charQuestionmark);
				break;

			case '#':
				charArray = new Array7x7(charHashtag);
				break;

			case '{':
				charArray = new Array7x7(charLCurlyB);
				break;

			case '}':
				charArray = new Array7x7(charRCurlyB);
				break;
				
			case '"':
				charArray = new Array7x7(charQuotemark);
				break;

			case '_':
				charArray = new Array7x7(charUnderline);
				break;

			case '%':
				charArray = new Array7x7(charProcent);
				break;

			default:
				charArray = new Array7x7(charUnknown);
				break;

			}
		return charArray;
	}

	public static int[][] charUnknown = {
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	public static int[][] charLCurlyB = {
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 1, 0}
		};
	
	public static int[][] charRCurlyB = {
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0}
		};
	public static int[][] charExclMark  = {
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0}
		};
		
	public static int[][] charQuotemark = {
			{0, 1, 0, 1, 0, 0, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
		};
		
	public static int[][] charHashtag = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 1, 0, 1, 0, 0}
		};
		
	public static int[][] charDollar = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
		
	public static int[][] charProcent = {
			{0, 1, 0, 0, 0, 1, 0},
			{1, 0, 1, 0, 0, 1, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 1, 0},
			{0, 1, 0, 0, 1, 0, 1},
			{0, 1, 0, 0, 0, 1, 0}
		};

	public static int[][] charAnd = {
			{0, 0, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 0, 1, 1, 0, 1, 0}
		};
		
	public static int[][] charMulti = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 0, 0, 1, 0, 0, 0}
		};
		
	public static int[][] charPlus = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
		};
		
	public static int[][] charMinus = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
		};
		
	public static int[][] charDot = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0}
		};
		
	public static int[][] charComma = {
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0},
				{0, 0, 1, 0, 0, 0, 0},
				{0, 1, 0, 0, 0, 0, 0}
			};
		
	public static int[][] charFrontSlash = {
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0}
		};
		
	public static int[][] charBackSlash = {
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0}
		};
		
	public static int[][] charApostrophe = {
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
		};
		
	public static int[][] CharColon = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
		};
		
	public static int[][] charLesserThan = {
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0}
		};
		
	public static int[][] charGreaterThan = {
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0}
		};
		
	public static int[][] charEquals = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
		};
		
	public static int[][] charQuestionmark = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0}
		};
		
	public static int[][] charUnderline = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{1, 1, 1, 1, 1, 1, 1}
		};
		
	public static int[][] charSpace = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
		};
		
	public static int[][] charA = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0}
		};
		
	public static int[][] charB = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 1, 1, 0, 0}
		};
		
	public static int[][] charC = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
		
	public static int[][] charD = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 1, 1, 0, 0}
		};
		
	public static int[][] charE = {
			{0, 1, 1, 1, 1, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0}
		};
		
	public static int[][] charF = {
			{0, 1, 1, 1, 1, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0}
		};
		
	public static int[][] charG = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 1, 1, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 1, 0}
		};
		
	public static int[][] charH = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0}
		};
		
	public static int[][] charI = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
		
	public static int[][] charJ = {
			{0, 0, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
		
	public static int[][] charK = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 1, 1, 0, 0, 0, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0}
		};
		
	public static int[][] charL = {
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0}
		};
		
	public static int[][] charM = {
			{0, 1, 1, 0, 1, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0}
		};
		
	public static int[][] charN = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 0, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 0, 1, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0}
		};
			
	public static int[][] charO = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
			
	public static int[][] charP = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0}
		};
			
		
	public static int[][] charQ = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 0, 1, 1, 0, 1, 0}
		};
		
		
	public static int[][] charR = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0}
		};
			
	public static int[][] charS = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
		
	public static int[][] charT = {
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
		};
			
		
	public static int[][] charU = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
			
		
	public static int[][] charV = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
		};
			
	public static int[][] charW = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 0, 1, 0, 1, 0, 0}
		};
		
	public static int[][] charX = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0}
		};
			
		
	public static int[][] charY = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
		};
			
		
	public static int[][] charZ = {
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0}
		};
		
	public static int[][] charZero = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
			
	public static int[][] charOne = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 1, 1, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0}
		};
		
	public static int[][] charTwo = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0}
		};
			
		
	public static int[][] charThree = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
			
		
	public static int[][] charFour = {
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 1, 1, 0},
			{0, 0, 0, 1, 0, 1, 0},
			{0, 0, 1, 0, 0, 1, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0}
		};
			
	public static int[][] charFive = {
			{0, 1, 1, 1, 1, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
		
	public static int[][] charSix = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
		
	public static int[][] charSeven = {
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0}
		};
		
	public static int[][] charEight = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
		
	public static int[][] charNine = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
		};
}
