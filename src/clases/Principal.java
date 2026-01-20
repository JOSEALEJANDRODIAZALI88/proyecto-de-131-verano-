package clases;
import java.util.ArrayList;
import java.util.List;
public class Principal {
    public static void main(String[] args) {
        // Colas de Autos ------------------------------------------>
        ColaCircularAuto CA1 = new ColaCircularAuto();
        CA1.adi(new Auto("4567ABC", "King Long Super GLS", "Minibus", 82));
        CA1.adi(new Auto("7890DEF", "Chevrolet Impala", "Taxi", 97));
        CA1.adi(new Auto("1357GHI", "Chevrolet C-50", "Micro", 92));
        CA1.adi(new Auto("2468JKL", "Honda Accord", "Particular", 118));
        CA1.adi(new Auto("9753MNO", "King Long XMQ6700", "Minibus", 84));
        CA1.adi(new Auto("8642PQR", "Toyota Camry", "Taxi", 98));
        CA1.adi(new Auto("7531STU", "Mercedes-Benz LO 1112", "Micro", 91));
        CA1.adi(new Auto("6420VWX", "Kia Optima", "Particular", 113));
        CA1.adi(new Auto("5319YZA", "Jinbei Haise", "Minibus", 86));
        CA1.adi(new Auto("4208BCD", "Honda Fit", "Particular", 116));
        CA1.adi(new Auto("1234EFG", "JAC Sunray", "Minibus", 81));
        CA1.adi(new Auto("5678HIJ", "Ford Fusion", "Taxi", 96));
        CA1.adi(new Auto("9101KLM", "Ford B-700", "Micro", 89));
        CA1.adi(new Auto("2233NOP", "Mazda 6", "Particular", 112));
        CA1.adi(new Auto("4455QRS", "Foton View CS2", "Minibus", 83));
        CA1.adi(new Auto("6677TUV", "Chevrolet Cruze", "Taxi", 99));
        CA1.adi(new Auto("8899WXY", "Dodge D-700", "Micro", 87));
        CA1.adi(new Auto("1111ZAB", "Subaru Legacy", "Particular", 115));
        CA1.adi(new Auto("2222CDE", "Geely Farizon", "Minibus", 85));
        CA1.adi(new Auto("3333FGH", "Toyota Prius", "Taxi", 94));
        CA1.adi(new Auto("4444IJK", "Chevrolet C-50", "Micro", 90));
        CA1.adi(new Auto("5555LMN", "Hyundai Elantra", "Particular", 114));        
        ColaCircularAuto CA2 = new ColaCircularAuto();
        CA2.adi(new Auto("7642YPT", "Toyota Bufalo", "Minibus", 80));
        CA2.adi(new Auto("8234KLM", "Nissan Altima", "Taxi", 100));
        CA2.adi(new Auto("5678HJK", "GMC B-Series", "Micro", 90));
        CA2.adi(new Auto("9123XYZ", "Honda Civic", "Particular", 120));
        CA2.adi(new Auto("3345BNM", "King Long Super GLS", "Minibus", 85));
        CA2.adi(new Auto("6789PQR", "Chevrolet Malibu", "Taxi", 95));
        CA2.adi(new Auto("2234GHJ", "Mercedes-Benz LO 1112", "Micro", 88));
        CA2.adi(new Auto("1456VBN", "Toyota Corolla", "Particular", 110));
        CA2.adi(new Auto("9987UIO", "King Long XMQ6700", "Minibus", 83));
        CA2.adi(new Auto("3342JHG", "Ford Focus", "Particular", 115));        
        ColaCircularAuto CA3 = new ColaCircularAuto();
        CA3.adi(new Auto("6789ABC", "Jinbei Haise", "Minibus", 80));
        CA3.adi(new Auto("7890DEF", "Chevrolet Spark", "Taxi", 95));
        CA3.adi(new Auto("8901GHI", "Volvo B58", "Micro", 85));
        CA3.adi(new Auto("9012JKL", "Nissan Maxima", "Particular", 120));
        CA3.adi(new Auto("1234MNO", "JAC Sunray", "Minibus", 82));
        CA3.adi(new Auto("2345PQR", "Toyota Avalon", "Taxi", 98));
        CA3.adi(new Auto("3456STU", "Bussing 8000", "Micro", 88));
        CA3.adi(new Auto("4567VWX", "Mazda 3", "Particular", 115));
        CA3.adi(new Auto("5678YZA", "Foton View CS2", "Minibus", 84));
        CA3.adi(new Auto("6789BCD", "Ford Mustang", "Particular", 130));
        CA3.adi(new Auto("7890EFG", "Geely Farizon", "Minibus", 81));
        CA3.adi(new Auto("8901HIJ", "Honda Odyssey", "Taxi", 94));        
        ColaCircularAuto CA4 = new ColaCircularAuto();
        CA4.adi(new Auto("2345NOP", "Toyota Bufalo", "Minibus", 83));
        CA4.adi(new Auto("3456QRS", "Chevrolet Aveo", "Taxi", 92));
        CA4.adi(new Auto("4567TUV", "Chevrolet C-50", "Micro", 87));
        CA4.adi(new Auto("5678WXY", "BMW 3 Series", "Particular", 125));
        CA4.adi(new Auto("6789ZAB", "King Long Super GLS", "Minibus", 85));
        CA4.adi(new Auto("7890CDE", "Hyundai Accent", "Taxi", 90));
                
        // Colas de Semaforos ------------------------------------------>
        ColaCircularSemaforo CS1 = new ColaCircularSemaforo();
        CS1.adi(new Semaforo("rojo", 30));
        CS1.adi(new Semaforo("verde", 20));
        CS1.adi(new Semaforo("rojo", 30));
        CS1.adi(new Semaforo("verde", 30));
        CS1.adi(new Semaforo("verde", 30));        
        ColaCircularSemaforo CS2 = new ColaCircularSemaforo();
        CS2.adi(new Semaforo("verde", 90));
        CS2.adi(new Semaforo("verde", 60));
        CS2.adi(new Semaforo("verde", 60));
        CS2.adi(new Semaforo("rojo", 90));        
        ColaCircularSemaforo CS3 = new ColaCircularSemaforo();
        CS3.adi(new Semaforo("rojo", 20));
        CS3.adi(new Semaforo("verde", 30));
        CS3.adi(new Semaforo("verde", 30));
        CS3.adi(new Semaforo("rojo", 60));
        CS3.adi(new Semaforo("rojo", 90));
        CS3.adi(new Semaforo("verde", 90));        
        ColaCircularSemaforo CS4 = new ColaCircularSemaforo();
        CS4.adi(new Semaforo("rojo", 120));
        CS4.adi(new Semaforo("verde", 60));
        CS4.adi(new Semaforo("rojo", 90));
                                        
        // Listas de Vias 1 - 6 ------------------------------------------>
        LD_NormalVia LV1 = new LD_NormalVia();
        LV1.adiPrimero(new Via("Calle Tumusla", "Calle", "909M", "Congestionado", 60, 2, CS3, CA1));                
        LV1.adiPrimero(new Via("Av. Buenos Aires", "Avenida", "909M", "Libre", 180, 2, CS2, CA2));                
        LV1.adiPrimero(new Via("Max Paredes", "Avenida", "909M", "Congestionado", 70, 2, CS2, CA3));                                   
        LV1.adiPrimero(new Via("Av. Baptista", "Avenida", "909M", "Libre", 120, 2, CS4, CA4));                
        LV1.adiPrimero(new Via("Av. Apumalla", "Avenida", "909M", "Libre", 200, 2, CS3, CA2));        
        LD_NormalVia LV2 = new LD_NormalVia();
        LV2.adiPrimero(new Via("Av. Manco Kapac", "Avenida", "404C", "Congestionado", 60, 2, CS1, CA1));                
        LV2.adiPrimero(new Via("Av. America", "Avenida", "404C", "Libre", 180, 2, CS3, CA2));                
        LV2.adiPrimero(new Via("av. Perez Velazco", "Avenida", "404C", "Congestionado", 70, 2, CS2, CA3));                                   
        LV2.adiPrimero(new Via("Av. Mariscal Sta Cruz", "Avenida", "404C", "Libre", 180, 2, CS4, CA4));                
        LV2.adiPrimero(new Via("Yanacocha", "Calle", "404C", "Congestionado", 60, 1, CS1, CA2));                                        
        LD_NormalVia LV3 = new LD_NormalVia();
        LV3.adiPrimero(new Via("Av. Yanacocha", "Avenida", "111P", "congestionado", 60, 1, CS2, CA2));
        LV3.adiPrimero(new Via("Av. Illampu", "Avenida", "111P", "Congestionado", 60, 2, CS1, CA1));                
        LV3.adiPrimero(new Via("Rodriguez", "Calle", "111P", "Libre", 60, 1, CS2, CA2));                
        LV3.adiPrimero(new Via("Murillo", "Calle", "111P", "Congestionado", 60, 1, CS3, CA3));                                   
        LV3.adiPrimero(new Via("Potosi", "Calle", "111P", "Congestionado", 60, 1, CS1, CA4));                 
        LD_NormalVia LV4 = new LD_NormalVia();
        LV4.adiPrimero(new Via("Av. Camacho", "Avenida", "767C", "Libre", 200, 2, CS2, CA2));
        LV4.adiPrimero(new Via("Av. 16 de Julio", "avenida", "767C", "Congestionado", 180, 2, CS4, CA1));                
        LV4.adiPrimero(new Via("Federico Zuazo", "Calle", "767C", "Libre", 60, 1, CS4, CA2));                
        LV4.adiPrimero(new Via("Av. Arce", "Avenida", "767C", "Libre", 70, 1, CS3, CA3));                                   
        LV4.adiPrimero(new Via("Av. 6 de Agosto", "Avenida", "767C", "Libre", 70, 1, CS2, CA4));                 
        LD_NormalVia LV5 = new LD_NormalVia();
        LV5.adiPrimero(new Via("Av. 20 de Octubre", "Avenida", "818S", "Libre", 70, 1, CS1, CA2));
        LV5.adiPrimero(new Via("Landaeta", "Calle", "818S", "Libre", 70, 1, CS4, CA1));                
        LV5.adiPrimero(new Via("Tumusla", "Calle", "818S", "Libre", 70, 2, CS2, CA2));                
        LV5.adiPrimero(new Via("Max Paredes", "Calle", "818S", "Congestionado", 70, 2, CS1, CA3));                                   
        LV5.adiPrimero(new Via("Boqueron", "Calle", "818S", "Libre", 70, 2, CS3, CA4));          
        LD_NormalVia LV6 = new LD_NormalVia();
        LV6.adiPrimero(new Via("Av. Buch", "Avenida", "969S", "Libre", 180, 2, CS3, CA2));
        LV6.adiPrimero(new Via("Av. Brasil", "Avenida", "969S", "Congestionado", 120, 2, CS2, CA1));                
        LV6.adiPrimero(new Via("Av. Savedra", "Avenida", "969S", "Libre", 180, 2, CS2, CA2));                
        LV6.adiPrimero(new Via("R. Villalobos", "Calle", "969S", "Congestionado", 60, 1, CS1, CA3));                                   
        LV6.adiPrimero(new Via("Av. Kantutani", "Avenida", "969S", "Libre", 120, 2, CS3, CA4));                
        LV6.adiPrimero(new Via("Av. del Poeta", "Avenida", "969S", "Libre", 120, 2, CS4, CA2));
                        
        // Zonas ------------------------------------------>
        LD_NormalZona LZ = new LD_NormalZona();
        Zona Z1 = new Zona("Miraflores", "909M", LV1);        
        Zona Z2 = new Zona("Villa Fatima", "404C", LV2);
        Zona Z3 = new Zona("Alto Obrajes", "111P", LV3);
        Zona Z4 = new Zona("Achumani Central", "767C", LV4);
        Zona Z5 = new Zona("Bajo Tejar", "818S", LV5);
        Zona Z6 = new Zona("14 de Septiembre", "969S", LV6);         
        LZ.adiPrimero(Z1);
        LZ.adiPrimero(Z2);
        LZ.adiPrimero(Z3);
        LZ.adiPrimero(Z4);
        LZ.adiPrimero(Z5);
        LZ.adiPrimero(Z6);
                        
        // Pila Contaminacion ------------------------------------------>
        PilaContaminacion PC = new PilaContaminacion();
        PC.adi(new Contaminacion(Z1, "PM2.5,9.8mcg/m^3", "51-100", "Moderada"));
        PC.adi(new Contaminacion(Z3, "PM2.3,9.8mcg/m^3", "0-50", "Buena"));
        PC.adi(new Contaminacion(Z4, "PM2.5,9.8mcg/m^3", "51-100", "Moderada"));
        PC.adi(new Contaminacion(Z5, "PM2.8,9.8mcg/m^3", "101-150", "Perjudicial para Sencibles"));        
        
        // Lista Congestionamiento ------------------------------------------>
        LS_CircularConges LC1 = new LS_CircularConges();
        LC1.adiPrincipio(new Congestionamiento(LV2, "404C", "14:00", "23/01/2024"));
        LC1.adiPrincipio(new Congestionamiento(LV4, "767C", "19:00", "17/04/2024"));
        LC1.adiPrincipio(new Congestionamiento(LV3, "111P", "21:00", "12/05/2024"));
        LC1.adiPrincipio(new Congestionamiento(LV6, "969S", "08:00", "10/03/2024"));
        
        LZ.mostrar();
        PC.mostrar();
        LC1.mostrar();
                        
        // Ejercicio 1
        System.out.println("<-- EJR 1. Verifique si existe congestion vehicular en la via Y, de la zona X. -->");        
        String v = "Calle Tumusla";
        String z = "Max Paredes";                
        if(VerificaCongestion(LZ, v, z))
            System.out.println("La "+v+" de la Zona "+z+" esta congestionada.");
        else
            System.out.println("La "+v+" de la Zona "+z+" esta libre.");        
        
        // Ejerciico 2
        System.out.println("\n<-- EJR 2. Mostrar una o todas la vias que sean de doble carril en la zona X. -->");        
        DobleCarril(LZ, "Miraflores");
        
        // Ejerciico 3
        System.out.println("\n<-- EJR 3. La Secretaria Municipal de Gestion Ambiental de La Paz quiere saber cuanto contamina la zona X. -->");        
        Contaminacion(LZ, "Max Paredes", 40);
        
        // Ejerciico 4
        System.out.println("\n<-- EJR 4. Se sabe que existen dos tiempos en los semaforos segun exista congestionamiento, cambiar el tiempo de los semaforos en la via x de acuerdo al reglamento. -->");                
        CambioTiempo(LZ, "Av. del Poeta");        
                
        // Ejercicio 5
        System.out.println("\n<-- EJR 5. Mostrar los autos que deben circular el dia x. -->");                
        CirculacionDiaX(LZ, "Miercoles");                       
    }
             
