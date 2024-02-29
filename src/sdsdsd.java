public class sdsdsd {
    public static void main(String[] args) {
        // Declare variables with surnames
        float marsWeightOrnella;
        float marsGravityOrnella = 0.376f;
        float weightOnEarthOrnella= 64.0f;


        // Calculate weight on Mars
        marsWeightOrnella = weightOnEarthOrnella * marsGravityOrnella;

        System.out.println("Weight on Mars: " + marsWeightOrnella);

        // Assign result to double variable
        double marsWeightDoubleOrnella = marsWeightOrnella;
        System.out.printf("Mars Weight (double): %.4f\n", marsWeightDoubleOrnella);

        // Cast double to int
        int marsWeightIntOrnella = (int) marsWeightDoubleOrnella;

        System.out.println("Mars Weight (int): " + marsWeightIntOrnella);

        // Cast int to char
        char marsWeightCharOrnella = (char) marsWeightIntOrnella;
        System.out.println("Mars Weight (char): " + marsWeightCharOrnella);

        // math operation on char and assign to int

        int resultInt = marsWeightCharOrnella+ 10;
        System.out.println("Result of math operation on char (int): " + resultInt);
    }
}
