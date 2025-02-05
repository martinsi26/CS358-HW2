package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
import
syntaxtree
.
*
;
import
wrangLR
.
runtime
.
MessageObject
;
import
wrangLR
.
runtime
.
FilePosObject
;
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 133; }
public int getNttSym() { return 134; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<class decl>",
"`class",
"ID",
"`{",
"<decl in class>*",
"`}",
"<decl in class>",
"<method decl>",
"`public",
"`void",
"`(",
"`)",
"<stmt>*",
"<type>",
"`return",
"<exp>",
"`int",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"`break",
"<local var decl>",
"`=",
"<exp8>",
"`||",
"<exp7>",
"`&&",
"<exp6>",
"`==",
"<exp5>",
"`<",
"<exp4>",
"`>",
"`instanceof",
"`+",
"<exp3>",
"`-",
"`*",
"<exp2>",
"`/",
"`%",
"`!",
"<exp1>",
"<cast exp>",
"<unary exp>",
"`new",
"<empty bracket pair>*",
"INTLIT",
"CHARLIT",
"STRINGLIT",
"`true",
"`false",
"`this",
"`null",
"`.",
"letter",
"\"a\"",
"\"p\"",
"\"v\"",
"\"c\"",
"\"f\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"b\"",
"\"e\"",
"{\"A\"..\"Z\" \"d\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"s\" \"w\"..\"z\"}",
"\"h\"",
"\"n\"",
"\"t\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"any",
"\"[\"",
"\"-\"",
"\"<\"",
"\"|\"",
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\"]\"",
"\"/\"",
"\";\"",
"{0..9 11..31 \"$\" \",\" \":\" \"?\" \"\\\" \"^\" \"`\" \"~\"..127}",
"\">\"",
"\"{\"",
"\"%\"",
"\"(\"",
"\"+\"",
"\".\"",
"\"_\"",
"\"=\"",
"\"@\"",
"10",
"\"}\"",
"\"!\"",
"\"\'\"",
"\'\"\'",
"\"*\"",
"any128",
"{223}",
"{128..175 186..192 219..222 224 251..255}",
"ws",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"any*",
"$$3",
"idChar",
"idChar128",
"hexDigit",
"hexDigit128",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 135;}
private static final int MIN_REDUCTION = 1607;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+0;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
1,304, // <start>
2,482, // ws*
3,512, // <program>
4,330, // <class decl>+
5,1460, // <class decl>
6,1353, // `class
94,441, // " "
95,130, // "#"
111,325, // {10}
120,1517, // ws
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|544, // match move
0x80000000|1482, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 3
0x80000000|1, // match move
0x80000000|611, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 4
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 5
70,1324, // "i"
75,1290, // "b"
  }
,
{ // state 6
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 8
7,946, // ID
15,181, // `(
40,515, // <exp4>
43,465, // `+
44,1255, // <exp3>
45,616, // `-
47,1271, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 9
0x80000000|1312, // match move
0x80000000|554, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 10
31,901, // `=
109,890, // "="
  }
,
{ // state 11
0x80000000|1480, // match move
0x80000000|309, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
39,855, // `<
41,26, // `>
42,1235, // `instanceof
92,1380, // "<"
95,947, // "#"
102,833, // ">"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 13
24,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 14
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 16
7,877, // ID
15,253, // `(
40,499, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 17
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 18
94,521, // " "
111,907, // {10}
120,1123, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 19
84,1436, // digit
85,610, // {"1".."9"}
86,610, // "0"
87,208, // digit128
88,1094, // {176..185}
124,1095, // $$1
  }
,
{ // state 20
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 21
0x80000000|1, // match move
0x80000000|743, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 22
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 23
24,622, // `[
90,168, // "["
  }
,
{ // state 24
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 25
7,920, // ID
15,222, // `(
40,445, // <exp4>
43,379, // `+
44,1349, // <exp3>
45,748, // `-
47,1334, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 26
7,869, // ID
15,231, // `(
40,447, // <exp4>
43,369, // `+
44,1343, // <exp3>
45,747, // `-
47,1335, // <exp2>
50,1121, // `!
51,542, // <exp1>
52,188, // <cast exp>
53,114, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
105,1000, // "("
106,1051, // "+"
110,713, // "@"
113,41, // "!"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 27
2,353, // ws*
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 28
25,389, // `]
98,1404, // "]"
  }
,
{ // state 29
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 30
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 32
24,MIN_REDUCTION+107, // `[
90,MIN_REDUCTION+107, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 33
24,MIN_REDUCTION+107, // `[
90,MIN_REDUCTION+107, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 34
84,1436, // digit
85,610, // {"1".."9"}
86,610, // "0"
87,348, // digit128
88,1319, // {176..185}
124,1320, // $$1
  }
,
{ // state 35
72,1024, // "o"
  }
,
{ // state 36
84,1436, // digit
85,610, // {"1".."9"}
86,610, // "0"
87,345, // digit128
88,1318, // {176..185}
124,1322, // $$1
  }
,
{ // state 37
0x80000000|1006, // match move
0x80000000|1171, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 39
2,944, // ws*
  }
,
{ // state 40
94,661, // " "
111,38, // {10}
120,1432, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 41
2,391, // ws*
94,49, // " "
111,728, // {10}
120,1337, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 42
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 43
24,MIN_REDUCTION+158, // `[
90,MIN_REDUCTION+158, // "["
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 44
0x80000000|1563, // match move
0x80000000|1476, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 45
24,MIN_REDUCTION+67, // `[
90,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 46
24,MIN_REDUCTION+67, // `[
90,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 47
16,1602, // `)
97,1444, // ")"
  }
,
{ // state 48
72,1027, // "o"
  }
,
{ // state 49
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 50
24,MIN_REDUCTION+50, // `[
90,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 51
94,387, // " "
111,281, // {10}
120,1419, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 52
0x80000000|1563, // match move
0x80000000|1477, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 53
84,1436, // digit
85,610, // {"1".."9"}
86,610, // "0"
87,182, // digit128
88,1120, // {176..185}
124,1333, // $$1
  }
,
{ // state 54
2,917, // ws*
  }
,
{ // state 55
0x80000000|1563, // match move
0x80000000|1484, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 56
0x80000000|228, // match move
0x80000000|636, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 57
24,MIN_REDUCTION+107, // `[
90,MIN_REDUCTION+107, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 58
24,MIN_REDUCTION+67, // `[
90,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 59
16,1595, // `)
97,1466, // ")"
  }
,
{ // state 60
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 61
2,910, // ws*
  }
,
{ // state 62
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1585, // ID
640, // `{
-1, // <decl in class>*
787, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
231, // `(
-1, // `)
1389, // <stmt>*
1209, // <type>
-1, // `return
10, // <exp>
744, // `int
1470, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1228, // <stmt>
517, // <assign>
1041, // `;
766, // `break
1001, // <local var decl>
-1, // `=
1267, // <exp8>
-1, // `||
1537, // <exp7>
-1, // `&&
1501, // <exp6>
-1, // `==
1468, // <exp5>
-1, // `<
957, // <exp4>
-1, // `>
-1, // `instanceof
369, // `+
1343, // <exp3>
747, // `-
-1, // `*
1335, // <exp2>
-1, // `/
-1, // `%
1121, // `!
542, // <exp1>
188, // <cast exp>
114, // <unary exp>
269, // `new
-1, // <empty bracket pair>*
490, // INTLIT
458, // CHARLIT
1519, // STRINGLIT
199, // `true
568, // `false
1068, // `this
1193, // `null
-1, // `.
1433, // letter
428, // "a"
428, // "p"
428, // "v"
428, // "c"
428, // "f"
428, // "i"
428, // "l"
428, // "o"
428, // "r"
428, // "u"
428, // "b"
428, // "e"
428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
428, // "h"
428, // "n"
428, // "t"
446, // letter128
197, // {199..218 231..250}
197, // {193..198 225..230}
-1, // digit
708, // {"1".."9"}
213, // "0"
306, // digit128
1319, // {176..185}
-1, // any
-1, // "["
1149, // "-"
-1, // "<"
-1, // "|"
-1, // " "
575, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
506, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
425, // "{"
-1, // "%"
1000, // "("
1051, // "+"
-1, // "."
-1, // "_"
-1, // "="
713, // "@"
-1, // {10}
299, // "}"
41, // "!"
1473, // "'"
1348, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 63
24,MIN_REDUCTION+50, // `[
90,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 64
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 65
0x80000000|1012, // match move
0x80000000|1093, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 66
0x80000000|1013, // match move
0x80000000|1086, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 67
24,MIN_REDUCTION+67, // `[
90,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 68
25,280, // `]
98,452, // "]"
  }
,
{ // state 69
39,857, // `<
41,25, // `>
42,1237, // `instanceof
92,1380, // "<"
95,947, // "#"
102,833, // ">"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 70
24,MIN_REDUCTION+50, // `[
90,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 72
24,MIN_REDUCTION+50, // `[
90,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 73
15,MIN_REDUCTION+11, // `(
105,MIN_REDUCTION+11, // "("
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 75
2,968, // ws*
  }
,
{ // state 76
0x80000000|133, // match move
0x80000000|1140, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 77
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 78
0x80000000|259, // match move
0x80000000|716, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 79
24,MIN_REDUCTION+107, // `[
90,MIN_REDUCTION+107, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 80
7,1128, // ID
64,1462, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,1040, // letter128
82,557, // {199..218 231..250}
83,557, // {193..198 225..230}
  }
,
{ // state 81
25,266, // `]
98,397, // "]"
  }
,
{ // state 82
25,267, // `]
98,363, // "]"
  }
,
{ // state 83
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 84
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 85
2,349, // ws*
  }
,
{ // state 86
23,525, // <empty bracket pair>
24,767, // `[
90,168, // "["
  }
,
{ // state 87
0x80000000|1205, // match move
0x80000000|1038, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 88
0x80000000|1201, // match move
0x80000000|1044, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 89
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 90
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1559, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1598, // digit128
88,1120, // {176..185}
108,693, // "_"
118,450, // {223}
122,1356, // $$0
129,721, // idChar
130,926, // idChar128
  }
,
{ // state 91
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 92
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 94
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 95
37,1043, // `==
110,815, // "@"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 96
2,338, // ws*
  }
,
{ // state 97
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 98
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 99
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 100
39,782, // `<
41,8, // `>
42,1202, // `instanceof
92,1380, // "<"
95,947, // "#"
102,833, // ">"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 101
2,420, // ws*
24,MIN_REDUCTION+144, // `[
90,MIN_REDUCTION+144, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 102
0x80000000|1, // match move
0x80000000|709, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 103
0x80000000|1, // match move
0x80000000|712, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 104
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 105
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1547, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1556, // digit128
88,1094, // {176..185}
108,693, // "_"
118,370, // {223}
122,1494, // $$0
129,721, // idChar
130,899, // idChar128
  }
,
{ // state 106
0x80000000|1184, // match move
0x80000000|1074, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 107
25,291, // `]
98,426, // "]"
  }
,
{ // state 108
24,MIN_REDUCTION+139, // `[
90,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 112
2,350, // ws*
94,387, // " "
111,281, // {10}
120,1373, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 113
24,MIN_REDUCTION+70, // `[
90,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 115
0x80000000|1563, // match move
0x80000000|1361, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 116
94,790, // " "
111,98, // {10}
120,42, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 117
0x80000000|736, // match move
0x80000000|1183, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 118
37,1025, // `==
110,815, // "@"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 119
2,386, // ws*
24,MIN_REDUCTION+144, // `[
90,MIN_REDUCTION+144, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 121
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 122
0x80000000|740, // match move
0x80000000|1181, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 123
67,573, // "v"
70,1212, // "i"
75,1115, // "b"
  }
,
{ // state 124
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1603, // letter128
82,1437, // {199..218 231..250}
83,1437, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,243, // digit128
88,11, // {176..185}
108,693, // "_"
118,682, // {223}
122,1015, // $$0
129,721, // idChar
130,498, // idChar128
  }
,
{ // state 125
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1573, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1586, // digit128
88,1319, // {176..185}
108,693, // "_"
118,463, // {223}
122,1341, // $$0
129,721, // idChar
130,951, // idChar128
  }
,
{ // state 126
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1568, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1583, // digit128
88,1318, // {176..185}
108,693, // "_"
118,461, // {223}
122,1338, // $$0
129,721, // idChar
130,949, // idChar128
  }
,
{ // state 127
10,1374, // `}
11,980, // <decl in class>
12,109, // <method decl>
13,621, // `public
95,313, // "#"
112,140, // "}"
  }
,
{ // state 128
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 130
68,1439, // "c"
  }
,
{ // state 131
39,857, // `<
41,25, // `>
42,1237, // `instanceof
92,1380, // "<"
95,947, // "#"
102,833, // ">"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 134
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1585, // ID
640, // `{
-1, // <decl in class>*
974, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
231, // `(
-1, // `)
-1, // <stmt>*
1209, // <type>
-1, // `return
10, // <exp>
744, // `int
1470, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1316, // <stmt>
517, // <assign>
1041, // `;
766, // `break
1001, // <local var decl>
-1, // `=
1267, // <exp8>
-1, // `||
1537, // <exp7>
-1, // `&&
1501, // <exp6>
-1, // `==
1468, // <exp5>
-1, // `<
957, // <exp4>
-1, // `>
-1, // `instanceof
369, // `+
1343, // <exp3>
747, // `-
-1, // `*
1335, // <exp2>
-1, // `/
-1, // `%
1121, // `!
542, // <exp1>
188, // <cast exp>
114, // <unary exp>
269, // `new
-1, // <empty bracket pair>*
490, // INTLIT
458, // CHARLIT
1519, // STRINGLIT
199, // `true
568, // `false
1068, // `this
1193, // `null
-1, // `.
1433, // letter
428, // "a"
428, // "p"
428, // "v"
428, // "c"
428, // "f"
428, // "i"
428, // "l"
428, // "o"
428, // "r"
428, // "u"
428, // "b"
428, // "e"
428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
428, // "h"
428, // "n"
428, // "t"
446, // letter128
197, // {199..218 231..250}
197, // {193..198 225..230}
-1, // digit
708, // {"1".."9"}
213, // "0"
306, // digit128
1319, // {176..185}
-1, // any
-1, // "["
1149, // "-"
-1, // "<"
-1, // "|"
-1, // " "
575, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
506, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
425, // "{"
-1, // "%"
1000, // "("
1051, // "+"
-1, // "."
-1, // "_"
-1, // "="
713, // "@"
-1, // {10}
1561, // "}"
41, // "!"
1473, // "'"
1348, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 135
24,MIN_REDUCTION+57, // `[
90,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 136
0x80000000|594, // match move
0x80000000|1052, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 137
2,1101, // ws*
24,MIN_REDUCTION+82, // `[
90,MIN_REDUCTION+82, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 138
39,771, // `<
41,16, // `>
42,1217, // `instanceof
92,1380, // "<"
95,947, // "#"
102,833, // ">"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 139
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 140
2,818, // ws*
94,1500, // " "
111,1451, // {10}
120,17, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 142
16,1340, // `)
97,720, // ")"
  }
,
{ // state 143
2,1223, // ws*
94,387, // " "
111,281, // {10}
120,1373, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 144
65,584, // "a"
66,584, // "p"
67,584, // "v"
68,584, // "c"
69,584, // "f"
70,584, // "i"
71,584, // "l"
72,584, // "o"
73,584, // "r"
74,584, // "u"
75,584, // "b"
76,584, // "e"
77,584, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,584, // "h"
79,584, // "n"
80,584, // "t"
83,1375, // {193..198 225..230}
85,584, // {"1".."9"}
86,584, // "0"
88,1375, // {176..185}
126,1410, // $$2
131,400, // hexDigit
132,596, // hexDigit128
  }
,
{ // state 145
65,584, // "a"
66,584, // "p"
67,584, // "v"
68,584, // "c"
69,584, // "f"
70,584, // "i"
71,584, // "l"
72,584, // "o"
73,584, // "r"
74,584, // "u"
75,584, // "b"
76,584, // "e"
77,584, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,584, // "h"
79,584, // "n"
80,584, // "t"
83,1377, // {193..198 225..230}
85,584, // {"1".."9"}
86,584, // "0"
88,1377, // {176..185}
126,1408, // $$2
131,400, // hexDigit
132,600, // hexDigit128
  }
,
{ // state 146
24,MIN_REDUCTION+57, // `[
90,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 147
24,MIN_REDUCTION+57, // `[
90,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 148
94,715, // " "
111,916, // {10}
120,801, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 151
65,584, // "a"
66,584, // "p"
67,584, // "v"
68,584, // "c"
69,584, // "f"
70,584, // "i"
71,584, // "l"
72,584, // "o"
73,584, // "r"
74,584, // "u"
75,584, // "b"
76,584, // "e"
77,584, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,584, // "h"
79,584, // "n"
80,584, // "t"
83,1352, // {193..198 225..230}
85,584, // {"1".."9"}
86,584, // "0"
88,1352, // {176..185}
126,1421, // $$2
131,400, // hexDigit
132,518, // hexDigit128
  }
,
{ // state 152
10,1332, // `}
112,1561, // "}"
  }
,
{ // state 153
2,1167, // ws*
24,MIN_REDUCTION+82, // `[
90,MIN_REDUCTION+82, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 154
0x80000000|607, // match move
0x80000000|1085, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 155
2,1151, // ws*
24,MIN_REDUCTION+82, // `[
90,MIN_REDUCTION+82, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 156
2,417, // ws*
24,MIN_REDUCTION+144, // `[
90,MIN_REDUCTION+144, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 159
24,MIN_REDUCTION+64, // `[
90,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 161
72,1414, // "o"
  }
,
{ // state 162
65,584, // "a"
66,584, // "p"
67,584, // "v"
68,584, // "c"
69,584, // "f"
70,584, // "i"
71,584, // "l"
72,584, // "o"
73,584, // "r"
74,584, // "u"
75,584, // "b"
76,584, // "e"
77,584, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,584, // "h"
79,584, // "n"
80,584, // "t"
83,1358, // {193..198 225..230}
85,584, // {"1".."9"}
86,584, // "0"
88,1358, // {176..185}
126,1262, // $$2
131,400, // hexDigit
132,536, // hexDigit128
  }
,
{ // state 163
0x80000000|978, // match move
0x80000000|442, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 164
94,642, // " "
111,352, // {10}
120,165, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 166
0x80000000|176, // match move
0x80000000|592, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 167
24,MIN_REDUCTION+57, // `[
90,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 168
2,1395, // ws*
94,1003, // " "
111,396, // {10}
120,1551, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 169
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1547, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1556, // digit128
88,1094, // {176..185}
108,693, // "_"
118,370, // {223}
121,105, // idChar*
122,1287, // $$0
129,927, // idChar
130,899, // idChar128
  }
,
{ // state 170
0x80000000|1, // match move
0x80000000|1516, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 171
0x80000000|384, // match move
0x80000000|67, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 172
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 173
0x80000000|1, // match move
0x80000000|1514, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 174
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 175
94,548, // " "
111,91, // {10}
120,1542, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 177
94,1402, // " "
111,842, // {10}
120,862, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 179
24,MIN_REDUCTION+183, // `[
90,MIN_REDUCTION+183, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 181
7,825, // ID
18,656, // <type>
21,358, // `int
22,1125, // `boolean
64,1464, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,679, // letter128
82,553, // {199..218 231..250}
83,553, // {193..198 225..230}
95,5, // "#"
  }
,
{ // state 182
0x80000000|777, // match move
0x80000000|789, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 183
0x80000000|1, // match move
0x80000000|1548, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 184
24,MIN_REDUCTION+139, // `[
90,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 185
8,672, // `{
103,425, // "{"
  }
,
{ // state 186
80,955, // "t"
  }
,
{ // state 187
0x80000000|1, // match move
0x80000000|1546, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 188
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 190
2,631, // ws*
94,661, // " "
111,38, // {10}
120,1566, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 191
37,1043, // `==
110,815, // "@"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 192
80,1200, // "t"
  }
,
{ // state 193
0x80000000|1, // match move
0x80000000|1536, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 194
2,471, // ws*
  }
,
{ // state 195
7,877, // ID
15,253, // `(
20,1442, // <exp>
32,1284, // <exp8>
34,1478, // <exp7>
36,95, // <exp6>
38,1506, // <exp5>
40,893, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 196
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 197
0x80000000|1431, // match move
0x80000000|439, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 198
70,354, // "i"
75,272, // "b"
  }
,
{ // state 199
0x80000000|1, // match move
0x80000000|146, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 200
0x80000000|1, // match move
0x80000000|875, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 201
0x80000000|1, // match move
0x80000000|147, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 202
0x80000000|1, // match move
0x80000000|873, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 203
24,MIN_REDUCTION+85, // `[
90,MIN_REDUCTION+85, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 204
80,906, // "t"
  }
