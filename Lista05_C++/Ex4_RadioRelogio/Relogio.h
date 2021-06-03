#ifndef RELOGIO_H
#define	RELOGIO_H
#include <string>
#include<time.h>	
#include "Dispositivo.h"
using namespace std;

class Relogio: public Dispositivo{
    public:
       string hora = "00";
       string  minutos = "00";

       string horaAlarme;
       string  minutosAlarme;

        Relogio();
        Relogio(int hora, int minutos);
        void exibeHora();
        void definirHora(string hora, string minutos);
        void definirAlarme(string horaAlarme, string minutosAlarme);
        void liga();
        void desliga();
};

#endif	/* RELOGIO_H */