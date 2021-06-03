#ifndef RADIO_H
#define	RADIO_H
#include <string>	
#include "Dispositivo.h"
using namespace std;

class Radio: public Dispositivo{
    public:
       string estacao;
       string radioFrequencia;

        Radio();
        Radio(string estacao, string radioFrequencia);
        void setEstacao(string estacao);
        void mudarRadioFrequencia(string radioFrequencia);
        string getEstacao();
        string getRadioFrequencia();
        void liga();
        void desliga();
};
#endif	/* RADIO_H */