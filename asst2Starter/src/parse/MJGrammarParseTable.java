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
"`;",
"`int",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
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
private static final int MIN_REDUCTION = 1323;
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
1,598, // <start>
2,898, // ws*
3,942, // <program>
4,641, // <class decl>+
5,1089, // <class decl>
6,894, // `class
94,826, // " "
95,231, // "#"
111,631, // {10}
120,1179, // ws
  }
,
{ // state 1
  }
,
{ // state 2
21,806, // `;
100,930, // ";"
  }
,
{ // state 3
94,120, // " "
111,1300, // {10}
120,975, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 4
0x80000000|1, // match move
0x80000000|1095, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 5
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 6
70,843, // "i"
75,789, // "b"
  }
,
{ // state 7
0x80000000|1, // match move
0x80000000|366, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 8
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 9
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 10
2,776, // ws*
94,1245, // " "
111,1162, // {10}
120,105, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 11
7,167, // ID
15,458, // `(
40,1132, // <exp4>
43,704, // `+
44,796, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 12
10,794, // `}
112,1254, // "}"
  }
,
{ // state 13
25,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 14
31,197, // `=
109,186, // "="
  }
,
{ // state 15
25,MIN_REDUCTION+156, // `[
90,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 17
2,1202, // ws*
  }
,
{ // state 18
39,131, // `<
41,41, // `>
42,683, // `instanceof
92,948, // "<"
95,275, // "#"
102,100, // ">"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 20
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 21
25,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
94,513, // " "
111,304, // {10}
120,36, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 22
7,167, // ID
15,458, // `(
40,923, // <exp4>
43,704, // `+
44,796, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 23
94,835, // " "
111,172, // {10}
120,508, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 25
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 26
25,MIN_REDUCTION+156, // `[
90,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 27
25,MIN_REDUCTION+156, // `[
90,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 28
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 29
94,955, // " "
111,205, // {10}
120,525, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 30
2,1202, // ws*
25,MIN_REDUCTION+181, // `[
90,MIN_REDUCTION+181, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 31
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 33
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 34
2,345, // ws*
94,316, // " "
111,719, // {10}
120,1272, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 35
25,1115, // `[
90,305, // "["
  }
,
{ // state 36
0x80000000|413, // match move
0x80000000|802, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 37
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 38
2,1286, // ws*
94,1221, // " "
111,1144, // {10}
120,122, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 39
7,226, // ID
15,395, // `(
40,830, // <exp4>
43,734, // `+
44,890, // <exp3>
45,1289, // `-
47,864, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 40
25,MIN_REDUCTION+156, // `[
90,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 41
7,147, // ID
15,411, // `(
40,833, // <exp4>
43,723, // `+
44,878, // <exp3>
45,1287, // `-
47,865, // <exp2>
50,522, // `!
51,994, // <exp1>
52,341, // <cast exp>
53,199, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
105,347, // "("
106,436, // "+"
110,1232, // "@"
113,69, // "!"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 42
2,1282, // ws*
94,1223, // " "
111,1145, // {10}
120,124, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 43
0x80000000|1, // match move
0x80000000|488, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 44
26,748, // `]
98,983, // "]"
  }
,
{ // state 45
94,835, // " "
111,172, // {10}
120,508, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 46
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 47
0x80000000|1, // match move
0x80000000|510, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 48
25,MIN_REDUCTION+54, // `[
90,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 49
94,1001, // " "
111,160, // {10}
120,1218, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 50
25,MIN_REDUCTION+54, // `[
90,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 52
2,1284, // ws*
25,MIN_REDUCTION+181, // `[
90,MIN_REDUCTION+181, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 57
94,293, // " "
111,1060, // {10}
120,24, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 58
70,953, // "i"
75,179, // "b"
  }
,
{ // state 59
0x80000000|1, // match move
0x80000000|368, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 60
2,1240, // ws*
25,MIN_REDUCTION+181, // `[
90,MIN_REDUCTION+181, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 61
84,1042, // digit
85,1094, // {"1".."9"}
86,1094, // "0"
87,672, // digit128
88,837, // {176..185}
124,838, // $$1
  }
,
{ // state 62
72,402, // "o"
  }
,
{ // state 63
84,1042, // digit
85,1094, // {"1".."9"}
86,1094, // "0"
87,668, // digit128
88,836, // {176..185}
124,841, // $$1
  }
,
{ // state 64
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 65
0x80000000|354, // match move
0x80000000|586, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 66
21,1304, // `;
100,872, // ";"
  }
,
{ // state 67
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 68
94,1160, // " "
111,67, // {10}
120,1029, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 69
2,750, // ws*
94,81, // " "
111,1252, // {10}
120,868, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 72
0x80000000|1259, // match move
0x80000000|1112, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 73
25,MIN_REDUCTION+66, // `[
90,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 74
25,MIN_REDUCTION+66, // `[
90,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 75
0x80000000|1154, // match move
0x80000000|790, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 76
0x80000000|1154, // match move
0x80000000|781, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 77
93,773, // "|"
96,1303, // "&"
109,1306, // "="
  }
,
{ // state 78
25,MIN_REDUCTION+122, // `[
90,MIN_REDUCTION+122, // "["
94,1137, // " "
111,282, // {10}
120,249, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 80
72,404, // "o"
  }
,
{ // state 81
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 82
94,746, // " "
111,534, // {10}
120,1006, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 83
0x80000000|1259, // match move
0x80000000|1114, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 84
94,1149, // " "
111,1070, // {10}
120,95, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 85
25,MIN_REDUCTION+122, // `[
90,MIN_REDUCTION+122, // "["
94,1134, // " "
111,276, // {10}
120,247, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 86
84,1042, // digit
85,1094, // {"1".."9"}
86,1094, // "0"
87,331, // digit128
88,521, // {176..185}
124,857, // $$1
  }
