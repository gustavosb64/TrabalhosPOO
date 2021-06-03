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

        NumComplexo operator+(NumComplexo Z){
            double r = real + Z.real;
            double i = imag + Z.imag;
        
            return NumComplexo(r,i);
        }

        NumComplexo operator-(NumComplexo Z){
            double r = real - Z.real;
            double i = imag - Z.imag;
        
            return NumComplexo(r,i);
        }

        NumComplexo operator*(NumComplexo Z){
            double r = (real)*(Z.real) - (imag)*(Z.imag);
            double i = (real)*(Z.imag) + (imag)*(Z.real); 
        
            return NumComplexo(r,i);
        }

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