,
{ // state 205
24,MIN_REDUCTION+185, // `[
90,MIN_REDUCTION+185, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 206
24,MIN_REDUCTION+85, // `[
90,MIN_REDUCTION+85, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 207
2,1222, // ws*
24,MIN_REDUCTION+82, // `[
90,MIN_REDUCTION+82, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 208
0x80000000|788, // match move
0x80000000|868, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 209
0x80000000|587, // match move
0x80000000|219, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 210
65,584, // "a"
66,584, // "p"
67,584, // "v"
68,584, // "c"
69,584, // "f"
70,584, // "i"
71,584, // "l"
72,584, // "o"
73,584, // "r"
74,584, // "u"
75,584, // "b"
76,584, // "e"
77,584, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,584, // "h"
79,584, // "n"
80,584, // "t"
83,1377, // {193..198 225..230}
85,584, // {"1".."9"}
86,584, // "0"
88,1377, // {176..185}
125,145, // hexDigit*
126,960, // $$2
131,178, // hexDigit
132,600, // hexDigit128
  }
,
{ // state 211
80,878, // "t"
  }
,
{ // state 212
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 213
65,584, // "a"
66,584, // "p"
67,584, // "v"
68,584, // "c"
69,584, // "f"
70,584, // "i"
71,584, // "l"
72,584, // "o"
73,584, // "r"
74,584, // "u"
75,584, // "b"
76,584, // "e"
77,584, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,584, // "h"
79,584, // "n"
80,584, // "t"
83,1375, // {193..198 225..230}
85,584, // {"1".."9"}
86,584, // "0"
88,1375, // {176..185}
125,144, // hexDigit*
126,962, // $$2
131,178, // hexDigit
132,596, // hexDigit128
  }
,
{ // state 214
37,1025, // `==
110,815, // "@"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 215
0x80000000|1, // match move
0x80000000|886, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 216
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 217
0x80000000|1, // match move
0x80000000|343, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|346, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 219
15,MIN_REDUCTION+140, // `(
105,MIN_REDUCTION+140, // "("
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 220
24,MIN_REDUCTION+139, // `[
90,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 221
24,MIN_REDUCTION+139, // `[
90,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 222
7,825, // ID
18,602, // <type>
21,358, // `int
22,1125, // `boolean
64,1464, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,679, // letter128
82,553, // {199..218 231..250}
83,553, // {193..198 225..230}
95,5, // "#"
  }
,
{ // state 223
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 224
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1585, // ID
62, // `{
-1, // <decl in class>*
-1, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
231, // `(
-1, // `)
-1, // <stmt>*
1209, // <type>
996, // `return
10, // <exp>
744, // `int
1470, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
624, // <stmt>
1367, // <assign>
223, // `;
1372, // `break
475, // <local var decl>
-1, // `=
1267, // <exp8>
-1, // `||
1537, // <exp7>
-1, // `&&
1501, // <exp6>
-1, // `==
1468, // <exp5>
-1, // `<
957, // <exp4>
-1, // `>
-1, // `instanceof
369, // `+
1343, // <exp3>
747, // `-
-1, // `*
1335, // <exp2>
-1, // `/
-1, // `%
1121, // `!
542, // <exp1>
188, // <cast exp>
114, // <unary exp>
269, // `new
-1, // <empty bracket pair>*
490, // INTLIT
458, // CHARLIT
1519, // STRINGLIT
199, // `true
568, // `false
1068, // `this
1193, // `null
-1, // `.
1433, // letter
428, // "a"
428, // "p"
428, // "v"
428, // "c"
428, // "f"
428, // "i"
428, // "l"
428, // "o"
428, // "r"
428, // "u"
428, // "b"
428, // "e"
428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
428, // "h"
428, // "n"
428, // "t"
446, // letter128
197, // {199..218 231..250}
197, // {193..198 225..230}
-1, // digit
708, // {"1".."9"}
213, // "0"
306, // digit128
1319, // {176..185}
-1, // any
-1, // "["
1149, // "-"
-1, // "<"
-1, // "|"
-1, // " "
332, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
474, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
425, // "{"
-1, // "%"
1000, // "("
1051, // "+"
-1, // "."
-1, // "_"
-1, // "="
713, // "@"
-1, // {10}
-1, // "}"
41, // "!"
1473, // "'"
1348, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 225
0x80000000|1170, // match move
0x80000000|995, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 226
7,877, // ID
15,253, // `(
20,1465, // <exp>
32,1284, // <exp8>
34,1478, // <exp7>
36,95, // <exp6>
38,1506, // <exp5>
40,893, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 227
7,877, // ID
15,253, // `(
20,1463, // <exp>
32,1284, // <exp8>
34,1478, // <exp7>
36,95, // <exp6>
38,1506, // <exp5>
40,893, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 228
2,810, // ws*
  }
,
{ // state 229
24,MIN_REDUCTION+85, // `[
90,MIN_REDUCTION+85, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 230
0x80000000|1, // match move
0x80000000|1560, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 231
7,825, // ID
18,604, // <type>
21,358, // `int
22,1125, // `boolean
64,1464, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,679, // letter128
82,553, // {199..218 231..250}
83,553, // {193..198 225..230}
95,5, // "#"
  }
,
{ // state 232
24,MIN_REDUCTION+139, // `[
90,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 234
0x80000000|1, // match move
0x80000000|1599, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 235
65,584, // "a"
66,584, // "p"
67,584, // "v"
68,584, // "c"
69,584, // "f"
70,584, // "i"
71,584, // "l"
72,584, // "o"
73,584, // "r"
74,584, // "u"
75,584, // "b"
76,584, // "e"
77,584, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,584, // "h"
79,584, // "n"
80,584, // "t"
83,1352, // {193..198 225..230}
85,584, // {"1".."9"}
86,584, // "0"
88,1352, // {176..185}
125,151, // hexDigit*
126,925, // $$2
131,178, // hexDigit
132,518, // hexDigit128
  }
,
{ // state 236
7,877, // ID
15,253, // `(
20,1454, // <exp>
32,1284, // <exp8>
34,1478, // <exp7>
36,95, // <exp6>
38,1506, // <exp5>
40,893, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 237
94,642, // " "
111,352, // {10}
120,165, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 238
24,MIN_REDUCTION+58, // `[
90,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 239
0x80000000|1, // match move
0x80000000|321, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
0x80000000|384, // match move
0x80000000|46, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 241
0x80000000|384, // match move
0x80000000|45, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 242
134,MIN_REDUCTION+177, // $NT
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 243
0x80000000|133, // match move
0x80000000|778, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 244
0x80000000|1144, // match move
0x80000000|1075, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 245
70,186, // "i"
75,294, // "b"
  }
,
{ // state 246
2,806, // ws*
  }
,
{ // state 247
2,769, // ws*
  }
,
{ // state 248
69,1076, // "f"
79,1050, // "n"
80,750, // "t"
  }
,
{ // state 249
24,MIN_REDUCTION+85, // `[
90,MIN_REDUCTION+85, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 250
24,MIN_REDUCTION+58, // `[
90,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 251
7,725, // ID
18,1479, // <type>
21,1327, // `int
22,9, // `boolean
64,419, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,843, // letter128
82,1437, // {199..218 231..250}
83,1437, // {193..198 225..230}
95,540, // "#"
  }
,
{ // state 252
8,939, // `{
103,969, // "{"
  }
,
{ // state 253
7,825, // ID
18,571, // <type>
21,358, // `int
22,1125, // `boolean
64,1464, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,679, // letter128
82,553, // {199..218 231..250}
83,553, // {193..198 225..230}
95,5, // "#"
  }
,
{ // state 254
0x80000000|384, // match move
0x80000000|58, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 255
0x80000000|1, // match move
0x80000000|1527, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 256
65,584, // "a"
66,584, // "p"
67,584, // "v"
68,584, // "c"
69,584, // "f"
70,584, // "i"
71,584, // "l"
72,584, // "o"
73,584, // "r"
74,584, // "u"
75,584, // "b"
76,584, // "e"
77,584, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,584, // "h"
79,584, // "n"
80,584, // "t"
83,1358, // {193..198 225..230}
85,584, // {"1".."9"}
86,584, // "0"
88,1358, // {176..185}
125,162, // hexDigit*
126,938, // $$2
131,178, // hexDigit
132,536, // hexDigit128
  }
,
{ // state 257
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 258
24,MIN_REDUCTION+58, // `[
90,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 259
2,840, // ws*
  }
,
{ // state 260
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 261
24,MIN_REDUCTION+58, // `[
90,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 262
0x80000000|1, // match move
0x80000000|205, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 263
24,MIN_REDUCTION+81, // `[
90,MIN_REDUCTION+81, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 264
7,725, // ID
18,1390, // <type>
21,1327, // `int
22,9, // `boolean
64,419, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,843, // letter128
82,1437, // {199..218 231..250}
83,1437, // {193..198 225..230}
95,540, // "#"
  }
,
{ // state 265
0x80000000|1, // match move
0x80000000|654, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 266
0x80000000|469, // match move
0x80000000|1134, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 267
0x80000000|469, // match move
0x80000000|1135, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 268
0x80000000|1533, // match move
0x80000000|1072, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 269
7,725, // ID
18,1455, // <type>
21,1327, // `int
22,9, // `boolean
64,419, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,843, // letter128
82,1437, // {199..218 231..250}
83,1437, // {193..198 225..230}
95,540, // "#"
  }
,
{ // state 270
94,120, // " "
111,700, // {10}
120,1434, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 271
94,734, // " "
111,93, // {10}
120,1057, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 272
72,982, // "o"
  }
,
{ // state 273
94,707, // " "
111,650, // {10}
120,973, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 274
94,387, // " "
111,281, // {10}
120,1419, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 275
94,705, // " "
111,649, // {10}
120,1018, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 276
24,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 277
24,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 278
0x80000000|247, // match move
0x80000000|687, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 279
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 280
0x80000000|469, // match move
0x80000000|1112, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 281
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 283
24,MIN_REDUCTION+81, // `[
90,MIN_REDUCTION+81, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 284
0x80000000|1204, // match move
0x80000000|1146, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 285
70,204, // "i"
75,35, // "b"
  }
,
{ // state 286
0x80000000|246, // match move
0x80000000|688, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 287
2,163, // ws*
24,MIN_REDUCTION+78, // `[
90,MIN_REDUCTION+78, // "["
94,1014, // " "
111,1570, // {10}
120,1250, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 288
24,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 289
70,211, // "i"
75,48, // "b"
  }
,
{ // state 290
0x80000000|1, // match move
0x80000000|625, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 291
0x80000000|469, // match move
0x80000000|1249, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 292
0x80000000|1545, // match move
0x80000000|994, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 293
94,722, // " "
111,665, // {10}
120,992, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 294
72,1009, // "o"
  }
,
{ // state 295
76,647, // "e"
  }
,
{ // state 296
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 297
94,722, // " "
111,665, // {10}
120,992, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 298
24,MIN_REDUCTION+140, // `[
90,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 299
2,805, // ws*
94,160, // " "
111,1446, // {10}
120,828, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 300
24,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 301
24,MIN_REDUCTION+139, // `[
90,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 302
0x80000000|469, // match move
0x80000000|556, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 303
7,725, // ID
18,1443, // <type>
21,1327, // `int
22,9, // `boolean
64,419, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,843, // letter128
82,1437, // {199..218 231..250}
83,1437, // {193..198 225..230}
95,540, // "#"
  }
,
{ // state 304
133,MIN_REDUCTION+0, // $
  }
,
{ // state 305
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1573, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1586, // digit128
88,1319, // {176..185}
108,693, // "_"
118,463, // {223}
121,125, // idChar*
122,1313, // $$0
129,927, // idChar
130,951, // idChar128
  }
,
{ // state 306
0x80000000|524, // match move
0x80000000|101, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 307
94,99, // " "
111,676, // {10}
120,1458, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 308
0x80000000|523, // match move
0x80000000|156, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 309
24,MIN_REDUCTION+66, // `[
90,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 310
2,413, // ws*
  }
,
{ // state 311
0x80000000|1, // match move
0x80000000|872, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 312
2,416, // ws*
  }
,
{ // state 313
66,1258, // "p"
  }
,
{ // state 314
2,1151, // ws*
  }
,
{ // state 315
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1568, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1583, // digit128
88,1318, // {176..185}
108,693, // "_"
118,461, // {223}
121,126, // idChar*
122,1289, // $$0
129,927, // idChar
130,949, // idChar128
  }
,
{ // state 316
2,1167, // ws*
  }
,
{ // state 317
2,1600, // ws*
24,MIN_REDUCTION+124, // `[
90,MIN_REDUCTION+124, // "["
94,1014, // " "
111,1570, // {10}
120,1250, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 318
24,MIN_REDUCTION+183, // `[
90,MIN_REDUCTION+183, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 319
2,262, // ws*
  }
,
{ // state 320
24,MIN_REDUCTION+183, // `[
90,MIN_REDUCTION+183, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 321
24,MIN_REDUCTION+185, // `[
90,MIN_REDUCTION+185, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 322
94,707, // " "
111,650, // {10}
120,973, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 323
15,MIN_REDUCTION+14, // `(
105,MIN_REDUCTION+14, // "("
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 324
94,705, // " "
111,649, // {10}
120,1018, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 326
2,444, // ws*
  }
,
{ // state 327
94,84, // " "
111,714, // {10}
120,1428, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 328
0x80000000|1, // match move
0x80000000|1073, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 329
2,1101, // ws*
  }
,
{ // state 330
5,898, // <class decl>
6,1353, // `class
95,130, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 331
2,239, // ws*
  }
,
{ // state 332
69,887, // "f"
70,1212, // "i"
73,295, // "r"
75,1150, // "b"
79,1084, // "n"
80,591, // "t"
  }
,
{ // state 333
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1559, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1598, // digit128
88,1120, // {176..185}
108,693, // "_"
118,450, // {223}
121,90, // idChar*
122,1279, // $$0
129,927, // idChar
130,926, // idChar128
  }
,
{ // state 334
0x80000000|513, // match move
0x80000000|119, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 335
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 336
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 337
2,1222, // ws*
  }
,
{ // state 338
0x80000000|1, // match move
0x80000000|97, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 339
2,218, // ws*
  }
,
{ // state 340
24,MIN_REDUCTION+183, // `[
90,MIN_REDUCTION+183, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 341
2,217, // ws*
  }
,
{ // state 342
69,1042, // "f"
79,1376, // "n"
80,695, // "t"
  }
,
{ // state 343
24,MIN_REDUCTION+185, // `[
90,MIN_REDUCTION+185, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 344
0x80000000|1571, // match move
0x80000000|1036, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 345
0x80000000|866, // match move
0x80000000|802, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 346
24,MIN_REDUCTION+185, // `[
90,MIN_REDUCTION+185, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 347
0x80000000|1569, // match move
0x80000000|1039, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 348
0x80000000|864, // match move
0x80000000|808, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 349
0x80000000|1, // match move
0x80000000|94, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 350
94,387, // " "
111,281, // {10}
120,1419, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 351
2,163, // ws*
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 353
0x80000000|759, // match move
0x80000000|1486, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 354
80,934, // "t"
  }
,
{ // state 355
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 357
0x80000000|760, // match move
0x80000000|1368, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 358
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 359
0x80000000|1, // match move
0x80000000|546, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 360
7,877, // ID
43,360, // `+
45,732, // `-
51,412, // <exp1>
53,793, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
106,1051, // "+"
110,685, // "@"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 361
0x80000000|1, // match move
0x80000000|1401, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 362
7,877, // ID
15,253, // `(
43,360, // `+
44,704, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 363
0x80000000|1048, // match move
0x80000000|449, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 364
0x80000000|1, // match move
0x80000000|560, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 365
7,877, // ID
15,253, // `(
20,1325, // <exp>
32,1284, // <exp8>
34,1478, // <exp7>
36,95, // <exp6>
38,1506, // <exp5>
40,893, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 366
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 368
7,877, // ID
15,253, // `(
20,1328, // <exp>
32,1284, // <exp8>
34,1478, // <exp7>
36,95, // <exp6>
38,1506, // <exp5>
40,893, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 369
7,869, // ID
43,369, // `+
45,747, // `-
51,542, // <exp1>
53,804, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
106,1051, // "+"
110,713, // "@"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 370
0x80000000|552, // match move
0x80000000|950, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 371
24,MIN_REDUCTION+160, // `[
90,MIN_REDUCTION+160, // "["
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 372
0x80000000|1, // match move
0x80000000|1412, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 373
24,MIN_REDUCTION+66, // `[
90,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 374
24,MIN_REDUCTION+53, // `[
55,65, // <empty bracket pair>*
90,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 375
7,869, // ID
15,231, // `(
43,369, // `+
44,756, // <exp3>
45,747, // `-
47,1335, // <exp2>
50,1121, // `!
51,542, // <exp1>
52,188, // <cast exp>
53,114, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
105,1000, // "("
106,1051, // "+"
110,713, // "@"
113,41, // "!"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 376
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 377
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 378
24,MIN_REDUCTION+53, // `[
55,66, // <empty bracket pair>*
90,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 379
7,920, // ID
43,379, // `+
45,748, // `-
51,541, // <exp1>
53,1188, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
106,1051, // "+"
110,710, // "@"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 380
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 381
7,920, // ID
15,222, // `(
43,379, // `+
44,757, // <exp3>
45,748, // `-
47,1334, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 382
134,MIN_REDUCTION+15, // $NT
  }
,
{ // state 383
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 384
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 385
0x80000000|726, // match move
0x80000000|1347, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 386
0x80000000|1, // match move
0x80000000|528, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 387
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 388
7,869, // ID
15,231, // `(
43,369, // `+
45,747, // `-
47,6, // <exp2>
50,1121, // `!
51,542, // <exp1>
52,188, // <cast exp>
53,114, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
105,1000, // "("
106,1051, // "+"
110,713, // "@"
113,41, // "!"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 389
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 390
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,520, // letter128
82,694, // {199..218 231..250}
83,694, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,383, // digit128
88,845, // {176..185}
108,693, // "_"
118,590, // {223}
122,508, // $$0
129,721, // idChar
130,1127, // idChar128
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 391
94,49, // " "
111,728, // {10}
120,1420, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 392
0x80000000|1, // match move
0x80000000|1424, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 393
0x80000000|1, // match move
0x80000000|1423, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 394
7,920, // ID
15,222, // `(
43,379, // `+
45,748, // `-
47,7, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 395
24,MIN_REDUCTION+66, // `[
90,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 396
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 397
0x80000000|1046, // match move
0x80000000|448, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 398
7,946, // ID
15,181, // `(
43,465, // `+
45,616, // `-
47,852, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 399
24,MIN_REDUCTION+143, // `[
90,MIN_REDUCTION+143, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 400
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 401
7,877, // ID
15,253, // `(
20,1294, // <exp>
32,1284, // <exp8>
34,1478, // <exp7>
36,95, // <exp6>
38,1506, // <exp5>
40,893, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 402
0x80000000|1, // match move
0x80000000|883, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 403
0x80000000|1, // match move
0x80000000|888, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 404
24,MIN_REDUCTION+143, // `[
90,MIN_REDUCTION+143, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 405
7,877, // ID
15,253, // `(
43,360, // `+
45,732, // `-
47,15, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 406
24,MIN_REDUCTION+66, // `[
90,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 407
24,MIN_REDUCTION+66, // `[
90,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 408
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1585, // ID
62, // `{
-1, // <decl in class>*
-1, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
231, // `(
-1, // `)
224, // <stmt>*
1209, // <type>
671, // `return
10, // <exp>
744, // `int
1470, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
279, // <stmt>
1367, // <assign>
223, // `;
1372, // `break
475, // <local var decl>
-1, // `=
1267, // <exp8>
-1, // `||
1537, // <exp7>
-1, // `&&
1501, // <exp6>
-1, // `==
1468, // <exp5>
-1, // `<
957, // <exp4>
-1, // `>
-1, // `instanceof
369, // `+
1343, // <exp3>
747, // `-
-1, // `*
1335, // <exp2>
-1, // `/
-1, // `%
1121, // `!
542, // <exp1>
188, // <cast exp>
114, // <unary exp>
269, // `new
-1, // <empty bracket pair>*
490, // INTLIT
458, // CHARLIT
1519, // STRINGLIT
199, // `true
568, // `false
1068, // `this
1193, // `null
-1, // `.
1433, // letter
428, // "a"
428, // "p"
428, // "v"
428, // "c"
428, // "f"
428, // "i"
428, // "l"
428, // "o"
428, // "r"
428, // "u"
428, // "b"
428, // "e"
428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
428, // "h"
428, // "n"
428, // "t"
446, // letter128
197, // {199..218 231..250}
197, // {193..198 225..230}
-1, // digit
708, // {"1".."9"}
213, // "0"
306, // digit128
1319, // {176..185}
-1, // any
-1, // "["
1149, // "-"
-1, // "<"
-1, // "|"
-1, // " "
332, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
474, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
425, // "{"
-1, // "%"
1000, // "("
1051, // "+"
-1, // "."
-1, // "_"
-1, // "="
713, // "@"
-1, // {10}
-1, // "}"
41, // "!"
1473, // "'"
1348, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 409
2,270, // ws*
94,120, // " "
111,700, // {10}
120,1210, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 410
24,MIN_REDUCTION+53, // `[
55,37, // <empty bracket pair>*
90,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 411
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 412
0x80000000|1, // match move
0x80000000|658, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 413
0x80000000|1, // match move
0x80000000|320, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 414
7,877, // ID
15,253, // `(
43,360, // `+
45,732, // `-
47,838, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 415
24,MIN_REDUCTION+81, // `[
90,MIN_REDUCTION+81, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 416
0x80000000|1, // match move
0x80000000|318, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 417
0x80000000|1, // match move
0x80000000|404, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 418
0x80000000|336, // match move
0x80000000|664, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 419
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1603, // letter128
82,1437, // {199..218 231..250}
83,1437, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,243, // digit128
88,11, // {176..185}
108,693, // "_"
118,682, // {223}
121,124, // idChar*
122,209, // $$0
129,927, // idChar
130,498, // idChar128
  }
