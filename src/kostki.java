import java.util.Random;

public class kostki {

private int dicesNo;

public  kostki (int dicesNo) {
    this.dicesNo = dicesNo;
}

public void throwDices() {
    Random random = new Random();

    StringBuilder stringBuilder = new StringBuilder("{");

    for (int i = 0; i < dicesNo; i++) {

        stringBuilder.append(random.nextInt(6) + 1).append(",")
        stringBuilder.delete(stringBuilder.lastIndexOf(","), stringBuilder.lenght());

        stringBuilder.append("}");

        System.out.println(stringBuilder.toString());
    }


}
public static void main(String[] args) {
    new kostki(dic)
}
}
