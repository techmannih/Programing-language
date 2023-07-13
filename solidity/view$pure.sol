// SPDX-License-Identifier:GPL-3.0

pragma solidity >=0.5.0 <0.9.0;

contract local {
uint public age =33;
// function getter () public view returns(uint) /// use of view only for read ya return without any change and no write anothers
// {
// return age;
// }

function getter () public pure returns(uint) /// use of pure for write something inside a function
{
    uint marks =385;
    return marks;
   
}


}