,
{ // state 420
0x80000000|1, // match move
0x80000000|399, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 421
0x80000000|1, // match move
0x80000000|1381, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 422
2,919, // ws*
24,MIN_REDUCTION+124, // `[
90,MIN_REDUCTION+124, // "["
94,1277, // " "
111,582, // {10}
120,733, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 423
24,MIN_REDUCTION+81, // `[
90,MIN_REDUCTION+81, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 424
7,946, // ID
15,181, // `(
43,465, // `+
45,616, // `-
47,24, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 425
2,1522, // ws*
94,1269, // " "
111,1129, // {10}
120,257, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 426
0x80000000|1176, // match move
0x80000000|495, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 427
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 428
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 429
7,869, // ID
15,231, // `(
43,369, // `+
45,747, // `-
47,1117, // <exp2>
50,1121, // `!
51,542, // <exp1>
52,188, // <cast exp>
53,114, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
105,1000, // "("
106,1051, // "+"
110,713, // "@"
113,41, // "!"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 430
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 431
94,1549, // " "
111,841, // {10}
120,953, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 432
7,920, // ID
15,222, // `(
43,379, // `+
45,748, // `-
47,1122, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 433
7,877, // ID
15,253, // `(
20,1362, // <exp>
32,1284, // <exp8>
34,1478, // <exp7>
36,95, // <exp6>
38,1506, // <exp5>
40,893, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 434
0x80000000|1, // match move
0x80000000|1415, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 435
94,1402, // " "
111,842, // {10}
120,862, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 436
84,1049, // digit
85,610, // {"1".."9"}
86,610, // "0"
87,182, // digit128
88,1120, // {176..185}
123,53, // digit*
124,618, // $$1
  }
,
{ // state 437
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 438
2,471, // ws*
24,MIN_REDUCTION+184, // `[
90,MIN_REDUCTION+184, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 439
24,MIN_REDUCTION+64, // `[
90,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 440
24,MIN_REDUCTION+53, // `[
55,284, // <empty bracket pair>*
90,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 442
24,MIN_REDUCTION+77, // `[
90,MIN_REDUCTION+77, // "["
94,1014, // " "
111,1570, // {10}
120,689, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 443
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 444
0x80000000|1, // match move
0x80000000|340, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 445
43,555, // `+
45,381, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 446
0x80000000|1496, // match move
0x80000000|1429, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 447
43,533, // `+
45,375, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 448
2,940, // ws*
24,MIN_REDUCTION+124, // `[
90,MIN_REDUCTION+124, // "["
94,1283, // " "
111,603, // {10}
120,724, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 449
2,945, // ws*
24,MIN_REDUCTION+124, // `[
90,MIN_REDUCTION+124, // "["
94,1282, // " "
111,599, // {10}
120,723, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 450
0x80000000|552, // match move
0x80000000|961, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 451
24,MIN_REDUCTION+160, // `[
90,MIN_REDUCTION+160, // "["
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 452
0x80000000|1029, // match move
0x80000000|422, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 453
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 454
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 455
0x80000000|1, // match move
0x80000000|1391, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 456
94,999, // " "
111,376, // {10}
120,1113, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 457
65,965, // "a"
66,965, // "p"
67,965, // "v"
68,965, // "c"
69,965, // "f"
70,965, // "i"
71,965, // "l"
72,965, // "o"
73,965, // "r"
74,965, // "u"
75,965, // "b"
76,965, // "e"
77,965, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,965, // "h"
79,965, // "n"
80,965, // "t"
82,1601, // {199..218 231..250}
83,1601, // {193..198 225..230}
85,965, // {"1".."9"}
86,965, // "0"
88,1601, // {176..185}
89,884, // any
90,965, // "["
91,965, // "-"
92,965, // "<"
93,965, // "|"
94,965, // " "
95,965, // "#"
96,965, // "&"
97,965, // ")"
98,965, // "]"
99,965, // "/"
100,965, // ";"
101,965, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,965, // ">"
103,965, // "{"
104,965, // "%"
105,965, // "("
106,965, // "+"
107,965, // "."
108,965, // "_"
109,965, // "="
110,965, // "@"
111,965, // {10}
112,965, // "}"
113,965, // "!"
114,965, // "'"
115,965, // '"'
116,965, // "*"
117,937, // any128
118,1601, // {223}
119,1601, // {128..175 186..192 219..222 224 251..255}
128,170, // $$3
  }
,
{ // state 458
0x80000000|1, // match move
0x80000000|1393, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 459
2,444, // ws*
24,MIN_REDUCTION+184, // `[
90,MIN_REDUCTION+184, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 460
84,1049, // digit
85,610, // {"1".."9"}
86,610, // "0"
87,208, // digit128
88,1094, // {176..185}
123,19, // digit*
124,657, // $$1
  }
,
{ // state 461
0x80000000|552, // match move
0x80000000|923, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 462
24,MIN_REDUCTION+160, // `[
90,MIN_REDUCTION+160, // "["
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 463
0x80000000|552, // match move
0x80000000|924, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 464
24,MIN_REDUCTION+160, // `[
90,MIN_REDUCTION+160, // "["
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 465
7,946, // ID
43,465, // `+
45,616, // `-
51,364, // <exp1>
53,779, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
106,1051, // "+"
110,663, // "@"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 466
65,965, // "a"
66,965, // "p"
67,965, // "v"
68,965, // "c"
69,965, // "f"
70,965, // "i"
71,965, // "l"
72,965, // "o"
73,965, // "r"
74,965, // "u"
75,965, // "b"
76,965, // "e"
77,965, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,965, // "h"
79,965, // "n"
80,965, // "t"
82,1604, // {199..218 231..250}
83,1604, // {193..198 225..230}
85,965, // {"1".."9"}
86,965, // "0"
88,1604, // {176..185}
89,884, // any
90,965, // "["
91,965, // "-"
92,965, // "<"
93,965, // "|"
94,965, // " "
95,965, // "#"
96,965, // "&"
97,965, // ")"
98,965, // "]"
99,965, // "/"
100,965, // ";"
101,965, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,965, // ">"
103,965, // "{"
104,965, // "%"
105,965, // "("
106,965, // "+"
107,965, // "."
108,965, // "_"
109,965, // "="
110,965, // "@"
111,965, // {10}
112,965, // "}"
113,965, // "!"
114,965, // "'"
115,965, // '"'
116,965, // "*"
117,941, // any128
118,1604, // {223}
119,1604, // {128..175 186..192 219..222 224 251..255}
128,173, // $$3
  }
,
{ // state 467
7,946, // ID
15,181, // `(
43,465, // `+
44,655, // <exp3>
45,616, // `-
47,1271, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 468
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 469
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 470
15,142, // `(
105,749, // "("
  }
,
{ // state 471
0x80000000|1, // match move
0x80000000|179, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 472
24,MIN_REDUCTION+56, // `[
90,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 473
65,965, // "a"
66,965, // "p"
67,965, // "v"
68,965, // "c"
69,965, // "f"
70,965, // "i"
71,965, // "l"
72,965, // "o"
73,965, // "r"
74,965, // "u"
75,965, // "b"
76,965, // "e"
77,965, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,965, // "h"
79,965, // "n"
80,965, // "t"
82,1515, // {199..218 231..250}
83,1515, // {193..198 225..230}
85,965, // {"1".."9"}
86,965, // "0"
88,1515, // {176..185}
89,884, // any
90,965, // "["
91,965, // "-"
92,965, // "<"
93,965, // "|"
94,965, // " "
95,965, // "#"
96,965, // "&"
97,965, // ")"
98,965, // "]"
99,965, // "/"
100,965, // ";"
101,965, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,965, // ">"
103,965, // "{"
104,965, // "%"
105,965, // "("
106,965, // "+"
107,965, // "."
108,965, // "_"
109,965, // "="
110,965, // "@"
111,965, // {10}
112,965, // "}"
113,965, // "!"
114,965, // "'"
115,965, // '"'
116,965, // "*"
117,959, // any128
118,1515, // {223}
119,1515, // {128..175 186..192 219..222 224 251..255}
128,183, // $$3
  }
,
{ // state 474
2,504, // ws*
94,160, // " "
111,1446, // {10}
120,828, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 475
28,1010, // `;
100,474, // ";"
  }
,
{ // state 476
0x80000000|172, // match move
0x80000000|874, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 477
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 478
7,920, // ID
15,222, // `(
51,1309, // <exp1>
52,480, // <cast exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
95,1403, // "#"
105,1000, // "("
110,710, // "@"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 479
0x80000000|172, // match move
0x80000000|876, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 480
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 481
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 482
3,1596, // <program>
4,330, // <class decl>+
5,1460, // <class decl>
6,1353, // `class
94,441, // " "
95,130, // "#"
111,325, // {10}
120,141, // ws
  }
,
{ // state 483
24,MIN_REDUCTION+56, // `[
90,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 484
7,869, // ID
15,231, // `(
51,1306, // <exp1>
52,477, // <cast exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
95,1406, // "#"
105,1000, // "("
110,713, // "@"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 485
65,965, // "a"
66,965, // "p"
67,965, // "v"
68,965, // "c"
69,965, // "f"
70,965, // "i"
71,965, // "l"
72,965, // "o"
73,965, // "r"
74,965, // "u"
75,965, // "b"
76,965, // "e"
77,965, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,965, // "h"
79,965, // "n"
80,965, // "t"
82,1528, // {199..218 231..250}
83,1528, // {193..198 225..230}
85,965, // {"1".."9"}
86,965, // "0"
88,1528, // {176..185}
89,884, // any
90,965, // "["
91,965, // "-"
92,965, // "<"
93,965, // "|"
94,965, // " "
95,965, // "#"
96,965, // "&"
97,965, // ")"
98,965, // "]"
99,965, // "/"
100,965, // ";"
101,965, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,965, // ">"
103,965, // "{"
104,965, // "%"
105,965, // "("
106,965, // "+"
107,965, // "."
108,965, // "_"
109,965, // "="
110,965, // "@"
111,965, // {10}
112,965, // "}"
113,965, // "!"
114,965, // "'"
115,965, // '"'
116,965, // "*"
117,882, // any128
118,1528, // {223}
119,1528, // {128..175 186..192 219..222 224 251..255}
128,193, // $$3
  }
,
{ // state 486
2,416, // ws*
24,MIN_REDUCTION+184, // `[
90,MIN_REDUCTION+184, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 487
24,MIN_REDUCTION+140, // `[
90,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 488
2,413, // ws*
24,MIN_REDUCTION+184, // `[
90,MIN_REDUCTION+184, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 489
0x80000000|1, // match move
0x80000000|798, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 490
0x80000000|1, // match move
0x80000000|800, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 491
0x80000000|172, // match move
0x80000000|913, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 492
2,731, // ws*
94,715, // " "
111,916, // {10}
120,776, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 493
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 494
24,MIN_REDUCTION+140, // `[
90,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 495
2,891, // ws*
24,MIN_REDUCTION+124, // `[
90,MIN_REDUCTION+124, // "["
94,1305, // " "
111,567, // {10}
120,588, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 496
24,MIN_REDUCTION+156, // `[
90,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 497
0x80000000|1, // match move
0x80000000|1213, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 498
0x80000000|27, // match move
0x80000000|1580, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 499
43,991, // `+
45,362, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 500
7,877, // ID
15,253, // `(
51,1342, // <exp1>
52,549, // <cast exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
95,248, // "#"
105,1000, // "("
110,685, // "@"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 501
24,MIN_REDUCTION+140, // `[
90,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 502
24,MIN_REDUCTION+140, // `[
90,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 503
24,MIN_REDUCTION+156, // `[
90,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 504
94,160, // " "
111,1446, // {10}
120,781, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 505
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1585, // ID
640, // `{
-1, // <decl in class>*
854, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
231, // `(
-1, // `)
-1, // <stmt>*
1209, // <type>
-1, // `return
10, // <exp>
744, // `int
1470, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1316, // <stmt>
517, // <assign>
1041, // `;
766, // `break
1001, // <local var decl>
-1, // `=
1267, // <exp8>
-1, // `||
1537, // <exp7>
-1, // `&&
1501, // <exp6>
-1, // `==
1468, // <exp5>
-1, // `<
957, // <exp4>
-1, // `>
-1, // `instanceof
369, // `+
1343, // <exp3>
747, // `-
-1, // `*
1335, // <exp2>
-1, // `/
-1, // `%
1121, // `!
542, // <exp1>
188, // <cast exp>
114, // <unary exp>
269, // `new
-1, // <empty bracket pair>*
490, // INTLIT
458, // CHARLIT
1519, // STRINGLIT
199, // `true
568, // `false
1068, // `this
1193, // `null
-1, // `.
1433, // letter
428, // "a"
428, // "p"
428, // "v"
428, // "c"
428, // "f"
428, // "i"
428, // "l"
428, // "o"
428, // "r"
428, // "u"
428, // "b"
428, // "e"
428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
428, // "h"
428, // "n"
428, // "t"
446, // letter128
197, // {199..218 231..250}
197, // {193..198 225..230}
-1, // digit
708, // {"1".."9"}
213, // "0"
306, // digit128
1319, // {176..185}
-1, // any
-1, // "["
1149, // "-"
-1, // "<"
-1, // "|"
-1, // " "
575, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
506, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
425, // "{"
-1, // "%"
1000, // "("
1051, // "+"
-1, // "."
-1, // "_"
-1, // "="
713, // "@"
-1, // {10}
1005, // "}"
41, // "!"
1473, // "'"
1348, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 506
2,799, // ws*
94,548, // " "
111,91, // {10}
120,1330, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 507
0x80000000|1, // match move
0x80000000|1196, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 508
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 509
94,64, // " "
111,686, // {10}
120,1447, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 510
94,993, // " "
111,380, // {10}
120,1161, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 511
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 512
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 513
2,386, // ws*
  }
,
{ // state 514
0x80000000|737, // match move
0x80000000|1407, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 515
43,972, // `+
45,467, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 516
94,977, // " "
111,366, // {10}
120,1092, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 517
28,908, // `;
100,506, // ";"
  }
,
{ // state 518
0x80000000|326, // match move
0x80000000|459, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 519
0x80000000|1, // match move
0x80000000|896, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 520
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 521
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 522
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 523
2,417, // ws*
  }
,
{ // state 524
2,420, // ws*
  }
,
{ // state 525
0x80000000|817, // match move
0x80000000|323, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 526
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 527
2,1363, // ws*
94,675, // " "
111,569, // {10}
120,1266, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 528
24,MIN_REDUCTION+143, // `[
90,MIN_REDUCTION+143, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 529
24,MIN_REDUCTION+147, // `[
90,MIN_REDUCTION+147, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 530
0x80000000|1081, // match move
0x80000000|410, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 531
0x80000000|735, // match move
0x80000000|1405, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 532
2,1203, // ws*
  }
,
{ // state 533
7,869, // ID
15,231, // `(
43,369, // `+
44,986, // <exp3>
45,747, // `-
47,1335, // <exp2>
50,1121, // `!
51,542, // <exp1>
52,188, // <cast exp>
53,114, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
105,1000, // "("
106,1051, // "+"
110,713, // "@"
113,41, // "!"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 534
24,MIN_REDUCTION+66, // `[
90,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 535
24,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 536
0x80000000|194, // match move
0x80000000|438, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 537
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 538
94,1007, // " "
111,22, // {10}
120,111, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 539
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 540
70,192, // "i"
75,161, // "b"
  }
,
{ // state 541
0x80000000|1, // match move
0x80000000|692, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 542
0x80000000|1, // match move
0x80000000|696, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 543
2,1236, // ws*
  }
,
{ // state 544
2,359, // ws*
  }
,
{ // state 545
24,MIN_REDUCTION+56, // `[
90,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 546
24,MIN_REDUCTION+143, // `[
90,MIN_REDUCTION+143, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 547
24,MIN_REDUCTION+147, // `[
90,MIN_REDUCTION+147, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 548
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 549
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 550
0x80000000|1064, // match move
0x80000000|440, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 551
24,MIN_REDUCTION+56, // `[
90,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 552
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 553
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 554
15,MIN_REDUCTION+12, // `(
105,MIN_REDUCTION+12, // "("
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 555
7,920, // ID
15,222, // `(
43,379, // `+
44,988, // <exp3>
45,748, // `-
47,1334, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 556
24,MIN_REDUCTION+15, // `[
90,MIN_REDUCTION+15, // "["
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 557
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 558
2,1587, // ws*
  }
,
{ // state 559
24,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 560
24,195, // `[
63,662, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 561
2,1582, // ws*
  }
,
{ // state 562
0x80000000|1163, // match move
0x80000000|1492, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 563
0x80000000|314, // match move
0x80000000|155, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 564
24,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 565
2,914, // ws*
94,661, // " "
111,38, // {10}
120,1566, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 566
0x80000000|1, // match move
0x80000000|258, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 567
0x80000000|1426, // match move
0x80000000|896, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 568
0x80000000|1, // match move
0x80000000|261, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 569
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 570
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 571
16,500, // `)
23,1130, // <empty bracket pair>
24,765, // `[
90,168, // "["
97,1364, // ")"
  }
,
{ // state 572
23,1174, // <empty bracket pair>
24,1552, // `[
90,168, // "["
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 573
72,492, // "o"
  }
,
{ // state 574
0x80000000|316, // match move
0x80000000|153, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 575
69,887, // "f"
70,1212, // "i"
75,1150, // "b"
79,1084, // "n"
80,591, // "t"
  }
,
{ // state 576
24,MIN_REDUCTION+83, // `[
90,MIN_REDUCTION+83, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 577
24,MIN_REDUCTION+83, // `[
90,MIN_REDUCTION+83, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 578
24,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 579
93,409, // "|"
96,752, // "&"
  }
,
{ // state 580
94,1007, // " "
111,22, // {10}
120,111, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 581
23,1160, // <empty bracket pair>
24,1532, // `[
90,168, // "["
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 582
0x80000000|1426, // match move
0x80000000|886, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 583
0x80000000|1, // match move
0x80000000|250, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 584
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 585
2,40, // ws*
94,661, // " "
111,38, // {10}
120,1566, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 587
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 588
0x80000000|1297, // match move
0x80000000|1588, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 589
2,21, // ws*
  }
,
{ // state 590
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 591
73,278, // "r"
78,563, // "h"
  }
,
{ // state 592
24,MIN_REDUCTION+158, // `[
90,MIN_REDUCTION+158, // "["
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 593
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1526, // letter128
82,443, // {199..218 231..250}
83,443, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1544, // digit128
88,1141, // {176..185}
108,693, // "_"
118,1359, // {223}
122,1576, // $$0
129,721, // idChar
130,770, // idChar128
  }
,
{ // state 594
2,1281, // ws*
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 595
0x80000000|329, // match move
0x80000000|137, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 596
0x80000000|312, // match move
0x80000000|486, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 597
0x80000000|1, // match move
0x80000000|958, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 598
94,83, // " "
111,762, // {10}
120,1385, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 599
0x80000000|1426, // match move
0x80000000|873, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 600
0x80000000|310, // match move
0x80000000|488, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 601
0x80000000|1, // match move
0x80000000|238, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 602
16,478, // `)
23,1130, // <empty bracket pair>
24,765, // `[
90,168, // "["
97,1364, // ")"
  }
,
{ // state 603
0x80000000|1426, // match move
0x80000000|875, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 604
16,484, // `)
23,1130, // <empty bracket pair>
24,765, // `[
90,168, // "["
97,1364, // ")"
  }
,
{ // state 605
2,3, // ws*
  }
,
{ // state 606
7,920, // ID
15,222, // `(
20,526, // <exp>
32,1270, // <exp8>
34,1541, // <exp7>
36,1495, // <exp6>
38,131, // <exp5>
40,964, // <exp4>
43,379, // `+
44,1349, // <exp3>
45,748, // `-
47,1334, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 607
2,1564, // ws*
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 608
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1584, // letter128
82,454, // {199..218 231..250}
83,454, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1534, // digit128
88,1116, // {176..185}
108,693, // "_"
118,1409, // {223}
122,1562, // $$0
129,721, // idChar
130,952, // idChar128
  }
,
{ // state 609
0x80000000|1, // match move
0x80000000|956, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 610
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 611
24,MIN_REDUCTION+83, // `[
90,MIN_REDUCTION+83, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 612
73,286, // "r"
78,574, // "h"
  }
,
{ // state 613
0x80000000|1030, // match move
0x80000000|374, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 614
0x80000000|1035, // match move
0x80000000|378, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 615
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 616
7,946, // ID
43,465, // `+
45,616, // `-
51,364, // <exp1>
53,1225, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
106,1051, // "+"
110,663, // "@"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 617
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,1014, // " "
111,1570, // {10}
120,689, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 618
0x80000000|1, // match move
0x80000000|651, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 619
24,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 620
0x80000000|337, // match move
0x80000000|207, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 621
7,1360, // ID
14,80, // `void
18,867, // <type>
21,744, // `int
22,1470, // `boolean
64,1197, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,1275, // letter128
82,694, // {199..218 231..250}
83,694, // {193..198 225..230}
95,123, // "#"
  }