    // EJR 1. Verifique si existe congestion vehicular en la via Y, de la zona X.
    static boolean VerificaCongestion(LD_NormalZona lz, String via, String zona){
        boolean sw = false;
        LD_NormalZona aux1 = new LD_NormalZona();
        LD_NormalVia aux2 = new LD_NormalVia();
        while(!lz.esVacia()){            
            NodoZona zx = lz.eliFinal();
            if(zx.getZ().getNombre().equals(zona)){                
                while(!zx.getZ().getR().esVacia()){
                    NodoVia vx = zx.getZ().getR().eliFinal();
                    if(vx.getX().getNombre().equals(via) && vx.getX().getEstado().equals("Congestionado"))
                        sw = true;
                    aux2.adiFinal(vx.getX());
                }
                zx.getZ().getR().setP(aux2.getP());
                aux2.setP(null);                
            }
            aux1.adiFinal(zx.getZ());
        }
        lz.setP(aux1.getP());
        aux1.setP(null);
        return sw;        
    }
    
    // EJR 2. Mostrar una o todas la vias que sean de doble carril en la zona X.
    static void DobleCarril(LD_NormalZona lz, String zona){
        NodoZona R = lz.getP();
        while(R.getSig() != null){             
            if(R.getZ().getNombre().equals(zona)){
                NodoVia S= R.getZ().getR().getP();
                while(S.getSig() != null){
                    if(S.getX().getNombre().equals("Villa Lobos") || S.getX().getNombre().equals("Potosi")){
                        System.out.println("malll");
                    }
                    else{
                        System.out.println(S.getX().getNombre());                                
                    }
                    S = S.getSig();                        
                }                 
            }
           R = R.getSig();             
        }         
    }
    
