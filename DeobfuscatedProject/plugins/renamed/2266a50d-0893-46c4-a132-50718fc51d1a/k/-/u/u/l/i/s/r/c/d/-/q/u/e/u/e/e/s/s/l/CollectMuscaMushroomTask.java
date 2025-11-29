/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h_Unknown;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Collect Musca Mushroom -> CollectmuscamushroomTask */
@TaskDesc(name="Collect Musca Mushroom", priority=98, blocking=true)
public class CollectMuscaMushroomTask
extends Task {
    private static /* synthetic */ String[] lIllIllIIllI;
    private final /* synthetic */ a by;
    private static /* synthetic */ int[] lIllIllIlIIl;
    private final /* synthetic */ SquireDukeSucellus bx;

    private static boolean lllIlIIlIlIIIl(int n2) {
        return n2 != 0;
    }

    private static void lllIlIIlIlIIII() {
        lIllIllIlIIl = new int[7];
        M.lIllIllIlIIl[0] = (0xF ^ 0x2B) & ~(0x1F ^ 0x3B);
        M.lIllIllIlIIl[1] = 1;
        M.lIllIllIlIIl[2] = 0x65 ^ 0x25 ^ (0x29 ^ 0x65);
        M.lIllIllIlIIl[3] = 2;
        M.lIllIllIlIIl[4] = 3;
        M.lIllIllIlIIl[5] = 0xB4 ^ 0xB0;
        M.lIllIllIlIIl[6] = 0x8C ^ 0x81 ^ (0x5F ^ 0x57);
    }

    private static boolean lllIlIIlIlIIll(Object object) {
        return object == null;
    }

    private static boolean lllIlIIlIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        M.lllIlIIlIlIIII();
        M.lllIlIIlIIllIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        if (M.lllIlIIlIlIIIl(this.by.w())) {
            return lIllIllIlIIl[0];
        }
        TileObject var16 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (M.lllIlIIlIlIIIl(tileObject.getName().equals(lIllIllIIllI[lIllIllIlIIl[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIllIlIIl[1]];
                stringArray[M.lIllIllIlIIl[0]] = lIllIllIIllI[lIllIllIlIIl[5]];
                if (M.lllIlIIlIlIIIl(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIllIlIIl[1];
                    0;
                    if (((0x44 ^ 0x1D) & ~(0xE3 ^ 0xBA)) >= -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIllIlIIl[0];
            return n2 != 0;
        });
        if (M.lllIlIIlIlIIll(var16)) {
            return lIllIllIlIIl[0];
        }
        Player var11 = Players.getLocal();
        if (M.lllIlIIlIlIIll(var11)) {
            return lIllIllIlIIl[0];
        }
        if (M.lllIlIIlIlIlII(h.t(var16).contains((Locatable)var11) ? 1 : 0)) {
            return lIllIllIlIIl[0];
        }
        String[] stringArray = new String[lIllIllIlIIl[1]];
        stringArray[M.lIllIllIlIIl[0]] = lIllIllIIllI[lIllIllIlIIl[0]];
        Item var17 = Inventory.getFirst((String[])stringArray);
        if (M.lllIlIIlIlIlIl(var17) && M.lllIlIIlIlIllI(var17.getQuantity(), lIllIllIlIIl[2])) {
            return lIllIllIlIIl[0];
        }
        String[] stringArray2 = new String[lIllIllIlIIl[1]];
        stringArray2[M.lIllIllIlIIl[0]] = lIllIllIIllI[lIllIllIlIIl[1]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray2);
        if (M.lllIlIIlIlIIll(var3)) {
            return lIllIllIlIIl[0];
        }
        var4_4.interact(lIllIllIIllI[lIllIllIlIIl[3]]);
        return lIllIllIlIIl[1];
    }

    private static boolean lllIlIIlIlIlIl(Object object) {
        return object != null;
    }

    private static boolean lllIlIIlIlIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllIlIIlIlIlII(int n2) {
        return n2 == 0;
    }

    private static String lllIlIIlIIIlll(String var13, String var4) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var9 = var4.toCharArray();
        int var7 = lIllIllIlIIl[0];
        char[] var5 = var13.toCharArray();
        int var6 = var5.length;
        int var2 = lIllIllIlIIl[0];
        while (M.lllIlIIlIlIlll(var2, var6)) {
            char var10 = var5[var2];
            var14.append((char)(var10 ^ var9[var7 % var9.length]));
            0;
            ++var7;
            ++var2;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

    private static void lllIlIIlIIllIl() {
        lIllIllIIllI = new String[lIllIllIlIIl[6]];
        M.lIllIllIIllI[M.lIllIllIlIIl[0]] = M."Musca powder";
        M.lIllIllIIllI[M.lIllIllIlIIl[1]] = M."Musca mushrooms";
        M.lIllIllIIllI[M.lIllIllIlIIl[3]] = M."Pick";
        M.lIllIllIIllI[M.lIllIllIlIIl[4]] = M."Gate";
        M.lIllIllIIllI[M.lIllIllIlIIl[5]] = M."Quick-escape";
    }

    private static String lllIlIIlIIIllI(String var8, String var18) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIllIllIlIIl[3], var15);
            return new String(var1.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Inject
    public M(SquireDukeSucellus squireDukeSucellus) {
        this.bx = squireDukeSucellus;
        this.by = squireDukeSucellus.s();
    }
}