,
{ // state 622
25,382, // `]
98,730, // "]"
  }
,
{ // state 623
2,811, // ws*
15,MIN_REDUCTION+138, // `(
94,1014, // " "
105,MIN_REDUCTION+138, // "("
111,1570, // {10}
120,1250, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 624
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 625
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 626
0x80000000|1, // match move
0x80000000|666, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 627
24,MIN_REDUCTION+156, // `[
90,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 628
24,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 629
0x80000000|1, // match move
0x80000000|668, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 630
24,MIN_REDUCTION+156, // `[
90,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 631
94,661, // " "
111,38, // {10}
120,1432, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 632
7,402, // ID
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
  }
,
{ // state 633
24,MIN_REDUCTION+142, // `[
90,MIN_REDUCTION+142, // "["
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 634
23,1300, // <empty bracket pair>
24,1509, // `[
90,168, // "["
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 635
7,403, // ID
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
  }
,
{ // state 636
2,810, // ws*
24,MIN_REDUCTION+86, // `[
90,MIN_REDUCTION+86, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 637
2,1097, // ws*
94,83, // " "
111,762, // {10}
120,1110, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 638
15,47, // `(
24,433, // `[
90,1489, // "["
105,749, // "("
  }
,
{ // state 639
2,509, // ws*
94,64, // " "
111,686, // {10}
120,1156, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 640
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1585, // ID
640, // `{
-1, // <decl in class>*
1345, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
231, // `(
-1, // `)
505, // <stmt>*
1209, // <type>
-1, // `return
10, // <exp>
744, // `int
1470, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1228, // <stmt>
517, // <assign>
1041, // `;
766, // `break
1001, // <local var decl>
-1, // `=
1267, // <exp8>
-1, // `||
1537, // <exp7>
-1, // `&&
1501, // <exp6>
-1, // `==
1468, // <exp5>
-1, // `<
957, // <exp4>
-1, // `>
-1, // `instanceof
369, // `+
1343, // <exp3>
747, // `-
-1, // `*
1335, // <exp2>
-1, // `/
-1, // `%
1121, // `!
542, // <exp1>
188, // <cast exp>
114, // <unary exp>
269, // `new
-1, // <empty bracket pair>*
490, // INTLIT
458, // CHARLIT
1519, // STRINGLIT
199, // `true
568, // `false
1068, // `this
1193, // `null
-1, // `.
1433, // letter
428, // "a"
428, // "p"
428, // "v"
428, // "c"
428, // "f"
428, // "i"
428, // "l"
428, // "o"
428, // "r"
428, // "u"
428, // "b"
428, // "e"
428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
428, // "h"
428, // "n"
428, // "t"
446, // letter128
197, // {199..218 231..250}
197, // {193..198 225..230}
-1, // digit
708, // {"1".."9"}
213, // "0"
306, // digit128
1319, // {176..185}
-1, // any
-1, // "["
1149, // "-"
-1, // "<"
-1, // "|"
-1, // " "
575, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
506, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
425, // "{"
-1, // "%"
1000, // "("
1051, // "+"
-1, // "."
-1, // "_"
-1, // "="
713, // "@"
-1, // {10}
1005, // "}"
41, // "!"
1473, // "'"
1348, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 641
0x80000000|1163, // match move
0x80000000|1474, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 642
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 643
0x80000000|1163, // match move
0x80000000|1472, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 644
0x80000000|558, // match move
0x80000000|1261, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 645
24,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 646
7,311, // ID
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
  }
,
{ // state 647
2,1230, // ws*
94,1402, // " "
111,842, // {10}
120,1248, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 648
0x80000000|172, // match move
0x80000000|897, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 649
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 650
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 651
24,MIN_REDUCTION+142, // `[
90,MIN_REDUCTION+142, // "["
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 652
0x80000000|561, // match move
0x80000000|1259, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 653
2,290, // ws*
  }
,
{ // state 654
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 655
46,424, // `*
48,398, // `/
49,1045, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 656
16,1037, // `)
23,1130, // <empty bracket pair>
24,765, // `[
90,168, // "["
97,1364, // ")"
  }
,
{ // state 657
0x80000000|1, // match move
0x80000000|633, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 658
24,236, // `[
63,646, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 659
0x80000000|1163, // match move
0x80000000|1504, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 660
94,1016, // " "
111,411, // {10}
120,1159, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 661
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 662
7,328, // ID
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
  }
,
{ // state 663
115,1398, // '"'
  }
,
{ // state 664
24,MIN_REDUCTION+156, // `[
90,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 665
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 666
24,MIN_REDUCTION+142, // `[
90,MIN_REDUCTION+142, // "["
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 667
23,1136, // <empty bracket pair>
24,1525, // `[
90,168, // "["
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 668
24,MIN_REDUCTION+142, // `[
90,MIN_REDUCTION+142, // "["
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 669
2,265, // ws*
  }
,
{ // state 670
0x80000000|1, // match move
0x80000000|785, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 671
7,946, // ID
15,181, // `(
20,152, // <exp>
32,1307, // <exp8>
34,1497, // <exp7>
36,118, // <exp6>
38,1554, // <exp5>
40,879, // <exp4>
43,465, // `+
44,1255, // <exp3>
45,616, // `-
47,1271, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 672
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1585, // ID
640, // `{
-1, // <decl in class>*
511, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
231, // `(
-1, // `)
134, // <stmt>*
1209, // <type>
-1, // `return
10, // <exp>
744, // `int
1470, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1228, // <stmt>
517, // <assign>
1041, // `;
766, // `break
1001, // <local var decl>
-1, // `=
1267, // <exp8>
-1, // `||
1537, // <exp7>
-1, // `&&
1501, // <exp6>
-1, // `==
1468, // <exp5>
-1, // `<
957, // <exp4>
-1, // `>
-1, // `instanceof
369, // `+
1343, // <exp3>
747, // `-
-1, // `*
1335, // <exp2>
-1, // `/
-1, // `%
1121, // `!
542, // <exp1>
188, // <cast exp>
114, // <unary exp>
269, // `new
-1, // <empty bracket pair>*
490, // INTLIT
458, // CHARLIT
1519, // STRINGLIT
199, // `true
568, // `false
1068, // `this
1193, // `null
-1, // `.
1433, // letter
428, // "a"
428, // "p"
428, // "v"
428, // "c"
428, // "f"
428, // "i"
428, // "l"
428, // "o"
428, // "r"
428, // "u"
428, // "b"
428, // "e"
428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
428, // "h"
428, // "n"
428, // "t"
446, // letter128
197, // {199..218 231..250}
197, // {193..198 225..230}
-1, // digit
708, // {"1".."9"}
213, // "0"
306, // digit128
1319, // {176..185}
-1, // any
-1, // "["
1149, // "-"
-1, // "<"
-1, // "|"
-1, // " "
575, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
506, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
425, // "{"
-1, // "%"
1000, // "("
1051, // "+"
-1, // "."
-1, // "_"
-1, // "="
713, // "@"
-1, // {10}
1561, // "}"
41, // "!"
1473, // "'"
1348, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 673
0x80000000|605, // match move
0x80000000|1280, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 674
0x80000000|1, // match move
0x80000000|1588, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 675
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 676
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 677
15,59, // `(
24,401, // `[
90,1489, // "["
105,749, // "("
  }
,
{ // state 678
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 679
2,1450, // ws*
94,661, // " "
111,38, // {10}
120,1566, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 680
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 681
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 682
0x80000000|176, // match move
0x80000000|43, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 683
31,606, // `=
109,890, // "="
  }
,
{ // state 684
0x80000000|1, // match move
0x80000000|1100, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 685
115,1467, // '"'
  }
,
{ // state 686
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 687
2,769, // ws*
24,MIN_REDUCTION+86, // `[
90,MIN_REDUCTION+86, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 688
2,806, // ws*
24,MIN_REDUCTION+86, // `[
90,MIN_REDUCTION+86, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 689
0x80000000|233, // match move
0x80000000|13, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 690
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 691
0x80000000|1, // match move
0x80000000|860, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 692
24,226, // `[
63,635, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 693
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 694
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 695
73,56, // "r"
78,620, // "h"
  }
,
{ // state 696
24,227, // `[
63,632, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 697
0x80000000|589, // match move
0x80000000|1386, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 698
0x80000000|1, // match move
0x80000000|1557, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 699
0x80000000|1, // match move
0x80000000|1555, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 700
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 701
16,1529, // `)
97,1487, // ")"
  }
,
{ // state 702
16,1530, // `)
97,1491, // ")"
  }
,
{ // state 703
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 704
46,405, // `*
48,414, // `/
49,1026, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 705
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 706
84,1049, // digit
85,610, // {"1".."9"}
86,610, // "0"
87,345, // digit128
88,1318, // {176..185}
123,36, // digit*
124,629, // $$1
  }
,
{ // state 707
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 708
84,1049, // digit
85,610, // {"1".."9"}
86,610, // "0"
87,348, // digit128
88,1319, // {176..185}
123,34, // digit*
124,626, // $$1
  }
,
{ // state 709
24,MIN_REDUCTION+87, // `[
90,MIN_REDUCTION+87, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 710
115,1441, // '"'
  }
,
{ // state 711
0x80000000|1, // match move
0x80000000|1565, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 712
24,MIN_REDUCTION+87, // `[
90,MIN_REDUCTION+87, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 713
115,1445, // '"'
  }
,
{ // state 714
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 715
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 716
2,840, // ws*
24,MIN_REDUCTION+86, // `[
90,MIN_REDUCTION+86, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 717
15,702, // `(
24,368, // `[
90,1489, // "["
105,749, // "("
  }
,
{ // state 718
15,701, // `(
24,365, // `[
90,1489, // "["
105,749, // "("
  }
,
{ // state 719
0x80000000|1, // match move
0x80000000|830, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 720
2,1357, // ws*
94,1016, // " "
111,411, // {10}
120,1521, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 721
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 722
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 723
0x80000000|1297, // match move
0x80000000|1557, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 724
0x80000000|1297, // match move
0x80000000|1555, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 725
0x80000000|1251, // match move
0x80000000|1062, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 726
2,1502, // ws*
  }
,
{ // state 727
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 728
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 729
0x80000000|1, // match move
0x80000000|936, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 730
2,1456, // ws*
94,1400, // " "
111,1323, // {10}
120,758, // ws
134,MIN_REDUCTION+124, // $NT
  }
,
{ // state 731
94,715, // " "
111,916, // {10}
120,801, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 732
7,877, // ID
43,360, // `+
45,732, // `-
51,412, // <exp1>
53,1246, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
106,1051, // "+"
110,685, // "@"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 733
0x80000000|1297, // match move
0x80000000|1565, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 734
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 735
2,103, // ws*
  }
,
{ // state 736
2,1264, // ws*
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 737
2,102, // ws*
  }
,
{ // state 738
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1508, // letter128
82,430, // {199..218 231..250}
83,430, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1511, // digit128
88,1164, // {176..185}
108,693, // "_"
118,1354, // {223}
122,1597, // $$0
129,721, // idChar
130,795, // idChar128
  }
,
{ // state 739
24,MIN_REDUCTION+87, // `[
90,MIN_REDUCTION+87, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 740
2,1265, // ws*
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 741
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1512, // letter128
82,437, // {199..218 231..250}
83,437, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1510, // digit128
88,1162, // {176..185}
108,693, // "_"
118,1350, // {223}
122,1589, // $$0
129,721, // idChar
130,794, // idChar128
  }
,
{ // state 742
0x80000000|1, // match move
0x80000000|1187, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 743
24,MIN_REDUCTION+83, // `[
90,MIN_REDUCTION+83, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 744
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 745
0x80000000|1, // match move
0x80000000|834, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 746
0x80000000|1, // match move
0x80000000|1190, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 747
7,869, // ID
43,369, // `+
45,747, // `-
51,542, // <exp1>
53,1104, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
106,1051, // "+"
110,713, // "@"
114,1473, // "'"
115,1348, // '"'
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 748
7,920, // ID
43,379, // `+
45,748, // `-
51,541, // <exp1>
53,1105, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
106,1051, // "+"
110,710, // "@"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 749
2,1499, // ws*
94,975, // " "
111,367, // {10}
120,1575, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 750
73,78, // "r"
78,595, // "h"
  }
,
{ // state 751
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 752
2,327, // ws*
94,84, // " "
111,714, // {10}
120,1192, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 753
0x80000000|1, // match move
0x80000000|911, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 754
2,307, // ws*
94,99, // " "
111,676, // {10}
120,1180, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 755
0x80000000|587, // match move
0x80000000|298, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 756
46,388, // `*
48,429, // `/
49,1175, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 757
46,394, // `*
48,432, // `/
49,1177, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 758
134,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 759
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 760
2,1481, // ws*
  }
,
{ // state 761
24,MIN_REDUCTION+87, // `[
90,MIN_REDUCTION+87, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 762
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 763
0x80000000|1, // match move
0x80000000|1220, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 764
0x80000000|681, // match move
0x80000000|301, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 765
25,1090, // `]
98,190, // "]"
  }
,
{ // state 766
28,1301, // `;
100,506, // ";"
  }
,
{ // state 767
25,302, // `]
98,1031, // "]"
  }
,
{ // state 768
94,71, // " "
111,751, // {10}
120,1397, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 769
0x80000000|1, // match move
0x80000000|203, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 770
2,1285, // ws*
94,722, // " "
111,665, // {10}
120,837, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 771
7,877, // ID
15,253, // `(
40,1493, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 772
24,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 773
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,562, // " "
111,932, // {10}
120,905, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 774
24,195, // `[
63,662, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 775
24,MIN_REDUCTION+157, // `[
90,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 776
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 777
2,691, // ws*
  }
,
{ // state 778
24,MIN_REDUCTION+157, // `[
90,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 779
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 780
24,MIN_REDUCTION+179, // `[
90,MIN_REDUCTION+179, // "["
94,1114, // " "
111,966, // {10}
120,792, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 781
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 782
7,946, // ID
15,181, // `(
40,1483, // <exp4>
43,465, // `+
44,1255, // <exp3>
45,616, // `-
47,1271, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 783
24,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 784
24,MIN_REDUCTION+157, // `[
90,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 785
24,MIN_REDUCTION+181, // `[
90,MIN_REDUCTION+181, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 786
24,MIN_REDUCTION+157, // `[
90,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 787
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 788
2,670, // ws*
  }
,
{ // state 789
2,691, // ws*
24,MIN_REDUCTION+182, // `[
90,MIN_REDUCTION+182, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 790
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 791
2,998, // ws*
94,977, // " "
111,366, // {10}
120,1572, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 792
0x80000000|233, // match move
0x80000000|1298, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 793
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 794
2,1579, // ws*
94,705, // " "
111,649, // {10}
120,848, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 795
2,1577, // ws*
94,707, // " "
111,650, // {10}
120,850, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 796
0x80000000|1, // match move
0x80000000|1091, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 797
0x80000000|1, // match move
0x80000000|1111, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 798
24,MIN_REDUCTION+54, // `[
90,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 799
94,548, // " "
111,91, // {10}
120,1542, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 800
24,MIN_REDUCTION+54, // `[
90,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 801
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 802
2,745, // ws*
24,MIN_REDUCTION+182, // `[
90,MIN_REDUCTION+182, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 803
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 804
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 805
94,160, // " "
111,1446, // {10}
120,781, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 806
0x80000000|1, // match move
0x80000000|206, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 807
24,MIN_REDUCTION+70, // `[
90,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 808
2,719, // ws*
24,MIN_REDUCTION+182, // `[
90,MIN_REDUCTION+182, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 809
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 810
0x80000000|1, // match move
0x80000000|249, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 811
0x80000000|1083, // match move
0x80000000|1384, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 812
0x80000000|1, // match move
0x80000000|1216, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 813
0x80000000|1503, // match move
0x80000000|1291, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 814
0x80000000|1503, // match move
0x80000000|1288, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 815
93,409, // "|"
96,752, // "&"
109,754, // "="
  }
,
{ // state 816
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,643, // " "
111,954, // {10}
120,933, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 817
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 818
94,1500, // " "
111,1451, // {10}
120,60, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 819
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,641, // " "
111,948, // {10}
120,931, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 820
2,831, // ws*
94,71, // " "
111,751, // {10}
120,1132, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 821
24,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 822
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 823
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 824
2,1240, // ws*
94,734, // " "
111,93, // {10}
120,822, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 825
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 826
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 827
0x80000000|1503, // match move
0x80000000|1303, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 828
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 829
2,1600, // ws*
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 830
24,MIN_REDUCTION+181, // `[
90,MIN_REDUCTION+181, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 831
94,71, // " "
111,751, // {10}
120,1397, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 832
7,946, // ID
15,181, // `(
34,1138, // <exp7>
36,118, // <exp6>
38,1554, // <exp5>
40,879, // <exp4>
43,465, // `+
44,1255, // <exp3>
45,616, // `-
47,1271, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 833
0x80000000|1, // match move
0x80000000|639, // no-match move
// T-test match for "=":
109,
  }
,
{ // state 834
24,MIN_REDUCTION+181, // `[
90,MIN_REDUCTION+181, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 835
10,678, // `}
112,1561, // "}"
  }
,
{ // state 836
24,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 837
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 838
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 839
0x80000000|703, // match move
0x80000000|578, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 840
0x80000000|1, // match move
0x80000000|229, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 841
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 842
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 843
0x80000000|1351, // match move
0x80000000|623, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 844
0x80000000|1503, // match move
0x80000000|1276, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 845
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 846
7,877, // ID
15,253, // `(
34,1019, // <exp7>
36,95, // <exp6>
38,1506, // <exp5>
40,893, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 847
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,659, // " "
111,943, // {10}
120,918, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 848
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 849
24,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 850
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 851
24,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 852
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 853
0x80000000|703, // match move
0x80000000|645, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 854
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 855
7,869, // ID
15,231, // `(
40,1543, // <exp4>
43,369, // `+
44,1343, // <exp3>
45,747, // `-
47,1335, // <exp2>
50,1121, // `!
51,542, // <exp1>
52,188, // <cast exp>
53,114, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
105,1000, // "("
106,1051, // "+"
110,713, // "@"
113,41, // "!"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 856
0x80000000|1, // match move
0x80000000|1198, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 857
7,920, // ID
15,222, // `(
40,1553, // <exp4>
43,379, // `+
44,1349, // <exp3>
45,748, // `-
47,1334, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 858
24,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 859
7,920, // ID
15,222, // `(
34,1059, // <exp7>
36,1495, // <exp6>
38,131, // <exp5>
40,964, // <exp4>
43,379, // `+
44,1349, // <exp3>
45,748, // `-
47,1334, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 860
24,MIN_REDUCTION+181, // `[
90,MIN_REDUCTION+181, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 861
7,869, // ID
15,231, // `(
34,1055, // <exp7>
36,1501, // <exp6>
38,1468, // <exp5>
40,957, // <exp4>
43,369, // `+
44,1343, // <exp3>
45,747, // `-
47,1335, // <exp2>
50,1121, // `!
51,542, // <exp1>
52,188, // <cast exp>
53,114, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
105,1000, // "("
106,1051, // "+"
110,713, // "@"
113,41, // "!"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 862
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 863
24,MIN_REDUCTION+157, // `[
90,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 864
2,719, // ws*
  }
,
{ // state 865
24,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 866
2,745, // ws*
  }
,
{ // state 867
7,470, // ID
23,1449, // <empty bracket pair>
24,28, // `[
64,1462, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,1040, // letter128
82,557, // {199..218 231..250}
83,557, // {193..198 225..230}
90,168, // "["
  }
,
{ // state 868
2,670, // ws*
24,MIN_REDUCTION+182, // `[
90,MIN_REDUCTION+182, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 869
0x80000000|1, // match move
0x80000000|70, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 870
2,597, // ws*
24,MIN_REDUCTION+180, // `[
90,MIN_REDUCTION+180, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 871
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1584, // letter128
82,454, // {199..218 231..250}
83,454, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1534, // digit128
88,1116, // {176..185}
108,693, // "_"
118,1409, // {223}
121,608, // idChar*
122,150, // $$0
129,927, // idChar
130,952, // idChar128
  }
,
{ // state 872
24,MIN_REDUCTION+61, // `[
90,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 873
24,MIN_REDUCTION+70, // `[
90,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 874
24,MIN_REDUCTION+64, // `[
90,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 875
24,MIN_REDUCTION+70, // `[
90,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 876
24,MIN_REDUCTION+64, // `[
90,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 877
0x80000000|1, // match move
0x80000000|63, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 878
2,273, // ws*
94,707, // " "
111,650, // {10}
120,850, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 879
43,972, // `+
45,467, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 880
0x80000000|1, // match move
0x80000000|1207, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 881
0x80000000|703, // match move
0x80000000|559, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 882
0x80000000|319, // match move
0x80000000|1139, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 883
24,MIN_REDUCTION+61, // `[
90,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 884
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 885
0x80000000|703, // match move
0x80000000|564, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 886
24,MIN_REDUCTION+70, // `[
90,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 887
65,644, // "a"
  }
