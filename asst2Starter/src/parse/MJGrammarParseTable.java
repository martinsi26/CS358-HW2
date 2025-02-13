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
public int getEofSym() { return 145; }
public int getNttSym() { return 146; }
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
"<inst var decl>",
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
"<exp1>",
"`=",
"`++",
"`--",
"`while",
"<else stmt>",
"`else",
"`if",
"<else stmt>?",
"<exp8>",
"`||",
"<exp7>",
"`&&",
"<exp6>",
"`==",
"<exp5>",
"`!=",
"`<",
"<exp4>",
"`>",
"`instanceof",
"`<=",
"`>=",
"`+",
"<exp3>",
"`-",
"`*",
"<exp2>",
"`/",
"`%",
"`!",
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
"\"h\"",
"\"n\"",
"{\"A\"..\"Z\" \"d\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"s\" \"x\"..\"z\"}",
"\"t\"",
"\"w\"",
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
public int numSymbols() { return 147;}
private static final int MIN_REDUCTION = 1758;
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
1,369, // <start>
2,544, // ws*
3,360, // <program>
4,387, // <class decl>+
5,1596, // <class decl>
6,1176, // `class
106,504, // " "
107,1019, // "#"
123,382, // {10}
132,1047, // ws
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|1544, // match move
0x80000000|244, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 3
7,1000, // ID
16,367, // `(
32,446, // <exp1>
55,1439, // `+
57,896, // `-
59,1455, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 4
106,1063, // " "
123,601, // {10}
132,366, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 5
26,MIN_REDUCTION+100, // `[
102,MIN_REDUCTION+100, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 6
2,1137, // ws*
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 7
26,MIN_REDUCTION+186, // `[
102,MIN_REDUCTION+186, // "["
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 9
0x80000000|1, // match move
0x80000000|1393, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 10
0x80000000|1424, // match move
0x80000000|1144, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 12
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 13
10,1386, // `}
124,1552, // "}"
  }
,
{ // state 14
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 16
0x80000000|1424, // match move
0x80000000|1502, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 17
2,985, // ws*
26,MIN_REDUCTION+105, // `[
102,MIN_REDUCTION+105, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 18
26,MIN_REDUCTION+186, // `[
102,MIN_REDUCTION+186, // "["
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 19
0x80000000|1623, // match move
0x80000000|372, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 20
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
55,1465, // `+
57,879, // `-
59,1442, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 21
26,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 22
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 23
26,MIN_REDUCTION+186, // `[
102,MIN_REDUCTION+186, // "["
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 25
26,MIN_REDUCTION+100, // `[
102,MIN_REDUCTION+100, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 26
26,MIN_REDUCTION+187, // `[
102,MIN_REDUCTION+187, // "["
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 27
106,144, // " "
123,763, // {10}
132,1593, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 28
7,990, // ID
16,361, // `(
21,1231, // <exp>
32,468, // <exp1>
41,1521, // <exp8>
43,1701, // <exp7>
45,740, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 29
16,1486, // `(
117,1467, // "("
  }
,
{ // state 30
7,990, // ID
16,361, // `(
32,468, // <exp1>
47,1375, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 31
0x80000000|1, // match move
0x80000000|351, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 32
106,594, // " "
123,1027, // {10}
132,1235, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 33
25,1237, // <empty bracket pair>
26,806, // `[
66,170, // <empty bracket pair>*
102,685, // "["
  }
,
{ // state 34
2,1052, // ws*
106,119, // " "
123,859, // {10}
132,598, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 35
2,27, // ws*
106,144, // " "
123,763, // {10}
132,527, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 37
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 38
2,730, // ws*
106,506, // " "
123,1004, // {10}
132,1432, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 39
7,990, // ID
16,361, // `(
21,1012, // <exp>
32,468, // <exp1>
41,1521, // <exp8>
43,1701, // <exp7>
45,740, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 40
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 42
76,657, // "a"
77,657, // "p"
78,657, // "v"
79,657, // "c"
80,657, // "f"
81,657, // "i"
82,657, // "l"
83,657, // "o"
84,657, // "r"
85,657, // "u"
86,657, // "b"
87,657, // "e"
88,657, // "h"
89,657, // "n"
90,657, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,657, // "t"
92,657, // "w"
95,460, // {193..198 225..230}
97,657, // {"1".."9"}
98,657, // "0"
100,460, // {176..185}
138,490, // $$2
143,469, // hexDigit
144,629, // hexDigit128
  }
,
{ // state 43
2,1321, // ws*
106,816, // " "
123,1040, // {10}
132,1707, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 44
26,696, // `[
102,685, // "["
  }
,
{ // state 45
7,990, // ID
16,361, // `(
21,1406, // <exp>
32,468, // <exp1>
41,1521, // <exp8>
43,1701, // <exp7>
45,740, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 46
0x80000000|1, // match move
0x80000000|1372, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 47
27,457, // `]
110,358, // "]"
  }
,
{ // state 48
25,1310, // <empty bracket pair>
26,766, // `[
66,159, // <empty bracket pair>*
102,685, // "["
  }
,
{ // state 49
0x80000000|1, // match move
0x80000000|497, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 50
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 51
55,111, // `+
57,876, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 52
25,1224, // <empty bracket pair>
26,788, // `[
66,85, // <empty bracket pair>*
102,685, // "["
  }
,
{ // state 53
0x80000000|1424, // match move
0x80000000|1162, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 54
2,1457, // ws*
106,761, // " "
123,644, // {10}
132,442, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 56
7,1076, // ID
8,660, // `{
18,768, // <stmt>*
19,1301, // <type>
20,1345, // `return
22,282, // `;
23,841, // `int
24,1611, // `boolean
28,271, // <stmt>
29,1460, // <assign>
30,1468, // `break
31,536, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,765, // `while
39,61, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,994, // "#"
112,679, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 57
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 58
26,MIN_REDUCTION+100, // `[
102,MIN_REDUCTION+100, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 59
96,945, // digit
97,681, // {"1".."9"}
98,681, // "0"
99,1349, // digit128
100,1327, // {176..185}
135,1440, // digit*
136,451, // $$1
  }
,
{ // state 60
26,MIN_REDUCTION+128, // `[
102,MIN_REDUCTION+128, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 61
16,755, // `(
117,1467, // "("
  }
,
{ // state 62
81,314, // "i"
  }
,
{ // state 63
7,1000, // ID
16,367, // `(
32,446, // <exp1>
55,1439, // `+
56,531, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 64
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 65
91,489, // "t"
  }
,
{ // state 66
7,1000, // ID
16,367, // `(
21,791, // <exp>
32,446, // <exp1>
41,1362, // <exp8>
43,1697, // <exp7>
45,767, // <exp6>
47,1302, // <exp5>
50,870, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 67
26,MIN_REDUCTION+179, // `[
102,MIN_REDUCTION+179, // "["
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 68
2,746, // ws*
106,1160, // " "
123,474, // {10}
132,76, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 69
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 70
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,713, // letter128
94,1476, // {199..218 231..250}
95,1476, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,712, // digit128
100,1289, // {176..185}
120,787, // "_"
130,155, // {223}
134,246, // $$0
141,820, // idChar
142,1687, // idChar128
  }
,
{ // state 71
26,MIN_REDUCTION+166, // `[
102,MIN_REDUCTION+166, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 72
2,512, // ws*
106,1131, // " "
123,447, // {10}
132,102, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 73
2,836, // ws*
  }
,
{ // state 74
106,747, // " "
123,69, // {10}
132,1551, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 75
0x80000000|1, // match move
0x80000000|58, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 76
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 78
26,MIN_REDUCTION+187, // `[
102,MIN_REDUCTION+187, // "["
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 79
78,947, // "v"
81,1163, // "i"
86,1151, // "b"
  }
,
{ // state 80
22,1601, // `;
112,335, // ";"
  }
,
{ // state 81
26,MIN_REDUCTION+75, // `[
102,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 83
106,455, // " "
123,352, // {10}
132,1537, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 84
76,1050, // "a"
77,1050, // "p"
78,1050, // "v"
79,1050, // "c"
80,1050, // "f"
81,1050, // "i"
82,1050, // "l"
83,1050, // "o"
84,1050, // "r"
85,1050, // "u"
86,1050, // "b"
87,1050, // "e"
88,1050, // "h"
89,1050, // "n"
90,1050, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1050, // "t"
92,1050, // "w"
97,1050, // {"1".."9"}
98,1050, // "0"
101,580, // any
102,1050, // "["
103,1050, // "-"
104,1050, // "<"
105,1050, // "|"
106,1050, // " "
107,1050, // "#"
108,1050, // "&"
109,1050, // ")"
110,1050, // "]"
111,1050, // "/"
112,1050, // ";"
113,1050, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1050, // ">"
115,1050, // "{"
116,1050, // "%"
117,1050, // "("
118,1050, // "+"
119,1050, // "."
120,1050, // "_"
121,1050, // "="
122,1050, // "@"
123,1050, // {10}
124,1050, // "}"
125,1050, // "!"
126,1050, // "'"
127,1050, // '"'
128,1050, // "*"
  }
,
{ // state 85
0x80000000|699, // match move
0x80000000|995, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 86
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 87
26,MIN_REDUCTION+179, // `[
102,MIN_REDUCTION+179, // "["
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 88
26,MIN_REDUCTION+71, // `[
102,MIN_REDUCTION+71, // "["
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 89
7,990, // ID
16,361, // `(
32,468, // <exp1>
55,1443, // `+
56,306, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 90
26,MIN_REDUCTION+179, // `[
102,MIN_REDUCTION+179, // "["
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 91
22,1732, // `;
112,1680, // ";"
  }
,
{ // state 92
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 93
2,869, // ws*
106,108, // " "
123,850, // {10}
132,609, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 95
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 96
26,MIN_REDUCTION+79, // `[
102,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 97
27,968, // `]
110,1576, // "]"
  }
,
{ // state 98
26,MIN_REDUCTION+71, // `[
102,MIN_REDUCTION+71, // "["
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 99
55,89, // `+
57,974, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 100
7,1000, // ID
16,367, // `(
32,446, // <exp1>
47,1429, // <exp5>
50,870, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 101
0x80000000|1, // match move
0x80000000|25, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 103
26,MIN_REDUCTION+71, // `[
102,MIN_REDUCTION+71, // "["
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 104
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,750, // letter128
94,1459, // {199..218 231..250}
95,1459, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1029, // digit128
100,1330, // {176..185}
120,787, // "_"
130,125, // {223}
134,250, // $$0
141,820, // idChar
142,1734, // idChar128
  }
,
{ // state 105
106,908, // " "
123,1014, // {10}
132,608, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 107
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 111
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
55,1465, // `+
56,600, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 112
0x80000000|1, // match move
0x80000000|5, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 113
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 114
91,516, // "t"
  }
,
{ // state 115
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,694, // letter128
94,1491, // {199..218 231..250}
95,1491, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1021, // digit128
100,1341, // {176..185}
120,787, // "_"
130,142, // {223}
134,258, // $$0
141,820, // idChar
142,1749, // idChar128
  }
,
{ // state 116
27,982, // `]
110,1614, // "]"
  }
,
{ // state 117
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
47,1232, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 118
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 119
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 120
55,63, // `+
57,893, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 121
106,816, // " "
123,1040, // {10}
132,919, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 123
0x80000000|1544, // match move
0x80000000|354, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 124
2,1297, // ws*
26,MIN_REDUCTION+107, // `[
102,MIN_REDUCTION+107, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 126
2,575, // ws*
106,1131, // " "
123,447, // {10}
132,102, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 127
2,577, // ws*
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 128
0x80000000|1371, // match move
0x80000000|96, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
87,809, // "e"
  }
,
{ // state 130
106,364, // " "
123,1154, // {10}
132,203, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 131
84,783, // "r"
88,690, // "h"
  }
,
{ // state 132
7,1076, // ID
8,1200, // `{
19,1301, // <type>
22,1069, // `;
23,841, // `int
24,1611, // `boolean
28,887, // <stmt>
29,91, // <assign>
30,829, // `break
31,437, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,617, // `while
39,1249, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,1680, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 133
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 134
2,312, // ws*
  }
,
{ // state 135
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 136
7,1008, // ID
16,304, // `(
21,866, // <exp>
32,1306, // <exp1>
41,1379, // <exp8>
43,1620, // <exp7>
45,784, // <exp6>
47,1267, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 137
0x80000000|1634, // match move
0x80000000|1181, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 138
2,637, // ws*
  }
,
{ // state 139
26,MIN_REDUCTION+211, // `[
102,MIN_REDUCTION+211, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 140
0x80000000|1522, // match move
0x80000000|1025, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 141
27,933, // `]
110,1647, // "]"
  }
,
{ // state 142
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 143
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 144
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 145
26,MIN_REDUCTION+73, // `[
102,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 146
2,283, // ws*
106,1105, // " "
123,441, // {10}
132,106, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 147
91,440, // "t"
  }
,
{ // state 148
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 149
2,279, // ws*
  }
,
{ // state 150
26,MIN_REDUCTION+211, // `[
102,MIN_REDUCTION+211, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 151
2,285, // ws*
  }
,
{ // state 152
2,582, // ws*
106,1124, // " "
123,448, // {10}
132,95, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 153
0x80000000|1628, // match move
0x80000000|1248, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 154
26,MIN_REDUCTION+176, // `[
102,MIN_REDUCTION+176, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 157
105,1171, // "|"
108,502, // "&"
  }
,
{ // state 158
2,295, // ws*
106,506, // " "
123,1004, // {10}
132,1432, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 159
0x80000000|726, // match move
0x80000000|1081, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 160
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 161
2,470, // ws*
26,MIN_REDUCTION+103, // `[
102,MIN_REDUCTION+103, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 162
0x80000000|1, // match move
0x80000000|1314, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 163
105,1171, // "|"
  }
,
{ // state 164
106,899, // " "
123,143, // {10}
132,77, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 166
0x80000000|1644, // match move
0x80000000|1204, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 167
26,MIN_REDUCTION+77, // `[
102,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 168
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 169
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 170
0x80000000|748, // match move
0x80000000|1084, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 171
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,1754, // letter128
94,1558, // {199..218 231..250}
95,1558, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,308, // digit128
100,19, // {176..185}
120,787, // "_"
130,772, // {223}
134,1159, // $$0
141,820, // idChar
142,844, // idChar128
  }
,
{ // state 172
26,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 173
83,1036, // "o"
  }
,
{ // state 174
16,586, // `(
117,1467, // "("
  }
,
{ // state 175
7,1452, // ID
10,1470, // `}
11,1115, // <decl in class>
12,156, // <method decl>
13,1650, // <inst var decl>
14,1095, // `public
19,1464, // <type>
23,841, // `int
24,1611, // `boolean
75,518, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1633, // letter128
94,789, // {199..218 231..250}
95,789, // {193..198 225..230}
107,515, // "#"
124,1700, // "}"
  }
,
{ // state 176
26,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 180
7,1452, // ID
9,175, // <decl in class>*
10,894, // `}
11,1169, // <decl in class>
12,156, // <method decl>
13,1650, // <inst var decl>
14,1095, // `public
19,1464, // <type>
23,841, // `int
24,1611, // `boolean
75,518, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1633, // letter128
94,789, // {199..218 231..250}
95,789, // {193..198 225..230}
107,515, // "#"
124,1700, // "}"
  }
,
{ // state 181
2,1283, // ws*
  }
,
{ // state 182
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 183
84,817, // "r"
88,724, // "h"
  }
,
{ // state 184
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 185
96,945, // digit
97,681, // {"1".."9"}
98,681, // "0"
99,391, // digit128
100,1298, // {176..185}
135,1414, // digit*
136,486, // $$1
  }
,
{ // state 186
26,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 188
26,MIN_REDUCTION+72, // `[
102,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 189
2,1028, // ws*
26,MIN_REDUCTION+145, // `[
102,MIN_REDUCTION+145, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 190
0x80000000|1, // match move
0x80000000|1103, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 191
7,1000, // ID
16,367, // `(
32,446, // <exp1>
55,1439, // `+
57,896, // `-
59,178, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 192
7,1076, // ID
8,920, // `{
10,1100, // `}
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1403, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,1552, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 193
26,MIN_REDUCTION+171, // `[
102,MIN_REDUCTION+171, // "["
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 194
16,1233, // `(
117,1467, // "("
  }
,
{ // state 195
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 198
7,990, // ID
16,361, // `(
32,468, // <exp1>
55,1443, // `+
57,905, // `-
59,135, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 199
2,1026, // ws*
26,MIN_REDUCTION+145, // `[
102,MIN_REDUCTION+145, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 200
0x80000000|395, // match move
0x80000000|927, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 201
96,945, // digit
97,681, // {"1".."9"}
98,681, // "0"
99,399, // digit128
100,1278, // {176..185}
135,1449, // digit*
136,463, // $$1
  }
,
{ // state 202
0x80000000|1651, // match move
0x80000000|1417, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 203
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 204
106,816, // " "
123,1040, // {10}
132,919, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 205
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,1754, // letter128
94,1558, // {199..218 231..250}
95,1558, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,308, // digit128
100,19, // {176..185}
120,787, // "_"
130,772, // {223}
133,171, // idChar*
134,1214, // $$0
141,24, // idChar
142,844, // idChar128
  }
,
{ // state 206
2,1474, // ws*
106,1131, // " "
123,447, // {10}
132,102, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 207
0x80000000|1, // match move
0x80000000|878, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 208
26,MIN_REDUCTION+81, // `[
102,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 209
26,MIN_REDUCTION+211, // `[
102,MIN_REDUCTION+211, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 210
2,716, // ws*
  }
,
{ // state 211
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 212
2,238, // ws*
106,1514, // " "
123,967, // {10}
132,570, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 214
0x80000000|1182, // match move
0x80000000|830, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 215
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 216
2,1450, // ws*
  }
,
{ // state 217
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 218
16,562, // `(
117,686, // "("
  }
,
{ // state 219
26,MIN_REDUCTION+77, // `[
102,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 220
2,1543, // ws*
  }
,
{ // state 221
2,682, // ws*
  }
,
{ // state 222
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 223
2,1053, // ws*
26,MIN_REDUCTION+145, // `[
102,MIN_REDUCTION+145, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 224
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 225
2,588, // ws*
106,1105, // " "
123,441, // {10}
132,106, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 226
2,956, // ws*
106,108, // " "
123,850, // {10}
132,609, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 227
7,990, // ID
16,361, // `(
32,468, // <exp1>
55,1443, // `+
57,905, // `-
59,1461, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 228
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 229
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
55,1465, // `+
57,879, // `-
59,165, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 230
22,1699, // `;
112,1142, // ";"
  }
,
{ // state 231
0x80000000|1, // match move
0x80000000|1123, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 232
0x80000000|625, // match move
0x80000000|566, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 233
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 234
106,622, // " "
123,133, // {10}
132,1698, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 235
0x80000000|1153, // match move
0x80000000|978, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 236
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 237
0x80000000|491, // match move
0x80000000|1507, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 238
106,1514, // " "
123,967, // {10}
132,988, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 239
17,377, // `)
109,1496, // ")"
  }
,
{ // state 240
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 242
26,MIN_REDUCTION+102, // `[
102,MIN_REDUCTION+102, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 243
22,597, // `;
112,1173, // ";"
  }
,
{ // state 244
26,MIN_REDUCTION+83, // `[
102,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 245
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 247
26,MIN_REDUCTION+168, // `[
102,MIN_REDUCTION+168, // "["
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 248
7,1076, // ID
8,734, // `{
19,1301, // <type>
22,269, // `;
23,841, // `int
24,1611, // `boolean
29,1167, // <assign>
30,80, // `break
31,535, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,174, // `while
37,847, // <else stmt>
38,273, // `else
39,718, // `if
40,1287, // <else stmt>?
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,1563, // "#"
112,335, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 249
7,1076, // ID
8,1200, // `{
19,1301, // <type>
22,1069, // `;
23,841, // `int
24,1611, // `boolean
28,424, // <stmt>
29,91, // <assign>
30,829, // `break
31,437, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,617, // `while
39,1249, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,1680, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 250
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 251
0x80000000|1, // match move
0x80000000|1183, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 252
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 253
16,603, // `(
117,686, // "("
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 254
2,928, // ws*
106,222, // " "
123,1567, // {10}
132,109, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 255
7,1076, // ID
8,660, // `{
19,1301, // <type>
22,282, // `;
23,841, // `int
24,1611, // `boolean
28,1615, // <stmt>
29,1460, // <assign>
30,1468, // `break
31,536, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,765, // `while
39,61, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,679, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 256
0x80000000|1, // match move
0x80000000|732, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 257
0x80000000|520, // match move
0x80000000|614, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 258
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 259
26,MIN_REDUCTION+83, // `[
102,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 260
0x80000000|1277, // match move
0x80000000|1747, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 261
0x80000000|1, // match move
0x80000000|707, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
26,MIN_REDUCTION+17, // `[
102,MIN_REDUCTION+17, // "["
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 263
0x80000000|513, // match move
0x80000000|429, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 264
0x80000000|934, // match move
0x80000000|1087, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 265
0x80000000|491, // match move
0x80000000|1453, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 266
7,1076, // ID
8,734, // `{
19,1301, // <type>
22,269, // `;
23,841, // `int
24,1611, // `boolean
28,797, // <stmt>
29,1167, // <assign>
30,80, // `break
31,535, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,174, // `while
39,718, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,335, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 267
0x80000000|1, // match move
0x80000000|721, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 268
17,402, // `)
109,235, // ")"
  }
,
{ // state 269
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 270
26,MIN_REDUCTION+83, // `[
102,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 271
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 272
17,383, // `)
109,1527, // ")"
  }
