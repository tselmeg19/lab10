package lab10_2;

public class Main {
	public static void main(String[] args) {
        Salbar isSalbar = new Salbar(1, "ЭХМТС", "Б. Унгаасайхан");
        Salbar ingenerSalbar = new Salbar(2, "Инженерчлэлийн салбар", "phD доктор Ч. Ганзориг");

        Oyuutan oyuutan1 = new Oyuutan("B18092005", "Болд", isSalbar);
        Oyuutan oyuutan2 = new Oyuutan("B20091008", "Ган-Эрдэнэ", isSalbar);

        System.out.println("1 " + isSalbar.getSalbarNer() + " " + isSalbar.getSalbarErhlegchNer());
        System.out.println(oyuutan2.getOyuutniiKod() + " " + oyuutan2.getOyuutniiNer() + " 1 " +
                isSalbar.getSalbarNer() + " " + isSalbar.getSalbarErhlegchNer());
        System.out.println("2 ИС Ч. Ганзориг");
        System.out.println("Оюутан " + oyuutan1.getOyuutniiKod() + " кодтой " + oyuutan1.getOyuutniiNer() + " нь ИС салбарт харьяалагдана.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("\nСалбар №2-ын мэдээллийг өөрчилье:");
        System.out.println("2 " + ingenerSalbar.getSalbarNer() + " " + ingenerSalbar.getSalbarErhlegchNer());
        System.out.println(oyuutan1.getOyuutniiKod() + " " + oyuutan1.getOyuutniiNer() + " 2 ИС Ч. Ганзориг");
    }
}
