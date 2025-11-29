/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

/* TASK: Teleporting out -> TeleportOutTask */
@TaskDesc(name="Teleporting out", priority=1333337)
public class TeleportingOutTask
extends Task {
    private static /* synthetic */ String[] llIIlIlIllIl;
    private static /* synthetic */ int[] llIIlIlIlllI;

    private static String lllllIlIlllIlI(String var15, String var13) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), llIIlIlIlllI[5]), "DES");
            Cipher var11 = Cipher.getInstance("DES");
            var11.init(llIIlIlIlllI[3], var6);
            return new String(var11.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    static {
        z.lllllIlIllllII();
        z.lllllIlIlllIll();
    }

    private static void lllllIlIllllII() {
        llIIlIlIlllI = new int[6];
        z.llIIlIlIlllI[0] = (98 + 95 - 68 + 5 ^ 10 + 130 - 29 + 63) & (0x92 ^ 0xC1 ^ 57 + 53 - 2 + 19 ^ -1);
        z.llIIlIlIlllI[1] = 1;
        z.llIIlIlIlllI[2] = 0xFFFFDFFE & 0x6C6D;
        z.llIIlIlIlllI[3] = 2;
        z.llIIlIlIlllI[4] = 3;
        z.llIIlIlIlllI[5] = 0x76 ^ 0x7E;
    }

    private static boolean lllllIlIlllllI(Object object) {
        return object == null;
    }

    private static void lllllIlIlllIll() {
        llIIlIlIllIl = new String[llIIlIlIlllI[4]];
        z.llIIlIlIllIl[z.llIIlIlIlllI[0]] = z."Commune";
        z.llIIlIlIllIl[z.llIIlIlIlllI[1]] = z."Attack";
        z.llIIlIlIllIl[z.llIIlIlIlllI[3]] = z."Eat";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (z.lllllIlIllllIl(Inventory.contains(item -> {
            String[] stringArray = new String[llIIlIlIlllI[1]];
            stringArray[z.llIIlIlIlllI[0]] = llIIlIlIllIl[llIIlIlIlllI[3]];
            return item.hasAction(stringArray);
        }) ? 1 : 0)) {
            return llIIlIlIlllI[0];
        }
        int[] nArray = new int[llIIlIlIlllI[1]];
        nArray[z.llIIlIlIlllI[0]] = llIIlIlIlllI[2];
        Item var14 = Inventory.getFirst((int[])nArray);
        if (z.lllllIlIlllllI(var14)) {
            return llIIlIlIlllI[0];
        }
        NPC var7 = NPCs.getNearest(nPC -> {
            int n2;
            if (z.lllllIlIllllIl(nPC.hasAction(llIIlIlIllIl[llIIlIlIlllI[1]]::equals) ? 1 : 0) && z.lllllIlIllllll(nPC.getInteracting(), Players.getLocal())) {
                n2 = llIIlIlIlllI[1];
                0;
                if (((250 + 222 - 467 + 250 ^ 141 + 26 - 73 + 105) & (0x4E ^ 0x6B ^ (0x82 ^ 0x9F) ^ -1)) >= 2) {
                    return ((0xAE ^ 0xC5 ^ (5 ^ 0x74)) & (126 + 29 - 72 + 65 ^ 40 + 136 - 74 + 40 ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIlIlllI[0];
            }
            return n2 != 0;
        });
        if (z.lllllIlIlllllI(var7)) {
            return llIIlIlIlllI[0];
        }
        var1_1.interact(llIIlIlIllIl[llIIlIlIlllI[0]]);
        return llIIlIlIlllI[1];
    }

    private static boolean lllllIlIllllll(Object object, Object object2) {
        return object == object2;
    }

    private static String lllllIlIlllIIl(String var5, String var4) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var2 = var4.toCharArray();
        int var8 = llIIlIlIlllI[0];
        char[] var10 = var5.toCharArray();
        int var16 = var10.length;
        int var3 = llIIlIlIlllI[0];
        while (z.lllllIllIIIIII(var3, var16)) {
            char var12 = var10[var3];
            var9.append((char)(var12 ^ var2[var8 % var2.length]));
            0;
            ++var8;
            ++var3;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    private static boolean lllllIllIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIlIllllIl(int n2) {
        return n2 != 0;
    }
}

