/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Item
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.items.Bank$Inventory
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mahoghomes.model;

import com.google.inject.Singleton;
import gg.squire.mahoghomes.model.Contract;
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
public class PlankSack {
    private static final Pattern CHECK_PLANKS_PATTERN = Pattern.compile("Basic planks: (\\d+), Oak planks: (\\d+), Teak planks: (\\d+), Mahogany planks: (\\d+)");
    private int normal = -1;
    private int oak = -1;
    private int teak = -1;
    private int mahogany = -1;

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
            case 0: {
                this.normal = this.clamp(this.normal - amount);
                break;
            }
            case 1: {
                this.oak = this.clamp(this.oak - amount);
                break;
            }
            case 2: {
                this.teak = this.clamp(this.teak - amount);
                break;
            }
            case 3: {
                this.mahogany = this.clamp(this.mahogany - amount);
            }
        }
    }

    public void add(int index, int amount) {
        this.remove(index, -amount);
    }

    public int getPlanks(Contract contract) {
        switch (contract.ordinal()) {
            case 1: {
                return this.oak;
            }
            case 2: {
                return this.teak;
            }
            case 3: {
                return this.mahogany;
            }
        }
        return this.normal;
    }

    public boolean known() {
        return this.normal != -1 && this.oak != -1 && this.teak != -1 && this.mahogany != -1;
    }

    public Item getItem() {
        return Inventory.getFirst((int[])new int[]{24882, 25629});
    }

    public Item getBankItem() {
        return Bank.Inventory.getFirst((int[])new int[]{24882, 25629});
    }

    public boolean isFull(Contract contract) {
        return this.getPlanks(contract) >= 28;
    }

    @Subscribe
    public void onChatMessage(ChatMessage evt) {
        if (evt.getType() != ChatMessageType.GAMEMESSAGE) {
            return;
        }
        String message = Text.sanitize((String)Text.removeTags((String)evt.getMessage()));
        Matcher matcher = CHECK_PLANKS_PATTERN.matcher(message);
        if (matcher.matches()) {
            this.normal = Integer.parseInt(matcher.group(1));
            this.oak = Integer.parseInt(matcher.group(2));
            this.teak = Integer.parseInt(matcher.group(3));
            this.mahogany = Integer.parseInt(matcher.group(4));
        }
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
        if (!(o instanceof PlankSack)) {
            return false;
        }
        PlankSack other = (PlankSack)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getNormal() != other.getNormal()) {
            return false;
        }
        if (this.getOak() != other.getOak()) {
            return false;
        }
        if (this.getTeak() != other.getTeak()) {
            return false;
        }
        return this.getMahogany() == other.getMahogany();
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlankSack;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getNormal();
        result = result * 59 + this.getOak();
        result = result * 59 + this.getTeak();
        result = result * 59 + this.getMahogany();
        return result;
    }

    public String toString() {
        return "PlankSack(normal=" + this.getNormal() + ", oak=" + this.getOak() + ", teak=" + this.getTeak() + ", mahogany=" + this.getMahogany() + ")";
    }
}

