#include <iostream>
#include "classe_generica.cpp"

using namespace std;

int main(){
    int iX = 23;
    int iY = 40;
    GenericClass<int> *iGC = new GenericClass(iX, iY);

    cout << "GC<int>:\n\tgetMax(" << iGC->getX() << ", " << iGC->getY() << "): " << iGC->getMax() << endl; 

    double dX = 11.8;
    double dY = 4.9;
    GenericClass<double> *dGC = new GenericClass(dX, dY);

    cout << "\nGC<double>: \n\tgetMin(" << dGC->getX() << ", " << dGC->getY() << "): " << dGC->getMin() << endl; 

    float fX = 6.2;
    float fY = 20;
    GenericClass<float> *fGC = new GenericClass(fX, fY);

    cout << "\nGC<float>: \n\tgetSum(" << fGC->getX() << ", " << fGC->getY() << "): " << fGC->getSum() << endl; 

    delete(iGC);
    delete(dGC);
    delete(fGC);

    return 0;
}
