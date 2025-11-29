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
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.Prayer;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

public abstract class n
extends Task {
    protected final /* synthetic */ c ba;
    private static /* synthetic */ int[] llIIllIlIlIl;
    private /* synthetic */ int be;
    private final /* synthetic */ Set<d> bb;
    private static /* synthetic */ String[] llIIllIlIlII;
    private /* synthetic */ BooleanSupplier bc;
    private /* synthetic */ int bd;

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
    public n(c c2, d ... dArray) {
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
        void lllllllllllllllIlIIlIlIIlIlIlIll;
        List list = Equipment.getAll();
        List list2 = list.stream().filter(Objects::nonNull).map(Item::getComposition).map(ItemComposition::getName).filter(Objects::nonNull).collect(Collectors.toList());
        if (n.lllllllIIIlllI(list2.stream().anyMatch(string -> string.contains(llIIllIlIlII[llIIllIlIlIl[1]])) ? 1 : 0)) {
            return Prayers.getRangePrayers();
        }
        if (n.lllllllIIIlllI(lllllllllllllllIlIIlIlIIlIlIlIll.stream().anyMatch(string -> string.contains(llIIllIlIlII[llIIllIlIlIl[0]])) ? 1 : 0)) {
            return Prayers.getMagePrayers();
        }
        return Prayers.getMeleePrayer();
    }

    static {
        n.lllllllIIIlIll();
        n.lllllllIIIlIlI();
    }

    public boolean run() {
        n lllllllllllllllIlIIlIlIIlIlIllll;
        if (!n.lllllllIIIllII(this.ba) || n.lllllllIIIllIl(this.ba.h())) {
            return llIIllIlIlIl[0];
        }
        if (n.lllllllIIIllII(lllllllllllllllIlIIlIlIIlIlIllll.bc) && n.lllllllIIIlllI(lllllllllllllllIlIIlIlIIlIlIllll.bc.getAsBoolean() ? 1 : 0)) {
            lllllllllllllllIlIIlIlIIlIlIllll.bd = lllllllllllllllIlIIlIlIIlIlIllll.be;
        }
        if (n.lllllllIIIllll(lllllllllllllllIlIIlIlIIlIlIllll.bd)) {
            lllllllllllllllIlIIlIlIIlIlIllll.bd -= llIIllIlIlIl[1];
            return llIIllIlIlIl[0];
        }
        lllllllllllllllIlIIlIlIIlIlIllll.be = llIIllIlIlIl[0];
        lllllllllllllllIlIIlIlIIlIlIllll.bc = null;
        if (n.lllllllIIIlllI(lllllllllllllllIlIIlIlIIlIlIllll.ba.h().onlyHandlePrayers() ? 1 : 0) && n.lllllllIIlIIII(lllllllllllllllIlIIlIlIIlIlIllll.bf() ? 1 : 0)) {
            Static.getClient().setShowMouseCross(llIIllIlIlIl[1]);
            return llIIllIlIlIl[0];
        }
        if (n.lllllllIIIlllI(SquireGauntlet.g() ? 1 : 0) && n.lllllllIIlIIII(lllllllllllllllIlIIlIlIIlIlIllll.bb.contains((Object)d.BOSS_FIGHT) ? 1 : 0)) {
            return llIIllIlIlIl[0];
        }
        if (n.lllllllIIIlllI(lllllllllllllllIlIIlIlIIlIlIllll.bc() ? 1 : 0)) {
            return lllllllllllllllIlIIlIlIIlIlIllll.be();
        }
        return llIIllIlIlIl[0];
    }

    private static boolean lllllllIIIllll(int n2) {
        return n2 > 0;
    }

    private static void lllllllIIIlIlI() {
        llIIllIlIlII = new String[llIIllIlIlIl[2]];
        n.llIIllIlIlII[n.llIIllIlIlIl[0]] = n."staff";
        n.llIIllIlIlII[n.llIIllIlIlIl[1]] = n."bow";
    }

    private static String lllllllIIIlIIl(String lllllllllllllllIlIIlIlIIlIIllIll, String lllllllllllllllIlIIlIlIIlIIlllll) {
        lllllllllllllllIlIIlIlIIlIIllIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIIlIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIlIIlIIllllI = new StringBuilder();
        char[] lllllllllllllllIlIIlIlIIlIIlllIl = lllllllllllllllIlIIlIlIIlIIlllll.toCharArray();
        int lllllllllllllllIlIIlIlIIlIIlllII = llIIllIlIlIl[0];
        char[] lllllllllllllllIlIIlIlIIlIIlIllI = lllllllllllllllIlIIlIlIIlIIllIll.toCharArray();
        int lllllllllllllllIlIIlIlIIlIIlIlIl = lllllllllllllllIlIIlIlIIlIIlIllI.length;
        int lllllllllllllllIlIIlIlIIlIIlIlII = llIIllIlIlIl[0];
        while (n.lllllllIIlIIIl(lllllllllllllllIlIIlIlIIlIIlIlII, lllllllllllllllIlIIlIlIIlIIlIlIl)) {
            char lllllllllllllllIlIIlIlIIlIlIIIIl = lllllllllllllllIlIIlIlIIlIIlIllI[lllllllllllllllIlIIlIlIIlIIlIlII];
            lllllllllllllllIlIIlIlIIlIIllllI.append((char)(lllllllllllllllIlIIlIlIIlIlIIIIl ^ lllllllllllllllIlIIlIlIIlIIlllIl[lllllllllllllllIlIIlIlIIlIIlllII % lllllllllllllllIlIIlIlIIlIIlllIl.length]));
            0;
            ++lllllllllllllllIlIIlIlIIlIIlllII;
            ++lllllllllllllllIlIIlIlIIlIIlIlII;
            0;
            if (2 >= -1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIlIIlIIllllI);
    }

    public Set<d> bg() {
        return this.bb;
    }

    private static boolean lllllllIIIllIl(Object object) {
        return object == null;
    }

    private static void lllllllIIIlIll() {
        llIIllIlIlIl = new int[3];
        n.llIIllIlIlIl[0] = (0xE1 ^ 0xB4) & ~(0x6D ^ 0x38);
        n.llIIllIlIlIl[1] = 1;
        n.llIIllIlIlIl[2] = 2;
    }
}

