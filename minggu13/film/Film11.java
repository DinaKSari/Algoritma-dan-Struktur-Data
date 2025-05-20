package film;

public class Film11 {
    int id;
    String judul;
    double rating;

    public Film11(int id, String judul, double rating){
        this.id = id;
        this.judul =judul;
        this.rating = rating;
    }

    public void infoFilm(){
        System.out.println(id + " | " + judul + " | " + rating);

    }
}
