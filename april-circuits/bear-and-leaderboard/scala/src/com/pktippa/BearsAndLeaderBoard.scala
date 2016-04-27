package com.pktippa

import collection.immutable.ListMap
import collection.mutable.Map
object BearsAndLeaderBoard {
  def main(args: Array[String]) {
    // Reading input with spaces which constitute of noOfPlayers and Test cases
    var inputWithSpaces = readLine().split(" ");
    // Getting noOfPlayersAndTestCases from given input
    var noOfPlayersAndTestCases :Array[Int] = inputWithSpaces.map(x=>x.toInt);
    // Getting noOfPlayers from noOfPlayersAndTestCases
    var noOfPlayers = noOfPlayersAndTestCases(0);
    // Initializing new mutable Map
    var map = Map[Int,Int]();
    // Setting all default values of 1 to noOfPlayers with (n->0)
    for(n <- 1 to noOfPlayers){
      map+=(n->0); // Adding element to Map
    }
    // Getting noOfTestCases from noOfPlayersAndTestCases
    var noOfTestCases = noOfPlayersAndTestCases(1);
    // Initializing inputArray with size of noOfTestCases
    var inputArray = new Array[String](noOfTestCases);
    // Reading input from command line and assigning values to array
    for(n <- 0 until noOfTestCases){
      inputArray(n) = readLine();
    }
    // Looping through 0 until inputArray.length 
    for(n <- 0 until inputArray.length){
      // Getting player id and score from given input
      var input = inputArray(n).split(" ").map(x=>x.toInt)
      // Updating map with original value + new value from input
      map(input(0)) = (map(input(0)) + input(1));
      // Calling getLeaderBoardHash to get the hash result
      println(getLeaderBoardHash(map));
    }
  }
  // Method getLeaderBoardHash - which generates Leader board hash
  // Accepts map: Map[Int,Int]
  // Returns hash : Int
  def getLeaderBoardHash(map: Map[Int,Int]): Int = {
    // Converting map to Seq - map.toSeq
    // Sorting Seq with second element in descending order based on value of map - map.toSeq.sortWith(_._2 >= _._2) 
    // Getting all elements :_*
    // Getting ListMap
    // Converting ListMap to List
    var sortedResult = ListMap(map.toSeq.sortWith(_._2 >= _._2):_*).toList
    // Initializing rank to 1
    var rank = 1;
    // Initializing count to 1
    var count = 1;
    // Initializing hash to 0
    var hash = 0
    // Looping through all elements in the sortedResult list
    for(n <- 0 until sortedResult.size){
      if(n!=0 && n != sortedResult.size) {
        // Comparing previous element with next element by value _2
        if(sortedResult(n-1)._2 == sortedResult(n)._2){
          // Incrementing count
          count += 1;
        }else {
          // Increment rank by count, set count to 1
          rank += count;
          count = 1;
        }
      }
      // Calculating hash
      hash += (rank*sortedResult(n)._2);
    }
    
    // Returning hash
    hash 
  }
}