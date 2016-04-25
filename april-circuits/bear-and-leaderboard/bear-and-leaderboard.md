Limak is a brown bear, experienced in organizing programming contests. Today, his only responsibility is to watch the leaderboard and make sure that everything is displayed correctly.

There are n participants, numbered 1 through n. Initially, every participant has 0 points. During the contest participants will gain more points and thus the leaderboard may change.

You are given q queries (events). The i-th query contains two integers ai and bi. It denotes that a participant ai gets bi points (his/her number of points is increased by bi).

For each participant, his or her place is equal to the number of participants with more points, increased by 1. You may refer to the sample explanation for an example.

Let's define hash of participant as the product of his/her place and the number of points. After each query, Limak is going to find the sum of hashes of participants. Can you help him? After each query, print one line with the sum of hashes of participants.

Input format

The first line of the input contains two integers n and q — the number of participants and the number of queries, respectively.

The next q lines describe queries. The i-th of them contains two integers ai and bi — the participant index and the number of gained points in the i-th query.

Output format

After each query, output a single line containing the sum of hashes of participants.

Constraints

1<=n, q <= 500000
1<=ai<=n
1<=bi<=10^6
Subtasks

Extra constraints	Points	Which tests
n,q<=2000	         25	      1-10
bi=5	             25	      11-20
each participant will have at most 10^6 points	25	21-30
no extra constraints	25	31-40
SAMPLE INPUT 
4 6
3 100
2 60
1 80
2 20
1 20
4 17
SAMPLE OUTPUT 
100
220
440
420
440
508
Explanation
In the sample test, there are n=4 participants. Initially, all of them have 0 points, so they all have the 1-st place ex aequo.

After the first query, participant 3 has 100 points and is winning, with hash equal to 1*100=100. The sum of hashes is 100+0+0+0=100.

After the second query, participant 2 has the second place with 60 points and hash 2*60=120, in total 100+120+0+0=220.

After the third query, the leaderboard looks like follows: (100,80,60,0). The sum of hashes is 
100*1+80*2+60*3+0*4=100+160+180=440.

In the fourth query participant 2 gets 20 points and the leaderboard is (100,80,80,0) then, with the sum 
100*1+80*2+80*2+0*4=420.

After the fifth query, the answer is 
100*1+100*1+80*3+0=440.

After the last query, 
100*1+100*1+80*3+17*4=508.