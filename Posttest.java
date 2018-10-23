import java.io.*;
public class Posttest{
    public static void main (String[]args)throws IOException{
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        int menu;
        String kdbrg []= new String[50];
        String nmbrg[]=new String [50];
        float harga[]=new float[50];
        int jumlah[]=new int [50];
        String pilih ="";
        boolean status1=false;
        boolean status2=false;
        int x=0;
        do{
        System.out.println(".:Menu App : ");
        System.out.println("(1) Input data barang");
        System.out.println("(2) Cetak data barang");

        System.out.println("Pilih Menu: ");
        menu=Integer.parseInt(dataIn.readLine());
        if (menu==1){
            do{
                System.out.println("Masukkan kode barang :  ");
                    kdbrg[x]=dataIn.readLine();
                System.out.println("Masukkan nama barang :  ");
                    nmbrg[x]=dataIn.readLine();
                System.out.println("Masukkan harga :  ");
                    harga[x]=Float.parseFloat(dataIn.readLine());
                System.out.println("Masukkan jumlah :  ");
                    jumlah[x]=Integer.parseInt(dataIn.readLine());
                
                System.out.println("Apakah anda melakukan input lagi? Y/N");
                    pilih = dataIn.readLine();
                if (pilih.equals("Y")){
                    status1=true;
                    x++;
                }else{
                    status1=false;
                    status2=true;
                }
            }while(status1);
        }else if (menu==2){
            for (int i=0;i<kdbrg.length;i++){
                if (!kdbrg[i].equals("")){
                    System.out.println("Kode barang : "+kdbrg[i]);
                    System.out.println("Nama barang : "+nmbrg[i]);
                    System.out.println("Harga : "+harga[i]);
                    System.out.println("Jumlah barang : "+jumlah[i]);
                    System.out.println("\n");
                }else{
                    break;
                }

            }
        }

    }while (status2);
}
}