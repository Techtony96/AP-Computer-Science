package me.Techtony96.QuarterTwo;

import me.Techtony96.Utilities.BlockLetters;

public class MrAscii_500a {

	/* Program Name: Mr. Ascii
	 * Version: 1.0
	 * 
	 * Author: Tony Pappas
	 * Date: 11/20/14
	 * Platform: Java 1.6
	 * 
	 * Description: Mr. Ascii Program
	 */


	public static void main(String[] args) {

		for (char c = ' '; c <= 'Z'; ++c) {
			System.out.print(c);
			System.out.print(" ");
			System.out.print((int) c);
			System.out.print(" ");
			System.out.print((char) (c + 32));
			System.out.print(" ");
			System.out.println(c + 32);
		}

		BlockLetters.TONY_PAPPAS.outputBlockName();
	}



}
/*
What I Learned:
Ascii stuff

Difficulties I had:
None

Sample Output:
  32 @ 64
! 33 A 65
" 34 B 66
# 35 C 67
$ 36 D 68
% 37 E 69
& 38 F 70
' 39 G 71
( 40 H 72
) 41 I 73
* 42 J 74
+ 43 K 75
, 44 L 76
- 45 M 77
. 46 N 78
/ 47 O 79
0 48 P 80
1 49 Q 81
2 50 R 82
3 51 S 83
4 52 T 84
5 53 U 85
6 54 V 86
7 55 W 87
8 56 X 88
9 57 Y 89
: 58 Z 90
; 59 [ 91
< 60 \ 92
= 61 ] 93
> 62 ^ 94
? 63 _ 95
@ 64 ` 96
A 65 a 97
B 66 b 98
C 67 c 99
D 68 d 100
E 69 e 101
F 70 f 102
G 71 g 103
H 72 h 104
I 73 i 105
J 74 j 106
K 75 k 107
L 76 l 108
M 77 m 109
N 78 n 110
O 79 o 111
P 80 p 112
Q 81 q 113
R 82 r 114
S 83 s 115
T 84 t 116
U 85 u 117
V 86 v 118
W 87 w 119
X 88 x 120
Y 89 y 121
Z 90 z 122
 
 _____                   ____                              
|_   _|__  _ __  _   _  |  _ \ __ _ _ __  _ __   __ _ ___  
  | |/ _ \| '_ \| | | | | |_) / _` | '_ \| '_ \ / _` / __| 
  | | (_) | | | | |_| | |  __/ (_| | |_) | |_) | (_| \__ \ 
  |_|\___/|_| |_|\__, | |_|   \__,_| .__/| .__/ \__,_|___/ 
                 |___/             |_|   |_|               
 


 */