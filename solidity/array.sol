// SPDX-License-Identifier:GPL-3.0

pragma solidity >=0.5.0 <0.9.0;

contract local {
    uint[4] public arr =[1,2,3,4];
    
    function setter (uint index,uint value) public 
    {
        arr[index]=value;
    }
  
//   function lenght()public  view returns (uint)
//   {
//       return arr.lenght();
//   }
//   function pushElement(uint item) public 
//   {arr.push(item);
//   }
//   function popElement ()public 
//   {
//       arr.pop();
//   }
}