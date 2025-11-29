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
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.stream.Collectors;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
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
        return 0;
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

    /*
     * WARNING - void declaration
     */
    protected List<Prayer> bd() {
        void var3;
        List list = Equipment.getAll();
        List list2 = list.stream().filter(Objects::nonNull).map(Item::getComposition).map(ItemComposition::getName).filter(Objects::nonNull).collect(Collectors.toList());
        if ((list2.stream( != 0).anyMatch(string -> string.contains(var2[1])) ? 1 : 0)) {
            return Prayers.getRangePrayers();
        }
        if ((var3.stream( != 0).anyMatch(string -> string.contains(var2[0])) ? 1 : 0)) {
            return Prayers.getMagePrayers();
        }
        return Prayers.getMeleePrayer();
    }

    public boolean run() {
        n var4;
        if (!(this.ba != null) || (this.ba.h( == null))) {
            return 0;
        }
        if ((var4.bc != null) && (var4.bc.getAsBoolean( != 0) ? 1 : 0)) {
            var4.bd = var4.be;
        }
        if (var4.bd > 0) {
            var4.bd -= 1;
            return 0;
        }
        var4.be = 0;
        var4.bc = null;
        if ((var4.ba.h( != 0).onlyHandlePrayers() ? 1 : 0) && (var4.bf( == 0) ? 1 : 0)) {
            Static.getClient().setShowMouseCross(1);
            return 0;
        }
        if ((SquireGauntlet.g( != 0) ? 1 : 0) && (var4.bb.contains((Object == 0)d.BOSS_FIGHT) ? 1 : 0)) {
            return 0;
        }
        if ((var4.bc( != 0) ? 1 : 0)) {
            return var4.be();
        }
        return 0;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            
            return null;
        }
        return String.valueOf(var8);
    }

    public Set<d> bg() {
        return this.bb;
    }

}

