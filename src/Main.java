public class Main {
    public static void main(String[] args) {
        // Стоимость билета в рублях
        int ticketPrice = 13676;

        // Количество рублей для одной бонусной мили
        int rublesPerMile = 20;

        // Рассчитываем количество бонусных миль
        int bonusMiles = ticketPrice / rublesPerMile;

        // Вывод результата
        System.out.println("Стоимость билета: " + ticketPrice + " рублей.");
        System.out.println("Количество бонусных миль: " + bonusMiles);
    }
}