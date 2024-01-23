package com.tcv;

public class Byte3 {
    public static void main(String[] arg){

        byte interruptorEstado = 1; // 0 para apagado, 1 para encendido
        System.out.println("El interruptor está " + ((interruptorEstado == 1) ? "encendido" : "apagado"));

    }
}
