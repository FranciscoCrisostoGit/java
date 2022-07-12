package tareatherialtrue2;

public class Persona {

    private String rut;
    private String nombre;
    private int calorias;

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void comer(String tipo, float medida) {
        String[] comida = new String[7];
        float[] unidades = new float[7];
        int encontrado = 7;
        int calorias = getCalorias();
        comida[0] = "papas fritas";
        comida[1] = "cerveza";
        comida[2] = "bebida";
        comida[3] = "pizza";
        comida[4] = "hamburguesa";
        comida[5] = "vodka";
        comida[6] = "agua";
        unidades[0] = (float) 5.5;
        unidades[1] = (float) 0.44;
        unidades[2] = (float) 0.4;
        unidades[3] = (float) 236;
        unidades[4] = (float) 608;
        unidades[5] = (float) 2.1;
        unidades[6] = (float) 0;

        for (int i = 0; i < 7; i++) {
            if (comida[i].equalsIgnoreCase(tipo)) {
                encontrado = i;
            }
        }
        if (encontrado == 7) {
            setCalorias(calorias);

        }
        setCalorias(Math.round(unidades[encontrado] * medida) + calorias);
    }


    private void correr(float velocidad, int tiempo) {

        float[] mxc = new float[11];
        int[] vel = new int[11];
        int encontrado = 11;
        int calorias = getCalorias();
        mxc[0] = (float) 6;
        mxc[1] = (float) 7.5;
        mxc[2] = (float) 8.3;
        mxc[3] = (float) 9.7;
        mxc[4] = (float) 10;
        mxc[5] = (float) 11.2;
        mxc[6] = (float) 12;
        mxc[7] = (float) 12.7;
        mxc[8] = (float) 13.9;
        mxc[9] = (float) 14.5;
        mxc[10] = (float) 15;

        vel[0] = 7;
        vel[1] = 8;
        vel[2] = 9;
        vel[3] = 10;
        vel[4] = 11;
        vel[5] = 12;
        vel[6] = 13;
        vel[7] = 14;
        vel[8] = 15;
        vel[9] = 16;
        vel[10] = 17;

        for (int i = 0; i < 11; i++) {
            if ( Math.round(velocidad) == vel[i]){
                encontrado = i;
            }
        }
        if (encontrado == 11) {
            setCalorias(calorias);
        }
        setCalorias(calorias - (tiempo * Math.round(mxc[encontrado])));
        
    }


  
      public void bicicleta (float velocidad, float peso) {
        int[] vel = new int[9];
        float[] pxc = new float[9];
        int encontrado = 9;
        int calorias = getCalorias();
        vel[0] = 13;
        vel[1] = 16;
        vel[2] = 19;
        vel[3] = 23;
        vel[4] = 27;
        vel[5] = 30;
        vel[6] = 34;
        vel[7] = 37;
        vel[8] = 40;
      
        pxc[0] = (float) 0.0295;
        pxc[1] = (float) 0.0355;
        pxc[2] = (float) 0.0426;
        pxc[3] = (float) 0.0512;
        pxc[4] = (float) 0.0675;
        pxc[5] = (float) 0.0810;
        pxc[6] = (float) 0.0975;
        pxc[7] = (float) 0.1173;
        pxc[8] = (float) 0.1411;

           for (int i = 0; i < 9; i++) {
            if ( Math.round(velocidad) == vel[i]){
                encontrado = i;
            }
        }
        if (encontrado == 9) {
            setCalorias(calorias);
        }
        calorias = Math.round(peso * pxc[encontrado] * vel[encontrado]);
         setCalorias(getCalorias()- calorias);
    }

    public Persona(String rut, String nombre, int calorias) {
        this.rut = rut;
        this.nombre = nombre;
        this.calorias = calorias;
    }

}
