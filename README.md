# Controle de fluxos

O controle de fluxo é efetuado por condicionais que modificam o percurso do programa. Em java existem alguns controles:

- if
- else
- else if
- for
- while
- do while
- switch
- break
- continue

## if, else e else if

São tomadas de decisões que definem o que é verdadeiro e oque é falso.

`if` significa que a instrução é verdadeira e `else` que é falsa.

Se (*if*) for tal coisa, faça isso, caso contrário (*else*), faça aquelaa outra coisa.

O *if* pode ser declarado sozinho mas o *else* só pode ser definido se o *if* for definido primeiro.

Em conjunto com os controles de fluxo utilizamos os operadores lógicos.

- Exemplo 1:

    int result = 0;
        if (result > 1){

        }else {

        }

- Exemplo 2:

    int result = 0;
        if (result > 1 && result <5){

        }else if (result >= 5 && result <8){
            
        }else{

        }

- Exemplo 3:
    int num = 10;
        if (num >=5){
            if (num>=8){

            }else if (num >=6){

            }else {

            }
        }else {
            if (num >= 1 && <= 3){

            }else {

            }
        }

## for

O loop `for` é mais fixo, permite executar o conjuto de sentenças por número determinado de vezes. O princípio do loop *for* é ser um contador. Exemplo:

- for (int i = 0; i <= 10; i++){
    System.out.println("Linha " + i);
}

## break e continue

São dois comandos de controle que são usados juntos com os controles de fluxos `for` e `while`.

### break

O comando `break` faz com que im loop pare em uma determinada execução.

-   public static void main (String args[]) {
        for (int contador=1; contador<=1000; contador++){
            System.out.println("Esta é a repetição nr: " +contador);
            if (contador==10)
            break;
        }
    }

No exemplo acima, temos uma repetição que se inicia em 1 e deve terminar em mil (1000), mas dentro desta estrutura há uma condição: Se a varável for igual a 10 saia da estrutura de repetição.

### continue

O comando continue é fifernte do comando break, ele não para a execução e sim continua.

-   public static void main (String args[]) {
        for (int contador=1; contador<=1000; contador++){
            if (contador%5!=0)
                continue;
            System.out.println("Contador: "+contador);
        }
    }

O código acima conta de 1 a 100, mas só imprime os números múltiplos de 5, ignorando o código quw imprime os valores.

## while

É um fluxo de controle que executa uma comparação, caso esta comparação seja verdadeira o fluxo entra no loop. Está comparação ´feita em primeiro lugar, caso o resultado seja verdadeiro ele executa o código dentro do loop.

-   int count = 0;
    while(count <2){
        System.out.println("Repetição nr: +count");
    }

## Diferenças de *for* e *while*

A principal difernça entre o controle de fluxo `for` e o `while` é que o *for* você sabe quando a sua execução vai parar, pois você atribui uma variável de controle. Já no *while* ele continuará executando o código até que uma condição (Você não sabe quando isso irá ocorrer) seja atingida.

- `for` = para
    - para 1 até 10 imprima hello

- `while` = enquanto
    - enquanto 10 for menor que 20 imprima hello

## do while

O loop `do while` é igual ao loop `while`, só que ai invés de verificar a condição em primeiro lugar ele executa o código dentro do loop e depois verifica a condição.
Ou seja ele sempre vai executar o que está dentro do loop uma vez.

-   int count = 0;
    
    Loop infinito:

    do {
        System.out.println("repetição nr: " + count);

    }while (count <2)

## Switch, Case e Default

O `switch` verifica uma variável e age de acordo com os seus casos.
Exemplo:

-   `SWITCH` (variável){
        `CASE` valor :
            Código a ser executado caso o valor de *case* seja o mesmo da variável se *switch*.
            break;
        `CASE` valor:
            Outro código;
            break;
    }

