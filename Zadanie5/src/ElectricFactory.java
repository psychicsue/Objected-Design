public class ElectricFactory {

    public enum Module {
        A,
        B,
        C,
        D
    }

    public enum Product {
        RETROTV,
        PNEUMATICTOSTER,
        BANANAPEELER
    }

    private static String moduleFactory(final Module module) {
        switch (module) {
            case A:
                return new RoboOnePrototype().buildModule();
            case B:
                return new RoboTwoPrototype().buildModule();
            case C:
                return new RoboThreePrototype().buildModule();
            case D:
                return new RoboFourPrototype().buildModule();

                default:
                    break;
        }

        return "Cannot produce module";
    }

    private static String buildRetroTv() {
       return String.format("%s%s%s%s%s%s",
                moduleFactory(Module.A),
                moduleFactory(Module.A),
                moduleFactory(Module.A),
                moduleFactory(Module.B),
                moduleFactory(Module.B),
                moduleFactory(Module.C));
    }

    private static String buildPneumatiToster() {
       return String.format("%s%s%s%s%s%s",
                moduleFactory(Module.A),
                moduleFactory(Module.B),
                moduleFactory(Module.B),
                moduleFactory(Module.B),
                moduleFactory(Module.A),
                moduleFactory(Module.D));
    }

    private static String buildBananaPeeler() {
       return String.format("%s%s%s%s",
                moduleFactory(Module.C),
                moduleFactory(Module.D),
                moduleFactory(Module.A),
                moduleFactory(Module.D)
                );
    }


    public static void main(String[] args) {

        System.out.println("Telewizor marki Retro wisła 3: " + buildRetroTv());
        System.out.println("Toster pneumatyczny" + buildPneumatiToster());
        System.out.println("HYdrokinetyczna obieraczka do bananów " + buildBananaPeeler());

    }
}

