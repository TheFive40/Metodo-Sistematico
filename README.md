# Metodo-Sistematico
Establece la nomenclatura del Compuesto ingresado  Teniendo en cuenta el Metodo Sistematico

POR FAVOR LEA ATENTAMENTE EL RESTO DE ARCHIVOS EN LOS CUALES SE EXPLICA DETALLADAMENTE CADA UNO DE LAS LINEAS DE CODIGO UTILIZADAS PARA LA ELABORACION
DEL  METODO SISTEMATICO QUE COMPONE EL PROGRAMA DE NOMENCLATURAS 

A CONTINUACION  LE OFRECEMOS UN GLOSARIO MUY IMPORTANTE PARA ENTENDER CADA UNA DE LAS INSTRUCCIONES QUE SE MOSTRARAN MAS ADELANTE 

VARIABLE = ESPACIO EN MEMORIA DONDE GUARDAREMOS UN VALOR YA SEA TEXTO, NUMERO,  O UN BOOLEANO ES DECIR VERDADERO O FALSO

STRING = TIPO DE DATO QUE ACOMPAÑA UNA VARIABLE ANTES DEL NOMBRE  EL CUAL LE INDICA EL VALOR QUE ALMACENARA LA VARIABLE QUE ES DE TIPO TEXTO

INT = TIPO DE DATO QUE ACOMPAÑA A UNA VARIABLE ANTES DEL NOMBRE DE LA MISMA EL CUAL INDICA EL VALOR QUE ALMACENARA LA VARIABLE EN ESTE CASO ES DE TIPO ENTERO

PUBLIC = MODIFICADOR DE ACCESO QUE ACOMPAÑA A UN METODO O CLASE  EL TIPO PUBLIC NOS AYUDA A ACCEDER A LOS METODOS O INTANCIAR OBJETOS DE OTRA CLASE DIFERENTE O PAQUETE

MODULARIZACION = DIVIDIR NUESTRO CODIGO EN DIFERENTES CLASES

CLASE = ES NUESTRA BASE O "MOLDE" DONDE VAMOS A DEJAR REDACTADO NUESTRO CODIGO

FOR = ES UN BUCLE EL CUAL SE REPETIRA UN NUMERO DE VECES DETERMINADO Y QUE ES FACIL DE SABER A SIMPLE VISTA

SIGNOS DE COMPARACION = SON LOS SIGNOS "==" QUE NOS AYUDAN A EVALUAR SI UNA VARIABLE ES IGUAL A OTRA O SI ES IGUAL A UN NUMERO EN ESPECIFICO NO CONFUNDIRLO CON EL "=" YA QUE SE UTILZA PARA ESTABLECER VALORES 

SYSTEM.OUT.PRINTLN  = ESTA INSTRUCCION NOS IMPRIME UN MENSAJE EN CONSOLA HACIENDO UN SALTO DE LINEA EL MENSAJE PUEDE SER EN STRING O VARIABLES U OBJETOS

OBJETO EN PROGRAMACION = Un objeto en Java es la unidad básica de este lenguaje de programación y representa las entidades de la vida real. Un programa típico de Java crea muchos objetos que interactúan al invocar métodos. De esta forma, podemos decir que un objeto consiste en:

Estado: está representado por atributos de un objeto. También refleja las propiedades de un objeto.

Comportamiento: se representa mediante métodos de un objeto. También refleja la respuesta de un objeto con otros objetos.

Identidad: le da un nombre único a un objeto y permite que un objeto interactúe con otros objetos.

IF = NOS SIRVE PARA EVALUAR CONDICIONES EN CASO DE SER VERDADERAS EJECUTARA UN BLOQUE DE CODIGO Y SI DEVUELVE FALSA OTRO

¿COMO DECLARAMOS VARIABLES?
PRIMERO TENGAMOS EN CUENTA QUE LA DECLARACION DE LAS VARIABLES DEPENDERA DEL LENGUAJE DE PROGRAMACION QUE ESTEMOS USANDO EN ESTE CASO USAREMOS JAVA 

SINTAXIS : [TIPO DE DATO] [NOMBRE DE LA VARIABLE PUEDE SER CUALQUIERA] = [VALOR]; //OBLIGATORIAMENTE DEBE TENER = Y UN PUNTO Y COMA AL FINAL ";"

EJEMPLO:  STRING TEXTO = "HOLA MUNDO"; (ES IMPORTANTE TENER EN CUENTA QUE PARA ESTABLECER UN VALOR DE TIPO STRING DEBEMOS PONERLO ENTRE COMILLAS)

SINTAXIS DE VARIABLES TIPO ENTERO:

[TIPO DE DATO] [NOMBRE] = [VALOR];

EJEMPLO: INT X = 5;

SINTAXIS DE VARIABLES BOOLEANAS:

[TIPO DE DATO] [NOMBRE] = [VALOR];

EJEMPLO: BOOLEAN VERDADERO = TRUE; 

         BOOLEAN FALSO = FALSE;
         

¿COMO DECLARAMOS BUCLES FOR?
SINTAXIS: 

[DECLARAMOS UNA VARIABLE] [CONDICION] [VECES DE REPETICION DEL BUCLE]

EJEMPLO: 

FOR(INT I = 0; I<5;I++) DECLARAMOS VARIABLE I QUE ES 0 MIENTRAS QUE I SEA MENOR QUE 5 [ESTA CONDICION ES VERDADERA YA QUE ES MENOR] AUMENTARAS EL VALOR DE I 5 VECES Y 
ESA SERAN LAS VECES QUE SE REPETIRA EL BUCLE RECORDEMOS EL CONCEPTO DEL BUCLE FOR ESPECIFICAMENTE LA PARTE DONDE DICE QUE PODEMOS VER A SIMPLE VISTA LAS VECES
QUE SE REPETIRA EL BUCLE LO CUAL PODEMOS VER EN LA PROPIA SINTAXIS 


¿DE DONDE COMIENZA NUESTRO PROGRAMA?

MAIN: APARTIR DE ESTE METODO EMPEZARA A EJECUTARSE NUESTRO PROGRAMA ES DECIR A LEERSE NUESTRO CODIGO 

SINTAXIS:

Public (MODIFICADOR DE ACCESO) Static (restringe el acceso a las variables o métodos a los que se haya aplicado.) VOID (METODO SETTER NO NOS DEVUELVE NADA SI NO QUE ESTABLECE) MAIN (NOMBRE DEL METODO) ABRIMOS PARENTESIS (STRING [] ARGS (AQUI DEFINIMOS UN ARREGLO YA QUE EL TIPO DE DATO VA SEGUIDO DE CORCHETES)

UNIMOS 

Public static void main (String [] args){

//DENTRO DE LAS LLAVES IRA NUESTRO CODIGO QUE EMPEZARA A LEERSE APARTIR DE AQUI
}


PEQUEÑA GUIA REALIZADA POR JEAN FRANCO BOOM BOLAÑO 

ESTE PROYECTO VA DIRIGIDO A LA COMUNIDAD EDUCATIVA  INSTITUCION EDUCATIVA DISTRITAL CIUDADELA ESTUDIANTIL HECHO POR ESTUDIANTES PARA ESTUDIANTES Y  DOCENTES
ESPECIALMENTE: AL PROFESOR OMAR RODRIGUEZ. 

CREADORES DEL PROYECTO: 
1. JEAN FRANCO BOOM BOLAÑO 
2. MAURICIO MEJIA 

CURSO 11 A

FECHA 15/10/2022
