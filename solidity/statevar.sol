// SPDX-License-Identifier:GPL-3.0

pragma solidity >=0.5.0 <0.9.0;
//   1
contract state
{
    uint public age=20;
    // age =19; no no no  
    // after change deploy and compile again like
    // uint public name=30;
}

// 2

// contract state
// {
//     uint public age;
//     // age =19; no no no  

//     constructor () public 
//     {
//         age =20;
//     }
// }


// 3  contract state
// {
//     uint public age=20;
//     // age =19; no no no 
//     function setAge() public 
//     {
//         age=20;
//     } 
// }

