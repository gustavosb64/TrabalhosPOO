#include <iostream>

template <typename Temp>
class GenericClass{
    private:
        Temp x;
        Temp y;

    public:

        GenericClass(){};
        
        GenericClass(Temp inX, Temp inY){
            x = inX;
            y = inY;
        };

        Temp getX(){
            return x;
        }
        
        Temp getY(){
            return y;
        }
        
        Temp getMax () { 
            return x > y ? x : y; 
        }

        Temp getMin () { 
               return x < y ? x : y; 
        }

        Temp getSum () { 
               return x + y; 
        }
};
