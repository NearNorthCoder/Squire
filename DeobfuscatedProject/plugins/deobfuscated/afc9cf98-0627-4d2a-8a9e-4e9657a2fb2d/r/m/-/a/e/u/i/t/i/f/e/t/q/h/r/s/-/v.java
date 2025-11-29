/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

@TaskDesc(name="Watering Plant", priority=20, blocking=true)
public class v
extends r {
    private static /* synthetic */ int[] lIIlllllIlIII;
    private static /* synthetic */ String[] lIIlllllIIlll;

    static {
        v.lIllIlIlllIIIII();
        v.lIllIlIllIlllll();
    }

    private static boolean lIllIlIlllIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIlIlllIIIlI(Object object) {
        return object == null;
    }

    private static void lIllIlIlllIIIII() {
        lIIlllllIlIII = new int[6];
        v.lIIlllllIlIII[0] = 1;
        v.lIIlllllIlIII[1] = (235 + 102 - 258 + 165 ^ 69 + 100 - 95 + 125) & (0x24 ^ 0x3C ^ (0 ^ 0x2B) ^ -1);
        v.lIIlllllIlIII[2] = -(0xFFFFEAD5 & 0x55AF) & (0xFFFFFCEF & 0x77BD);
        v.lIIlllllIlIII[3] = 2;
        v.lIIlllllIlIII[4] = -(0xFFFFA28D & 0x7F7F) & (0xFFFFBFDF & 0x76FF);
        v.lIIlllllIlIII[5] = 0xFFFF9CDC & 0x77FF;
    }

    private static boolean lIllIlIlllIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlIlllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        v llllllllllllllIlllIIllIlIIIIlIIl;
        int[] nArray = new int[lIIlllllIlIII[0]];
        nArray[v.lIIlllllIlIII[1]] = lIIlllllIlIII[2];
        Item item2 = Inventory.getFirst((int[])nArray);
        if (v.lIllIlIlllIIIIl(Inventory.contains(item -> {
            int n2;
            if (v.lIllIlIlllIIlII(item.getId(), lIIlllllIlIII[4]) && v.lIllIlIlllIIlIl(item.getId(), lIIlllllIlIII[5])) {
                n2 = lIIlllllIlIII[0];
                0;
                if (-(0x33 ^ 0x39 ^ (0x64 ^ 0x6A)) > 0) {
                    return ((127 + 130 - 80 + 6 ^ 31 + 29 - 54 + 128) & (0x49 ^ 0x37 ^ (0x6A ^ 0x25) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlllllIlIII[1];
            }
            return n2 != 0;
        }) ? 1 : 0) && v.lIllIlIlllIIIlI(item2)) {
            return lIIlllllIlIII[1];
        }
        TileObject llllllllllllllIlllIIllIlIIIIIlll = llllllllllllllIlllIIllIlIIIIlIIl.Z.a(lIIlllllIIlll[lIIlllllIlIII[1]]);
        if (v.lIllIlIlllIIIlI(llllllllllllllIlllIIllIlIIIIIlll)) {
            return lIIlllllIlIII[1];
        }
        llllllllllllllIlllIIllIlIIIIIlll.interact(lIIlllllIIlll[lIIlllllIlIII[0]]);
        GameObject llllllllllllllIlllIIllIlIIIIIllI = (GameObject)llllllllllllllIlllIIllIlIIIIIlll;
        Player llllllllllllllIlllIIllIlIIIIIlIl = Players.getLocal();
        if (v.lIllIlIlllIIIll(llllllllllllllIlllIIllIlIIIIIllI.getWorldArea().isInMeleeDistance(llllllllllllllIlllIIllIlIIIIIlIl.getWorldArea()) ? 1 : 0)) {
            llllllllllllllIlllIIllIlIIIIlIIl.sleep(lIIlllllIlIII[3]);
        }
        return lIIlllllIlIII[0];
    }

    private static String lIllIlIllIllllI(String llllllllllllllIlllIIllIIllllIIll, String llllllllllllllIlllIIllIIllllIIlI) {
        llllllllllllllIlllIIllIIllllIIll = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIIllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIllIIllllIllI = new StringBuilder();
        char[] llllllllllllllIlllIIllIIllllIlIl = llllllllllllllIlllIIllIIllllIIlI.toCharArray();
        int llllllllllllllIlllIIllIIllllIlII = lIIlllllIlIII[1];
        char[] llllllllllllllIlllIIllIIlllIlllI = llllllllllllllIlllIIllIIllllIIll.toCharArray();
        int llllllllllllllIlllIIllIIlllIllIl = llllllllllllllIlllIIllIIlllIlllI.length;
        int llllllllllllllIlllIIllIIlllIllII = lIIlllllIlIII[1];
        while (v.lIllIlIlllIIllI(llllllllllllllIlllIIllIIlllIllII, llllllllllllllIlllIIllIIlllIllIl)) {
            char llllllllllllllIlllIIllIIlllllIIl = llllllllllllllIlllIIllIIlllIlllI[llllllllllllllIlllIIllIIlllIllII];
            llllllllllllllIlllIIllIIllllIllI.append((char)(llllllllllllllIlllIIllIIlllllIIl ^ llllllllllllllIlllIIllIIllllIlIl[llllllllllllllIlllIIllIIllllIlII % llllllllllllllIlllIIllIIllllIlIl.length]));
            0;
            ++llllllllllllllIlllIIllIIllllIlII;
            ++llllllllllllllIlllIIllIIlllIllII;
            0;
            if ((0x90 ^ 0x94) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIllIIllllIllI);
    }

    private static boolean lIllIlIlllIIIIl(int n2) {
        return n2 == 0;
    }

    @Inject
    protected v(i i2) {
        super(i2);
    }

    private static void lIllIlIllIlllll() {
        lIIlllllIIlll = new String[lIIlllllIlIII[3]];
        v.lIIlllllIIlll[v.lIIlllllIlIII[1]] = v."Water";
        v.lIIlllllIIlll[v.lIIlllllIlIII[0]] = v."Water";
    }

    private static boolean lIllIlIlllIIIll(int n2) {
        return n2 != 0;
    }
}

