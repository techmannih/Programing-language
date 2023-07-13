// SPDX-License-Identifier:GPL-3.0

pragma solidity >=0.5.0 <0.9.0;

contract Idendity {
    string name;
    uint age;

     constructor() public 
    {
        name = "manish";
        age = 14;
    }

    function getName() public view returns (string memory) 
    {
        return name;
    }
    function getAge() public view returns (uint) 
    {
        return age;
    }
    function setAge() public 
    {
        age =age*2;
    }
}
