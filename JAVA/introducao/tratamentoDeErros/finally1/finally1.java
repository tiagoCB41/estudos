package com.introducao.tratamentoDeErros.finally1;

public class finally1 {

        public static void main(String[] args){

            int [] numeros = {2,4,6,8,10};
            int [] denomin = {2,0,2,0};

            for (int i=0 ; i < numeros.length ; i++){

                try{
                    System.out.println("Resultado da multiplica��o 1" + (numeros[i] / denomin[i]));
                }
                catch (ArithmeticException e){
                    System.out.println("ArithmeticException captura o primeiro erro");
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("ArrayIndexOutOfBoundsException captura o segundo erro");
                }finally {
                    System.out.println("Esse texto ser� executado dando erro ou n�o");
                }
            }

        }
    }