,
{ // state 888
24,MIN_REDUCTION+61, // `[
90,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 889
2,609, // ws*
24,MIN_REDUCTION+180, // `[
90,MIN_REDUCTION+180, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 890
2,177, // ws*
94,1402, // " "
111,842, // {10}
120,1248, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 891
0x80000000|823, // match move
0x80000000|989, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 892
24,226, // `[
63,635, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 893
43,991, // `+
45,362, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 894
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1526, // letter128
82,443, // {199..218 231..250}
83,443, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1544, // digit128
88,1141, // {176..185}
108,693, // "_"
118,1359, // {223}
121,593, // idChar*
122,157, // $$0
129,927, // idChar
130,770, // idChar128
  }
,
{ // state 895
0x80000000|1, // match move
0x80000000|1219, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 896
24,MIN_REDUCTION+70, // `[
90,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 897
24,MIN_REDUCTION+64, // `[
90,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 898
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 899
0x80000000|903, // match move
0x80000000|1471, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 900
0x80000000|1083, // match move
0x80000000|1317, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 901
7,920, // ID
15,222, // `(
20,727, // <exp>
32,1270, // <exp8>
34,1541, // <exp7>
36,1495, // <exp6>
38,131, // <exp5>
40,964, // <exp4>
43,379, // `+
44,1349, // <exp3>
45,748, // `-
47,1334, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 902
65,652, // "a"
  }
,
{ // state 903
2,753, // ws*
  }
,
{ // state 904
24,227, // `[
63,632, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 905
0x80000000|493, // match move
0x80000000|783, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 906
2,275, // ws*
94,705, // " "
111,649, // {10}
120,848, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 907
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 908
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 909
0x80000000|1, // match move
0x80000000|1241, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 910
0x80000000|1, // match move
0x80000000|33, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 911
24,MIN_REDUCTION+179, // `[
90,MIN_REDUCTION+179, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 912
0x80000000|1, // match move
0x80000000|1238, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 913
24,MIN_REDUCTION+64, // `[
90,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 914
94,661, // " "
111,38, // {10}
120,1432, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 915
2,1469, // ws*
94,1229, // " "
111,14, // {10}
120,260, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 916
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 917
0x80000000|1, // match move
0x80000000|32, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 918
0x80000000|493, // match move
0x80000000|772, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 919
0x80000000|823, // match move
0x80000000|1413, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 920
0x80000000|1, // match move
0x80000000|72, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 921
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,586, // letter128
82,553, // {199..218 231..250}
83,553, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,690, // digit128
88,1379, // {176..185}
108,693, // "_"
118,468, // {223}
122,335, // $$0
129,721, // idChar
130,1453, // idChar128
  }
,
{ // state 922
93,409, // "|"
  }
,
{ // state 923
24,MIN_REDUCTION+158, // `[
90,MIN_REDUCTION+158, // "["
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 924
24,MIN_REDUCTION+158, // `[
90,MIN_REDUCTION+158, // "["
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 925
0x80000000|1, // match move
0x80000000|1199, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 926
0x80000000|942, // match move
0x80000000|1490, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 927
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 928
2,609, // ws*
  }
,
{ // state 929
2,597, // ws*
  }
,
{ // state 930
94,83, // " "
111,762, // {10}
120,1385, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 931
0x80000000|493, // match move
0x80000000|865, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 932
0x80000000|427, // match move
0x80000000|1218, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 933
0x80000000|493, // match move
0x80000000|858, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 934
2,1302, // ws*
94,734, // " "
111,93, // {10}
120,822, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 935
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 936
24,MIN_REDUCTION+179, // `[
90,MIN_REDUCTION+179, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 937
0x80000000|341, // match move
0x80000000|1056, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 938
0x80000000|1, // match move
0x80000000|1185, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 939
9,127, // <decl in class>*
10,30, // `}
11,680, // <decl in class>
12,109, // <method decl>
13,621, // `public
95,313, // "#"
112,140, // "}"
  }
,
{ // state 940
0x80000000|823, // match move
0x80000000|1399, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 941
0x80000000|339, // match move
0x80000000|1053, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 942
2,729, // ws*
  }
,
{ // state 943
0x80000000|427, // match move
0x80000000|1234, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 944
0x80000000|1, // match move
0x80000000|57, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 945
0x80000000|823, // match move
0x80000000|1388, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 946
0x80000000|1, // match move
0x80000000|50, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 947
70,1208, // "i"
  }
,
{ // state 948
0x80000000|427, // match move
0x80000000|1254, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 949
0x80000000|928, // match move
0x80000000|889, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 950
24,MIN_REDUCTION+158, // `[
90,MIN_REDUCTION+158, // "["
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 951
0x80000000|929, // match move
0x80000000|870, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 952
2,1272, // ws*
94,734, // " "
111,93, // {10}
120,822, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 953
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 954
0x80000000|427, // match move
0x80000000|1253, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 955
2,297, // ws*
94,722, // " "
111,665, // {10}
120,837, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 956
24,MIN_REDUCTION+179, // `[
90,MIN_REDUCTION+179, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 957
43,533, // `+
45,375, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 958
24,MIN_REDUCTION+179, // `[
90,MIN_REDUCTION+179, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 959
0x80000000|331, // match move
0x80000000|1087, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 960
0x80000000|1, // match move
0x80000000|1147, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 961
24,MIN_REDUCTION+158, // `[
90,MIN_REDUCTION+158, // "["
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 962
0x80000000|1, // match move
0x80000000|1143, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 963
94,387, // " "
111,281, // {10}
120,1419, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 964
43,555, // `+
45,381, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 965
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 966
0x80000000|1426, // match move
0x80000000|113, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 967
2,1457, // ws*
15,MIN_REDUCTION+72, // `(
94,1014, // " "
105,MIN_REDUCTION+72, // "("
111,1570, // {10}
120,1250, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 968
0x80000000|1, // match move
0x80000000|79, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 969
2,18, // ws*
94,521, // " "
111,907, // {10}
120,1308, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 970
24,236, // `[
63,646, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 971
94,993, // " "
111,380, // {10}
120,1161, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 972
7,946, // ID
15,181, // `(
43,465, // `+
44,1106, // <exp3>
45,616, // `-
47,1271, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 973
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 974
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 975
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 976
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 977
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 978
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 979
24,MIN_REDUCTION+62, // `[
90,MIN_REDUCTION+62, // "["
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 980
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 981
0x80000000|1, // match move
0x80000000|1215, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 982
2,271, // ws*
94,734, // " "
111,93, // {10}
120,822, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 983
0x80000000|1, // match move
0x80000000|1214, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 984
24,MIN_REDUCTION+147, // `[
90,MIN_REDUCTION+147, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 985
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,29, // letter128
82,615, // {199..218 231..250}
83,615, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1605, // digit128
88,139, // {176..185}
108,693, // "_"
118,976, // {223}
122,132, // $$0
129,721, // idChar
130,1524, // idChar128
  }
,
{ // state 986
46,388, // `*
48,429, // `/
49,1175, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 987
2,1168, // ws*
  }
,
{ // state 988
46,394, // `*
48,432, // `/
49,1177, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 989
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,1305, // " "
111,567, // {10}
120,1226, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 990
2,1102, // ws*
  }
,
{ // state 991
7,877, // ID
15,253, // `(
43,360, // `+
44,1191, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 992
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 993
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 994
2,187, // ws*
24,MIN_REDUCTION+152, // `[
90,MIN_REDUCTION+152, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 995
2,684, // ws*
24,MIN_REDUCTION+138, // `[
90,MIN_REDUCTION+138, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 996
7,946, // ID
15,181, // `(
20,835, // <exp>
32,1307, // <exp8>
34,1497, // <exp7>
36,118, // <exp6>
38,1554, // <exp5>
40,879, // <exp4>
43,465, // `+
44,1255, // <exp3>
45,616, // `-
47,1271, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 997
24,MIN_REDUCTION+62, // `[
90,MIN_REDUCTION+62, // "["
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 998
94,977, // " "
111,366, // {10}
120,1092, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 999
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1000
2,1369, // ws*
94,642, // " "
111,352, // {10}
120,77, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1001
28,121, // `;
100,506, // ";"
  }
,
{ // state 1002
2,660, // ws*
94,1016, // " "
111,411, // {10}
120,1521, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1003
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1004
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1005
2,175, // ws*
94,548, // " "
111,91, // {10}
120,1330, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1006
23,827, // <empty bracket pair>
24,68, // `[
90,168, // "["
  }
,
{ // state 1007
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1008
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1009
2,293, // ws*
94,722, // " "
111,665, // {10}
120,837, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 1010
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1011
24,MIN_REDUCTION+147, // `[
90,MIN_REDUCTION+147, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1012
23,813, // <empty bracket pair>
24,82, // `[
90,168, // "["
  }
,
{ // state 1013
23,814, // <empty bracket pair>
24,81, // `[
90,168, // "["
  }
,
{ // state 1014
0x80000000|809, // match move
0x80000000|619, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1015
0x80000000|681, // match move
0x80000000|184, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1016
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1017
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1018
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1019
35,1157, // `&&
110,579, // "@"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1020
24,MIN_REDUCTION+60, // `[
90,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1021
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1508, // letter128
82,430, // {199..218 231..250}
83,430, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1511, // digit128
88,1164, // {176..185}
108,693, // "_"
118,1354, // {223}
121,738, // idChar*
122,129, // $$0
129,927, // idChar
130,795, // idChar128
  }
,
{ // state 1022
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,1512, // letter128
82,437, // {199..218 231..250}
83,437, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1510, // digit128
88,1162, // {176..185}
108,693, // "_"
118,1350, // {223}
121,741, // idChar*
122,149, // $$0
129,927, // idChar
130,794, // idChar128
  }
,
{ // state 1023
94,1016, // " "
111,411, // {10}
120,1159, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1024
2,324, // ws*
94,705, // " "
111,649, // {10}
120,848, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 1025
7,946, // ID
15,181, // `(
38,100, // <exp5>
40,879, // <exp4>
43,465, // `+
44,1255, // <exp3>
45,616, // `-
47,1271, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 1026
7,877, // ID
15,253, // `(
43,360, // `+
45,732, // `-
47,1567, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 1027
2,322, // ws*
94,707, // " "
111,650, // {10}
120,850, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 1028
2,1227, // ws*
94,715, // " "
111,916, // {10}
120,776, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 1029
2,919, // ws*
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1030
23,44, // <empty bracket pair>
24,82, // `[
55,65, // <empty bracket pair>*
90,168, // "["
  }
,
{ // state 1031
0x80000000|829, // match move
0x80000000|317, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1032
94,722, // " "
111,665, // {10}
120,992, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1033
0x80000000|1, // match move
0x80000000|1126, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1034
24,MIN_REDUCTION+60, // `[
90,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1035
23,52, // <empty bracket pair>
24,81, // `[
55,66, // <empty bracket pair>*
90,168, // "["
  }
,
{ // state 1036
2,234, // ws*
24,MIN_REDUCTION+152, // `[
90,MIN_REDUCTION+152, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1037
7,946, // ID
15,181, // `(
51,1370, // <exp1>
52,539, // <cast exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
95,342, // "#"
105,1000, // "("
110,663, // "@"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 1038
2,742, // ws*
24,MIN_REDUCTION+138, // `[
90,MIN_REDUCTION+138, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1039
2,230, // ws*
24,MIN_REDUCTION+152, // `[
90,MIN_REDUCTION+152, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1040
2,516, // ws*
94,977, // " "
111,366, // {10}
120,1572, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1041
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1042
65,697, // "a"
  }
,
{ // state 1043
7,877, // ID
15,253, // `(
38,138, // <exp5>
40,893, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 1044
2,746, // ws*
24,MIN_REDUCTION+138, // `[
90,MIN_REDUCTION+138, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1045
7,946, // ID
15,181, // `(
43,465, // `+
45,616, // `-
47,1558, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 1046
2,940, // ws*
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1047
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1048
2,945, // ws*
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1049
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1050
74,385, // "u"
76,1165, // "e"
  }
,
{ // state 1051
2,580, // ws*
94,1007, // " "
111,22, // {10}
120,196, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1052
2,1281, // ws*
24,MIN_REDUCTION+124, // `[
94,659, // " "
111,943, // {10}
120,839, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1053
2,218, // ws*
24,MIN_REDUCTION+186, // `[
90,MIN_REDUCTION+186, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1054
0x80000000|1, // match move
0x80000000|1103, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1055
35,1133, // `&&
110,579, // "@"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1056
2,217, // ws*
24,MIN_REDUCTION+186, // `[
90,MIN_REDUCTION+186, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1057
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1058
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1059
35,1131, // `&&
110,579, // "@"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1060
7,869, // ID
15,231, // `(
38,12, // <exp5>
40,957, // <exp4>
43,369, // `+
44,1343, // <exp3>
45,747, // `-
47,1335, // <exp2>
50,1121, // `!
51,542, // <exp1>
52,188, // <cast exp>
53,114, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
105,1000, // "("
106,1051, // "+"
110,713, // "@"
113,41, // "!"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 1061
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,4, // letter128
82,570, // {199..218 231..250}
83,570, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1578, // digit128
88,158, // {176..185}
108,693, // "_"
118,1004, // {223}
122,20, // $$0
129,721, // idChar
130,1581, // idChar128
  }
,
{ // state 1062
24,MIN_REDUCTION+13, // `[
90,MIN_REDUCTION+13, // "["
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1063
0x80000000|1, // match move
0x80000000|1088, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1064
23,115, // <empty bracket pair>
24,107, // `[
55,284, // <empty bracket pair>*
90,168, // "["
  }
,
{ // state 1065
2,510, // ws*
94,993, // " "
111,380, // {10}
120,1538, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1066
94,734, // " "
111,93, // {10}
120,1057, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1067
7,920, // ID
15,222, // `(
38,69, // <exp5>
40,964, // <exp4>
43,379, // `+
44,1349, // <exp3>
45,748, // `-
47,1334, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 1068
0x80000000|1, // match move
0x80000000|1244, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1069
24,MIN_REDUCTION+60, // `[
90,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1070
0x80000000|1, // match move
0x80000000|1242, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1071
24,MIN_REDUCTION+60, // `[
90,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1072
2,255, // ws*
24,MIN_REDUCTION+152, // `[
90,MIN_REDUCTION+152, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 1073
24,MIN_REDUCTION+61, // `[
90,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1074
2,1109, // ws*
24,MIN_REDUCTION+180, // `[
90,MIN_REDUCTION+180, // "["
94,1114, // " "
111,966, // {10}
120,1232, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1075
2,763, // ws*
24,MIN_REDUCTION+138, // `[
90,MIN_REDUCTION+138, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1076
65,673, // "a"
  }
,
{ // state 1077
24,MIN_REDUCTION+62, // `[
90,MIN_REDUCTION+62, // "["
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1078
74,531, // "u"
76,1165, // "e"
  }
,
{ // state 1079
0x80000000|1, // match move
0x80000000|1233, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1080
24,MIN_REDUCTION+62, // `[
90,MIN_REDUCTION+62, // "["
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1081
23,55, // <empty bracket pair>
24,68, // `[
55,37, // <empty bracket pair>*
90,168, // "["
  }
,
{ // state 1082
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,74, // letter128
82,557, // {199..218 231..250}
83,557, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1574, // digit128
88,180, // {176..185}
108,693, // "_"
118,1017, // {223}
122,31, // $$0
129,721, // idChar
130,791, // idChar128
  }
,
{ // state 1083
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1084
74,514, // "u"
76,1165, // "e"
  }
,
{ // state 1085
2,1564, // ws*
24,MIN_REDUCTION+124, // `[
94,562, // " "
111,932, // {10}
120,853, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1086
24,MIN_REDUCTION+52, // `[
90,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 1087
2,239, // ws*
24,MIN_REDUCTION+186, // `[
90,MIN_REDUCTION+186, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1088
24,MIN_REDUCTION+51, // `[
90,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1089
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1090
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1091
24,227, // `[
63,632, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1092
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1093
24,MIN_REDUCTION+52, // `[
90,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 1094
0x80000000|1278, // match move
0x80000000|373, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1095
0x80000000|1, // match move
0x80000000|1336, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1096
7,877, // ID
51,856, // <exp1>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
95,248, // "#"
110,685, // "@"
114,1448, // "'"
115,1366, // '"'
  }
,
{ // state 1097
94,83, // " "
111,762, // {10}
120,1385, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1098
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1099
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1100
24,MIN_REDUCTION+137, // `[
90,MIN_REDUCTION+137, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1101
0x80000000|1, // match move
0x80000000|283, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1102
0x80000000|1, // match move
0x80000000|984, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1103
24,MIN_REDUCTION+59, // `[
90,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1104
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1105
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1106
46,424, // `*
48,398, // `/
49,1045, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1107
0x80000000|233, // match move
0x80000000|277, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1108
0x80000000|233, // match move
0x80000000|276, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1109
0x80000000|759, // match move
0x80000000|780, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1110
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1111
24,226, // `[
63,635, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1112
24,MIN_REDUCTION+15, // `[
90,MIN_REDUCTION+15, // "["
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1113
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1114
0x80000000|809, // match move
0x80000000|1145, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1115
72,143, // "o"
  }
,
{ // state 1116
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1117
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1118
2,1173, // ws*
94,707, // " "
111,650, // {10}
120,850, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1119
7,920, // ID
51,797, // <exp1>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
95,1403, // "#"
110,710, // "@"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 1120
0x80000000|1278, // match move
0x80000000|395, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1121
7,869, // ID
51,796, // <exp1>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
95,1406, // "#"
110,713, // "@"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 1122
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1123
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1124
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1125
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1126
24,MIN_REDUCTION+59, // `[
90,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1127
2,51, // ws*
94,387, // " "
111,281, // {10}
120,1373, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1128
15,1550, // `(
105,749, // "("
  }
,
{ // state 1129
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1130
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1131
7,920, // ID
15,222, // `(
36,1422, // <exp6>
38,131, // <exp5>
40,964, // <exp4>
43,379, // `+
44,1349, // <exp3>
45,748, // `-
47,1334, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 1132
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1133
7,869, // ID
15,231, // `(
36,1418, // <exp6>
38,1468, // <exp5>
40,957, // <exp4>
43,369, // `+
44,1343, // <exp3>
45,747, // `-
47,1335, // <exp2>
50,1121, // `!
51,542, // <exp1>
52,188, // <cast exp>
53,114, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
105,1000, // "("
106,1051, // "+"
110,713, // "@"
113,41, // "!"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 1134
24,MIN_REDUCTION+15, // `[
90,MIN_REDUCTION+15, // "["
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1135
24,MIN_REDUCTION+15, // `[
90,MIN_REDUCTION+15, // "["
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1136
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1137
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1138
35,1182, // `&&
110,579, // "@"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1139
2,262, // ws*
24,MIN_REDUCTION+186, // `[
90,MIN_REDUCTION+186, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1140
24,MIN_REDUCTION+157, // `[
90,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1141
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1142
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,418, // letter128
82,197, // {199..218 231..250}
83,197, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,76, // digit128
88,1425, // {176..185}
108,693, // "_"
118,166, // {223}
122,764, // $$0
129,721, // idChar
130,106, // idChar128
  }
,
{ // state 1143
24,MIN_REDUCTION+146, // `[
90,MIN_REDUCTION+146, // "["
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1144
2,763, // ws*
  }
,
{ // state 1145
24,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1146
24,MIN_REDUCTION+52, // `[
90,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 1147
24,MIN_REDUCTION+146, // `[
90,MIN_REDUCTION+146, // "["
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1148
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1149
2,538, // ws*
94,1007, // " "
111,22, // {10}
120,196, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1150
72,143, // "o"
73,1243, // "r"
  }
,
{ // state 1151
0x80000000|1, // match move
0x80000000|415, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1152
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1153
94,707, // " "
111,650, // {10}
120,973, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1154
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1155
0x80000000|1, // match move
0x80000000|1034, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1156
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1157
7,877, // ID
15,253, // `(
36,191, // <exp6>
38,1506, // <exp5>
40,893, // <exp4>
43,360, // `+
44,1293, // <exp3>
45,732, // `-
47,1257, // <exp2>
50,1096, // `!
51,412, // <exp1>
52,174, // <cast exp>
53,104, // <unary exp>
54,303, // `new
56,497, // INTLIT
57,421, // CHARLIT
58,1531, // STRINGLIT
59,1394, // `true
60,583, // `false
61,1054, // `this
62,1178, // `null
64,333, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,244, // letter128
82,491, // {199..218 231..250}
83,491, // {193..198 225..230}
85,436, // {"1".."9"}
86,235, // "0"
87,334, // digit128
88,1120, // {176..185}
91,1149, // "-"
95,248, // "#"
105,1000, // "("
106,1051, // "+"
110,685, // "@"
113,41, // "!"
114,1448, // "'"
115,1366, // '"'
  }
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1158
94,705, // " "
111,649, // {10}
120,1018, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1159
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1160
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1161
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1162
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1163
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1164
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1165
2,164, // ws*
94,642, // " "
111,352, // {10}
120,77, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1166
2,1206, // ws*
94,722, // " "
111,665, // {10}
120,837, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1167
0x80000000|1, // match move
0x80000000|423, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1168
0x80000000|1, // match move
0x80000000|1011, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1169
94,705, // " "
111,649, // {10}
120,1018, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1170
2,684, // ws*
  }
