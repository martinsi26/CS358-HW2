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
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 90; }
public int getNttSym() { return 91; }
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
"`int",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"<exp>",
"`=",
"<exp8>",
"<exp7>",
"<exp6>",
"<exp5>",
"<exp4>",
"`+",
"<exp3>",
"`*",
"<exp2>",
"<cast exp>",
"<unary exp>",
"<exp1>",
"`-",
"INTLIT",
"letter",
"\"p\"",
"\"v\"",
"\"b\"",
"{\"A\"..\"Z\" \"a\" \"d\"..\"h\" \"j\"..\"k\" \"m\"..\"n\" \"q\"..\"s\" \"w\"..\"z\"}",
"\"t\"",
"\"c\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"u\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"ws",
"\" \"",
"10",
"\"#\"",
"\"*\"",
"\"(\"",
"\")\"",
"\"{\"",
"\"}\"",
"\"-\"",
"\"+\"",
"\"=\"",
"\"[\"",
"\"]\"",
"\";\"",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"idChar",
"\"_\"",
"idChar128",
"223",
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
public int numSymbols() { return 92;}
private static final int MIN_REDUCTION = 630;
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
1,567, // <start>
2,192, // ws*
3,614, // <program>
4,186, // <class decl>+
5,421, // <class decl>
6,275, // `class
63,73, // ws
64,136, // " "
65,160, // {10}
66,320, // "#"
  }
,
{ // state 1
  }
,
{ // state 2
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 3
63,287, // ws
64,157, // " "
65,518, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 4
7,384, // ID
15,98, // `(
38,516, // <exp2>
39,267, // <cast exp>
40,487, // <unary exp>
41,374, // <exp1>
42,452, // `-
43,453, // INTLIT
44,342, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,594, // letter128
56,32, // {199..218 231..250}
57,32, // {193..198 225..230}
59,613, // {"1".."9"}
60,132, // "0"
61,572, // digit128
62,588, // {176..185}
68,501, // "("
72,9, // "-"
  }
,
{ // state 5
22,MIN_REDUCTION+110, // `[
63,64, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 6
29,527, // `=
74,46, // "="
  }
,
{ // state 7
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 8
0x80000000|493, // match move
0x80000000|26, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 9
2,297, // ws*
63,448, // ws
64,411, // " "
65,353, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 10
0x80000000|99, // match move
0x80000000|57, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 11
0x80000000|486, // match move
0x80000000|23, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 13
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 14
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 17
2,100, // ws*
63,48, // ws
64,500, // " "
65,193, // {10}
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 20
2,576, // ws*
63,548, // ws
64,565, // " "
65,123, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 21
2,359, // ws*
63,70, // ws
64,317, // " "
65,413, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 22
0x80000000|1, // match move
0x80000000|112, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 23
2,484, // ws*
22,MIN_REDUCTION+111, // `[
63,395, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 25
58,379, // digit
59,425, // {"1".."9"}
60,425, // "0"
61,8, // digit128
62,575, // {176..185}
80,615, // digit*
81,41, // $$1
  }
,
{ // state 26
2,477, // ws*
22,MIN_REDUCTION+111, // `[
63,390, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 27
14,277, // `void
66,179, // "#"
  }
,
{ // state 28
22,MIN_REDUCTION+72, // `[
63,64, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 29
58,379, // digit
59,425, // {"1".."9"}
60,425, // "0"
61,11, // digit128
62,574, // {176..185}
80,620, // digit*
81,42, // $$1
  }
,
{ // state 30
7,414, // ID
15,156, // `(
38,619, // <exp2>
39,235, // <cast exp>
40,462, // <unary exp>
41,423, // <exp1>
42,213, // `-
43,438, // INTLIT
44,386, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,628, // letter128
56,52, // {199..218 231..250}
57,52, // {193..198 225..230}
59,25, // {"1".."9"}
60,175, // "0"
61,601, // digit128
62,575, // {176..185}
68,501, // "("
72,9, // "-"
  }
,
{ // state 31
7,412, // ID
15,138, // `(
38,621, // <exp2>
39,237, // <cast exp>
40,460, // <unary exp>
41,417, // <exp1>
42,215, // `-
43,440, // INTLIT
44,394, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,626, // letter128
56,54, // {199..218 231..250}
57,54, // {193..198 225..230}
59,29, // {"1".."9"}
60,168, // "0"
61,599, // digit128
62,574, // {176..185}
68,501, // "("
72,9, // "-"
  }
,
{ // state 32
0x80000000|350, // match move
0x80000000|154, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 33
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 34
2,465, // ws*
  }
,
{ // state 35
0x80000000|1, // match move
0x80000000|296, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 36
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 37
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 38
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 39
0x80000000|1, // match move
0x80000000|300, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 40
0x80000000|532, // match move
0x80000000|254, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 41
0x80000000|1, // match move
0x80000000|137, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
0x80000000|1, // match move
0x80000000|174, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
63,533, // ws
64,252, // " "
65,347, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 44
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 45
91,MIN_REDUCTION+13, // $NT
  }
,
{ // state 46
2,361, // ws*
63,488, // ws
64,293, // " "
65,184, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 47
2,90, // ws*
63,508, // ws
64,302, // " "
65,176, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 48
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 49
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,402, // letter128
56,333, // {199..218 231..250}
57,333, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,538, // digit128
62,244, // {176..185}
78,232, // idChar*
79,24, // $$0
84,264, // idChar
85,542, // "_"
86,118, // idChar128
87,167, // {223}
  }
,
{ // state 50
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 52
0x80000000|350, // match move
0x80000000|510, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 53
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,511, // letter128
56,191, // {199..218 231..250}
57,191, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,545, // digit128
62,163, // {176..185}
79,40, // $$0
84,570, // idChar
85,542, // "_"
86,339, // idChar128
87,543, // {223}
  }
,
{ // state 54
0x80000000|350, // match move
0x80000000|173, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 55
22,437, // `[
75,288, // "["
  }
,
{ // state 56
45,398, // "p"
46,398, // "v"
47,398, // "b"
48,398, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,398, // "t"
50,398, // "c"
51,398, // "i"
52,398, // "l"
53,398, // "o"
54,398, // "u"
57,80, // {193..198 225..230}
59,398, // {"1".."9"}
60,398, // "0"
62,80, // {176..185}
83,464, // $$2
88,85, // hexDigit
89,348, // hexDigit128
  }
,
{ // state 57
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 59
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 60
0x80000000|459, // match move
0x80000000|71, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 61
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 62
2,433, // ws*
  }
,
{ // state 63
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 64
0x80000000|1, // match move
0x80000000|279, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 65
23,63, // `]
76,177, // "]"
  }
,
{ // state 66
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 67
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 68
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 69
0x80000000|1, // match move
0x80000000|607, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 70
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 71
2,369, // ws*
22,MIN_REDUCTION+111, // `[
63,371, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 72
0x80000000|1, // match move
0x80000000|611, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 73
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 74
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 75
63,554, // ws
64,317, // " "
65,413, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 76
2,435, // ws*
  }
,
{ // state 77
0x80000000|1, // match move
0x80000000|432, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 78
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 79
37,30, // `*
67,610, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 80
0x80000000|161, // match move
0x80000000|424, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 81
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 82
0x80000000|1, // match move
0x80000000|442, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 83
37,31, // `*
67,610, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 84
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 87
29,457, // `=
74,46, // "="
  }
,
{ // state 88
8,214, // `{
70,231, // "{"
  }
