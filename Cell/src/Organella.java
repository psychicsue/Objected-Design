public interface Organella {
    String getName();
}

class Chloroplast implements Organella {

    @Override
    public String getName() {
        return "I'm Organella";
    }
}

class Lysosome implements Organella {

    @Override
    public String getName() {
        return "I'm Lysosome";
    }
}

class Vacuole implements Organella {

    @Override
    public String getName() {
        return "I'm Vacuole";
    }
}

class Cytoplasm implements Organella {

    @Override
    public String getName() {
        return "I'm Cytoplasm";
    }
}

class Ribosomes implements Organella {

    @Override
    public String getName() {
        return "I'm Ribosomes";
    }
}

class Nucleolus implements Organella {
    @Override
    public String getName() {
        return "I'm Nucleolus";
    }
}

class Mitochondrium implements Organella {

    @Override
    public String getName() {
        return "I'm Mito";
    }
}