,
{ // state 1171
24,MIN_REDUCTION+52, // `[
90,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 1172
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1173
94,707, // " "
111,650, // {10}
120,973, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1174
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1175
7,869, // ID
15,231, // `(
43,369, // `+
45,747, // `-
47,1590, // <exp2>
50,1121, // `!
51,542, // <exp1>
52,188, // <cast exp>
53,114, // <unary exp>
54,269, // `new
56,490, // INTLIT
57,458, // CHARLIT
58,1519, // STRINGLIT
59,199, // `true
60,568, // `false
61,1068, // `this
62,1193, // `null
64,305, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,87, // letter128
82,476, // {199..218 231..250}
83,476, // {193..198 225..230}
85,708, // {"1".."9"}
86,213, // "0"
87,306, // digit128
88,1319, // {176..185}
91,1149, // "-"
95,1406, // "#"
105,1000, // "("
106,1051, // "+"
110,713, // "@"
113,41, // "!"
114,1473, // "'"
115,1348, // '"'
  }
,
{ // state 1176
2,891, // ws*
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1177
7,920, // ID
15,222, // `(
43,379, // `+
45,748, // `-
47,1592, // <exp2>
50,1119, // `!
51,541, // <exp1>
52,189, // <cast exp>
53,110, // <unary exp>
54,264, // `new
56,489, // INTLIT
57,455, // CHARLIT
58,1518, // STRINGLIT
59,201, // `true
60,566, // `false
61,1070, // `this
62,1195, // `null
64,315, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,88, // letter128
82,479, // {199..218 231..250}
83,479, // {193..198 225..230}
85,706, // {"1".."9"}
86,210, // "0"
87,308, // digit128
88,1318, // {176..185}
91,1149, // "-"
95,1403, // "#"
105,1000, // "("
106,1051, // "+"
110,710, // "@"
113,41, // "!"
114,1488, // "'"
115,1344, // '"'
  }
,
{ // state 1178
0x80000000|1, // match move
0x80000000|1020, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1179
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1180
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1181
2,1265, // ws*
24,MIN_REDUCTION+124, // `[
94,641, // " "
111,948, // {10}
120,881, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1182
7,946, // ID
15,181, // `(
36,214, // <exp6>
38,1554, // <exp5>
40,879, // <exp4>
43,465, // `+
44,1255, // <exp3>
45,616, // `-
47,1271, // <exp2>
50,1239, // `!
51,364, // <exp1>
52,212, // <cast exp>
53,89, // <unary exp>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
91,1149, // "-"
95,342, // "#"
105,1000, // "("
106,1051, // "+"
110,663, // "@"
113,41, // "!"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 1183
2,1264, // ws*
24,MIN_REDUCTION+124, // `[
94,643, // " "
111,954, // {10}
120,885, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1184
2,1109, // ws*
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1185
24,MIN_REDUCTION+146, // `[
90,MIN_REDUCTION+146, // "["
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1186
24,MIN_REDUCTION+145, // `[
90,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1187
24,MIN_REDUCTION+137, // `[
90,MIN_REDUCTION+137, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1188
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1189
24,MIN_REDUCTION+145, // `[
90,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1190
24,MIN_REDUCTION+137, // `[
90,MIN_REDUCTION+137, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1191
46,405, // `*
48,414, // `/
49,1026, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1192
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1193
0x80000000|1, // match move
0x80000000|1071, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1194
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1195
0x80000000|1, // match move
0x80000000|1069, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1196
24,MIN_REDUCTION+54, // `[
90,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1197
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,520, // letter128
82,694, // {199..218 231..250}
83,694, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,383, // digit128
88,845, // {176..185}
108,693, // "_"
118,590, // {223}
121,390, // idChar*
122,453, // $$0
129,927, // idChar
130,1127, // idChar128
  }
,
{ // state 1198
24,236, // `[
63,646, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1199
24,MIN_REDUCTION+146, // `[
90,MIN_REDUCTION+146, // "["
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1200
0x80000000|351, // match move
0x80000000|287, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1201
2,746, // ws*
  }
,
{ // state 1202
7,1148, // ID
18,634, // <type>
21,1194, // `int
22,1329, // `boolean
64,871, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,1295, // letter128
82,454, // {199..218 231..250}
83,454, // {193..198 225..230}
95,198, // "#"
  }
,
{ // state 1203
0x80000000|1, // match move
0x80000000|529, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1204
23,844, // <empty bracket pair>
24,107, // `[
90,168, // "["
  }
,
{ // state 1205
2,742, // ws*
  }
,
{ // state 1206
94,722, // " "
111,665, // {10}
120,992, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1207
24,MIN_REDUCTION+150, // `[
90,MIN_REDUCTION+150, // "["
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1208
79,1507, // "n"
  }
,
{ // state 1209
7,683, // ID
23,1449, // <empty bracket pair>
24,28, // `[
64,1452, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,1065, // letter128
82,570, // {199..218 231..250}
83,570, // {193..198 225..230}
90,168, // "["
  }
,
{ // state 1210
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1211
2,930, // ws*
94,83, // " "
111,762, // {10}
120,1110, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1212
80,112, // "t"
  }
,
{ // state 1213
24,MIN_REDUCTION+54, // `[
90,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1214
24,MIN_REDUCTION+51, // `[
90,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1215
24,MIN_REDUCTION+51, // `[
90,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1216
24,195, // `[
63,662, // `.
90,1489, // "["
107,1498, // "."
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1217
7,1172, // ID
18,667, // <type>
21,1179, // `int
22,1273, // `boolean
64,894, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,1365, // letter128
82,443, // {199..218 231..250}
83,443, // {193..198 225..230}
95,245, // "#"
  }
,
{ // state 1218
24,MIN_REDUCTION+70, // `[
90,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1219
24,MIN_REDUCTION+150, // `[
90,MIN_REDUCTION+150, // "["
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1220
24,MIN_REDUCTION+137, // `[
90,MIN_REDUCTION+137, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1221
2,1169, // ws*
94,705, // " "
111,649, // {10}
120,848, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1222
0x80000000|1, // match move
0x80000000|263, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1223
94,387, // " "
111,281, // {10}
120,1419, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1224
24,MIN_REDUCTION+145, // `[
90,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1225
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1226
0x80000000|233, // match move
0x80000000|300, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1227
94,715, // " "
111,916, // {10}
120,801, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1228
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1229
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1230
94,1402, // " "
111,842, // {10}
120,862, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 1231
2,768, // ws*
94,71, // " "
111,751, // {10}
120,1132, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 1232
0x80000000|1297, // match move
0x80000000|535, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1233
24,MIN_REDUCTION+51, // `[
90,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1234
24,MIN_REDUCTION+70, // `[
90,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1235
7,1099, // ID
18,581, // <type>
21,1154, // `int
22,1260, // `boolean
64,1021, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,1346, // letter128
82,430, // {199..218 231..250}
83,430, // {193..198 225..230}
95,289, // "#"
  }
,
{ // state 1236
0x80000000|1, // match move
0x80000000|547, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1237
7,1124, // ID
18,572, // <type>
21,1152, // `int
22,1256, // `boolean
64,1022, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,1339, // letter128
82,437, // {199..218 231..250}
83,437, // {193..198 225..230}
95,285, // "#"
  }
,
{ // state 1238
24,MIN_REDUCTION+150, // `[
90,MIN_REDUCTION+150, // "["
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1239
7,946, // ID
51,812, // <exp1>
54,251, // `new
56,507, // INTLIT
57,434, // CHARLIT
58,1539, // STRINGLIT
59,1382, // `true
60,601, // `false
61,1033, // `this
62,1155, // `null
64,169, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,225, // letter128
82,648, // {199..218 231..250}
83,648, // {193..198 225..230}
85,460, // {"1".."9"}
86,256, // "0"
87,2, // digit128
88,1094, // {176..185}
95,342, // "#"
110,663, // "@"
114,1427, // "'"
115,1383, // '"'
  }
,
{ // state 1240
94,734, // " "
111,93, // {10}
120,1057, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1241
24,MIN_REDUCTION+150, // `[
90,MIN_REDUCTION+150, // "["
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1242
24,MIN_REDUCTION+59, // `[
90,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1243
2,456, // ws*
94,999, // " "
111,376, // {10}
120,1540, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1244
24,MIN_REDUCTION+59, // `[
90,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1245
24,MIN_REDUCTION+145, // `[
90,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1246
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1247
0x80000000|233, // match move
0x80000000|288, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1248
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1249
24,MIN_REDUCTION+15, // `[
90,MIN_REDUCTION+15, // "["
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1250
0x80000000|1297, // match move
0x80000000|628, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1251
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1252
0x80000000|1, // match move
0x80000000|277, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1253
24,MIN_REDUCTION+70, // `[
90,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1254
24,MIN_REDUCTION+70, // `[
90,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1255
46,424, // `*
48,398, // `/
49,1045, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1256
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1257
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1258
74,527, // "u"
  }
,
{ // state 1259
2,1582, // ws*
24,MIN_REDUCTION+84, // `[
90,MIN_REDUCTION+84, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1260
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1261
2,1587, // ws*
24,MIN_REDUCTION+84, // `[
90,MIN_REDUCTION+84, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1262
0x80000000|1, // match move
0x80000000|1224, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1263
0x80000000|1, // match move
0x80000000|288, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1264
0x80000000|1089, // match move
0x80000000|816, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1265
0x80000000|1089, // match move
0x80000000|819, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1266
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1267
33,861, // `||
110,922, // "@"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1268
0x80000000|96, // match move
0x80000000|1435, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1269
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1270
33,859, // `||
110,922, // "@"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1271
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1272
94,734, // " "
111,93, // {10}
120,1057, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1273
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1274
0x80000000|85, // match move
0x80000000|1438, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1275
2,274, // ws*
94,387, // " "
111,281, // {10}
120,1373, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1276
24,MIN_REDUCTION+175, // `[
90,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1277
0x80000000|809, // match move
0x80000000|1412, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1278
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1279
0x80000000|1, // match move
0x80000000|494, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1280
2,3, // ws*
24,MIN_REDUCTION+84, // `[
90,MIN_REDUCTION+84, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1281
0x80000000|1089, // match move
0x80000000|847, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1282
0x80000000|809, // match move
0x80000000|1423, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1283
0x80000000|809, // match move
0x80000000|1424, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1284
33,846, // `||
110,922, // "@"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1285
94,722, // " "
111,665, // {10}
120,992, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1286
0x80000000|1, // match move
0x80000000|276, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1287
0x80000000|1, // match move
0x80000000|487, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1288
24,MIN_REDUCTION+175, // `[
90,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1289
0x80000000|1, // match move
0x80000000|501, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1290
72,585, // "o"
  }
,
{ // state 1291
24,MIN_REDUCTION+175, // `[
90,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1292
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1293
46,405, // `*
48,414, // `/
49,1026, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1294
25,530, // `]
98,136, // "]"
  }
,
{ // state 1295
2,1066, // ws*
94,734, // " "
111,93, // {10}
120,822, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1296
24,MIN_REDUCTION+141, // `[
90,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1297
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1298
24,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1299
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1300
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1301
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1302
94,734, // " "
111,93, // {10}
120,1057, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1303
24,MIN_REDUCTION+175, // `[
90,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1304
2,1457, // ws*
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 1305
0x80000000|809, // match move
0x80000000|1401, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1306
0x80000000|1, // match move
0x80000000|904, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1307
33,832, // `||
110,922, // "@"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 1308
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1309
0x80000000|1, // match move
0x80000000|892, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1310
24,MIN_REDUCTION+141, // `[
90,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1311
24,MIN_REDUCTION+141, // `[
90,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1312
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1313
0x80000000|1, // match move
0x80000000|502, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1314
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1315
0x80000000|1, // match move
0x80000000|300, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1316
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1317
24,MIN_REDUCTION+137, // `[
90,MIN_REDUCTION+137, // "["
94,1114, // " "
111,966, // {10}
120,792, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1318
0x80000000|1278, // match move
0x80000000|406, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1319
0x80000000|1278, // match move
0x80000000|407, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1320
0x80000000|1, // match move
0x80000000|1310, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1321
2,598, // ws*
94,83, // " "
111,762, // {10}
120,1110, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1322
0x80000000|1, // match move
0x80000000|1311, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1323
134,MIN_REDUCTION+70, // $NT
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1324
80,565, // "t"
  }
,
{ // state 1325
25,613, // `]
98,117, // "]"
  }
,
{ // state 1326
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1327
0x80000000|1047, // match move
0x80000000|73, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1328
25,614, // `]
98,122, // "]"
  }
,
{ // state 1329
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1330
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1331
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1332
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1333
0x80000000|1, // match move
0x80000000|1296, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1334
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1335
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1336
24,MIN_REDUCTION+141, // `[
90,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1337
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1338
0x80000000|1, // match move
0x80000000|221, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1339
2,1158, // ws*
94,705, // " "
111,649, // {10}
120,848, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1340
8,408, // `{
103,915, // "{"
  }
,
{ // state 1341
0x80000000|1, // match move
0x80000000|220, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1342
0x80000000|1, // match move
0x80000000|970, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1343
46,388, // `*
48,429, // `/
49,1175, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1344
65,965, // "a"
66,965, // "p"
67,965, // "v"
68,965, // "c"
69,965, // "f"
70,965, // "i"
71,965, // "l"
72,965, // "o"
73,965, // "r"
74,965, // "u"
75,965, // "b"
76,965, // "e"
77,965, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,965, // "h"
79,965, // "n"
80,965, // "t"
82,1604, // {199..218 231..250}
83,1604, // {193..198 225..230}
85,965, // {"1".."9"}
86,965, // "0"
88,1604, // {176..185}
89,1520, // any
90,965, // "["
91,965, // "-"
92,965, // "<"
93,965, // "|"
94,965, // " "
95,965, // "#"
96,965, // "&"
97,965, // ")"
98,965, // "]"
99,965, // "/"
100,965, // ";"
101,965, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,965, // ">"
103,965, // "{"
104,965, // "%"
105,965, // "("
106,965, // "+"
107,965, // "."
108,965, // "_"
109,965, // "="
110,965, // "@"
111,965, // {10}
112,965, // "}"
113,965, // "!"
114,965, // "'"
115,965, // '"'
116,965, // "*"
117,941, // any128
118,1604, // {223}
119,1604, // {128..175 186..192 219..222 224 251..255}
127,466, // any*
128,912, // $$3
  }
,
{ // state 1345
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1346
2,1153, // ws*
94,707, // " "
111,650, // {10}
120,850, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1347
2,1502, // ws*
24,MIN_REDUCTION+88, // `[
90,MIN_REDUCTION+88, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1348
65,965, // "a"
66,965, // "p"
67,965, // "v"
68,965, // "c"
69,965, // "f"
70,965, // "i"
71,965, // "l"
72,965, // "o"
73,965, // "r"
74,965, // "u"
75,965, // "b"
76,965, // "e"
77,965, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,965, // "h"
79,965, // "n"
80,965, // "t"
82,1601, // {199..218 231..250}
83,1601, // {193..198 225..230}
85,965, // {"1".."9"}
86,965, // "0"
88,1601, // {176..185}
89,1520, // any
90,965, // "["
91,965, // "-"
92,965, // "<"
93,965, // "|"
94,965, // " "
95,965, // "#"
96,965, // "&"
97,965, // ")"
98,965, // "]"
99,965, // "/"
100,965, // ";"
101,965, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,965, // ">"
103,965, // "{"
104,965, // "%"
105,965, // "("
106,965, // "+"
107,965, // "."
108,965, // "_"
109,965, // "="
110,965, // "@"
111,965, // {10}
112,965, // "}"
113,965, // "!"
114,965, // "'"
115,965, // '"'
116,965, // "*"
117,937, // any128
118,1601, // {223}
119,1601, // {128..175 186..192 219..222 224 251..255}
127,457, // any*
128,909, // $$3
  }
,
{ // state 1349
46,394, // `*
48,432, // `/
49,1177, // `%
99,637, // "/"
104,1321, // "%"
116,1211, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 1350
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1351
2,811, // ws*
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1352
0x80000000|1331, // match move
0x80000000|451, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1353
7,252, // ID
64,1594, // letter
65,428, // "a"
66,428, // "p"
67,428, // "v"
68,428, // "c"
69,428, // "f"
70,428, // "i"
71,428, // "l"
72,428, // "o"
73,428, // "r"
74,428, // "u"
75,428, // "b"
76,428, // "e"
77,428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,428, // "h"
79,428, // "n"
80,428, // "t"
81,1002, // letter128
82,615, // {199..218 231..250}
83,615, // {193..198 225..230}
  }
,
{ // state 1354
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1355
2,1236, // ws*
24,MIN_REDUCTION+148, // `[
90,MIN_REDUCTION+148, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1356
0x80000000|1, // match move
0x80000000|232, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1357
94,1016, // " "
111,411, // {10}
120,1159, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1358
0x80000000|1331, // match move
0x80000000|371, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1359
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1360
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1361
24,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1362
25,550, // `]
98,154, // "]"
  }
,
{ // state 1363
94,675, // " "
111,569, // {10}
120,1378, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1364
2,116, // ws*
94,790, // " "
111,98, // {10}
120,92, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1365
2,1032, // ws*
94,722, // " "
111,665, // {10}
120,837, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1366
65,965, // "a"
66,965, // "p"
67,965, // "v"
68,965, // "c"
69,965, // "f"
70,965, // "i"
71,965, // "l"
72,965, // "o"
73,965, // "r"
74,965, // "u"
75,965, // "b"
76,965, // "e"
77,965, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,965, // "h"
79,965, // "n"
80,965, // "t"
82,1515, // {199..218 231..250}
83,1515, // {193..198 225..230}
85,965, // {"1".."9"}
86,965, // "0"
88,1515, // {176..185}
89,1520, // any
90,965, // "["
91,965, // "-"
92,965, // "<"
93,965, // "|"
94,965, // " "
95,965, // "#"
96,965, // "&"
97,965, // ")"
98,965, // "]"
99,965, // "/"
100,965, // ";"
101,965, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,965, // ">"
103,965, // "{"
104,965, // "%"
105,965, // "("
106,965, // "+"
107,965, // "."
108,965, // "_"
109,965, // "="
110,965, // "@"
111,965, // {10}
112,965, // "}"
113,965, // "!"
114,965, // "'"
115,965, // '"'
116,965, // "*"
117,959, // any128
118,1515, // {223}
119,1515, // {128..175 186..192 219..222 224 251..255}
127,473, // any*
128,895, // $$3
  }
,
{ // state 1367
28,1440, // `;
100,474, // ";"
  }
,
{ // state 1368
2,1481, // ws*
24,MIN_REDUCTION+88, // `[
90,MIN_REDUCTION+88, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1369
94,642, // " "
111,352, // {10}
120,165, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1370
0x80000000|1, // match move
0x80000000|774, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1371
94,661, // " "
111,38, // {10}
120,1432, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1372
28,826, // `;
100,474, // ";"
  }
,
{ // state 1373
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1374
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1375
0x80000000|1331, // match move
0x80000000|464, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1376
74,357, // "u"
76,1165, // "e"
  }
,
{ // state 1377
0x80000000|1331, // match move
0x80000000|462, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1378
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1379
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1380
2,1505, // ws*
94,64, // " "
111,686, // {10}
120,1156, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1381
24,MIN_REDUCTION+55, // `[
90,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1382
0x80000000|1, // match move
0x80000000|167, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1383
65,965, // "a"
66,965, // "p"
67,965, // "v"
68,965, // "c"
69,965, // "f"
70,965, // "i"
71,965, // "l"
72,965, // "o"
73,965, // "r"
74,965, // "u"
75,965, // "b"
76,965, // "e"
77,965, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,965, // "h"
79,965, // "n"
80,965, // "t"
82,1528, // {199..218 231..250}
83,1528, // {193..198 225..230}
85,965, // {"1".."9"}
86,965, // "0"
88,1528, // {176..185}
89,1520, // any
90,965, // "["
91,965, // "-"
92,965, // "<"
93,965, // "|"
94,965, // " "
95,965, // "#"
96,965, // "&"
97,965, // ")"
98,965, // "]"
99,965, // "/"
100,965, // ";"
101,965, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,965, // ">"
103,965, // "{"
104,965, // "%"
105,965, // "("
106,965, // "+"
107,965, // "."
108,965, // "_"
109,965, // "="
110,965, // "@"
111,965, // {10}
112,965, // "}"
113,965, // "!"
114,965, // "'"
115,965, // '"'
116,965, // "*"
117,882, // any128
118,1528, // {223}
119,1528, // {128..175 186..192 219..222 224 251..255}
127,485, // any*
128,880, // $$3
  }
