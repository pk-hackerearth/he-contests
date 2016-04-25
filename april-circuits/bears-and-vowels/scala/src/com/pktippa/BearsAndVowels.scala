package com.pktippa

import util.control.Breaks._
object BearsAndVowels {
  val vowels = List("a","e","i","o","u","y");
  def main(args: Array[String]) {
    // Read noOfTestCases from command line.
    var noOfTestCases = readInt();
    // Initialize String of Arrays 
    var inputStrings = new Array[String](noOfTestCases);
    // Read each Test case till all test cases are taken as input
    for(n <- 0 until noOfTestCases){
      inputStrings(n) = readLine();
    }
    // Looping through all the given test case strings
    for(m <- 0 until inputStrings.length){
      // Checking whether inputString has more Consonants than vowels
      if(moreConsonantsThanVowels(inputStrings(m))) {
        println("hard");
      } 
      // Checking if the 3 consecutive Letters are consonants
      else if(is3ConsecutiveLettersConsonants(inputStrings(m))){
        println("hard");
      }
      // Neither of above two conditions met
      else{
        println("easy");
      }
    }    
  }
  // Method moreConsonantsThanVowels
  // Accepts inputString : String
  // Return Boolean
  def moreConsonantsThanVowels(inputString:String): Boolean = {
    var noC = 0; // initializing no of consonants to zero
    var noV = 0; // initializing no of vowels to zero
    for(n <- 0 until inputString.length){
      if(vowels.contains(inputString.charAt(n).toString)){ // Checking whether vowels contains the String or not
        noV+=1; // Incrementing no of vowels
      }else{
        noC+=1; // Incrementing no of consonants
      }
    }
    // Checking if no of consonants less than or equal to no of vowels
    if(noC <= noV){
      false // Returning false
    }else{
      true // Returning true
    }
  }
  
  // Method is3ConsecutiveLettersConsonants
  // Accepts inputString : String
  // Return Boolean
  def is3ConsecutiveLettersConsonants(inputString:String) : Boolean = {
    var isTrue = false; // Initializing isTrue - false
    var isBreak = false; // Initializing isBreak - false
    breakable { // Outside breakable where the 3 consecutive letters are consonants
      // Looping through all characters till the inputString length
      for(n <- 0 until inputString.length){
        breakable { // Inner breakable where current letter is a vowel
          if(vowels.contains(inputString.charAt(n).toString)){ 
            break;
          }else{
            var next1Char = ""; // Initializing next1Char to empty
            var next2Char = ""; // Initializing next2Char to empty
            if(n+1 < inputString.length) // Checking next letter is not out of index
              next1Char = inputString.charAt(n+1).toString // Getting string to next1Char
            if(n+2 < inputString.length) // Checking next to next letter is not out of index
              next2Char = inputString.charAt(n+2).toString // Getting string to next2Char
            if(next1Char == "" || next2Char == ""){ // Got index out of bound
              break; // Breaking inner breakable
            }else{
              if(!vowels.contains(next1Char) && !vowels.contains(next2Char)){ // Next two letters are not vowels => they are consonants
                isBreak = true; // setting isBreak to true to break outer breakable
                isTrue = true; // setting isTrue to true to return 3 consecutive letters are consonants
                break;
              }
            }
          }
        }
        if(isBreak) break;
      }
    }
    
    isTrue  // Returning isTrue
  }
}