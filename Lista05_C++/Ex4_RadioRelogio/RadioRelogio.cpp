#include "RadioRelogio.h"
#include <iostream>

    RadioRelogio::RadioRelogio():Relogio(){
        
    }

    void RadioRelogio::sintonizarAlarmeNaRadio(string horaAlarmeSintonizado, string minutosAlarmeSintonizado, string estacaoAlarmeSintonizado){
        this->horaAlarmeSintonizado = horaAlarmeSintonizado;
        this->estacaoAlarmeSintonizado = estacaoAlarmeSintonizado;
        this->minutosAlarmeSintonizado = minutosAlarmeSintonizado;    
    }

    void RadioRelogio::exibeAlarmeSintonizado(){
        std::cout << "Alarme programado para: " + this->horaAlarmeSintonizado
                                                + ":"
                                                + this->minutosAlarmeSintonizado
                                                + " na estação: "
                                                + this->estacaoAlarmeSintonizado
        << endl;
    }
