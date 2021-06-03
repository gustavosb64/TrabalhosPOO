#include <cstdlib>
#include <iostream>
#include <string>
#include <cmath>

using namespace std;

class NumComplexo{
    private:
        double real;
        double imag;
    
    public:
        NumComplexo(){};
        
        NumComplexo(double iReal, double iImaginario){
            real = iReal;
            imag = iImaginario;
        };

        void Soma(NumComplexo* Z){
            this->real += Z->real; 
            this->imag += Z->imag; 

            return;
        };

        void Subtracao(NumComplexo* Z){
            this->real -= Z->real; 
            this->imag -= Z->imag; 

            return;
        };

        void Multiplicacao(NumComplexo* Z){
            double rReal, rImag;
            rReal = (real)*(Z->real) - (imag)*(Z->imag);
            rImag = (real)*(Z->imag) + (imag)*(Z->real);

            real = rReal;
            imag = rImag;
            return;
        };

        double Modulo(){
            double rReal, rImag, res;

            rReal = pow(real,2);
            rImag = pow(imag,2);

            res = sqrt(rReal + rImag);
            return res;
        };

        double getReal(){
            return real;
        };

        double getImag(){
            return imag;
        };

        void printNum(){
            if (imag >= 0)  
                cout << real << "+" << imag << "i" << endl;
            else 
                cout << real << imag << "i" << endl;

            return;
        };
};
