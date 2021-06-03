#ifndef RADIO_RELOGIO_H
#define	RADIO_RELOGIO_H

#include "Radio.h"
#include "Relogio.h"

class RadioRelogio: public Radio, public Relogio{
    public: 
        RadioRelogio();
        string horaAlarmeSintonizado;
        string minutosAlarmeSintonizado;
        string estacaoAlarmeSintonizado;
        void sintonizarAlarmeNaRadio(string horaAlarmeSintonizado, string minutosAlarmeSintonizado, string estacaoAlarmeSintonizado);
        void exibeAlarmeSintonizado();
};
#endif