,
{ // state 89
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 90
63,164, // ws
64,302, // " "
65,176, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 91
0x80000000|1, // match move
0x80000000|519, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 92
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 95
0x80000000|466, // match move
0x80000000|580, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 96
0x80000000|1, // match move
0x80000000|521, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 97
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 98
7,19, // ID
18,262, // <type>
19,553, // `int
20,373, // `boolean
44,49, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,103, // letter128
56,333, // {199..218 231..250}
57,333, // {193..198 225..230}
66,208, // "#"
  }
,
{ // state 99
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 100
63,367, // ws
64,500, // " "
65,193, // {10}
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 101
0x80000000|1, // match move
0x80000000|547, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 103
2,407, // ws*
63,48, // ws
64,500, // " "
65,193, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 105
2,498, // ws*
63,415, // ws
64,427, // " "
65,273, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 106
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 107
0x80000000|334, // match move
0x80000000|248, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 108
0x80000000|466, // match move
0x80000000|539, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 109
0x80000000|334, // match move
0x80000000|251, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 110
0x80000000|466, // match move
0x80000000|541, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 111
63,129, // ws
64,481, // " "
65,447, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 112
22,MIN_REDUCTION+81, // `[
75,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 113
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 114
0x80000000|1, // match move
0x80000000|396, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 115
2,82, // ws*
22,MIN_REDUCTION+83, // `[
63,390, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 116
22,MIN_REDUCTION+107, // `[
75,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 117
63,299, // ws
64,561, // " "
65,530, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 118
2,221, // ws*
63,48, // ws
64,500, // " "
65,193, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 119
2,606, // ws*
63,548, // ws
64,565, // " "
65,123, // {10}
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 120
45,398, // "p"
46,398, // "v"
47,398, // "b"
48,398, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,398, // "t"
50,398, // "c"
51,398, // "i"
52,398, // "l"
53,398, // "o"
54,398, // "u"
57,240, // {193..198 225..230}
59,398, // {"1".."9"}
60,398, // "0"
62,240, // {176..185}
83,489, // $$2
88,85, // hexDigit
89,468, // hexDigit128
  }
,
{ // state 121
37,4, // `*
67,610, // "*"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 122
45,398, // "p"
46,398, // "v"
47,398, // "b"
48,398, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,398, // "t"
50,398, // "c"
51,398, // "i"
52,398, // "l"
53,398, // "o"
54,398, // "u"
57,236, // {193..198 225..230}
59,398, // {"1".."9"}
60,398, // "0"
62,236, // {176..185}
83,491, // $$2
88,85, // hexDigit
89,458, // hexDigit128
  }
,
{ // state 123
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 124
2,224, // ws*
63,48, // ws
64,500, // " "
65,193, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 125
0x80000000|1, // match move
0x80000000|562, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 126
2,449, // ws*
63,48, // ws
64,500, // " "
65,193, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 127
63,169, // ws
64,293, // " "
65,184, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 128
0x80000000|1, // match move
0x80000000|564, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 130
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,509, // letter128
56,32, // {199..218 231..250}
57,32, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,95, // digit128
62,588, // {176..185}
79,101, // $$0
84,570, // idChar
85,542, // "_"
86,403, // idChar128
87,228, // {223}
  }
,
{ // state 131
22,MIN_REDUCTION+108, // `[
63,64, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 132
45,398, // "p"
46,398, // "v"
47,398, // "b"
48,398, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,398, // "t"
50,398, // "c"
51,398, // "i"
52,398, // "l"
53,398, // "o"
54,398, // "u"
57,80, // {193..198 225..230}
59,398, // {"1".."9"}
60,398, // "0"
62,80, // {176..185}
82,56, // hexDigit*
83,253, // $$2
88,141, // hexDigit
89,348, // hexDigit128
  }
,
{ // state 133
2,127, // ws*
63,488, // ws
64,293, // " "
65,184, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 134
23,472, // `]
76,328, // "]"
  }
,
{ // state 135
2,77, // ws*
22,MIN_REDUCTION+83, // `[
63,395, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 137
22,MIN_REDUCTION+81, // `[
75,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 138
7,19, // ID
18,305, // <type>
19,553, // `int
20,373, // `boolean
44,49, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,103, // letter128
56,333, // {199..218 231..250}
57,333, // {193..198 225..230}
66,208, // "#"
  }
,
{ // state 139
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 140
53,20, // "o"
  }
,
{ // state 141
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 143
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 144
0x80000000|1, // match move
0x80000000|612, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 145
0x80000000|1, // match move
0x80000000|617, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 146
7,87, // ID
21,378, // <empty bracket pair>
22,65, // `[
44,219, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,185, // letter128
56,377, // {199..218 231..250}
57,377, // {193..198 225..230}
75,288, // "["
  }
,
{ // state 147
2,426, // ws*
22,MIN_REDUCTION+109, // `[
63,326, // ws
64,10, // " "
65,422, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 148
0x80000000|1, // match move
0x80000000|131, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 149
0x80000000|1, // match move
0x80000000|278, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 150
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,370, // letter128
56,54, // {199..218 231..250}
57,54, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,110, // digit128
62,574, // {176..185}
79,128, // $$0
84,570, // idChar
85,542, // "_"
86,239, // idChar128
87,109, // {223}
  }
,
{ // state 151
0x80000000|1, // match move
0x80000000|276, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 152
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,375, // letter128
56,52, // {199..218 231..250}
57,52, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,108, // digit128
62,575, // {176..185}
79,125, // $$0
84,570, // idChar
85,542, // "_"
86,233, // idChar128
87,107, // {223}
  }
,
{ // state 153
23,502, // `]
76,285, // "]"
  }
,
{ // state 154
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 155
23,499, // `]
76,281, // "]"
  }
,
{ // state 156
7,19, // ID
18,309, // <type>
19,553, // `int
20,373, // `boolean
44,49, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,103, // letter128
56,333, // {199..218 231..250}
57,333, // {193..198 225..230}
66,208, // "#"
  }
,
{ // state 157
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 158
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 159
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 162
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 163
0x80000000|443, // match move
0x80000000|585, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 164
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 165
0x80000000|1, // match move
0x80000000|247, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 166
0x80000000|444, // match move
0x80000000|92, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 167
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 168
45,398, // "p"
46,398, // "v"
47,398, // "b"
48,398, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,398, // "t"
50,398, // "c"
51,398, // "i"
52,398, // "l"
53,398, // "o"
54,398, // "u"
57,236, // {193..198 225..230}
59,398, // {"1".."9"}
60,398, // "0"
62,236, // {176..185}
82,122, // hexDigit*
83,91, // $$2
88,141, // hexDigit
89,458, // hexDigit128
  }
,
{ // state 169
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 170
2,75, // ws*
63,70, // ws
64,317, // " "
65,413, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 171
2,114, // ws*
22,MIN_REDUCTION+83, // `[
63,371, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+83, // "["
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 173
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 174
22,MIN_REDUCTION+81, // `[
75,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 175
45,398, // "p"
46,398, // "v"
47,398, // "b"
48,398, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,398, // "t"
50,398, // "c"
51,398, // "i"
52,398, // "l"
53,398, // "o"
54,398, // "u"
57,240, // {193..198 225..230}
59,398, // {"1".."9"}
60,398, // "0"
62,240, // {176..185}
82,120, // hexDigit*
83,96, // $$2
88,141, // hexDigit
89,468, // hexDigit128
  }