    // 3. La Secretaría Municipal de Gestión Ambiental de La Paz quiere saber cuánto contamina la zona X.
    static void Contaminacion(LD_NormalZona lz, String zona, int min){
        double res = 0;
        LD_NormalZona aux1 = new LD_NormalZona();
        LD_NormalVia aux2 = new LD_NormalVia();
        while(!lz.esVacia()){            
            NodoZona zx = lz.eliFinal();            
            if(zx.getZ().getNombre().equals(zona)){
                while(!zx.getZ().getR().esVacia()){                    
                    NodoVia vx = zx.getZ().getR().eliFinal();
                    res = vx.getX().getY().nroElem()*33.33*min;
                    aux2.adiFinal(vx.getX());
                }
                zx.getZ().getR().setP(aux2.getP());
                aux2.setP(null); 
            }                                    
            aux1.adiFinal(zx.getZ());
        }
        lz.setP(aux1.getP());
        aux1.setP(null);
        System.out.println("El nivel de contaminacion de la zona "+zona+" es de "+res+" CO2");
    }    

    // 4. Se sabe que existen dos tiempos en los semáforos según exista congestionamiento,
    // cambiar el tiempo de los semáforos en la vía x de acuerdo al reglamento.
    static void CambioTiempo(LD_NormalZona lz, String via){
        LD_NormalZona aux1 = new LD_NormalZona();
        LD_NormalVia aux2 = new LD_NormalVia();
        ColaCircularSemaforo auxSem = new ColaCircularSemaforo();
        while(!lz.esVacia()){            
            NodoZona zx = lz.eliFinal();                        
            while(!zx.getZ().getR().esVacia()){                    
                NodoVia vx = zx.getZ().getR().eliFinal();
                if(vx.getX().getNombre().equals(via)){
                    while(!vx.getX().getX().esVacia()){
                        Semaforo sx = vx.getX().getX().eli();
                        sx.setDuracion(60);
                        auxSem.adi(sx);
                    }
                    vx.getX().getX().vaciar(auxSem);
                    vx.getX().getX().mostrar();
                }
                aux2.adiFinal(vx.getX());
            }
            zx.getZ().getR().setP(aux2.getP());
            aux2.setP(null); 
                                                
            aux1.adiFinal(zx.getZ());
        }
        lz.setP(aux1.getP());
        aux1.setP(null);
    }
                
