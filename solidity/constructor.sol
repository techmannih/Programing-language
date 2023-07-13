// SPDX-License-Identifier:GPL-3.0

pragma solidity >=0.5.0 <0.9.0;

contract local 

{
 uint public count ;
//  constructor ()
//  {
//      count =6;
//  }


constructor (uint newage)  // by passing argument and must be use value at the time of deploy
 {
     count =newage;
 }
}