package gg.squire.mahoghomes.model;
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/model/RequiredMaterials.class */
public class RequiredMaterials {
    public int MinPlanks;
    public int MaxPlanks;
    public int MinSteelBars;
    public int MaxSteelBars;

    public RequiredMaterials(int MinPlanks, int MaxPlanks, int MinSteelBars, int MaxSteelBars) {
        this.MinPlanks = MinPlanks;
        this.MaxPlanks = MaxPlanks;
        this.MinSteelBars = MinSteelBars;
        this.MaxSteelBars = MaxSteelBars;
    }

    public int getMinPlanks() {
        return this.MinPlanks;
    }

    public int getMaxPlanks() {
        return this.MaxPlanks;
    }

    public int getMinSteelBars() {
        return this.MinSteelBars;
    }

    public int getMaxSteelBars() {
        return this.MaxSteelBars;
    }
}