,
{ // state 87
2,99, // ws*
94,120, // " "
111,1300, // {10}
120,539, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 88
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 89
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 90
0x80000000|1259, // match move
0x80000000|1119, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 91
0x80000000|936, // match move
0x80000000|1219, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 92
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 93
25,MIN_REDUCTION+66, // `[
90,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 94
0x80000000|1154, // match move
0x80000000|810, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 95
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 96
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 97
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1293, // ID
1133, // `{
-1, // <decl in class>*
28, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
411, // `(
-1, // `)
962, // <stmt>*
645, // <type>
-1, // `return
14, // <exp>
423, // `;
1280, // `int
1107, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
673, // <stmt>
951, // <assign>
2, // `break
348, // <local var decl>
-1, // `=
722, // <exp8>
-1, // `||
1212, // <exp7>
-1, // `&&
1150, // <exp6>
-1, // `==
1105, // <exp5>
-1, // `<
290, // <exp4>
-1, // `>
-1, // `instanceof
723, // `+
878, // <exp3>
1287, // `-
-1, // `*
865, // <exp2>
-1, // `/
-1, // `%
522, // `!
994, // <exp1>
341, // <cast exp>
199, // <unary exp>
355, // `new
-1, // <empty bracket pair>*
906, // INTLIT
856, // CHARLIT
1182, // STRINGLIT
361, // `true
1033, // `false
461, // `this
623, // `null
-1, // `.
1031, // letter
804, // "a"
804, // "p"
804, // "v"
804, // "c"
804, // "f"
804, // "i"
804, // "l"
804, // "o"
804, // "r"
804, // "u"
804, // "b"
804, // "e"
804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
804, // "h"
804, // "n"
804, // "t"
832, // letter128
360, // {199..218 231..250}
360, // {193..198 225..230}
-1, // digit
1224, // {"1".."9"}
377, // "0"
601, // digit128
837, // {176..185}
-1, // any
-1, // "["
556, // "-"
-1, // "<"
-1, // "|"
-1, // " "
1046, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
930, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
799, // "{"
-1, // "%"
347, // "("
436, // "+"
-1, // "."
-1, // "_"
-1, // "="
1232, // "@"
-1, // {10}
578, // "}"
69, // "!"
1109, // "'"
889, // '"'
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
{ // state 98
25,MIN_REDUCTION+180, // `[
90,MIN_REDUCTION+180, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 99
94,120, // " "
111,1300, // {10}
120,975, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 100
0x80000000|1, // match move
0x80000000|1130, // no-match move
// T-test match for "=":
109,
  }
,
{ // state 101
25,MIN_REDUCTION+50, // `[
90,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 102
25,MIN_REDUCTION+180, // `[
90,MIN_REDUCTION+180, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 103
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 104
25,MIN_REDUCTION+67, // `[
90,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 106
0x80000000|374, // match move
0x80000000|490, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 107
0x80000000|801, // match move
0x80000000|216, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 108
0x80000000|379, // match move
0x80000000|484, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 109
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 110
0x80000000|1214, // match move
0x80000000|1052, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 111
0x80000000|1, // match move
0x80000000|406, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 113
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 114
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 115
26,531, // `]
98,848, // "]"
  }
,
{ // state 116
39,137, // `<
41,39, // `>
42,684, // `instanceof
92,948, // "<"
95,275, // "#"
102,100, // ">"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 117
7,167, // ID
15,458, // `(
34,390, // <exp7>
36,163, // <exp6>
38,1167, // <exp5>
40,189, // <exp4>
43,704, // `+
44,796, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 118
25,MIN_REDUCTION+122, // `[
90,MIN_REDUCTION+122, // "["
94,1158, // " "
111,268, // {10}
120,223, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 119
25,MIN_REDUCTION+50, // `[
90,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 120
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 121
25,MIN_REDUCTION+50, // `[
90,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 123
25,MIN_REDUCTION+67, // `[
90,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 126
25,MIN_REDUCTION+67, // `[
90,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 127
0x80000000|234, // match move
0x80000000|547, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 128
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 130
0x80000000|476, // match move
0x80000000|1236, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 131
7,147, // ID
15,411, // `(
40,1220, // <exp4>
43,723, // `+
44,878, // <exp3>
45,1287, // `-
47,865, // <exp2>
50,522, // `!
51,994, // <exp1>
52,341, // <cast exp>
53,199, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
105,347, // "("
106,436, // "+"
110,1232, // "@"
113,69, // "!"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 132
0x80000000|1, // match move
0x80000000|632, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 133
25,MIN_REDUCTION+155, // `[
90,MIN_REDUCTION+155, // "["
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 134
7,535, // ID
64,1097, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,422, // letter128
82,1019, // {199..218 231..250}
83,1019, // {193..198 225..230}
  }
,
{ // state 135
26,497, // `]
98,759, // "]"
  }
,
{ // state 136
26,500, // `]
98,710, // "]"
  }
,
{ // state 137
7,226, // ID
15,395, // `(
40,1239, // <exp4>
43,734, // `+
44,890, // <exp3>
45,1289, // `-
47,864, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 138
25,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 139
7,226, // ID
15,395, // `(
34,448, // <exp7>
36,1140, // <exp6>
38,232, // <exp5>
40,299, // <exp4>
43,734, // `+
44,890, // <exp3>
45,1289, // `-
47,864, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 140
25,MIN_REDUCTION+180, // `[
90,MIN_REDUCTION+180, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 141
7,147, // ID
15,411, // `(
34,441, // <exp7>
36,1150, // <exp6>
38,1105, // <exp5>
40,290, // <exp4>
43,723, // `+
44,878, // <exp3>
45,1287, // `-
47,865, // <exp2>
50,522, // `!
51,994, // <exp1>
52,341, // <cast exp>
53,199, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
105,347, // "("
106,436, // "+"
110,1232, // "@"
113,69, // "!"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 142
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 143
2,1240, // ws*
  }
,
{ // state 144
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 145
25,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 146
2,1284, // ws*
  }
,
{ // state 147
0x80000000|1, // match move
0x80000000|119, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 148
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 149
2,674, // ws*
  }
,
{ // state 150
2,1078, // ws*
25,MIN_REDUCTION+179, // `[
90,MIN_REDUCTION+179, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 151
0x80000000|636, // match move
0x80000000|419, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 152
25,MIN_REDUCTION+61, // `[
90,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 153
16,812, // `)
97,1241, // ")"
  }
,
{ // state 154
25,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 155
25,MIN_REDUCTION+63, // `[
90,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 156
25,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 157
0x80000000|634, // match move
0x80000000|427, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 158
25,MIN_REDUCTION+63, // `[
90,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 159
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1250, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1310, // digit128
88,521, // {176..185}
108,1205, // "_"
118,845, // {223}
122,902, // $$0
129,1243, // idChar
130,239, // idChar128
  }
,
{ // state 160
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 162
25,MIN_REDUCTION+122, // `[
90,MIN_REDUCTION+122, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 163
37,425, // `==
110,77, // "@"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 164
2,659, // ws*
  }
,
{ // state 165
25,MIN_REDUCTION+122, // `[
90,MIN_REDUCTION+122, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 166
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 167
0x80000000|1, // match move
0x80000000|101, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 168
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 169
2,515, // ws*
94,1223, // " "
111,1145, // {10}
120,124, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 170
2,791, // ws*
25,MIN_REDUCTION+143, // `[
90,MIN_REDUCTION+143, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 171
0x80000000|1, // match move
0x80000000|1226, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 172
0x80000000|1017, // match move
0x80000000|925, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 173
0x80000000|1, // match move
0x80000000|1230, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 174
0x80000000|1214, // match move
0x80000000|1022, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 175
25,MIN_REDUCTION+61, // `[
90,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 176
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 177
0x80000000|1214, // match move
0x80000000|1026, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 178
25,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 179
72,380, // "o"
  }
,
{ // state 180
65,1139, // "a"
  }
,
{ // state 181
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 182
25,MIN_REDUCTION+61, // `[
90,MIN_REDUCTION+61, // "["
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 183
0x80000000|605, // match move
0x80000000|469, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 184
25,MIN_REDUCTION+157, // `[
90,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 185
2,1093, // ws*
25,MIN_REDUCTION+179, // `[
90,MIN_REDUCTION+179, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 186
2,321, // ws*
94,979, // " "
111,113, // {10}
120,696, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 187
25,400, // `[
63,1126, // `.
90,1129, // "["
107,1147, // "."
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 189
43,336, // `+
45,707, // `-
91,87, // "-"
106,677, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 190
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1190, // letter128
82,827, // {199..218 231..250}
83,827, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1225, // digit128
88,548, // {176..185}
108,1205, // "_"
118,909, // {223}
121,1073, // idChar*
122,286, // $$0
129,240, // idChar
130,10, // idChar128
  }
,
{ // state 191
0x80000000|1, // match move
0x80000000|658, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 192
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 194
2,678, // ws*
94,746, // " "
111,534, // {10}
120,933, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 195
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 196
0x80000000|481, // match move
0x80000000|831, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 197
7,226, // ID
15,395, // `(
20,1249, // <exp>
32,726, // <exp8>
34,1216, // <exp7>
36,1140, // <exp6>
38,232, // <exp5>
40,299, // <exp4>
43,734, // `+
44,890, // <exp3>
45,1289, // `-
47,864, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 198
25,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 199
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 200
65,1151, // "a"
  }
,
{ // state 201
94,31, // " "
111,166, // {10}
120,71, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 202
0x80000000|1269, // match move
0x80000000|599, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 203
25,401, // `[
63,1125, // `.
90,1129, // "["
107,1147, // "."
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 204
2,517, // ws*
94,1221, // " "
111,1144, // {10}
120,122, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 206
2,743, // ws*
25,MIN_REDUCTION+143, // `[
90,MIN_REDUCTION+143, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 208
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 210
0x80000000|1, // match move
0x80000000|687, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 211
0x80000000|1276, // match move
0x80000000|597, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 212
0x80000000|1, // match move
0x80000000|686, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 213
67,1038, // "v"
70,648, // "i"
75,514, // "b"
  }
,
{ // state 214
25,MIN_REDUCTION+63, // `[
90,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 215
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1273, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1294, // digit128
88,837, // {176..185}
108,1205, // "_"
118,862, // {223}
122,876, // $$0
129,1243, // idChar
130,279, // idChar128
  }
,
{ // state 216
25,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 217
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1264, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1291, // digit128
88,836, // {176..185}
108,1205, // "_"
118,860, // {223}
122,871, // $$0
129,1243, // idChar
130,277, // idChar128
  }
,
{ // state 218
94,1160, // " "
111,67, // {10}
120,1029, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 219
2,1106, // ws*
94,675, // " "
111,19, // {10}
120,477, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 220
10,934, // `}
11,323, // <decl in class>
12,188, // <method decl>
13,808, // `public
95,609, // "#"
112,254, // "}"
  }
,
{ // state 221
0x80000000|869, // match move
0x80000000|656, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 222
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 223
0x80000000|913, // match move
0x80000000|13, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 224
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 225
0x80000000|88, // match move
0x80000000|998, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 226
0x80000000|1, // match move
0x80000000|121, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 227
0x80000000|241, // match move
0x80000000|1136, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 228
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1063, // letter128
82,1010, // {199..218 231..250}
83,1010, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1201, // digit128
88,947, // {176..185}
108,1205, // "_"
118,867, // {223}
122,652, // $$0
129,1243, // idChar
130,1079, // idChar128
  }
,
{ // state 229
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 230
25,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 231
68,1045, // "c"
  }
,
{ // state 232
39,137, // `<
41,39, // `>
42,684, // `instanceof
92,948, // "<"
95,275, // "#"
102,100, // ">"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 234
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 235
93,773, // "|"
  }
,
{ // state 236
25,MIN_REDUCTION+157, // `[
90,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 237
25,MIN_REDUCTION+157, // `[
90,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 238
0x80000000|1, // match move
0x80000000|633, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 239
0x80000000|267, // match move
0x80000000|1131, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 241
2,418, // ws*
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 242
2,1093, // ws*
  }
,
{ // state 243
2,1078, // ws*
  }
,
{ // state 244
94,144, // " "
111,1315, // {10}
120,958, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 245
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1293, // ID
1133, // `{
-1, // <decl in class>*
312, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
411, // `(
-1, // `)
-1, // <stmt>*
645, // <type>
-1, // `return
14, // <exp>
423, // `;
1280, // `int
1107, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
829, // <stmt>
951, // <assign>
2, // `break
348, // <local var decl>
-1, // `=
722, // <exp8>
-1, // `||
1212, // <exp7>
-1, // `&&
1150, // <exp6>
-1, // `==
1105, // <exp5>
-1, // `<
290, // <exp4>
-1, // `>
-1, // `instanceof
723, // `+
878, // <exp3>
1287, // `-
-1, // `*
865, // <exp2>
-1, // `/
-1, // `%
522, // `!
994, // <exp1>
341, // <cast exp>
199, // <unary exp>
355, // `new
-1, // <empty bracket pair>*
906, // INTLIT
856, // CHARLIT
1182, // STRINGLIT
361, // `true
1033, // `false
461, // `this
623, // `null
-1, // `.
1031, // letter
804, // "a"
804, // "p"
804, // "v"
804, // "c"
804, // "f"
804, // "i"
804, // "l"
804, // "o"
804, // "r"
804, // "u"
804, // "b"
804, // "e"
804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
804, // "h"
804, // "n"
804, // "t"
832, // letter128
360, // {199..218 231..250}
360, // {193..198 225..230}
-1, // digit
1224, // {"1".."9"}
377, // "0"
601, // digit128
837, // {176..185}
-1, // any
-1, // "["
556, // "-"
-1, // "<"
-1, // "|"
-1, // " "
1046, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
930, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
799, // "{"
-1, // "%"
347, // "("
436, // "+"
-1, // "."
-1, // "_"
-1, // "="
1232, // "@"
-1, // {10}
1254, // "}"
69, // "!"
1109, // "'"
889, // '"'
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
{ // state 246
25,MIN_REDUCTION+57, // `[
90,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 247
0x80000000|913, // match move
0x80000000|145, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 248
0x80000000|1074, // match move
0x80000000|437, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 249
0x80000000|913, // match move
0x80000000|138, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 250
2,496, // ws*
25,MIN_REDUCTION+81, // `[
90,MIN_REDUCTION+81, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 251
0x80000000|1027, // match move
0x80000000|1059, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 252
39,11, // `<
41,22, // `>
42,655, // `instanceof
92,948, // "<"
95,275, // "#"
102,100, // ">"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 253
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 254
2,84, // ws*
94,1149, // " "
111,1070, // {10}
120,25, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 256
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 257
25,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 258
2,665, // ws*
94,746, // " "
111,534, // {10}
120,933, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 259
0x80000000|663, // match move
0x80000000|442, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 260
65,1061, // "a"
66,1061, // "p"
67,1061, // "v"
68,1061, // "c"
69,1061, // "f"
70,1061, // "i"
71,1061, // "l"
72,1061, // "o"
73,1061, // "r"
74,1061, // "u"
75,1061, // "b"
76,1061, // "e"
77,1061, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,1061, // "h"
79,1061, // "n"
80,1061, // "t"
83,938, // {193..198 225..230}
85,1061, // {"1".."9"}
86,1061, // "0"
88,938, // {176..185}
126,995, // $$2
131,762, // hexDigit
132,1077, // hexDigit128
  }
,
{ // state 261
0x80000000|481, // match move
0x80000000|447, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
2,426, // ws*
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 263
65,1061, // "a"
66,1061, // "p"
67,1061, // "v"
68,1061, // "c"
69,1061, // "f"
70,1061, // "i"
71,1061, // "l"
72,1061, // "o"
73,1061, // "r"
74,1061, // "u"
75,1061, // "b"
76,1061, // "e"
77,1061, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,1061, // "h"
79,1061, // "n"
80,1061, // "t"
83,941, // {193..198 225..230}
85,1061, // {"1".."9"}
86,1061, // "0"
88,941, // {176..185}
126,992, // $$2
131,762, // hexDigit
132,1084, // hexDigit128
  }
,
{ // state 264
9,220, // <decl in class>*
10,54, // `}
11,1192, // <decl in class>
12,188, // <method decl>
13,808, // `public
95,609, // "#"
112,254, // "}"
  }
,
{ // state 265
0x80000000|88, // match move
0x80000000|976, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 266
0x80000000|660, // match move
0x80000000|438, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 267
2,1253, // ws*
  }
,
{ // state 268
0x80000000|803, // match move
0x80000000|682, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 269
25,MIN_REDUCTION+57, // `[
90,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 270
25,MIN_REDUCTION+57, // `[
90,MIN_REDUCTION+57, // "["
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 271
94,1235, // " "
111,222, // {10}
120,51, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 272
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 273
26,221, // `]
98,91, // "]"
  }
,
{ // state 274
0x80000000|88, // match move
0x80000000|960, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 275
70,644, // "i"
  }
,
{ // state 276
0x80000000|803, // match move
0x80000000|703, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 277
0x80000000|242, // match move
0x80000000|185, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 278
65,1061, // "a"
66,1061, // "p"
67,1061, // "v"
68,1061, // "c"
69,1061, // "f"
70,1061, // "i"
71,1061, // "l"
72,1061, // "o"
73,1061, // "r"
74,1061, // "u"
75,1061, // "b"
76,1061, // "e"
77,1061, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,1061, // "h"
79,1061, // "n"
80,1061, // "t"
83,893, // {193..198 225..230}
85,1061, // {"1".."9"}
86,1061, // "0"
88,893, // {176..185}
126,1012, // $$2
131,762, // hexDigit
132,952, // hexDigit128
  }
,
{ // state 279
0x80000000|243, // match move
0x80000000|150, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 280
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 281
2,583, // ws*
25,MIN_REDUCTION+81, // `[
90,MIN_REDUCTION+81, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 282
0x80000000|803, // match move
0x80000000|702, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 283
2,560, // ws*
25,MIN_REDUCTION+81, // `[
90,MIN_REDUCTION+81, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 284
2,787, // ws*
25,MIN_REDUCTION+143, // `[
90,MIN_REDUCTION+143, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 285
0x80000000|430, // match move
0x80000000|1258, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 286
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 287
2,575, // ws*
94,1245, // " "
111,1162, // {10}
120,105, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 288
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 289
25,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 290
43,980, // `+
45,729, // `-
91,87, // "-"
106,677, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 291
25,MIN_REDUCTION+178, // `[
90,MIN_REDUCTION+178, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 292
0x80000000|642, // match move
0x80000000|485, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 293
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 294
0x80000000|1, // match move
0x80000000|555, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 295
25,MIN_REDUCTION+157, // `[
90,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 296
0x80000000|1, // match move
0x80000000|550, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 297
94,746, // " "
111,534, // {10}
120,1006, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 298
0x80000000|657, // match move
0x80000000|133, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 299
43,1011, // `+
45,737, // `-
91,87, // "-"
106,677, // "+"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 300
94,1135, // " "
111,681, // {10}
120,301, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 301
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 302
0x80000000|320, // match move
0x80000000|1072, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 303
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 304
0x80000000|1017, // match move
0x80000000|198, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 305
2,972, // ws*
94,350, // " "
111,757, // {10}
120,1237, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 306
2,29, // ws*
94,955, // " "
111,205, // {10}
120,817, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 307
25,424, // `[
63,1142, // `.
90,1129, // "["
107,1147, // "."
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 308
0x80000000|1, // match move
0x80000000|1178, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 309
94,338, // " "
111,735, // {10}
120,574, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 310
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 311
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 312
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 313
0x80000000|1, // match move
0x80000000|1175, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 314
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 315
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 316
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 317
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 318
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 319
94,1001, // " "
111,160, // {10}
120,1218, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 320
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 321
94,979, // " "
111,113, // {10}
120,142, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 322
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 323
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 324
0x80000000|1, // match move
0x80000000|654, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 325
0x80000000|1, // match move
0x80000000|653, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 326
25,MIN_REDUCTION+146, // `[
90,MIN_REDUCTION+146, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 327
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,46, // letter128
82,1103, // {199..218 231..250}
83,1103, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1320, // digit128
88,253, // {176..185}
108,1205, // "_"
118,315, // {223}
122,233, // $$0
129,1243, // idChar
130,1188, // idChar128
  }
,
{ // state 328
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 329
46,747, // `*
48,805, // `/
49,590, // `%
99,1128, // "/"
104,840, // "%"
116,647, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 330
2,426, // ws*
94,835, // " "
111,172, // {10}
120,107, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 331
0x80000000|17, // match move
0x80000000|30, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 332
2,584, // ws*
  }
,
{ // state 333
46,754, // `*
48,811, // `/
49,592, // `%
99,1128, // "/"
104,840, // "%"
116,647, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 334
0x80000000|1, // match move
0x80000000|1229, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 335
2,498, // ws*
  }
,
{ // state 336
7,167, // ID
15,458, // `(
43,704, // `+
44,621, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 337
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 338
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 339
8,1171, // `{
103,799, // "{"
  }
,
{ // state 340
80,287, // "t"
  }
,
{ // state 341
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 342
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 343
2,1124, // ws*
94,1160, // " "
111,67, // {10}
120,1262, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 344
37,425, // `==
110,77, // "@"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 345
94,316, // " "
111,719, // {10}
120,489, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 346
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 347
2,922, // ws*
94,1135, // " "
111,681, // {10}
120,128, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 348
21,208, // `;
100,930, // ";"
  }
,
{ // state 349
2,1159, // ws*
94,386, // " "
111,775, // {10}
120,1185, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 352
2,319, // ws*
94,1001, // " "
111,160, // {10}
120,850, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 353
0x80000000|88, // match move
0x80000000|45, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 354
24,94, // <empty bracket pair>
25,115, // `[
90,305, // "["
  }
,
{ // state 355
7,744, // ID
18,712, // <type>
22,285, // `int
23,859, // `boolean
64,383, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,887, // letter128
82,251, // {199..218 231..250}
83,251, // {193..198 225..230}
95,58, // "#"
  }
,
{ // state 356
7,744, // ID
18,698, // <type>
22,285, // `int
23,859, // `boolean
64,383, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,887, // letter128
82,251, // {199..218 231..250}
83,251, // {193..198 225..230}
95,58, // "#"
  }
,
{ // state 357
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 358
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 359
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 360
0x80000000|1027, // match move
0x80000000|818, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 361
0x80000000|1, // match move
0x80000000|269, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 362
0x80000000|1, // match move
0x80000000|156, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 363
2,565, // ws*
94,1245, // " "
111,1162, // {10}
120,105, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 364
0x80000000|1, // match move
0x80000000|270, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 365
0x80000000|1, // match move
0x80000000|154, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 366
25,MIN_REDUCTION+84, // `[
90,MIN_REDUCTION+84, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 367
80,204, // "t"
  }
,
{ // state 368
25,MIN_REDUCTION+84, // `[
90,MIN_REDUCTION+84, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 369
15,153, // `(
105,1292, // "("
  }
,
{ // state 370
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 371
65,1061, // "a"
66,1061, // "p"
67,1061, // "v"
68,1061, // "c"
69,1061, // "f"
70,1061, // "i"
71,1061, // "l"
72,1061, // "o"
73,1061, // "r"
74,1061, // "u"
75,1061, // "b"
76,1061, // "e"
77,1061, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,1061, // "h"
79,1061, // "n"
80,1061, // "t"
83,941, // {193..198 225..230}
85,1061, // {"1".."9"}
86,1061, // "0"
88,941, // {176..185}
125,263, // hexDigit*
126,294, // $$2
131,322, // hexDigit
132,1084, // hexDigit128
  }
,
{ // state 372
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 373
25,MIN_REDUCTION+146, // `[
90,MIN_REDUCTION+146, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 374
24,75, // <empty bracket pair>
25,136, // `[
90,305, // "["
  }
,
{ // state 375
25,721, // `[
90,1129, // "["
  }
,
{ // state 376
80,169, // "t"
  }
,
{ // state 377
65,1061, // "a"
66,1061, // "p"
67,1061, // "v"
68,1061, // "c"
69,1061, // "f"
70,1061, // "i"
71,1061, // "l"
72,1061, // "o"
73,1061, // "r"
74,1061, // "u"
75,1061, // "b"
76,1061, // "e"
77,1061, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,1061, // "h"
79,1061, // "n"
80,1061, // "t"
83,938, // {193..198 225..230}
85,1061, // {"1".."9"}
86,1061, // "0"
88,938, // {176..185}
125,260, // hexDigit*
126,296, // $$2
131,322, // hexDigit
132,1077, // hexDigit128
  }
,
{ // state 378
25,718, // `[
90,1129, // "["
  }
,
{ // state 379
24,76, // <empty bracket pair>
25,135, // `[
90,305, // "["
  }
,
{ // state 380
0x80000000|625, // match move
0x80000000|533, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 381
0x80000000|1, // match move
0x80000000|178, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 382
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 383
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,298, // letter128
82,251, // {199..218 231..250}
83,251, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,896, // digit128
88,628, // {176..185}
108,1205, // "_"
118,999, // {223}
121,783, // idChar*
122,1040, // $$0
129,240, // idChar
130,899, // idChar128
  }
,
{ // state 384
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 385
0x80000000|1, // match move
0x80000000|666, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 386
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 387
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 388
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 389
0x80000000|1, // match move
0x80000000|670, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 390
35,568, // `&&
110,1053, // "@"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 391
25,MIN_REDUCTION+138, // `[
90,MIN_REDUCTION+138, // "["
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 392
25,MIN_REDUCTION+60, // `[
90,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 393
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1169, // letter128
82,807, // {199..218 231..250}
83,807, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1172, // digit128
88,580, // {176..185}
108,1205, // "_"
118,895, // {223}
121,1271, // idChar*
122,229, // $$0
129,240, // idChar
130,42, // idChar128
  }
,
{ // state 394
25,MIN_REDUCTION+138, // `[
90,MIN_REDUCTION+138, // "["
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 395
7,89, // ID
18,1085, // <type>
22,701, // `int
23,530, // `boolean
64,1100, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,1191, // letter128
82,1010, // {199..218 231..250}
83,1010, // {193..198 225..230}
95,6, // "#"
  }
,
{ // state 396
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 397
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1173, // letter128
82,815, // {199..218 231..250}
83,815, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1170, // digit128
88,576, // {176..185}
108,1205, // "_"
118,891, // {223}
121,1277, // idChar*
122,272, // $$0
129,240, // idChar
130,38, // idChar128
  }
,
{ // state 398
7,744, // ID
18,993, // <type>
22,285, // `int
23,859, // `boolean
64,383, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,887, // letter128
82,251, // {199..218 231..250}
83,251, // {193..198 225..230}
95,58, // "#"
  }
,
{ // state 399
94,386, // " "
111,775, // {10}
120,572, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 400
7,167, // ID
15,458, // `(
20,1101, // <exp>
32,770, // <exp8>
34,1116, // <exp7>
36,163, // <exp6>
38,1167, // <exp5>
40,189, // <exp4>
43,704, // `+
44,796, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 401
7,167, // ID
15,458, // `(
20,1099, // <exp>
32,770, // <exp8>
34,1116, // <exp7>
36,163, // <exp6>
38,1167, // <exp5>
40,189, // <exp4>
43,704, // `+
44,796, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 402
2,627, // ws*
94,1221, // " "
111,1144, // {10}
120,122, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 403
7,167, // ID
15,458, // `(
43,704, // `+
45,1257, // `-
47,1263, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 404
2,624, // ws*
94,1223, // " "
111,1145, // {10}
120,124, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 405
2,669, // ws*
94,1235, // " "
111,222, // {10}
120,16, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 406
25,MIN_REDUCTION+84, // `[
90,MIN_REDUCTION+84, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 407
2,225, // ws*
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 408
24,72, // <empty bracket pair>
25,136, // `[
55,106, // <empty bracket pair>*
90,305, // "["
  }
,
{ // state 409
0x80000000|1, // match move
0x80000000|1251, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 410
94,1245, // " "
111,1162, // {10}
120,337, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 411
7,89, // ID
18,1088, // <type>
22,701, // `int
23,530, // `boolean
64,1100, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,1191, // letter128
82,1010, // {199..218 231..250}
83,1010, // {193..198 225..230}
95,6, // "#"
  }
,
{ // state 412
25,MIN_REDUCTION+138, // `[
90,MIN_REDUCTION+138, // "["
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 413
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 414
24,83, // <empty bracket pair>
25,135, // `[
55,108, // <empty bracket pair>*
90,305, // "["
  }
,
{ // state 415
2,416, // ws*
25,MIN_REDUCTION+151, // `[
90,MIN_REDUCTION+151, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 416
0x80000000|1, // match move
0x80000000|1314, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 417
65,1061, // "a"
66,1061, // "p"
67,1061, // "v"
68,1061, // "c"
69,1061, // "f"
70,1061, // "i"
71,1061, // "l"
72,1061, // "o"
73,1061, // "r"
74,1061, // "u"
75,1061, // "b"
76,1061, // "e"
77,1061, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,1061, // "h"
79,1061, // "n"
80,1061, // "t"
83,893, // {193..198 225..230}
85,1061, // {"1".."9"}
86,1061, // "0"
88,893, // {176..185}
125,278, // hexDigit*
126,238, // $$2
131,322, // hexDigit
132,952, // hexDigit128
  }
,
{ // state 418
0x80000000|318, // match move
0x80000000|23, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 419
2,1279, // ws*
25,MIN_REDUCTION+137, // `[
90,MIN_REDUCTION+137, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 420
25,763, // `[
90,1129, // "["
  }
,
{ // state 421
2,409, // ws*
25,MIN_REDUCTION+151, // `[
90,MIN_REDUCTION+151, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 422
2,946, // ws*
94,316, // " "
111,719, // {10}
120,1272, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 423
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 424
7,167, // ID
15,458, // `(
20,1080, // <exp>
32,770, // <exp8>
34,1116, // <exp7>
36,163, // <exp6>
38,1167, // <exp5>
40,189, // <exp4>
43,704, // `+
44,796, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 425
7,167, // ID
15,458, // `(
38,252, // <exp5>
40,189, // <exp4>
43,704, // `+
44,796, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 426
0x80000000|1313, // match move
0x80000000|1032, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 427
2,1285, // ws*
25,MIN_REDUCTION+137, // `[
90,MIN_REDUCTION+137, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 428
94,1135, // " "
111,681, // {10}
120,301, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 429
2,265, // ws*
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 430
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 431
2,274, // ws*
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 432
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 433
0x80000000|1, // match move
0x80000000|620, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 434
0x80000000|79, // match move
0x80000000|482, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 435
74,742, // "u"
76,581, // "e"
  }
,
{ // state 436
2,1054, // ws*
94,357, // " "
111,33, // {10}
120,359, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 437
2,760, // ws*
25,MIN_REDUCTION+123, // `[
94,1158, // " "
111,268, // {10}
120,110, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 438
2,389, // ws*
25,MIN_REDUCTION+185, // `[
90,MIN_REDUCTION+185, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 439
0x80000000|1, // match move
0x80000000|499, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 440
0x80000000|741, // match move
0x80000000|74, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 441
35,540, // `&&
110,1053, // "@"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 442
2,385, // ws*
25,MIN_REDUCTION+185, // `[
90,MIN_REDUCTION+185, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 443
0x80000000|741, // match move
0x80000000|73, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 444
134,MIN_REDUCTION+176, // $NT
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 445
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 446
0x80000000|552, // match move
0x80000000|471, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 447
94,835, // " "
111,172, // {10}
120,508, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 448
35,538, // `&&
110,1053, // "@"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 449
70,340, // "i"
75,567, // "b"
  }
,
{ // state 450
7,147, // ID
15,411, // `(
38,18, // <exp5>
40,290, // <exp4>
43,723, // `+
44,878, // <exp3>
45,1287, // `-
47,865, // <exp2>
50,522, // `!
51,994, // <exp1>
52,341, // <cast exp>
53,199, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
105,347, // "("
106,436, // "+"
110,1232, // "@"
113,69, // "!"
114,1109, // "'"
115,889, // '"'
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
{ // state 451
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,5, // letter128
82,1035, // {199..218 231..250}
83,1035, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1283, // digit128
88,288, // {176..185}
108,1205, // "_"
118,351, // {223}
122,32, // $$0
129,1243, // idChar
130,1288, // idChar128
  }
,
{ // state 452
2,59, // ws*
  }
,
{ // state 453
2,7, // ws*
  }
,
{ // state 454
69,472, // "f"
79,435, // "n"
80,1298, // "t"
  }
,
{ // state 455
25,MIN_REDUCTION+58, // `[
90,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 456
2,939, // ws*
94,338, // " "
111,735, // {10}
120,1213, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 457
8,264, // `{
103,306, // "{"
  }
,
{ // state 458
7,89, // ID
18,1036, // <type>
22,701, // `int
23,530, // `boolean
64,1100, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,1191, // letter128
82,1010, // {199..218 231..250}
83,1010, // {193..198 225..230}
95,6, // "#"
  }
,
{ // state 459
7,226, // ID
15,395, // `(
20,66, // <exp>
32,726, // <exp8>
34,1216, // <exp7>
36,1140, // <exp6>
38,232, // <exp5>
40,299, // <exp4>
43,734, // `+
44,890, // <exp3>
45,1289, // `-
47,864, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 460
7,226, // ID
15,395, // `(
38,116, // <exp5>
40,299, // <exp4>
43,734, // `+
44,890, // <exp3>
45,1289, // `-
47,864, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 461
0x80000000|1, // match move
0x80000000|691, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 462
0x80000000|741, // match move
0x80000000|93, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 463
0x80000000|1193, // match move
0x80000000|602, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 464
25,MIN_REDUCTION+60, // `[
90,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 465
0x80000000|1, // match move
0x80000000|689, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 466
25,MIN_REDUCTION+60, // `[
90,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 467
2,468, // ws*
25,MIN_REDUCTION+151, // `[
90,MIN_REDUCTION+151, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 468
0x80000000|1, // match move
0x80000000|1194, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 469
2,507, // ws*
25,MIN_REDUCTION+179, // `[
90,MIN_REDUCTION+179, // "["
94,513, // " "
111,304, // {10}
120,679, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 470
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 471
2,1317, // ws*
25,MIN_REDUCTION+137, // `[
90,MIN_REDUCTION+137, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 472
65,1174, // "a"
  }
,
{ // state 473
25,MIN_REDUCTION+58, // `[
90,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 474
74,974, // "u"
76,581, // "e"
  }
,
{ // state 475
0x80000000|1, // match move
0x80000000|680, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 476
2,111, // ws*
  }
,
{ // state 477
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 478
24,90, // <empty bracket pair>
25,115, // `[
55,65, // <empty bracket pair>*
90,305, // "["
  }
,
{ // state 479
25,MIN_REDUCTION+58, // `[
90,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 480
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,125, // letter128
82,1019, // {199..218 231..250}
83,1019, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1275, // digit128
88,328, // {176..185}
108,1205, // "_"
118,387, // {223}
122,55, // $$0
129,1243, // idChar
130,34, // idChar128
  }
,
{ // state 481
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 482
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 483
74,944, // "u"
76,581, // "e"
  }
,
{ // state 484
25,MIN_REDUCTION+52, // `[
90,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 485
2,433, // ws*
25,MIN_REDUCTION+185, // `[
90,MIN_REDUCTION+185, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 486
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 487
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 488
25,401, // `[
63,1125, // `.
90,1129, // "["
107,1147, // "."
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 489
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 490
25,MIN_REDUCTION+52, // `[
90,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 491
7,167, // ID
51,132, // <exp1>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
95,454, // "#"
110,1196, // "@"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 492
94,144, // " "
111,1315, // {10}
120,958, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 493
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 494
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 495
0x80000000|1, // match move
0x80000000|1152, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 496
0x80000000|1, // match move
0x80000000|546, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 497
0x80000000|869, // match move
0x80000000|541, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 498
0x80000000|1, // match move
0x80000000|326, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 499
25,MIN_REDUCTION+59, // `[
90,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 500
0x80000000|869, // match move
0x80000000|542, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 501
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 502
0x80000000|1207, // match move
0x80000000|467, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 503
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 504
0x80000000|413, // match move
0x80000000|526, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 505
94,207, // " "
111,1211, // {10}
120,1039, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 506
0x80000000|413, // match move
0x80000000|523, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 507
0x80000000|1313, // match move
0x80000000|21, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 508
0x80000000|413, // match move
0x80000000|1051, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 509
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 510
25,400, // `[
63,1126, // `.
90,1129, // "["
107,1147, // "."
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 511
25,MIN_REDUCTION+15, // `[
90,MIN_REDUCTION+15, // "["
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 512
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 513
0x80000000|64, // match move
0x80000000|553, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 514
72,258, // "o"
  }
,
{ // state 515
94,1223, // " "
111,1145, // {10}
120,311, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 516
94,746, // " "
111,534, // {10}
120,1006, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 517
94,1221, // " "
111,1144, // {10}
120,388, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 518
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 519
2,588, // ws*
94,1223, // " "
111,1145, // {10}
120,124, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 520
7,226, // ID
51,47, // <exp1>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
95,981, // "#"
110,1227, // "@"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 521
0x80000000|752, // match move
0x80000000|755, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 522
7,147, // ID
51,43, // <exp1>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
95,988, // "#"
110,1232, // "@"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 523
25,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 524
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 525
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 526
25,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 527
0x80000000|453, // match move
0x80000000|1198, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 528
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 529
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 530
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 531
0x80000000|869, // match move
0x80000000|511, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 532
2,82, // ws*
94,746, // " "
111,534, // {10}
120,933, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 533
2,1138, // ws*
94,835, // " "
111,172, // {10}
120,107, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 534
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 535
15,1234, // `(
105,1292, // "("
  }
,
{ // state 536
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 537
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 538
7,226, // ID
15,395, // `(
36,1013, // <exp6>
38,232, // <exp5>
40,299, // <exp4>
43,734, // `+
44,890, // <exp3>
45,1289, // `-
47,864, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 539
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 540
7,147, // ID
15,411, // `(
36,1004, // <exp6>
38,1105, // <exp5>
40,290, // <exp4>
43,723, // `+
44,878, // <exp3>
45,1287, // `-
47,865, // <exp2>
50,522, // `!
51,994, // <exp1>
52,341, // <cast exp>
53,199, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
105,347, // "("
106,436, // "+"
110,1232, // "@"
113,69, // "!"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 541
25,MIN_REDUCTION+15, // `[
90,MIN_REDUCTION+15, // "["
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 542
25,MIN_REDUCTION+15, // `[
90,MIN_REDUCTION+15, // "["
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 543
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 544
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 545
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 546
25,MIN_REDUCTION+80, // `[
90,MIN_REDUCTION+80, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 547
25,MIN_REDUCTION+156, // `[
90,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 548
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 549
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,788, // letter128
82,360, // {199..218 231..250}
83,360, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,127, // digit128
88,1016, // {176..185}
108,1205, // "_"
118,302, // {223}
122,1318, // $$0
129,1243, // idChar
130,183, // idChar128
  }
,
{ // state 550
25,MIN_REDUCTION+145, // `[
90,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 551
70,367, // "i"
75,62, // "b"
  }
,
{ // state 552
2,1317, // ws*
  }
,
{ // state 553
25,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 554
0x80000000|452, // match move
0x80000000|1200, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 555
25,MIN_REDUCTION+145, // `[
90,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 556
2,986, // ws*
94,357, // " "
111,33, // {10}
120,359, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 557
25,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 558
70,376, // "i"
75,80, // "b"
  }
,
{ // state 559
72,258, // "o"
73,690, // "r"
  }
,
{ // state 560
0x80000000|1, // match move
0x80000000|784, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 561
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 562
94,1223, // " "
111,1145, // {10}
120,311, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 563
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 564
7,369, // ID
24,1067, // <empty bracket pair>
25,44, // `[
64,1097, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,422, // letter128
82,1019, // {199..218 231..250}
83,1019, // {193..198 225..230}
90,305, // "["
  }
,
{ // state 565
94,1245, // " "
111,1162, // {10}
120,337, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 566
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 567
72,363, // "o"
  }
,
{ // state 568
7,167, // ID
15,458, // `(
36,344, // <exp6>
38,1167, // <exp5>
40,189, // <exp4>
43,704, // `+
44,796, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 569
94,1221, // " "
111,1144, // {10}
120,388, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 570
76,1143, // "e"
  }
,
{ // state 571
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 572
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 573
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 574
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 575
94,1245, // " "
111,1162, // {10}
120,337, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 576
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 577
25,MIN_REDUCTION+139, // `[
90,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 578
2,57, // ws*
94,293, // " "
111,1060, // {10}
120,96, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 579
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 580
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 581
2,300, // ws*
94,1135, // " "
111,681, // {10}
120,128, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 582
2,640, // ws*
94,1245, // " "
111,1162, // {10}
120,105, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 583
0x80000000|1, // match move
0x80000000|797, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 584
0x80000000|1, // match move
0x80000000|373, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 585
94,1221, // " "
111,1144, // {10}
120,388, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 586
25,MIN_REDUCTION+52, // `[
90,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 587
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 588
94,1223, // " "
111,1145, // {10}
120,311, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 589
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 590
7,147, // ID
15,411, // `(
43,723, // `+
45,1287, // `-
47,1297, // <exp2>
50,522, // `!
51,994, // <exp1>
52,341, // <cast exp>
53,199, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
105,347, // "("
106,436, // "+"
110,1232, // "@"
113,69, // "!"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 591
25,MIN_REDUCTION+138, // `[
90,MIN_REDUCTION+138, // "["
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 592
7,226, // ID
15,395, // `(
43,734, // `+
45,1289, // `-
47,1299, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 593
0x80000000|1, // match move
0x80000000|392, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 594
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 595
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 596
24,434, // <empty bracket pair>
25,273, // `[
90,305, // "["
  }
,
{ // state 597
2,716, // ws*
25,MIN_REDUCTION+123, // `[
94,1134, // " "
111,276, // {10}
120,174, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 598
133,MIN_REDUCTION+0, // $
  }
,
{ // state 599
2,715, // ws*
25,MIN_REDUCTION+123, // `[
94,1137, // " "
111,282, // {10}
120,177, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 600
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1273, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1294, // digit128
88,837, // {176..185}
108,1205, // "_"
118,862, // {223}
121,215, // idChar*
122,824, // $$0
129,240, // idChar
130,279, // idChar128
  }
,
{ // state 601
0x80000000|963, // match move
0x80000000|170, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 602
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 603
94,168, // " "
111,1180, // {10}
120,1087, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 604
0x80000000|961, // match move
0x80000000|284, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 605
2,507, // ws*
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 606
2,780, // ws*
  }
,
{ // state 607
0x80000000|1, // match move
0x80000000|152, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 608
2,786, // ws*
  }
,
{ // state 609
66,708, // "p"
  }
,
{ // state 610
2,560, // ws*
  }
,
{ // state 611
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1264, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1291, // digit128
88,836, // {176..185}
108,1205, // "_"
118,860, // {223}
121,217, // idChar*
122,785, // $$0
129,240, // idChar
130,277, // idChar128
  }
,
{ // state 612
2,583, // ws*
  }
,
{ // state 613
25,MIN_REDUCTION+144, // `[
90,MIN_REDUCTION+144, // "["
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 614
25,MIN_REDUCTION+136, // `[
90,MIN_REDUCTION+136, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 615
25,MIN_REDUCTION+182, // `[
90,MIN_REDUCTION+182, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 616
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 617
25,MIN_REDUCTION+144, // `[
90,MIN_REDUCTION+144, // "["
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 618
25,MIN_REDUCTION+136, // `[
90,MIN_REDUCTION+136, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 619
25,MIN_REDUCTION+182, // `[
90,MIN_REDUCTION+182, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 620
25,MIN_REDUCTION+184, // `[
90,MIN_REDUCTION+184, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 621
46,769, // `*
48,782, // `/
49,403, // `%
99,1128, // "/"
104,840, // "%"
116,647, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 622
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 623
0x80000000|1, // match move
0x80000000|466, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 624
94,1223, // " "
111,1145, // {10}
120,311, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 625
2,1138, // ws*
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 626
0x80000000|1, // match move
0x80000000|464, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 627
94,1221, // " "
111,1144, // {10}
120,388, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 628
0x80000000|1117, // match move
0x80000000|823, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 629
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 630
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,954, // letter128
82,1206, // {199..218 231..250}
83,1206, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,740, // digit128
88,114, // {176..185}
108,1205, // "_"
118,1068, // {223}
121,749, // idChar*
122,851, // $$0
129,240, // idChar
130,532, // idChar128
  }
,
{ // state 631
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 632
25,424, // `[
63,1142, // `.
90,1129, // "["
107,1147, // "."
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 633
25,MIN_REDUCTION+145, // `[
90,MIN_REDUCTION+145, // "["
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 634
2,1285, // ws*
  }
,
{ // state 635
0x80000000|1, // match move
0x80000000|968, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 636
2,1279, // ws*
  }
,
{ // state 637
2,828, // ws*
  }
,
{ // state 638
94,148, // " "
111,1233, // {10}
120,1018, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 639
2,496, // ws*
  }
,
{ // state 640
94,1245, // " "
111,1162, // {10}
120,337, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 641
5,195, // <class decl>
6,894, // `class
95,231, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 642
2,433, // ws*
  }
,
{ // state 643
69,180, // "f"
70,648, // "i"
73,570, // "r"
75,559, // "b"
79,483, // "n"
80,1071, // "t"
  }
,
{ // state 644
79,1168, // "n"
  }
,
{ // state 645
7,1195, // ID
24,1067, // <empty bracket pair>
25,44, // `[
64,1075, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,456, // letter128
82,1035, // {199..218 231..250}
83,1035, // {193..198 225..230}
90,305, // "["
  }
,
{ // state 646
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 647
2,244, // ws*
94,144, // " "
111,1315, // {10}
120,509, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 648
80,194, // "t"
  }
,
{ // state 649
25,MIN_REDUCTION+54, // `[
90,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 650
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1250, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1310, // digit128
88,521, // {176..185}
108,1205, // "_"
118,845, // {223}
121,159, // idChar*
122,756, // $$0
129,240, // idChar
130,239, // idChar128
  }
,
{ // state 651
0x80000000|943, // match move
0x80000000|206, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 652
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 653
25,MIN_REDUCTION+51, // `[
90,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 654
25,MIN_REDUCTION+51, // `[
90,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 655
7,587, // ID
18,1164, // <type>
22,594, // `int
23,733, // `boolean
64,190, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,919, // letter128
82,827, // {199..218 231..250}
83,827, // {193..198 225..230}
95,449, // "#"
  }
,
{ // state 656
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 657
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 658
25,MIN_REDUCTION+149, // `[
90,MIN_REDUCTION+149, // "["
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 659
0x80000000|1, // match move
0x80000000|165, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 660
2,389, // ws*
  }
,
{ // state 661
25,MIN_REDUCTION+136, // `[
90,MIN_REDUCTION+136, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 662
25,MIN_REDUCTION+182, // `[
90,MIN_REDUCTION+182, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 663
2,385, // ws*
  }
,
{ // state 664
2,585, // ws*
94,1221, // " "
111,1144, // {10}
120,122, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 665
94,746, // " "
111,534, // {10}
120,1006, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 666
25,MIN_REDUCTION+184, // `[
90,MIN_REDUCTION+184, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 667
0x80000000|1268, // match move
0x80000000|415, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 668
0x80000000|146, // match move
0x80000000|52, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 669
94,1235, // " "
111,222, // {10}
120,51, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 670
25,MIN_REDUCTION+184, // `[
90,MIN_REDUCTION+184, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 671
0x80000000|1266, // match move
0x80000000|421, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 672
0x80000000|143, // match move
0x80000000|60, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 673
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 674
0x80000000|1, // match move
0x80000000|162, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 675
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 676
94,979, // " "
111,113, // {10}
120,142, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 677
2,3, // ws*
94,120, // " "
111,1300, // {10}
120,539, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 678
94,746, // " "
111,534, // {10}
120,1006, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 679
0x80000000|801, // match move
0x80000000|984, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 680
25,MIN_REDUCTION+51, // `[
90,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 681
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 682
25,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 683
7,494, // ID
18,1055, // <type>
22,563, // `int
23,711, // `boolean
64,393, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,885, // letter128
82,807, // {199..218 231..250}
83,807, // {193..198 225..230}
95,558, // "#"
  }
,
{ // state 684
7,528, // ID
18,1037, // <type>
22,561, // `int
23,705, // `boolean
64,397, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,874, // letter128
82,815, // {199..218 231..250}
83,815, // {193..198 225..230}
95,551, // "#"
  }
,
{ // state 685
94,372, // " "
111,779, // {10}
120,629, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 686
25,MIN_REDUCTION+149, // `[
90,MIN_REDUCTION+149, // "["
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 687
25,MIN_REDUCTION+149, // `[
90,MIN_REDUCTION+149, // "["
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 688
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 689
25,MIN_REDUCTION+59, // `[
90,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 690
2,854, // ws*
94,346, // " "
111,730, // {10}
120,1215, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 691
25,MIN_REDUCTION+59, // `[
90,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 692
25,MIN_REDUCTION+144, // `[
90,MIN_REDUCTION+144, // "["
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 693
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 694
0x80000000|413, // match move
0x80000000|557, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 695
2,261, // ws*
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 696
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 697
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 698
0x80000000|596, // match move
0x80000000|375, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 699
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 700
0x80000000|1, // match move
0x80000000|526, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 701
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 702
25,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 703
25,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 704
7,167, // ID
43,704, // `+
45,1257, // `-
51,778, // <exp1>
53,37, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
106,436, // "+"
110,1196, // "@"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 705
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 706
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 707
7,167, // ID
15,458, // `(
43,704, // `+
44,1217, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 708
74,965, // "u"
  }
,
{ // state 709
2,1290, // ws*
25,MIN_REDUCTION+83, // `[
90,MIN_REDUCTION+83, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 710
0x80000000|431, // match move
0x80000000|839, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 711
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 712
0x80000000|596, // match move
0x80000000|378, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 713
2,1295, // ws*
25,MIN_REDUCTION+83, // `[
90,MIN_REDUCTION+83, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 714
0x80000000|1, // match move
0x80000000|557, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 715
0x80000000|486, // match move
0x80000000|78, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 716
0x80000000|486, // match move
0x80000000|85, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 717
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 718
7,167, // ID
15,458, // `(
20,844, // <exp>
32,770, // <exp8>
34,1116, // <exp7>
36,163, // <exp6>
38,1167, // <exp5>
40,189, // <exp4>
43,704, // `+
44,796, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 719
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 720
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 721
7,167, // ID
15,458, // `(
20,849, // <exp>
32,770, // <exp8>
34,1116, // <exp7>
36,163, // <exp6>
38,1167, // <exp5>
40,189, // <exp4>
43,704, // `+
44,796, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 722
33,141, // `||
110,235, // "@"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 723
7,147, // ID
43,723, // `+
45,1287, // `-
51,994, // <exp1>
53,56, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
106,436, // "+"
110,1232, // "@"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 724
0x80000000|164, // match move
0x80000000|1041, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 725
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 726
33,139, // `||
110,235, // "@"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 727
0x80000000|1, // match move
0x80000000|997, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 728
25,MIN_REDUCTION+53, // `[
55,106, // <empty bracket pair>*
90,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 729
7,147, // ID
15,411, // `(
43,723, // `+
44,1309, // <exp3>
45,1287, // `-
47,865, // <exp2>
50,522, // `!
51,994, // <exp1>
52,341, // <cast exp>
53,199, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
105,347, // "("
106,436, // "+"
110,1232, // "@"
113,69, // "!"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 730
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 731
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 732
25,MIN_REDUCTION+53, // `[
55,108, // <empty bracket pair>*
90,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 733
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 734
7,226, // ID
43,734, // `+
45,1289, // `-
51,989, // <exp1>
53,616, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
106,436, // "+"
110,1227, // "@"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 735
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 736
0x80000000|149, // match move
0x80000000|1044, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 737
7,226, // ID
15,395, // `(
43,734, // `+
44,1311, // <exp3>
45,1289, // `-
47,864, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 738
2,516, // ws*
94,746, // " "
111,534, // {10}
120,933, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 739
134,MIN_REDUCTION+15, // $NT
  }
,
{ // state 740
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 741
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 742
0x80000000|1248, // match move
0x80000000|888, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 743
0x80000000|1, // match move
0x80000000|966, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 744
0x80000000|699, // match move
0x80000000|910, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 745
0x80000000|64, // match move
0x80000000|997, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 746
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 747
7,147, // ID
15,411, // `(
43,723, // `+
45,1287, // `-
47,8, // <exp2>
50,522, // `!
51,994, // <exp1>
52,341, // <cast exp>
53,199, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
105,347, // "("
106,436, // "+"
110,1232, // "@"
113,69, // "!"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 748
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 749
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,954, // letter128
82,1206, // {199..218 231..250}
83,1206, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,740, // digit128
88,114, // {176..185}
108,1205, // "_"
118,1068, // {223}
122,935, // $$0
129,1243, // idChar
130,532, // idChar128
  }
,
{ // state 750
94,81, // " "
111,1252, // {10}
120,1008, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 751
0x80000000|1, // match move
0x80000000|1015, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 752
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 753
0x80000000|1, // match move
0x80000000|1014, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 754
7,226, // ID
15,395, // `(
43,734, // `+
45,1289, // `-
47,9, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 755
25,MIN_REDUCTION+65, // `[
90,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 756
0x80000000|1, // match move
0x80000000|914, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 757
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 758
2,4, // ws*
25,MIN_REDUCTION+83, // `[
90,MIN_REDUCTION+83, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 759
0x80000000|429, // match move
0x80000000|834, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 760
0x80000000|486, // match move
0x80000000|118, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 761
25,MIN_REDUCTION+142, // `[
90,MIN_REDUCTION+142, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 762
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 763
7,167, // ID
15,458, // `(
20,798, // <exp>
32,770, // <exp8>
34,1116, // <exp7>
36,163, // <exp6>
38,1167, // <exp5>
40,189, // <exp4>
43,704, // `+
44,796, // <exp3>
45,1257, // `-
47,706, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 764
0x80000000|1, // match move
0x80000000|175, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 765
0x80000000|64, // match move
0x80000000|1014, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 766
0x80000000|1, // match move
0x80000000|182, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 767
25,MIN_REDUCTION+142, // `[
90,MIN_REDUCTION+142, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 768
0x80000000|64, // match move
0x80000000|1015, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 769
7,167, // ID
15,458, // `(
43,704, // `+
45,1257, // `-
47,20, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 770
33,117, // `||
110,235, // "@"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 771
25,MIN_REDUCTION+65, // `[
90,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 772
25,MIN_REDUCTION+65, // `[
90,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 773
2,505, // ws*
94,207, // " "
111,1211, // {10}
120,646, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 774
25,MIN_REDUCTION+53, // `[
55,65, // <empty bracket pair>*
90,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 775
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 776
94,1245, // " "
111,1162, // {10}
120,337, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 777
0x80000000|1, // match move
0x80000000|523, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 778
0x80000000|1, // match move
0x80000000|1156, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 779
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 780
0x80000000|1, // match move
0x80000000|619, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 781
25,MIN_REDUCTION+174, // `[
90,MIN_REDUCTION+174, // "["
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 782
7,167, // ID
15,458, // `(
43,704, // `+
45,1257, // `-
47,109, // <exp2>
50,491, // `!
51,778, // <exp1>
52,317, // <cast exp>
53,181, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
105,347, // "("
106,436, // "+"
110,1196, // "@"
113,69, // "!"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 783
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,298, // letter128
82,251, // {199..218 231..250}
83,251, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,896, // digit128
88,628, // {176..185}
108,1205, // "_"
118,999, // {223}
122,463, // $$0
129,1243, // idChar
130,899, // idChar128
  }
,
{ // state 784
25,MIN_REDUCTION+80, // `[
90,MIN_REDUCTION+80, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 785
0x80000000|1, // match move
0x80000000|926, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 786
0x80000000|1, // match move
0x80000000|615, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 787
0x80000000|1, // match move
0x80000000|767, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 788
0x80000000|657, // match move
0x80000000|1161, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 789
72,1062, // "o"
  }
,
{ // state 790
25,MIN_REDUCTION+174, // `[
90,MIN_REDUCTION+174, // "["
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 791
0x80000000|1, // match move
0x80000000|761, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 792
0x80000000|1, // match move
0x80000000|950, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 793
2,225, // ws*
25,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,745, // " "
111,1056, // {10}
120,1265, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 794
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 795
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 796
46,769, // `*
48,782, // `/
49,403, // `%
99,1128, // "/"
104,840, // "%"
116,647, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 797
25,MIN_REDUCTION+80, // `[
90,MIN_REDUCTION+80, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 798
26,973, // `]
98,248, // "]"
  }
,
{ // state 799
2,1186, // ws*
94,725, // " "
111,536, // {10}
120,470, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 800
25,MIN_REDUCTION+140, // `[
90,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 801
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 802
25,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 803
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 804
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 805
7,147, // ID
15,411, // `(
43,723, // `+
45,1287, // `-
47,518, // <exp2>
50,522, // `!
51,994, // <exp1>
52,341, // <cast exp>
53,199, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
105,347, // "("
106,436, // "+"
110,1232, // "@"
113,69, // "!"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 806
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 807
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 808
7,912, // ID
14,134, // `void
18,564, // <type>
22,1280, // `int
23,1107, // `boolean
64,630, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,738, // letter128
82,1206, // {199..218 231..250}
83,1206, // {193..198 225..230}
95,213, // "#"
  }
,
{ // state 809
94,1231, // " "
111,112, // {10}
120,280, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 810
25,MIN_REDUCTION+174, // `[
90,MIN_REDUCTION+174, // "["
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 811
7,226, // ID
15,395, // `(
43,734, // `+
45,1289, // `-
47,524, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 812
8,957, // `{
103,219, // "{"
  }
,
{ // state 813
94,979, // " "
111,113, // {10}
120,142, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 814
84,432, // digit
85,1094, // {"1".."9"}
86,1094, // "0"
87,331, // digit128
88,521, // {176..185}
123,86, // digit*
124,1113, // $$1
  }
,
{ // state 815
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 816
0x80000000|1, // match move
0x80000000|203, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 817
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 818
25,MIN_REDUCTION+63, // `[
90,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 819
0x80000000|1, // match move
0x80000000|187, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 820
25,MIN_REDUCTION+140, // `[
90,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 821
25,MIN_REDUCTION+140, // `[
90,MIN_REDUCTION+140, // "["
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 822
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 823
25,MIN_REDUCTION+65, // `[
90,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 824
0x80000000|1, // match move
0x80000000|927, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 825
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 826
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 827
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 828
0x80000000|1, // match move
0x80000000|662, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 829
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 830
43,1011, // `+
45,737, // `-
91,87, // "-"
106,677, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 831
25,MIN_REDUCTION+136, // `[
90,MIN_REDUCTION+136, // "["
94,513, // " "
111,304, // {10}
120,36, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 832
0x80000000|1141, // match move
0x80000000|1021, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 833
43,980, // `+
45,729, // `-
91,87, // "-"
106,677, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 834
2,265, // ws*
25,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,768, // " "
111,1086, // {10}
120,1247, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 835
0x80000000|64, // match move
0x80000000|230, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 836
0x80000000|752, // match move
0x80000000|771, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 837
0x80000000|752, // match move
0x80000000|772, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 838
0x80000000|1, // match move
0x80000000|820, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 839
2,274, // ws*
25,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,765, // " "
111,1083, // {10}
120,1246, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 840
2,1082, // ws*
94,144, // " "
111,1315, // {10}
120,509, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 841
0x80000000|1, // match move
0x80000000|821, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 842
134,MIN_REDUCTION+69, // $NT
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 843
80,1028, // "t"
  }
,
{ // state 844
26,1098, // `]
98,202, // "]"
  }
,
{ // state 845
0x80000000|1009, // match move
0x80000000|295, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 846
25,MIN_REDUCTION+159, // `[
90,MIN_REDUCTION+159, // "["
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 847
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 848
0x80000000|407, // match move
0x80000000|793, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 849
26,1102, // `]
98,211, // "]"
  }
,
{ // state 850
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 851
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 852
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 853
0x80000000|1, // match move
0x80000000|967, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 854
94,346, // " "
111,730, // {10}
120,512, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 855
65,303, // "a"
66,303, // "p"
67,303, // "v"
68,303, // "c"
69,303, // "f"
70,303, // "i"
71,303, // "l"
72,303, // "o"
73,303, // "r"
74,303, // "u"
75,303, // "b"
76,303, // "e"
77,303, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,303, // "h"
79,303, // "n"
80,303, // "t"
82,1316, // {199..218 231..250}
83,1316, // {193..198 225..230}
85,303, // {"1".."9"}
86,303, // "0"
88,1316, // {176..185}
89,176, // any
90,303, // "["
91,303, // "-"
92,303, // "<"
93,303, // "|"
94,303, // " "
95,303, // "#"
96,303, // "&"
97,303, // ")"
98,303, // "]"
99,303, // "/"
100,303, // ";"
101,303, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,303, // ">"
103,303, // "{"
104,303, // "%"
105,303, // "("
106,303, // "+"
107,303, // "."
108,303, // "_"
109,303, // "="
110,303, // "@"
111,303, // {10}
112,303, // "}"
113,303, // "!"
114,303, // "'"
115,303, // '"'
116,303, // "*"
117,259, // any128
118,1316, // {223}
119,1316, // {128..175 186..192 219..222 224 251..255}
128,308, // $$3
  }
,
{ // state 856
0x80000000|1, // match move
0x80000000|970, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 857
0x80000000|1, // match move
0x80000000|800, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 858
2,828, // ws*
25,MIN_REDUCTION+183, // `[
90,MIN_REDUCTION+183, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 859
0x80000000|822, // match move
0x80000000|384, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 860
0x80000000|1009, // match move
0x80000000|236, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 861
25,MIN_REDUCTION+159, // `[
90,MIN_REDUCTION+159, // "["
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 862
0x80000000|1009, // match move
0x80000000|237, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 863
25,MIN_REDUCTION+159, // `[
90,MIN_REDUCTION+159, // "["
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 864
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 865
MIN_REDUCTION+41, // (default reduction)
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
{ // state 866
65,303, // "a"
66,303, // "p"
67,303, // "v"
68,303, // "c"
69,303, // "f"
70,303, // "i"
71,303, // "l"
72,303, // "o"
73,303, // "r"
74,303, // "u"
75,303, // "b"
76,303, // "e"
77,303, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,303, // "h"
79,303, // "n"
80,303, // "t"
82,1319, // {199..218 231..250}
83,1319, // {193..198 225..230}
85,303, // {"1".."9"}
86,303, // "0"
88,1319, // {176..185}
89,176, // any
90,303, // "["
91,303, // "-"
92,303, // "<"
93,303, // "|"
94,303, // " "
95,303, // "#"
96,303, // "&"
97,303, // ")"
98,303, // "]"
99,303, // "/"
100,303, // ";"
101,303, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,303, // ">"
103,303, // "{"
104,303, // "%"
105,303, // "("
106,303, // "+"
107,303, // "."
108,303, // "_"
109,303, // "="
110,303, // "@"
111,303, // {10}
112,303, // "}"
113,303, // "!"
114,303, // "'"
115,303, // '"'
116,303, // "*"
117,266, // any128
118,1319, // {223}
119,1319, // {128..175 186..192 219..222 224 251..255}
128,313, // $$3
  }
,
{ // state 867
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 868
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 869
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 870
25,MIN_REDUCTION+56, // `[
90,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 871
0x80000000|1, // match move
0x80000000|394, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 872
2,685, // ws*
94,372, // " "
111,779, // {10}
120,1184, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 873
65,303, // "a"
66,303, // "p"
67,303, // "v"
68,303, // "c"
69,303, // "f"
70,303, // "i"
71,303, // "l"
72,303, // "o"
73,303, // "r"
74,303, // "u"
75,303, // "b"
76,303, // "e"
77,303, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,303, // "h"
79,303, // "n"
80,303, // "t"
82,1176, // {199..218 231..250}
83,1176, // {193..198 225..230}
85,303, // {"1".."9"}
86,303, // "0"
88,1176, // {176..185}
89,176, // any
90,303, // "["
91,303, // "-"
92,303, // "<"
93,303, // "|"
94,303, // " "
95,303, // "#"
96,303, // "&"
97,303, // ")"
98,303, // "]"
99,303, // "/"
100,303, // ";"
101,303, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,303, // ">"
103,303, // "{"
104,303, // "%"
105,303, // "("
106,303, // "+"
107,303, // "."
108,303, // "_"
109,303, // "="
110,303, // "@"
111,303, // {10}
112,303, // "}"
113,303, // "!"
114,303, // "'"
115,303, // '"'
116,303, // "*"
117,292, // any128
118,1176, // {223}
119,1176, // {128..175 186..192 219..222 224 251..255}
128,334, // $$3
  }
,
{ // state 874
2,569, // ws*
94,1221, // " "
111,1144, // {10}
120,122, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 875
2,928, // ws*
94,293, // " "
111,1060, // {10}
120,96, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 876
0x80000000|1, // match move
0x80000000|391, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 877
0x80000000|1, // match move
0x80000000|307, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 878
46,747, // `*
48,805, // `/
49,590, // `%
99,1128, // "/"
104,840, // "%"
116,647, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 879
65,303, // "a"
66,303, // "p"
67,303, // "v"
68,303, // "c"
69,303, // "f"
70,303, // "i"
71,303, // "l"
72,303, // "o"
73,303, // "r"
74,303, // "u"
75,303, // "b"
76,303, // "e"
77,303, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,303, // "h"
79,303, // "n"
80,303, // "t"
82,1319, // {199..218 231..250}
83,1319, // {193..198 225..230}
85,303, // {"1".."9"}
86,303, // "0"
88,1319, // {176..185}
89,1183, // any
90,303, // "["
91,303, // "-"
92,303, // "<"
93,303, // "|"
94,303, // " "
95,303, // "#"
96,303, // "&"
97,303, // ")"
98,303, // "]"
99,303, // "/"
100,303, // ";"
101,303, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,303, // ">"
103,303, // "{"
104,303, // "%"
105,303, // "("
106,303, // "+"
107,303, // "."
108,303, // "_"
109,303, // "="
110,303, // "@"
111,303, // {10}
112,303, // "}"
113,303, // "!"
114,303, // "'"
115,303, // '"'
116,303, // "*"
117,266, // any128
118,1319, // {223}
119,1319, // {128..175 186..192 219..222 224 251..255}
127,866, // any*
128,212, // $$3
  }
,
{ // state 880
21,370, // `;
100,875, // ";"
  }
,
{ // state 881
0x80000000|310, // match move
0x80000000|155, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 882
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 883
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 884
7,226, // ID
15,395, // `(
51,819, // <exp1>
52,892, // <cast exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
95,981, // "#"
105,347, // "("
110,1227, // "@"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 885
2,562, // ws*
94,1223, // " "
111,1145, // {10}
120,124, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 886
0x80000000|310, // match move
0x80000000|158, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 887
0x80000000|695, // match move
0x80000000|949, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 888
2,1153, // ws*
25,MIN_REDUCTION+87, // `[
90,MIN_REDUCTION+87, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 889
65,303, // "a"
66,303, // "p"
67,303, // "v"
68,303, // "c"
69,303, // "f"
70,303, // "i"
71,303, // "l"
72,303, // "o"
73,303, // "r"
74,303, // "u"
75,303, // "b"
76,303, // "e"
77,303, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,303, // "h"
79,303, // "n"
80,303, // "t"
82,1316, // {199..218 231..250}
83,1316, // {193..198 225..230}
85,303, // {"1".."9"}
86,303, // "0"
88,1316, // {176..185}
89,1183, // any
90,303, // "["
91,303, // "-"
92,303, // "<"
93,303, // "|"
94,303, // " "
95,303, // "#"
96,303, // "&"
97,303, // ")"
98,303, // "]"
99,303, // "/"
100,303, // ";"
101,303, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,303, // ">"
103,303, // "{"
104,303, // "%"
105,303, // "("
106,303, // "+"
107,303, // "."
108,303, // "_"
109,303, // "="
110,303, // "@"
111,303, // {10}
112,303, // "}"
113,303, // "!"
114,303, // "'"
115,303, // '"'
116,303, // "*"
117,259, // any128
118,1316, // {223}
119,1316, // {128..175 186..192 219..222 224 251..255}
127,855, // any*
128,210, // $$3
  }
,
{ // state 890
46,754, // `*
48,811, // `/
49,592, // `%
99,1128, // "/"
104,840, // "%"
116,647, // "*"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 891
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 892
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 893
0x80000000|852, // match move
0x80000000|846, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 894
7,457, // ID
64,1302, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,349, // letter128
82,1103, // {199..218 231..250}
83,1103, // {193..198 225..230}
  }
,
{ // state 895
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 896
0x80000000|234, // match move
0x80000000|40, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 897
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 898
3,1305, // <program>
4,641, // <class decl>+
5,1089, // <class decl>
6,894, // `class
94,826, // " "
95,231, // "#"
111,631, // {10}
120,255, // ws
  }
,
{ // state 899
0x80000000|262, // match move
0x80000000|330, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 900
7,147, // ID
15,411, // `(
51,816, // <exp1>
52,882, // <cast exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
95,988, // "#"
105,347, // "("
110,1232, // "@"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 901
2,786, // ws*
25,MIN_REDUCTION+183, // `[
90,MIN_REDUCTION+183, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 902
0x80000000|1, // match move
0x80000000|412, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 903
2,780, // ws*
25,MIN_REDUCTION+183, // `[
90,MIN_REDUCTION+183, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 904
0x80000000|1, // match move
0x80000000|48, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 905
94,386, // " "
111,775, // {10}
120,572, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 906
0x80000000|1, // match move
0x80000000|50, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 907
0x80000000|310, // match move
0x80000000|214, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 908
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 909
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 910
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 911
2,1256, // ws*
94,1235, // " "
111,222, // {10}
120,16, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 912
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 913
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 914
25,MIN_REDUCTION+139, // `[
90,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 915
25,MIN_REDUCTION+155, // `[
90,MIN_REDUCTION+155, // "["
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 916
94,1177, // " "
111,1034, // {10}
120,945, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 917
2,201, // ws*
94,31, // " "
111,166, // {10}
120,161, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 918
0x80000000|1, // match move
0x80000000|649, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 919
2,410, // ws*
94,1245, // " "
111,1162, // {10}
120,105, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 920
65,303, // "a"
66,303, // "p"
67,303, // "v"
68,303, // "c"
69,303, // "f"
70,303, // "i"
71,303, // "l"
72,303, // "o"
73,303, // "r"
74,303, // "u"
75,303, // "b"
76,303, // "e"
77,303, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,303, // "h"
79,303, // "n"
80,303, // "t"
82,1176, // {199..218 231..250}
83,1176, // {193..198 225..230}
85,303, // {"1".."9"}
86,303, // "0"
88,1176, // {176..185}
89,1183, // any
90,303, // "["
91,303, // "-"
92,303, // "<"
93,303, // "|"
94,303, // " "
95,303, // "#"
96,303, // "&"
97,303, // ")"
98,303, // "]"
99,303, // "/"
100,303, // ";"
101,303, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,303, // ">"
103,303, // "{"
104,303, // "%"
105,303, // "("
106,303, // "+"
107,303, // "."
108,303, // "_"
109,303, // "="
110,303, // "@"
111,303, // {10}
112,303, // "}"
113,303, // "!"
114,303, // "'"
115,303, // '"'
116,303, // "*"
117,292, // any128
118,1176, // {223}
119,1176, // {128..175 186..192 219..222 224 251..255}
127,873, // any*
128,191, // $$3
  }
,
{ // state 921
21,1048, // `;
100,875, // ";"
  }
,
{ // state 922
94,1135, // " "
111,681, // {10}
120,301, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 923
43,336, // `+
45,707, // `-
91,87, // "-"
106,677, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 924
7,167, // ID
15,458, // `(
51,877, // <exp1>
52,1005, // <cast exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
95,454, // "#"
105,347, // "("
110,1196, // "@"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 925
25,MIN_REDUCTION+69, // `[
90,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 926
25,MIN_REDUCTION+139, // `[
90,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 927
25,MIN_REDUCTION+139, // `[
90,MIN_REDUCTION+139, // "["
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 928
94,293, // " "
111,1060, // {10}
120,24, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 929
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1293, // ID
1133, // `{
-1, // <decl in class>*
129, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
411, // `(
-1, // `)
-1, // <stmt>*
645, // <type>
-1, // `return
14, // <exp>
423, // `;
1280, // `int
1107, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
829, // <stmt>
951, // <assign>
2, // `break
348, // <local var decl>
-1, // `=
722, // <exp8>
-1, // `||
1212, // <exp7>
-1, // `&&
1150, // <exp6>
-1, // `==
1105, // <exp5>
-1, // `<
290, // <exp4>
-1, // `>
-1, // `instanceof
723, // `+
878, // <exp3>
1287, // `-
-1, // `*
865, // <exp2>
-1, // `/
-1, // `%
522, // `!
994, // <exp1>
341, // <cast exp>
199, // <unary exp>
355, // `new
-1, // <empty bracket pair>*
906, // INTLIT
856, // CHARLIT
1182, // STRINGLIT
361, // `true
1033, // `false
461, // `this
623, // `null
-1, // `.
1031, // letter
804, // "a"
804, // "p"
804, // "v"
804, // "c"
804, // "f"
804, // "i"
804, // "l"
804, // "o"
804, // "r"
804, // "u"
804, // "b"
804, // "e"
804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
804, // "h"
804, // "n"
804, // "t"
832, // letter128
360, // {199..218 231..250}
360, // {193..198 225..230}
-1, // digit
1224, // {"1".."9"}
377, // "0"
601, // digit128
837, // {176..185}
-1, // any
-1, // "["
556, // "-"
-1, // "<"
-1, // "|"
-1, // " "
1046, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
930, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
799, // "{"
-1, // "%"
347, // "("
436, // "+"
-1, // "."
-1, // "_"
-1, // "="
1232, // "@"
-1, // {10}
352, // "}"
69, // "!"
1109, // "'"
889, // '"'
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
{ // state 930
2,49, // ws*
94,1001, // " "
111,160, // {10}
120,850, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 931
94,1160, // " "
111,67, // {10}
120,1029, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 932
21,92, // `;
100,875, // ";"
  }
,
{ // state 933
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 934
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 935
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 936
2,353, // ws*
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 937
94,103, // " "
111,1197, // {10}
120,1064, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 938
0x80000000|852, // match move
0x80000000|863, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 939
94,338, // " "
111,735, // {10}
120,574, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 940
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 941
0x80000000|852, // match move
0x80000000|861, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 942
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 943
2,743, // ws*
  }
,
{ // state 944
0x80000000|1270, // match move
0x80000000|990, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 945
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 946
94,316, // " "
111,719, // {10}
120,489, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 947
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 948
2,1157, // ws*
94,103, // " "
111,1197, // {10}
120,566, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 949
2,261, // ws*
94,835, // " "
111,172, // {10}
120,107, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 950
25,MIN_REDUCTION+55, // `[
90,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 951
21,209, // `;
100,930, // ";"
  }
,
{ // state 952
0x80000000|637, // match move
0x80000000|858, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 953
80,227, // "t"
  }
,
{ // state 954
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 955
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 956
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 957
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1293, // ID
97, // `{
-1, // <decl in class>*
-1, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
411, // `(
-1, // `)
1187, // <stmt>*
645, // <type>
459, // `return
14, // <exp>
396, // `;
1280, // `int
1107, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
529, // <stmt>
921, // <assign>
932, // `break
880, // <local var decl>
-1, // `=
722, // <exp8>
-1, // `||
1212, // <exp7>
-1, // `&&
1150, // <exp6>
-1, // `==
1105, // <exp5>
-1, // `<
290, // <exp4>
-1, // `>
-1, // `instanceof
723, // `+
878, // <exp3>
1287, // `-
-1, // `*
865, // <exp2>
-1, // `/
-1, // `%
522, // `!
994, // <exp1>
341, // <cast exp>
199, // <unary exp>
355, // `new
-1, // <empty bracket pair>*
906, // INTLIT
856, // CHARLIT
1182, // STRINGLIT
361, // `true
1033, // `false
461, // `this
623, // `null
-1, // `.
1031, // letter
804, // "a"
804, // "p"
804, // "v"
804, // "c"
804, // "f"
804, // "i"
804, // "l"
804, // "o"
804, // "r"
804, // "u"
804, // "b"
804, // "e"
804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
804, // "h"
804, // "n"
804, // "t"
832, // letter128
360, // {199..218 231..250}
360, // {193..198 225..230}
-1, // digit
1224, // {"1".."9"}
377, // "0"
601, // digit128
837, // {176..185}
-1, // any
-1, // "["
556, // "-"
-1, // "<"
-1, // "|"
-1, // " "
643, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
875, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
799, // "{"
-1, // "%"
347, // "("
436, // "+"
-1, // "."
-1, // "_"
-1, // "="
1232, // "@"
-1, // {10}
-1, // "}"
69, // "!"
1109, // "'"
889, // '"'
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
{ // state 958
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 959
2,584, // ws*
25,MIN_REDUCTION+147, // `[
90,MIN_REDUCTION+147, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 960
25,MIN_REDUCTION+122, // `[
90,MIN_REDUCTION+122, // "["
94,765, // " "
111,1083, // {10}
120,504, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 961
2,787, // ws*
  }
,
{ // state 962
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1293, // ID
1133, // `{
-1, // <decl in class>*
897, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
411, // `(
-1, // `)
-1, // <stmt>*
645, // <type>
-1, // `return
14, // <exp>
423, // `;
1280, // `int
1107, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
829, // <stmt>
951, // <assign>
2, // `break
348, // <local var decl>
-1, // `=
722, // <exp8>
-1, // `||
1212, // <exp7>
-1, // `&&
1150, // <exp6>
-1, // `==
1105, // <exp5>
-1, // `<
290, // <exp4>
-1, // `>
-1, // `instanceof
723, // `+
878, // <exp3>
1287, // `-
-1, // `*
865, // <exp2>
-1, // `/
-1, // `%
522, // `!
994, // <exp1>
341, // <cast exp>
199, // <unary exp>
355, // `new
-1, // <empty bracket pair>*
906, // INTLIT
856, // CHARLIT
1182, // STRINGLIT
361, // `true
1033, // `false
461, // `this
623, // `null
-1, // `.
1031, // letter
804, // "a"
804, // "p"
804, // "v"
804, // "c"
804, // "f"
804, // "i"
804, // "l"
804, // "o"
804, // "r"
804, // "u"
804, // "b"
804, // "e"
804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
804, // "h"
804, // "n"
804, // "t"
832, // letter128
360, // {199..218 231..250}
360, // {193..198 225..230}
-1, // digit
1224, // {"1".."9"}
377, // "0"
601, // digit128
837, // {176..185}
-1, // any
-1, // "["
556, // "-"
-1, // "<"
-1, // "|"
-1, // " "
1046, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
930, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
799, // "{"
-1, // "%"
347, // "("
436, // "+"
-1, // "."
-1, // "_"
-1, // "="
1232, // "@"
-1, // {10}
578, // "}"
69, // "!"
1109, // "'"
889, // '"'
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
{ // state 963
2,791, // ws*
  }
,
{ // state 964
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 965
2,916, // ws*
94,1177, // " "
111,1034, // {10}
120,717, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 966
25,MIN_REDUCTION+142, // `[
90,MIN_REDUCTION+142, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 967
25,MIN_REDUCTION+55, // `[
90,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 968
25,MIN_REDUCTION+146, // `[
90,MIN_REDUCTION+146, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 969
2,498, // ws*
25,MIN_REDUCTION+147, // `[
90,MIN_REDUCTION+147, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 970
25,MIN_REDUCTION+55, // `[
90,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 971
0x80000000|1, // match move
0x80000000|246, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 972
94,350, // " "
111,757, // {10}
120,545, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 973
0x80000000|478, // match move
0x80000000|774, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 974
0x80000000|1267, // match move
0x80000000|987, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 975
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 976
25,MIN_REDUCTION+122, // `[
90,MIN_REDUCTION+122, // "["
94,768, // " "
111,1086, // {10}
120,506, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 977
134,MIN_REDUCTION+68, // $NT
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 978
2,635, // ws*
  }
,
{ // state 979
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 980
7,147, // ID
15,411, // `(
43,723, // `+
44,329, // <exp3>
45,1287, // `-
47,865, // <exp2>
50,522, // `!
51,994, // <exp1>
52,341, // <cast exp>
53,199, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
105,347, // "("
106,436, // "+"
110,1232, // "@"
113,69, // "!"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 981
69,200, // "f"
79,474, // "n"
80,1096, // "t"
  }
,
{ // state 982
25,MIN_REDUCTION+65, // `[
90,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 983
2,297, // ws*
94,746, // " "
111,534, // {10}
120,933, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 984
25,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 985
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 986
94,357, // " "
111,33, // {10}
120,193, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 987
2,173, // ws*
25,MIN_REDUCTION+87, // `[
90,MIN_REDUCTION+87, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 988
69,180, // "f"
79,483, // "n"
80,1071, // "t"
  }
,
{ // state 989
0x80000000|1, // match move
0x80000000|1204, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 990
2,171, // ws*
25,MIN_REDUCTION+87, // `[
90,MIN_REDUCTION+87, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 991
7,226, // ID
15,395, // `(
20,1261, // <exp>
32,726, // <exp8>
34,1216, // <exp7>
36,1140, // <exp6>
38,232, // <exp5>
40,299, // <exp4>
43,734, // `+
44,890, // <exp3>
45,1289, // `-
47,864, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 992
0x80000000|1, // match move
0x80000000|613, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 993
0x80000000|596, // match move
0x80000000|420, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 994
0x80000000|1, // match move
0x80000000|1208, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 995
0x80000000|1, // match move
0x80000000|617, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 996
2,635, // ws*
25,MIN_REDUCTION+147, // `[
90,MIN_REDUCTION+147, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 997
25,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 998
25,MIN_REDUCTION+122, // `[
90,MIN_REDUCTION+122, // "["
94,745, // " "
111,1056, // {10}
120,694, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 999
0x80000000|320, // match move
0x80000000|184, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1000
25,MIN_REDUCTION+56, // `[
90,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 1001
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1002
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1003
0x80000000|1166, // match move
0x80000000|1091, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1004
37,450, // `==
110,77, // "@"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1005
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1006
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1007
25,MIN_REDUCTION+56, // `[
90,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 1008
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1009
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1010
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1011
7,226, // ID
15,395, // `(
43,734, // `+
44,333, // <exp3>
45,1289, // `-
47,864, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 1012
0x80000000|1, // match move
0x80000000|692, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1013
37,460, // `==
110,77, // "@"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1014
25,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1015
25,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1016
0x80000000|1117, // match move
0x80000000|982, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1017
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1018
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1019
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1020
2,1295, // ws*
  }
,
{ // state 1021
2,196, // ws*
25,MIN_REDUCTION+137, // `[
90,MIN_REDUCTION+137, // "["
94,513, // " "
111,304, // {10}
120,679, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1022
25,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1023
7,MIN_REDUCTION+13, // ID
25,MIN_REDUCTION+50, // `[
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
{ // state 1024
2,1290, // ws*
  }
,
{ // state 1025
0x80000000|610, // match move
0x80000000|283, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1026
25,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1027
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1028
2,218, // ws*
94,1160, // " "
111,67, // {10}
120,1262, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1029
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1030
0x80000000|1, // match move
0x80000000|473, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1031
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,788, // letter128
82,360, // {199..218 231..250}
83,360, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,127, // digit128
88,1016, // {176..185}
108,1205, // "_"
118,302, // {223}
121,549, // idChar*
122,1308, // $$0
129,240, // idChar
130,183, // idChar128
  }
,
{ // state 1032
94,835, // " "
111,172, // {10}
120,508, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1033
0x80000000|1, // match move
0x80000000|479, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1034
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1035
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1036
16,924, // `)
24,537, // <empty bracket pair>
25,1321, // `[
90,305, // "["
97,917, // ")"
  }
,
{ // state 1037
24,589, // <empty bracket pair>
25,1238, // `[
90,305, // "["
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1038
72,911, // "o"
  }
,
{ // state 1039
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1040
0x80000000|1066, // match move
0x80000000|908, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1041
2,659, // ws*
25,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1042
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1043
0x80000000|612, // match move
0x80000000|281, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1044
2,674, // ws*
25,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1045
71,405, // "l"
  }
,
{ // state 1046
69,180, // "f"
70,648, // "i"
75,559, // "b"
79,483, // "n"
80,1071, // "t"
  }
,
{ // state 1047
25,MIN_REDUCTION+82, // `[
90,MIN_REDUCTION+82, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1048
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1049
0x80000000|335, // match move
0x80000000|969, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1050
25,MIN_REDUCTION+82, // `[
90,MIN_REDUCTION+82, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1051
25,MIN_REDUCTION+176, // `[
90,MIN_REDUCTION+176, // "["
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1052
25,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1053
93,773, // "|"
96,1303, // "&"
  }
,
{ // state 1054
94,357, // " "
111,33, // {10}
120,193, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1055
24,573, // <empty bracket pair>
25,1203, // `[
90,305, // "["
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1056
0x80000000|1017, // match move
0x80000000|178, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1057
0x80000000|332, // match move
0x80000000|959, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1058
0x80000000|1, // match move
0x80000000|455, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1059
25,MIN_REDUCTION+63, // `[
90,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1060
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1061
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1062
2,68, // ws*
94,1160, // " "
111,67, // {10}
120,1262, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1063
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1064
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1065
65,462, // "a"
66,462, // "p"
67,462, // "v"
68,462, // "c"
69,462, // "f"
70,462, // "i"
71,462, // "l"
72,462, // "o"
73,462, // "r"
74,462, // "u"
75,462, // "b"
76,462, // "e"
77,462, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,462, // "h"
79,462, // "n"
80,462, // "t"
85,462, // {"1".."9"}
86,462, // "0"
89,502, // any
90,462, // "["
91,462, // "-"
92,462, // "<"
93,462, // "|"
94,462, // " "
95,462, // "#"
96,462, // "&"
97,462, // ")"
98,462, // "]"
99,462, // "/"
100,462, // ";"
101,462, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,462, // ">"
103,462, // "{"
104,462, // "%"
105,462, // "("
106,462, // "+"
107,462, // "."
108,462, // "_"
109,462, // "="
110,462, // "@"
111,462, // {10}
112,462, // "}"
113,462, // "!"
114,462, // "'"
115,462, // '"'
116,462, // "*"
  }
,
{ // state 1066
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1067
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1068
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1069
94,1160, // " "
111,67, // {10}
120,1029, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1070
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1071
73,527, // "r"
78,1025, // "h"
  }
,
{ // state 1072
25,MIN_REDUCTION+157, // `[
90,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1073
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1190, // letter128
82,827, // {199..218 231..250}
83,827, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1225, // digit128
88,548, // {176..185}
108,1205, // "_"
118,909, // {223}
122,1281, // $$0
129,1243, // idChar
130,10, // idChar128
  }
,
{ // state 1074
2,760, // ws*
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1075
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,5, // letter128
82,1035, // {199..218 231..250}
83,1035, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1283, // digit128
88,288, // {176..185}
108,1205, // "_"
118,351, // {223}
121,451, // idChar*
122,731, // $$0
129,240, // idChar
130,1288, // idChar128
  }
,
{ // state 1076
0x80000000|639, // match move
0x80000000|250, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1077
0x80000000|608, // match move
0x80000000|901, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1078
0x80000000|1, // match move
0x80000000|291, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1079
2,931, // ws*
94,1160, // " "
111,67, // {10}
120,1262, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1080
26,475, // `]
98,1003, // "]"
  }
,
{ // state 1081
94,977, // " "
111,842, // {10}
120,444, // ws
134,MIN_REDUCTION+122, // $NT
  }
,
{ // state 1082
94,144, // " "
111,1315, // {10}
120,958, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 1083
0x80000000|1017, // match move
0x80000000|154, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1084
0x80000000|606, // match move
0x80000000|903, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1085
16,884, // `)
24,537, // <empty bracket pair>
25,1321, // `[
90,305, // "["
97,917, // ")"
  }
,
{ // state 1086
0x80000000|1017, // match move
0x80000000|156, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1087
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1088
16,900, // `)
24,537, // <empty bracket pair>
25,1321, // `[
90,305, // "["
97,917, // ")"
  }
,
{ // state 1089
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1090
2,4, // ws*
  }
,
{ // state 1091
2,495, // ws*
25,MIN_REDUCTION+123, // `[
90,MIN_REDUCTION+123, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1092
7,226, // ID
15,395, // `(
20,964, // <exp>
32,726, // <exp8>
34,1216, // <exp7>
36,1140, // <exp6>
38,232, // <exp5>
40,299, // <exp4>
43,734, // `+
44,890, // <exp3>
45,1289, // `-
47,864, // <exp2>
50,520, // `!
51,989, // <exp1>
52,342, // <cast exp>
53,192, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
105,347, // "("
106,436, // "+"
110,1227, // "@"
113,69, // "!"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 1093
0x80000000|1, // match move
0x80000000|289, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1094
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1095
25,MIN_REDUCTION+82, // `[
90,MIN_REDUCTION+82, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1096
73,554, // "r"
78,1043, // "h"
  }
,
{ // state 1097
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,125, // letter128
82,1019, // {199..218 231..250}
83,1019, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1275, // digit128
88,328, // {176..185}
108,1205, // "_"
118,387, // {223}
121,480, // idChar*
122,985, // $$0
129,240, // idChar
130,34, // idChar128
  }
,
{ // state 1098
0x80000000|408, // match move
0x80000000|728, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1099
26,324, // `]
98,724, // "]"
  }
,
{ // state 1100
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1063, // letter128
82,1010, // {199..218 231..250}
83,1010, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1201, // digit128
88,947, // {176..185}
108,1205, // "_"
118,867, // {223}
121,228, // idChar*
122,358, // $$0
129,240, // idChar
130,1079, // idChar128
  }
,
{ // state 1101
26,325, // `]
98,736, // "]"
  }
,
{ // state 1102
0x80000000|414, // match move
0x80000000|732, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1103
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1104
0x80000000|978, // match move
0x80000000|996, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1105
39,131, // `<
41,41, // `>
42,683, // `instanceof
92,948, // "<"
95,275, // "#"
102,100, // ">"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1106
94,675, // " "
111,19, // {10}
120,382, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1107
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1108
25,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1109
65,440, // "a"
66,440, // "p"
67,440, // "v"
68,440, // "c"
69,440, // "f"
70,440, // "i"
71,440, // "l"
72,440, // "o"
73,440, // "r"
74,440, // "u"
75,440, // "b"
76,440, // "e"
77,440, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,440, // "h"
79,440, // "n"
80,440, // "t"
85,440, // {"1".."9"}
86,440, // "0"
89,667, // any
90,440, // "["
91,440, // "-"
92,440, // "<"
93,440, // "|"
94,440, // " "
95,440, // "#"
96,440, // "&"
97,440, // ")"
98,440, // "]"
99,440, // "/"
100,440, // ";"
101,440, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,440, // ">"
103,440, // "{"
104,440, // "%"
105,440, // "("
106,440, // "+"
107,440, // "."
108,440, // "_"
109,440, // "="
110,440, // "@"
111,440, // {10}
112,440, // "}"
113,440, // "!"
114,440, // "'"
115,440, // '"'
116,440, // "*"
  }
,
{ // state 1110
25,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1111
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1112
25,MIN_REDUCTION+175, // `[
90,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1113
0x80000000|1, // match move
0x80000000|1146, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1114
25,MIN_REDUCTION+175, // `[
90,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1115
26,739, // `]
98,1255, // "]"
  }
,
{ // state 1116
35,568, // `&&
110,1053, // "@"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 1117
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 1118
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1119
25,MIN_REDUCTION+175, // `[
90,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1120
0x80000000|1, // match move
0x80000000|1163, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1121
25,MIN_REDUCTION+155, // `[
90,MIN_REDUCTION+155, // "["
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1122
0x80000000|1, // match move
0x80000000|1165, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1123
25,MIN_REDUCTION+155, // `[
90,MIN_REDUCTION+155, // "["
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1124
94,1160, // " "
111,67, // {10}
120,1029, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1125
7,764, // ID
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
  }
,
{ // state 1126
7,766, // ID
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
  }
,
{ // state 1127
65,443, // "a"
66,443, // "p"
67,443, // "v"
68,443, // "c"
69,443, // "f"
70,443, // "i"
71,443, // "l"
72,443, // "o"
73,443, // "r"
74,443, // "u"
75,443, // "b"
76,443, // "e"
77,443, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,443, // "h"
79,443, // "n"
80,443, // "t"
85,443, // {"1".."9"}
86,443, // "0"
89,671, // any
90,443, // "["
91,443, // "-"
92,443, // "<"
93,443, // "|"
94,443, // " "
95,443, // "#"
96,443, // "&"
97,443, // ")"
98,443, // "]"
99,443, // "/"
100,443, // ";"
101,443, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
102,443, // ">"
103,443, // "{"
104,443, // "%"
105,443, // "("
106,443, // "+"
107,443, // "."
108,443, // "_"
109,443, // "="
110,443, // "@"
111,443, // {10}
112,443, // "}"
113,443, // "!"
114,443, // "'"
115,443, // '"'
116,443, // "*"
  }
,
{ // state 1128
2,492, // ws*
94,144, // " "
111,1315, // {10}
120,509, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 1129
2,813, // ws*
94,979, // " "
111,113, // {10}
120,696, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1130
2,937, // ws*
94,103, // " "
111,1197, // {10}
120,566, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1131
2,1253, // ws*
25,MIN_REDUCTION+179, // `[
90,MIN_REDUCTION+179, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1132
43,336, // `+
45,707, // `-
91,87, // "-"
106,677, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1133
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1293, // ID
1133, // `{
-1, // <decl in class>*
883, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
411, // `(
-1, // `)
929, // <stmt>*
645, // <type>
-1, // `return
14, // <exp>
423, // `;
1280, // `int
1107, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
673, // <stmt>
951, // <assign>
2, // `break
348, // <local var decl>
-1, // `=
722, // <exp8>
-1, // `||
1212, // <exp7>
-1, // `&&
1150, // <exp6>
-1, // `==
1105, // <exp5>
-1, // `<
290, // <exp4>
-1, // `>
-1, // `instanceof
723, // `+
878, // <exp3>
1287, // `-
-1, // `*
865, // <exp2>
-1, // `/
-1, // `%
522, // `!
994, // <exp1>
341, // <cast exp>
199, // <unary exp>
355, // `new
-1, // <empty bracket pair>*
906, // INTLIT
856, // CHARLIT
1182, // STRINGLIT
361, // `true
1033, // `false
461, // `this
623, // `null
-1, // `.
1031, // letter
804, // "a"
804, // "p"
804, // "v"
804, // "c"
804, // "f"
804, // "i"
804, // "l"
804, // "o"
804, // "r"
804, // "u"
804, // "b"
804, // "e"
804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
804, // "h"
804, // "n"
804, // "t"
832, // letter128
360, // {199..218 231..250}
360, // {193..198 225..230}
-1, // digit
1224, // {"1".."9"}
377, // "0"
601, // digit128
837, // {176..185}
-1, // any
-1, // "["
556, // "-"
-1, // "<"
-1, // "|"
-1, // " "
1046, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
930, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
799, // "{"
-1, // "%"
347, // "("
436, // "+"
-1, // "."
-1, // "_"
-1, // "="
1232, // "@"
-1, // {10}
352, // "}"
69, // "!"
1109, // "'"
889, // '"'
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
{ // state 1134
0x80000000|579, // match move
0x80000000|1110, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1135
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1136
2,418, // ws*
94,835, // " "
111,172, // {10}
120,107, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1137
0x80000000|579, // match move
0x80000000|1108, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1138
0x80000000|847, // match move
0x80000000|1301, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1139
0x80000000|1020, // match move
0x80000000|713, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1140
37,460, // `==
110,77, // "@"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1141
2,196, // ws*
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1142
7,607, // ID
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
  }
,
{ // state 1143
2,676, // ws*
94,979, // " "
111,113, // {10}
120,696, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 1144
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1145
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1146
25,MIN_REDUCTION+141, // `[
90,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1147
2,271, // ws*
94,1235, // " "
111,222, // {10}
120,16, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1148
94,314, // " "
111,720, // {10}
120,493, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 1149
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1150
37,450, // `==
110,77, // "@"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1151
0x80000000|1024, // match move
0x80000000|709, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1152
25,MIN_REDUCTION+122, // `[
90,MIN_REDUCTION+122, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1153
0x80000000|1, // match move
0x80000000|1274, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1154
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 1155
25,MIN_REDUCTION+68, // `[
90,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1156
25,424, // `[
63,1142, // `.
90,1129, // "["
107,1147, // "."
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1157
94,103, // " "
111,1197, // {10}
120,1064, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1158
0x80000000|579, // match move
0x80000000|1155, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1159
94,386, // " "
111,775, // {10}
120,572, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1160
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1161
25,MIN_REDUCTION+155, // `[
90,MIN_REDUCTION+155, // "["
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1162
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1163
25,MIN_REDUCTION+141, // `[
90,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1164
24,543, // <empty bracket pair>
25,1189, // `[
90,305, // "["
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1165
25,MIN_REDUCTION+141, // `[
90,MIN_REDUCTION+141, // "["
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 1166
2,495, // ws*
  }
,
{ // state 1167
39,11, // `<
41,22, // `>
42,655, // `instanceof
92,948, // "<"
95,275, // "#"
102,100, // ">"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1168
2,428, // ws*
94,1135, // " "
111,681, // {10}
120,128, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1169
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1170
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1171
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1293, // ID
1133, // `{
-1, // <decl in class>*
940, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
411, // `(
-1, // `)
245, // <stmt>*
645, // <type>
-1, // `return
14, // <exp>
423, // `;
1280, // `int
1107, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
673, // <stmt>
951, // <assign>
2, // `break
348, // <local var decl>
-1, // `=
722, // <exp8>
-1, // `||
1212, // <exp7>
-1, // `&&
1150, // <exp6>
-1, // `==
1105, // <exp5>
-1, // `<
290, // <exp4>
-1, // `>
-1, // `instanceof
723, // `+
878, // <exp3>
1287, // `-
-1, // `*
865, // <exp2>
-1, // `/
-1, // `%
522, // `!
994, // <exp1>
341, // <cast exp>
199, // <unary exp>
355, // `new
-1, // <empty bracket pair>*
906, // INTLIT
856, // CHARLIT
1182, // STRINGLIT
361, // `true
1033, // `false
461, // `this
623, // `null
-1, // `.
1031, // letter
804, // "a"
804, // "p"
804, // "v"
804, // "c"
804, // "f"
804, // "i"
804, // "l"
804, // "o"
804, // "r"
804, // "u"
804, // "b"
804, // "e"
804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
804, // "h"
804, // "n"
804, // "t"
832, // letter128
360, // {199..218 231..250}
360, // {193..198 225..230}
-1, // digit
1224, // {"1".."9"}
377, // "0"
601, // digit128
837, // {176..185}
-1, // any
-1, // "["
556, // "-"
-1, // "<"
-1, // "|"
-1, // " "
1046, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
930, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
799, // "{"
-1, // "%"
347, // "("
436, // "+"
-1, // "."
-1, // "_"
-1, // "="
1232, // "@"
-1, // {10}
1254, // "}"
69, // "!"
1109, // "'"
889, // '"'
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
{ // state 1172
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1173
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1174
0x80000000|1090, // match move
0x80000000|758, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1175
25,MIN_REDUCTION+148, // `[
90,MIN_REDUCTION+148, // "["
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1176
0x80000000|1111, // match move
0x80000000|104, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1177
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1178
25,MIN_REDUCTION+148, // `[
90,MIN_REDUCTION+148, // "["
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1179
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1180
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1181
0x80000000|1, // match move
0x80000000|1007, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1182
0x80000000|1, // match move
0x80000000|1000, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1183
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1184
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1185
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1186
94,725, // " "
111,536, // {10}
120,795, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1187
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
1293, // ID
97, // `{
-1, // <decl in class>*
-1, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
411, // `(
-1, // `)
-1, // <stmt>*
645, // <type>
991, // `return
14, // <exp>
396, // `;
1280, // `int
1107, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
1118, // <stmt>
921, // <assign>
932, // `break
880, // <local var decl>
-1, // `=
722, // <exp8>
-1, // `||
1212, // <exp7>
-1, // `&&
1150, // <exp6>
-1, // `==
1105, // <exp5>
-1, // `<
290, // <exp4>
-1, // `>
-1, // `instanceof
723, // `+
878, // <exp3>
1287, // `-
-1, // `*
865, // <exp2>
-1, // `/
-1, // `%
522, // `!
994, // <exp1>
341, // <cast exp>
199, // <unary exp>
355, // `new
-1, // <empty bracket pair>*
906, // INTLIT
856, // CHARLIT
1182, // STRINGLIT
361, // `true
1033, // `false
461, // `this
623, // `null
-1, // `.
1031, // letter
804, // "a"
804, // "p"
804, // "v"
804, // "c"
804, // "f"
804, // "i"
804, // "l"
804, // "o"
804, // "r"
804, // "u"
804, // "b"
804, // "e"
804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
804, // "h"
804, // "n"
804, // "t"
832, // letter128
360, // {199..218 231..250}
360, // {193..198 225..230}
-1, // digit
1224, // {"1".."9"}
377, // "0"
601, // digit128
837, // {176..185}
-1, // any
-1, // "["
556, // "-"
-1, // "<"
-1, // "|"
-1, // " "
643, // "#"
-1, // "&"
-1, // ")"
-1, // "]"
-1, // "/"
875, // ";"
-1, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
-1, // ">"
799, // "{"
-1, // "%"
347, // "("
436, // "+"
-1, // "."
-1, // "_"
-1, // "="
1232, // "@"
-1, // {10}
-1, // "}"
69, // "!"
1109, // "'"
889, // '"'
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
{ // state 1188
2,399, // ws*
94,386, // " "
111,775, // {10}
120,1185, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1189
26,825, // `]
98,582, // "]"
  }
,
{ // state 1190
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 1191
2,1069, // ws*
94,1160, // " "
111,67, // {10}
120,1262, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1192
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 1193
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1194
25,MIN_REDUCTION+150, // `[
90,MIN_REDUCTION+150, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1195
31,1092, // `=
109,186, // "="
  }
,
{ // state 1196
115,1104, // '"'
  }
,
{ // state 1197
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1198
2,7, // ws*
25,MIN_REDUCTION+85, // `[
90,MIN_REDUCTION+85, // "["
94,753, // " "
111,365, // {10}
120,1209, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1199
0x80000000|1, // match move
0x80000000|870, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1200
2,59, // ws*
25,MIN_REDUCTION+85, // `[
90,MIN_REDUCTION+85, // "["
94,751, // " "
111,362, // {10}
120,1210, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1201
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1202
0x80000000|1, // match move
0x80000000|140, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1203
26,571, // `]
98,519, // "]"
  }
,
{ // state 1204
25,400, // `[
63,1126, // `.
90,1129, // "["
107,1147, // "."
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1205
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1206
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1207
2,468, // ws*
  }
,
{ // state 1208
25,401, // `[
63,1125, // `.
90,1129, // "["
107,1147, // "."
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1209
0x80000000|1, // match move
0x80000000|1244, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1210
0x80000000|1, // match move
0x80000000|1242, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1211
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1212
35,540, // `&&
110,1053, // "@"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 1213
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1214
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1215
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1216
35,538, // `&&
110,1053, // "@"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 1217
46,769, // `*
48,782, // `/
49,403, // `%
99,1128, // "/"
104,840, // "%"
116,647, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1218
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1219
2,353, // ws*
94,835, // " "
111,172, // {10}
120,107, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1220
43,980, // `+
45,729, // `-
91,87, // "-"
106,677, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1221
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1222
84,432, // digit
85,1094, // {"1".."9"}
86,1094, // "0"
87,668, // digit128
88,836, // {176..185}
123,63, // digit*
124,1122, // $$1
  }
,
{ // state 1223
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1224
84,432, // digit
85,1094, // {"1".."9"}
86,1094, // "0"
87,672, // digit128
88,837, // {176..185}
123,61, // digit*
124,1120, // $$1
  }
,
{ // state 1225
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1226
25,MIN_REDUCTION+86, // `[
90,MIN_REDUCTION+86, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1227
115,1049, // '"'
  }
,
{ // state 1228
0x80000000|1, // match move
0x80000000|1260, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1229
25,MIN_REDUCTION+148, // `[
90,MIN_REDUCTION+148, // "["
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1230
25,MIN_REDUCTION+86, // `[
90,MIN_REDUCTION+86, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1231
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1232
115,1057, // '"'
  }
,
{ // state 1233
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1234
16,339, // `)
97,1241, // ")"
  }
,
{ // state 1235
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1236
2,111, // ws*
25,MIN_REDUCTION+85, // `[
90,MIN_REDUCTION+85, // "["
94,727, // " "
111,381, // {10}
120,1228, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1237
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1238
26,544, // `]
98,664, // "]"
  }
,
{ // state 1239
43,1011, // `+
45,737, // `-
91,87, // "-"
106,677, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1240
0x80000000|1, // match move
0x80000000|98, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1241
2,905, // ws*
94,386, // " "
111,775, // {10}
120,1185, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 1242
25,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1243
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1244
25,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1245
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1246
0x80000000|801, // match move
0x80000000|1244, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1247
0x80000000|801, // match move
0x80000000|1242, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1248
2,1153, // ws*
  }
,
{ // state 1249
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1250
0x80000000|1002, // match move
0x80000000|915, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1251
25,MIN_REDUCTION+150, // `[
90,MIN_REDUCTION+150, // "["
94,751, // " "
111,362, // {10}
120,777, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1252
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1253
0x80000000|1, // match move
0x80000000|257, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1254
2,809, // ws*
94,1231, // " "
111,112, // {10}
120,956, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1255
2,1081, // ws*
94,977, // " "
111,842, // {10}
120,1312, // ws
134,MIN_REDUCTION+123, // $NT
  }
,
{ // state 1256
94,1235, // " "
111,222, // {10}
120,51, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 1257
7,167, // ID
43,704, // `+
45,1257, // `-
51,778, // <exp1>
53,693, // <unary exp>
54,398, // `new
56,918, // INTLIT
57,792, // CHARLIT
58,1199, // STRINGLIT
59,971, // `true
60,1058, // `false
61,439, // `this
62,593, // `null
64,650, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,446, // letter128
82,907, // {199..218 231..250}
83,907, // {193..198 225..230}
85,814, // {"1".."9"}
86,417, // "0"
87,651, // digit128
88,521, // {176..185}
91,556, // "-"
95,454, // "#"
106,436, // "+"
110,1196, // "@"
114,1065, // "'"
115,920, // '"'
  }
,
{ // state 1258
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1259
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1260
25,MIN_REDUCTION+177, // `[
90,MIN_REDUCTION+177, // "["
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1261
21,12, // `;
100,872, // ";"
  }
,
{ // state 1262
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1263
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1264
0x80000000|1002, // match move
0x80000000|1123, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1265
0x80000000|801, // match move
0x80000000|1260, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1266
2,409, // ws*
  }
,
{ // state 1267
2,173, // ws*
  }
,
{ // state 1268
2,416, // ws*
  }
,
{ // state 1269
2,715, // ws*
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1270
2,171, // ws*
  }
,
{ // state 1271
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1169, // letter128
82,807, // {199..218 231..250}
83,807, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1172, // digit128
88,580, // {176..185}
108,1205, // "_"
118,895, // {223}
122,1307, // $$0
129,1243, // idChar
130,42, // idChar128
  }
,
{ // state 1272
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1273
0x80000000|1002, // match move
0x80000000|1121, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1274
25,MIN_REDUCTION+86, // `[
90,MIN_REDUCTION+86, // "["
94,727, // " "
111,381, // {10}
120,714, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1275
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1276
2,716, // ws*
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 1277
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,1173, // letter128
82,815, // {199..218 231..250}
83,815, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1170, // digit128
88,576, // {176..185}
108,1205, // "_"
118,891, // {223}
122,1296, // $$0
129,1243, // idChar
130,38, // idChar128
  }
,
{ // state 1278
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1279
0x80000000|1, // match move
0x80000000|614, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1280
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1281
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1282
94,1223, // " "
111,1145, // {10}
120,311, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1283
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1284
0x80000000|1, // match move
0x80000000|102, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1285
0x80000000|1, // match move
0x80000000|618, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1286
94,1221, // " "
111,1144, // {10}
120,388, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1287
7,147, // ID
43,723, // `+
45,1287, // `-
51,994, // <exp1>
53,501, // <unary exp>
54,355, // `new
56,906, // INTLIT
57,856, // CHARLIT
58,1182, // STRINGLIT
59,361, // `true
60,1033, // `false
61,461, // `this
62,623, // `null
64,600, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,151, // letter128
82,881, // {199..218 231..250}
83,881, // {193..198 225..230}
85,1224, // {"1".."9"}
86,377, // "0"
87,601, // digit128
88,837, // {176..185}
91,556, // "-"
95,988, // "#"
106,436, // "+"
110,1232, // "@"
114,1109, // "'"
115,889, // '"'
  }
,
{ // state 1288
2,309, // ws*
94,338, // " "
111,735, // {10}
120,1213, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 1289
7,226, // ID
43,734, // `+
45,1289, // `-
51,989, // <exp1>
53,503, // <unary exp>
54,356, // `new
56,904, // INTLIT
57,853, // CHARLIT
58,1181, // STRINGLIT
59,364, // `true
60,1030, // `false
61,465, // `this
62,626, // `null
64,611, // letter
65,804, // "a"
66,804, // "p"
67,804, // "v"
68,804, // "c"
69,804, // "f"
70,804, // "i"
71,804, // "l"
72,804, // "o"
73,804, // "r"
74,804, // "u"
75,804, // "b"
76,804, // "e"
77,804, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,804, // "h"
79,804, // "n"
80,804, // "t"
81,157, // letter128
82,886, // {199..218 231..250}
83,886, // {193..198 225..230}
85,1222, // {"1".."9"}
86,371, // "0"
87,604, // digit128
88,836, // {176..185}
91,556, // "-"
95,981, // "#"
106,436, // "+"
110,1227, // "@"
114,1127, // "'"
115,879, // '"'
  }
,
{ // state 1290
0x80000000|1, // match move
0x80000000|1047, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1291
0x80000000|445, // match move
0x80000000|26, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1292
2,1148, // ws*
94,314, // " "
111,720, // {10}
120,1278, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1293
0x80000000|699, // match move
0x80000000|1023, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1294
0x80000000|445, // match move
0x80000000|27, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1295
0x80000000|1, // match move
0x80000000|1050, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1296
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1297
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1298
73,130, // "r"
78,1076, // "h"
  }
,
{ // state 1299
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 1300
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1301
94,835, // " "
111,172, // {10}
120,508, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1302
64,688, // letter
65,53, // "a"
66,53, // "p"
67,53, // "v"
68,53, // "c"
69,53, // "f"
70,53, // "i"
71,53, // "l"
72,53, // "o"
73,53, // "r"
74,53, // "u"
75,53, // "b"
76,53, // "e"
77,53, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "w".."z"}
78,53, // "h"
79,53, // "n"
80,53, // "t"
81,46, // letter128
82,1103, // {199..218 231..250}
83,1103, // {193..198 225..230}
84,256, // digit
85,224, // {"1".."9"}
86,224, // "0"
87,1320, // digit128
88,253, // {176..185}
108,1205, // "_"
118,315, // {223}
121,327, // idChar*
122,697, // $$0
129,240, // idChar
130,1188, // idChar128
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
{ // state 1303
2,638, // ws*
94,148, // " "
111,1233, // {10}
120,622, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1304
10,70, // `}
112,1254, // "}"
  }
,
{ // state 1305
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 1306
2,603, // ws*
94,168, // " "
111,1180, // {10}
120,595, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1307
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 1308
0x80000000|1066, // match move
0x80000000|577, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1309
46,747, // `*
48,805, // `/
49,590, // `%
99,1128, // "/"
104,840, // "%"
116,647, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1310
0x80000000|445, // match move
0x80000000|15, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1311
46,754, // `*
48,811, // `/
49,592, // `%
99,1128, // "/"
104,840, // "%"
116,647, // "*"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1312
134,MIN_REDUCTION+177, // $NT
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1313
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1314
25,MIN_REDUCTION+150, // `[
90,MIN_REDUCTION+150, // "["
94,753, // " "
111,365, // {10}
120,700, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1315
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1316
0x80000000|1111, // match move
0x80000000|123, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1317
0x80000000|1, // match move
0x80000000|661, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1318
0x80000000|1193, // match move
0x80000000|591, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1319
0x80000000|1111, // match move
0x80000000|126, // no-match move
0x80000000|35, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1320
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 1321
26,487, // `]
98,343, // "]"
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1322][];
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
// <method decl> ::= `public <type> ID `( `) `{ <stmt>* `return <exp> `; `}
(12<<16)+11,
// <method decl> ::= `public <type> ID `( `) `{ `return <exp> `; `}
(12<<16)+10,
// <type> ::= `int
(18<<16)+1,
// <type> ::= `boolean
(18<<16)+1,
// <type> ::= ID
(18<<16)+1,
// <type> ::= <type> <empty bracket pair>
(18<<16)+2,
// <empty bracket pair> ::= `[ `]
(24<<16)+2,
// <stmt> ::= <assign> `;
(27<<16)+2,
// <stmt> ::= `break `;
(27<<16)+2,
// <stmt> ::= `;
(27<<16)+1,
// <stmt> ::= `{ <stmt>* `}
(27<<16)+3,
// <stmt> ::= `{ `}
(27<<16)+2,
// <stmt> ::= <local var decl> `;
(27<<16)+2,
// <assign> ::= <exp> `= <exp>
(28<<16)+3,
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
(23<<16)+4,
// `boolean ::= "#" "b" "o"
(23<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(22<<16)+4,
// `int ::= "#" "i" "t"
(22<<16)+3,
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
(25<<16)+2,
// `[ ::= "["
(25<<16)+1,
// `] ::= "]" ws*
(26<<16)+2,
// `] ::= "]"
(26<<16)+1,
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
(21<<16)+2,
// `; ::= ";"
(21<<16)+1,
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
"digit* ::= digit* digit", // 160
"digit* ::= digit* digit", // 161
"any* ::= any* any", // 162
"any* ::= any* any", // 163
"<decl in class>* ::= <decl in class>* <decl in class>", // 164
"<decl in class>* ::= <decl in class>* <decl in class>", // 165
"hexDigit* ::= hexDigit* hexDigit", // 166
"hexDigit* ::= hexDigit* hexDigit", // 167
"<stmt>* ::= <stmt>* <stmt>", // 168
"<stmt>* ::= <stmt>* <stmt>", // 169
"idChar* ::= idChar* idChar", // 170
"idChar* ::= idChar* idChar", // 171
"<class decl>+ ::= <class decl>", // 172
"<class decl>+ ::= <class decl>+ <class decl>", // 173
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 174
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 175
"ws* ::= ws* ws", // 176
"ws* ::= ws* ws", // 177
"", // 178
"", // 179
"", // 180
"", // 181
"", // 182
"", // 183
"", // 184
"", // 185
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
    { // 9: <method decl> ::= `public <type> [#] ID `( `) `{ <stmt>* `return <exp> `; `} @createMethodDeclVoid(Type,int,String,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <method decl> ::= `public <type> [#] ID `( `) `{ [<stmt>*] `return <exp> `; `} @createMethodDeclVoid(Type,int,String,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
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
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
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
    { // 62: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 63: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 64: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 65: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 66: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 67: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 68: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: ws ::= {10} [registerNewline] @void
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `boolean ::= "#" "b" "o" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 72: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 73: `class ::= "#" "c" "l" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 74: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 75: `void ::= "#" "v" "o" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 76: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 77: `int ::= "#" "i" "t" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 78: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 79: `break ::= "#" "b" "r" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 80: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 81: `this ::= "#" "t" "h" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 82: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 83: `false ::= "#" "f" "a" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 84: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 85: `true ::= "#" "t" "r" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `null ::= "#" "n" "u" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `return ::= "#" "r" "e" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 91: `instanceof ::= "#" "i" "n" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 92: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 93: `new ::= "#" "n" "e" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 95: `public ::= "#" "p" "u" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 96: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 97: `! ::= "!" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: `% ::= "%" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 100: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 101: `&& ::= "@" "&" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 102: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 103: `* ::= "*" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 104: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 105: `( ::= "(" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 106: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 107: `) ::= ")" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 108: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: `{ ::= "{" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: `} ::= "}" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: `- ::= "-" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `+ ::= "+" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `= ::= "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 119: `== ::= "@" "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 120: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `[ ::= "[" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `] ::= "]" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 125: `|| ::= "@" "|" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 126: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `< ::= "<" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `> ::= ">" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `. ::= "." [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `; ::= ";" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `/ ::= "/" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 137: ID ::= letter128 [ws*] @text
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 138: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 139: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 140: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 141: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 142: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 143: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 144: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 145: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 146: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 147: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 148: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 149: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 150: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 151: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 152: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 153: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 154: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 155: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 156: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 157: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 158: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 159: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 160: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 161: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 162: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 163: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 164: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 165: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 166: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 167: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 168: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 169: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 170: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 171: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 172: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 173: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 174: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 175: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 176: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 177: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 178: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 179: $$0 ::= idChar128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 180: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 181: $$1 ::= digit128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 182: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 183: $$2 ::= hexDigit128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 184: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 185: $$3 ::= any128 [ws*] @pass
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
      ((47<<5)|0x5)/*methodCall:47*/,
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
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
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
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 40: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 41: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 42: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 43: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 44: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 45: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 46: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 47: {
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
"Decl createMethodDeclVoid(Type,int,String,List<Statement>,Exp)",
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
    0,
    1,
    0,
    0,
    1,
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
