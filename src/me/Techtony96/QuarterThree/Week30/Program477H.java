package me.Techtony96.QuarterThree.Week30;

import java.util.ArrayList;
import java.util.Collections;

public class Program477H {

	//main method
	public static void main(String[] args) {
		//table header
		System.out.println("Beans\tBlack\tWhite\tLast");
		//this is the bag
		ArrayList<Bean> list = new ArrayList<Bean>();
		//loop through 10-60 beans
		for (int i = 10; i <= 60; i++) {
			//clear list from last time
			list.clear();
			//output number of beans in the bag
			System.out.print(i + "\t");
			//add random beans to the bag
			for (int count = 0; count < i; count++) {
				if (Math.random() < 0.5) {
					list.add(Bean.WHITE);
				} else {
					list.add(Bean.BLACK);
				}
			}
			//output number of beans in the bag
			System.out.print(Collections.frequency(list, Bean.BLACK) + "\t");
			System.out.print(Collections.frequency(list, Bean.WHITE) + "\t");
			//output last bean in the bag
			System.out.print(takeOut(list).getName() + "\n");
		}
	}

	//Find last bean
	private static Bean takeOut(ArrayList<Bean> list) {
		while (list.size() > 1) {
			//get two random beans
			Bean one = list.get((int) Math.random() * list.size());
			Bean two = list.get((int) Math.random() * list.size());
			//if they are both black
			if (one == Bean.BLACK && two == Bean.BLACK) {
				list.remove(Bean.BLACK);
			} else if (one == Bean.WHITE && two == Bean.WHITE) {
				//both white
				list.remove(Bean.WHITE);
				list.remove(Bean.WHITE);
				list.add((int) Math.random() * list.size(), Bean.BLACK);
			} else {
				//opposite colors
				list.remove(Bean.WHITE);
			}
		}
		//return result
		return list.get(0);
	}

	//Beans in the bag
	private enum Bean {
		WHITE("White"), BLACK("Black");
		String s;

		Bean(String s) {
			this.s = s;
		}

		public String getName() {
			return s;
		}
	}
}
// It is impossible to determine which bean will be left in the bag.
/* Sample Output

Beans	Black	White	Last
10	5	5	Black
11	7	4	White
12	3	9	Black
13	6	7	White
14	5	9	Black
15	7	8	Black
16	7	9	White
17	6	11	Black
18	16	2	Black
19	6	13	Black
20	10	10	Black
21	14	7	Black
22	9	13	White
23	12	11	Black
24	14	10	Black
25	13	12	Black
26	16	10	Black
27	12	15	Black
28	15	13	Black
29	14	15	Black
30	15	15	Black
31	15	16	White
32	17	15	Black
33	19	14	Black
34	12	22	Black
35	16	19	White
36	15	21	Black
37	20	17	Black
38	18	20	White
39	23	16	Black
40	21	19	Black
41	14	27	Black
42	24	18	Black
43	12	31	Black
44	20	24	White
45	26	19	Black
46	21	25	White
47	28	19	Black
48	24	24	White
49	26	23	Black
50	24	26	Black
51	25	26	Black
52	24	28	Black
53	23	30	White
54	24	30	White
55	33	22	Black
56	30	26	Black
57	26	31	White
58	30	28	White
59	34	25	Black
60	31	29	Black

*/
