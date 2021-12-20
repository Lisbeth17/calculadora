/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

/**
 *
 * @author usuario
 */
public class appcalculadora {
    private boolean suma,resta,divicion,multiplicacion,cos,sin,tan,acos,asin,atan,exp,in,log,n,fraccion,cubo,cuadrado;
   private double resultado,a,b,c;//valor donde guardara el resultado
   private String ingresar,retroceso;

    public String getRetroceso() {
        return retroceso;
    }

    public void setRetroceso(String retroceso) {
        this.retroceso = retroceso;
    }
   //creamos un cinsructor para darle un vallor inicial a los atributos que tienen la clase
   //en constructor tiene que llamarse con la clase
   public appcalculadora(){
       ingresar="";
       suma=false;
       resultado=0;
       resta=false;
       multiplicacion=false;
       divicion=false;
       cos=false;
       sin=false;
       tan=false;
       acos=false;
       asin=false;
       atan=false;
       exp=false;
       in=false;
       log=false;
       n=false;
       fraccion=false;
       cubo=false;
       cuadrado=false;
       
   }
   //hacemos un metodo para ingresar un valor

    public String getIngresar() {//obtine un valor 
        return ingresar;
    }

    public void setIngresar(String ingresar) {//colocar un valor 
        this.ingresar = ingresar;
    }
   //creaamos un metodo para agrear un numero a la caja de texto
    public void agregarnumero(int numero){
        setIngresar(ingresar+numero);//con el mas se esta concatenando
    } 
    public void eliminarnumero(int numero){
       //con el mas se esta concatenando
    } 
    //agregar el metodo sums
public void suma(String numero){
//mando allamar a la variable resultado yq ue ahi temporal
this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
suma=true;
    setIngresar("");//limpiar la caja
}
//metodo resultado que retome un valor
public double total(String num){
    if(suma==true){
        resultado=resultado+Double.parseDouble(num);//el primer valor + el segundo valor
    }else if(resta==true){
        resultado=resultado-Double.parseDouble(num);  
    }else if(multiplicacion==true){
        resultado=resultado*Double.parseDouble(num);
    }else if(divicion==true){
        resultado=resultado/Double.parseDouble(num);
    }else if(cos==true){
        resultado=Math.cos(Math.PI*(resultado)/180);
    }else if(sin==true){
        resultado=Math.sin(Math.PI*(resultado)/180);
    }else if(tan==true){
        resultado=Math.tan(Math.PI*(resultado)/180);
    }else if(acos==true){
        resultado=Math.tan(resultado);
    }else if(asin==true){
        resultado=Math.tan(resultado);
    }else if(atan==true){
        resultado=Math.tan(resultado);
    }else if(cuadrado==true){
        resultado=Math.pow(resultado,2);
    }else if(cubo==true){
        resultado=Math.pow(resultado,3);
    }
    else if(n==true){
         a=1;
         for(b=1;b<=resultado;b++){
           a=a*b;
       }
         resultado=a;
    }else if(exp==true){
        resultado=Math.exp(resultado);
    }else if(log==true){
        resultado=Math.log10(resultado);
    }else if(in==true){
        resultado=Math.log(resultado);
    }else if(fraccion==true){
        resultado=1/resultado;
    }
    //reseteo de los valores
    tan=false;
    sin=false;
    cos=false;
    atan=false;
    asin=false;
    acos=false;
    divicion=false;
    multiplicacion=false;
    resta=false;
    suma=false;
    cubo=false;
    cuadrado=false;
    n=false;
    fraccion=false;
    log=false;
    in=false;
    return resultado;
}
public void resta(String numero){
//mando allamar a la variable resultado yq ue ahi temporal
this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
resta=true;
    setIngresar("");//limpiar la caja
}
public void multiplcacion(String numero){
//mando allamar a la variable resultado yq ue ahi temporal
this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
multiplicacion=true;
    setIngresar("");//limpiar la caja
}
public void divicion(String numero){
//mando allamar a la variable resultado yq ue ahi temporal
this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
divicion=true;
    setIngresar("");//limpiar la caja
}
public void coseno(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
cos=true;
}
public void seno(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
sin=true;
}
public void tangente(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
tan=true;
}
public void acos(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
acos=true;
}
public void asin(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
asin=true;
}
public void atan(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
atan=true;
}
public void cuadrado(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
cuadrado=true;
}
public void cubo(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
cubo=true;
}
public void factorial(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
n=true;
}
public void exp(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
exp=true;
}
public void loga(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
log=true;
}
public void in(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
in=true;
}
public void franc(String numero){
    this.resultado=Double.parseDouble(numero);//guarada temporal mente el numero
fraccion=true;
}


public void limpiar(){
//mando allamar a la variable resultado yq ue ahi temporal
ingresar="";
       ingresar="";
       suma=false;
       resultado=0;
       resta=false;
       multiplicacion=false;
       divicion=false;
       cos=false;
       sin=false;
       tan=false;
       acos=false;
       asin=false;
       atan=false;
       exp=false;
       in=false;
       log=false;
       n=false;
       fraccion=false;
       cubo=false;
       cuadrado=false;

}

    void eliminarnumero(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}

