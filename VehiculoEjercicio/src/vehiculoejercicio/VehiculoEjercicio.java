
package vehiculoejercicio;


public class VehiculoEjercicio {


    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("5763JS",300,50);
        Vehiculo vehiculo2 = new Vehiculo("4323HB",200,70);
        Vehiculo vehiculo3 = new Vehiculo("7656GG",900,50);
       
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0]=vehiculo1;
        vehiculos[1]=vehiculo2;
        vehiculos[2]=vehiculo3;
        for(int i=0;i<vehiculos.length;i++){
            vehiculos[i].viajar();
        }
        VehiculoTerrestre vehiculoTerrestre1 = new VehiculoTerrestre("4324TT",400,90,4);
        VehiculoTerrestre vehiculoTerrestre2 = new VehiculoTerrestre("7357GB",300,70,3);
        VehiculoTerrestre vehiculoTerrestre3 = new VehiculoTerrestre("2189PL",900,50,1);
        
        VehiculoTerrestre[] vehiculosTerrestres = new VehiculoTerrestre[3];
        vehiculosTerrestres[0]=vehiculoTerrestre1;
        vehiculosTerrestres[1]=vehiculoTerrestre2;
        vehiculosTerrestres[2]=vehiculoTerrestre3;
        for(int i =0;i<vehiculosTerrestres.length;i++){
            vehiculosTerrestres[i].viajar();
            vehiculosTerrestres[i].derrape();
        }
        
        VehiculoAereo vehiculoAereo1 = new VehiculoAereo("4327GC",2000,60,100);
        VehiculoAereo vehiculoAereo2 = new VehiculoAereo("1132KP",3000,50,400);
        VehiculoAereo vehiculoAereo3 = new VehiculoAereo("5581KK",1000,80,300);
        
        VehiculoAereo[] vehiculosAereos = new VehiculoAereo[3];
        vehiculosAereos[0] = vehiculoAereo1;
        vehiculosAereos[1] = vehiculoAereo2;
        vehiculosAereos[2] = vehiculoAereo3;
        
        for(int i=0;i<vehiculosAereos.length;i++){
            vehiculosAereos[i].viajar();
            vehiculosAereos[i].Aterrizar();
        }
    }
    
}
