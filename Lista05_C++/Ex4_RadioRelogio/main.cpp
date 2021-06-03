/* 
 * File:   main.cpp
 * Author: junio
 *
 * Created on 14 de Junho de 2013, 14:05
 */

#include <cstdlib>
#include <iostream>
#include "Relogio.h"
#include "Radio.h"
#include "RadioRelogio.h"
using namespace std;

int main(void) {

    Relogio relogio;
    relogio.exibeHora();
    relogio.definirHora("21", "33");
    relogio.exibeHora();


    Radio *radio = new Radio();
    cout << radio->getRadioFrequencia() << endl;

    RadioRelogio radioRelogio;
    radioRelogio.exibeHora();

    radioRelogio.sintonizarAlarmeNaRadio("06", "30", "89.5");
    radioRelogio.exibeAlarmeSintonizado();

    Dispositivo *dispositivo = &relogio;
    dispositivo->liga();
    dispositivo->desliga();
    dispositivo = radio;
    dispositivo->liga();
    dispositivo->desliga();

    delete radio;

    return 0;
}

