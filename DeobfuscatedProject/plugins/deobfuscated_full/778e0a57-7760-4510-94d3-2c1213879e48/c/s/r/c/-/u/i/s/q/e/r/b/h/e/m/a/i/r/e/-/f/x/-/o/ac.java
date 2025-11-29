/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Drink Stamina -> DrinkstaminaTask */
@TaskDesc(name="Drink Stamina", priority=30000)
public class ac
extends Task {
    private static /* synthetic */ int[] lIlIIlIlllII;
    private static /* synthetic */ String[] lIlIIlIllIll;
    /* synthetic */ int cD;
    /* synthetic */ boolean cE;
    private final /* synthetic */ SquireChambersPlugin cC;

    protected boolean cv() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (ac.llIllIIllIlIlI(item.getName().startsWith(lIlIIlIllIll[lIlIIlIlllII[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlIlllII[3]];
                stringArray[ac.lIlIIlIlllII[0]] = lIlIIlIllIll[lIlIIlIlllII[6]];
                if (ac.llIllIIllIlIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlIlllII[3];
                    0;
                    if (2 != (6 ^ 0x51 ^ (0xCD ^ 0x9E))) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIlIlllII[0];
            return n2 != 0;
        });
        if (ac.llIllIIllIllII(item2)) {
            return lIlIIlIlllII[0];
        }
        item2.interact(lIlIIlIllIll[lIlIIlIlllII[0]]);
        this.sleep(lIlIIlIlllII[4]);
        return lIlIIlIlllII[3];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ boolean b(n n2, TileObject tileObject) {
        int n3;
        if (ac.llIllIIllIlIlI(tileObject.getName().equals(lIlIIlIllIll[lIlIIlIlllII[3]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIIlIlllII[3]];
            stringArray[ac.lIlIIlIlllII[0]] = lIlIIlIllIll[lIlIIlIlllII[4]];
            if (ac.llIllIIllIlIlI(tileObject.hasAction(stringArray) ? 1 : 0) && ac.llIllIIllIlIlI(n2.a((Locatable)tileObject) ? 1 : 0)) {
                n3 = lIlIIlIlllII[3];
                0;
                if (-1 <= 0) return n3 != 0;
                return false;
            }
        }
        n3 = lIlIIlIlllII[0];
        return n3 != 0;
    }

    private static boolean llIllIIllIllII(Object object) {
        return object == null;
    }

    private static void llIllIIllIlIIl() {
        lIlIIlIlllII = new int[9];
        ac.lIlIIlIlllII[0] = (55 + 146 - 63 + 47 ^ 60 + 77 - 106 + 102) & (0x57 ^ 0x78 ^ (0x23 ^ 0x30) ^ -1);
        ac.lIlIIlIlllII[1] = 137 + 49 - 123 + 80 ^ 94 + 11 - 16 + 56;
        ac.lIlIIlIlllII[2] = 108 + 61 - 105 + 65 ^ 67 + 106 - 72 + 38;
        ac.lIlIIlIlllII[3] = 1;
        ac.lIlIIlIlllII[4] = 2;
        ac.lIlIIlIlllII[5] = 3;
        ac.lIlIIlIlllII[6] = 0xC0 ^ 0xC4;
        ac.lIlIIlIlllII[7] = 0x39 ^ 0x3C;
        ac.lIlIIlIlllII[8] = 63 + 33 - 47 + 78 ^ (0x1E ^ 0x69);
    }

    static {
        ac.llIllIIllIlIIl();
        ac.llIllIIllIlIII();
    }

    public boolean run() {
        if (ac.llIllIIllIlIlI(this.cw() ? 1 : 0)) {
            return lIlIIlIlllII[0];
        }
        if (ac.llIllIIllIlIll(Movement.getRunEnergy(), lIlIIlIlllII[1]) && !ac.llIllIIllIlIlI(Movement.isStaminaBoosted() ? 1 : 0) || ac.llIllIIllIlIll(Movement.getRunEnergy(), lIlIIlIlllII[2])) {
            ac var12;
            var12.cv();
            0;
            return lIlIIlIlllII[3];
        }
        return lIlIIlIlllII[0];
    }

    private static boolean llIllIIllIlIlI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cw() {
        boolean bl2;
        void var18;
        n n2 = this.cC.L();
        if (!ac.llIllIIllIllIl(n2) || ac.llIllIIllIlllI(n2.a((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIlIIlIlllII[0];
        }
        TileObject var2 = TileObjects.getNearest(arg_0 -> ac.b((n)var18, arg_0));
        if (ac.llIllIIllIllIl(var2)) {
            bl2 = lIlIIlIlllII[3];
            0;
            if (3 == 0) {
                return false;
            }
        } else {
            bl2 = lIlIIlIlllII[0];
        }
        return bl2;
    }

    private static String llIllIIllIIlIl(String var21, String var1) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIlIIlIlllII[4], var6);
            return new String(var10.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void llIllIIllIlIII() {
        lIlIIlIllIll = new String[lIlIIlIlllII[7]];
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[0]] = ac."Drink";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[3]] = ac."Energy well";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[4]] = ac."Touch";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[5]] = ac."Stamina potion";
        ac.lIlIIlIllIll[ac.lIlIIlIlllII[6]] = ac."Drink";
    }

    private static String llIllIIllIIlll(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var9 = var20.toCharArray();
        int var11 = lIlIIlIlllII[0];
        char[] var15 = var19.toCharArray();
        int var7 = var15.length;
        int var17 = lIlIIlIlllII[0];
        while (ac.llIllIIllIlIll(var17, var7)) {
            char var8 = var15[var17];
            var5.append((char)(var8 ^ var9[var11 % var9.length]));
            0;
            ++var11;
            ++var17;
            0;
            if (3 != 1) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static boolean llIllIIllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIIllIllIl(Object object) {
        return object != null;
    }

    @Inject
    public ac(SquireChambersPlugin squireChambersPlugin) {
        this.cD = lIlIIlIlllII[0];
        this.cE = lIlIIlIlllII[0];
        this.cC = squireChambersPlugin;
    }

    private static String llIllIIllIIllI(String var14, String var3) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIlIIlIlllII[8]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIlIIlIlllII[4], var4);
            return new String(var16.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIIllIlllI(int n2) {
        return n2 == 0;
    }
}

