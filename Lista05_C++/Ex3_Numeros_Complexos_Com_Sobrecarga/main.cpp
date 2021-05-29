#include <cstdlib>
#include <iostream>
#include "NumComplexo.cpp"

using namespace std;

int main(int argc, char *argv[]){
    
    NumComplexo *z1 = new NumComplexo(6, 5);    
    NumComplexo *z2 = new NumComplexo(2, -1);    
    /*
    NumComplexo z1(6, 5);    
    NumComplexo z2(2, -1);    
    */

    z1->printNum();
    NumComplexo *res = z1+z2;
//    z1.Soma(z2);
    res->printNum();

    z1->Subtracao(z2);
    z1->printNum();

    z1->Multiplicacao(z2);
    z1->printNum();


    double modulo = z1->Modulo();
    cout << modulo << endl;


    return 0;
}
