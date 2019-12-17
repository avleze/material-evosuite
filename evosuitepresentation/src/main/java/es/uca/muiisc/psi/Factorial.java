// -- clase Factorial.java --
package es.uca.muiisc.psi;

class Factorial {
    public int factorial(int n){        
	if(n > 0)
           return n * factorial(n-1);
	else
	   return 1;    
    }
}
