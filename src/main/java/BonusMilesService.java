public class BonusMilesService {
    public int calculate(int ticketPrice) {
        // 1 бонусная миля за каждые 20 рублей стоимости билета
        return ticketPrice / 20;
    }
}