,
{ // state 176
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 177
2,319, // ws*
63,344, // ws
64,58, // " "
65,625, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 178
22,MIN_REDUCTION+36, // `[
75,MIN_REDUCTION+36, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 179
46,140, // "v"
  }
,
{ // state 180
22,MIN_REDUCTION+36, // `[
75,MIN_REDUCTION+36, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 182
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,158, // letter128
56,357, // {199..218 231..250}
57,357, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,586, // digit128
62,365, // {176..185}
78,505, // idChar*
79,618, // $$0
84,264, // idChar
85,542, // "_"
86,445, // idChar128
87,429, // {223}
  }
,
{ // state 183
2,609, // ws*
63,344, // ws
64,58, // " "
65,625, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 185
2,229, // ws*
63,351, // ws
64,376, // " "
65,323, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 186
5,204, // <class decl>
6,275, // `class
66,320, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 187
0x80000000|1, // match move
0x80000000|454, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 188
0x80000000|1, // match move
0x80000000|162, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 189
2,257, // ws*
  }
,
{ // state 190
0x80000000|1, // match move
0x80000000|456, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 191
0x80000000|366, // match move
0x80000000|284, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 192
3,604, // <program>
4,186, // <class decl>+
5,421, // <class decl>
6,275, // `class
63,270, // ws
64,136, // " "
65,160, // {10}
66,320, // "#"
  }
,
{ // state 193
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 194
0x80000000|1, // match move
0x80000000|573, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 195
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 196
63,552, // ws
64,427, // " "
65,273, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 197
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 198
0x80000000|1, // match move
0x80000000|478, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 199
22,MIN_REDUCTION+76, // `[
63,166, // ws
64,10, // " "
65,422, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 200
22,MIN_REDUCTION+108, // `[
63,166, // ws
64,10, // " "
65,422, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 201
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 202
2,243, // ws*
63,381, // ws
64,356, // " "
65,337, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 205
22,MIN_REDUCTION+35, // `[
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 206
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 207
22,MIN_REDUCTION+35, // `[
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 208
47,559, // "b"
51,551, // "i"
  }
,
{ // state 209
45,526, // "p"
  }
,
{ // state 210
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 211
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 212
63,104, // ws
64,44, // " "
65,97, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 213
7,414, // ID
40,93, // <unary exp>
41,423, // <exp1>
42,213, // `-
43,438, // INTLIT
44,386, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,628, // letter128
56,52, // {199..218 231..250}
57,52, // {193..198 225..230}
59,25, // {"1".."9"}
60,175, // "0"
61,601, // digit128
62,575, // {176..185}
72,9, // "-"
  }
,
{ // state 214
9,387, // <decl in class>*
10,494, // `}
11,249, // <decl in class>
12,201, // <method decl>
13,27, // `public
66,209, // "#"
71,471, // "}"
  }
,
{ // state 215
7,412, // ID
40,78, // <unary exp>
41,417, // <exp1>
42,215, // `-
43,440, // INTLIT
44,394, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,626, // letter128
56,54, // {199..218 231..250}
57,54, // {193..198 225..230}
59,29, // {"1".."9"}
60,168, // "0"
61,599, // digit128
62,574, // {176..185}
72,9, // "-"
  }
,
{ // state 216
63,325, // ws
64,470, // " "
65,535, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 219
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,7, // letter128
56,377, // {199..218 231..250}
57,377, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,593, // digit128
62,308, // {176..185}
78,473, // idChar*
79,605, // $$0
84,264, // idChar
85,542, // "_"
86,431, // idChar128
87,405, // {223}
  }
,
{ // state 220
22,MIN_REDUCTION+35, // `[
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 221
63,367, // ws
64,500, // " "
65,193, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 224
63,367, // ws
64,500, // " "
65,193, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 225
22,MIN_REDUCTION+108, // `[
63,39, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 226
2,257, // ws*
22,MIN_REDUCTION+73, // `[
63,371, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 227
22,MIN_REDUCTION+108, // `[
63,35, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 228
0x80000000|334, // match move
0x80000000|282, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 229
63,555, // ws
64,376, // " "
65,323, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 231
2,43, // ws*
63,582, // ws
64,252, // " "
65,347, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 232
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,402, // letter128
56,333, // {199..218 231..250}
57,333, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,538, // digit128
62,244, // {176..185}
79,595, // $$0
84,570, // idChar
85,542, // "_"
86,118, // idChar128
87,167, // {223}
  }
,
{ // state 233
0x80000000|419, // match move
0x80000000|522, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 234
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 236
0x80000000|161, // match move
0x80000000|410, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 237
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 239
0x80000000|418, // match move
0x80000000|556, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
0x80000000|161, // match move
0x80000000|408, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 241
2,465, // ws*
22,MIN_REDUCTION+113, // `[
63,371, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 242
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 243
63,513, // ws
64,356, // " "
65,337, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 244
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 245
26,217, // `;
77,170, // ";"
  }
,
{ // state 246
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 247
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 248
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 249
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 250
63,255, // ws
64,172, // " "
65,534, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 251
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 252
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 253
0x80000000|1, // match move
0x80000000|558, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 254
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 256
0x80000000|1, // match move
0x80000000|290, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 257
0x80000000|1, // match move
0x80000000|28, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 258
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 259
7,384, // ID
15,98, // `(
36,268, // <exp3>
38,66, // <exp2>
39,267, // <cast exp>
40,487, // <unary exp>
41,374, // <exp1>
42,452, // `-
43,453, // INTLIT
44,342, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,594, // letter128
56,32, // {199..218 231..250}
57,32, // {193..198 225..230}
59,613, // {"1".."9"}
60,132, // "0"
61,572, // digit128
62,588, // {176..185}
68,501, // "("
72,9, // "-"
  }
,
{ // state 260
0x80000000|1, // match move
0x80000000|263, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 261
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 262
16,492, // `)
21,211, // <empty bracket pair>
22,627, // `[
69,490, // ")"
75,288, // "["
  }
,
{ // state 263
22,MIN_REDUCTION+76, // `[
63,35, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 264
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 265
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 266
2,69, // ws*
22,MIN_REDUCTION+73, // `[
63,390, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 268
37,4, // `*
67,610, // "*"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 269
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,511, // letter128
56,191, // {199..218 231..250}
57,191, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,545, // digit128
62,163, // {176..185}
78,53, // idChar*
79,608, // $$0
84,264, // idChar
85,542, // "_"
86,339, // idChar128
87,543, // {223}
  }
,
{ // state 270
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 271
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 272
0x80000000|1, // match move
0x80000000|286, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 273
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 274
22,MIN_REDUCTION+35, // `[
29,MIN_REDUCTION+35, // `=
35,MIN_REDUCTION+35, // `+
37,MIN_REDUCTION+35, // `*
67,MIN_REDUCTION+35, // "*"
73,MIN_REDUCTION+35, // "+"
74,MIN_REDUCTION+35, // "="
75,MIN_REDUCTION+35, // "["
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 275
7,88, // ID
44,313, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,105, // letter128
56,428, // {199..218 231..250}
57,428, // {193..198 225..230}
  }
,
{ // state 276
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 277
7,352, // ID
44,182, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,202, // letter128
56,357, // {199..218 231..250}
57,357, // {193..198 225..230}
  }
