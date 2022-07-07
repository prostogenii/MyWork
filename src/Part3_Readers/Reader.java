package Part3_Readers;
import java.util.Scanner;

public class Reader {

    static String pib = "Р.П Петров";
    static int numberKv = 23;
    static String telephoneNumber = "0672248448";

    public static void takeBooks(int booksHave, int booksTaking){
        int oll = booksHave + booksTaking;
        if(oll>5){
            int rith = oll-5;
            int fine = rith*50;
            System.out.println("Ліміт перевищений. Сума штрафу = "+fine+" грн.");
        }
        else{
            System.out.println("Читач "+pib+" взяв сьогодні "+booksTaking+" книг");
        }
    }
    public static void returnBooks(int booksHave, int booksReturning) {

        int oll = booksHave;
        if (oll > 5) {
            int rith = oll - 5;
            int fine = rith * 50;
            System.out.println("Ліміт перевищений. Сума штрафу = " + fine + " грн.");
            int ollnow = booksHave - booksReturning;
            if (ollnow > 5) {
                int rith1 = oll - 5;
                int fine1 = rith1 * 50;
                int finesum = fine1 + fine;
                System.out.println("Ліміт перевищений. З урахуванням першого штрафу, ви повинні: " + finesum + "грн");
            }
            System.out.println("Ліміт не перевищений. Але урахуванням першого штрафу, ви повинні: " + fine + " грн.");
        }
        else {
            int ollnotfine = booksHave - booksReturning;
            System.out.println("Читач " + pib + " повернув сьогодні " + booksReturning + " книги. " + "Загалом в читача залишається " + ollnotfine + " книги.");
        }
    }
}
