// SPDX-License-Identifier:GPL-3.0

pragma solidity >=0.5.0 <0.9.0;

contract local 
{


        // string  name="manish ";  // state : memory kwyword not use here
    function store () pure public returns (uint)
    {
        string memory name="manish "; //local memory is use here
        uint age =1;
        return age ;

    }
}