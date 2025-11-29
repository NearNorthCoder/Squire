package gg.squire.mahoghomes.model;

import com.google.inject.Singleton;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@Singleton
/* loaded from: squire-homes-0.1.0.jar:gg/squire/mahoghomes/model/PlankSack.class */
public class PlankSack {
    private static final Pattern CHECK_PLANKS_PATTERN = Pattern.compile("Basic planks: (\\d+), Oak planks: (\\d+), Teak planks: (\\d+), Mahogany planks: (\\d+)");
    private int normal = -1;
    private int oak = -1;
    private int teak = -1;
    private int mahogany = -1;

    public void setNormal(int normal) {
        this.normal = normal;
    }

    public void setOak(int oak) {
        this.oak = oak;
    }

    public void setTeak(int teak) {
        this.teak = teak;
    }

    public void setMahogany(int mahogany) {
        this.mahogany = mahogany;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof PlankSack) {
            PlankSack other = (PlankSack) o;
            return other.canEqual(this) && getNormal() == other.getNormal() && getOak() == other.getOak() && getTeak() == other.getTeak() && getMahogany() == other.getMahogany();
        }
        return false;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlankSack;
    }

    public int hashCode() {
        int result = (1 * 59) + getNormal();
        return (((((result * 59) + getOak()) * 59) + getTeak()) * 59) + getMahogany();
    }

    public String toString() {
        return "PlankSack(normal=" + getNormal() + ", oak=" + getOak() + ", teak=" + getTeak() + ", mahogany=" + getMahogany() + ")";
    }

    public int getNormal() {
        return this.normal;
    }

    public int getOak() {
        return this.oak;
    }

    public int getTeak() {
        return this.teak;
    }

    public int getMahogany() {
        return this.mahogany;
    }

    public void init() {
        this.mahogany = -1;
        this.teak = -1;
        this.oak = -1;
        this.normal = -1;
    }

    private int clamp(int value) {
        return Math.max(0, Math.min(28, value));
    }

    public void remove(int ordinal, int amount) {
        switch (ordinal) {
            case 0:
                this.normal = clamp(this.normal - amount);
                return;
            case 1:
                this.oak = clamp(this.oak - amount);
                return;
            case 2:
                this.teak = clamp(this.teak - amount);
                return;
            case 3:
                this.mahogany = clamp(this.mahogany - amount);
                return;
            default:
                return;
        }
    }

    public void add(int index, int amount) {
        remove(index, -amount);
    }

    public int getPlanks(Contract contract) {
        switch (contract.ordinal()) {
            case 1:
                return this.oak;
            case 2:
                return this.teak;
            case 3:
                return this.mahogany;
            default:
                return this.normal;
        }
    }

    public boolean known() {
        return (this.normal == -1 || this.oak == -1 || this.teak == -1 || this.mahogany == -1) ? false : true;
    }

    public Item getItem() {
        return Inventory.getFirst(new int[]{24882, 25629});
    }

    public Item getBankItem() {
        return Bank.Inventory.getFirst(new int[]{24882, 25629});
    }

    public boolean isFull(Contract contract) {
        return getPlanks(contract) >= 28;
    }

    @Subscribe
    public void onChatMessage(ChatMessage evt) {
        if (evt.getType() != ChatMessageType.GAMEMESSAGE) {
            return;
        }
        String message = Text.sanitize(Text.removeTags(evt.getMessage()));
        Matcher matcher = CHECK_PLANKS_PATTERN.matcher(message);
        if (matcher.matches()) {
            this.normal = Integer.parseInt(matcher.group(1));
            this.oak = Integer.parseInt(matcher.group(2));
            this.teak = Integer.parseInt(matcher.group(3));
            this.mahogany = Integer.parseInt(matcher.group(4));
        }
    }
}