,
{ // state 278
22,MIN_REDUCTION+42, // `[
75,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 279
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 280
63,540, // ws
64,401, // " "
65,246, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 281
0x80000000|504, // match move
0x80000000|283, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 282
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 283
2,72, // ws*
22,MIN_REDUCTION+73, // `[
63,395, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 284
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 285
0x80000000|506, // match move
0x80000000|266, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 286
22,597, // `[
75,133, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 287
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 288
2,280, // ws*
63,420, // ws
64,401, // " "
65,246, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 289
2,603, // ws*
63,344, // ws
64,58, // " "
65,625, // {10}
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 290
22,MIN_REDUCTION+76, // `[
63,39, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 291
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 292
91,MIN_REDUCTION+42, // $NT
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 293
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 294
22,MIN_REDUCTION+110, // `[
63,35, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 295
22,MIN_REDUCTION+110, // `[
63,39, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+110, // "["
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 296
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 297
63,203, // ws
64,411, // " "
65,353, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 298
22,MIN_REDUCTION+91, // `[
75,MIN_REDUCTION+91, // "["
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 300
22,MIN_REDUCTION+106, // `[
75,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 301
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 303
0x80000000|1, // match move
0x80000000|306, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 304
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 305
16,531, // `)
21,211, // <empty bracket pair>
22,627, // `[
69,490, // ")"
75,288, // "["
  }
,
{ // state 306
22,MIN_REDUCTION+76, // `[
63,64, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 307
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 308
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 309
16,529, // `)
21,211, // <empty bracket pair>
22,627, // `[
69,490, // ")"
75,288, // "["
  }
,
{ // state 310
37,31, // `*
67,610, // "*"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 311
2,256, // ws*
22,MIN_REDUCTION+77, // `[
63,390, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 312
0x80000000|1, // match move
0x80000000|197, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 313
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,68, // letter128
56,428, // {199..218 231..250}
57,428, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,623, // digit128
62,265, // {176..185}
78,364, // idChar*
79,524, // $$0
84,264, // idChar
85,542, // "_"
86,624, // idChar128
87,355, // {223}
  }
,
{ // state 314
0x80000000|1, // match move
0x80000000|336, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 315
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 316
37,30, // `*
67,610, // "*"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 317
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 318
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 319
63,331, // ws
64,58, // " "
65,625, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 320
50,517, // "c"
  }
,
{ // state 321
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 322
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 323
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 324
22,MIN_REDUCTION+89, // `[
75,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 326
0x80000000|560, // match move
0x80000000|116, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 327
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 328
0x80000000|189, // match move
0x80000000|226, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 329
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 330
0x80000000|1, // match move
0x80000000|343, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 331
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 333
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 334
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 335
0x80000000|1, // match move
0x80000000|143, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 336
22,579, // `[
75,133, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 337
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 338
2,260, // ws*
22,MIN_REDUCTION+77, // `[
63,395, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 339
0x80000000|404, // match move
0x80000000|147, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 340
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 341
7,414, // ID
15,156, // `(
36,316, // <exp3>
38,94, // <exp2>
39,235, // <cast exp>
40,462, // <unary exp>
41,423, // <exp1>
42,213, // `-
43,438, // INTLIT
44,386, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,628, // letter128
56,52, // {199..218 231..250}
57,52, // {193..198 225..230}
59,25, // {"1".."9"}
60,175, // "0"
61,601, // digit128
62,575, // {176..185}
68,501, // "("
72,9, // "-"
  }
,
{ // state 342
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,509, // letter128
56,32, // {199..218 231..250}
57,32, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,95, // digit128
62,588, // {176..185}
78,130, // idChar*
79,194, // $$0
84,264, // idChar
85,542, // "_"
86,403, // idChar128
87,228, // {223}
  }
,
{ // state 343
22,583, // `[
75,133, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 344
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 345
7,412, // ID
15,138, // `(
36,310, // <exp3>
38,89, // <exp2>
39,237, // <cast exp>
40,460, // <unary exp>
41,417, // <exp1>
42,215, // `-
43,440, // INTLIT
44,394, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,626, // letter128
56,54, // {199..218 231..250}
57,54, // {193..198 225..230}
59,29, // {"1".."9"}
60,168, // "0"
61,599, // digit128
62,574, // {176..185}
68,501, // "("
72,9, // "-"
  }
,
{ // state 346
0x80000000|475, // match move
0x80000000|446, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 347
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 348
0x80000000|34, // match move
0x80000000|241, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 349
63,555, // ws
64,376, // " "
65,323, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 350
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 352
15,482, // `(
68,557, // "("
  }
,
{ // state 353
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 354
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 355
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 358
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 359
63,554, // ws
64,317, // " "
65,413, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 360
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 361
63,169, // ws
64,293, // " "
65,184, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 363
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 364
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,68, // letter128
56,428, // {199..218 231..250}
57,428, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,623, // digit128
62,265, // {176..185}
79,238, // $$0
84,570, // idChar
85,542, // "_"
86,624, // idChar128
87,355, // {223}
  }
,
{ // state 365
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 366
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 368
47,436, // "b"
51,391, // "i"
  }
,
{ // state 369
0x80000000|1, // match move
0x80000000|5, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 370
0x80000000|322, // match move
0x80000000|33, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 371
0x80000000|1, // match move
0x80000000|36, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 372
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 373
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 374
0x80000000|1, // match move
0x80000000|563, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 375
0x80000000|322, // match move
0x80000000|37, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 376
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 377
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 378
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 379
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 380
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 381
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 383
91,MIN_REDUCTION+43, // $NT
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 384
0x80000000|1, // match move
0x80000000|220, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 385
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
549, // ID
568, // `{
-1, // <decl in class>*
142, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
138, // `(
-1, // `)
-1, // <stmt>*
146, // <type>
360, // `int
223, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
139, // <stmt>
245, // <assign>
-1, // `;
399, // <local var decl>
6, // <exp>
-1, // `=
467, // <exp8>
307, // <exp7>
14, // <exp6>
18, // <exp5>
393, // <exp4>
-1, // `+
83, // <exp3>
-1, // `*
89, // <exp2>
237, // <cast exp>
460, // <unary exp>
417, // <exp1>
215, // `-
440, // INTLIT
269, // letter
113, // "p"
113, // "v"
113, // "b"
113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
113, // "t"
113, // "c"
113, // "i"
113, // "l"
113, // "o"
113, // "u"
346, // letter128
191, // {199..218 231..250}
191, // {193..198 225..230}
-1, // digit
29, // {"1".."9"}
168, // "0"
599, // digit128
574, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
368, // "#"
-1, // "*"
501, // "("
-1, // ")"
461, // "{"
598, // "}"
9, // "-"
-1, // "+"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 386
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,375, // letter128
56,52, // {199..218 231..250}
57,52, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,108, // digit128
62,575, // {176..185}
78,152, // idChar*
79,144, // $$0
84,264, // idChar
85,542, // "_"
86,233, // idChar128
87,107, // {223}
  }
,
{ // state 387
10,528, // `}
11,363, // <decl in class>
12,201, // <method decl>
13,27, // `public
66,209, // "#"
71,471, // "}"
  }
,
{ // state 388
63,513, // ws
64,356, // " "
65,337, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 389
35,341, // `+
73,577, // "+"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 390
0x80000000|1, // match move
0x80000000|13, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 391
49,183, // "t"
  }
,
{ // state 392
2,303, // ws*
22,MIN_REDUCTION+77, // `[
63,371, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 393
35,345, // `+
73,577, // "+"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 394
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,370, // letter128
56,54, // {199..218 231..250}
57,54, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,110, // digit128
62,574, // {176..185}
78,150, // idChar*
79,145, // $$0
84,264, // idChar
85,542, // "_"
86,239, // idChar128
87,109, // {223}
  }
