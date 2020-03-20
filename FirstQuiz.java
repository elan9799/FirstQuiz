public class FirstQuiz {
    public static void main(String[] args) {
        int age = 24;
        // проверить, зная возраст, что человек совершеннолетний
        if(age >= 18) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String name = "Svetozar";
        // напечатать длину имени
        int l = name.length();
        System.out.println("Количество букв в имени " + name + " = " + l);

        String phone = "+79998887766";
        String fl = phone.substring(0 , 1);
        int ll = phone.length() - 1;//минус 1 так как есть +
        // проверить, что телефон начинается с кода +7 и состоит из 10 цифр //почему из 10?
        if(fl == "+7" && ll == 10) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String firstName = "Ivan";
        String lastName = "Ivanov";
        String patronymic = "Ivanovich";
        // составить строчку из фамилии и инициалов: Ivanov I. I.

        char pa = patronymic.charAt(0);
        char fn = firstName.charAt(0);

        String fullName = lastName + " " + pa + ". " + fn + ". ";
        System.out.println(fullName);
    }
}