There are 26 letters in the English alphabet and 6 of them are vowels: a,e,i,o,u,y. Other 20 letters are called consonants.

Limak is a little polar bear. He found a string s consisting of lowercase English letters. He is going to read and pronounce s but it may be hard for him. Some letters are harder to pronounce, some are easier. Generally, little polar bears like vowels (letters a,e,i,o,u,y) and hate consonants.

Your task is to check whether pronouncing s will be hard or easy. We define s to be hard if at least one of the two conditions holds true:

1. There are more consonants than vowels.
2. Some 3 consecutive letters are all consonants.
For each test case in one line print "hard" (without the quotes) if s is hard to pronounce. Otherwise, print "easy" (without the quotes).

Input format

The first line of the input contains one integer T denoting the number of test cases.

The first line of each test case description contains one string s denoting a string found by Limak. Each character in s is one of 26 lowercase English letters.

Output format

For each test case, output a single line containing the answer � either "hard" or "easy".

Constraints

1<=T<=50
1<=|s|<=50
SAMPLE INPUT 
5
qiewldoaa
life
ayayayyy
szczebrzeszyn
gg
SAMPLE OUTPUT 
hard
easy
easy
hard
hard
Explanation
In the first sample test case, Limak found a string "qiewldoaa". It's hard to pronounce because there are 3 consecutive consonants: w,l,d.

In the last sample test case, a string "gg" is hard to pronounce because it contains more consonants than vowels.