,
{ // state 395
0x80000000|1, // match move
0x80000000|12, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 396
22,MIN_REDUCTION+82, // `[
63,64, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 397
2,148, // ws*
  }
,
{ // state 398
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 399
26,218, // `;
77,170, // ";"
  }
,
{ // state 400
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 401
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 402
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 403
0x80000000|397, // match move
0x80000000|584, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 404
2,426, // ws*
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 405
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 406
2,433, // ws*
22,MIN_REDUCTION+113, // `[
63,395, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 407
63,367, // ws
64,500, // " "
65,193, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 408
22,MIN_REDUCTION+93, // `[
75,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 409
2,435, // ws*
22,MIN_REDUCTION+113, // `[
63,390, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 410
22,MIN_REDUCTION+93, // `[
75,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 411
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 412
0x80000000|1, // match move
0x80000000|205, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 413
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 414
0x80000000|1, // match move
0x80000000|207, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 415
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 416
63,463, // ws
64,292, // " "
65,383, // {10}
91,MIN_REDUCTION+72, // $NT
  }
,
{ // state 417
0x80000000|1, // match move
0x80000000|451, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 418
2,523, // ws*
  }
,
{ // state 419
2,520, // ws*
  }
,
{ // state 420
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 421
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 422
0x80000000|546, // match move
0x80000000|587, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 423
0x80000000|1, // match move
0x80000000|450, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 424
22,MIN_REDUCTION+93, // `[
75,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 425
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 426
0x80000000|616, // match move
0x80000000|200, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 427
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 428
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 429
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 430
35,259, // `+
73,577, // "+"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 431
2,349, // ws*
63,351, // ws
64,376, // " "
65,323, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 432
22,MIN_REDUCTION+82, // `[
63,35, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 433
0x80000000|1, // match move
0x80000000|569, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 434
63,552, // ws
64,427, // " "
65,273, // {10}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 435
0x80000000|1, // match move
0x80000000|566, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 436
53,289, // "o"
  }
,
{ // state 437
23,45, // `]
76,550, // "]"
  }
,
{ // state 438
0x80000000|1, // match move
0x80000000|479, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 439
2,260, // ws*
  }
,
{ // state 440
0x80000000|1, // match move
0x80000000|483, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 441
2,256, // ws*
  }
,
{ // state 442
22,MIN_REDUCTION+82, // `[
63,39, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+82, // "["
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 443
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 444
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 445
2,388, // ws*
63,381, // ws
64,356, // " "
65,337, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 446
2,591, // ws*
22,MIN_REDUCTION+77, // `[
63,326, // ws
64,10, // " "
65,422, // {10}
75,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 447
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 448
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 449
63,367, // ws
64,500, // " "
65,193, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 450
22,583, // `[
75,133, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 451
22,579, // `[
75,133, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 452
7,384, // ID
40,50, // <unary exp>
41,374, // <exp1>
42,452, // `-
43,453, // INTLIT
44,342, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,594, // letter128
56,32, // {199..218 231..250}
57,32, // {193..198 225..230}
59,613, // {"1".."9"}
60,132, // "0"
61,572, // digit128
62,588, // {176..185}
72,9, // "-"
  }
,
{ // state 453
0x80000000|1, // match move
0x80000000|536, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 454
22,MIN_REDUCTION+80, // `[
75,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 455
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 456
22,MIN_REDUCTION+80, // `[
75,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 457
7,414, // ID
15,156, // `(
28,159, // <exp>
30,476, // <exp8>
31,304, // <exp7>
32,16, // <exp6>
33,15, // <exp5>
34,389, // <exp4>
36,79, // <exp3>
38,94, // <exp2>
39,235, // <cast exp>
40,462, // <unary exp>
41,423, // <exp1>
42,213, // `-
43,438, // INTLIT
44,386, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,628, // letter128
56,52, // {199..218 231..250}
57,52, // {193..198 225..230}
59,25, // {"1".."9"}
60,175, // "0"
61,601, // digit128
62,575, // {176..185}
68,501, // "("
72,9, // "-"
  }
,
{ // state 458
0x80000000|62, // match move
0x80000000|406, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 459
2,369, // ws*
  }
,
{ // state 460
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 461
2,525, // ws*
63,400, // ws
64,38, // " "
65,86, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 462
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 463
91,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 464
0x80000000|1, // match move
0x80000000|602, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 465
0x80000000|1, // match move
0x80000000|537, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 466
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 467
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 468
0x80000000|76, // match move
0x80000000|409, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 469
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
549, // ID
568, // `{
-1, // <decl in class>*
327, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
138, // `(
-1, // `)
385, // <stmt>*
146, // <type>
360, // `int
223, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
372, // <stmt>
245, // <assign>
-1, // `;
399, // <local var decl>
6, // <exp>
-1, // `=
467, // <exp8>
307, // <exp7>
14, // <exp6>
18, // <exp5>
393, // <exp4>
-1, // `+
83, // <exp3>
-1, // `*
89, // <exp2>
237, // <cast exp>
460, // <unary exp>
417, // <exp1>
215, // `-
440, // INTLIT
269, // letter
113, // "p"
113, // "v"
113, // "b"
113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
113, // "t"
113, // "c"
113, // "i"
113, // "l"
113, // "o"
113, // "u"
346, // letter128
191, // {199..218 231..250}
191, // {193..198 225..230}
-1, // digit
29, // {"1".."9"}
168, // "0"
599, // digit128
574, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
368, // "#"
-1, // "*"
501, // "("
-1, // ")"
461, // "{"
598, // "}"
9, // "-"
-1, // "+"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 470
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 471
2,111, // ws*
63,181, // ws
64,481, // " "
65,447, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 472
0x80000000|1, // match move
0x80000000|495, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 473
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,7, // letter128
56,377, // {199..218 231..250}
57,377, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,593, // digit128
62,308, // {176..185}
79,51, // $$0
84,570, // idChar
85,542, // "_"
86,431, // idChar128
87,405, // {223}
  }
,
{ // state 474
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
549, // ID
568, // `{
-1, // <decl in class>*
210, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
138, // `(
-1, // `)
-1, // <stmt>*
146, // <type>
360, // `int
223, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
139, // <stmt>
245, // <assign>
-1, // `;
399, // <local var decl>
6, // <exp>
-1, // `=
467, // <exp8>
307, // <exp7>
14, // <exp6>
18, // <exp5>
393, // <exp4>
-1, // `+
83, // <exp3>
-1, // `*
89, // <exp2>
237, // <cast exp>
460, // <unary exp>
417, // <exp1>
215, // `-
440, // INTLIT
269, // letter
113, // "p"
113, // "v"
113, // "b"
113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
113, // "t"
113, // "c"
113, // "i"
113, // "l"
113, // "o"
113, // "u"
346, // letter128
191, // {199..218 231..250}
191, // {193..198 225..230}
-1, // digit
29, // {"1".."9"}
168, // "0"
599, // digit128
574, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
368, // "#"
-1, // "*"
501, // "("
-1, // ")"
461, // "{"
21, // "}"
9, // "-"
-1, // "+"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 475
2,591, // ws*
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 476
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 477
0x80000000|1, // match move
0x80000000|295, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 478
22,MIN_REDUCTION+80, // `[
75,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 479
22,MIN_REDUCTION+37, // `[
75,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 480
63,514, // ws
64,354, // " "
65,340, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 481
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 482
16,596, // `)
69,544, // ")"
  }
