/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bg;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

/* TASK: Prep Make Pots -> PrepmakepotsTask */
@TaskDesc(name="Prep Make Pots", priority=21001, blocking=true)
public class bd
extends bg {
    private static /* synthetic */ String[] lIlIIlllIlII;
    /* synthetic */ boolean ei;
    private static /* synthetic */ int[] lIlIIlllIlIl;

    private static boolean llIllIllIIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIllIllIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIllIllIlIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    protected bd(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
        this.ei = lIlIIlllIlIl[0];
    }

    private static String llIllIllIIlIIl(String var5, String var7) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var16 = var7.toCharArray();
        int var17 = lIlIIlllIlIl[0];
        char[] var2 = var5.toCharArray();
        int var9 = var2.length;
        int var10 = lIlIIlllIlIl[0];
        while (bd.llIllIllIIllIl(var10, var9)) {
            char var1 = var2[var10];
            var11.append((char)(var1 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var10;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean llIllIllIlIIIl(int n2) {
        return n2 <= 0;
    }

    private static void llIllIllIIlIll() {
        lIlIIlllIlII = new String[lIlIIlllIlIl[7]];
        bd.lIlIIlllIlII[bd.lIlIIlllIlIl[0]] = bd."Clean";
        bd.lIlIIlllIlII[bd.lIlIIlllIlIl[1]] = bd."Revitalisation";
        bd.lIlIIlllIlII[bd.lIlIIlllIlIl[5]] = bd."Xeric's";
    }

    private static boolean llIllIllIlIIll(Object object) {
        return object == null;
    }

    private static boolean llIllIllIIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static String llIllIllIIlIlI(String var15, String var6) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIlIIlllIlIl[5], var12);
            return new String(var14.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    static {
        bd.llIllIllIIllII();
        bd.llIllIllIIlIll();
    }

    private static void llIllIllIIllII() {
        lIlIIlllIlIl = new int[8];
        bd.lIlIIlllIlIl[0] = (0x9F ^ 0xC1) & ~(0x53 ^ 0xD);
        bd.lIlIIlllIlIl[1] = 1;
        bd.lIlIIlllIlIl[2] = -(0xFFFFEFDB & 0x3C66) & (0xFFFFFFFF & 0x7DED);
        bd.lIlIIlllIlIl[3] = 0xFFFFD5EB & 0x7BBF;
        bd.lIlIIlllIlIl[4] = 0xD9 ^ 0xB1 ^ (0xC8 ^ 0xA5);
        bd.lIlIIlllIlIl[5] = 2;
        bd.lIlIIlllIlIl[6] = -(0xFFFF8FAD & 0x76FF) & (0xFFFFFFEF & 0x57FD);
        bd.lIlIIlllIlIl[7] = 3;
    }

    private static boolean llIllIllIlIIlI(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean dY() {
        void var2_3;
        void var3_5;
        bd var3;
        if (bd.llIllIllIIllIl(this.eh(), this.ed())) {
            return lIlIIlllIlIl[0];
        }
        int[] nArray = new int[lIlIIlllIlIl[1]];
        nArray[bd.lIlIIlllIlIl[0]] = em;
        TileObject lllllllllllllllIllIlIlllIIIllllI = TileObjects.getNearest((int[])nArray);
        if (bd.llIllIllIIlllI(Inventory.isFull() ? 1 : 0) && bd.llIllIllIIllll(var3.eg(), var3.ek())) {
            int[] nArray2 = new int[lIlIIlllIlIl[1]];
            nArray2[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[2];
            if (bd.llIllIllIIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                return lIlIIlllIlIl[0];
            }
        }
        int[] nArray3 = new int[lIlIIlllIlIl[1]];
        nArray3[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[3];
        if (bd.llIllIllIlIIII(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIlIIlllIlIl[1]];
            nArray4[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[3];
            List var19 = Inventory.getAll((int[])nArray4);
            int var8 = lIlIIlllIlIl[4];
            Iterator var13 = var19.iterator();
            while (bd.llIllIllIlIIII(var13.hasNext() ? 1 : 0)) {
                Item var18 = (Item)var13.next();
                if (bd.llIllIllIlIIIl(var8)) {
                    0;
                    if (null == null) break;
                    return false;
                }
                --var8;
                var18.interact(lIlIIlllIlII[lIlIIlllIlIl[0]]);
                0;
                if (2 != 0) continue;
                return ((0x50 ^ 0x4B ^ (0x51 ^ 0x57)) & (13 + 60 - -29 + 25 ^ (0xEC ^ 0x8E) ^ -1)) != 0;
            }
            return lIlIIlllIlIl[1];
        }
        if (bd.llIllIllIlIIII(Production.isOpen() ? 1 : 0)) {
            if (bd.llIllIllIIllIl(var3.cq(), var3.el)) {
                var3.ei = lIlIIlllIlIl[1];
                Production.chooseOption((String)lIlIIlllIlII[lIlIIlllIlIl[1]]);
                var3.sleep(lIlIIlllIlIl[5]);
                return lIlIIlllIlIl[1];
            }
            var3.ei = lIlIIlllIlIl[0];
            Production.chooseOption((String)lIlIIlllIlII[lIlIIlllIlIl[5]]);
            var3.sleep(lIlIIlllIlIl[5]);
            return lIlIIlllIlIl[1];
        }
        int[] nArray5 = new int[lIlIIlllIlIl[1]];
        nArray5[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[6];
        Item var19 = Inventory.getFirst((int[])nArray5);
        int[] nArray6 = new int[lIlIIlllIlIl[1]];
        nArray6[bd.lIlIIlllIlIl[0]] = lIlIIlllIlIl[2];
        Item var8 = Inventory.getFirst((int[])nArray6);
        if (!bd.llIllIllIlIIlI(var8) || bd.llIllIllIlIIll(var19)) {
            return lIlIIlllIlIl[0];
        }
        System.out.println("CraftRestore: " + var3.ei + " | count: " + var3.cq());
        if (bd.llIllIllIIlllI(var3.ei ? 1 : 0) && bd.llIllIllIlIIII(var3.bS.isAnimating() ? 1 : 0)) {
            return lIlIIlllIlIl[1];
        }
        if (bd.llIllIllIlIIII(var3.ei ? 1 : 0) && bd.llIllIllIlIIII(var3.bS.isAnimating() ? 1 : 0) && bd.llIllIllIIllIl(var3.cq(), var3.el)) {
            return lIlIIlllIlIl[1];
        }
        var3_5.useOn((Item)var2_3);
        return lIlIIlllIlIl[1];
    }
}

