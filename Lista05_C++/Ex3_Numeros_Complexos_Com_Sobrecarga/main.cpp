#include <cstdlib>
#include <iostream>
#include "NumComplexo.cpp"

using namespace std;

int main(int argc, char *argv[]){

    NumComplexo z1(6, 5);    
    NumComplexo z2(2, -1);    

    z1.printNum();
    NumComplexo res = z1+z2;
    res.printNum();

    res = res-z2;
    res.printNum();

    res = res*z2;
    res.printNum();

    double modulo = res.Modulo();
    cout << modulo << endl;

    return 0;
}