,
{ // state 483
22,MIN_REDUCTION+37, // `[
75,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 484
0x80000000|1, // match move
0x80000000|294, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 485
91,MIN_REDUCTION+107, // $NT
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 486
2,484, // ws*
  }
,
{ // state 487
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 488
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 489
0x80000000|1, // match move
0x80000000|589, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 490
2,212, // ws*
63,497, // ws
64,44, // " "
65,97, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 491
0x80000000|1, // match move
0x80000000|590, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 492
7,384, // ID
15,98, // `(
39,195, // <cast exp>
41,272, // <exp1>
43,453, // INTLIT
44,342, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,594, // letter128
56,32, // {199..218 231..250}
57,32, // {193..198 225..230}
59,613, // {"1".."9"}
60,132, // "0"
61,572, // digit128
62,588, // {176..185}
68,501, // "("
  }
,
{ // state 493
2,477, // ws*
  }
,
{ // state 494
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 495
22,MIN_REDUCTION+36, // `[
75,MIN_REDUCTION+36, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 496
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 497
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 498
63,552, // ws
64,427, // " "
65,273, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 499
0x80000000|1, // match move
0x80000000|180, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 500
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 501
2,216, // ws*
63,321, // ws
64,470, // " "
65,535, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 502
0x80000000|1, // match move
0x80000000|178, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 503
2,303, // ws*
  }
,
{ // state 504
2,72, // ws*
  }
,
{ // state 505
44,622, // letter
45,81, // "p"
46,81, // "v"
47,81, // "b"
48,81, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,81, // "t"
50,81, // "c"
51,81, // "i"
52,81, // "l"
53,81, // "o"
54,81, // "u"
55,158, // letter128
56,357, // {199..218 231..250}
57,357, // {193..198 225..230}
58,271, // digit
59,230, // {"1".."9"}
60,230, // "0"
61,586, // digit128
62,365, // {176..185}
79,84, // $$0
84,570, // idChar
85,542, // "_"
86,445, // idChar128
87,429, // {223}
  }
,
{ // state 506
2,69, // ws*
  }
,
{ // state 507
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 508
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 509
0x80000000|322, // match move
0x80000000|61, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 510
22,MIN_REDUCTION+39, // `[
75,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 511
0x80000000|600, // match move
0x80000000|324, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 512
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 513
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 514
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 515
58,382, // digit
59,425, // {"1".."9"}
60,425, // "0"
61,60, // digit128
62,588, // {176..185}
81,198, // $$1
  }
,
{ // state 516
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 517
52,119, // "l"
  }
,
{ // state 518
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 519
22,MIN_REDUCTION+85, // `[
75,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 520
0x80000000|1, // match move
0x80000000|225, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 521
22,MIN_REDUCTION+85, // `[
75,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 522
2,520, // ws*
22,MIN_REDUCTION+109, // `[
63,390, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 523
0x80000000|1, // match move
0x80000000|227, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 524
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 525
63,102, // ws
64,38, // " "
65,86, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 526
54,47, // "u"
  }
,
{ // state 527
7,414, // ID
15,156, // `(
28,106, // <exp>
30,476, // <exp8>
31,304, // <exp7>
32,16, // <exp6>
33,15, // <exp5>
34,389, // <exp4>
36,79, // <exp3>
38,94, // <exp2>
39,235, // <cast exp>
40,462, // <unary exp>
41,423, // <exp1>
42,213, // `-
43,438, // INTLIT
44,386, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,628, // letter128
56,52, // {199..218 231..250}
57,52, // {193..198 225..230}
59,25, // {"1".."9"}
60,175, // "0"
61,601, // digit128
62,575, // {176..185}
68,501, // "("
72,9, // "-"
  }
,
{ // state 528
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 529
7,414, // ID
15,156, // `(
39,222, // <cast exp>
41,330, // <exp1>
43,438, // INTLIT
44,386, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,628, // letter128
56,52, // {199..218 231..250}
57,52, // {193..198 225..230}
59,25, // {"1".."9"}
60,175, // "0"
61,601, // digit128
62,575, // {176..185}
68,501, // "("
  }
,
{ // state 530
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 531
7,412, // ID
15,138, // `(
39,206, // <cast exp>
41,314, // <exp1>
43,440, // INTLIT
44,394, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,626, // letter128
56,54, // {199..218 231..250}
57,54, // {193..198 225..230}
59,29, // {"1".."9"}
60,168, // "0"
61,599, // digit128
62,574, // {176..185}
68,501, // "("
  }
,
{ // state 532
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 533
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 534
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 535
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 536
22,MIN_REDUCTION+37, // `[
75,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 537
22,MIN_REDUCTION+112, // `[
63,64, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 538
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 539
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 540
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 541
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 542
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 543
0x80000000|362, // match move
0x80000000|298, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 544
2,196, // ws*
63,415, // ws
64,427, // " "
65,273, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 545
0x80000000|242, // match move
0x80000000|59, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 546
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 547
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 548
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 549
0x80000000|301, // match move
0x80000000|274, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 550
2,416, // ws*
63,485, // ws
64,292, // " "
65,383, // {10}
91,MIN_REDUCTION+73, // $NT
  }
,
{ // state 551
49,124, // "t"
  }
,
{ // state 552
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 553
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 554
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 555
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 556
2,523, // ws*
22,MIN_REDUCTION+109, // `[
63,395, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 557
2,480, // ws*
63,380, // ws
64,354, // " "
65,340, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 558
22,MIN_REDUCTION+85, // `[
75,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 559
53,17, // "o"
  }
,
{ // state 560
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 561
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 562
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 563
22,597, // `[
75,133, // "["
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 564
22,MIN_REDUCTION+78, // `[
75,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 565
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 566
22,MIN_REDUCTION+112, // `[
63,39, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 567
90,MIN_REDUCTION+0, // $
  }
,
{ // state 568
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
549, // ID
568, // `{
-1, // <decl in class>*
455, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
138, // `(
-1, // `)
474, // <stmt>*
146, // <type>
360, // `int
223, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
372, // <stmt>
245, // <assign>
-1, // `;
399, // <local var decl>
6, // <exp>
-1, // `=
467, // <exp8>
307, // <exp7>
14, // <exp6>
18, // <exp5>
393, // <exp4>
-1, // `+
83, // <exp3>
-1, // `*
89, // <exp2>
237, // <cast exp>
460, // <unary exp>
417, // <exp1>
215, // `-
440, // INTLIT
269, // letter
113, // "p"
113, // "v"
113, // "b"
113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
113, // "t"
113, // "c"
113, // "i"
113, // "l"
113, // "o"
113, // "u"
346, // letter128
191, // {199..218 231..250}
191, // {193..198 225..230}
-1, // digit
29, // {"1".."9"}
168, // "0"
599, // digit128
574, // {176..185}
-1, // ws
-1, // " "
-1, // {10}
368, // "#"
-1, // "*"
501, // "("
-1, // ")"
461, // "{"
21, // "}"
9, // "-"
-1, // "+"
-1, // "="
-1, // "["
-1, // "]"
-1, // ";"
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // idChar
-1, // "_"
-1, // idChar128
-1, // {223}
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 569
22,MIN_REDUCTION+112, // `[
63,35, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 570
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 571
2,114, // ws*
  }
