/* The following code was generated by JFlex 1.4.1 on 04/08/14 12:29 PM */

package paquete;
import java_cup.runtime.*;
import java.io.Reader;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 04/08/14 12:29 PM from the specification file
 * <tt>C:/Users/Xmnz/Documents/NetBeansProjects/Compilador2/Compilador2/src/paquete/prueba.flex</tt>
 */
class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  9,  9,  0,  0,  9,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     9, 25,  8,  0,  0,  0,  0,  0, 28, 29, 34, 32, 30, 33, 31,  6, 
     2,  3,  4,  1,  5,  5,  5,  5,  5,  5,  0,  0, 27, 24, 26,  0, 
     0, 23,  7, 21, 19, 11, 20,  7,  7, 18,  7,  7, 12,  7, 17, 15, 
    13,  7, 14, 10, 22, 16,  7,  7,  7,  7,  7,  0,  0,  0,  0,  7, 
     0,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7, 
     7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  7,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\4\2\1\3\1\4\1\5\1\6\10\4"+
    "\1\7\1\1\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\2\1\0\2\4\1\21\5\4"+
    "\1\22\1\23\1\24\1\0\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\3\0\1\34\4\0\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[59];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\43\0\106\0\151\0\214\0\257\0\43\0\322"+
    "\0\43\0\43\0\365\0\u0118\0\u013b\0\u015e\0\u0181\0\u01a4"+
    "\0\u01c7\0\u01ea\0\43\0\u020d\0\u0230\0\u0253\0\43\0\43"+
    "\0\43\0\43\0\43\0\43\0\43\0\u0276\0\u0299\0\u02bc"+
    "\0\u02df\0\322\0\u0302\0\u0325\0\u0348\0\u036b\0\u038e\0\43"+
    "\0\43\0\43\0\u03b1\0\322\0\u03d4\0\322\0\322\0\322"+
    "\0\322\0\322\0\u03f7\0\u041a\0\u043d\0\322\0\u0460\0\u0483"+
    "\0\u04a6\0\u04c9\0\43";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[59];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\2\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\2\10\1\14\1\10\1\15\1\16\1\17"+
    "\1\20\1\21\3\10\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\44\0"+
    "\1\6\2\36\2\6\36\0\1\37\1\0\3\37\36\0"+
    "\5\36\36\0\5\6\44\0\1\10\2\0\16\10\22\0"+
    "\1\10\2\0\1\10\1\40\14\10\22\0\1\10\2\0"+
    "\4\10\1\41\11\10\22\0\1\10\2\0\4\10\1\42"+
    "\11\10\22\0\1\10\2\0\7\10\1\43\6\10\22\0"+
    "\1\10\2\0\5\10\1\44\10\10\22\0\1\10\2\0"+
    "\7\10\1\45\6\10\22\0\1\10\2\0\10\10\1\46"+
    "\5\10\22\0\1\10\2\0\7\10\1\47\6\10\43\0"+
    "\1\50\42\0\1\51\42\0\1\52\13\0\5\6\1\53"+
    "\42\0\1\53\43\0\1\10\2\0\2\10\1\54\13\10"+
    "\22\0\1\10\2\0\5\10\1\55\10\10\22\0\1\10"+
    "\2\0\10\10\1\56\5\10\22\0\1\10\2\0\14\10"+
    "\1\57\1\10\22\0\1\10\2\0\14\10\1\60\1\10"+
    "\22\0\1\10\2\0\12\10\1\61\3\10\22\0\1\10"+
    "\2\0\11\10\1\62\4\10\14\0\1\63\1\64\1\65"+
    "\2\63\44\0\1\10\2\0\13\10\1\66\2\10\21\0"+
    "\1\67\35\0\1\63\1\0\3\63\37\0\3\63\1\0"+
    "\1\67\35\0\5\70\36\0\5\71\36\0\5\72\36\0"+
    "\5\73\35\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1260];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\1\1\2\11\10\1\1\11"+
    "\3\1\7\11\1\1\1\0\10\1\3\11\1\0\7\1"+
    "\3\0\1\1\4\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[59];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  AnalizadorLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { return new java_cup.runtime.Symbol(sym.NUMERO,new Token(yytext(),yyline, yycolumn,"NUMERO","numero"));
          }
        case 30: break;
        case 17: 
          { return new java_cup.runtime.Symbol(sym.OR,new Token(yytext(),yyline, yycolumn,"OR","booleano"));
          }
        case 31: break;
        case 16: 
          { return new java_cup.runtime.Symbol(sym.MULTI,new Token(yytext(),yyline, yycolumn,"MULTI","numero"));
          }
        case 32: break;
        case 18: 
          { return new java_cup.runtime.Symbol(sym.DIFERENTE,new Token(yytext(),yyline, yycolumn,"DIFERENTE","booleano"));
          }
        case 33: break;
        case 27: 
          { return new java_cup.runtime.Symbol(sym.AND,new Token(yytext(),yyline, yycolumn,"AND","booleano"));
          }
        case 34: break;
        case 28: 
          { return new java_cup.runtime.Symbol(sym.PROC,new Token(yytext(),yyline, yycolumn,"PROC","Relacion"));
          }
        case 35: break;
        case 25: 
          { return new java_cup.runtime.Symbol(sym.INT,new Token(yytext(),yyline, yycolumn,"INT","Relacion"));
          }
        case 36: break;
        case 7: 
          { return new java_cup.runtime.Symbol(sym.EQ,new Token(yytext(),yyline, yycolumn,"EQ","booleano"));
          }
        case 37: break;
        case 10: 
          { return new java_cup.runtime.Symbol(sym.IPAREN,new Token(yytext(),yyline, yycolumn,"IPAREN"));
          }
        case 38: break;
        case 1: 
          { System.err.println("Caracter ilegal, no se reconoce '"+yytext()+"' en ["+yyline+","+yycolumn+"]");
          }
        case 39: break;
        case 8: 
          { return new java_cup.runtime.Symbol(sym.MAYOR,new Token(yytext(),yyline, yycolumn,"MAYOR","booleano"));
          }
        case 40: break;
        case 11: 
          { return new java_cup.runtime.Symbol(sym.DPAREN,new Token(yytext(),yyline, yycolumn,"DPAREN"));
          }
        case 41: break;
        case 19: 
          { return new java_cup.runtime.Symbol(sym.MAYORIGUAL,new Token(yytext(),yyline, yycolumn,"MAYORIGUAL","booleano"));
          }
        case 42: break;
        case 20: 
          { return new java_cup.runtime.Symbol(sym.MENORIGUAL,new Token(yytext(),yyline, yycolumn,"MENORIGUAL","booleano"));
          }
        case 43: break;
        case 23: 
          { return new java_cup.runtime.Symbol(sym.UNI,new Token(yytext(),yyline, yycolumn,"UNI","Relacion"));
          }
        case 44: break;
        case 12: 
          { return new java_cup.runtime.Symbol(sym.COMA,new Token(yytext(),yyline, yycolumn,"COMA"));
          }
        case 45: break;
        case 21: 
          { return new java_cup.runtime.Symbol(sym.SEL,new Token(yytext(),yyline, yycolumn,"SEL","Relacion"));
          }
        case 46: break;
        case 9: 
          { return new java_cup.runtime.Symbol(sym.MENOR,new Token(yytext(),yyline, yycolumn,"MENOR","booleano"));
          }
        case 47: break;
        case 14: 
          { return new java_cup.runtime.Symbol(sym.SUMA,new Token(yytext(),yyline, yycolumn,"SUMA","numero"));
          }
        case 48: break;
        case 5: 
          { return new java_cup.runtime.Symbol(sym.COMILLA,new Token(yytext(),yyline, yycolumn,"COMILLA"));
          }
        case 49: break;
        case 29: 
          { return new java_cup.runtime.Symbol(sym.FECHA,new Token(yytext(),yyline, yycolumn,"FECHA","fecha"));
          }
        case 50: break;
        case 13: 
          { return new java_cup.runtime.Symbol(sym.PUNTO,new Token(yytext(),yyline, yycolumn,"PUNTO"));
          }
        case 51: break;
        case 24: 
          { return new java_cup.runtime.Symbol(sym.NOT,new Token(yytext(),yyline, yycolumn,"NOT","booleano"));
          }
        case 52: break;
        case 22: 
          { return new java_cup.runtime.Symbol(sym.PRO,new Token(yytext(),yyline, yycolumn,"PRO","Relacion"));
          }
        case 53: break;
        case 15: 
          { return new java_cup.runtime.Symbol(sym.RESTA,new Token(yytext(),yyline, yycolumn,"RESTA","numero"));
          }
        case 54: break;
        case 3: 
          { return new java_cup.runtime.Symbol(sym.DIVI,new Token(yytext(),yyline, yycolumn,"DIVI","numero"));
          }
        case 55: break;
        case 4: 
          { return new java_cup.runtime.Symbol(sym.CADENA,new Token(yytext(),yyline, yycolumn,"CADENA"));
          }
        case 56: break;
        case 26: 
          { return new java_cup.runtime.Symbol(sym.DIF,new Token(yytext(),yyline, yycolumn,"DIF","Relacion"));
          }
        case 57: break;
        case 6: 
          { 
          }
        case 58: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
