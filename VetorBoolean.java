public class VetorBoolean {
    public static void main(String[] args) {
        boolean[] status = new boolean[3];

        status[0] = true;
        status[1] = false;
        status[2] = true;

        if (status[0]) {
            System.out.println("O primeiro status está ativo.");
        } else {
            System.out.println("O primeiro status está inativo.");
        }
    }
}