,
{ // state 572
0x80000000|571, // match move
0x80000000|171, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 573
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 574
0x80000000|67, // match move
0x80000000|318, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 575
0x80000000|67, // match move
0x80000000|315, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 576
63,74, // ws
64,565, // " "
65,123, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 577
2,3, // ws*
63,291, // ws
64,157, // " "
65,518, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 578
2,82, // ws*
  }
,
{ // state 579
7,384, // ID
15,98, // `(
28,155, // <exp>
30,496, // <exp8>
31,2, // <exp7>
32,329, // <exp6>
33,332, // <exp5>
34,430, // <exp4>
36,121, // <exp3>
38,66, // <exp2>
39,267, // <cast exp>
40,487, // <unary exp>
41,374, // <exp1>
42,452, // `-
43,453, // INTLIT
44,342, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,594, // letter128
56,32, // {199..218 231..250}
57,32, // {193..198 225..230}
59,613, // {"1".."9"}
60,132, // "0"
61,572, // digit128
62,588, // {176..185}
68,501, // "("
72,9, // "-"
  }
,
{ // state 580
22,MIN_REDUCTION+90, // `[
75,MIN_REDUCTION+90, // "["
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 581
2,77, // ws*
  }
,
{ // state 582
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 583
7,384, // ID
15,98, // `(
28,153, // <exp>
30,496, // <exp8>
31,2, // <exp7>
32,329, // <exp6>
33,332, // <exp5>
34,430, // <exp4>
36,121, // <exp3>
38,66, // <exp2>
39,267, // <cast exp>
40,487, // <unary exp>
41,374, // <exp1>
42,452, // `-
43,453, // INTLIT
44,342, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,594, // letter128
56,32, // {199..218 231..250}
57,32, // {193..198 225..230}
59,613, // {"1".."9"}
60,132, // "0"
61,572, // digit128
62,588, // {176..185}
68,501, // "("
72,9, // "-"
  }
,
{ // state 584
2,148, // ws*
22,MIN_REDUCTION+109, // `[
63,371, // ws
64,165, // " "
65,188, // {10}
75,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 585
22,MIN_REDUCTION+41, // `[
75,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 586
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 587
22,MIN_REDUCTION+43, // `[
75,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 588
0x80000000|67, // match move
0x80000000|358, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 589
22,MIN_REDUCTION+84, // `[
75,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 590
22,MIN_REDUCTION+84, // `[
75,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 591
0x80000000|507, // match move
0x80000000|199, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 592
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 593
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 594
0x80000000|503, // match move
0x80000000|392, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 595
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 596
8,469, // `{
70,461, // "{"
  }
,
{ // state 597
7,384, // ID
15,98, // `(
28,134, // <exp>
30,496, // <exp8>
31,2, // <exp7>
32,329, // <exp6>
33,332, // <exp5>
34,430, // <exp4>
36,121, // <exp3>
38,66, // <exp2>
39,267, // <cast exp>
40,487, // <unary exp>
41,374, // <exp1>
42,452, // `-
43,453, // INTLIT
44,342, // letter
45,113, // "p"
46,113, // "v"
47,113, // "b"
48,113, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
49,113, // "t"
50,113, // "c"
51,113, // "i"
52,113, // "l"
53,113, // "o"
54,113, // "u"
55,594, // letter128
56,32, // {199..218 231..250}
57,32, // {193..198 225..230}
59,613, // {"1".."9"}
60,132, // "0"
61,572, // digit128
62,588, // {176..185}
68,501, // "("
72,9, // "-"
  }
,
{ // state 598
2,117, // ws*
63,234, // ws
64,561, // " "
65,530, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 599
0x80000000|581, // match move
0x80000000|135, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 600
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 601
0x80000000|578, // match move
0x80000000|115, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 602
22,MIN_REDUCTION+84, // `[
75,MIN_REDUCTION+84, // "["
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 603
63,331, // ws
64,58, // " "
65,625, // {10}
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 604
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 605
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 606
63,74, // ws
64,565, // " "
65,123, // {10}
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 607
22,MIN_REDUCTION+72, // `[
63,39, // ws
64,151, // " "
65,312, // {10}
75,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 608
0x80000000|261, // match move
0x80000000|592, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 609
63,331, // ws
64,58, // " "
65,625, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 610
2,250, // ws*
63,258, // ws
64,172, // " "
65,534, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 611
22,MIN_REDUCTION+72, // `[
63,35, // ws
64,149, // " "
65,335, // {10}
75,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 612
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 613
58,379, // digit
59,425, // {"1".."9"}
60,425, // "0"
61,60, // digit128
62,588, // {176..185}
80,515, // digit*
81,22, // $$1
  }
,
{ // state 614
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 615
58,382, // digit
59,425, // {"1".."9"}
60,425, // "0"
61,8, // digit128
62,575, // {176..185}
81,190, // $$1
  }
,
{ // state 616
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 617
22,MIN_REDUCTION+79, // `[
75,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 618
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 619
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 620
58,382, // digit
59,425, // {"1".."9"}
60,425, // "0"
61,11, // digit128
62,574, // {176..185}
81,187, // $$1
  }
,
{ // state 621
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 622
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 623
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 624
2,434, // ws*
63,415, // ws
64,427, // " "
65,273, // {10}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 625
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 626
0x80000000|439, // match move
0x80000000|338, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 627
23,512, // `]
76,126, // "]"
  }
