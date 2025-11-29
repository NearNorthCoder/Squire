/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.events.ClientTick
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import net.runelite.api.events.ClientTick;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Enchanting Bolts", register=true)
public class L
extends Task {
    private final /* synthetic */ BankStanderConfig y;
    private /* synthetic */ double z;
    private static /* synthetic */ int[] lllIIIlllIl;

    private static boolean lIlIllIlIlllII(int n2) {
        return n2 == 0;
    }

    @Inject
    public L(BankStanderConfig bankStanderConfig) {
        this.y = bankStanderConfig;
    }

    static {
        L.lIlIllIlIlIlll();
    }

    private boolean T() {
        int[] nArray = new int[lllIIIlllIl[0]];
        nArray[L.lllIIIlllIl[1]] = lllIIIlllIl[6];
        return Inventory.contains((int[])nArray);
    }

    private static int lIlIllIlIllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 > d3 ? 1 : -1);
    }

    private static boolean lIlIllIlIlllIl(Object object) {
        return object == null;
    }

    private static boolean lIlIllIlIllIlI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ClientTick clientTick) {
        void var2_2;
        L llllllllllllllllIIlIlIIlIIlIIllI;
        if (L.lIlIllIlIllIlI((Object)this.y.activity(), (Object)b.ENCHANT_BOLTS)) {
            return;
        }
        Keyboard.type((char)lllIIIlllIl[2]);
        if (L.lIlIllIlIllIll(L.lIlIllIlIllIIl(llllllllllllllllIIlIlIIlIIlIIllI.z, 1.0))) {
            llllllllllllllllIIlIlIIlIIlIIllI.z -= 0.05;
            return;
        }
        if (L.lIlIllIlIlllII(llllllllllllllllIIlIlIIlIIlIIllI.T() ? 1 : 0)) {
            return;
        }
        Widget llllllllllllllllIIlIlIIlIIlIIlIl = Static.getClient().getWidget(lllIIIlllIl[3]);
        if (L.lIlIllIlIlllIl(llllllllllllllllIIlIlIIlIIlIIlIl)) {
            return;
        }
        var2_2.interact(lllIIIlllIl[0], lllIIIlllIl[4], lllIIIlllIl[5], lllIIIlllIl[3]);
        this.z = 2.4;
    }

    private static boolean lIlIllIlIllIll(int n2) {
        return n2 >= 0;
    }

    private static void lIlIllIlIlIlll() {
        lllIIIlllIl = new int[7];
        L.lllIIIlllIl[0] = " ".length();
        L.lllIIIlllIl[1] = (0xE4 ^ 0xBD) & ~(0xED ^ 0xB4);
        L.lllIIIlllIl[2] = 0xE7 ^ 0xC7;
        L.lllIIIlllIl[3] = 0xFFFFD02E & 0xDA2FDB;
        L.lllIIIlllIl[4] = 0x6E ^ 0x57;
        L.lllIIIlllIl[5] = -" ".length();
        L.lllIIIlllIl[6] = -(0xFFFF89DC & 0x7FAF) & (0xFFFFBBFF & 0x4FBF);
    }

    public boolean run() {
        boolean bl;
        if (L.lIlIllIlIllIII((Object)this.y.activity(), (Object)b.ENCHANT_BOLTS)) {
            bl = lllIIIlllIl[0];
            "".length();
            if ("   ".length() < 0) {
                return ((193 + 172 - 211 + 79 ^ 49 + 74 - -36 + 31) & (105 + 121 - 58 + 84 ^ 91 + 26 - -28 + 26 ^ -" ".length())) != 0;
            }
        } else {
            bl = lllIIIlllIl[1];
        }
        return bl;
    }

    private static boolean lIlIllIlIllIII(Object object, Object object2) {
        return object == object2;
    }
}

