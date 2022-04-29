public class BmiService {

    public float calculate(float tall, int kg) {
        float totalTall = tall * tall;
        float bodyIndexMass = kg / totalTall;

        return bodyIndexMass;

    }
}
