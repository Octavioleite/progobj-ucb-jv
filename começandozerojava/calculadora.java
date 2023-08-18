package começandozerojava;

public class calculadora {
    
    public int a;
    public int b;
    public String operador;


    public int operar(){
        int ret=0;
        if (this.operador == "+"){
            ret = a + b;
      }
      if (this.operador == "-"){
        ret = a - b;
  }
  if (this.operador == "*"){
    ret = a * b;
}
if (this.operador == "/"){
    ret = a / b;
}
return ret;


    }


    public void Operador(String string) {
    }


}
