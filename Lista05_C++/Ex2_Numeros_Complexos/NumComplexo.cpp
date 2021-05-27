#include <cstdlib>
#include <iostream>
#include <string>
#include <cmath>

using namespace std;

class NumComplexo{
    private:
        double real;
        double imaginario;
    
    public:
        NumComplexo(double iReal, double iImaginario){
            real = iReal;
            imaginario = iImaginario;
        };

        NumComplexo* Soma(NumComplexo* iC1, NumComplexo* iC2){
            double rRes, rImag;
            rRes = iC1->real + iC2->real; 
            rImag = iC1->imaginario + iC2->imaginario; 

            NumComplexo *res = new NumComplexo(rRes, rImag);
            return res;
        };

        NumComplexo* Subtracao(NumComplexo* iC1, NumComplexo* iC2){
            double rRes, rImag;
            rRes = iC1->real - iC2->real; 
            rImag = iC1->imaginario - iC2->imaginario; 

            NumComplexo *res = new NumComplexo(rRes, rImag);
            return res;
        };

        NumComplexo* Multiplicao(NumComplexo* iC1, NumComplexo* iC2){
            double rRes, rImag;
            rRes = (iC1->real)*(iC2->real) - (iC1->imaginario)*(iC2->imaginario);
            rImag = (iC1->real)*(iC2->imaginario) - (iC1->imaginario)*(iC2->real);

            NumComplexo *res = new NumComplexo(rRes, rImag);
            return res;
        };

        double Modulo(NumComplexo* iC){
            double rRes, rImag, res;

            rRes = pow((iC->real),2);
            rImag = pow((iC->imaginario),2);

            res = sqrt(rRes + rImag);
            return res;
        };
};
