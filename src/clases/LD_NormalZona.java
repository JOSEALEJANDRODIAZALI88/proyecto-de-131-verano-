package clases;

public class LD_NormalZona extends ListaDobleZona {
    public LD_NormalZona() {
        super();
    }
    public boolean esVacia() {
        if(this.P == null)
            return true;
        return false;
    }
    public int nroNodos() {
        int c = 0;
        NodoZona S = this.P;
        while(S != null) {
            c++;
            S = S.getSig();
        }
        return c;
    }
    public void adiPrimero(Zona z){
        NodoZona nuevo = new NodoZona();
        nuevo.setZ(z);//nuevo.setProy(z);
        if(esVacia())
            P = nuevo;
        else {
            nuevo.setSig(P);
            P.setAnt(nuevo);
            P = nuevo;
        }
    }
    public void mostrar() {
        NodoZona R = this.P;
        while(R != null) {
            R.getZ().mostrar();//R.getProy().mostrar();
            R = R.getSig();
        }
    }
    public void adiFinal(Zona z) {
        NodoZona nuevo =  new NodoZona();
        nuevo.setZ(z);
        if(esVacia())
            P = nuevo;
        else {
            NodoZona R = P;
            while(R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
            nuevo.setAnt(R);
        }
    }

    public NodoZona eliPrimero() {
        NodoZona x = new NodoZona();
        if(!esVacia()) {
            if(nroNodos() == 1) {
                x = P;
                P = null;
            }else {
                x = P;
                P = P.getSig();
                P.setAnt(null);
                x.setSig(null);
            }
        }
        return x;
    }

    public NodoZona eliFinal() {
        NodoZona x = new NodoZona();
        if(!esVacia()) {
            if(nroNodos() == 1) {
                x = P;
                P = null;
            }
            else {
                NodoZona R = P;
                while(R.getSig() != null) {
                    R = R.getSig();
                }
                x = R;
                NodoZona aux = R.getAnt();
                aux.setSig(null);
                x.setAnt(null);
            }
        }
        return x;
    }

    public void leer1(int n) {
        for (int i = 1; i <= n; i++) {
            Zona z = new Zona();
            z.leer();
            adiPrimero(z);
        }
    }

    public void leer2(int n) {
        for (int i = 1; i <= n; i++) {
            Zona z = new Zona();
            z.leer();
            adiFinal(z);
        }
    }
    
    public void llenar(){
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
        LV1.adiFinal(new Via("Calle Tumusla", "Calle", "909M", "Congestionado", 60, 2, CS3, CA1));                
        LV1.adiFinal(new Via("Av. Buenos Aires", "Avenida", "909M", "Libre", 180, 2, CS2, CA2));                
        LV1.adiFinal(new Via("Max Paredes", "Avenida", "909M", "Congestionado", 70, 2, CS2, CA3));                                   
        LV1.adiFinal(new Via("Av. Baptista", "Avenida", "909M", "Libre", 120, 2, CS4, CA4));                
        LV1.adiFinal(new Via("Av. Apumalla", "Avenida", "909M", "Libre", 200, 2, CS3, CA2));        
        LD_NormalVia LV2 = new LD_NormalVia();
        LV2.adiFinal(new Via("Av. Manco Kapac", "Avenida", "404C", "Congestionado", 60, 2, CS1, CA1));                
        LV2.adiFinal(new Via("Av. America", "Avenida", "404C", "Libre", 180, 2, CS3, CA2));                
        LV2.adiFinal(new Via("av. Perez Velazco", "Avenida", "404C", "Congestionado", 70, 2, CS2, CA3));                                   
        LV2.adiFinal(new Via("Av. Mariscal Sta Cruz", "Avenida", "404C", "Libre", 180, 2, CS4, CA4));                
        LV2.adiFinal(new Via("Yanacocha", "Calle", "404C", "Congestionado", 60, 1, CS1, CA2));                                        
        LD_NormalVia LV3 = new LD_NormalVia();
        LV3.adiFinal(new Via("Av. Yanacocha", "Avenida", "111P", "congestionado", 60, 1, CS2, CA2));
        LV3.adiFinal(new Via("Av. Illampu", "Avenida", "111P", "Congestionado", 60, 2, CS1, CA1));                
        LV3.adiFinal(new Via("Rodriguez", "Calle", "111P", "Libre", 60, 1, CS2, CA2));                
        LV3.adiFinal(new Via("Murillo", "Calle", "111P", "Congestionado", 60, 1, CS3, CA3));                                   
        LV3.adiFinal(new Via("Potosi", "Calle", "111P", "Congestionado", 60, 1, CS1, CA4));                 
        LD_NormalVia LV4 = new LD_NormalVia();
        LV4.adiFinal(new Via("Av. Camacho", "Avenida", "767C", "Libre", 200, 2, CS2, CA2));
        LV4.adiFinal(new Via("Av. 16 de Julio", "avenida", "767C", "Congestionado", 180, 2, CS4, CA1));                
        LV4.adiFinal(new Via("Federico Zuazo", "Calle", "767C", "Libre", 60, 1, CS4, CA2));                
        LV4.adiFinal(new Via("Av. Arce", "Avenida", "767C", "Libre", 70, 1, CS3, CA3));                                   
        LV4.adiFinal(new Via("Av. 6 de Agosto", "Avenida", "767C", "Libre", 70, 1, CS2, CA4));                 
        LD_NormalVia LV5 = new LD_NormalVia();
        LV5.adiFinal(new Via("Av. 20 de Octubre", "Avenida", "818S", "Libre", 70, 1, CS1, CA2));
        LV5.adiFinal(new Via("Landaeta", "Calle", "818S", "Libre", 70, 1, CS4, CA1));                
        LV5.adiFinal(new Via("Tumusla", "Calle", "818S", "Libre", 70, 2, CS2, CA2));                
        LV5.adiFinal(new Via("Max Paredes", "Calle", "818S", "Congestionado", 70, 2, CS1, CA3));                                   
        LV5.adiPrimero(new Via("Boqueron", "Calle", "818S", "Libre", 70, 2, CS3, CA4));          
        LD_NormalVia LV6 = new LD_NormalVia();
        LV6.adiFinal(new Via("Av. Buch", "Avenida", "969S", "Libre", 180, 2, CS3, CA2));
        LV6.adiFinal(new Via("Av. Brasil", "Avenida", "969S", "Congestionado", 120, 2, CS2, CA1));                
        LV6.adiFinal(new Via("Av. Savedra", "Avenida", "969S", "Libre", 180, 2, CS2, CA2));                
        LV6.adiFinal(new Via("R. Villalobos", "Calle", "969S", "Congestionado", 60, 1, CS1, CA3));                                   
        LV6.adiFinal(new Via("Av. Kantutani", "Avenida", "969S", "Libre", 120, 2, CS3, CA4));                
        LV6.adiFinal(new Via("Av. del Poeta", "Avenida", "969S", "Libre", 120, 2, CS4, CA2));                        
        
        // Adiciona las zonas
        this.adiFinal(new Zona("Miraflores", "909M", LV1));
        this.adiFinal(new Zona("Villa Fatima", "404C", LV2));
        this.adiFinal(new Zona("Alto Obrajes", "111P", LV3));
        this.adiFinal(new Zona("Achumani Central", "767C", LV4));
        this.adiFinal(new Zona("Bajo Tejar", "818S", LV5));
        this.adiFinal(new Zona("14 de Septiembre", "969S", LV6));        
    }
}