,
{ // state 273
7,1076, // ID
8,920, // `{
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1564, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 274
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 276
0x80000000|491, // match move
0x80000000|1499, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 277
26,MIN_REDUCTION+83, // `[
102,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 278
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 279
0x80000000|1, // match move
0x80000000|375, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 280
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,697, // letter128
94,963, // {199..218 231..250}
95,963, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,416, // digit128
100,128, // {176..185}
120,787, // "_"
130,880, // {223}
134,1259, // $$0
141,820, // idChar
142,476, // idChar128
  }
,
{ // state 281
26,MIN_REDUCTION+17, // `[
102,MIN_REDUCTION+17, // "["
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 283
106,1105, // " "
123,441, // {10}
132,1220, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 284
0x80000000|1, // match move
0x80000000|1113, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 285
0x80000000|1, // match move
0x80000000|421, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 286
2,752, // ws*
26,MIN_REDUCTION+181, // `[
102,MIN_REDUCTION+181, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 287
0x80000000|1, // match move
0x80000000|911, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 288
0x80000000|118, // match move
0x80000000|741, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 289
0x80000000|484, // match move
0x80000000|453, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 290
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 291
106,327, // " "
123,1186, // {10}
132,224, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 292
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 294
26,MIN_REDUCTION+17, // `[
102,MIN_REDUCTION+17, // "["
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 295
0x80000000|1108, // match move
0x80000000|889, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 296
26,MIN_REDUCTION+72, // `[
102,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 297
106,729, // " "
123,410, // {10}
132,228, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 298
2,735, // ws*
26,MIN_REDUCTION+181, // `[
102,MIN_REDUCTION+181, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 299
2,1114, // ws*
26,MIN_REDUCTION+145, // `[
102,MIN_REDUCTION+145, // "["
106,1745, // " "
123,2, // {10}
132,914, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 300
26,MIN_REDUCTION+64, // `[
102,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 301
0x80000000|1, // match move
0x80000000|1637, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 302
106,1671, // " "
123,1009, // {10}
132,1463, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 303
2,430, // ws*
26,MIN_REDUCTION+103, // `[
102,MIN_REDUCTION+103, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 304
7,951, // ID
19,493, // <type>
23,427, // `int
24,1238, // `boolean
75,1577, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,466, // letter128
94,626, // {199..218 231..250}
95,626, // {193..198 225..230}
107,742, // "#"
  }
,
{ // state 305
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 306
58,1269, // `*
60,198, // `/
61,227, // `%
111,760, // "/"
116,1387, // "%"
128,34, // "*"
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 307
146,MIN_REDUCTION+207, // $NT
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 308
0x80000000|184, // match move
0x80000000|885, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 309
106,368, // " "
123,1180, // {10}
132,213, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 310
26,MIN_REDUCTION+72, // `[
102,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 311
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 312
0x80000000|1, // match move
0x80000000|353, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 313
96,1556, // digit
97,681, // {"1".."9"}
98,681, // "0"
99,1376, // digit128
100,128, // {176..185}
136,1210, // $$1
  }
,
{ // state 314
89,1056, // "n"
  }
,
{ // state 315
0x80000000|1, // match move
0x80000000|881, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 316
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 317
26,MIN_REDUCTION+72, // `[
102,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 318
0x80000000|625, // match move
0x80000000|546, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 319
26,MIN_REDUCTION+189, // `[
102,MIN_REDUCTION+189, // "["
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 320
0x80000000|625, // match move
0x80000000|528, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 321
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 322
2,522, // ws*
26,MIN_REDUCTION+103, // `[
102,MIN_REDUCTION+103, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 323
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 324
0x80000000|1344, // match move
0x80000000|253, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 325
0x80000000|1, // match move
0x80000000|897, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 326
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 327
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 328
26,MIN_REDUCTION+82, // `[
102,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 329
0x80000000|184, // match move
0x80000000|877, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 330
26,MIN_REDUCTION+74, // `[
102,MIN_REDUCTION+74, // "["
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 331
2,1462, // ws*
106,729, // " "
123,410, // {10}
132,1438, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 332
76,1093, // "a"
77,1093, // "p"
78,1093, // "v"
79,1093, // "c"
80,1093, // "f"
81,1093, // "i"
82,1093, // "l"
83,1093, // "o"
84,1093, // "r"
85,1093, // "u"
86,1093, // "b"
87,1093, // "e"
88,1093, // "h"
89,1093, // "n"
90,1093, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1093, // "t"
92,1093, // "w"
94,1077, // {199..218 231..250}
95,1077, // {193..198 225..230}
97,1093, // {"1".."9"}
98,1093, // "0"
100,1077, // {176..185}
101,1549, // any
102,1093, // "["
103,1093, // "-"
104,1093, // "<"
105,1093, // "|"
106,1093, // " "
107,1093, // "#"
108,1093, // "&"
109,1093, // ")"
110,1093, // "]"
111,1093, // "/"
112,1093, // ";"
113,1093, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1093, // ">"
115,1093, // "{"
116,1093, // "%"
117,1093, // "("
118,1093, // "+"
119,1093, // "."
120,1093, // "_"
121,1093, // "="
122,1093, // "@"
123,1093, // {10}
124,1093, // "}"
125,1093, // "!"
126,1093, // "'"
127,1093, // '"'
128,1093, // "*"
129,775, // any128
130,1077, // {223}
131,1077, // {128..175 186..192 219..222 224 251..255}
139,498, // any*
140,1351, // $$3
  }
,
{ // state 333
2,999, // ws*
26,MIN_REDUCTION+181, // `[
102,MIN_REDUCTION+181, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 334
0x80000000|1, // match move
0x80000000|1425, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 335
2,1359, // ws*
106,908, // " "
123,1014, // {10}
132,1656, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 336
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
50,51, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 337
26,MIN_REDUCTION+168, // `[
102,MIN_REDUCTION+168, // "["
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 338
2,4, // ws*
106,1063, // " "
123,601, // {10}
132,966, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 339
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 340
106,168, // " "
123,792, // {10}
132,1555, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 341
16,683, // `(
117,1467, // "("
  }
,
{ // state 342
0x80000000|292, // match move
0x80000000|650, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 343
26,MIN_REDUCTION+82, // `[
102,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 344
26,MIN_REDUCTION+83, // `[
102,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 345
55,63, // `+
57,893, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 346
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 347
106,455, // " "
123,352, // {10}
132,1537, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 348
2,1738, // ws*
26,MIN_REDUCTION+210, // `[
102,MIN_REDUCTION+210, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 349
0x80000000|1, // match move
0x80000000|1407, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 350
76,1444, // "a"
  }
,
{ // state 351
26,MIN_REDUCTION+178, // `[
102,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 352
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 353
26,MIN_REDUCTION+166, // `[
102,MIN_REDUCTION+166, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 354
26,MIN_REDUCTION+83, // `[
102,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 355
26,MIN_REDUCTION+82, // `[
102,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 356
16,882, // `(
117,686, // "("
  }
