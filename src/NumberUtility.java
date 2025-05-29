public class NumberUtility {
    private NumberUtility() {
    }
    public static String removeSymbols(String phoneNumber) {
        // Объявили метод удалитьСимволы
        return phoneNumber.replace("-", "")
                .replace("(", "")
                .replace(")", "");
    }

    public static String validateCountry(String phoneNumber) {
        // Объявили метод подтвердитьСтрану
        if (phoneNumber.startsWith("8")) {
            return phoneNumber.replaceFirst("8", "+7");
        } else if (phoneNumber.startsWith("7")) {
            return "+" + phoneNumber;
        }
        return phoneNumber;
    }
}