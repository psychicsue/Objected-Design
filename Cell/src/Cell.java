import java.util.Set;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class Cell {

    private Mitochondrium mitochondrium;

    private Vacuole vacuole;

    @Nullable
    private final Set<Chloroplast> chloroplast; //vege

    @Nullable
    private final Set<Lysosome> lysosome;

    private final Cytoplasm cytoplasm;

    @Nullable
    private final Set<Ribosomes> ribosomes;

    @Nullable
    private final Set<Nucleolus> nucleolus;

    private Cell(final Builder builder) {
        this.mitochondrium = builder.mitochondrium;
        this.vacuole = builder.vacuole;
        this.chloroplast = builder.chloroplast;
        this.lysosome = builder.lysosome;
        this.cytoplasm = builder.cytoplasm;
        this.ribosomes = builder.ribosomes;
        this.nucleolus = builder.nucleolus;
    }

    public Set<Nucleolus> getNucleolus() {
        return nucleolus;
    }

    public Set<Ribosomes> getRibosomes() {
        return ribosomes;
    }

    public Cytoplasm getCytoplasm() {
        return cytoplasm;
    }

    public Set<Lysosome> getLysosome() {
        return lysosome;
    }

    public Set<Chloroplast> getChloroplast() {
        return chloroplast;
    }

    public Vacuole getVacuole() {
        return vacuole;
    }

    public Mitochondrium getMitochondrium() {
        return mitochondrium;
    }

    public static class Builder {

        private Mitochondrium mitochondrium;
        private Vacuole vacuole;
        private Set<Chloroplast> chloroplast;
        private Set<Lysosome> lysosome;
        private Cytoplasm cytoplasm;
        private Set<Ribosomes> ribosomes;
        private Set<Nucleolus> nucleolus;

        public Builder withMitochondrium(final Mitochondrium mitochondrium) {
            this.mitochondrium = mitochondrium;
            return this;
        }

        public Builder withVacuole(final Vacuole vacuole) {
            this.vacuole = vacuole;
            return this;
        }

        @Nullable
        public Builder withChloroplast(final Set<Chloroplast> chloroplast) {
            this.chloroplast = chloroplast;
            return this;
        }

        @Nullable
        public Builder withLysosome(final Set<Lysosome> lysosome) {
            this.lysosome = lysosome;
            return this;
        }

        @NotNull
        public Builder withCytoplasm(final Cytoplasm cytoplasm) {
            this.cytoplasm = cytoplasm;
            return this;
        }

        @Nullable
        public Builder withRibosomes(final Set<Ribosomes> ribosomes) {
            this.ribosomes = ribosomes;
            return this;
        }

        @Nullable
        public Builder withNucleolus(final Set<Nucleolus> nucleolus) {
            this.nucleolus = nucleolus;
            return this;
        }

        public Cell build() {
            return new Cell(this);
        }
    }

}
