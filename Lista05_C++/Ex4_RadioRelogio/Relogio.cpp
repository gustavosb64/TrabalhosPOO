#include "Relogio.h"
#include <iostream>

    Relogio::Relogio(){

    }

    Relogio::Relogio(int hora, int minutos){
        this->hora = hora;
        this->minutos = minutos;
    }

    void Relogio::exibeHora(){
        cout << "Hora: " + this->hora + ":" + this->minutos << endl;
    }
    void Relogio::definirHora(string hora, string minutos){
        this->hora = hora;
        this->minutos = minutos;
    }

    void Relogio::definirAlarme(string horaAlarme, string minutosAlarme){
        this->horaAlarme = horaAlarme;
        this->minutosAlarme = minutosAlarme;
    }

    void Relogio::liga(){
        cout << "Relogio ligado" << endl;
    }

    void Relogio::desliga(){
        cout << "Relogio desligado" << endl;
    }