,
{ // state 357
26,MIN_REDUCTION+172, // `[
102,MIN_REDUCTION+172, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 358
2,1086, // ws*
106,455, // " "
123,352, // {10}
132,1436, // ws
MIN_REDUCTION+145, // (default reduction)
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
{ // state 359
26,MIN_REDUCTION+187, // `[
102,MIN_REDUCTION+187, // "["
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 360
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 361
7,951, // ID
19,509, // <type>
23,427, // `int
24,1238, // `boolean
75,1577, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,466, // letter128
94,626, // {199..218 231..250}
95,626, // {193..198 225..230}
107,742, // "#"
  }
,
{ // state 362
2,1297, // ws*
  }
,
{ // state 363
0x80000000|526, // match move
0x80000000|547, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 364
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 365
55,89, // `+
57,974, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 366
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 367
7,951, // ID
19,511, // <type>
23,427, // `int
24,1238, // `boolean
75,1577, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,466, // letter128
94,626, // {199..218 231..250}
95,626, // {193..198 225..230}
107,742, // "#"
  }
,
{ // state 368
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 369
145,MIN_REDUCTION+0, // $
  }
,
{ // state 370
106,144, // " "
123,763, // {10}
132,1593, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 371
26,MIN_REDUCTION+172, // `[
102,MIN_REDUCTION+172, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 372
26,MIN_REDUCTION+79, // `[
102,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 373
26,136, // `[
102,1712, // "["
  }
,
{ // state 374
76,1621, // "a"
  }
,
{ // state 375
26,MIN_REDUCTION+166, // `[
102,MIN_REDUCTION+166, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 376
0x80000000|1112, // match move
0x80000000|811, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 377
0x80000000|1, // match move
0x80000000|1542, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 378
17,255, // `)
109,648, // ")"
  }
,
{ // state 379
0x80000000|1544, // match move
0x80000000|259, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 380
2,46, // ws*
26,MIN_REDUCTION+210, // `[
102,MIN_REDUCTION+210, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 381
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 383
0x80000000|1, // match move
0x80000000|1649, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 384
106,122, // " "
123,814, // {10}
132,1546, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 385
0x80000000|1277, // match move
0x80000000|1660, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 386
37,187, // <else stmt>
38,1513, // `else
40,1252, // <else stmt>?
107,129, // "#"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 387
5,1020, // <class decl>
6,1176, // `class
107,1019, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 388
26,940, // `[
33,66, // `=
74,1479, // `.
102,1712, // "["
119,898, // "."
121,212, // "="
  }
,
{ // state 389
0x80000000|1130, // match move
0x80000000|759, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 390
0x80000000|1, // match move
0x80000000|1447, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 391
0x80000000|1405, // match move
0x80000000|1090, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 392
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 393
0x80000000|1, // match move
0x80000000|906, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 394
0x80000000|1018, // match move
0x80000000|1648, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 395
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 396
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 397
7,1000, // ID
16,367, // `(
32,446, // <exp1>
50,120, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 398
0x80000000|1088, // match move
0x80000000|827, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 399
0x80000000|1410, // match move
0x80000000|1079, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 400
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
50,1397, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 401
25,140, // <empty bracket pair>
26,1141, // `[
66,471, // <empty bracket pair>*
102,685, // "["
  }
,
{ // state 402
0x80000000|1, // match move
0x80000000|1657, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 403
2,652, // ws*
106,1140, // " "
123,41, // {10}
132,1363, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 404
7,990, // ID
16,361, // `(
32,468, // <exp1>
50,99, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 405
106,455, // " "
123,352, // {10}
132,1537, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 406
0x80000000|1277, // match move
0x80000000|1691, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 407
7,990, // ID
16,361, // `(
32,468, // <exp1>
50,365, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 408
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 409
0x80000000|1, // match move
0x80000000|1718, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 410
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 411
0x80000000|857, // match move
0x80000000|1632, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 412
7,218, // ID
25,1573, // <empty bracket pair>
26,47, // `[
75,727, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,225, // letter128
94,636, // {199..218 231..250}
95,636, // {193..198 225..230}
102,685, // "["
  }
,
{ // state 413
0x80000000|1041, // match move
0x80000000|1610, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 414
0x80000000|1544, // match move
0x80000000|277, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 415
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 416
0x80000000|1190, // match move
0x80000000|1060, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 417
7,1000, // ID
16,367, // `(
32,446, // <exp1>
50,345, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 418
0x80000000|1, // match move
0x80000000|1724, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 419
0x80000000|1544, // match move
0x80000000|270, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 420
76,1469, // "a"
  }
,
{ // state 421
26,MIN_REDUCTION+166, // `[
102,MIN_REDUCTION+166, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 422
2,9, // ws*
26,MIN_REDUCTION+210, // `[
102,MIN_REDUCTION+210, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 423
0x80000000|1, // match move
0x80000000|1430, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 424
37,627, // <else stmt>
38,132, // `else
40,240, // <else stmt>?
107,129, // "#"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 425
2,828, // ws*
106,816, // " "
123,1040, // {10}
132,1707, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 426
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 427
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 428
26,MIN_REDUCTION+81, // `[
102,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 429
2,190, // ws*
26,MIN_REDUCTION+107, // `[
102,MIN_REDUCTION+107, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 430
0x80000000|1, // match move
0x80000000|1519, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 431
2,612, // ws*
106,1140, // " "
123,41, // {10}
132,1363, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 432
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 433
7,700, // ID
19,406, // <type>
23,214, // `int
24,514, // `boolean
75,205, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1035, // letter128
94,1558, // {199..218 231..250}
95,1558, // {193..198 225..230}
107,1309, // "#"
  }
,
{ // state 434
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 435
0x80000000|1, // match move
0x80000000|1437, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 436
17,948, // `)
109,648, // ")"
  }
,
{ // state 437
22,624, // `;
112,1680, // ";"
  }
,
{ // state 438
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 439
2,1639, // ws*
  }
,
{ // state 440
2,130, // ws*
106,364, // " "
123,1154, // {10}
132,1554, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 441
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 442
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 443
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 444
26,MIN_REDUCTION+172, // `[
102,MIN_REDUCTION+172, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 445
7,1076, // ID
8,920, // `{
10,1377, // `}
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1403, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,1187, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 446
0x80000000|1, // match move
0x80000000|1367, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 447
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 448
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 449
146,MIN_REDUCTION+17, // $NT
  }
,
{ // state 450
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 451
0x80000000|1, // match move
0x80000000|1532, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 452
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 453
2,162, // ws*
26,MIN_REDUCTION+107, // `[
102,MIN_REDUCTION+107, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 454
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 455
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 456
0x80000000|1, // match move
0x80000000|1530, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 457
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 458
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,593, // letter128
94,789, // {199..218 231..250}
95,789, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,450, // digit128
100,970, // {176..185}
120,787, // "_"
130,659, // {223}
134,579, // $$0
141,820, // idChar
142,481, // idChar128
  }
,
{ // state 459
106,82, // " "
123,826, // {10}
132,1538, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 460
0x80000000|1424, // match move
0x80000000|319, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 461
58,1269, // `*
60,198, // `/
61,227, // `%
111,760, // "/"
116,1387, // "%"
128,34, // "*"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 462
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 463
0x80000000|1, // match move
0x80000000|1482, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 464
26,MIN_REDUCTION+81, // `[
102,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 465
26,MIN_REDUCTION+172, // `[
102,MIN_REDUCTION+172, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 466
2,1574, // ws*
106,747, // " "
123,69, // {10}
132,1337, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 467
2,855, // ws*
106,1671, // " "
123,1009, // {10}
132,86, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 468
0x80000000|1, // match move
0x80000000|1357, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 469
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 470
0x80000000|1, // match move
0x80000000|1534, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 471
0x80000000|571, // match move
0x80000000|1708, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 472
26,MIN_REDUCTION+81, // `[
102,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 473
0x80000000|1277, // match move
0x80000000|373, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 474
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 475
88,146, // "h"
  }
,
{ // state 476
0x80000000|220, // match move
0x80000000|521, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 477
0x80000000|1, // match move
0x80000000|1540, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 478
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 479
58,1271, // `*
60,191, // `/
61,3, // `%
111,760, // "/"
116,1387, // "%"
128,34, // "*"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 480
26,MIN_REDUCTION+174, // `[
102,MIN_REDUCTION+174, // "["
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 481
2,83, // ws*
106,455, // " "
123,352, // {10}
132,1436, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 482
7,1008, // ID
32,251, // <exp1>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
107,991, // "#"
122,1174, // "@"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 483
0x80000000|1190, // match move
0x80000000|7, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 484
2,162, // ws*
  }
,
{ // state 485
7,722, // ID
19,385, // <type>
23,214, // `int
24,514, // `boolean
75,205, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1035, // letter128
94,1558, // {199..218 231..250}
95,1558, // {193..198 225..230}
107,1309, // "#"
  }
,
{ // state 486
0x80000000|1, // match move
0x80000000|1508, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 487
0x80000000|1, // match move
0x80000000|244, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 488
0x80000000|292, // match move
0x80000000|1561, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 489
2,291, // ws*
106,327, // " "
123,1186, // {10}
132,1592, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 490
0x80000000|1, // match move
0x80000000|1694, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 491
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 492
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 493
17,1433, // `)
25,1241, // <empty bracket pair>
26,862, // `[
102,685, // "["
109,1320, // ")"
  }
,
{ // state 494
0x80000000|1190, // match move
0x80000000|23, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 495
7,1000, // ID
32,284, // <exp1>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
107,861, // "#"
122,1203, // "@"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 496
106,1703, // " "
123,965, // {10}
132,1074, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 497
26,MIN_REDUCTION+174, // `[
102,MIN_REDUCTION+174, // "["
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 498
76,1093, // "a"
77,1093, // "p"
78,1093, // "v"
79,1093, // "c"
80,1093, // "f"
81,1093, // "i"
82,1093, // "l"
83,1093, // "o"
84,1093, // "r"
85,1093, // "u"
86,1093, // "b"
87,1093, // "e"
88,1093, // "h"
89,1093, // "n"
90,1093, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1093, // "t"
92,1093, // "w"
94,1077, // {199..218 231..250}
95,1077, // {193..198 225..230}
97,1093, // {"1".."9"}
98,1093, // "0"
100,1077, // {176..185}
101,1006, // any
102,1093, // "["
103,1093, // "-"
104,1093, // "<"
105,1093, // "|"
106,1093, // " "
107,1093, // "#"
108,1093, // "&"
109,1093, // ")"
110,1093, // "]"
111,1093, // "/"
112,1093, // ";"
113,1093, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1093, // ">"
115,1093, // "{"
116,1093, // "%"
117,1093, // "("
118,1093, // "+"
119,1093, // "."
120,1093, // "_"
121,1093, // "="
122,1093, // "@"
123,1093, // {10}
124,1093, // "}"
125,1093, // "!"
126,1093, // "'"
127,1093, // '"'
128,1093, // "*"
129,775, // any128
130,1077, // {223}
131,1077, // {128..175 186..192 219..222 224 251..255}
140,31, // $$3
  }
,
{ // state 499
106,1514, // " "
123,967, // {10}
132,988, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 500
0x80000000|1, // match move
0x80000000|444, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 501
26,MIN_REDUCTION+208, // `[
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 502
2,384, // ws*
106,122, // " "
123,814, // {10}
132,545, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 503
7,709, // ID
19,260, // <type>
23,214, // `int
24,514, // `boolean
75,205, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1035, // letter128
94,1558, // {199..218 231..250}
95,1558, // {193..198 225..230}
107,1309, // "#"
  }
,
{ // state 504
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 505
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 506
0x80000000|934, // match move
0x80000000|1045, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 507
0x80000000|1673, // match move
0x80000000|17, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 508
2,1201, // ws*
106,94, // " "
123,777, // {10}
132,621, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 509
17,1473, // `)
25,1241, // <empty bracket pair>
26,862, // `[
102,685, // "["
109,1320, // ")"
  }
,
{ // state 510
7,990, // ID
32,1454, // <exp1>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
107,801, // "#"
122,1109, // "@"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 511
17,1451, // `)
25,1241, // <empty bracket pair>
26,862, // `[
102,685, // "["
109,1320, // ")"
  }
,
{ // state 512
106,1131, // " "
123,447, // {10}
132,1227, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 513
2,190, // ws*
  }
,
{ // state 514
0x80000000|1398, // match move
0x80000000|275, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 515
77,1058, // "p"
81,1163, // "i"
86,1151, // "b"
  }
,
{ // state 516
2,309, // ws*
106,368, // " "
123,1180, // {10}
132,1602, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 517
7,1076, // ID
8,920, // `{
10,993, // `}
18,192, // <stmt>*
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1246, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,1552, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 518
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,593, // letter128
94,789, // {199..218 231..250}
95,789, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,450, // digit128
100,970, // {176..185}
120,787, // "_"
130,659, // {223}
133,458, // idChar*
134,432, // $$0
141,24, // idChar
142,481, // idChar128
  }
,
{ // state 519
26,MIN_REDUCTION+174, // `[
102,MIN_REDUCTION+174, // "["
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 520
2,231, // ws*
  }
,
{ // state 521
2,1543, // ws*
26,MIN_REDUCTION+210, // `[
102,MIN_REDUCTION+210, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 522
0x80000000|1, // match move
0x80000000|1434, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 523
0x80000000|1190, // match move
0x80000000|18, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 524
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 525
2,1175, // ws*
26,MIN_REDUCTION+101, // `[
102,MIN_REDUCTION+101, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 526
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 527
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 528
26,MIN_REDUCTION+187, // `[
102,MIN_REDUCTION+187, // "["
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 529
58,1284, // `*
60,229, // `/
61,20, // `%
111,760, // "/"
116,1387, // "%"
128,34, // "*"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 530
2,1629, // ws*
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 531
58,1271, // `*
60,191, // `/
61,3, // `%
111,760, // "/"
116,1387, // "%"
128,34, // "*"
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 532
7,1076, // ID
8,920, // `{
10,1285, // `}
18,445, // <stmt>*
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1246, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,1187, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 533
106,327, // " "
123,1186, // {10}
132,224, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 534
2,279, // ws*
26,MIN_REDUCTION+167, // `[
102,MIN_REDUCTION+167, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 535
22,1642, // `;
112,335, // ";"
  }
,
{ // state 536
22,1145, // `;
112,679, // ";"
  }
,
{ // state 537
0x80000000|177, // match move
0x80000000|1582, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 538
26,MIN_REDUCTION+74, // `[
102,MIN_REDUCTION+74, // "["
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 539
0x80000000|1, // match move
0x80000000|388, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 540
80,572, // "f"
81,1163, // "i"
86,1382, // "b"
89,986, // "n"
91,1655, // "t"
92,475, // "w"
118,1497, // "+"
  }
,
{ // state 541
2,943, // ws*
  }
,
{ // state 542
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 543
91,1365, // "t"
  }
,
{ // state 544
3,1741, // <program>
4,387, // <class decl>+
5,1596, // <class decl>
6,1176, // `class
106,504, // " "
107,1019, // "#"
123,382, // {10}
132,197, // ws
  }
,
{ // state 545
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 546
26,MIN_REDUCTION+187, // `[
102,MIN_REDUCTION+187, // "["
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 547
26,MIN_REDUCTION+17, // `[
102,MIN_REDUCTION+17, // "["
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 548
26,MIN_REDUCTION+179, // `[
102,MIN_REDUCTION+179, // "["
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 549
2,1325, // ws*
106,1514, // " "
123,967, // {10}
132,570, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 550
96,945, // digit
97,681, // {"1".."9"}
98,681, // "0"
99,1376, // digit128
100,128, // {176..185}
135,313, // digit*
136,1711, // $$1
  }
,
{ // state 551
0x80000000|177, // match move
0x80000000|1566, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 552
2,1132, // ws*
  }
,
{ // state 553
0x80000000|177, // match move
0x80000000|1562, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 554
49,1082, // `<
51,407, // `>
52,996, // `instanceof
53,404, // `<=
54,1212, // `>=
104,1366, // "<"
107,62, // "#"
114,1526, // ">"
122,846, // "@"
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 555
85,289, // "u"
87,338, // "e"
  }
,
{ // state 556
0x80000000|1, // match move
0x80000000|371, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 557
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 558
26,MIN_REDUCTION+208, // `[
102,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 559
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 560
16,802, // `(
117,1467, // "("
  }
,
{ // state 561
26,MIN_REDUCTION+100, // `[
102,MIN_REDUCTION+100, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 562
17,698, // `)
109,776, // ")"
  }
,
{ // state 563
0x80000000|1, // match move
0x80000000|465, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 564
2,75, // ws*
  }
,
{ // state 565
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 566
26,MIN_REDUCTION+187, // `[
102,MIN_REDUCTION+187, // "["
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 567
0x80000000|1, // match move
0x80000000|1713, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 568
26,MIN_REDUCTION+83, // `[
102,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 569
0x80000000|118, // match move
0x80000000|558, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 570
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 571
25,922, // <empty bracket pair>
26,1141, // `[
102,685, // "["
  }
,
{ // state 572
76,202, // "a"
  }
,
{ // state 573
106,222, // " "
123,1567, // {10}
132,890, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 574
7,1076, // ID
8,920, // `{
10,980, // `}
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1403, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,613, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 575
106,1131, // " "
123,447, // {10}
132,1227, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 576
106,368, // " "
123,1180, // {10}
132,213, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 577
0x80000000|1209, // match move
0x80000000|1493, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 578
2,285, // ws*
26,MIN_REDUCTION+167, // `[
102,MIN_REDUCTION+167, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 579
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 580
0x80000000|926, // match move
0x80000000|333, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 581
106,94, // " "
123,777, // {10}
132,1570, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 582
106,1124, // " "
123,448, // {10}
132,1266, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 583
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 584
26,MIN_REDUCTION+104, // `[
102,MIN_REDUCTION+104, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 585
2,676, // ws*
  }
,
{ // state 586
7,990, // ID
16,361, // `(
21,1197, // <exp>
32,468, // <exp1>
41,1521, // <exp8>
43,1701, // <exp7>
45,740, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 587
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 588
106,1105, // " "
123,441, // {10}
132,1220, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 589
22,1031, // `;
112,895, // ";"
  }
,
{ // state 590
0x80000000|127, // match move
0x80000000|837, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 591
0x80000000|910, // match move
0x80000000|286, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 592
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 593
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 594
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 595
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 596
106,364, // " "
123,1154, // {10}
132,203, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 597
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 598
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 599
0x80000000|1, // match move
0x80000000|1401, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 600
58,1284, // `*
60,229, // `/
61,20, // `%
111,760, // "/"
116,1387, // "%"
128,34, // "*"
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 601
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 602
0x80000000|1, // match move
0x80000000|1358, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 603
17,823, // `)
109,745, // ")"
  }
,
{ // state 604
0x80000000|1, // match move
0x80000000|1263, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 605
0x80000000|901, // match move
0x80000000|298, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 606
26,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 607
2,581, // ws*
106,94, // " "
123,777, // {10}
132,621, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 608
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 609
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 610
26,MIN_REDUCTION+74, // `[
102,MIN_REDUCTION+74, // "["
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 611
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 612
106,1140, // " "
123,41, // {10}
132,160, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 613
2,234, // ws*
106,622, // " "
123,133, // {10}
132,1205, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 614
2,231, // ws*
26,MIN_REDUCTION+107, // `[
102,MIN_REDUCTION+107, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 615
7,1000, // ID
16,367, // `(
21,833, // <exp>
32,446, // <exp1>
41,1362, // <exp8>
43,1697, // <exp7>
45,767, // <exp6>
47,1302, // <exp5>
50,870, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 616
49,1092, // `<
51,417, // `>
52,1001, // `instanceof
53,397, // `<=
54,1234, // `>=
104,1366, // "<"
107,62, // "#"
114,1526, // ">"
122,846, // "@"
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 617
16,45, // `(
117,1467, // "("
  }
,
{ // state 618
2,845, // ws*
  }
,
{ // state 619
25,1384, // <empty bracket pair>
26,97, // `[
102,685, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 620
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 621
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 622
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 623
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 624
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 625
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 626
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 627
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 628
7,990, // ID
16,361, // `(
21,378, // <exp>
32,468, // <exp1>
41,1521, // <exp8>
43,1701, // <exp7>
45,740, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 629
0x80000000|1172, // match move
0x80000000|1339, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 630
2,819, // ws*
  }
,
{ // state 631
27,710, // `]
110,1458, // "]"
  }
,
{ // state 632
26,MIN_REDUCTION+74, // `[
102,MIN_REDUCTION+74, // "["
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 633
8,180, // `{
115,1228, // "{"
  }
,
{ // state 634
49,1075, // `<
51,400, // `>
52,1011, // `instanceof
53,336, // `<=
54,1253, // `>=
104,1366, // "<"
107,62, // "#"
114,1526, // ">"
122,846, // "@"
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 635
25,1257, // <empty bracket pair>
26,141, // `[
102,685, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 636
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 637
0x80000000|1, // match move
0x80000000|810, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 638
0x80000000|1528, // match move
0x80000000|1661, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 639
7,1076, // ID
8,532, // `{
19,1301, // <type>
22,196, // `;
23,841, // `int
24,1611, // `boolean
28,1042, // <stmt>
29,1229, // <assign>
30,1750, // `break
31,1010, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,194, // `while
39,341, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,1733, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 640
106,364, // " "
123,1154, // {10}
132,203, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 641
2,1672, // ws*
106,1361, // " "
123,1240, // {10}
132,1683, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 642
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 643
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 644
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 645
25,1391, // <empty bracket pair>
26,116, // `[
102,685, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 646
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 647
16,268, // `(
117,686, // "("
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 648
2,1584, // ws*
106,1347, // " "
123,1199, // {10}
132,252, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 649
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 650
26,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 651
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 652
106,1140, // " "
123,41, // {10}
132,160, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 653
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 654
76,1062, // "a"
77,1062, // "p"
78,1062, // "v"
79,1062, // "c"
80,1062, // "f"
81,1062, // "i"
82,1062, // "l"
83,1062, // "o"
84,1062, // "r"
85,1062, // "u"
86,1062, // "b"
87,1062, // "e"
88,1062, // "h"
89,1062, // "n"
90,1062, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1062, // "t"
92,1062, // "w"
97,1062, // {"1".."9"}
98,1062, // "0"
101,688, // any
102,1062, // "["
103,1062, // "-"
104,1062, // "<"
105,1062, // "|"
106,1062, // " "
107,1062, // "#"
108,1062, // "&"
109,1062, // ")"
110,1062, // "]"
111,1062, // "/"
112,1062, // ";"
113,1062, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1062, // ">"
115,1062, // "{"
116,1062, // "%"
117,1062, // "("
118,1062, // "+"
119,1062, // "."
120,1062, // "_"
121,1062, // "="
122,1062, // "@"
123,1062, // {10}
124,1062, // "}"
125,1062, // "!"
126,1062, // "'"
127,1062, // '"'
128,1062, // "*"
  }
,
{ // state 655
16,272, // `(
117,686, // "("
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 656
0x80000000|934, // match move
0x80000000|343, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 657
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 658
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 659
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 660
7,1076, // ID
8,920, // `{
10,665, // `}
18,1492, // <stmt>*
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1246, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,254, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 661
0x80000000|934, // match move
0x80000000|328, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 662
0x80000000|526, // match move
0x80000000|262, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 663
0x80000000|362, // match move
0x80000000|124, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 664
26,MIN_REDUCTION+169, // `[
102,MIN_REDUCTION+169, // "["
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 665
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 666
2,1568, // ws*
106,1131, // " "
123,447, // {10}
132,102, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 667
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 668
16,239, // `(
117,686, // "("
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 669
7,1008, // ID
16,304, // `(
21,1155, // <exp>
32,1306, // <exp1>
41,1379, // <exp8>
43,1620, // <exp7>
45,784, // <exp6>
47,1267, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 670
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,200, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,329, // digit128
100,1483, // {176..185}
120,787, // "_"
130,1195, // {223}
134,1304, // $$0
141,820, // idChar
142,689, // idChar128
  }
,
{ // state 671
106,119, // " "
123,859, // {10}
132,1489, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 672
0x80000000|1478, // match move
0x80000000|961, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 673
0x80000000|526, // match move
0x80000000|294, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 674
0x80000000|934, // match move
0x80000000|355, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 675
26,MIN_REDUCTION+208, // `[
102,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 676
0x80000000|1, // match move
0x80000000|764, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 677
46,100, // `==
48,1023, // `!=
122,1684, // "@"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 678
7,1000, // ID
16,367, // `(
21,595, // <exp>
32,446, // <exp1>
41,1362, // <exp8>
43,1697, // <exp7>
45,767, // <exp6>
47,1302, // <exp5>
50,870, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 679
2,573, // ws*
106,222, // " "
123,1567, // {10}
132,109, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 680
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 681
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 682
0x80000000|1, // match move
0x80000000|790, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 683
7,990, // ID
16,361, // `(
21,1456, // <exp>
32,468, // <exp1>
41,1521, // <exp8>
43,1701, // <exp7>
45,740, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 684
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 685
2,1503, // ws*
106,1134, // " "
123,462, // {10}
132,110, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 686
2,1640, // ws*
106,1102, // " "
123,443, // {10}
132,107, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 687
2,101, // ws*
  }
,
{ // state 688
0x80000000|541, // match move
0x80000000|1355, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 689
0x80000000|1005, // match move
0x80000000|785, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 690
0x80000000|687, // match move
0x80000000|971, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 691
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 692
0x80000000|1, // match move
0x80000000|1319, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 693
2,1553, // ws*
  }
,
{ // state 694
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 695
26,MIN_REDUCTION+82, // `[
102,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 696
27,449, // `]
110,773, // "]"
  }
,
{ // state 697
0x80000000|1531, // match move
0x80000000|1225, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 698
8,56, // `{
115,840, // "{"
  }
,
{ // state 699
25,1742, // <empty bracket pair>
26,788, // `[
102,685, // "["
  }
,
{ // state 700
0x80000000|1344, // match move
0x80000000|668, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 701
2,112, // ws*
  }
,
{ // state 702
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 703
0x80000000|1268, // match move
0x80000000|992, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 704
17,639, // `)
109,648, // ")"
  }
,
{ // state 705
106,364, // " "
123,1154, // {10}
132,203, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 706
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,200, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,329, // digit128
100,1483, // {176..185}
120,787, // "_"
130,1195, // {223}
133,670, // idChar*
134,1431, // $$0
141,24, // idChar
142,689, // idChar128
  }
,
{ // state 707
26,MIN_REDUCTION+68, // `[
102,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 708
7,1008, // ID
16,304, // `(
21,1146, // <exp>
32,1306, // <exp1>
41,1379, // <exp8>
43,1620, // <exp7>
45,784, // <exp6>
47,1267, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 709
0x80000000|1344, // match move
0x80000000|647, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 710
0x80000000|1, // match move
0x80000000|1338, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 711
0x80000000|701, // match move
0x80000000|891, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 712
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 713
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 714
106,327, // " "
123,1186, // {10}
132,224, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 715
106,747, // " "
123,69, // {10}
132,1551, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 716
0x80000000|1, // match move
0x80000000|749, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 717
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 718
16,28, // `(
117,1467, // "("
  }
,
{ // state 719
84,762, // "r"
88,711, // "h"
  }
,
{ // state 720
2,312, // ws*
26,MIN_REDUCTION+167, // `[
102,MIN_REDUCTION+167, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 721
26,MIN_REDUCTION+68, // `[
102,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 722
0x80000000|1344, // match move
0x80000000|655, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 723
2,1283, // ws*
26,MIN_REDUCTION+216, // `[
102,MIN_REDUCTION+216, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 724
0x80000000|564, // match move
0x80000000|941, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 725
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 726
25,1721, // <empty bracket pair>
26,766, // `[
102,685, // "["
  }
,
{ // state 727
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,113, // letter128
94,636, // {199..218 231..250}
95,636, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1723, // digit128
100,241, // {176..185}
120,787, // "_"
130,1161, // {223}
133,1208, // idChar*
134,55, // $$0
141,24, // idChar
142,1612, // idChar128
  }
,
{ // state 728
46,117, // `==
48,1067, // `!=
122,1684, // "@"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 729
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 730
0x80000000|1411, // match move
0x80000000|851, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 731
106,368, // " "
123,1180, // {10}
132,213, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 732
26,MIN_REDUCTION+68, // `[
102,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 733
26,MIN_REDUCTION+213, // `[
102,MIN_REDUCTION+213, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 734
7,1076, // ID
8,920, // `{
10,962, // `}
18,997, // <stmt>*
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1246, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,1728, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 735
0x80000000|1, // match move
0x80000000|1495, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 736
2,1509, // ws*
26,MIN_REDUCTION+129, // `[
102,MIN_REDUCTION+129, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 737
7,1008, // ID
16,304, // `(
21,1119, // <exp>
32,1306, // <exp1>
41,1379, // <exp8>
43,1620, // <exp7>
45,784, // <exp6>
47,1267, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 738
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,8, // letter128
94,646, // {199..218 231..250}
95,646, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1730, // digit128
100,215, // {176..185}
120,787, // "_"
130,1136, // {223}
133,1193, // idChar*
134,12, // $$0
141,24, // idChar
142,1643, // idChar128
  }
,
{ // state 739
0x80000000|1, // match move
0x80000000|1308, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 740
46,30, // `==
48,1033, // `!=
122,1684, // "@"
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 741
26,MIN_REDUCTION+208, // `[
102,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 742
81,1743, // "i"
86,1662, // "b"
  }
,
{ // state 743
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,14, // letter128
94,653, // {199..218 231..250}
95,653, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1727, // digit128
100,217, // {176..185}
120,787, // "_"
130,1139, // {223}
133,1194, // idChar*
134,15, // $$0
141,24, // idChar
142,1646, // idChar128
  }
,
{ // state 744
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 745
0x80000000|1354, // match move
0x80000000|736, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 746
106,1160, // " "
123,474, // {10}
132,1264, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 747
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 748
25,1731, // <empty bracket pair>
26,806, // `[
102,685, // "["
  }
,
{ // state 749
26,MIN_REDUCTION+176, // `[
102,MIN_REDUCTION+176, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 750
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 751
26,MIN_REDUCTION+104, // `[
102,MIN_REDUCTION+104, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 752
0x80000000|1, // match move
0x80000000|1511, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 753
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 754
0x80000000|1613, // match move
0x80000000|428, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
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
{ // state 755
7,990, // ID
16,361, // `(
21,1334, // <exp>
32,468, // <exp1>
41,1521, // <exp8>
43,1701, // <exp7>
45,740, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 756
76,1089, // "a"
77,1089, // "p"
78,1089, // "v"
79,1089, // "c"
80,1089, // "f"
81,1089, // "i"
82,1089, // "l"
83,1089, // "o"
84,1089, // "r"
85,1089, // "u"
86,1089, // "b"
87,1089, // "e"
88,1089, // "h"
89,1089, // "n"
90,1089, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1089, // "t"
92,1089, // "w"
97,1089, // {"1".."9"}
98,1089, // "0"
101,591, // any
102,1089, // "["
103,1089, // "-"
104,1089, // "<"
105,1089, // "|"
106,1089, // " "
107,1089, // "#"
108,1089, // "&"
109,1089, // ")"
110,1089, // "]"
111,1089, // "/"
112,1089, // ";"
113,1089, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1089, // ">"
115,1089, // "{"
116,1089, // "%"
117,1089, // "("
118,1089, // "+"
119,1089, // "."
120,1089, // "_"
121,1089, // "="
122,1089, // "@"
123,1089, // {10}
124,1089, // "}"
125,1089, // "!"
126,1089, // "'"
127,1089, // '"'
128,1089, // "*"
  }
,
{ // state 757
0x80000000|1, // match move
0x80000000|632, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 758
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 759
2,556, // ws*
26,MIN_REDUCTION+173, // `[
102,MIN_REDUCTION+173, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 760
2,1221, // ws*
106,119, // " "
123,859, // {10}
132,598, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 761
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 762
0x80000000|585, // match move
0x80000000|1736, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 763
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 764
26,MIN_REDUCTION+104, // `[
102,MIN_REDUCTION+104, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 765
16,628, // `(
117,1467, // "("
  }
,
{ // state 766
27,662, // `]
110,842, // "]"
  }
,
{ // state 767
46,100, // `==
48,1023, // `!=
122,1684, // "@"
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 768
7,1076, // ID
8,660, // `{
19,1301, // <type>
20,615, // `return
22,282, // `;
23,841, // `int
24,1611, // `boolean
28,702, // <stmt>
29,1460, // <assign>
30,1468, // `break
31,536, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,765, // `while
39,61, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,994, // "#"
112,679, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 769
26,MIN_REDUCTION+213, // `[
102,MIN_REDUCTION+213, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 770
2,370, // ws*
106,144, // " "
123,763, // {10}
132,527, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 771
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 772
0x80000000|236, // match move
0x80000000|78, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 773
2,1586, // ws*
106,1510, // " "
123,1408, // {10}
132,924, // ws
146,MIN_REDUCTION+145, // $NT
  }
,
{ // state 774
33,678, // `=
121,212, // "="
  }
,
{ // state 775
0x80000000|181, // match move
0x80000000|723, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 776
2,1445, // ws*
106,1160, // " "
123,474, // {10}
132,76, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 777
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 778
26,MIN_REDUCTION+104, // `[
102,MIN_REDUCTION+104, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 779
0x80000000|1, // match move
0x80000000|610, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 780
0x80000000|552, // match move
0x80000000|1369, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 781
0x80000000|292, // match move
0x80000000|21, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 782
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 783
0x80000000|630, // match move
0x80000000|1752, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 784
46,117, // `==
48,1067, // `!=
122,1684, // "@"
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 785
2,1322, // ws*
26,MIN_REDUCTION+210, // `[
102,MIN_REDUCTION+210, // "["
106,264, // " "
123,123, // {10}
132,569, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 786
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,750, // letter128
94,1459, // {199..218 231..250}
95,1459, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1029, // digit128
100,1330, // {176..185}
120,787, // "_"
130,125, // {223}
133,104, // idChar*
134,1607, // $$0
141,24, // idChar
142,1734, // idChar128
  }
,
{ // state 787
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 788
27,825, // `]
110,638, // "]"
  }
,
{ // state 789
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 790
26,MIN_REDUCTION+176, // `[
102,MIN_REDUCTION+176, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 791
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 792
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 793
106,327, // " "
123,1186, // {10}
132,224, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 794
26,824, // `[
74,1572, // `.
102,1712, // "["
119,898, // "."
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 795
26,MIN_REDUCTION+209, // `[
102,MIN_REDUCTION+209, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 796
26,MIN_REDUCTION+213, // `[
102,MIN_REDUCTION+213, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 797
37,642, // <else stmt>
38,1426, // `else
40,969, // <else stmt>?
107,129, // "#"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 798
0x80000000|1613, // match move
0x80000000|464, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 799
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,694, // letter128
94,1491, // {199..218 231..250}
95,1491, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1021, // digit128
100,1341, // {176..185}
120,787, // "_"
130,142, // {223}
133,115, // idChar*
134,1619, // $$0
141,24, // idChar
142,1749, // idChar128
  }
,
{ // state 800
26,MIN_REDUCTION+215, // `[
102,MIN_REDUCTION+215, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 801
80,374, // "f"
89,1207, // "n"
91,719, // "t"
  }
,
{ // state 802
7,990, // ID
16,361, // `(
21,436, // <exp>
32,468, // <exp1>
41,1521, // <exp8>
43,1701, // <exp7>
45,740, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 803
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 804
2,836, // ws*
26,MIN_REDUCTION+212, // `[
102,MIN_REDUCTION+212, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 805
0x80000000|1, // match move
0x80000000|538, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 806
27,673, // `]
110,672, // "]"
  }
,
{ // state 807
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,50, // letter128
94,684, // {199..218 231..250}
95,684, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1756, // digit128
100,195, // {176..185}
120,787, // "_"
130,1104, // {223}
133,1116, // idChar*
134,211, // $$0
141,24, // idChar
142,1591, // idChar128
  }
,
{ // state 808
76,1091, // "a"
77,1091, // "p"
78,1091, // "v"
79,1091, // "c"
80,1091, // "f"
81,1091, // "i"
82,1091, // "l"
83,1091, // "o"
84,1091, // "r"
85,1091, // "u"
86,1091, // "b"
87,1091, // "e"
88,1091, // "h"
89,1091, // "n"
90,1091, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1091, // "t"
92,1091, // "w"
97,1091, // {"1".."9"}
98,1091, // "0"
101,605, // any
102,1091, // "["
103,1091, // "-"
104,1091, // "<"
105,1091, // "|"
106,1091, // " "
107,1091, // "#"
108,1091, // "&"
109,1091, // ")"
110,1091, // "]"
111,1091, // "/"
112,1091, // ";"
113,1091, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1091, // ">"
115,1091, // "{"
116,1091, // "%"
117,1091, // "("
118,1091, // "+"
119,1091, // "."
120,1091, // "_"
121,1091, // "="
122,1091, // "@"
123,1091, // {10}
124,1091, // "}"
125,1091, // "!"
126,1091, // "'"
127,1091, // '"'
128,1091, // "*"
  }
,
{ // state 809
82,1101, // "l"
  }
,
{ // state 810
26,MIN_REDUCTION+176, // `[
102,MIN_REDUCTION+176, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 811
2,563, // ws*
26,MIN_REDUCTION+173, // `[
102,MIN_REDUCTION+173, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 812
0x80000000|1613, // match move
0x80000000|472, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 813
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 814
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 815
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 816
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 817
0x80000000|618, // match move
0x80000000|1716, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 818
106,368, // " "
123,1180, // {10}
132,213, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 819
0x80000000|1, // match move
0x80000000|778, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 820
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 821
26,MIN_REDUCTION+208, // `[
102,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 822
0x80000000|1, // match move
0x80000000|519, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 823
0x80000000|1, // match move
0x80000000|81, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 824
7,1008, // ID
16,304, // `(
21,1122, // <exp>
32,1306, // <exp1>
41,1379, // <exp8>
43,1620, // <exp7>
45,784, // <exp6>
47,1267, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 825
0x80000000|526, // match move
0x80000000|281, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 826
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 827
2,500, // ws*
26,MIN_REDUCTION+173, // `[
102,MIN_REDUCTION+173, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 828
106,816, // " "
123,1040, // {10}
132,919, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 829
22,935, // `;
112,1680, // ";"
  }
,
{ // state 830
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 831
7,1008, // ID
16,304, // `(
21,1128, // <exp>
32,1306, // <exp1>
41,1379, // <exp8>
43,1620, // <exp7>
45,784, // <exp6>
47,1267, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 832
46,30, // `==
48,1033, // `!=
122,1684, // "@"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 833
22,13, // `;
112,1142, // ";"
  }
,
{ // state 834
7,356, // ID
75,727, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,225, // letter128
94,636, // {199..218 231..250}
95,636, // {193..198 225..230}
  }
,
{ // state 835
106,680, // " "
123,245, // {10}
132,11, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 836
0x80000000|1, // match move
0x80000000|1416, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 837
2,577, // ws*
26,MIN_REDUCTION+167, // `[
102,MIN_REDUCTION+167, // "["
106,264, // " "
123,123, // {10}
132,569, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 838
26,MIN_REDUCTION+208, // `[
102,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 839
0x80000000|1, // match move
0x80000000|480, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 840
2,1609, // ws*
106,1324, // " "
123,22, // {10}
132,643, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 841
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 842
0x80000000|1498, // match move
0x80000000|942, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 843
106,1514, // " "
123,967, // {10}
132,988, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 844
0x80000000|1535, // match move
0x80000000|1198, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 845
0x80000000|1, // match move
0x80000000|751, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 846
104,1111, // "<"
105,1171, // "|"
108,502, // "&"
114,508, // ">"
121,770, // "="
125,35, // "!"
  }
,
{ // state 847
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 848
0x80000000|559, // match move
0x80000000|172, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 849
7,324, // ID
19,473, // <type>
23,214, // `int
24,514, // `boolean
75,205, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1035, // letter128
94,1558, // {199..218 231..250}
95,1558, // {193..198 225..230}
107,1309, // "#"
  }
,
{ // state 850
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 851
106,506, // " "
123,1004, // {10}
132,342, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 852
0x80000000|559, // match move
0x80000000|176, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 853
26,MIN_REDUCTION+213, // `[
102,MIN_REDUCTION+213, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 854
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,713, // letter128
94,1476, // {199..218 231..250}
95,1476, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,712, // digit128
100,1289, // {176..185}
120,787, // "_"
130,155, // {223}
133,70, // idChar*
134,1635, // $$0
141,24, // idChar
142,1687, // idChar128
  }
,
{ // state 855
106,1671, // " "
123,1009, // {10}
132,1463, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 856
0x80000000|559, // match move
0x80000000|186, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 857
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 858
7,1008, // ID
16,304, // `(
21,631, // <exp>
32,1306, // <exp1>
41,1379, // <exp8>
43,1620, // <exp7>
45,784, // <exp6>
47,1267, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 859
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 860
26,858, // `[
74,1626, // `.
102,1712, // "["
119,898, // "."
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 861
80,420, // "f"
89,1168, // "n"
91,131, // "t"
  }
,
{ // state 862
27,1216, // `]
110,1529, // "]"
  }
,
{ // state 863
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,697, // letter128
94,963, // {199..218 231..250}
95,963, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,416, // digit128
100,128, // {176..185}
120,787, // "_"
130,880, // {223}
133,280, // idChar*
134,1539, // $$0
141,24, // idChar
142,476, // idChar128
  }
,
{ // state 864
76,1093, // "a"
77,1093, // "p"
78,1093, // "v"
79,1093, // "c"
80,1093, // "f"
81,1093, // "i"
82,1093, // "l"
83,1093, // "o"
84,1093, // "r"
85,1093, // "u"
86,1093, // "b"
87,1093, // "e"
88,1093, // "h"
89,1093, // "n"
90,1093, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1093, // "t"
92,1093, // "w"
94,798, // {199..218 231..250}
95,798, // {193..198 225..230}
97,1093, // {"1".."9"}
98,1093, // "0"
100,798, // {176..185}
101,1006, // any
102,1093, // "["
103,1093, // "-"
104,1093, // "<"
105,1093, // "|"
106,1093, // " "
107,1093, // "#"
108,1093, // "&"
109,1093, // ")"
110,1093, // "]"
111,1093, // "/"
112,1093, // ";"
113,1093, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1093, // ">"
115,1093, // "{"
116,1093, // "%"
117,1093, // "("
118,1093, // "+"
119,1093, // "."
120,1093, // "_"
121,1093, // "="
122,1093, // "@"
123,1093, // {10}
124,1093, // "}"
125,1093, // "!"
126,1093, // "'"
127,1093, // '"'
128,1093, // "*"
129,1565, // any128
130,798, // {223}
131,798, // {128..175 186..192 219..222 224 251..255}
140,409, // $$3
  }
,
{ // state 865
22,1390, // `;
112,895, // ";"
  }
,
{ // state 866
27,998, // `]
110,1690, // "]"
  }
,
{ // state 867
2,315, // ws*
26,MIN_REDUCTION+129, // `[
102,MIN_REDUCTION+129, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 868
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 869
106,108, // " "
123,850, // {10}
132,1506, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 870
55,63, // `+
57,893, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 871
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,674, // " "
123,379, // {10}
132,1373, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 872
0x80000000|1531, // match move
0x80000000|1080, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 873
106,364, // " "
123,1154, // {10}
132,203, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 874
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 875
7,990, // ID
16,361, // `(
32,468, // <exp1>
43,1202, // <exp7>
45,740, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 876
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
55,1465, // `+
56,1326, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 877
26,MIN_REDUCTION+186, // `[
102,MIN_REDUCTION+186, // "["
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 878
26,MIN_REDUCTION+69, // `[
102,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 879
7,1008, // ID
32,1306, // <exp1>
55,1465, // `+
57,879, // `-
64,565, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
118,403, // "+"
122,1174, // "@"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 880
0x80000000|625, // match move
0x80000000|26, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 881
26,MIN_REDUCTION+128, // `[
102,MIN_REDUCTION+128, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 882
17,1475, // `)
109,776, // ")"
  }
,
{ // state 883
76,1093, // "a"
77,1093, // "p"
78,1093, // "v"
79,1093, // "c"
80,1093, // "f"
81,1093, // "i"
82,1093, // "l"
83,1093, // "o"
84,1093, // "r"
85,1093, // "u"
86,1093, // "b"
87,1093, // "e"
88,1093, // "h"
89,1093, // "n"
90,1093, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1093, // "t"
92,1093, // "w"
94,754, // {199..218 231..250}
95,754, // {193..198 225..230}
97,1093, // {"1".."9"}
98,1093, // "0"
100,754, // {176..185}
101,1006, // any
102,1093, // "["
103,1093, // "-"
104,1093, // "<"
105,1093, // "|"
106,1093, // " "
107,1093, // "#"
108,1093, // "&"
109,1093, // ")"
110,1093, // "]"
111,1093, // "/"
112,1093, // ";"
113,1093, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1093, // ">"
115,1093, // "{"
116,1093, // "%"
117,1093, // "("
118,1093, // "+"
119,1093, // "."
120,1093, // "_"
121,1093, // "="
122,1093, // "@"
123,1093, // {10}
124,1093, // "}"
125,1093, // "!"
126,1093, // "'"
127,1093, // '"'
128,1093, // "*"
129,1605, // any128
130,754, // {223}
131,754, // {128..175 186..192 219..222 224 251..255}
140,393, // $$3
  }
,
{ // state 884
0x80000000|1, // match move
0x80000000|1692, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 885
26,MIN_REDUCTION+186, // `[
102,MIN_REDUCTION+186, // "["
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 886
0x80000000|1531, // match move
0x80000000|1015, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 887
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 888
0x80000000|1, // match move
0x80000000|1676, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 889
106,506, // " "
123,1004, // {10}
132,342, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 890
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 891
2,112, // ws*
26,MIN_REDUCTION+101, // `[
102,MIN_REDUCTION+101, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 892
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 893
7,1000, // ID
16,367, // `(
32,446, // <exp1>
55,1439, // `+
56,1276, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 894
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 895
2,918, // ws*
106,622, // " "
123,133, // {10}
132,1205, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 896
7,1000, // ID
32,446, // <exp1>
55,1439, // `+
57,896, // `-
64,691, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
118,403, // "+"
122,1203, // "@"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 897
26,MIN_REDUCTION+128, // `[
102,MIN_REDUCTION+128, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 898
2,204, // ws*
106,816, // " "
123,1040, // {10}
132,1707, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 899
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 900
2,1114, // ws*
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 901
2,735, // ws*
  }
,
{ // state 902
26,MIN_REDUCTION+79, // `[
102,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 903
2,287, // ws*
26,MIN_REDUCTION+129, // `[
102,MIN_REDUCTION+129, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 904
2,74, // ws*
106,747, // " "
123,69, // {10}
132,1337, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 905
7,990, // ID
32,468, // <exp1>
55,1443, // `+
57,905, // `-
64,717, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
118,403, // "+"
122,1109, // "@"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 906
26,MIN_REDUCTION+178, // `[
102,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 907
0x80000000|1213, // match move
0x80000000|1292, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 908
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 909
0x80000000|1, // match move
0x80000000|1412, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 910
2,752, // ws*
  }
,
{ // state 911
26,MIN_REDUCTION+128, // `[
102,MIN_REDUCTION+128, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 912
0x80000000|1531, // match move
0x80000000|989, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 913
106,506, // " "
123,1004, // {10}
132,342, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 914
0x80000000|118, // match move
0x80000000|1447, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 915
0x80000000|1, // match move
0x80000000|1665, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 916
55,111, // `+
57,876, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 917
0x80000000|52, // match move
0x80000000|1295, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 918
106,622, // " "
123,133, // {10}
132,1698, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 919
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 920
7,1076, // ID
8,920, // `{
10,1472, // `}
18,574, // <stmt>*
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1246, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,613, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 921
7,1076, // ID
8,660, // `{
19,1301, // <type>
22,282, // `;
23,841, // `int
24,1611, // `boolean
28,753, // <stmt>
29,1460, // <assign>
30,1468, // `break
31,536, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,765, // `while
39,61, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,679, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 922
0x80000000|1645, // match move
0x80000000|1188, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 923
55,111, // `+
57,876, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 924
146,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 925
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 926
2,999, // ws*
  }
,
{ // state 927
26,MIN_REDUCTION+185, // `[
102,MIN_REDUCTION+185, // "["
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 928
106,222, // " "
123,1567, // {10}
132,890, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 929
0x80000000|1, // match move
0x80000000|733, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 930
26,MIN_REDUCTION+83, // `[
102,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 931
0x80000000|1, // match move
0x80000000|1399, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 932
0x80000000|1, // match move
0x80000000|860, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 933
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 934
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 935
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 936
0x80000000|1209, // match move
0x80000000|1488, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 937
0x80000000|1, // match move
0x80000000|794, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 938
106,327, // " "
123,1186, // {10}
132,224, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 939
26,831, // `[
74,1603, // `.
102,1712, // "["
119,898, // "."
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 940
7,1008, // ID
16,304, // `(
21,1681, // <exp>
32,1306, // <exp1>
41,1379, // <exp8>
43,1620, // <exp7>
45,784, // <exp6>
47,1267, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 941
2,75, // ws*
26,MIN_REDUCTION+101, // `[
102,MIN_REDUCTION+101, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 942
2,1667, // ws*
26,MIN_REDUCTION+145, // `[
102,MIN_REDUCTION+145, // "["
106,661, // " "
123,414, // {10}
132,1677, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 943
0x80000000|1, // match move
0x80000000|1280, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 944
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 945
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 946
106,1641, // " "
123,1575, // {10}
132,92, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 947
83,425, // "o"
  }
,
{ // state 948
7,1076, // ID
8,1200, // `{
19,1301, // <type>
22,1069, // `;
23,841, // `int
24,1611, // `boolean
28,248, // <stmt>
29,91, // <assign>
30,829, // `break
31,437, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,617, // `while
39,1249, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,1680, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 949
0x80000000|1, // match move
0x80000000|1165, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 950
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 951
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 952
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,661, // " "
123,414, // {10}
132,1346, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 953
0x80000000|1213, // match move
0x80000000|1315, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 954
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 955
55,89, // `+
57,974, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 956
106,108, // " "
123,850, // {10}
132,1506, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 957
0x80000000|1, // match move
0x80000000|1247, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 958
0x80000000|221, // match move
0x80000000|1714, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 959
55,63, // `+
57,893, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 960
106,816, // " "
123,1040, // {10}
132,919, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 961
2,1685, // ws*
26,MIN_REDUCTION+145, // `[
102,MIN_REDUCTION+145, // "["
106,656, // " "
123,419, // {10}
132,1682, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 962
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 963
0x80000000|233, // match move
0x80000000|1030, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 964
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,656, // " "
123,419, // {10}
132,1380, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 965
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 966
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 967
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 968
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 969
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 970
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 971
2,101, // ws*
26,MIN_REDUCTION+101, // `[
102,MIN_REDUCTION+101, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 972
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
43,1166, // <exp7>
45,784, // <exp6>
47,1267, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 973
0x80000000|1, // match move
0x80000000|939, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 974
7,990, // ID
16,361, // `(
32,468, // <exp1>
55,1443, // `+
56,1236, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 975
55,89, // `+
57,974, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 976
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 977
106,680, // " "
123,245, // {10}
132,11, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 978
2,325, // ws*
26,MIN_REDUCTION+129, // `[
102,MIN_REDUCTION+129, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 979
76,1093, // "a"
77,1093, // "p"
78,1093, // "v"
79,1093, // "c"
80,1093, // "f"
81,1093, // "i"
82,1093, // "l"
83,1093, // "o"
84,1093, // "r"
85,1093, // "u"
86,1093, // "b"
87,1093, // "e"
88,1093, // "h"
89,1093, // "n"
90,1093, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1093, // "t"
92,1093, // "w"
94,812, // {199..218 231..250}
95,812, // {193..198 225..230}
97,1093, // {"1".."9"}
98,1093, // "0"
100,812, // {176..185}
101,1006, // any
102,1093, // "["
103,1093, // "-"
104,1093, // "<"
105,1093, // "|"
106,1093, // " "
107,1093, // "#"
108,1093, // "&"
109,1093, // ")"
110,1093, // "]"
111,1093, // "/"
112,1093, // ";"
113,1093, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1093, // ">"
115,1093, // "{"
116,1093, // "%"
117,1093, // "("
118,1093, // "+"
119,1093, // "."
120,1093, // "_"
121,1093, // "="
122,1093, // "@"
123,1093, // {10}
124,1093, // "}"
125,1093, // "!"
126,1093, // "'"
127,1093, // '"'
128,1093, // "*"
129,1638, // any128
130,812, // {223}
131,812, // {128..175 186..192 219..222 224 251..255}
140,418, // $$3
  }
,
{ // state 980
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 981
0x80000000|1213, // match move
0x80000000|1106, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 982
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 983
106,368, // " "
123,1180, // {10}
132,213, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 984
7,1000, // ID
16,367, // `(
32,446, // <exp1>
43,1192, // <exp7>
45,767, // <exp6>
47,1302, // <exp5>
50,870, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 985
0x80000000|1, // match move
0x80000000|584, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 986
85,663, // "u"
87,338, // "e"
  }
,
{ // state 987
0x80000000|210, // match move
0x80000000|1746, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 988
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 989
26,MIN_REDUCTION+185, // `[
102,MIN_REDUCTION+185, // "["
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 990
0x80000000|1, // match move
0x80000000|1107, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 991
80,350, // "f"
89,555, // "n"
91,183, // "t"
  }
,
{ // state 992
26,MIN_REDUCTION+82, // `[
102,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 993
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 994
80,572, // "f"
81,1163, // "i"
84,1206, // "r"
86,1382, // "b"
89,986, // "n"
91,1655, // "t"
92,475, // "w"
118,1497, // "+"
  }
,
{ // state 995
26,MIN_REDUCTION+65, // `[
102,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 996
7,815, // ID
19,635, // <type>
23,434, // `int
24,1717, // `boolean
75,786, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1520, // letter128
94,1459, // {199..218 231..250}
95,1459, // {193..198 225..230}
107,1368, // "#"
  }
,
{ // state 997
7,1076, // ID
8,920, // `{
10,1737, // `}
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1403, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,1728, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 998
0x80000000|401, // match move
0x80000000|1589, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 999
0x80000000|1, // match move
0x80000000|1598, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1000
0x80000000|1, // match move
0x80000000|1117, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1001
7,803, // ID
19,645, // <type>
23,426, // `int
24,1726, // `boolean
75,799, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1536, // letter128
94,1491, // {199..218 231..250}
95,1491, // {193..198 225..230}
107,1485, // "#"
  }
,
{ // state 1002
0x80000000|1, // match move
0x80000000|259, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1003
0x80000000|1, // match move
0x80000000|277, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1004
0x80000000|1544, // match move
0x80000000|568, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1005
2,1322, // ws*
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1006
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 1007
7,1076, // ID
8,920, // `{
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,454, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 1008
0x80000000|1, // match move
0x80000000|1156, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1009
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1010
22,1525, // `;
112,1733, // ";"
  }
,
{ // state 1011
7,758, // ID
19,619, // <type>
23,438, // `int
24,1740, // `boolean
75,854, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1501, // letter128
94,1476, // {199..218 231..250}
95,1476, // {193..198 225..230}
107,1441, // "#"
  }
,
{ // state 1012
17,249, // `)
109,648, // ")"
  }
,
{ // state 1013
0x80000000|1, // match move
0x80000000|270, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1014
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1015
26,MIN_REDUCTION+185, // `[
102,MIN_REDUCTION+185, // "["
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1016
7,1076, // ID
8,1200, // `{
19,1301, // <type>
22,1069, // `;
23,841, // `int
24,1611, // `boolean
28,667, // <stmt>
29,91, // <assign>
30,829, // `break
31,437, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,617, // `while
39,1249, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,1680, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 1017
0x80000000|1, // match move
0x80000000|328, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1018
2,1157, // ws*
  }
,
{ // state 1019
79,1678, // "c"
  }
,
{ // state 1020
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 1021
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1022
2,1553, // ws*
26,MIN_REDUCTION+177, // `[
102,MIN_REDUCTION+177, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1023
7,1000, // ID
16,367, // `(
32,446, // <exp1>
47,616, // <exp5>
50,870, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 1024
0x80000000|1, // match move
0x80000000|343, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1025
26,MIN_REDUCTION+206, // `[
102,MIN_REDUCTION+206, // "["
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1026
0x80000000|1, // match move
0x80000000|1500, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1027
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1028
0x80000000|1, // match move
0x80000000|1471, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1029
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1030
26,MIN_REDUCTION+77, // `[
102,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1031
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1032
2,1037, // ws*
106,747, // " "
123,69, // {10}
132,1337, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1033
7,990, // ID
16,361, // `(
32,468, // <exp1>
47,554, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 1034
7,744, // ID
75,743, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,126, // letter128
94,653, // {199..218 231..250}
95,653, // {193..198 225..230}
  }
,
{ // state 1035
0x80000000|1185, // match move
0x80000000|1296, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1036
0x80000000|1211, // match move
0x80000000|38, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1037
106,747, // " "
123,69, // {10}
132,1551, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1038
26,MIN_REDUCTION+168, // `[
102,MIN_REDUCTION+168, // "["
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1039
0x80000000|526, // match move
0x80000000|1312, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1040
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1041
2,1177, // ws*
  }
,
{ // state 1042
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1043
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,658, // letter128
94,626, // {199..218 231..250}
95,626, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,782, // digit128
100,1480, // {176..185}
120,787, // "_"
130,524, // {223}
134,392, // $$0
141,820, // idChar
142,1696, // idChar128
  }
,
{ // state 1044
7,1076, // ID
8,734, // `{
19,1301, // <type>
22,269, // `;
23,841, // `int
24,1611, // `boolean
29,1167, // <assign>
30,80, // `break
31,535, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,174, // `while
37,1725, // <else stmt>
38,921, // `else
39,718, // `if
40,1164, // <else stmt>?
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,1548, // "#"
112,335, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
MIN_REDUCTION+33, // (default reduction)
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
{ // state 1045
26,MIN_REDUCTION+82, // `[
102,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1046
26,MIN_REDUCTION+77, // `[
102,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1047
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1048
7,1270, // ID
75,743, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,126, // letter128
94,653, // {199..218 231..250}
95,653, // {193..198 225..230}
  }
,
{ // state 1049
0x80000000|1, // match move
0x80000000|317, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1050
0x80000000|452, // match move
0x80000000|1695, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1051
106,1703, // " "
123,965, // {10}
132,1074, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1052
106,119, // " "
123,859, // {10}
132,1489, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1053
0x80000000|1, // match move
0x80000000|1533, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1054
0x80000000|33, // match move
0x80000000|1335, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1055
103,1243, // "-"
118,1415, // "+"
127,1428, // '"'
  }
,
{ // state 1056
2,297, // ws*
106,729, // " "
123,410, // {10}
132,1438, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 1057
0x80000000|1, // match move
0x80000000|310, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1058
85,54, // "u"
  }
,
{ // state 1059
0x80000000|1, // match move
0x80000000|1616, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1060
26,MIN_REDUCTION+186, // `[
102,MIN_REDUCTION+186, // "["
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1061
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 1062
0x80000000|452, // match move
0x80000000|1516, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1063
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1064
2,1127, // ws*
  }
,
{ // state 1065
0x80000000|1, // match move
0x80000000|1427, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1066
0x80000000|48, // match move
0x80000000|1305, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1067
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
47,634, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 1068
0x80000000|1, // match move
0x80000000|355, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1069
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1070
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1071
27,1039, // `]
110,1446, // "]"
  }
,
{ // state 1072
103,206, // "-"
118,666, // "+"
  }
,
{ // state 1073
26,MIN_REDUCTION+77, // `[
102,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1074
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1075
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
50,1189, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 1076
0x80000000|1344, // match move
0x80000000|1360, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1077
0x80000000|1613, // match move
0x80000000|208, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1078
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1079
2,1138, // ws*
26,MIN_REDUCTION+212, // `[
102,MIN_REDUCTION+212, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1080
26,MIN_REDUCTION+185, // `[
102,MIN_REDUCTION+185, // "["
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1081
26,MIN_REDUCTION+65, // `[
102,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 1082
7,990, // ID
16,361, // `(
32,468, // <exp1>
50,1152, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 1083
0x80000000|559, // match move
0x80000000|606, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1084
26,MIN_REDUCTION+65, // `[
102,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 1085
0x80000000|1, // match move
0x80000000|296, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1086
106,455, // " "
123,352, // {10}
132,1537, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1087
26,MIN_REDUCTION+82, // `[
102,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1088
2,500, // ws*
  }
,
{ // state 1089
0x80000000|452, // match move
0x80000000|1679, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1090
2,1178, // ws*
26,MIN_REDUCTION+212, // `[
102,MIN_REDUCTION+212, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1091
0x80000000|452, // match move
0x80000000|1686, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1092
7,1000, // ID
16,367, // `(
32,446, // <exp1>
50,1121, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 1093
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1094
26,MIN_REDUCTION+77, // `[
102,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1095
7,1452, // ID
15,834, // `void
19,412, // <type>
23,841, // `int
24,1611, // `boolean
75,518, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1633, // letter128
94,789, // {199..218 231..250}
95,789, // {193..198 225..230}
107,79, // "#"
  }
,
{ // state 1096
0x80000000|1, // match move
0x80000000|300, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1097
106,1124, // " "
123,448, // {10}
132,1266, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1098
0x80000000|1, // match move
0x80000000|209, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1099
76,657, // "a"
77,657, // "p"
78,657, // "v"
79,657, // "c"
80,657, // "f"
81,657, // "i"
82,657, // "l"
83,657, // "o"
84,657, // "r"
85,657, // "u"
86,657, // "b"
87,657, // "e"
88,657, // "h"
89,657, // "n"
90,657, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,657, // "t"
92,657, // "w"
95,16, // {193..198 225..230}
97,657, // {"1".."9"}
98,657, // "0"
100,16, // {176..185}
137,1396, // hexDigit*
138,884, // $$2
143,37, // hexDigit
144,413, // hexDigit128
  }
,
{ // state 1100
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 1101
2,1147, // ws*
106,1347, // " "
123,1199, // {10}
132,252, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1102
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1103
26,MIN_REDUCTION+106, // `[
102,MIN_REDUCTION+106, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1104
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 1105
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1106
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,1383, // " "
123,265, // {10}
132,856, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1107
26,MIN_REDUCTION+63, // `[
102,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1108
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 1109
127,1256, // '"'
  }
,
{ // state 1110
106,1131, // " "
123,447, // {10}
132,1227, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1111
2,1448, // ws*
106,94, // " "
123,777, // {10}
132,621, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1112
2,563, // ws*
  }
,
{ // state 1113
26,824, // `[
74,1572, // `.
102,1712, // "["
119,898, // "."
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1114
0x80000000|950, // match move
0x80000000|1664, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1115
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1116
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,50, // letter128
94,684, // {199..218 231..250}
95,684, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1756, // digit128
100,195, // {176..185}
120,787, // "_"
130,1104, // {223}
134,182, // $$0
141,820, // idChar
142,1591, // idChar128
  }
,
{ // state 1117
26,MIN_REDUCTION+63, // `[
102,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1118
2,1098, // ws*
26,MIN_REDUCTION+212, // `[
102,MIN_REDUCTION+212, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1119
27,917, // `]
110,166, // "]"
  }
,
{ // state 1120
2,1639, // ws*
26,MIN_REDUCTION+167, // `[
102,MIN_REDUCTION+167, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1121
55,63, // `+
57,893, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1122
27,692, // `]
110,1484, // "]"
  }
,
{ // state 1123
26,MIN_REDUCTION+106, // `[
102,MIN_REDUCTION+106, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1124
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1125
49,1082, // `<
51,407, // `>
52,996, // `instanceof
53,404, // `<=
54,1212, // `>=
104,1366, // "<"
107,62, // "#"
114,1526, // ">"
122,846, // "@"
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1126
26,MIN_REDUCTION+67, // `[
102,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1127
0x80000000|1, // match move
0x80000000|796, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1128
27,739, // `]
110,1541, // "]"
  }
,
{ // state 1129
106,1105, // " "
123,441, // {10}
132,1220, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1130
2,556, // ws*
  }
,
{ // state 1131
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1132
0x80000000|1, // match move
0x80000000|321, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1133
22,169, // `;
112,895, // ";"
  }
,
{ // state 1134
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1135
26,831, // `[
74,1603, // `.
102,1712, // "["
119,898, // "."
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1136
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 1137
0x80000000|950, // match move
0x80000000|913, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1138
0x80000000|1, // match move
0x80000000|139, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1139
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 1140
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1141
27,363, // `]
110,1342, // "]"
  }
,
{ // state 1142
2,1333, // ws*
106,1149, // " "
123,478, // {10}
132,64, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1143
0x80000000|1, // match move
0x80000000|1350, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1144
26,MIN_REDUCTION+189, // `[
102,MIN_REDUCTION+189, // "["
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 1145
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1146
27,1054, // `]
110,137, // "]"
  }
,
{ // state 1147
106,1347, // " "
123,1199, // {10}
132,1223, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 1148
0x80000000|216, // match move
0x80000000|1622, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1149
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1150
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 1151
83,1658, // "o"
  }
,
{ // state 1152
55,89, // `+
57,974, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1153
2,325, // ws*
  }
,
{ // state 1154
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1155
27,1066, // `]
110,153, // "]"
  }
,
{ // state 1156
26,MIN_REDUCTION+63, // `[
102,MIN_REDUCTION+63, // "["
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1157
0x80000000|1, // match move
0x80000000|769, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1158
0x80000000|934, // match move
0x80000000|695, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1159
0x80000000|771, // match move
0x80000000|247, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1160
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1161
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 1162
26,MIN_REDUCTION+189, // `[
102,MIN_REDUCTION+189, // "["
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 1163
91,1402, // "t"
  }
,
{ // state 1164
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1165
26,MIN_REDUCTION+82, // `[
102,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1166
44,1262, // `&&
122,157, // "@"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1167
22,725, // `;
112,335, // ";"
  }
,
{ // state 1168
85,263, // "u"
87,338, // "e"
  }
,
{ // state 1169
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 1170
106,1160, // " "
123,474, // {10}
132,1264, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1171
2,340, // ws*
106,168, // " "
123,792, // {10}
132,557, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 1172
2,929, // ws*
  }
,
{ // state 1173
2,1051, // ws*
106,1703, // " "
123,965, // {10}
132,278, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1174
127,987, // '"'
  }
,
{ // state 1175
0x80000000|1, // match move
0x80000000|561, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1176
7,633, // ID
75,807, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,68, // letter128
94,684, // {199..218 231..250}
95,684, // {193..198 225..230}
  }
,
{ // state 1177
0x80000000|1, // match move
0x80000000|853, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1178
0x80000000|1, // match move
0x80000000|150, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1179
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1180
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1181
2,953, // ws*
26,MIN_REDUCTION+145, // `[
102,MIN_REDUCTION+145, // "["
106,1421, // " "
123,276, // {10}
132,551, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1182
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 1183
26,858, // `[
74,1626, // `.
102,1712, // "["
119,898, // "."
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 1184
0x80000000|944, // match move
0x80000000|326, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1185
2,936, // ws*
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1186
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1187
2,835, // ws*
106,680, // " "
123,245, // {10}
132,649, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1188
26,MIN_REDUCTION+205, // `[
102,MIN_REDUCTION+205, // "["
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1189
55,111, // `+
57,876, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1190
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1191
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 1192
44,1242, // `&&
122,157, // "@"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1193
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,8, // letter128
94,646, // {199..218 231..250}
95,646, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1730, // digit128
100,215, // {176..185}
120,787, // "_"
130,1136, // {223}
134,36, // $$0
141,820, // idChar
142,1643, // idChar128
  }
,
{ // state 1194
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,14, // letter128
94,653, // {199..218 231..250}
95,653, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1727, // digit128
100,217, // {176..185}
120,787, // "_"
130,1139, // {223}
134,40, // $$0
141,820, // idChar
142,1646, // idChar128
  }
,
{ // state 1195
0x80000000|236, // match move
0x80000000|359, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1196
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 1197
17,1688, // `)
109,648, // ")"
  }
,
{ // state 1198
2,411, // ws*
16,MIN_REDUCTION+210, // `(
106,1158, // " "
117,MIN_REDUCTION+210, // "("
123,1720, // {10}
132,288, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1199
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1200
7,1076, // ID
8,920, // `{
10,408, // `}
18,1307, // <stmt>*
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1246, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,467, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 1201
106,94, // " "
123,777, // {10}
132,1570, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1202
44,1218, // `&&
122,157, // "@"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1203
127,958, // '"'
  }
,
{ // state 1204
2,981, // ws*
26,MIN_REDUCTION+145, // `[
102,MIN_REDUCTION+145, // "["
106,1383, // " "
123,265, // {10}
132,537, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1205
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1206
87,549, // "e"
  }
,
{ // state 1207
85,257, // "u"
87,338, // "e"
  }
,
{ // state 1208
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,113, // letter128
94,636, // {199..218 231..250}
95,636, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,1723, // digit128
100,241, // {176..185}
120,787, // "_"
130,1161, // {223}
134,57, // $$0
141,820, // idChar
142,1612, // idChar128
  }
,
{ // state 1209
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1210
0x80000000|1, // match move
0x80000000|1404, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1211
2,730, // ws*
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1212
7,990, // ID
16,361, // `(
32,468, // <exp1>
50,955, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 1213
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1214
0x80000000|323, // match move
0x80000000|1755, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1215
0x80000000|292, // match move
0x80000000|1659, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1216
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1217
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,703, // " "
123,1600, // {10}
132,1083, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1218
7,990, // ID
16,361, // `(
32,468, // <exp1>
45,832, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 1219
0x80000000|439, // match move
0x80000000|1120, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1220
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1221
106,119, // " "
123,859, // {10}
132,1489, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 1222
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1223
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1224
0x80000000|1522, // match move
0x80000000|1290, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1225
26,MIN_REDUCTION+185, // `[
102,MIN_REDUCTION+185, // "["
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1226
83,1547, // "o"
  }
,
{ // state 1227
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1228
2,32, // ws*
106,594, // " "
123,1027, // {10}
132,505, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 1229
22,651, // `;
112,1733, // ";"
  }
,
{ // state 1230
2,1629, // ws*
26,MIN_REDUCTION+145, // `[
106,703, // " "
123,1600, // {10}
132,1318, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1231
17,266, // `)
109,648, // ")"
  }
,
{ // state 1232
49,1075, // `<
51,400, // `>
52,1011, // `instanceof
53,336, // `<=
54,1253, // `>=
104,1366, // "<"
107,62, // "#"
114,1526, // ">"
122,846, // "@"
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1233
7,990, // ID
16,361, // `(
21,704, // <exp>
32,468, // <exp1>
41,1521, // <exp8>
43,1701, // <exp7>
45,740, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 1234
7,1000, // ID
16,367, // `(
32,446, // <exp1>
50,959, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 1235
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1236
58,1269, // `*
60,198, // `/
61,227, // `%
111,760, // "/"
116,1387, // "%"
128,34, // "*"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1237
0x80000000|1522, // match move
0x80000000|1245, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1238
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1239
0x80000000|1, // match move
0x80000000|1265, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1240
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1241
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1242
7,1000, // ID
16,367, // `(
32,446, // <exp1>
45,677, // <exp6>
47,1302, // <exp5>
50,870, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 1243
2,121, // ws*
106,816, // " "
123,1040, // {10}
132,1707, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1244
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1245
26,MIN_REDUCTION+206, // `[
102,MIN_REDUCTION+206, // "["
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1246
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 1247
26,MIN_REDUCTION+175, // `[
102,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1248
2,907, // ws*
26,MIN_REDUCTION+145, // `[
102,MIN_REDUCTION+145, // "["
106,1409, // " "
123,237, // {10}
132,553, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1249
16,39, // `(
117,1467, // "("
  }
,
{ // state 1250
17,1007, // `)
109,648, // ")"
  }
,
{ // state 1251
0x80000000|1, // match move
0x80000000|1275, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1252
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1253
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
50,916, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 1254
76,1093, // "a"
77,1093, // "p"
78,1093, // "v"
79,1093, // "c"
80,1093, // "f"
81,1093, // "i"
82,1093, // "l"
83,1093, // "o"
84,1093, // "r"
85,1093, // "u"
86,1093, // "b"
87,1093, // "e"
88,1093, // "h"
89,1093, // "n"
90,1093, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1093, // "t"
92,1093, // "w"
94,754, // {199..218 231..250}
95,754, // {193..198 225..230}
97,1093, // {"1".."9"}
98,1093, // "0"
100,754, // {176..185}
101,1549, // any
102,1093, // "["
103,1093, // "-"
104,1093, // "<"
105,1093, // "|"
106,1093, // " "
107,1093, // "#"
108,1093, // "&"
109,1093, // ")"
110,1093, // "]"
111,1093, // "/"
112,1093, // ";"
113,1093, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1093, // ">"
115,1093, // "{"
116,1093, // "%"
117,1093, // "("
118,1093, // "+"
119,1093, // "."
120,1093, // "_"
121,1093, // "="
122,1093, // "@"
123,1093, // {10}
124,1093, // "}"
125,1093, // "!"
126,1093, // "'"
127,1093, // '"'
128,1093, // "*"
129,1605, // any128
130,754, // {223}
131,754, // {128..175 186..192 219..222 224 251..255}
139,883, // any*
140,1624, // $$3
  }
,
{ // state 1255
26,MIN_REDUCTION+206, // `[
102,MIN_REDUCTION+206, // "["
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1256
0x80000000|138, // match move
0x80000000|1719, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1257
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1258
26,MIN_REDUCTION+169, // `[
102,MIN_REDUCTION+169, // "["
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1259
0x80000000|1, // match move
0x80000000|1038, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1260
0x80000000|1, // match move
0x80000000|1545, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1261
83,1571, // "o"
  }
,
{ // state 1262
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
45,728, // <exp6>
47,1267, // <exp5>
50,923, // <exp4>
55,1465, // `+
56,529, // <exp3>
57,879, // `-
59,396, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 1263
26,MIN_REDUCTION+68, // `[
102,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1264
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1265
26,MIN_REDUCTION+169, // `[
102,MIN_REDUCTION+169, // "["
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1266
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1267
49,1075, // `<
51,400, // `>
52,1011, // `instanceof
53,336, // `<=
54,1253, // `>=
104,1366, // "<"
107,62, // "#"
114,1526, // ">"
122,846, // "@"
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1268
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1269
7,990, // ID
16,361, // `(
32,468, // <exp1>
55,1443, // `+
57,905, // `-
59,1340, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 1270
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1271
7,1000, // ID
16,367, // `(
32,446, // <exp1>
55,1439, // `+
57,896, // `-
59,1331, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 1272
106,1105, // " "
123,441, // {10}
132,1220, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1273
0x80000000|1, // match move
0x80000000|1258, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1274
83,1590, // "o"
  }
,
{ // state 1275
26,MIN_REDUCTION+169, // `[
102,MIN_REDUCTION+169, // "["
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1276
58,1271, // `*
60,191, // `/
61,3, // `%
111,760, // "/"
116,1387, // "%"
128,34, // "*"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1277
25,1184, // <empty bracket pair>
26,1071, // `[
102,685, // "["
  }
,
{ // state 1278
0x80000000|1371, // match move
0x80000000|1281, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1279
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 1280
26,MIN_REDUCTION+180, // `[
102,MIN_REDUCTION+180, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1281
26,MIN_REDUCTION+79, // `[
102,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1282
0x80000000|1, // match move
0x80000000|1608, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1283
0x80000000|1, // match move
0x80000000|800, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1284
7,1008, // ID
16,304, // `(
32,1306, // <exp1>
55,1465, // `+
57,879, // `-
59,1316, // <exp2>
62,482, // `!
63,1150, // <cast exp>
64,305, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
117,331, // "("
118,403, // "+"
122,1174, // "@"
125,1578, // "!"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 1285
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1286
76,1093, // "a"
77,1093, // "p"
78,1093, // "v"
79,1093, // "c"
80,1093, // "f"
81,1093, // "i"
82,1093, // "l"
83,1093, // "o"
84,1093, // "r"
85,1093, // "u"
86,1093, // "b"
87,1093, // "e"
88,1093, // "h"
89,1093, // "n"
90,1093, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1093, // "t"
92,1093, // "w"
94,798, // {199..218 231..250}
95,798, // {193..198 225..230}
97,1093, // {"1".."9"}
98,1093, // "0"
100,798, // {176..185}
101,1549, // any
102,1093, // "["
103,1093, // "-"
104,1093, // "<"
105,1093, // "|"
106,1093, // " "
107,1093, // "#"
108,1093, // "&"
109,1093, // ")"
110,1093, // "]"
111,1093, // "/"
112,1093, // ";"
113,1093, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1093, // ">"
115,1093, // "{"
116,1093, // "%"
117,1093, // "("
118,1093, // "+"
119,1093, // "."
120,1093, // "_"
121,1093, // "="
122,1093, // "@"
123,1093, // {10}
124,1093, // "}"
125,1093, // "!"
126,1093, // "'"
127,1093, // '"'
128,1093, // "*"
129,1565, // any128
130,798, // {223}
131,798, // {128..175 186..192 219..222 224 251..255}
139,864, // any*
140,1627, // $$3
  }
,
{ // state 1287
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 1288
0x80000000|1, // match move
0x80000000|1604, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1289
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1290
26,MIN_REDUCTION+206, // `[
102,MIN_REDUCTION+206, // "["
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1291
76,657, // "a"
77,657, // "p"
78,657, // "v"
79,657, // "c"
80,657, // "f"
81,657, // "i"
82,657, // "l"
83,657, // "o"
84,657, // "r"
85,657, // "u"
86,657, // "b"
87,657, // "e"
88,657, // "h"
89,657, // "n"
90,657, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,657, // "t"
92,657, // "w"
95,53, // {193..198 225..230}
97,657, // {"1".."9"}
98,657, // "0"
100,53, // {176..185}
137,1378, // hexDigit*
138,915, // $$2
143,37, // hexDigit
144,1343, // hexDigit128
  }
,
{ // state 1292
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,1409, // " "
123,237, // {10}
132,852, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1293
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1294
0x80000000|1, // match move
0x80000000|1618, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1295
26,MIN_REDUCTION+66, // `[
66,85, // <empty bracket pair>*
102,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1296
2,936, // ws*
26,MIN_REDUCTION+167, // `[
102,MIN_REDUCTION+167, // "["
106,1158, // " "
123,1720, // {10}
132,288, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1297
0x80000000|1, // match move
0x80000000|1435, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1298
0x80000000|1371, // match move
0x80000000|1303, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1299
0x80000000|1, // match move
0x80000000|1418, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1300
0x80000000|1, // match move
0x80000000|1599, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1301
7,774, // ID
25,1573, // <empty bracket pair>
26,47, // `[
75,738, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,152, // letter128
94,646, // {199..218 231..250}
95,646, // {193..198 225..230}
102,685, // "["
  }
,
{ // state 1302
49,1092, // `<
51,417, // `>
52,1001, // `instanceof
53,397, // `<=
54,1234, // `>=
104,1366, // "<"
107,62, // "#"
114,1526, // ">"
122,846, // "@"
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 1303
26,MIN_REDUCTION+79, // `[
102,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1304
0x80000000|771, // match move
0x80000000|337, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1305
26,MIN_REDUCTION+66, // `[
66,159, // <empty bracket pair>*
102,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1306
0x80000000|1, // match move
0x80000000|1518, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1307
7,1076, // ID
8,920, // `{
10,148, // `}
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1403, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,467, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 1308
26,MIN_REDUCTION+64, // `[
102,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1309
81,543, // "i"
86,173, // "b"
  }
,
{ // state 1310
0x80000000|1522, // match move
0x80000000|1255, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1311
0x80000000|1550, // match move
0x80000000|167, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1312
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1313
76,1093, // "a"
77,1093, // "p"
78,1093, // "v"
79,1093, // "c"
80,1093, // "f"
81,1093, // "i"
82,1093, // "l"
83,1093, // "o"
84,1093, // "r"
85,1093, // "u"
86,1093, // "b"
87,1093, // "e"
88,1093, // "h"
89,1093, // "n"
90,1093, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,1093, // "t"
92,1093, // "w"
94,812, // {199..218 231..250}
95,812, // {193..198 225..230}
97,1093, // {"1".."9"}
98,1093, // "0"
100,812, // {176..185}
101,1549, // any
102,1093, // "["
103,1093, // "-"
104,1093, // "<"
105,1093, // "|"
106,1093, // " "
107,1093, // "#"
108,1093, // "&"
109,1093, // ")"
110,1093, // "]"
111,1093, // "/"
112,1093, // ";"
113,1093, // {0..9 11..31 "$" "," ":" "?" "\" "^" "`" "~"..127}
114,1093, // ">"
115,1093, // "{"
116,1093, // "%"
117,1093, // "("
118,1093, // "+"
119,1093, // "."
120,1093, // "_"
121,1093, // "="
122,1093, // "@"
123,1093, // {10}
124,1093, // "}"
125,1093, // "!"
126,1093, // "'"
127,1093, // '"'
128,1093, // "*"
129,1638, // any128
130,812, // {223}
131,812, // {128..175 186..192 219..222 224 251..255}
139,979, // any*
140,1583, // $$3
  }
,
{ // state 1314
26,MIN_REDUCTION+106, // `[
102,MIN_REDUCTION+106, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1315
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,1421, // " "
123,276, // {10}
132,848, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1316
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1317
106,455, // " "
123,352, // {10}
132,1537, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1318
0x80000000|177, // match move
0x80000000|501, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1319
26,MIN_REDUCTION+64, // `[
102,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1320
2,164, // ws*
106,899, // " "
123,143, // {10}
132,1070, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 1321
106,816, // " "
123,1040, // {10}
132,919, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1322
0x80000000|857, // match move
0x80000000|1420, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1323
0x80000000|1, // match move
0x80000000|1395, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1324
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1325
106,1514, // " "
123,967, // {10}
132,988, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 1326
58,1284, // `*
60,229, // `/
61,20, // `%
111,760, // "/"
116,1387, // "%"
128,34, // "*"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1327
0x80000000|1371, // match move
0x80000000|1329, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1328
76,657, // "a"
77,657, // "p"
78,657, // "v"
79,657, // "c"
80,657, // "f"
81,657, // "i"
82,657, // "l"
83,657, // "o"
84,657, // "r"
85,657, // "u"
86,657, // "b"
87,657, // "e"
88,657, // "h"
89,657, // "n"
90,657, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,657, // "t"
92,657, // "w"
95,10, // {193..198 225..230}
97,657, // {"1".."9"}
98,657, // "0"
100,10, // {176..185}
137,1385, // hexDigit*
138,888, // $$2
143,37, // hexDigit
144,394, // hexDigit128
  }
,
{ // state 1329
26,MIN_REDUCTION+79, // `[
102,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1330
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1331
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1332
0x80000000|1, // match move
0x80000000|1653, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1333
106,1149, // " "
123,478, // {10}
132,1293, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1334
17,1569, // `)
109,648, // ")"
  }
,
{ // state 1335
26,MIN_REDUCTION+66, // `[
66,170, // <empty bracket pair>*
102,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1336
0x80000000|1, // match move
0x80000000|1389, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1337
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1338
26,MIN_REDUCTION+64, // `[
102,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1339
2,929, // ws*
26,MIN_REDUCTION+214, // `[
102,MIN_REDUCTION+214, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1340
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1341
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1342
0x80000000|900, // match move
0x80000000|299, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1343
0x80000000|1064, // match move
0x80000000|1557, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1344
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1345
7,1000, // ID
16,367, // `(
21,230, // <exp>
32,446, // <exp1>
41,1362, // <exp8>
43,1697, // <exp7>
45,767, // <exp6>
47,1302, // <exp5>
50,870, // <exp4>
55,1439, // `+
56,479, // <exp3>
57,896, // `-
59,346, // <exp2>
62,495, // `!
63,583, // <cast exp>
64,293, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
117,331, // "("
118,403, // "+"
122,1203, // "@"
125,1578, // "!"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 1346
0x80000000|292, // match move
0x80000000|1389, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1347
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1348
0x80000000|151, // match move
0x80000000|578, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1349
0x80000000|1394, // match move
0x80000000|1118, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1350
26,MIN_REDUCTION+67, // `[
102,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1351
0x80000000|1, // match move
0x80000000|548, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1352
0x80000000|1, // match move
0x80000000|1659, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1353
26,MIN_REDUCTION+205, // `[
102,MIN_REDUCTION+205, // "["
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1354
2,1509, // ws*
  }
,
{ // state 1355
2,943, // ws*
26,MIN_REDUCTION+181, // `[
102,MIN_REDUCTION+181, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1356
0x80000000|1, // match move
0x80000000|675, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1357
26,831, // `[
74,1603, // `.
102,1712, // "["
119,898, // "."
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1358
26,MIN_REDUCTION+67, // `[
102,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1359
106,908, // " "
123,1014, // {10}
132,608, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1360
26,MIN_REDUCTION+63, // `[
33,MIN_REDUCTION+63, // `=
34,1279, // `++
35,1191, // `--
74,MIN_REDUCTION+63, // `.
102,MIN_REDUCTION+63, // "["
119,MIN_REDUCTION+63, // "."
121,MIN_REDUCTION+63, // "="
122,1072, // "@"
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1361
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1362
42,984, // `||
122,163, // "@"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1363
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1364
0x80000000|149, // match move
0x80000000|534, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1365
0x80000000|1705, // match move
0x80000000|158, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1366
2,1654, // ws*
106,94, // " "
123,777, // {10}
132,621, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 1367
26,824, // `[
74,1572, // `.
102,1712, // "["
119,898, // "."
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1368
81,65, // "i"
86,1274, // "b"
  }
,
{ // state 1369
2,1132, // ws*
26,MIN_REDUCTION+145, // `[
102,MIN_REDUCTION+145, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1370
26,MIN_REDUCTION+205, // `[
102,MIN_REDUCTION+205, // "["
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1371
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1372
26,MIN_REDUCTION+209, // `[
102,MIN_REDUCTION+209, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1373
0x80000000|292, // match move
0x80000000|1418, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1374
7,1076, // ID
8,532, // `{
19,1301, // <type>
22,196, // `;
23,841, // `int
24,1611, // `boolean
28,386, // <stmt>
29,1229, // <assign>
30,1750, // `break
31,1010, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,194, // `while
39,341, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,1733, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 1375
49,1082, // `<
51,407, // `>
52,996, // `instanceof
53,404, // `<=
54,1212, // `>=
104,1366, // "<"
107,62, // "#"
114,1526, // ">"
122,846, // "@"
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1376
0x80000000|73, // match move
0x80000000|804, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1377
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1378
76,657, // "a"
77,657, // "p"
78,657, // "v"
79,657, // "c"
80,657, // "f"
81,657, // "i"
82,657, // "l"
83,657, // "o"
84,657, // "r"
85,657, // "u"
86,657, // "b"
87,657, // "e"
88,657, // "h"
89,657, // "n"
90,657, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,657, // "t"
92,657, // "w"
95,53, // {193..198 225..230}
97,657, // {"1".."9"}
98,657, // "0"
100,53, // {176..185}
138,49, // $$2
143,469, // hexDigit
144,1343, // hexDigit128
  }
,
{ // state 1379
42,972, // `||
122,163, // "@"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1380
0x80000000|292, // match move
0x80000000|1395, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1381
26,MIN_REDUCTION+205, // `[
102,MIN_REDUCTION+205, // "["
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1382
83,1658, // "o"
84,72, // "r"
  }
,
{ // state 1383
0x80000000|1268, // match move
0x80000000|1729, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1384
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1385
76,657, // "a"
77,657, // "p"
78,657, // "v"
79,657, // "c"
80,657, // "f"
81,657, // "i"
82,657, // "l"
83,657, // "o"
84,657, // "r"
85,657, // "u"
86,657, // "b"
87,657, // "e"
88,657, // "h"
89,657, // "n"
90,657, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,657, // "t"
92,657, // "w"
95,10, // {193..198 225..230}
97,657, // {"1".."9"}
98,657, // "0"
100,10, // {176..185}
138,839, // $$2
143,469, // hexDigit
144,394, // hexDigit128
  }
,
{ // state 1386
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1387
2,671, // ws*
106,119, // " "
123,859, // {10}
132,598, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1388
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1389
26,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1390
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 1391
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1392
26,MIN_REDUCTION+169, // `[
102,MIN_REDUCTION+169, // "["
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1393
26,MIN_REDUCTION+209, // `[
102,MIN_REDUCTION+209, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1394
2,1098, // ws*
  }
,
{ // state 1395
26,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1396
76,657, // "a"
77,657, // "p"
78,657, // "v"
79,657, // "c"
80,657, // "f"
81,657, // "i"
82,657, // "l"
83,657, // "o"
84,657, // "r"
85,657, // "u"
86,657, // "b"
87,657, // "e"
88,657, // "h"
89,657, // "n"
90,657, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,657, // "t"
92,657, // "w"
95,16, // {193..198 225..230}
97,657, // {"1".."9"}
98,657, // "0"
100,16, // {176..185}
138,822, // $$2
143,469, // hexDigit
144,413, // hexDigit128
  }
,
{ // state 1397
55,111, // `+
57,876, // `-
103,226, // "-"
118,93, // "+"
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 1398
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1399
26,MIN_REDUCTION+69, // `[
102,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1400
76,657, // "a"
77,657, // "p"
78,657, // "v"
79,657, // "c"
80,657, // "f"
81,657, // "i"
82,657, // "l"
83,657, // "o"
84,657, // "r"
85,657, // "u"
86,657, // "b"
87,657, // "e"
88,657, // "h"
89,657, // "n"
90,657, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,657, // "t"
92,657, // "w"
95,460, // {193..198 225..230}
97,657, // {"1".."9"}
98,657, // "0"
100,460, // {176..185}
137,42, // hexDigit*
138,957, // $$2
143,37, // hexDigit
144,629, // hexDigit128
  }
,
{ // state 1401
26,MIN_REDUCTION+67, // `[
102,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1402
2,405, // ws*
106,455, // " "
123,352, // {10}
132,1436, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1403
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 1404
26,MIN_REDUCTION+170, // `[
102,MIN_REDUCTION+170, // "["
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1405
2,1178, // ws*
  }
,
{ // state 1406
17,1016, // `)
109,648, // ")"
  }
,
{ // state 1407
26,MIN_REDUCTION+170, // `[
102,MIN_REDUCTION+170, // "["
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1408
146,MIN_REDUCTION+83, // $NT
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1409
0x80000000|1268, // match move
0x80000000|1706, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1410
2,1138, // ws*
  }
,
{ // state 1411
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1412
26,MIN_REDUCTION+69, // `[
102,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1413
0x80000000|1, // match move
0x80000000|821, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1414
96,1556, // digit
97,681, // {"1".."9"}
98,681, // "0"
99,391, // digit128
100,1298, // {176..185}
136,423, // $$1
  }
,
{ // state 1415
2,960, // ws*
106,816, // " "
123,1040, // {10}
132,1707, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 1416
26,MIN_REDUCTION+211, // `[
102,MIN_REDUCTION+211, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 1417
2,1512, // ws*
26,MIN_REDUCTION+103, // `[
102,MIN_REDUCTION+103, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1418
26,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1419
26,MIN_REDUCTION+209, // `[
102,MIN_REDUCTION+209, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1420
26,MIN_REDUCTION+209, // `[
102,MIN_REDUCTION+209, // "["
106,264, // " "
123,123, // {10}
132,488, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1421
0x80000000|1268, // match move
0x80000000|1709, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1422
0x80000000|1, // match move
0x80000000|1126, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1423
0x80000000|1, // match move
0x80000000|838, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1424
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 1425
26,MIN_REDUCTION+170, // `[
102,MIN_REDUCTION+170, // "["
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1426
7,1076, // ID
8,734, // `{
19,1301, // <type>
22,269, // `;
23,841, // `int
24,1611, // `boolean
28,813, // <stmt>
29,1167, // <assign>
30,80, // `break
31,535, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,174, // `while
39,718, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,335, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 1427
26,MIN_REDUCTION+69, // `[
102,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1428
0x80000000|693, // match move
0x80000000|1022, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1429
49,1092, // `<
51,417, // `>
52,1001, // `instanceof
53,397, // `<=
54,1234, // `>=
104,1366, // "<"
107,62, // "#"
114,1526, // ">"
122,846, // "@"
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 1430
26,MIN_REDUCTION+170, // `[
102,MIN_REDUCTION+170, // "["
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 1431
0x80000000|323, // match move
0x80000000|664, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1432
0x80000000|118, // match move
0x80000000|1689, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1433
7,1008, // ID
16,304, // `(
32,932, // <exp1>
63,976, // <cast exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
107,991, // "#"
117,331, // "("
122,1174, // "@"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 1434
26,MIN_REDUCTION+102, // `[
102,MIN_REDUCTION+102, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1435
26,MIN_REDUCTION+106, // `[
102,MIN_REDUCTION+106, // "["
106,949, // " "
123,487, // {10}
132,1352, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1436
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1437
26,MIN_REDUCTION+73, // `[
102,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1438
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1439
7,1000, // ID
32,446, // <exp1>
55,1439, // `+
57,896, // `-
64,623, // <unary exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
103,431, // "-"
107,861, // "#"
118,403, // "+"
122,1203, // "@"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 1440
96,1556, // digit
97,681, // {"1".."9"}
98,681, // "0"
99,1349, // digit128
100,1327, // {176..185}
136,349, // $$1
  }
,
{ // state 1441
81,147, // "i"
86,1226, // "b"
  }
,
{ // state 1442
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1443
7,990, // ID
32,468, // <exp1>
55,1443, // `+
57,905, // `-
64,620, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
118,403, // "+"
122,1109, // "@"
126,756, // "'"
127,1313, // '"'
  }
};
}
private class Initter5{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1444
0x80000000|1702, // match move
0x80000000|322, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1445
106,1160, // " "
123,474, // {10}
132,1264, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1446
0x80000000|6, // match move
0x80000000|1524, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1447
26,MIN_REDUCTION+208, // `[
102,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1448
106,94, // " "
123,777, // {10}
132,1570, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 1449
96,1556, // digit
97,681, // {"1".."9"}
98,681, // "0"
99,399, // digit128
100,1278, // {176..185}
136,334, // $$1
  }
,
{ // state 1450
0x80000000|1, // match move
0x80000000|357, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1451
7,1000, // ID
16,367, // `(
32,937, // <exp1>
63,868, // <cast exp>
65,485, // `new
67,602, // INTLIT
68,267, // CHARLIT
69,909, // STRINGLIT
70,1282, // `true
71,1580, // `false
72,1049, // `this
73,477, // `null
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
97,201, // {"1".."9"}
98,1328, // "0"
99,376, // digit128
100,1278, // {176..185}
107,861, // "#"
117,331, // "("
122,1203, // "@"
126,808, // "'"
127,1286, // '"'
  }
,
{ // state 1452
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1453
26,MIN_REDUCTION+83, // `[
102,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1454
0x80000000|1, // match move
0x80000000|1135, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1455
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1456
17,1374, // `)
109,648, // ")"
  }
,
{ // state 1457
106,761, // " "
123,644, // {10}
132,1481, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 1458
0x80000000|1652, // match move
0x80000000|223, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1459
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1460
22,1560, // `;
112,679, // ";"
  }
,
{ // state 1461
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1462
106,729, // " "
123,410, // {10}
132,228, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1463
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1464
7,243, // ID
25,1573, // <empty bracket pair>
26,47, // `[
75,743, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,126, // letter128
94,653, // {199..218 231..250}
95,653, // {193..198 225..230}
102,685, // "["
  }
,
{ // state 1465
7,1008, // ID
32,1306, // <exp1>
55,1465, // `+
57,879, // `-
64,611, // <unary exp>
65,433, // `new
67,1143, // INTLIT
68,256, // CHARLIT
69,1065, // STRINGLIT
70,1332, // `true
71,1631, // `false
72,1085, // `this
73,435, // `null
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
97,59, // {"1".."9"}
98,1291, // "0"
99,398, // digit128
100,1327, // {176..185}
103,431, // "-"
107,991, // "#"
118,403, // "+"
122,1174, // "@"
126,84, // "'"
127,1254, // '"'
  }
,
{ // state 1466
106,747, // " "
123,69, // {10}
132,1551, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1467
2,843, // ws*
106,1514, // " "
123,967, // {10}
132,570, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1468
22,954, // `;
112,679, // ";"
  }
,
{ // state 1469
0x80000000|1668, // match move
0x80000000|303, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1470
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1471
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1472
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 1473
7,990, // ID
16,361, // `(
32,973, // <exp1>
63,892, // <cast exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
107,801, // "#"
117,331, // "("
122,1109, // "@"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 1474
106,1131, // " "
123,447, // {10}
132,1227, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 1475
8,517, // `{
115,641, // "{"
  }
,
{ // state 1476
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1477
2,1587, // ws*
  }
,
{ // state 1478
2,1685, // ws*
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1479
7,1588, // ID
75,863, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1219, // letter128
94,963, // {199..218 231..250}
95,963, // {193..198 225..230}
  }
,
{ // state 1480
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1481
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1482
26,MIN_REDUCTION+171, // `[
102,MIN_REDUCTION+171, // "["
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 1483
0x80000000|1623, // match move
0x80000000|902, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1484
0x80000000|1636, // match move
0x80000000|199, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1485
81,114, // "i"
86,1261, // "b"
  }
,
{ // state 1486
7,990, // ID
16,361, // `(
21,1250, // <exp>
32,468, // <exp1>
41,1521, // <exp8>
43,1701, // <exp7>
45,740, // <exp6>
47,1125, // <exp5>
50,975, // <exp4>
55,1443, // `+
56,461, // <exp3>
57,905, // `-
59,339, // <exp2>
62,510, // `!
63,592, // <cast exp>
64,290, // <unary exp>
65,503, // `new
67,599, // INTLIT
68,261, // CHARLIT
69,931, // STRINGLIT
70,1294, // `true
71,1606, // `false
72,1057, // `this
73,456, // `null
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
97,185, // {"1".."9"}
98,1099, // "0"
99,389, // digit128
100,1298, // {176..185}
103,431, // "-"
107,801, // "#"
117,331, // "("
118,403, // "+"
122,1109, // "@"
125,1578, // "!"
126,756, // "'"
127,1313, // '"'
  }
,
{ // state 1487
2,315, // ws*
  }
,
{ // state 1488
26,MIN_REDUCTION+166, // `[
102,MIN_REDUCTION+166, // "["
106,1158, // " "
123,1720, // {10}
132,781, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1489
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1490
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,886, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,483, // digit128
100,1278, // {176..185}
120,787, // "_"
130,320, // {223}
133,1630, // idChar*
134,1251, // $$0
141,24, // idChar
142,1675, // idChar128
  }
,
{ // state 1491
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1492
7,1076, // ID
8,920, // `{
10,542, // `}
19,1301, // <type>
22,1179, // `;
23,841, // `int
24,1611, // `boolean
28,1403, // <stmt>
29,589, // <assign>
30,865, // `break
31,1133, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,29, // `while
39,560, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,895, // ";"
115,641, // "{"
122,1055, // "@"
124,254, // "}"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 1493
26,MIN_REDUCTION+166, // `[
102,MIN_REDUCTION+166, // "["
106,264, // " "
123,123, // {10}
132,488, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1494
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,912, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,523, // digit128
100,1298, // {176..185}
120,787, // "_"
130,318, // {223}
133,1617, // idChar*
134,1239, // $$0
141,24, // idChar
142,1666, // idChar128
  }
,
{ // state 1495
26,MIN_REDUCTION+180, // `[
102,MIN_REDUCTION+180, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1496
0x80000000|1505, // match move
0x80000000|903, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1497
2,1272, // ws*
106,1105, // " "
123,441, // {10}
132,106, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1498
2,1667, // ws*
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1499
26,MIN_REDUCTION+83, // `[
102,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1500
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1501
2,596, // ws*
106,364, // " "
123,1154, // {10}
132,1554, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1502
26,MIN_REDUCTION+189, // `[
102,MIN_REDUCTION+189, // "["
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 1503
106,1134, // " "
123,462, // {10}
132,1244, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1504
2,1597, // ws*
  }
,
{ // state 1505
2,287, // ws*
  }
,
{ // state 1506
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1507
26,MIN_REDUCTION+83, // `[
102,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1508
26,MIN_REDUCTION+171, // `[
102,MIN_REDUCTION+171, // "["
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 1509
0x80000000|1, // match move
0x80000000|60, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1510
146,MIN_REDUCTION+82, // $NT
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1511
26,MIN_REDUCTION+180, // `[
102,MIN_REDUCTION+180, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1512
0x80000000|1, // match move
0x80000000|242, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1513
7,1076, // ID
8,532, // `{
19,1301, // <type>
22,196, // `;
23,841, // `int
24,1611, // `boolean
28,311, // <stmt>
29,1229, // <assign>
30,1750, // `break
31,1010, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,194, // `while
39,341, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,1733, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 1514
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1515
2,1059, // ws*
  }
,
{ // state 1516
26,MIN_REDUCTION+80, // `[
102,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1517
0x80000000|134, // match move
0x80000000|720, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1518
26,858, // `[
74,1626, // `.
102,1712, // "["
119,898, // "."
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1519
26,MIN_REDUCTION+102, // `[
102,MIN_REDUCTION+102, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1520
2,533, // ws*
106,327, // " "
123,1186, // {10}
132,1592, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1521
42,875, // `||
122,163, // "@"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 1522
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 1523
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,872, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,494, // digit128
100,1327, // {176..185}
120,787, // "_"
130,232, // {223}
133,1581, // idChar*
134,1273, // $$0
141,24, // idChar
142,1748, // idChar128
  }
,
{ // state 1524
2,1137, // ws*
106,506, // " "
123,1004, // {10}
132,1432, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1525
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1526
0x80000000|1, // match move
0x80000000|607, // no-match move
// T-test match for "=":
121,
  }
,
{ // state 1527
0x80000000|1487, // match move
0x80000000|867, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1528
2,1753, // ws*
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1529
2,715, // ws*
106,747, // " "
123,69, // {10}
132,1337, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1530
26,MIN_REDUCTION+73, // `[
102,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1531
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1532
26,MIN_REDUCTION+171, // `[
102,MIN_REDUCTION+171, // "["
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 1533
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1534
26,MIN_REDUCTION+102, // `[
102,MIN_REDUCTION+102, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 1535
2,411, // ws*
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1536
2,576, // ws*
106,368, // " "
123,1180, // {10}
132,1602, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1537
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1538
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1539
0x80000000|1, // match move
0x80000000|1392, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1540
26,MIN_REDUCTION+73, // `[
102,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1541
0x80000000|1625, // match move
0x80000000|189, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1542
26,MIN_REDUCTION+75, // `[
102,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 1543
0x80000000|1, // match move
0x80000000|795, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1544
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1545
26,MIN_REDUCTION+168, // `[
102,MIN_REDUCTION+168, // "["
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1546
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1547
2,640, // ws*
106,364, // " "
123,1154, // {10}
132,1554, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1548
80,572, // "f"
81,1163, // "i"
84,1206, // "r"
86,1382, // "b"
87,809, // "e"
89,986, // "n"
91,1655, // "t"
92,475, // "w"
118,1497, // "+"
  }
,
{ // state 1549
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 1550
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 1551
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1552
2,496, // ws*
106,1703, // " "
123,965, // {10}
132,278, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1553
0x80000000|1, // match move
0x80000000|154, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1554
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1555
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1556
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 1557
2,1127, // ws*
26,MIN_REDUCTION+214, // `[
102,MIN_REDUCTION+214, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1558
0x80000000|1550, // match move
0x80000000|219, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1559
0x80000000|1, // match move
0x80000000|188, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1560
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1561
26,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1562
26,MIN_REDUCTION+208, // `[
102,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1563
80,572, // "f"
81,1163, // "i"
86,1382, // "b"
87,809, // "e"
89,986, // "n"
91,1655, // "t"
92,475, // "w"
118,1497, // "+"
  }
,
{ // state 1564
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 1565
0x80000000|1504, // match move
0x80000000|1594, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1566
26,MIN_REDUCTION+208, // `[
102,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1567
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1568
106,1131, // " "
123,447, // {10}
132,1227, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1569
7,1076, // ID
8,532, // `{
19,1301, // <type>
22,196, // `;
23,841, // `int
24,1611, // `boolean
28,1044, // <stmt>
29,1229, // <assign>
30,1750, // `break
31,1010, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,194, // `while
39,341, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,1733, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 1570
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1571
2,731, // ws*
106,368, // " "
123,1180, // {10}
132,1602, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1572
7,757, // ID
75,1490, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1348, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
  }
,
{ // state 1573
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1574
106,747, // " "
123,69, // {10}
132,1551, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1575
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 1576
2,873, // ws*
106,364, // " "
123,1154, // {10}
132,1554, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1577
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,658, // letter128
94,626, // {199..218 231..250}
95,626, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,782, // digit128
100,1480, // {176..185}
120,787, // "_"
130,524, // {223}
133,1043, // idChar*
134,381, // $$0
141,24, // idChar
142,1696, // idChar128
  }
,
{ // state 1578
2,459, // ws*
106,82, // " "
123,826, // {10}
132,587, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 1579
0x80000000|1, // match move
0x80000000|145, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1580
0x80000000|1, // match move
0x80000000|98, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1581
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,872, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,494, // digit128
100,1327, // {176..185}
120,787, // "_"
130,232, // {223}
134,1260, // $$0
141,820, // idChar
142,1748, // idChar128
  }
,
{ // state 1582
26,MIN_REDUCTION+208, // `[
102,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1583
0x80000000|1, // match move
0x80000000|90, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1584
106,1347, // " "
123,1199, // {10}
132,1223, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1585
2,1587, // ws*
26,MIN_REDUCTION+216, // `[
102,MIN_REDUCTION+216, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1586
106,1510, // " "
123,1408, // {10}
132,307, // ws
146,MIN_REDUCTION+144, // $NT
  }
,
{ // state 1587
0x80000000|1, // match move
0x80000000|1670, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1588
0x80000000|1, // match move
0x80000000|330, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1589
26,MIN_REDUCTION+66, // `[
66,471, // <empty bracket pair>*
102,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1590
2,714, // ws*
106,327, // " "
123,1186, // {10}
132,1592, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1591
2,1170, // ws*
106,1160, // " "
123,474, // {10}
132,76, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1592
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1593
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1594
2,1597, // ws*
26,MIN_REDUCTION+216, // `[
102,MIN_REDUCTION+216, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1595
26,MIN_REDUCTION+185, // `[
102,MIN_REDUCTION+185, // "["
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1596
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1597
0x80000000|1, // match move
0x80000000|1704, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1598
26,MIN_REDUCTION+180, // `[
102,MIN_REDUCTION+180, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 1599
26,MIN_REDUCTION+168, // `[
102,MIN_REDUCTION+168, // "["
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1600
0x80000000|491, // match move
0x80000000|344, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1601
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 1602
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1603
7,779, // ID
75,1494, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1364, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
  }
,
{ // state 1604
26,MIN_REDUCTION+168, // `[
102,MIN_REDUCTION+168, // "["
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 1605
0x80000000|1515, // match move
0x80000000|1715, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1606
0x80000000|1, // match move
0x80000000|103, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1607
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1608
26,MIN_REDUCTION+70, // `[
102,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1609
106,1324, // " "
123,22, // {10}
132,274, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1610
2,1177, // ws*
26,MIN_REDUCTION+214, // `[
102,MIN_REDUCTION+214, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1611
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1612
2,1129, // ws*
106,1105, // " "
123,441, // {10}
132,106, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1613
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1614
2,983, // ws*
106,368, // " "
123,1180, // {10}
132,1602, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1615
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 1616
26,MIN_REDUCTION+215, // `[
102,MIN_REDUCTION+215, // "["
106,1068, // " "
123,1002, // {10}
132,1299, // ws
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1617
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,912, // letter128
94,1710, // {199..218 231..250}
95,1710, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,523, // digit128
100,1298, // {176..185}
120,787, // "_"
130,318, // {223}
134,1288, // $$0
141,820, // idChar
142,1666, // idChar128
  }
,
{ // state 1618
26,MIN_REDUCTION+70, // `[
102,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1619
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1620
44,1262, // `&&
122,157, // "@"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1621
0x80000000|1663, // match move
0x80000000|161, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1622
2,1450, // ws*
26,MIN_REDUCTION+173, // `[
102,MIN_REDUCTION+173, // "["
106,949, // " "
123,487, // {10}
132,390, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1623
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 1624
0x80000000|1, // match move
0x80000000|67, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1625
2,1028, // ws*
  }
,
{ // state 1626
7,805, // ID
75,1523, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,1517, // letter128
94,1739, // {199..218 231..250}
95,1739, // {193..198 225..230}
  }
,
{ // state 1627
0x80000000|1, // match move
0x80000000|87, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1628
2,907, // ws*
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1629
0x80000000|1213, // match move
0x80000000|1217, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1630
75,415, // letter
76,925, // "a"
77,925, // "p"
78,925, // "v"
79,925, // "c"
80,925, // "f"
81,925, // "i"
82,925, // "l"
83,925, // "o"
84,925, // "r"
85,925, // "u"
86,925, // "b"
87,925, // "e"
88,925, // "h"
89,925, // "n"
90,925, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,925, // "t"
92,925, // "w"
93,886, // letter128
94,1722, // {199..218 231..250}
95,1722, // {193..198 225..230}
96,1061, // digit
97,179, // {"1".."9"}
98,179, // "0"
99,483, // digit128
100,1278, // {176..185}
120,787, // "_"
130,320, // {223}
134,1300, // $$0
141,820, // idChar
142,1675, // idChar128
  }
,
{ // state 1631
0x80000000|1, // match move
0x80000000|88, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1632
16,MIN_REDUCTION+209, // `(
106,1158, // " "
117,MIN_REDUCTION+209, // "("
123,1720, // {10}
132,781, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 1633
2,347, // ws*
106,455, // " "
123,352, // {10}
132,1436, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 1634
2,953, // ws*
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1635
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1636
2,1026, // ws*
  }
,
{ // state 1637
26,MIN_REDUCTION+71, // `[
102,MIN_REDUCTION+71, // "["
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1638
0x80000000|1477, // match move
0x80000000|1585, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1639
0x80000000|1, // match move
0x80000000|71, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1640
106,1102, // " "
123,443, // {10}
132,1222, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 1641
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1642
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 1643
2,1097, // ws*
106,1124, // " "
123,448, // {10}
132,95, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1644
2,981, // ws*
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1645
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1646
2,1110, // ws*
106,1131, // " "
123,447, // {10}
132,102, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1647
2,938, // ws*
106,327, // " "
123,1186, // {10}
132,1592, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1648
2,1157, // ws*
26,MIN_REDUCTION+214, // `[
102,MIN_REDUCTION+214, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1649
26,MIN_REDUCTION+75, // `[
102,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 1650
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 1651
2,1512, // ws*
  }
,
{ // state 1652
2,1053, // ws*
  }
,
{ // state 1653
26,MIN_REDUCTION+70, // `[
102,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1654
106,94, // " "
123,777, // {10}
132,1570, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1655
84,507, // "r"
88,1744, // "h"
  }
,
{ // state 1656
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1657
26,MIN_REDUCTION+75, // `[
102,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 1658
2,1317, // ws*
106,455, // " "
123,352, // {10}
132,1436, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 1659
26,MIN_REDUCTION+207, // `[
102,MIN_REDUCTION+207, // "["
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1660
26,708, // `[
102,1712, // "["
  }
,
{ // state 1661
2,1753, // ws*
26,MIN_REDUCTION+145, // `[
102,MIN_REDUCTION+145, // "["
106,674, // " "
123,379, // {10}
132,1693, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1662
83,904, // "o"
  }
,
{ // state 1663
2,470, // ws*
  }
,
{ // state 1664
26,MIN_REDUCTION+144, // `[
102,MIN_REDUCTION+144, // "["
106,1745, // " "
123,2, // {10}
132,1215, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 1665
26,MIN_REDUCTION+175, // `[
102,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1666
0x80000000|1751, // match move
0x80000000|380, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1667
0x80000000|950, // match move
0x80000000|952, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1668
2,430, // ws*
  }
,
{ // state 1669
2,1175, // ws*
  }
,
{ // state 1670
26,MIN_REDUCTION+215, // `[
102,MIN_REDUCTION+215, // "["
106,1017, // " "
123,1003, // {10}
132,1336, // ws
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1671
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1672
106,1361, // " "
123,1240, // {10}
132,1388, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1673
2,985, // ws*
  }
,
{ // state 1674
2,1738, // ws*
  }
,
{ // state 1675
0x80000000|1735, // match move
0x80000000|422, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1676
26,MIN_REDUCTION+175, // `[
102,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1677
0x80000000|118, // match move
0x80000000|838, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1678
82,43, // "l"
  }
,
{ // state 1679
26,MIN_REDUCTION+80, // `[
102,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1680
2,302, // ws*
106,1671, // " "
123,1009, // {10}
132,86, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1681
27,1096, // `]
110,780, // "]"
  }
,
{ // state 1682
0x80000000|118, // match move
0x80000000|821, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1683
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1684
105,1171, // "|"
108,502, // "&"
121,770, // "="
125,35, // "!"
  }
,
{ // state 1685
0x80000000|950, // match move
0x80000000|964, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1686
26,MIN_REDUCTION+80, // `[
102,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1687
2,705, // ws*
106,364, // " "
123,1154, // {10}
132,1554, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1688
7,1076, // ID
8,734, // `{
19,1301, // <type>
22,269, // `;
23,841, // `int
24,1611, // `boolean
28,874, // <stmt>
29,1167, // <assign>
30,80, // `break
31,535, // <local var decl>
32,539, // <exp1>
34,1034, // `++
35,1048, // `--
36,174, // `while
39,718, // `if
65,849, // `new
67,1422, // INTLIT
68,604, // CHARLIT
69,207, // STRINGLIT
70,567, // `true
71,301, // `false
72,1559, // `this
73,1579, // `null
75,706, // letter
76,492, // "a"
77,492, // "p"
78,492, // "v"
79,492, // "c"
80,492, // "f"
81,492, // "i"
82,492, // "l"
83,492, // "o"
84,492, // "r"
85,492, // "u"
86,492, // "b"
87,492, // "e"
88,492, // "h"
89,492, // "n"
90,492, // {"A".."Z" "d" "g" "j".."k" "m" "q" "s" "x".."z"}
91,492, // "t"
92,492, // "w"
93,590, // letter128
94,1311, // {199..218 231..250}
95,1311, // {193..198 225..230}
97,550, // {"1".."9"}
98,1400, // "0"
99,1148, // digit128
100,128, // {176..185}
107,540, // "#"
112,335, // ";"
115,641, // "{"
122,1055, // "@"
126,654, // "'"
127,332, // '"'
  }
,
{ // state 1689
26,MIN_REDUCTION+208, // `[
102,MIN_REDUCTION+208, // "["
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1690
0x80000000|530, // match move
0x80000000|1230, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1691
26,737, // `[
102,1712, // "["
  }
,
{ // state 1692
26,MIN_REDUCTION+175, // `[
102,MIN_REDUCTION+175, // "["
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 1693
0x80000000|118, // match move
0x80000000|675, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1694
26,MIN_REDUCTION+174, // `[
102,MIN_REDUCTION+174, // "["
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 1695
26,MIN_REDUCTION+80, // `[
102,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1696
2,1466, // ws*
106,747, // " "
123,69, // {10}
132,1337, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1697
44,1242, // `&&
122,157, // "@"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1698
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 1699
10,1196, // `}
124,1552, // "}"
  }
,
{ // state 1700
2,946, // ws*
106,1641, // " "
123,1575, // {10}
132,1078, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1701
44,1218, // `&&
122,157, // "@"
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1702
2,522, // ws*
  }
,
{ // state 1703
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1704
26,MIN_REDUCTION+215, // `[
102,MIN_REDUCTION+215, // "["
106,1024, // " "
123,1013, // {10}
132,1323, // ws
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1705
2,295, // ws*
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1706
26,MIN_REDUCTION+82, // `[
102,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1707
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 1708
26,MIN_REDUCTION+65, // `[
102,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 1709
26,MIN_REDUCTION+82, // `[
102,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1710
0x80000000|233, // match move
0x80000000|1073, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1711
0x80000000|1, // match move
0x80000000|193, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1712
2,499, // ws*
106,1514, // " "
123,967, // {10}
132,570, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1713
26,MIN_REDUCTION+70, // `[
102,MIN_REDUCTION+70, // "["
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 1714
2,682, // ws*
26,MIN_REDUCTION+177, // `[
102,MIN_REDUCTION+177, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1715
2,1059, // ws*
26,MIN_REDUCTION+216, // `[
102,MIN_REDUCTION+216, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 1716
2,845, // ws*
26,MIN_REDUCTION+105, // `[
102,MIN_REDUCTION+105, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1717
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1718
26,MIN_REDUCTION+178, // `[
102,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1719
2,637, // ws*
26,MIN_REDUCTION+177, // `[
102,MIN_REDUCTION+177, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1720
0x80000000|1544, // match move
0x80000000|930, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1721
0x80000000|1645, // match move
0x80000000|1381, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1722
0x80000000|233, // match move
0x80000000|1094, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1723
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1724
26,MIN_REDUCTION+178, // `[
102,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1725
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 1726
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1727
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1728
2,105, // ws*
106,908, // " "
123,1014, // {10}
132,1656, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1729
26,MIN_REDUCTION+82, // `[
102,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1730
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 1731
0x80000000|1645, // match move
0x80000000|1370, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1732
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1733
2,977, // ws*
106,680, // " "
123,245, // {10}
132,649, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 1734
2,793, // ws*
106,327, // " "
123,1186, // {10}
132,1592, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1735
2,9, // ws*
  }
,
{ // state 1736
2,676, // ws*
26,MIN_REDUCTION+105, // `[
102,MIN_REDUCTION+105, // "["
106,1017, // " "
123,1003, // {10}
132,1423, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1737
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 1738
0x80000000|1, // match move
0x80000000|1419, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1739
0x80000000|233, // match move
0x80000000|1046, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1740
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 1741
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 1742
0x80000000|1645, // match move
0x80000000|1353, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1743
91,1032, // "t"
  }
,
{ // state 1744
0x80000000|1669, // match move
0x80000000|525, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1745
0x80000000|934, // match move
0x80000000|1165, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1746
2,716, // ws*
26,MIN_REDUCTION+177, // `[
102,MIN_REDUCTION+177, // "["
106,1068, // " "
123,1002, // {10}
132,1356, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 1747
26,669, // `[
102,1712, // "["
  }
,
{ // state 1748
0x80000000|1674, // match move
0x80000000|348, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1749
2,818, // ws*
106,368, // " "
123,1180, // {10}
132,1602, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 1750
22,316, // `;
112,1733, // ";"
  }
,
{ // state 1751
2,46, // ws*
  }
,
{ // state 1752
2,819, // ws*
26,MIN_REDUCTION+105, // `[
102,MIN_REDUCTION+105, // "["
106,1024, // " "
123,1013, // {10}
132,1413, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 1753
0x80000000|950, // match move
0x80000000|871, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1754
0x80000000|395, // match move
0x80000000|1595, // no-match move
0x80000000|44, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 1755
16,MIN_REDUCTION+169, // `(
117,MIN_REDUCTION+169, // "("
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1756
MIN_REDUCTION+186, // (default reduction)
  }
,
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
// <decl in class> ::= <inst var decl>
(11<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(12<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(12<<16)+7,
// <method decl> ::= `public <type> ID `( `) `{ <stmt>* `return <exp> `; `}
(12<<16)+11,
// <method decl> ::= `public <type> ID `( `) `{ `return <exp> `; `}
(12<<16)+10,
// <inst var decl> ::= <type> ID `;
(13<<16)+3,
// <type> ::= `int
(19<<16)+1,
// <type> ::= `boolean
(19<<16)+1,
// <type> ::= ID
(19<<16)+1,
// <type> ::= <type> <empty bracket pair>
(19<<16)+2,
// <empty bracket pair> ::= `[ `]
(25<<16)+2,
// <stmt> ::= <assign> `;
(28<<16)+2,
// <stmt> ::= `break `;
(28<<16)+2,
// <stmt> ::= `;
(28<<16)+1,
// <stmt> ::= `{ <stmt>* `}
(28<<16)+3,
// <stmt> ::= `{ `}
(28<<16)+2,
// <stmt> ::= <local var decl> `;
(28<<16)+2,
// <assign> ::= <exp1> `= <exp>
(29<<16)+3,
// <assign> ::= ID `++
(29<<16)+2,
// <assign> ::= ID `--
(29<<16)+2,
// <assign> ::= `++ ID
(29<<16)+2,
// <assign> ::= `-- ID
(29<<16)+2,
// <local var decl> ::= <type> ID `= <exp>
(31<<16)+4,
// <stmt> ::= `while `( <exp> `) <stmt>
(28<<16)+5,
// <else stmt> ::= `else <stmt>
(37<<16)+2,
// <stmt> ::= `if `( <exp> `) <stmt> <else stmt>?
(28<<16)+6,
// <stmt> ::= `if `( <exp> `) <stmt>
(28<<16)+5,
// <exp> ::= <exp8>
(21<<16)+1,
// <exp8> ::= <exp8> `|| <exp7>
(41<<16)+3,
// <exp8> ::= <exp7>
(41<<16)+1,
// <exp7> ::= <exp7> `&& <exp6>
(43<<16)+3,
// <exp7> ::= <exp6>
(43<<16)+1,
// <exp6> ::= <exp6> `== <exp5>
(45<<16)+3,
// <exp6> ::= <exp6> `!= <exp5>
(45<<16)+3,
// <exp6> ::= <exp5>
(45<<16)+1,
// <exp5> ::= <exp5> `< <exp4>
(47<<16)+3,
// <exp5> ::= <exp5> `> <exp4>
(47<<16)+3,
// <exp5> ::= <exp5> `instanceof <type>
(47<<16)+3,
// <exp5> ::= <exp5> `<= <exp4>
(47<<16)+3,
// <exp5> ::= <exp5> `>= <exp4>
(47<<16)+3,
// <exp5> ::= <exp4>
(47<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(50<<16)+3,
// <exp4> ::= <exp4> `- <exp3>
(50<<16)+3,
// <exp4> ::= <exp3>
(50<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(56<<16)+3,
// <exp3> ::= <exp3> `/ <exp2>
(56<<16)+3,
// <exp3> ::= <exp3> `% <exp2>
(56<<16)+3,
// <exp3> ::= <exp2>
(56<<16)+1,
// <exp2> ::= `! <exp1>
(59<<16)+2,
// <exp2> ::= <cast exp>
(59<<16)+1,
// <exp2> ::= <unary exp>
(59<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(63<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(63<<16)+4,
// <unary exp> ::= `- <unary exp>
(64<<16)+2,
// <unary exp> ::= `+ <unary exp>
(64<<16)+2,
// <unary exp> ::= <exp1>
(64<<16)+1,
// <exp1> ::= ID
(32<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(32<<16)+4,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `] <empty bracket pair>*
(32<<16)+6,
// <exp1> ::= `new <type> !<empty bracket pair> `[ <exp> `]
(32<<16)+5,
// <exp1> ::= INTLIT
(32<<16)+1,
// <exp1> ::= CHARLIT
(32<<16)+1,
// <exp1> ::= STRINGLIT
(32<<16)+1,
// <exp1> ::= `true
(32<<16)+1,
// <exp1> ::= `false
(32<<16)+1,
// <exp1> ::= `this
(32<<16)+1,
// <exp1> ::= `null
(32<<16)+1,
// <exp1> ::= <exp1> `. ID
(32<<16)+3,
// <exp1> ::= `new ID `( `)
(32<<16)+4,
// letter ::= {"A".."Z" "a".."z"}
(75<<16)+1,
// letter128 ::= {193..218 225..250}
(93<<16)+1,
// digit ::= {"0".."9"}
(96<<16)+1,
// digit128 ::= {176..185}
(99<<16)+1,
// any ::= {0..127}
(101<<16)+1,
// any128 ::= {128..255}
(129<<16)+1,
// ws ::= " "
(132<<16)+1,
// ws ::= {10}
(132<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(24<<16)+4,
// `boolean ::= "#" "b" "o"
(24<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(15<<16)+4,
// `void ::= "#" "v" "o"
(15<<16)+3,
// `int ::= "#" "i" "t" ws*
(23<<16)+4,
// `int ::= "#" "i" "t"
(23<<16)+3,
// `while ::= "#" "w" "h" ws*
(36<<16)+4,
// `while ::= "#" "w" "h"
(36<<16)+3,
// `if ::= "#" "+" ws*
(39<<16)+3,
// `if ::= "#" "+"
(39<<16)+2,
// `else ::= "#" "e" "l" ws*
(38<<16)+4,
// `else ::= "#" "e" "l"
(38<<16)+3,
// `break ::= "#" "b" "r" ws*
(30<<16)+4,
// `break ::= "#" "b" "r"
(30<<16)+3,
// `this ::= "#" "t" "h" ws*
(72<<16)+4,
// `this ::= "#" "t" "h"
(72<<16)+3,
// `false ::= "#" "f" "a" ws*
(71<<16)+4,
// `false ::= "#" "f" "a"
(71<<16)+3,
// `true ::= "#" "t" "r" ws*
(70<<16)+4,
// `true ::= "#" "t" "r"
(70<<16)+3,
// `null ::= "#" "n" "u" ws*
(73<<16)+4,
// `null ::= "#" "n" "u"
(73<<16)+3,
// `return ::= "#" "r" "e" ws*
(20<<16)+4,
// `return ::= "#" "r" "e"
(20<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(52<<16)+4,
// `instanceof ::= "#" "i" "n"
(52<<16)+3,
// `new ::= "#" "n" "e" ws*
(65<<16)+4,
// `new ::= "#" "n" "e"
(65<<16)+3,
// `public ::= "#" "p" "u" ws*
(14<<16)+4,
// `public ::= "#" "p" "u"
(14<<16)+3,
// `! ::= "!" ws*
(62<<16)+2,
// `! ::= "!"
(62<<16)+1,
// `!= ::= "@" "!" ws*
(48<<16)+3,
// `!= ::= "@" "!"
(48<<16)+2,
// `% ::= "%" ws*
(61<<16)+2,
// `% ::= "%"
(61<<16)+1,
// `&& ::= "@" "&" ws*
(44<<16)+3,
// `&& ::= "@" "&"
(44<<16)+2,
// `* ::= "*" ws*
(58<<16)+2,
// `* ::= "*"
(58<<16)+1,
// `( ::= "(" ws*
(16<<16)+2,
// `( ::= "("
(16<<16)+1,
// `) ::= ")" ws*
(17<<16)+2,
// `) ::= ")"
(17<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(57<<16)+2,
// `- ::= "-"
(57<<16)+1,
// `+ ::= "+" ws*
(55<<16)+2,
// `+ ::= "+"
(55<<16)+1,
// `= ::= "=" ws*
(33<<16)+2,
// `= ::= "="
(33<<16)+1,
// `== ::= "@" "=" ws*
(46<<16)+3,
// `== ::= "@" "="
(46<<16)+2,
// `[ ::= "[" ws*
(26<<16)+2,
// `[ ::= "["
(26<<16)+1,
// `] ::= "]" ws*
(27<<16)+2,
// `] ::= "]"
(27<<16)+1,
// `|| ::= "@" "|" ws*
(42<<16)+3,
// `|| ::= "@" "|"
(42<<16)+2,
// `< ::= "<" ws*
(49<<16)+2,
// `< ::= "<"
(49<<16)+1,
// `<= ::= "@" "<" ws*
(53<<16)+3,
// `<= ::= "@" "<"
(53<<16)+2,
// `> ::= ">" !"=" ws*
(51<<16)+2,
// `> ::= ">" !"="
(51<<16)+1,
// `>= ::= "@" ">" ws*
(54<<16)+3,
// `>= ::= "@" ">"
(54<<16)+2,
// `. ::= "." ws*
(74<<16)+2,
// `. ::= "."
(74<<16)+1,
// `; ::= ";" ws*
(22<<16)+2,
// `; ::= ";"
(22<<16)+1,
// `++ ::= "@" "+" ws*
(34<<16)+3,
// `++ ::= "@" "+"
(34<<16)+2,
// `-- ::= "@" "-" ws*
(35<<16)+3,
// `-- ::= "@" "-"
(35<<16)+2,
// `/ ::= "/" ws*
(60<<16)+2,
// `/ ::= "/"
(60<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(67<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(67<<16)+2,
// INTLIT ::= digit128 ws*
(67<<16)+2,
// INTLIT ::= digit128
(67<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(67<<16)+3,
// INTLIT ::= "0" $$2
(67<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(69<<16)+3,
// STRINGLIT ::= "@" '"'
(69<<16)+2,
// STRINGLIT ::= '"' any* $$3
(69<<16)+3,
// STRINGLIT ::= '"' $$3
(69<<16)+2,
// CHARLIT ::= "'" any ws*
(68<<16)+3,
// CHARLIT ::= "'" any
(68<<16)+2,
// idChar ::= letter
(141<<16)+1,
// idChar ::= digit
(141<<16)+1,
// idChar ::= "_"
(141<<16)+1,
// idChar128 ::= letter128
(142<<16)+1,
// idChar128 ::= digit128
(142<<16)+1,
// idChar128 ::= {223}
(142<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(143<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(144<<16)+1,
// digit* ::= digit* digit
(135<<16)+2,
// digit* ::= digit
(135<<16)+1,
// any* ::= any* any
(139<<16)+2,
// any* ::= any
(139<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(137<<16)+2,
// hexDigit* ::= hexDigit
(137<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(18<<16)+2,
// <stmt>* ::= <stmt>
(18<<16)+1,
// idChar* ::= idChar* idChar
(133<<16)+2,
// idChar* ::= idChar
(133<<16)+1,
// <else stmt>? ::= <else stmt>
(40<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>
(66<<16)+2,
// <empty bracket pair>* ::= <empty bracket pair>
(66<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(134<<16)+2,
// $$0 ::= idChar128
(134<<16)+1,
// $$1 ::= digit128 ws*
(136<<16)+2,
// $$1 ::= digit128
(136<<16)+1,
// $$2 ::= hexDigit128 ws*
(138<<16)+2,
// $$2 ::= hexDigit128
(138<<16)+1,
// $$3 ::= any128 ws*
(140<<16)+2,
// $$3 ::= any128
(140<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
113, // 0
113, // 1
113, // 2
113, // 3
113, // 4
113, // 5
113, // 6
113, // 7
113, // 8
113, // 9
123, // 10
113, // 11
113, // 12
113, // 13
113, // 14
113, // 15
113, // 16
113, // 17
113, // 18
113, // 19
113, // 20
113, // 21
113, // 22
113, // 23
113, // 24
113, // 25
113, // 26
113, // 27
113, // 28
113, // 29
113, // 30
113, // 31
106, // " "
125, // "!"
127, // '"'
107, // "#"
113, // "$"
116, // "%"
108, // "&"
126, // "'"
117, // "("
109, // ")"
128, // "*"
118, // "+"
113, // ","
103, // "-"
119, // "."
111, // "/"
98, // "0"
97, // "1"
97, // "2"
97, // "3"
97, // "4"
97, // "5"
97, // "6"
97, // "7"
97, // "8"
97, // "9"
113, // ":"
112, // ";"
104, // "<"
121, // "="
114, // ">"
113, // "?"
122, // "@"
90, // "A"
90, // "B"
90, // "C"
90, // "D"
90, // "E"
90, // "F"
90, // "G"
90, // "H"
90, // "I"
90, // "J"
90, // "K"
90, // "L"
90, // "M"
90, // "N"
90, // "O"
90, // "P"
90, // "Q"
90, // "R"
90, // "S"
90, // "T"
90, // "U"
90, // "V"
90, // "W"
90, // "X"
90, // "Y"
90, // "Z"
102, // "["
113, // "\"
110, // "]"
113, // "^"
120, // "_"
113, // "`"
76, // "a"
86, // "b"
79, // "c"
90, // "d"
87, // "e"
80, // "f"
90, // "g"
88, // "h"
81, // "i"
90, // "j"
90, // "k"
82, // "l"
90, // "m"
89, // "n"
83, // "o"
77, // "p"
90, // "q"
84, // "r"
90, // "s"
91, // "t"
85, // "u"
78, // "v"
92, // "w"
90, // "x"
90, // "y"
90, // "z"
115, // "{"
105, // "|"
124, // "}"
113, // "~"
113, // 127
131, // 128
131, // 129
131, // 130
131, // 131
131, // 132
131, // 133
131, // 134
131, // 135
131, // 136
131, // 137
131, // 138
131, // 139
131, // 140
131, // 141
131, // 142
131, // 143
131, // 144
131, // 145
131, // 146
131, // 147
131, // 148
131, // 149
131, // 150
131, // 151
131, // 152
131, // 153
131, // 154
131, // 155
131, // 156
131, // 157
131, // 158
131, // 159
131, // 160
131, // 161
131, // 162
131, // 163
131, // 164
131, // 165
131, // 166
131, // 167
131, // 168
131, // 169
131, // 170
131, // 171
131, // 172
131, // 173
131, // 174
131, // 175
100, // 176
100, // 177
100, // 178
100, // 179
100, // 180
100, // 181
100, // 182
100, // 183
100, // 184
100, // 185
131, // 186
131, // 187
131, // 188
131, // 189
131, // 190
131, // 191
131, // 192
95, // 193
95, // 194
95, // 195
95, // 196
95, // 197
95, // 198
94, // 199
94, // 200
94, // 201
94, // 202
94, // 203
94, // 204
94, // 205
94, // 206
94, // 207
94, // 208
94, // 209
94, // 210
94, // 211
94, // 212
94, // 213
94, // 214
94, // 215
94, // 216
94, // 217
94, // 218
131, // 219
131, // 220
131, // 221
131, // 222
130, // 223
131, // 224
95, // 225
95, // 226
95, // 227
95, // 228
95, // 229
95, // 230
94, // 231
94, // 232
94, // 233
94, // 234
94, // 235
94, // 236
94, // 237
94, // 238
94, // 239
94, // 240
94, // 241
94, // 242
94, // 243
94, // 244
94, // 245
94, // 246
94, // 247
94, // 248
94, // 249
94, // 250
131, // 251
131, // 252
131, // 253
131, // 254
131, // 255
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
"", // 161
"", // 162
"", // 163
"", // 164
"", // 165
"", // 166
"", // 167
"", // 168
"", // 169
"", // 170
"", // 171
"", // 172
"", // 173
"", // 174
"", // 175
"", // 176
"", // 177
"", // 178
"", // 179
"", // 180
"", // 181
"", // 182
"", // 183
"", // 184
"", // 185
"", // 186
"", // 187
"", // 188
"", // 189
"digit* ::= digit* digit", // 190
"digit* ::= digit* digit", // 191
"any* ::= any* any", // 192
"any* ::= any* any", // 193
"<decl in class>* ::= <decl in class>* <decl in class>", // 194
"<decl in class>* ::= <decl in class>* <decl in class>", // 195
"hexDigit* ::= hexDigit* hexDigit", // 196
"hexDigit* ::= hexDigit* hexDigit", // 197
"<stmt>* ::= <stmt>* <stmt>", // 198
"<stmt>* ::= <stmt>* <stmt>", // 199
"idChar* ::= idChar* idChar", // 200
"idChar* ::= idChar* idChar", // 201
"<else stmt>? ::= <else stmt>", // 202
"<class decl>+ ::= <class decl>", // 203
"<class decl>+ ::= <class decl>+ <class decl>", // 204
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 205
"<empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair>", // 206
"ws* ::= ws* ws", // 207
"ws* ::= ws* ws", // 208
"", // 209
"", // 210
"", // 211
"", // 212
"", // 213
"", // 214
"", // 215
"", // 216
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 7: <decl in class> ::= <inst var decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 8: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 10: <method decl> ::= `public <type> [#] ID `( `) `{ <stmt>* `return <exp> `; `} @createMethodDeclVoid(Type,int,String,List<Statement>,Exp)=>Decl
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <method decl> ::= `public <type> [#] ID `( `) `{ [<stmt>*] `return <exp> `; `} @createMethodDeclVoid(Type,int,String,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 12: <inst var decl> ::= <type> [#] ID `; @createInstVarDecl(Type,int,String)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 13: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 14: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 15: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 16: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 17: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 18: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 19: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 20: <stmt> ::= `; @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 21: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 23: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 24: <assign> ::= <exp1> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 25: <assign> ::= ID [#] `++ @newPostIncrement(String,int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 26: <assign> ::= ID [#] `-- @newPostDecrement(String,int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 27: <assign> ::= [#] `++ ID @newPreIncrement(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 28: <assign> ::= [#] `-- ID @newPreDecrement(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 29: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 30: <stmt> ::= `while [#] `( <exp> `) <stmt> @newWhile(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 31: <else stmt> ::= `else <stmt> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 32: <stmt> ::= `if [#] `( <exp> `) <stmt> <else stmt>? @newIf(int,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 33: <stmt> ::= `if [#] `( <exp> `) <stmt> [<else stmt>?] @newIf(int,Exp,Statement,Statement)=>Statement
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 34: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp8> ::= <exp8> [#] `|| <exp7> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 36: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <exp7> ::= <exp7> [#] `&& <exp6> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 38: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <exp6> ::= <exp6> [#] `== <exp5> @newEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 40: <exp6> ::= <exp6> [#] `!= <exp5> @newNotEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 41: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <exp5> ::= <exp5> [#] `< <exp4> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 43: <exp5> ::= <exp5> [#] `> <exp4> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 44: <exp5> ::= <exp5> [#] `instanceof <type> @newInstanceOf(Exp,int,Type)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 45: <exp5> ::= <exp5> [#] `<= <exp4> @newLessThanEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 46: <exp5> ::= <exp5> [#] `>= <exp4> @newGreaterThanEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 47: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 48: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 49: <exp4> ::= <exp4> [#] `- <exp3> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 50: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 51: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 52: <exp3> ::= <exp3> [#] `/ <exp2> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 53: <exp3> ::= <exp3> [#] `% <exp2> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 54: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 55: <exp2> ::= [#] `! <exp1> @newNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 56: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 57: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 58: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 59: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 60: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 61: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 62: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 63: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 64: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 65: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] <empty bracket pair>* @newArray(Type,int,Exp,List<Object>)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 66: <exp1> ::= `new <type> !<empty bracket pair> [#] `[ <exp> `] [<empty bracket pair>*] @newArray(Type,int,Exp,List<Object>)=>Exp
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 67: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 68: <exp1> ::= [#] CHARLIT @newCharacterLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 69: <exp1> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 70: <exp1> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 71: <exp1> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 72: <exp1> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 73: <exp1> ::= [#] `null @newNull(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 74: <exp1> ::= <exp1> `. [#] ID @newInstVarAccess(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 75: <exp1> ::= `new [#] ID `( `) @newObject(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 76: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 77: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 78: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 79: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 80: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 81: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 82: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: ws ::= {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 85: `boolean ::= "#" "b" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `class ::= "#" "c" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `void ::= "#" "v" "o" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 91: `int ::= "#" "i" "t" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 92: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 93: `while ::= "#" "w" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 95: `if ::= "#" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 96: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 97: `else ::= "#" "e" "l" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 98: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 99: `break ::= "#" "b" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `this ::= "#" "t" "h" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 102: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 103: `false ::= "#" "f" "a" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 104: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 105: `true ::= "#" "t" "r" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 106: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `null ::= "#" "n" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 109: `return ::= "#" "r" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `instanceof ::= "#" "i" "n" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `new ::= "#" "n" "e" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `public ::= "#" "p" "u" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `! ::= "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 119: `!= ::= "@" "!" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 120: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `% ::= "%" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 123: `&& ::= "@" "&" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 124: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 125: `* ::= "*" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `( ::= "(" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `) ::= ")" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `{ ::= "{" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `} ::= "}" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `- ::= "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `+ ::= "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `= ::= "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 141: `== ::= "@" "=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 142: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `[ ::= "[" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `] ::= "]" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 147: `|| ::= "@" "|" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 148: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `< ::= "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 151: `<= ::= "@" "<" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 152: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `> ::= ">" !"=" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `>= ::= "@" ">" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 155: `>= ::= "@" ">" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 156: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `. ::= "." [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `; ::= ";" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 161: `++ ::= "@" "+" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 162: `-- ::= "@" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 163: `-- ::= "@" "-" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 164: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `/ ::= "/" [ws*] @void
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 167: ID ::= letter128 [ws*] @text
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 168: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 169: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 170: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 171: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 172: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 173: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 174: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 175: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 176: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 177: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 178: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 179: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 180: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 181: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 182: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 183: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 184: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 185: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 186: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 187: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 188: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 189: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 190: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 191: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 192: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 193: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 194: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 195: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 196: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 197: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 198: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 199: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 200: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 201: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 202: <else stmt>? ::= <else stmt> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 203: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 204: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 205: <empty bracket pair>* ::= <empty bracket pair>* <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 206: <empty bracket pair>* ::= [<empty bracket pair>*] <empty bracket pair> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 207: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 208: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
    },
    { // 209: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 210: $$0 ::= idChar128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 211: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 212: $$1 ::= digit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 213: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 214: $$2 ::= hexDigit128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 215: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 216: $$3 ::= any128 [ws*] @pass
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "<else stmt>? ::=", // <else stmt>?
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
    { // <else stmt>?
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((58<<5)|0x5)/*methodCall:58*/,
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
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Decl result = actionObject.createInstVarDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 12: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      String parm0 = (String)si.popPb();
      int parm1 = (Integer)si.popPb();
      Statement result = actionObject.newPostIncrement(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 14: {
      String parm0 = (String)si.popPb();
      int parm1 = (Integer)si.popPb();
      Statement result = actionObject.newPostDecrement(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.newPreIncrement(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.newPreDecrement(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 17: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newWhile(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement result = actionObject.newIf(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Type parm2 = (Type)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThanEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 39: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 40: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      List<Object> parm3 = (List<Object>)si.popPb();
      Exp result = actionObject.newArray(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharacterLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNull(parm0);
      si.pushPb(result);
    }
    break;
    case 48: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newObject(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 50: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 51: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 52: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 53: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 54: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 55: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 56: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 57: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 58: {
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
"Decl createInstVarDecl(Type,int,String)",
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBreak(int)",
"Statement newBlock(int,List<Statement>)",
"Statement assign(Exp,int,Exp)",
"Statement newPostIncrement(String,int)",
"Statement newPostDecrement(String,int)",
"Statement newPreIncrement(int,String)",
"Statement newPreDecrement(int,String)",
"Statement localVarDecl(Type,int,String,Exp)",
"Statement newWhile(int,Exp,Statement)",
"Statement newIf(int,Exp,Statement,Statement)",
"Exp newOr(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newEquals(Exp,int,Exp)",
"Exp newNotEquals(Exp,int,Exp)",
"Exp newLessThan(Exp,int,Exp)",
"Exp newGreaterThan(Exp,int,Exp)",
"Exp newInstanceOf(Exp,int,Type)",
"Exp newLessThanEquals(Exp,int,Exp)",
"Exp newGreaterThanEquals(Exp,int,Exp)",
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
"Exp newObject(int,String)",
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
3,1,
1,1,
1,1,
2,1,
3,1,
1,1,
2,1,
3,1,
2,1,
2,1,
2,1,
2,1,
4,1,
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
    1,
    0,
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
    0,
    1,
    0,
    0,
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