,
{ // state 1384
24,MIN_REDUCTION+137, // `[
90,MIN_REDUCTION+137, // "["
94,1014, // " "
111,1570, // {10}
120,689, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1385
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1386
2,21, // ws*
24,MIN_REDUCTION+84, // `[
90,MIN_REDUCTION+84, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1387
2,1168, // ws*
24,MIN_REDUCTION+148, // `[
90,MIN_REDUCTION+148, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1388
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,1282, // " "
111,599, // {10}
120,1107, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1389
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1585, // ID
640, // `{
-1, // <decl in class>*
481, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
231, // `(
-1, // `)
-1, // <stmt>*
1209, // <type>
-1, // `return
10, // <exp>
744, // `int
1470, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1316, // <stmt>
517, // <assign>
1041, // `;
766, // `break
1001, // <local var decl>
-1, // `=
1267, // <exp8>
-1, // `||
1537, // <exp7>
-1, // `&&
1501, // <exp6>
-1, // `==
1468, // <exp5>
-1, // `<
957, // <exp4>
-1, // `>
-1, // `instanceof
369, // `+
1343, // <exp3>
747, // `-
-1, // `*
1335, // <exp2>
-1, // `/
-1, // `%
1121, // `!
542, // <exp1>
188, // <cast exp>
114, // <unary exp>
269, // `new
-1, // <empty bracket pair>*
490, // INTLIT
458, // CHARLIT
1519, // STRINGLIT
199, // `true
568, // `false
1068, // `this
1193, // `null
-1, // `.
1433, // letter
428, // "a"
428, // "p"
428, // "v"
428, // "c"
428, // "f"
428, // "i"
428, // "l"
428, // "o"
428, // "r"
428, // "u"
428, // "b"
428, // "e"
428, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
428, // "h"
428, // "n"
428, // "t"
446, // letter128
197, // {199..218 231..250}
197, // {193..198 225..230}
-1, // digit
708, // {"1".."9"}
213, // "0"
306, // digit128
1319, // {176..185}
-1, // any
-1, // "["
1149, // "-"
-1, // "<"
-1, // "|"
-1, // " "
575, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
506, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
425, // "{"
-1, // "%"
1000, // "("
1051, // "+"
-1, // "."
-1, // "_"
-1, // "="
713, // "@"
-1, // {10}
299, // "}"
41, // "!"
1473, // "'"
1348, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 1390
0x80000000|86, // match move
0x80000000|717, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1391
24,MIN_REDUCTION+55, // `[
90,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1392
2,1102, // ws*
24,MIN_REDUCTION+148, // `[
90,MIN_REDUCTION+148, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1393
24,MIN_REDUCTION+55, // `[
90,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1394
0x80000000|1, // match move
0x80000000|135, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1395
94,1003, // " "
111,396, // {10}
120,1137, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1396
0x80000000|653, // match move
0x80000000|1485, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1397
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1398
0x80000000|543, // match move
0x80000000|1355, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1399
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,1283, // " "
111,603, // {10}
120,1108, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1400
134,MIN_REDUCTION+69, // $NT
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1401
24,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1402
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1403
69,902, // "f"
79,1078, // "n"
80,612, // "t"
  }
,
{ // state 1404
2,963, // ws*
94,387, // " "
111,281, // {10}
120,1373, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1405
2,103, // ws*
24,MIN_REDUCTION+88, // `[
90,MIN_REDUCTION+88, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1406
69,887, // "f"
79,1084, // "n"
80,591, // "t"
  }
,
{ // state 1407
2,102, // ws*
24,MIN_REDUCTION+88, // `[
90,MIN_REDUCTION+88, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 1408
0x80000000|1, // match move
0x80000000|1186, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1409
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1410
0x80000000|1, // match move
0x80000000|1189, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1411
2,1203, // ws*
24,MIN_REDUCTION+148, // `[
90,MIN_REDUCTION+148, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1412
24,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1413
24,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,1277, // " "
111,582, // {10}
120,1247, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1414
0x80000000|1304, // match move
0x80000000|967, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1415
24,MIN_REDUCTION+55, // `[
90,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1416
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1417
0x80000000|669, // match move
0x80000000|1461, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1418
37,1060, // `==
110,815, // "@"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1419
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1420
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1421
0x80000000|1, // match move
0x80000000|1245, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1422
37,1067, // `==
110,815, // "@"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1423
24,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1424
24,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1425
0x80000000|1480, // match move
0x80000000|534, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1426
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1427
65,171, // "a"
66,171, // "p"
67,171, // "v"
68,171, // "c"
69,171, // "f"
70,171, // "i"
71,171, // "l"
72,171, // "o"
73,171, // "r"
74,171, // "u"
75,171, // "b"
76,171, // "e"
77,171, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,171, // "h"
79,171, // "n"
80,171, // "t"
85,171, // {"1".."9"}
86,171, // "0"
89,292, // any
90,171, // "["
91,171, // "-"
92,171, // "<"
93,171, // "|"
94,171, // " "
95,171, // "#"
96,171, // "&"
97,171, // ")"
98,171, // "]"
99,171, // "/"
100,171, // ";"
101,171, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,171, // ">"
103,171, // "{"
104,171, // "%"
105,171, // "("
106,171, // "+"
107,171, // "."
108,171, // "_"
109,171, // "="
110,171, // "@"
111,171, // {10}
112,171, // "}"
113,171, // "!"
114,171, // "'"
115,171, // '"'
116,171, // "*"
  }
,
{ // state 1428
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1429
2,900, // ws*
24,MIN_REDUCTION+138, // `[
90,MIN_REDUCTION+138, // "["
94,1114, // " "
111,966, // {10}
120,1232, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1430
7,MIN_REDUCTION+13, // ID
24,MIN_REDUCTION+50, // `[
65,MIN_REDUCTION+13, // "a"
66,MIN_REDUCTION+13, // "p"
67,MIN_REDUCTION+13, // "v"
68,MIN_REDUCTION+13, // "c"
69,MIN_REDUCTION+13, // "f"
70,MIN_REDUCTION+13, // "i"
71,MIN_REDUCTION+13, // "l"
72,MIN_REDUCTION+13, // "o"
73,MIN_REDUCTION+13, // "r"
74,MIN_REDUCTION+13, // "u"
75,MIN_REDUCTION+13, // "b"
76,MIN_REDUCTION+13, // "e"
77,MIN_REDUCTION+13, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,MIN_REDUCTION+13, // "h"
79,MIN_REDUCTION+13, // "n"
80,MIN_REDUCTION+13, // "t"
82,MIN_REDUCTION+13, // {199..218 231..250}
83,MIN_REDUCTION+13, // {193..198 225..230}
90,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1431
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1432
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1433
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,418, // letter128
82,197, // {199..218 231..250}
83,197, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,76, // digit128
88,1425, // {176..185}
108,693, // "_"
118,166, // {223}
121,1142, // idChar*
122,755, // $$0
129,927, // idChar
130,106, // idChar128
  }
,
{ // state 1434
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1435
2,338, // ws*
24,MIN_REDUCTION+124, // `[
90,MIN_REDUCTION+124, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1436
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1437
0x80000000|1431, // match move
0x80000000|159, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1438
2,349, // ws*
24,MIN_REDUCTION+124, // `[
90,MIN_REDUCTION+124, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1439
71,1028, // "l"
  }
,
{ // state 1440
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1441
0x80000000|990, // match move
0x80000000|1392, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1442
25,1063, // `]
98,1396, // "]"
  }
,
{ // state 1443
0x80000000|86, // match move
0x80000000|677, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1444
0x80000000|75, // match move
0x80000000|1535, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1445
0x80000000|987, // match move
0x80000000|1387, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1446
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1447
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1448
65,254, // "a"
66,254, // "p"
67,254, // "v"
68,254, // "c"
69,254, // "f"
70,254, // "i"
71,254, // "l"
72,254, // "o"
73,254, // "r"
74,254, // "u"
75,254, // "b"
76,254, // "e"
77,254, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,254, // "h"
79,254, // "n"
80,254, // "t"
85,254, // {"1".."9"}
86,254, // "0"
89,268, // any
90,254, // "["
91,254, // "-"
92,254, // "<"
93,254, // "|"
94,254, // " "
95,254, // "#"
96,254, // "&"
97,254, // ")"
98,254, // "]"
99,254, // "/"
100,254, // ";"
101,254, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,254, // ">"
103,254, // "{"
104,254, // "%"
105,254, // "("
106,254, // "+"
107,254, // "."
108,254, // "_"
109,254, // "="
110,254, // "@"
111,254, // {10}
112,254, // "}"
113,254, // "!"
114,254, // "'"
115,254, // '"'
116,254, // "*"
  }
,
{ // state 1449
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1450
94,661, // " "
111,38, // {10}
120,1432, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1451
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1452
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,4, // letter128
82,570, // {199..218 231..250}
83,570, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1578, // digit128
88,158, // {176..185}
108,693, // "_"
118,1004, // {223}
121,1061, // idChar*
122,377, // $$0
129,927, // idChar
130,1581, // idChar128
  }
,
{ // state 1453
2,1371, // ws*
94,661, // " "
111,38, // {10}
120,1566, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1454
25,1079, // `]
98,1417, // "]"
  }
,
{ // state 1455
0x80000000|86, // match move
0x80000000|718, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1456
94,1400, // " "
111,1323, // {10}
120,242, // ws
134,MIN_REDUCTION+123, // $NT
  }
,
{ // state 1457
0x80000000|1326, // match move
0x80000000|1523, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1458
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1459
24,MIN_REDUCTION+156, // `[
90,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1460
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1461
2,265, // ws*
24,MIN_REDUCTION+124, // `[
90,MIN_REDUCTION+124, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1462
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,74, // letter128
82,557, // {199..218 231..250}
83,557, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1574, // digit128
88,180, // {176..185}
108,693, // "_"
118,1017, // {223}
121,1082, // idChar*
122,537, // $$0
129,927, // idChar
130,791, // idChar128
  }
,
{ // state 1463
25,981, // `]
98,1268, // "]"
  }
,
{ // state 1464
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,586, // letter128
82,553, // {199..218 231..250}
83,553, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,690, // digit128
88,1379, // {176..185}
108,693, // "_"
118,468, // {223}
121,921, // idChar*
122,1008, // $$0
129,927, // idChar
130,1453, // idChar128
  }
,
{ // state 1465
25,983, // `]
98,1274, // "]"
  }
,
{ // state 1466
0x80000000|39, // match move
0x80000000|1513, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1467
0x80000000|532, // match move
0x80000000|1411, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1468
39,855, // `<
41,26, // `>
42,1235, // `instanceof
92,1380, // "<"
95,947, // "#"
102,833, // ">"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1469
94,1229, // " "
111,14, // {10}
120,216, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1470
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1471
2,753, // ws*
24,MIN_REDUCTION+180, // `[
90,MIN_REDUCTION+180, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1472
24,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1473
65,240, // "a"
66,240, // "p"
67,240, // "v"
68,240, // "c"
69,240, // "f"
70,240, // "i"
71,240, // "l"
72,240, // "o"
73,240, // "r"
74,240, // "u"
75,240, // "b"
76,240, // "e"
77,240, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,240, // "h"
79,240, // "n"
80,240, // "t"
85,240, // {"1".."9"}
86,240, // "0"
89,344, // any
90,240, // "["
91,240, // "-"
92,240, // "<"
93,240, // "|"
94,240, // " "
95,240, // "#"
96,240, // "&"
97,240, // ")"
98,240, // "]"
99,240, // "/"
100,240, // ";"
101,240, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,240, // ">"
103,240, // "{"
104,240, // "%"
105,240, // "("
106,240, // "+"
107,240, // "."
108,240, // "_"
109,240, // "="
110,240, // "@"
111,240, // {10}
112,240, // "}"
113,240, // "!"
114,240, // "'"
115,240, // '"'
116,240, // "*"
  }
,
{ // state 1474
24,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1475
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1476
24,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1477
24,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1478
35,1157, // `&&
110,579, // "@"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 1479
0x80000000|86, // match move
0x80000000|638, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1480
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1481
0x80000000|1, // match move
0x80000000|761, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1482
2,359, // ws*
24,MIN_REDUCTION+144, // `[
90,MIN_REDUCTION+144, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1483
43,972, // `+
45,467, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1484
24,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1485
2,290, // ws*
24,MIN_REDUCTION+124, // `[
90,MIN_REDUCTION+124, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1486
15,MIN_REDUCTION+179, // `(
94,1014, // " "
105,MIN_REDUCTION+179, // "("
111,1570, // {10}
120,689, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1487
0x80000000|54, // match move
0x80000000|1593, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1488
65,241, // "a"
66,241, // "p"
67,241, // "v"
68,241, // "c"
69,241, // "f"
70,241, // "i"
71,241, // "l"
72,241, // "o"
73,241, // "r"
74,241, // "u"
75,241, // "b"
76,241, // "e"
77,241, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,241, // "h"
79,241, // "n"
80,241, // "t"
85,241, // {"1".."9"}
86,241, // "0"
89,347, // any
90,241, // "["
91,241, // "-"
92,241, // "<"
93,241, // "|"
94,241, // " "
95,241, // "#"
96,241, // "&"
97,241, // ")"
98,241, // "]"
99,241, // "/"
100,241, // ";"
101,241, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,241, // ">"
103,241, // "{"
104,241, // "%"
105,241, // "("
106,241, // "+"
107,241, // "."
108,241, // "_"
109,241, // "="
110,241, // "@"
111,241, // {10}
112,241, // "}"
113,241, // "!"
114,241, // "'"
115,241, // '"'
116,241, // "*"
  }
,
{ // state 1489
2,435, // ws*
94,1402, // " "
111,842, // {10}
120,1248, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1490
2,729, // ws*
24,MIN_REDUCTION+180, // `[
90,MIN_REDUCTION+180, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1491
0x80000000|61, // match move
0x80000000|1591, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1492
24,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1493
43,991, // `+
45,362, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1494
0x80000000|1, // match move
0x80000000|108, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1495
37,1067, // `==
110,815, // "@"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1496
2,900, // ws*
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1497
35,1182, // `&&
110,579, // "@"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 1498
2,148, // ws*
94,715, // " "
111,916, // {10}
120,776, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 1499
94,975, // " "
111,367, // {10}
120,1098, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1500
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1501
37,1060, // `==
110,815, // "@"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1502
0x80000000|1, // match move
0x80000000|739, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1503
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1504
24,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1505
94,64, // " "
111,686, // {10}
120,1447, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1506
39,771, // `<
41,16, // `>
42,1217, // `instanceof
92,1380, // "<"
95,947, // "#"
102,833, // ">"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1507
2,237, // ws*
94,642, // " "
111,352, // {10}
120,77, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1508
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1509
25,1299, // `]
98,824, // "]"
  }
,
{ // state 1510
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1511
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1512
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1513
2,944, // ws*
24,MIN_REDUCTION+108, // `[
90,MIN_REDUCTION+108, // "["
94,372, // " "
111,215, // {10}
120,711, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1514
24,MIN_REDUCTION+149, // `[
90,MIN_REDUCTION+149, // "["
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1515
0x80000000|1475, // match move
0x80000000|836, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1516
24,MIN_REDUCTION+149, // `[
90,MIN_REDUCTION+149, // "["
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1517
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1518
0x80000000|1, // match move
0x80000000|551, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1519
0x80000000|1, // match move
0x80000000|545, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1520
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1521
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1522
94,1269, // " "
111,1129, // {10}
120,1292, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1523
24,MIN_REDUCTION+71, // `[
90,MIN_REDUCTION+71, // "["
94,1014, // " "
111,1570, // {10}
120,689, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1524
2,1023, // ws*
94,1016, // " "
111,411, // {10}
120,1521, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1525
25,1314, // `]
98,1166, // "]"
  }
,
{ // state 1526
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1527
24,MIN_REDUCTION+151, // `[
90,MIN_REDUCTION+151, // "["
94,372, // " "
111,215, // {10}
120,1263, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1528
0x80000000|1475, // match move
0x80000000|821, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1529
0x80000000|1, // match move
0x80000000|1077, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1530
0x80000000|1, // match move
0x80000000|1080, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1531
0x80000000|1, // match move
0x80000000|472, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1532
25,296, // `]
98,1118, // "]"
  }
,
{ // state 1533
2,255, // ws*
  }
,
{ // state 1534
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1535
2,968, // ws*
24,MIN_REDUCTION+108, // `[
90,MIN_REDUCTION+108, // "["
94,361, // " "
111,519, // {10}
120,674, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1536
24,MIN_REDUCTION+149, // `[
90,MIN_REDUCTION+149, // "["
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1537
35,1133, // `&&
110,579, // "@"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 1538
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1539
0x80000000|1, // match move
0x80000000|483, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1540
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1541
35,1131, // `&&
110,579, // "@"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 1542
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1543
43,533, // `+
45,375, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1544
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1545
2,187, // ws*
  }
,
{ // state 1546
24,MIN_REDUCTION+151, // `[
90,MIN_REDUCTION+151, // "["
94,361, // " "
111,519, // {10}
120,1315, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1547
0x80000000|1416, // match move
0x80000000|503, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1548
24,MIN_REDUCTION+149, // `[
90,MIN_REDUCTION+149, // "["
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1549
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1550
16,185, // `)
97,720, // ")"
  }
,
{ // state 1551
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1552
25,282, // `]
98,1221, // "]"
  }
,
{ // state 1553
43,555, // `+
45,381, // `-
91,820, // "-"
106,1231, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1554
39,782, // `<
41,8, // `>
42,1202, // `instanceof
92,1380, // "<"
95,947, // "#"
102,833, // ">"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1555
24,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1556
0x80000000|1058, // match move
0x80000000|863, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1557
24,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1558
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1559
0x80000000|1416, // match move
0x80000000|496, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1560
24,MIN_REDUCTION+151, // `[
90,MIN_REDUCTION+151, // "["
94,392, // " "
111,200, // {10}
120,1286, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1561
2,431, // ws*
94,1549, // " "
111,841, // {10}
120,522, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1562
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1563
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1564
0x80000000|1089, // match move
0x80000000|773, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1565
24,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1566
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1567
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1568
0x80000000|1416, // match move
0x80000000|630, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1569
2,230, // ws*
  }
,
{ // state 1570
0x80000000|1426, // match move
0x80000000|807, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1571
2,234, // ws*
  }
,
{ // state 1572
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1573
0x80000000|1416, // match move
0x80000000|627, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1574
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1575
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1576
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1577
94,707, // " "
111,650, // {10}
120,973, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1578
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1579
94,705, // " "
111,649, // {10}
120,1018, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1580
2,353, // ws*
15,MIN_REDUCTION+180, // `(
94,1014, // " "
105,MIN_REDUCTION+180, // "("
111,1570, // {10}
120,1250, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1581
2,971, // ws*
94,993, // " "
111,380, // {10}
120,1538, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1582
0x80000000|1, // match move
0x80000000|576, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1583
0x80000000|1058, // match move
0x80000000|784, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1584
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1585
0x80000000|1251, // match move
0x80000000|1430, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1586
0x80000000|1058, // match move
0x80000000|786, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1587
0x80000000|1, // match move
0x80000000|577, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1588
24,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1589
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1590
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1591
2,910, // ws*
24,MIN_REDUCTION+108, // `[
90,MIN_REDUCTION+108, // "["
94,392, // " "
111,200, // {10}
120,699, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1592
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1593
2,917, // ws*
24,MIN_REDUCTION+108, // `[
90,MIN_REDUCTION+108, // "["
94,393, // " "
111,202, // {10}
120,698, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1594
64,355, // letter
65,803, // "a"
66,803, // "p"
67,803, // "v"
68,803, // "c"
69,803, // "f"
70,803, // "i"
71,803, // "l"
72,803, // "o"
73,803, // "r"
74,803, // "u"
75,803, // "b"
76,803, // "e"
77,803, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,803, // "h"
79,803, // "n"
80,803, // "t"
81,29, // letter128
82,615, // {199..218 231..250}
83,615, // {193..198 225..230}
84,935, // digit
85,128, // {"1".."9"}
86,128, // "0"
87,1605, // digit128
88,139, // {176..185}
108,693, // "_"
118,976, // {223}
121,985, // idChar*
122,356, // $$0
129,927, // idChar
130,1524, // idChar128
  }