    // <EJR 5. Mostrar los autos que deben circular el dia x.
    // (Para mejorar el transporte y lograr descongestionar las vías daremos turnos de recorrido en las horas pico a los vehículos 
    // de acuerdo a el primer dígito de su placa: LUNES - 0 y 1, MARTES - 2 y 3, MIÉRCOLES - 4 y 5, JUEVES - 6 y 7, VIERNES - 8 y 9, SÁBADO LIBRE, DOMINGO LIBRE)               
    static void CirculacionDiaX(LD_NormalZona lz, String x){
        LD_NormalZona zaux = new LD_NormalZona();
        LD_NormalVia vaux = new LD_NormalVia();
        ColaCircularAuto aaux = new ColaCircularAuto();
        List<String> repetidas = new ArrayList<>();
        while(!lz.esVacia()){
            NodoZona zx = lz.eliFinal();            
            while(!zx.getZ().getR().esVacia()){
                NodoVia vx = zx.getZ().getR().eliFinal();                
                while(!vx.getX().getY().esVacia()){
                    Auto ax = vx.getX().getY().eli();                    
                    char primerDigito = ax.getMatricula().charAt(0);                   
                    boolean sw = false;
                    if (x.equals("Lunes") && (primerDigito == '0' || primerDigito == '1'))
                        sw = true;
                    else if (x.equals("Martes") && (primerDigito == '2' || primerDigito == '3'))
                        sw = true;
                    else if (x.equals("Miercoles") && (primerDigito == '4' || primerDigito == '5'))
                        sw = true;
                    else if (x.equals("Jueves") && (primerDigito == '6' || primerDigito == '7'))
                        sw = true;
                    else if (x.equals("Viernes") && (primerDigito == '8' || primerDigito == '9'))
                        sw = true;
                    else if (x.equals("Sabado") || x.equals("Domingo"))
                        System.out.println("Dia libre");                    
                    if (sw && !repetidas.contains(ax.getMatricula())) {
                        ax.mostrar();                        
                        repetidas.add(ax.getMatricula());
                    }
                    aaux.adi(ax);
                }
                vaux.adiFinal(vx.getX());
                vx.getX().getY().vaciar(aaux);
            }            
            zaux.adiFinal(zx.getZ());
            zx.getZ().getR().setP(vaux.getP());
            vaux.setP(null);
        }
        lz.setP(zaux.getP());
        zaux.setP(null);
    }   
}