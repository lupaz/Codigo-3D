# Código-3D
Programa hecho en lenguaje java que genera código de tres direcciones de un lenguaje determinado con la ayuda de las herramientas
Jflex y Cup.

### Ejemplo del lenguaje reconocido:

**Expresiones Aritmeticas (+,-,*,/,^)**
* 5+5+8/2*(3^4)
* -(5*5)+10

**Expresiones Relacionales (>,<,>=,<=,!=,==)**
* 5 < 6 
* 5 <= x
* a != b

**Expresiones Logicas ( OR, AND , XOR, NAND, NOT)**
* Or = a || b 
* And = a && b
* Xor = a !& b
* Nand = a !! b
* Not = !a

**Sentencias de control de flujo(Sintaxis):**
1. Si ( condicion ) { Sentencias }
2. Si ( Condicion ) { Sentencias } Sino { Sentencias}
3. Para ( Declaracion ; Condicion; operador){ Sentencias }
4. Mientras(Condicion){ Sentencias }
5. Hacer{ Sentencias }Mientras( Condicion );
6. Repetir{ Sentencias }Hasta(Condicion);
7. Seleccionar (Expresion) {  Casos  [Defecto] } 

### Ejemplo de entrada del lenguaje:

```[java]
//Expresion aritmetica, relacional y logica
5+5+5/2*3 > 52 && 32 < 82-42/5^3


//sentiecias de flujo

si(a>5.5 || b < 42){
	
	int a,b,c,d;
	a= 55;
}

si( b==c && c != d){
	int x = 5;
	a= b*x;
}sino{
	a = 0;
}


para(int i =0 ; i<=100; ++ ){
	a = i*2;
}

mientras(y< 50 || x > 30 ){
	x = 5*2+y;
	y= 7-3-x;
}

hacer{
	si(x==1){
		x=x*2;
	}sino{
		x=x*-1;
	}
}mientras(x!=0);

repetir{
	
	int x=50;
	y = y*50 - x;

}hasta(y>10);

seleccionar (5+5*2){
	
	caso 1 : 
			a = 5; 
			detener;
	caso 2 :
			a = 10; 
			detener;
	caso 3 :  
			a = 15;
			detener;
	defecto: 
			a = 20;
}
```



