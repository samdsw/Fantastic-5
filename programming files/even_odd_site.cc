#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ofstream file;
    file.open("numbers.html"); 
    file << "<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n"; // formats an html table of numbers
    file << "<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n";
    for (int i = 1; i <= 50; i++) {
        if (i % 2 == 0) {
            file << "<tr><td>" << i << "</td><td></td></tr>\n"; // even number column
        }
        else {
            file << "<tr><td></td><td>" << i << "</td></tr>\n"; // odd number column
        }
    }
    file << "</table>\n</body>\n</html>";
    file.close(); // saves file
    ifstream input("numbers.html");
    cout << input.rdbuf(); // prints file
    input.close();
    return 0;
}