,
{ // state 1595
0x80000000|1, // match move
0x80000000|979, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1596
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 1597
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1598
0x80000000|1058, // match move
0x80000000|775, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1599
24,MIN_REDUCTION+151, // `[
90,MIN_REDUCTION+151, // "["
94,393, // " "
111,202, // {10}
120,1252, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1600
0x80000000|823, // match move
0x80000000|617, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1601
0x80000000|1475, // match move
0x80000000|849, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1602
0x80000000|1, // match move
0x80000000|997, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1603
0x80000000|336, // match move
0x80000000|1459, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1604
0x80000000|1475, // match move
0x80000000|851, // no-match move
0x80000000|23, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1605
MIN_REDUCTION+157, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1606][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= <start>
(0<<16)+1,
// <start> ::= ws* <program>
(1<<16)+2,
// <start> ::= <program>
(1<<16)+1,
// <program> ::= <class decl>+
(3<<16)+1,
// <class decl> ::= `class ID `{ <decl in class>* `}
(5<<16)+5,
// <class decl> ::= `class ID `{ `}
(5<<16)+4,
// <decl in class> ::= <method decl>
(11<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(12<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(12<<16)+7,
// <method decl> ::= `public <type> ID `( `) `{ <stmt>* `return <exp> `}
(12<<16)+10,
// <method decl> ::= `public <type> ID `( `) `{ `return <exp> `}
(12<<16)+9,
// <type> ::= `int
(18<<16)+1,
// <type> ::= `boolean
(18<<16)+1,
// <type> ::= ID
(18<<16)+1,
// <type> ::= <type> <empty bracket pair>
(18<<16)+2,
// <empty bracket pair> ::= `[ `]
(23<<16)+2,
// <stmt> ::= <assign> `;
(26<<16)+2,
// <stmt> ::= `break `;
(26<<16)+2,
// <stmt> ::= `;
(26<<16)+1,
// <stmt> ::= `{ <stmt>* `}
(26<<16)+3,
// <stmt> ::= `{ `}
(26<<16)+2,
// <stmt> ::= <local var decl> `;
(26<<16)+2,
// <assign> ::= <exp> `= <exp>
(27<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(30<<16)+4,
// <exp> ::= <exp8>
(20<<16)+1,
// <exp8> ::= <exp8> `|| <exp7>
(32<<16)+3,
// <exp8> ::= <exp7>
(32<<16)+1,
// <exp7> ::= <exp7> `&& <exp6>
(34<<16)+3,
// <exp7> ::= <exp6>
(34<<16)+1,
// <exp6> ::= <exp6> `== <exp5>
(36<<16)+3,
// <exp6> ::= <exp5>
(36<<16)+1,
// <exp5> ::= <exp5> `< <exp4>
(38<<16)+3,
// <exp5> ::= <exp5> `> <exp4>
(38<<16)+3,
// <exp5> ::= <exp5> `instanceof <type>
(38<<16)+3,
// <exp5> ::= <exp4>
(38<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(40<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(40<<16)+3,
// <exp4> ::= <exp3>
(40<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(44<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(44<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(44<<16)+3,
// <exp3> ::= <exp2>
(44<<16)+1,
// <exp2> ::= `! <exp1>
(47<<16)+2,
// <exp2> ::= <cast exp>
(47<<16)+1,
// <exp2> ::= <unary exp>
(47<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(52<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(52<<16)+4,
// <unary exp> ::= `- <unary exp>
(53<<16)+2,
// <unary exp> ::= `+ <unary exp>
(53<<16)+2,
// <unary exp> ::= <exp1>
(53<<16)+1,
// <exp1> ::= ID
(51<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(51<<16)+4,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] <empty bracket pair>*
(51<<16)+6,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `]
(51<<16)+5,
// <exp1> ::= INTLIT
(51<<16)+1,
// <exp1> ::= CHARLIT
(51<<16)+1,
// <exp1> ::= STRINGLIT
(51<<16)+1,
// <exp1> ::= `true
(51<<16)+1,
// <exp1> ::= `false
(51<<16)+1,
// <exp1> ::= `this
(51<<16)+1,
// <exp1> ::= `null
(51<<16)+1,
// <exp1> ::= <exp1> `. ID
(51<<16)+3,
// <exp1> ::= `new <type> `( `)
(51<<16)+4,
// letter ::= {"A".."Z" "a".."z"}
(64<<16)+1,
// letter128 ::= {193..218 225..250}
(81<<16)+1,
// digit ::= {"0".."9"}
(84<<16)+1,
// digit128 ::= {176..185}
(87<<16)+1,
// any ::= {0..127}
(89<<16)+1,
// any128 ::= {128..255}
(117<<16)+1,
// ws ::= " "
(120<<16)+1,
// ws ::= {10}
(120<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(22<<16)+4,
// `boolean ::= "#" "b" "o"
(22<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(21<<16)+4,
// `int ::= "#" "i" "t"
(21<<16)+3,
// `break ::= "#" "b" "r" ws*
(29<<16)+4,
// `break ::= "#" "b" "r"
(29<<16)+3,
// `this ::= "#" "t" "h" ws*
(61<<16)+4,
// `this ::= "#" "t" "h"
(61<<16)+3,
// `false ::= "#" "f" "a" ws*
(60<<16)+4,
// `false ::= "#" "f" "a"
(60<<16)+3,
// `true ::= "#" "t" "r" ws*
(59<<16)+4,
// `true ::= "#" "t" "r"
(59<<16)+3,
// `null ::= "#" "n" "u" ws*
(62<<16)+4,
// `null ::= "#" "n" "u"
(62<<16)+3,
// `return ::= "#" "r" "e" ws*
(19<<16)+4,
// `return ::= "#" "r" "e"
(19<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(42<<16)+4,
// `instanceof ::= "#" "i" "n"
(42<<16)+3,
// `new ::= "#" "n" "e" ws*
(54<<16)+4,
// `new ::= "#" "n" "e"
(54<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `! ::= "!" ws*
(50<<16)+2,
// `! ::= "!"
(50<<16)+1,
// `% ::= "%" ws*
(49<<16)+2,
// `% ::= "%"
(49<<16)+1,
// `&& ::= "@" "&" ws*
(35<<16)+3,
// `&& ::= "@" "&"
(35<<16)+2,
// `* ::= "*" ws*
(46<<16)+2,
// `* ::= "*"
(46<<16)+1,
// `( ::= "(" ws*
(15<<16)+2,
// `( ::= "("
(15<<16)+1,
// `) ::= ")" ws*
(16<<16)+2,
// `) ::= ")"
(16<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(45<<16)+2,
// `- ::= "-"
(45<<16)+1,
// `+ ::= "+" ws*
(43<<16)+2,
// `+ ::= "+"
(43<<16)+1,
// `= ::= "=" ws*
(31<<16)+2,
// `= ::= "="
(31<<16)+1,
// `== ::= "@" "=" ws*
(37<<16)+3,
// `== ::= "@" "="
(37<<16)+2,
// `[ ::= "[" ws*
(24<<16)+2,
// `[ ::= "["
(24<<16)+1,
// `] ::= "]" ws*
(25<<16)+2,
// `] ::= "]"
(25<<16)+1,
// `|| ::= "@" "|" ws*
(33<<16)+3,
// `|| ::= "@" "|"
(33<<16)+2,
// `< ::= "<" ws*
(39<<16)+2,
// `< ::= "<"
(39<<16)+1,
// `> ::= ">" !"=" ws*
(41<<16)+2,
// `> ::= ">" !"="
(41<<16)+1,
// `. ::= "." ws*
(63<<16)+2,
// `. ::= "."
(63<<16)+1,
// `; ::= ";" ws*
(28<<16)+2,
// `; ::= ";"
(28<<16)+1,
// `/ ::= "/" ws*
(48<<16)+2,
// `/ ::= "/"
(48<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(56<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(56<<16)+2,
// INTLIT ::= digit128 ws*
(56<<16)+2,
// INTLIT ::= digit128
(56<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(56<<16)+3,
// INTLIT ::= "0" $$2
(56<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(58<<16)+3,
// STRINGLIT ::= "@" '"'
(58<<16)+2,
// STRINGLIT ::= '"' any* $$3
(58<<16)+3,
// STRINGLIT ::= '"' $$3
(58<<16)+2,
// CHARLIT ::= "'" any ws*
(57<<16)+3,
// CHARLIT ::= "'" any
(57<<16)+2,
// idChar ::= letter
(129<<16)+1,
// idChar ::= digit
(129<<16)+1,
// idChar ::= "_"
(129<<16)+1,
// idChar128 ::= letter128
(130<<16)+1,
// idChar128 ::= digit128
(130<<16)+1,
// idChar128 ::= {223}
(130<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(131<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(132<<16)+1,
// digit* ::= digit* digit
(123<<16)+2,
// digit* ::= digit
(123<<16)+1,
// any* ::= any* any
(127<<16)+2,
// any* ::= any
(127<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(125<<16)+2,
// hexDigit* ::= hexDigit
(125<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// idChar* ::= idChar* idChar
(121<<16)+2,
// idChar* ::= idChar
(121<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>
(55<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>
(55<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(122<<16)+2,
// $$0 ::= idChar128
(122<<16)+1,
// $$1 ::= digit128 ws*
(124<<16)+2,
// $$1 ::= digit128
(124<<16)+1,
// $$2 ::= hexDigit128 ws*
(126<<16)+2,
// $$2 ::= hexDigit128
(126<<16)+1,
// $$3 ::= any128 ws*
(128<<16)+2,
// $$3 ::= any128
(128<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
101, // 0
101, // 1
101, // 2
101, // 3
101, // 4
101, // 5
101, // 6
101, // 7
101, // 8
101, // 9
111, // 10
101, // 11
101, // 12
101, // 13
101, // 14
101, // 15
101, // 16
101, // 17
101, // 18
101, // 19
101, // 20
101, // 21
101, // 22
101, // 23
101, // 24
101, // 25
101, // 26
101, // 27
101, // 28
101, // 29
101, // 30
101, // 31
94, // " "
113, // "!"
115, // '"'
95, // "#"
101, // "$"
104, // "%"
96, // "&"
114, // "'"
105, // "("
97, // ")"
116, // "*"
106, // "+"
101, // ","
91, // "-"
107, // "."
99, // "/"
86, // "0"
85, // "1"
85, // "2"
85, // "3"
85, // "4"
85, // "5"
85, // "6"
85, // "7"
85, // "8"
85, // "9"
101, // ":"
100, // ";"
92, // "<"
109, // "="
102, // ">"
101, // "?"
110, // "@"
77, // "A"
77, // "B"
77, // "C"
77, // "D"
77, // "E"
77, // "F"
77, // "G"
77, // "H"
77, // "I"
77, // "J"
77, // "K"
77, // "L"
77, // "M"
77, // "N"
77, // "O"
77, // "P"
77, // "Q"
77, // "R"
77, // "S"
77, // "T"
77, // "U"
77, // "V"
77, // "W"
77, // "X"
77, // "Y"
77, // "Z"
90, // "["
101, // "\"
98, // "]"
101, // "^"
108, // "_"
101, // "`"
65, // "a"
75, // "b"
68, // "c"
77, // "d"
76, // "e"
69, // "f"
77, // "g"
78, // "h"
70, // "i"
77, // "j"
77, // "k"
71, // "l"
77, // "m"
79, // "n"
72, // "o"
66, // "p"
77, // "q"
73, // "r"
77, // "s"
80, // "t"
74, // "u"
67, // "v"
77, // "w"
77, // "x"
77, // "y"
77, // "z"
103, // "{"
93, // "|"
112, // "}"
101, // "~"
101, // 127
119, // 128
119, // 129
119, // 130
119, // 131
119, // 132
119, // 133
119, // 134
119, // 135
119, // 136
119, // 137
119, // 138
119, // 139
119, // 140
119, // 141
119, // 142
119, // 143
119, // 144
119, // 145
119, // 146
119, // 147
119, // 148
119, // 149
119, // 150
119, // 151
119, // 152
119, // 153
119, // 154
119, // 155
119, // 156
119, // 157
119, // 158
119, // 159
119, // 160
119, // 161
119, // 162
119, // 163
119, // 164
119, // 165
119, // 166
119, // 167
119, // 168
119, // 169
119, // 170
119, // 171
119, // 172
119, // 173
119, // 174
119, // 175
88, // 176
88, // 177
88, // 178
88, // 179
88, // 180
88, // 181
88, // 182
88, // 183
88, // 184
88, // 185
119, // 186
119, // 187
119, // 188
119, // 189
119, // 190
119, // 191
119, // 192
83, // 193
83, // 194
83, // 195
83, // 196
83, // 197
83, // 198
82, // 199
82, // 200
82, // 201
82, // 202
82, // 203
82, // 204
82, // 205
82, // 206
82, // 207
82, // 208
82, // 209
82, // 210
82, // 211
82, // 212
82, // 213
82, // 214
82, // 215
82, // 216
82, // 217
82, // 218
119, // 219
119, // 220
119, // 221
119, // 222
118, // 223
119, // 224
83, // 225
83, // 226
83, // 227
83, // 228
83, // 229
83, // 230
82, // 231
82, // 232
82, // 233
82, // 234
82, // 235
82, // 236
82, // 237
82, // 238
82, // 239
82, // 240
82, // 241
82, // 242
82, // 243
82, // 244
82, // 245
82, // 246
82, // 247
82, // 248
82, // 249
82, // 250
119, // 251
119, // 252
119, // 253
119, // 254
119, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"", // 1
"", // 2
"", // 3
"", // 4
"", // 5
"", // 6
"", // 7
"", // 8
"", // 9
"", // 10
"", // 11
"", // 12
"", // 13
"", // 14
"", // 15
"", // 16
"", // 17
"", // 18
"", // 19
"", // 20
"", // 21
"", // 22
"", // 23
"", // 24
"", // 25
"", // 26
"", // 27
"", // 28
"", // 29
"", // 30
"", // 31
"", // 32
"", // 33
"", // 34
"", // 35
"", // 36
"", // 37
"", // 38
"", // 39
"", // 40
"", // 41
"", // 42
"", // 43
"", // 44
"", // 45
"", // 46
"", // 47
"", // 48
"", // 49
"", // 50
"", // 51
"", // 52
"", // 53
"", // 54
"", // 55
"", // 56
"", // 57
"", // 58
"", // 59
"", // 60
"", // 61
"", // 62
"", // 63
"", // 64
"", // 65
"", // 66
"", // 67
"", // 68
"", // 69
"", // 70
"", // 71
"", // 72
"", // 73
"", // 74
"", // 75
"", // 76
"", // 77
"", // 78
"", // 79
"", // 80
"", // 81
"", // 82
"", // 83
"", // 84
"", // 85
"", // 86
"", // 87
"", // 88
"", // 89
"", // 90
"", // 91
"", // 92
"", // 93
"", // 94
"", // 95
"", // 96
"", // 97
"", // 98
"", // 99
"", // 100
"", // 101
"", // 102
"", // 103
"", // 104
"", // 105
"", // 106
"", // 107
"", // 108
"", // 109
"", // 110
"", // 111
"", // 112
"", // 113
"", // 114
"", // 115
"", // 116
"", // 117
"", // 118
"", // 119
"", // 120
"", // 121
"", // 122
"", // 123
"", // 124
"", // 125
"", // 126
"", // 127
"", // 128
"", // 129
"", // 130
"", // 131
"", // 132
"", // 133
"", // 134
"", // 135
"", // 136
"", // 137
"", // 138
"", // 139
"", // 140
"", // 141
"", // 142
"", // 143
"", // 144
"", // 145
"", // 146
"", // 147
"", // 148
"", // 149
"", // 150
"", // 151
"", // 152
"", // 153
"", // 154
"", // 155
"", // 156
"", // 157
"", // 158
"", // 159
"", // 160
"digit* ::= digit* digit", // 161
"digit* ::= digit* digit", // 162
"any* ::= any* any", // 163
"any* ::= any* any", // 164
"<decl in class>* ::= <decl in class>* <decl in class>", // 165
"<decl in class>* ::= <decl in class>* <decl in class>", // 166
"hexDigit* ::= hexDigit* hexDigit", // 167
"hexDigit* ::= hexDigit* hexDigit", // 168
"<stmt>* ::= <stmt>* <stmt>", // 169
"<stmt>* ::= <stmt>* <stmt>", // 170
"idChar* ::= idChar* idChar", // 171
"idChar* ::= idChar* idChar", // 172
"<class decl>+ ::= <class decl>", // 173
"<class decl>+ ::= <class decl>+ <class decl>", // 174
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 175
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 176
"ws* ::= ws* ws", // 177
"ws* ::= ws* ws", // 178
"", // 179
"", // 180
"", // 181
"", // 182
"", // 183
"", // 184
"", // 185
"", // 186
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= <start> @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: <start> ::= ws* <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 2: <start> ::= [ws*] <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 7: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <method decl> ::= `public [#] <type> ID `( `) `{ <stmt>* `return <exp> `} @createMethodDeclVoid(int,Type,String,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <method decl> ::= `public [#] <type> ID `( `) `{ [<stmt>*] `return <exp> `} @createMethodDeclVoid(int,Type,String,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 12: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 13: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 14: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 15: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 16: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 17: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 18: <stmt> ::= `; @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 19: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 20: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 21: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 22: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 23: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 24: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <exp8> ::= <exp8> [#] `|| <exp7> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 26: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <exp7> ::= <exp7> [#] `&& <exp6> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 28: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp6> ::= <exp6> [#] `== <exp5> @newEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 30: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <exp5> ::= <exp5> [#] `< <exp4> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 32: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 33: <exp5> ::= <exp5> [#] `instanceof <type> @newInstanceOf(Exp,int,Type)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 34: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 36: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 37: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 39: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 40: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 41: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <exp2> ::= [#] `! <exp1> @newNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 43: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 44: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 45: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 46: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 47: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 48: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 49: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 50: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 51: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 52: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] <empty bracket pair>* @newArray(Type,int,Exp,List<Object>)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 53: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] [<empty bracket pair>*] @newArray(Type,int,Exp,List<Object>)=>Exp
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 54: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 55: <exp1> ::= [#] CHARLIT @newCharacterLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 56: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 57: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 58: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 59: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 60: <exp1> ::= [#] `null @newNull(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 61: <exp1> ::= <exp1> `. [#] ID @newInstVarAccess(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 62: <exp1> ::= `new [#] <type> `( `) @newObject(int,Type)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 63: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 64: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 65: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 66: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 67: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 68: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 69: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: ws ::= {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 72: `boolean ::= "#" "b" "o" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 73: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 74: `class ::= "#" "c" "l" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 75: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 76: `void ::= "#" "v" "o" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 77: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 78: `int ::= "#" "i" "t" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 79: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 80: `break ::= "#" "b" "r" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 81: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 82: `this ::= "#" "t" "h" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 83: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 84: `false ::= "#" "f" "a" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 85: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `true ::= "#" "t" "r" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `null ::= "#" "n" "u" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `return ::= "#" "r" "e" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 91: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 92: `instanceof ::= "#" "i" "n" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 93: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `new ::= "#" "n" "e" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 95: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 96: `public ::= "#" "p" "u" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 97: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `! ::= "!" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 100: `% ::= "%" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 101: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 102: `&& ::= "@" "&" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 103: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 104: `* ::= "*" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 105: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 106: `( ::= "(" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 107: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 108: `) ::= ")" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: `{ ::= "{" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: `} ::= "}" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `- ::= "-" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `+ ::= "+" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `= ::= "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 120: `== ::= "@" "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 121: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `[ ::= "[" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `] ::= "]" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 126: `|| ::= "@" "|" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 127: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `< ::= "<" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `> ::= ">" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `. ::= "." [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `; ::= ";" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `/ ::= "/" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 138: ID ::= letter128 [ws*] @text
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 139: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 140: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 141: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 142: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 143: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 144: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 145: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 146: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 147: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 148: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 149: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 150: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 151: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 152: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 153: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 154: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 155: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 156: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 157: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 158: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 159: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 160: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 161: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 162: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 163: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 164: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 165: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 166: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 167: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 168: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 169: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 170: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 171: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 172: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 173: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 174: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 175: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 176: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 177: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 178: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 179: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 180: $$0 ::= idChar128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 181: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 182: $$1 ::= digit128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 183: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 184: $$2 ::= hexDigit128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 185: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 186: $$3 ::= any128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "<empty bracket pair>* ::=", // <empty bracket pair>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <empty bracket pair>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // any*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      Program parm0 = (Program)si.popPb();
      actionObject.topLevel(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      List<ClassDecl> parm1 = (List<ClassDecl>)si.popPb();
      Program result = actionObject.createProgram(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Decl> parm2 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      String parm2 = (String)si.popPb();
      List<Statement> parm3 = (List<Statement>)si.popPb();
      Exp parm4 = (Exp)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 11: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 13: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Type parm2 = (Type)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 29: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      List<Object> parm3 = (List<Object>)si.popPb();
      Exp result = actionObject.newArray(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharacterLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNull(parm0);
      si.pushPb(result);
    }
    break;
    case 38: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp result = actionObject.newObject(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 40: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 41: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 42: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 43: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 44: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 45: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 46: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 47: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,List<Statement>)",
"Decl createMethodDeclVoid(int,Type,String,List<Statement>,Exp)",
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBreak(int)",
"Statement newBlock(int,List<Statement>)",
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
"Exp newOr(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newEquals(Exp,int,Exp)",
"Exp newLessThan(Exp,int,Exp)",
"Exp newGreaterThan(Exp,int,Exp)",
"Exp newInstanceOf(Exp,int,Type)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newRemainder(Exp,int,Exp)",
"Exp newNot(int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryPlus(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newArray(Type,int,Exp,List<Object>)",
"Exp newIntegerLiteral(int,int)",
"Exp newCharacterLiteral(int,int)",
"Exp newStringLiteral(int,String)",
"Exp newTrue(int)",
"Exp newFalse(int)",
"Exp newThis(int)",
"Exp newNull(int)",
"Exp newInstVarAccess(Exp,int,String)",
"Exp newObject(int,Type)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"String emptyString(char,char)",
"String string(char,List<Character>,char)",
"int charVal(char,char)",
"char underscore(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
2,1,
3,1,
3,1,
5,1,
1,1,
1,1,
2,1,
3,1,
1,1,
2,1,
3,1,
4,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
2,1,
3,1,
2,1,
2,1,
2,1,
3,1,
4,1,
2,1,
2,1,
2,1,
1,1,
1,1,
1,1,
1,1,
3,1,
2,1,
1,1,
3,1,
1,1,
3,1,
2,1,
3,1,
2,1,
1,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    0,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.ArrayList<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
