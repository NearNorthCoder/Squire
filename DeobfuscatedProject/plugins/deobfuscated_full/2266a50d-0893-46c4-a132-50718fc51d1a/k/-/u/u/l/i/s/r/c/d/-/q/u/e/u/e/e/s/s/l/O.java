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
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.h;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Exit Musca Area -> ExitmuscaareaTask */
@TaskDesc(name="Exit Musca Area", priority=97, blocking=true)
public class O
extends Task {
    private static /* synthetic */ int[] lIllIlIIllII;
    final /* synthetic */ a bC;
    final /* synthetic */ SquireDukeSucellus bB;
    private static /* synthetic */ String[] lIllIlIIlIll;

    static {
        O.lllIIlllIIllll();
        O.lllIIlllIIlllI();
    }

    private static void lllIIlllIIllll() {
        lIllIlIIllII = new int[6];
        O.lIllIlIIllII[0] = (77 + 102 - 92 + 63 ^ 15 + 144 - 90 + 107) & (0xFD ^ 0xBE ^ (0x5B ^ 0x3E) ^ -1);
        O.lIllIlIIllII[1] = 1;
        O.lIllIlIIllII[2] = 0xBF ^ 0xB3;
        O.lIllIlIIllII[3] = 2;
        O.lIllIlIIllII[4] = 3;
        O.lIllIlIIllII[5] = 180 + 1 - 131 + 136 ^ 51 + 148 - 165 + 144;
    }

    private static String lllIIlllIIllIl(String var8, String var18) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lIllIlIIllII[5]), "DES");
            Cipher var2 = Cipher.getInstance("DES");
            var2.init(lIllIlIIllII[3], var21);
            return new String(var2.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllIlIlII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (O.lllIIlllIlIIII(this.bC.w())) {
            return lIllIlIIllII[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (O.lllIIlllIlIIII(tileObject.getName().equals(lIllIlIIlIll[lIllIlIIllII[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIllII[1]];
                stringArray[O.lIllIlIIllII[0]] = lIllIlIIlIll[lIllIlIIllII[3]];
                if (O.lllIIlllIlIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIllII[1];
                    0;
                    if (((34 + 145 - 58 + 31 ^ 126 + 90 - 99 + 21) & (0x95 ^ 0xB4 ^ (0x82 ^ 0xB1) ^ -1)) < (0xD0 ^ 0x92 ^ (0x41 ^ 7))) return n2 != 0;
                    return ((0x2E ^ 0x1E ^ (0x52 ^ 0x39)) & (0x2A ^ 0x62 ^ (0x2B ^ 0x38) ^ -1)) != 0;
                }
            }
            n2 = lIllIlIIllII[0];
            return n2 != 0;
        });
        if (O.lllIIlllIlIIIl(var3)) {
            return lIllIlIIllII[0];
        }
        Player var1 = Players.getLocal();
        if (O.lllIIlllIlIIIl(var1)) {
            return lIllIlIIllII[0];
        }
        if (O.lllIIlllIlIIII(h.i(var3).contains((Locatable)var1) ? 1 : 0)) {
            return lIllIlIIllII[0];
        }
        String[] stringArray = new String[lIllIlIIllII[1]];
        stringArray[O.lIllIlIIllII[0]] = lIllIlIIlIll[lIllIlIIllII[0]];
        Item var16 = Inventory.getFirst((String[])stringArray);
        if (!O.lllIIlllIlIIlI(var16) || O.lllIIlllIlIIll(var16.getQuantity(), lIllIlIIllII[2])) {
            return lIllIlIIllII[0];
        }
        if (O.lllIIlllIlIIII(h.t(var3).contains((Locatable)var1) ? 1 : 0) && O.lllIIlllIlIlII(h.f(var3).equals((Object)var1.getWorldLocation()) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)h.f(var3));
            return lIllIlIIllII[1];
        }
        Movement.setDestination((WorldPoint)h.j((TileObject)var1_1));
        return lIllIlIIllII[1];
    }

    private static boolean lllIIlllIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlllIlIIlI(Object object) {
        return object != null;
    }

    private static String lllIIlllIIllII(String var4, String var22) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var15 = var22.toCharArray();
        int var13 = lIllIlIIllII[0];
        char[] var17 = var4.toCharArray();
        int var14 = var17.length;
        int var11 = lIllIlIIllII[0];
        while (O.lllIIlllIlIIll(var11, var14)) {
            char var7 = var17[var11];
            var9.append((char)(var7 ^ var15[var13 % var15.length]));
            0;
            ++var13;
            ++var11;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lllIIlllIlIIIl(Object object) {
        return object == null;
    }

    private static String lllIIlllIIlIll(String var20, String var19) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIllIlIIllII[3], var5);
            return new String(var10.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    @Inject
    public O(SquireDukeSucellus squireDukeSucellus) {
        this.bB = squireDukeSucellus;
        this.bC = squireDukeSucellus.s();
    }

    private static boolean lllIIlllIlIIII(int n2) {
        return n2 != 0;
    }

    private static void lllIIlllIIlllI() {
        lIllIlIIlIll = new String[lIllIlIIllII[4]];
        O.lIllIlIIlIll[O.lIllIlIIllII[0]] = O."Musca powder";
        O.lIllIlIIlIll[O.lIllIlIIllII[1]] = O."Gate";
        O.lIllIlIIlIll[O.lIllIlIIllII[3]] = O."Quick-escape";
    }
}

