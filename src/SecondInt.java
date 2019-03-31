interface intMusic{
    boolean test(int genre,int author);
}
public class SecondInt {
    public static void main(String args[]) {
        String genres[] = {"Classic", "Rock", "Rap", "Norm pacan"};
        String authores[] = {"Бетховен", "Rammstein", "Emminem", "Nicoluy Bascov"};
        intMusic intmusic = (genre, author) -> (genre = author) == 1;
        if (intmusic.test(1, 1))
            System.out.println(genres[1] + "-"+authores[1]+" = true");
        if (!intmusic.test(3, 3))
            System.out.println(genres[3] + "-"+authores[3]+" = false");
    }
}
