/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.api.game.Prices
 */
package gg.squire.runecrafting;

import com.google.inject.Inject;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.runecrafting.overlay.RunecrafterInfoBox;
import h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.a;
import h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.b;
import h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.c;
import h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.d;
import h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.e;
import h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.f;
import h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.g;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.game.Prices;

@PluginDescriptor(name="Squire Zeah Runecrafter", enabledByDefault=false)
public class SquireZeahRunecrafter
extends SquirePlugin {
    private /* synthetic */ int g;
    @Inject
    private /* synthetic */ EventBus b;
    @Inject
    private /* synthetic */ a d;
    @Inject
    private /* synthetic */ RunecrafterInfoBox c;
    private /* synthetic */ int f;
    private /* synthetic */ boolean e;
    @Inject
    private /* synthetic */ OverlayManager a;
    private static /* synthetic */ int[] lIllIIllIlIIl;

    public int b() {
        return this.f;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllIIllIlIIl[0]];
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[1]] = f.class;
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[2]] = g.class;
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[3]] = e.class;
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[4]] = c.class;
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[5]] = d.class;
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[6]] = b.class;
        return classArray;
    }

    protected void onStart() {
        this.a(lIllIIllIlIIl[1]);
        this.d.c(lIllIIllIlIIl[7]);
        this.a.add((Overlay)this.c);
        "".length();
    }

    private static boolean llIIIllIlIllIIl(int n) {
        return n != 0;
    }

    protected void onStop() {
        this.a.remove((Overlay)this.c);
        "".length();
    }

    public boolean a() {
        return this.e;
    }

    public int c() {
        return this.g;
    }

    public void a(int n) {
        this.f = n;
    }

    private static void llIIIllIlIllIII() {
        lIllIIllIlIIl = new int[11];
        SquireZeahRunecrafter.lIllIIllIlIIl[0] = 0x69 ^ 0x4B ^ (0x4E ^ 0x6A);
        SquireZeahRunecrafter.lIllIIllIlIIl[1] = (8 + 89 - 36 + 170 ^ 65 + 166 - 221 + 177) & (0x81 ^ 0xA6 ^ (9 ^ 0x72) ^ -" ".length());
        SquireZeahRunecrafter.lIllIIllIlIIl[2] = " ".length();
        SquireZeahRunecrafter.lIllIIllIlIIl[3] = "  ".length();
        SquireZeahRunecrafter.lIllIIllIlIIl[4] = "   ".length();
        SquireZeahRunecrafter.lIllIIllIlIIl[5] = 0xA6 ^ 0xA2;
        SquireZeahRunecrafter.lIllIIllIlIIl[6] = 0xC3 ^ 0x90 ^ (0x20 ^ 0x76);
        SquireZeahRunecrafter.lIllIIllIlIIl[7] = -" ".length();
        SquireZeahRunecrafter.lIllIIllIlIIl[8] = -(0xFFFFFE6D & 0x61FF) & (0xFFFFFFEE & 0x7F7F);
        SquireZeahRunecrafter.lIllIIllIlIIl[9] = 0xFFFFFEC6 & 0x35BF;
        SquireZeahRunecrafter.lIllIIllIlIIl[10] = -(0xFFFFCFC7 & 0x7DFB) & (0xFFFFFFF7 & 0x4FFF);
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    static {
        SquireZeahRunecrafter.llIIIllIlIllIII();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        SquireZeahRunecrafter llllllllllllllIllIIlIIIllllIIIII;
        void llllllllllllllIllIIlIIIlllIlllll;
        if (SquireZeahRunecrafter.llIIIllIlIllIIl(inventoryChanged.getChangeType().equals((Object)InventoryChanged.ChangeType.ITEM_REMOVED) ? 1 : 0)) {
            if (SquireZeahRunecrafter.llIIIllIlIllIlI(inventoryChanged.getItemId(), lIllIIllIlIIl[8])) {
                this.d.c(lIllIIllIlIIl[1]);
            }
            if (SquireZeahRunecrafter.llIIIllIlIllIlI(llllllllllllllIllIIlIIIlllIlllll.getItemId(), lIllIIllIlIIl[9])) {
                llllllllllllllIllIIlIIIllllIIIII.d.c(llllllllllllllIllIIlIIIllllIIIII.d.j() + lIllIIllIlIIl[5]);
            }
        }
        if (SquireZeahRunecrafter.llIIIllIlIllIIl(llllllllllllllIllIIlIIIlllIlllll.getChangeType().equals((Object)InventoryChanged.ChangeType.ITEM_ADDED) ? 1 : 0) && SquireZeahRunecrafter.llIIIllIlIllIlI(llllllllllllllIllIIlIIIlllIlllll.getItemId(), lIllIIllIlIIl[10])) {
            llllllllllllllIllIIlIIIllllIIIII.a(llllllllllllllIllIIlIIIllllIIIII.b() + llllllllllllllIllIIlIIIlllIlllll.getAmount());
            llllllllllllllIllIIlIIIllllIIIII.b(llllllllllllllIllIIlIIIllllIIIII.c() + Prices.getItemPrice((int)llllllllllllllIllIIlIIIlllIlllll.getItemId()) * llllllllllllllIllIIlIIIlllIlllll.getAmount());
        }
    }

    private static boolean llIIIllIlIllIlI(int n, int n2) {
        return n == n2;
    }

    public void b(int n) {
        this.g = n;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }
}

