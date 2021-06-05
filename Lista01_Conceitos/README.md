# Lista1-POO-USP

<h2 align="center"><strong>Colaboradores</strong></h2>
<table align="center">
  <tr align="center">
    <td align="center"><a href="https://github.com/gustavosb64"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/75621446?v=4" width="200px;" alt=""/><br /><sub><b>Gustavo Barbosa</b></sub></td>
    <td align="center"><a href="https://github.com/MateusBCC020"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/61809283?v=4" width="200px;" alt=""/><br /><sub><b>Mateus Ribeiro</b></sub></td> 
  </tr>
</table>

## Descrições

### 2_SO
>Considere o seguinte problema: o sistema operacional usa drivers de dispositivos de rede, de
>impressão, e de vídeo. Todos eles possuem funcionalidades e dados comuns como
>ligaDispositivo, verificaStatus, e executaTeste. E todos eles possuem funcionalidades específicas,
>como enviaPacoteDeDados, imprimePaginas, e alteraBrilhoDeExibição.
>
>Escreva o correspondente esboço de código Java ou C++. Defina atributos necessários para
representar o estado dos dispositivos após cada operação.

### Polinomios
>Escreva uma classe capaz de definir polinômios do tipo **P(x) = anx
n + an-1x
n-1 + ... + a1x
1 + a0x
0**
.
Cada termo do polinômio deve ser representado como um objeto de uma classe Termo.
A classe Polinomio deve possuir os seguintes métodos:
>* um construtor que recebe o grau máximo do polinômio;
>*  um método Add que adiciona um termo anxn
, o qual deve garantir que o grau máximo do
polinômio seja respeitado; caso um termo adicionado anxn
já exista, ele deverá ser somado
ao termo já existente somando-se os valores de seus coeficientes (an _existente + an_novo);
>* um método Mostra que exibe o polinômio
>* um método Calcula que recebe um valor de X e retorna o valor calculado.
>Use o ArrayList do Java, ou o std::list do C++; ou qualquer outra estrutura que julgar adequada.
