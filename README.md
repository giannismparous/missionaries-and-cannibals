# Missionaries and Cannibals Problem with A* 

## Objective
The objective of this project was to develop an AI algorithm in order to be able to solve the well known Missionaries and Cannibals Problem in acceptable time.
The algorithm we used is A*. 

## g(n)

The cost to move the boat from one side to the other is 1. So **g(n) =** the numbers of boat movements.

## h(n)
The heuristic we used is the following (assuming n = missionaries on the left side + cannibals on the left side):
<br><br>
**h(n)=**
- 2*n, when the boat is on the right side & n > 0
- 2*n - 3, when the boat is on the left side & n > 1
- 1, when the boat is on the left & n = 1
- 0, when n=0

## Setting up 
Compile the java files in the src folder and execute the Main file. Or just drag and drop the java files in your IDE and run the Main class from there.

## Execution parameters

-N = Number of missionaries and cannibals each, meaning N cannibals & N missionaries 
-M = Number of people that can be on the boat  
-K = Number of transfers the algorithm can make, if exceeded the algorithm stops

## Execution examples & outcomes

<p align="center">
  <img src="https://github.com/giannismparous/missionaries-and-cannibals/blob/main/imgs/10.png" />
</p>
<p align="center">
  <img src="https://github.com/giannismparous/missionaries-and-cannibals/blob/main/imgs/30.png" />
</p>

Authors; [Giannis Mparous](https://github.com/giannismparous "Giannis Mparous"), [Dimitris Milios](https://github.com/DimMil24 "Dimitris Milios")
