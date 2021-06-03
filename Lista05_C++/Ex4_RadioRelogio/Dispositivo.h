#ifndef DISPOSITIVO_H
#define	DISPOSITIVO_H
#include <string>	
using namespace std;
class Dispositivo{
    public:
        string fabricante;
        void setFabricante(string fabricante);
        string getFabricante();
        virtual void liga() = 0;
        virtual void desliga() = 0;
};
#endif