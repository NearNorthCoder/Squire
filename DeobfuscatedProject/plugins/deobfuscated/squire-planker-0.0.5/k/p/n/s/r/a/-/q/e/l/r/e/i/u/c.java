/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package k.p.n.s.r.a.-.q.e.l.r.e.i.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.construction.SquirePlankerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Making Planks")
public class c
extends Task {
    private final /* synthetic */ SquirePlankerConfig m;
    private static /* synthetic */ int[] llllllIIIIII;
    private static /* synthetic */ String[] lllllIllllll;

    @Inject
    public c(SquirePlankerConfig squirePlankerConfig) {
        this.m = squirePlankerConfig;
    }

    private static boolean lIIlIIllllIIllI(int n) {
        return n != 0;
    }

    static {
        c.lIIlIIllllIIIll();
        c.lIIlIIllllIIIlI();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void lllllllllllllllIIlIlIIIIIIIlIlll;
        void lllllllllllllllIIlIlIIIIIIIllIII;
        void lllllllllllllllIIlIlIIIIIIIlIllI;
        String[] stringArray = new String[llllllIIIIII[0]];
        stringArray[c.llllllIIIIII[1]] = lllllIllllll[llllllIIIIII[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        String[] stringArray2 = new String[llllllIIIIII[0]];
        stringArray2[c.llllllIIIIII[1]] = lllllIllllll[llllllIIIIII[0]];
        NPC nPC = NPCs.getNearest((String[])stringArray2);
        int[] nArray = new int[llllllIIIIII[0]];
        nArray[c.llllllIIIIII[1]] = this.m.plank().d();
        Item item = Inventory.getFirst((int[])nArray);
        String[] stringArray3 = new String[llllllIIIIII[0]];
        stringArray3[c.llllllIIIIII[1]] = lllllIllllll[llllllIIIIII[2]];
        TileObject tileObject2 = TileObjects.getNearest((String[])stringArray3);
        if (c.lIIlIIllllIIlII(tileObject)) {
            return llllllIIIIII[1];
        }
        if (c.lIIlIIllllIIlIl(lllllllllllllllIIlIlIIIIIIIlIllI)) {
            return llllllIIIIII[1];
        }
        if (c.lIIlIIllllIIllI(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llllllIIIIII[1];
        }
        if (c.lIIlIIllllIIllI(Dialog.isOpen() ? 1 : 0)) {
            return llllllIIIIII[1];
        }
        if (c.lIIlIIllllIIlII(lllllllllllllllIIlIlIIIIIIIllIII) && c.lIIlIIllllIIlll(lllllllllllllllIIlIlIIIIIIIllIII.distanceTo((Locatable)Players.getLocal()), llllllIIIIII[0]) && c.lIIlIIllllIlIII(lllllllllllllllIIlIlIIIIIIIllIII.distanceTo((Locatable)Players.getLocal()), llllllIIIIII[3])) {
            lllllllllllllllIIlIlIIIIIIIlIlll.useOn((Actor)lllllllllllllllIIlIlIIIIIIIllIII);
        }
        if (c.lIIlIIllllIIlII(Widgets.get((int)llllllIIIIII[4], (int)llllllIIIIII[1]))) {
            if (!c.lIIlIIllllIIlII(lllllllllllllllIIlIlIIIIIIIllIII) || c.lIIlIIllllIlIIl(lllllllllllllllIIlIlIIIIIIIllIII.distanceTo((Locatable)Players.getLocal()), llllllIIIIII[5])) {
                c lllllllllllllllIIlIlIIIIIIIllIlI;
                Widgets.get((int)llllllIIIIII[4], (int)llllllIIIIII[6]).interact(lllllIllllll[llllllIIIIII[5]]);
                lllllllllllllllIIlIlIIIIIIIllIlI.sleep(llllllIIIIII[7]);
                0;
                if (-1 >= 3) {
                    return ((0x69 ^ 0x21) & ~(0xDA ^ 0x92)) != 0;
                }
            }
        } else if (c.lIIlIIllllIIlII(lllllllllllllllIIlIlIIIIIIIlIlll)) {
            Widgets.get((int)llllllIIIIII[8], (int)llllllIIIIII[9]).interact(lllllIllllll[llllllIIIIII[7]]);
        }
        return llllllIIIIII[0];
    }

    private static boolean lIIlIIllllIlIII(int n, int n2) {
        return n < n2;
    }

    private static String lIIlIIllllIIIIl(String lllllllllllllllIIlIlIIIIIIIIllII, String lllllllllllllllIIlIlIIIIIIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIIIIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIIIIIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIIIIIIlIIII.init(llllllIIIIII[2], lllllllllllllllIIlIlIIIIIIIlIIIl);
            return new String(lllllllllllllllIIlIlIIIIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIIIIIIIllll) {
            lllllllllllllllIIlIlIIIIIIIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIllllIIlII(Object object) {
        return object != null;
    }

    private static void lIIlIIllllIIIll() {
        llllllIIIIII = new int[10];
        c.llllllIIIIII[0] = 1;
        c.llllllIIIIII[1] = (3 ^ 0x20 ^ (0x1F ^ 0x7C)) & (3 + 60 - -83 + 91 ^ 125 + 42 - 82 + 88 ^ -1);
        c.llllllIIIIII[2] = 2;
        c.llllllIIIIII[3] = 0x90 ^ 0x95;
        c.llllllIIIIII[4] = -(0xFFFFDFF7 & 0x3C09) & (0xFFFFBF73 & 0x5DFE);
        c.llllllIIIIII[5] = 3;
        c.llllllIIIIII[6] = 0x6E ^ 0x32 ^ (0x50 ^ 0x1A);
        c.llllllIIIIII[7] = 0x7A ^ 0x7E;
        c.llllllIIIIII[8] = 0x30 ^ 0x44;
        c.llllllIIIIII[9] = 0x70 ^ 0x6F;
    }

    private static boolean lIIlIIllllIIlll(int n, int n2) {
        return n >= n2;
    }

    private static String lIIlIIllllIIIII(String lllllllllllllllIIlIIlllllllllIIl, String lllllllllllllllIIlIIlllllllllIII) {
        lllllllllllllllIIlIIlllllllllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlllllllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllllllllllII = new StringBuilder();
        char[] lllllllllllllllIIlIIlllllllllIll = lllllllllllllllIIlIIlllllllllIII.toCharArray();
        int lllllllllllllllIIlIIlllllllllIlI = llllllIIIIII[1];
        char[] lllllllllllllllIIlIIllllllllIlII = lllllllllllllllIIlIIlllllllllIIl.toCharArray();
        int lllllllllllllllIIlIIllllllllIIll = lllllllllllllllIIlIIllllllllIlII.length;
        int lllllllllllllllIIlIIllllllllIIlI = llllllIIIIII[1];
        while (c.lIIlIIllllIlIII(lllllllllllllllIIlIIllllllllIIlI, lllllllllllllllIIlIIllllllllIIll)) {
            char lllllllllllllllIIlIIllllllllllll = lllllllllllllllIIlIIllllllllIlII[lllllllllllllllIIlIIllllllllIIlI];
            lllllllllllllllIIlIIllllllllllII.append((char)(lllllllllllllllIIlIIllllllllllll ^ lllllllllllllllIIlIIlllllllllIll[lllllllllllllllIIlIIlllllllllIlI % lllllllllllllllIIlIIlllllllllIll.length]));
            0;
            ++lllllllllllllllIIlIIlllllllllIlI;
            ++lllllllllllllllIIlIIllllllllIIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIllllllllllII);
    }

    private static boolean lIIlIIllllIlIIl(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIlIIllllIIlIl(Object object) {
        return object == null;
    }

    private static void lIIlIIllllIIIlI() {
        lllllIllllll = new String[llllllIIIIII[3]];
        c.lllllIllllll[c.llllllIIIIII[1]] = c."Bank chest";
        c.lllllIllllll[c.llllllIIIIII[0]] = c."Demon butler";
        c.lllllIllllll[c.llllllIIIIII[2]] = c."Portal";
        c.lllllIllllll[c.llllllIIIIII[5]] = c."Call Servant";
        c.lllllIllllll[c.llllllIIIIII[7]] = c."View House Options";
    }
}

