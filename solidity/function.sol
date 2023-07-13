// SPDX-License-Identifier:GPL-3.0

pragma solidity >=0.5.0 <0.9.0;

contract local {


    uint256 public  age = 19; // here public keyword is use it work as a getter function in state  var then we get a function without use of getter function

    
    // uint256 age = 19;

    // function getter()
    //     public
    //     view
    //     returns (
    //         uint256 // use of view simple return age without anychange
    //     )
    // {
    //     return age;
    // }

    // function setter()
    //     public
    // // no use of view of pure due to modification of age and no use return due to kuch return nhi kr rhe hai hm
    // {
    //     age = age + 3;
    // }




    function setter(uint newage)
        public
    // no use of view of pure due to modification of age and no use return due to kuch return nhi kr rhe hai hm
    {
        age = newage;
    }
}
