public class PesawatTelepon {

    String tombol, gagang, kabel;

    public void setTombol(String tombol) {
        this.tombol = tombol;
    }

    public void setGagang(String gagang) {
        this.gagang = gagang;
    }

    public void setKabel(String kabel) {
        this.kabel = kabel;
    }

  public String getTombol() {
    return tombol;
  }

    public String getGagang() {
        return gagang;
    }
        public String getKabel() {
            return kabel;
        }

            void tombol(String tombol) { // dengan parameter
                System.out.println("memencet tombol dan memasukan nomer  " + tombol);
            }

            void gagang() {// tanpa parameter
                System.out.println("mengangkat gagang telepon untuk menjawab panggilan");
            }
}