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

        void Soma(NumComplexo* Z){
            double rRes, rImag;
            rRes = real + Z->real; 
            rImag = imaginario + Z->imaginario; 

            real = rRes;
            imaginario = rImag;
            return;
        };

        void Subtracao(NumComplexo* Z){
            double rRes, rImag;
            rRes = real - Z->real; 
            rImag = imaginario - Z->imaginario; 

            real = rRes;
            imaginario = rImag;
            return;
        };

        void Multiplicacao(NumComplexo* Z){
            double rRes, rImag;
            rRes = (real)*(Z->real) - (imaginario)*(Z->imaginario);
            rImag = (real)*(Z->imaginario) - (imaginario)*(Z->real);

            real = rRes;
            imaginario = rImag;
            return;
        };

        double Modulo(){
            double rRes, rImag, res;

            rRes = pow((real),2);
            rImag = pow((imaginario),2);

            res = sqrt(rRes + rImag);
            return res;
        };

        double getReal(){
            return real;
        };

        double getImaginario(){
            return imaginario;
        };

        void printNum(){
            if (imaginario >= 0)  
                cout << real << "+" << imaginario << "i" << endl;
            else 
                cout << real << imaginario << "i" << endl;

            return;
        };
};
