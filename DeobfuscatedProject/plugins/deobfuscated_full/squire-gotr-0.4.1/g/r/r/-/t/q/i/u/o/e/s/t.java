/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

/* TASK: Depositing runes -> DepositingrunesTask */
@TaskDesc(name="Depositing runes", priority=2, blocking=true, register=true)
public class t
extends h {
    private static /* synthetic */ String[] llIIlllIlllI;
    private static /* synthetic */ int[] llIIllllIIIl;

    static {
        t.lllllllIllllll();
        t.lllllllIlllIlI();
    }

    private static String lllllllIlllIII(String var6, String var12) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llIIllllIIIl[3], var10);
            return new String(var7.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllllllIllllll() {
        llIIllllIIIl = new int[8];
        t.llIIllllIIIl[0] = 0x98 ^ 0x9C;
        t.llIIllllIIIl[1] = (0x70 ^ 0x77 ^ (0x8C ^ 0xA1)) & (0xE4 ^ 0x83 ^ (0x42 ^ 0xF) ^ -1);
        t.llIIllllIIIl[2] = 1;
        t.llIIllllIIIl[3] = 2;
        t.llIIllllIIIl[4] = 3;
        t.llIIllllIIIl[5] = 0xFFFFFFF2 & 0xAABD;
        t.llIIllllIIIl[6] = 0x5C ^ 0x59;
        t.llIIllllIIIl[7] = 0xD6 ^ 0x8D ^ (0x41 ^ 0x12);
    }

    @Inject
    public t(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIllllIIIl[0]];
        cArray[t.llIIllllIIIl[1]] = c.COUNTDOWN;
        cArray[t.llIIllllIIIl[2]] = c.ACTIVATING;
        cArray[t.llIIllllIIIl[3]] = c.ACTIVE;
        cArray[t.llIIllllIIIl[4]] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean llllllllIIIIIl(int n2) {
        return n2 != 0;
    }

    @Override
    protected boolean aj() {
        return llIIllllIIIl[2];
    }

    private static String lllllllIlllIIl(String var8, String var11) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), llIIllllIIIl[7]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(llIIllllIIIl[3], var5);
            return new String(var9.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    @Override
    protected boolean ak() {
        t var3;
        if (t.llllllllIIIIII(this.aW.depositRunes() ? 1 : 0)) {
            return llIIllllIIIl[1];
        }
        if (t.llllllllIIIIII(Inventory.contains(item -> {
            int n2;
            if (t.llllllllIIIIIl(item.isStackable() ? 1 : 0) && t.llllllllIIIIIl(item.getName().contains(llIIlllIlllI[llIIllllIIIl[2]]) ? 1 : 0)) {
                n2 = llIIllllIIIl[2];
                0;
                if (((0x4C ^ 2) & ~(0x23 ^ 0x6D)) < 0) {
                    return false;
                }
            } else {
                n2 = llIIllllIIIl[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return llIIllllIIIl[1];
        }
        if (t.llllllllIIIIIl(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIllllIIIl[1];
        }
        int[] nArray = new int[llIIllllIIIl[2]];
        nArray[t.llIIllllIIIl[1]] = llIIllllIIIl[5];
        TileObject var4 = TileObjects.getNearest((int[])nArray);
        if (!t.llllllllIIIIlI(var4) || t.llllllllIIIIll(var4.distanceTo((Locatable)Players.getLocal()), llIIllllIIIl[6])) {
            return llIIllllIIIl[1];
        }
        if (t.llllllllIIIIII(var3.b((GameObject)var4) ? 1 : 0)) {
            var4.interact(llIIlllIlllI[llIIllllIIIl[1]]);
        }
        return llIIllllIIIl[2];
    }

    private static void lllllllIlllIlI() {
        llIIlllIlllI = new String[llIIllllIIIl[3]];
        t.llIIlllIlllI[t.llIIllllIIIl[1]] = t."Deposit-runes";
        t.llIIlllIlllI[t.llIIllllIIIl[2]] = t."rune";
    }

    private static boolean llllllllIIIIII(int n2) {
        return n2 == 0;
    }

    private static boolean llllllllIIIIlI(Object object) {
        return object != null;
    }
}