,
{ // state 628
0x80000000|441, // match move
0x80000000|311, // no-match move
0x80000000|55, // NT-test-match state for <empty bracket pair>
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[629][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
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
// <type> ::= `int
(18<<16)+1,
// <type> ::= `boolean
(18<<16)+1,
// <type> ::= ID
(18<<16)+1,
// <type> ::= <type> <empty bracket pair>
(18<<16)+2,
// <empty bracket pair> ::= `[ `]
(21<<16)+2,
// <stmt> ::= <assign> `;
(24<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(24<<16)+3,
// <stmt> ::= `{ `}
(24<<16)+2,
// <stmt> ::= <local var decl> `;
(24<<16)+2,
// <assign> ::= <exp> `= <exp>
(25<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(27<<16)+4,
// <exp> ::= <exp8>
(28<<16)+1,
// <exp8> ::= <exp7>
(30<<16)+1,
// <exp7> ::= <exp6>
(31<<16)+1,
// <exp6> ::= <exp5>
(32<<16)+1,
// <exp5> ::= <exp4>
(33<<16)+1,
// <exp4> ::= <exp4> `+ <exp3>
(34<<16)+3,
// <exp4> ::= <exp3>
(34<<16)+1,
// <exp3> ::= <exp3> `* <exp2>
(36<<16)+3,
// <exp3> ::= <exp2>
(36<<16)+1,
// <exp2> ::= <cast exp>
(38<<16)+1,
// <exp2> ::= <unary exp>
(38<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(39<<16)+4,
// <cast exp> ::= `( <type> `) <exp1>
(39<<16)+4,
// <unary exp> ::= `- <unary exp>
(40<<16)+2,
// <unary exp> ::= <exp1>
(40<<16)+1,
// <exp1> ::= ID
(41<<16)+1,
// <exp1> ::= <exp1> !<empty bracket pair> `[ <exp> `]
(41<<16)+4,
// <exp1> ::= INTLIT
(41<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(44<<16)+1,
// letter128 ::= {193..218 225..250}
(55<<16)+1,
// digit ::= {"0".."9"}
(58<<16)+1,
// digit128 ::= {176..185}
(61<<16)+1,
// ws ::= " "
(63<<16)+1,
// ws ::= {10}
(63<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(20<<16)+4,
// `boolean ::= "#" "b" "o"
(20<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(19<<16)+4,
// `int ::= "#" "i" "t"
(19<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `* ::= "*" ws*
(37<<16)+2,
// `* ::= "*"
(37<<16)+1,
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
(42<<16)+2,
// `- ::= "-"
(42<<16)+1,
// `+ ::= "+" ws*
(35<<16)+2,
// `+ ::= "+"
(35<<16)+1,
// `= ::= "=" ws*
(29<<16)+2,
// `= ::= "="
(29<<16)+1,
// `[ ::= "[" ws*
(22<<16)+2,
// `[ ::= "["
(22<<16)+1,
// `] ::= "]" ws*
(23<<16)+2,
// `] ::= "]"
(23<<16)+1,
// `; ::= ";" ws*
(26<<16)+2,
// `; ::= ";"
(26<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(43<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(43<<16)+2,
// INTLIT ::= digit128 ws*
(43<<16)+2,
// INTLIT ::= digit128
(43<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(43<<16)+3,
// INTLIT ::= "0" $$2
(43<<16)+2,
// idChar ::= letter
(84<<16)+1,
// idChar ::= digit
(84<<16)+1,
// idChar ::= "_"
(84<<16)+1,
// idChar128 ::= letter128
(86<<16)+1,
// idChar128 ::= digit128
(86<<16)+1,
// idChar128 ::= {223}
(86<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(88<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(89<<16)+1,
// digit* ::= digit* digit
(80<<16)+2,
// digit* ::= digit
(80<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(82<<16)+2,
// hexDigit* ::= hexDigit
(82<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// idChar* ::= idChar* idChar
(78<<16)+2,
// idChar* ::= idChar
(78<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// $$0 ::= idChar128 ws*
(79<<16)+2,
// $$0 ::= idChar128
(79<<16)+1,
// $$1 ::= digit128 ws*
(81<<16)+2,
// $$1 ::= digit128
(81<<16)+1,
// $$2 ::= hexDigit128 ws*
(83<<16)+2,
// $$2 ::= hexDigit128
(83<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
-1, // 9
65, // 10
-1, // 11
-1, // 12
-1, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
64, // " "
-1, // "!"
-1, // '"'
66, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
68, // "("
69, // ")"
67, // "*"
73, // "+"
-1, // ","
72, // "-"
-1, // "."
-1, // "/"
60, // "0"
59, // "1"
59, // "2"
59, // "3"
59, // "4"
59, // "5"
59, // "6"
59, // "7"
59, // "8"
59, // "9"
-1, // ":"
77, // ";"
-1, // "<"
74, // "="
-1, // ">"
-1, // "?"
-1, // "@"
48, // "A"
48, // "B"
48, // "C"
48, // "D"
48, // "E"
48, // "F"
48, // "G"
48, // "H"
48, // "I"
48, // "J"
48, // "K"
48, // "L"
48, // "M"
48, // "N"
48, // "O"
48, // "P"
48, // "Q"
48, // "R"
48, // "S"
48, // "T"
48, // "U"
48, // "V"
48, // "W"
48, // "X"
48, // "Y"
48, // "Z"
75, // "["
-1, // "\"
76, // "]"
-1, // "^"
85, // "_"
-1, // "`"
48, // "a"
47, // "b"
50, // "c"
48, // "d"
48, // "e"
48, // "f"
48, // "g"
48, // "h"
51, // "i"
48, // "j"
48, // "k"
52, // "l"
48, // "m"
48, // "n"
53, // "o"
45, // "p"
48, // "q"
48, // "r"
48, // "s"
49, // "t"
54, // "u"
46, // "v"
48, // "w"
48, // "x"
48, // "y"
48, // "z"
70, // "{"
-1, // "|"
71, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
62, // 176
62, // 177
62, // 178
62, // 179
62, // 180
62, // 181
62, // 182
62, // 183
62, // 184
62, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
57, // 193
57, // 194
57, // 195
57, // 196
57, // 197
57, // 198
56, // 199
56, // 200
56, // 201
56, // 202
56, // 203
56, // 204
56, // 205
56, // 206
56, // 207
56, // 208
56, // 209
56, // 210
56, // 211
56, // 212
56, // 213
56, // 214
56, // 215
56, // 216
56, // 217
56, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
87, // 223
-1, // 224
57, // 225
57, // 226
57, // 227
57, // 228
57, // 229
57, // 230
56, // 231
56, // 232
56, // 233
56, // 234
56, // 235
56, // 236
56, // 237
56, // 238
56, // 239
56, // 240
56, // 241
56, // 242
56, // 243
56, // 244
56, // 245
56, // 246
56, // 247
56, // 248
56, // 249
56, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
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
"digit* ::= digit* digit", // 94
"digit* ::= digit* digit", // 95
"<decl in class>* ::= <decl in class>* <decl in class>", // 96
"<decl in class>* ::= <decl in class>* <decl in class>", // 97
"hexDigit* ::= hexDigit* hexDigit", // 98
"hexDigit* ::= hexDigit* hexDigit", // 99
"<stmt>* ::= <stmt>* <stmt>", // 100
"<stmt>* ::= <stmt>* <stmt>", // 101
"idChar* ::= idChar* idChar", // 102
"idChar* ::= idChar* idChar", // 103
"<class decl>+ ::= <class decl>", // 104
"<class decl>+ ::= <class decl>+ <class decl>", // 105
"ws* ::= ws* ws", // 106
"ws* ::= ws* ws", // 107
"", // 108
"", // 109
"", // 110
"", // 111
"", // 112
"", // 113
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 14: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 15: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 16: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 17: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 18: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 19: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 20: <exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 21: <exp8> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 22: <exp7> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <exp6> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 24: <exp5> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <exp4> ::= <exp4> [#] `+ <exp3> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 26: <exp4> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <exp3> ::= <exp3> [#] `* <exp2> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 28: <exp3> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp2> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <exp2> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 32: <cast exp> ::= [#] `( <type> `) <exp1> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 33: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 34: <unary exp> ::= <exp1> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp1> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 36: <exp1> ::= <exp1> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 37: <exp1> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 38: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 40: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 42: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 43: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 44: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 45: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 46: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 47: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 48: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 49: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 50: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 51: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 52: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 53: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 55: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 56: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 57: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 58: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 59: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 60: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 61: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 62: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 63: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 64: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 65: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 66: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 67: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 68: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 77: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 78: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 79: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 80: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 81: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 82: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 83: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 84: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 85: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 86: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 87: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 88: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 89: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 90: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 91: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 92: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 93: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 94: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 95: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 96: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 97: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 98: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 99: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 100: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 101: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 102: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 103: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 104: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 105: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 106: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 107: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 108: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 109: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 110: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 111: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 112: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: $$2 ::= hexDigit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((23<<5)|0x5)/*methodCall:23*/,
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
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 9: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 10: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 11: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 18: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 19: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 21: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 23: {
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
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlock(int,List<Statement>)",
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
"Exp newPlus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
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
1,1,
1,1,
2,1,
3,1,
2,1,
3,1,
4,1,
3,1,
3,1,
3,1,
2,1,
2,1,
3,1,
2,1,
1,1,
3,1,
1,1,
3,1,
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
    1,
    1,
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    1,
    1,
    1,
    0,
    1,
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
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    0,
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
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    1,
    -1,
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
