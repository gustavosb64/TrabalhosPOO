#include "Radio.h"
#include <iostream>

    Radio::Radio(){
        this->radioFrequencia = "FM";
        this->estacao = "106.3";
    }

    Radio::Radio(string estacao, string radioFrequencia){
        this->estacao = estacao;
        this->radioFrequencia = radioFrequencia;
    }

    void Radio::setEstacao(string estacao){
       this->estacao = estacao;
    }

    void Radio::mudarRadioFrequencia(string radioFrequencia){
        this->radioFrequencia = radioFrequencia;
    }

    string Radio::getEstacao(){
        return this->estacao;
    }

    string Radio::getRadioFrequencia(){
        return this->radioFrequencia;
    }

    void Radio::liga(){
        cout << "Radio ligado" << endl;
    }

    void Radio::desliga(){
        cout << "Radio desligado" << endl;
    }