public class ListPlayer {
    private String judulLagu;
    private String namaPenyanyi;

    public ListPlayer(String judulLagu, String namaPenyanyi) {
        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
    }
    public String getJudulLagu(){
        return this.judulLagu;
    }

    @Override
    public String toString() {
        return this.judulLagu + " - " +  namaPenyanyi;
    }
}
