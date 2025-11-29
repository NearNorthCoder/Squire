/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Item
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.plugins.gauntlet.SquireGauntlet;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.Prayer;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

public abstract class GauntletTaskBase
extends Task {
    protected final  c ba;
    
    private  int be;
    private final  Set<d> bb;
    
    private  BooleanSupplier bc;
    private  int bd;

    public void sleepWhile(int n2, BooleanSupplier booleanSupplier) {
        this.bd = n2;
        this.bc = booleanSupplier;
        this.be = n2;
    }

    public boolean bf() {
        return llIIllIlIlIl[0];
    }

    private static boolean lllllllIIIllII(Object object) {
        return object != null;
    }

    @Inject
    public GauntletTaskBase(c c2, d ... dArray) {
        this.ba = c2;
        this.bb = new HashSet<d>(Arrays.asList(dArray));
    }

    public boolean bc() {
        return this.bb.contains((Object)this.ba.W());
    }

    public abstract boolean be();

    private static boolean lllllllIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllllIIIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lllllllIIlIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    protected List<Prayer> bd() {
        void var1;
        List list = Equipment.getAll();
        List list2 = list.stream().filter(Objects::nonNull).map(Item::getComposition).map(ItemComposition::getName).filter(Objects::nonNull).collect(Collectors.toList());
        if (n.lllllllIIIlllI(list2.stream().anyMatch(string -> string.contains(llIIllIlIlII[llIIllIlIlIl[1]])) ? 1 : 0)) {
            return Prayers.getRangePrayers();
        }
        if (n.lllllllIIIlllI(var1.stream().anyMatch(string -> string.contains(llIIllIlIlII[llIIllIlIlIl[0]])) ? 1 : 0)) {
            return Prayers.getMagePrayers();
        }
        return Prayers.getMeleePrayer();
    }

    static {
        n.lllllllIIIlIll();
        n.lllllllIIIlIlI();
    }

    public boolean run() {
        n var2;
        if (!n.lllllllIIIllII(this.ba) || n.lllllllIIIllIl(this.ba.h())) {
            return llIIllIlIlIl[0];
        }
        if (n.lllllllIIIllII(var2.bc) && n.lllllllIIIlllI(var2.bc.getAsBoolean() ? 1 : 0)) {
            var2.bd = var2.be;
        }
        if (n.lllllllIIIllll(var2.bd)) {
            var2.bd -= llIIllIlIlIl[1];
            return llIIllIlIlIl[0];
        }
        var2.be = llIIllIlIlIl[0];
        var2.bc = null;
        if (n.lllllllIIIlllI(var2.ba.h().onlyHandlePrayers() ? 1 : 0) && n.lllllllIIlIIII(var2.bf() ? 1 : 0)) {
            Static.getClient().setShowMouseCross(llIIllIlIlIl[1]);
            return llIIllIlIlIl[0];
        }
        if (n.lllllllIIIlllI(SquireGauntlet.g() ? 1 : 0) && n.lllllllIIlIIII(var2.bb.contains((Object)d.BOSS_FIGHT) ? 1 : 0)) {
            return llIIllIlIlIl[0];
        }
        if (n.lllllllIIIlllI(var2.bc() ? 1 : 0)) {
            return var2.be();
        }
        return llIIllIlIlIl[0];
    }

    private static boolean lllllllIIIllll(int n2) {
        return n2 > 0;
    }

    private static void lllllllIIIlIlI() {
        llIIllIlIlII = new String[llIIllIlIlIl[2]];
        n.llIIllIlIlII[n.llIIllIlIlIl[0]] = "staff";
        n.llIIllIlIlII[n.llIIllIlIlIl[1]] = "bow";
    }

        return String.valueOf(var3);
    }

    public Set<d> bg() {
        return this.bb;
    }

    private static boolean lllllllIIIllIl(Object object) {
        return object == null;
    }

}

