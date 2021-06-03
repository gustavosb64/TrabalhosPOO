#include <iostream>
#include <vector>
#include <stdio.h>      /* printf, scanf, puts, NULL */
#include <stdlib.h>     /* srand, rand */
#include <time.h> 
#include "NumComplexo.cpp"

using namespace std;

int main()
{
    int n;
    srand (time(NULL));
    int random = rand();
    

    cout << "Digite o tamanho do vetor: ";
    cin >> n;
    std::vector<NumComplexo> *vetor = new vector<NumComplexo>(n);
    
    for (int i = 0; i < n; i++)
    {
        double parteReal = rand() % 100;
        double parteImaginaria = rand() % 100;
        printf("Real: %lf, imaginario: %lf\n", parteReal, parteImaginaria);
        NumComplexo numeroComplexo(parteReal, parteImaginaria);
        vetor->push_back(numeroComplexo);
    }

    std::vector<NumComplexo>::iterator elemento;

    NumComplexo somatorio(0,0);
    for ( elemento = vetor->begin(); elemento != vetor->end(); elemento++ ){
        somatorio = somatorio+(*elemento);
    }

    somatorio.printNum();
    
    delete vetor;

    return 0;
}
