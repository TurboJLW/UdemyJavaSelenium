package exceptions;

public class ExceptionsCheck {

    //pobierz wiek od usera, jezeli bedzie mniejszy od zera wyrzuc wyjatek InvalidAgeException
    // jezeli mam 18>= to mozemy wypisac "jestes pelnoletni"

    public static void main(String[] args) throws InvalidAgeException {
//        User fakeUser = new User(-23, "Nieistniejaca osoba");
//        User childUser = new User(13, "Maluszek Paluszek");
//        User adultUser = new User(24, "Wielki Paluch");
//        childUser.AgeVerification();
//        adultUser.AgeVerification();
//        fakeUser.AgeVerification();

        User user = new User();
        user.AgeVerification();






    }
}
