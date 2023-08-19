// #include <iostream>
// using namespace std;

// int main() {
//   const int minutesPerHour = 60;
//   const float PI = 3.14;
//   cout << minutesPerHour << "\n";
//   cout << PI;
//   return 0;
// }




//  taking string input 
#include <iostream>
#include <string>
using namespace std;

int main() {
  string fullName;
  cout << "Type your full name: ";
  getline (cin, fullName);
  cout << "Your name is: " << fullName;
  return 0;
}
