public class Pert7Lat1 {
    public static void main(String[] args) {
        Mahasiswa dtMhs = new Mahasiswa();


//        memanggil method overloading yang dibedakan dengan jlmh parameter
        dtMhs.dataMhs(); /* No Parameter */
        dtMhs.dataMhs("20103131"); /* 1 Parameter */
        dtMhs.dataMhs("20103131","Putri Ayu"); /* 2 Parameter */
    }
}
