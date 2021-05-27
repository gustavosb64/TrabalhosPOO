#include <cstdlib>
#include <iostream>
#include "NumComplexo.cpp"

using namespace std;

int main(int artc, char *argv[]){
    
    NumComplexo *z1 = new NumComplexo(6, 5);    
    NumComplexo *z2 = new NumComplexo(2, -1);    

    z1->printNum();
    z1->Soma(z2);
    z1->printNum();

    z1->Subtracao(z2);
    z1->printNum();

    z1->Multiplicacao(z2);
    z1->printNum();


    double modulo = z1->Modulo();
    cout << modulo << endl;

    delete(z1);
    delete(z2);

    return 0;
}
