/**
 * @author Sudip
**/
class DVD {

    public String name, director;
    public int releaseYear;

    public DVD(String name, String director, int releaseYear) {
        this.name = name;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getString() {
        return this.name + ", directed by " + this.director + " , released in " + this.releaseYear;
    }
}

public class DVDCollection {

    public static void main(String... args) {
        DVD dvdCollection[] = new DVD[15];

        dvdCollection[0] = new DVD("The Matrix", "Wachowskis", 1999);

        dvdCollection[7] = new DVD("Inception", "Christopher Nolan", 2010);

        dvdCollection[11] = new DVD("The Incredibles", "Brad Bird", 2004);

        dvdCollection[3] = new DVD("Finding Dory", "Andre Stanton", 2016);

        dvdCollection[14] = new DVD("The Lion King", "Jon Favreau", 2019);

        for (DVD item : dvdCollection) {
            if (item != null) {
                System.out.println(item.getString());
            }
        }
    }
}
