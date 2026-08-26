package com.tapaskoev.taskcli;

import java.time.LocalDateTime;

public class TaskCLI {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("No se pasaron argumentos");
        } else {
            if (args.length > 0){

                switch (args[0]){
                    case "add":
                        if (args.length < 2){
                            System.out.println("Te faltó la descripción");
                        } else{
                            Task task = new Task(1, args[1]);
                            System.out.println(task.toJson());
                        }
                        break;
                    case "list":
                        System.out.println("Listando todas las tareas...");
                        break;
                    case "update":
                        System.out.println("Actualizando la tarea X");
                        break;
                    case "delete":
                        System.out.println("Eliminado la tarea Y");
                        break;
                    default:
                        System.out.println("Comando no conocido");
                        break;
                }
            }
        }

    }
}
