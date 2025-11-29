/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.s;

/* TASK: Cleaning inventory -> CleaninginventoryTask */
@TaskDesc(name="Cleaning inventory", priority=100, blocking=true)
public class u
extends s {
    private static /* synthetic */ int[] lIIllIlIlIlIl;
    private static /* synthetic */ String[] lIIllIlIlIlII;
    public static final /* synthetic */ List<String> af;

    private static boolean lIllIIIIlIIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public u(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static void lIllIIIIlIIIlll() {
        lIIllIlIlIlII = new String[lIIllIlIlIlIl[24]];
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[1]] = u."Yes";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[0]] = u."Dismantle";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[5]] = u."Drop";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[6]] = u."Yes";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[8]] = u."Opal bolt tips";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[9]] = u."Pearl bolt tips";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[10]] = u."Emerald bolt tips";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[11]] = u."Jade bolt tips";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[12]] = u."Sapphire bolt tips";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[13]] = u."Strawberry seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[14]] = u."Mushroom spore";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[15]] = u."Marrentill seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[16]] = u."Jangerberry seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[17]] = u."Tarromin seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[18]] = u."Wildblood seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[19]] = u."Harralander seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[20]] = u."Belladonna seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[7]] = u."Cactus seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[21]] = u."Poison ivy seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[22]] = u."Lantadyme seed";
        u.lIIllIlIlIlII[u.lIIllIlIlIlIl[23]] = u."Xerician fabric";
    }

    private static String lIllIIIIlIIIlII(String var6, String var17) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIIllIlIlIlIl[5], var1);
            return new String(var13.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIlIIIlIl(String var7, String var12) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var19 = var12.toCharArray();
        int var11 = lIIllIlIlIlIl[1];
        char[] var5 = var7.toCharArray();
        int var18 = var5.length;
        int var8 = lIIllIlIlIlIl[1];
        while (u.lIllIIIIlIIllII(var8, var18)) {
            char var16 = var5[var8];
            var14.append((char)(var16 ^ var19[var11 % var19.length]));
            0;
            ++var11;
            ++var8;
            0;
            if (((0x1F ^ 0x3E ^ (0xE4 ^ 0x80)) & (193 + 167 - 228 + 122 ^ 86 + 71 - 140 + 170 ^ -1)) < 2) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    @Override
    public boolean l() {
        if (u.lIllIIIIlIIlIIl(Dialog.isOpen() ? 1 : 0)) {
            if (u.lIllIIIIlIIlIIl(Dialog.hasOption(string -> string.contains(lIIllIlIlIlII[lIIllIlIlIlIl[6]])) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIlIlIlIl[0]];
                stringArray[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlII[lIIllIlIlIlIl[1]];
                Dialog.chooseOption((String[])stringArray);
                0;
                return lIIllIlIlIlIl[0];
            }
            return lIIllIlIlIlIl[1];
        }
        if (!u.lIllIIIIlIIlIlI(Players.getLocal().getAnimation(), lIIllIlIlIlIl[2]) || u.lIllIIIIlIIlIll(Players.getLocal().getAnimation(), lIIllIlIlIlIl[3])) {
            return lIIllIlIlIlIl[1];
        }
        int[] nArray = new int[lIIllIlIlIlIl[0]];
        nArray[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlIl[4];
        if (u.lIllIIIIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIllIlIlIlIl[0]];
            nArray2[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlIl[4];
            Inventory.getFirst((int[])nArray2).interact(lIIllIlIlIlII[lIIllIlIlIlIl[0]]);
            return lIIllIlIlIlIl[0];
        }
        if (u.lIllIIIIlIIlIIl(Inventory.contains(item -> af.contains(item.getName())) ? 1 : 0)) {
            Inventory.getFirst(item -> af.contains(item.getName())).interact(lIIllIlIlIlII[lIIllIlIlIlIl[5]]);
            return lIIllIlIlIlIl[0];
        }
        return lIIllIlIlIlIl[1];
    }

    private static void lIllIIIIlIIlIII() {
        lIIllIlIlIlIl = new int[25];
        u.lIIllIlIlIlIl[0] = 1;
        u.lIIllIlIlIlIl[1] = (0x3B ^ 0x1A) & ~(0xA4 ^ 0x85);
        u.lIIllIlIlIlIl[2] = -(0xFFFFD9E7 & 0x7F3F) & (0xFFFFFFBF & 0x5B7F);
        u.lIIllIlIlIlIl[3] = 0xFFFFEE19 & 0x13FE;
        u.lIIllIlIlIlIl[4] = 0xFFFFF6DC & 0x3D73;
        u.lIIllIlIlIlIl[5] = 2;
        u.lIIllIlIlIlIl[6] = 3;
        u.lIIllIlIlIlIl[7] = 0x91 ^ 0x80;
        u.lIIllIlIlIlIl[8] = 0x21 ^ 0x25;
        u.lIIllIlIlIlIl[9] = 124 + 12 - 122 + 136 ^ 18 + 141 - 30 + 18;
        u.lIIllIlIlIlIl[10] = 0x60 ^ 0x77 ^ (0x6F ^ 0x7E);
        u.lIIllIlIlIlIl[11] = 0xA ^ 0xD;
        u.lIIllIlIlIlIl[12] = 112 + 111 - 208 + 134 ^ 39 + 143 - 99 + 74;
        u.lIIllIlIlIlIl[13] = 0x90 ^ 0x99;
        u.lIIllIlIlIlIl[14] = 0xA3 ^ 0xC2 ^ (0x66 ^ 0xD);
        u.lIIllIlIlIlIl[15] = 0 ^ 0xB;
        u.lIIllIlIlIlIl[16] = 0xC3 ^ 0xC5 ^ (0xB ^ 1);
        u.lIIllIlIlIlIl[17] = 0x58 ^ 0x55;
        u.lIIllIlIlIlIl[18] = 0xB9 ^ 0xB7;
        u.lIIllIlIlIlIl[19] = 0x22 ^ 0x54 ^ (0xBA ^ 0xC3);
        u.lIIllIlIlIlIl[20] = 0xDD ^ 0x89 ^ (0xE4 ^ 0xA0);
        u.lIIllIlIlIlIl[21] = 0x46 ^ 0x54;
        u.lIIllIlIlIlIl[22] = 0x12 ^ 3 ^ 2;
        u.lIIllIlIlIlIl[23] = 0xB4 ^ 0xA0;
        u.lIIllIlIlIlIl[24] = 0xC3 ^ 0xAF ^ (0x6E ^ 0x17);
    }

    private static boolean lIllIIIIlIIlIIl(int n2) {
        return n2 != 0;
    }

    static {
        u.lIllIIIIlIIlIII();
        u.lIllIIIIlIIIlll();
        String[] stringArray = new String[lIIllIlIlIlIl[7]];
        stringArray[u.lIIllIlIlIlIl[1]] = lIIllIlIlIlII[lIIllIlIlIlIl[8]];
        stringArray[u.lIIllIlIlIlIl[0]] = lIIllIlIlIlII[lIIllIlIlIlIl[9]];
        stringArray[u.lIIllIlIlIlIl[5]] = lIIllIlIlIlII[lIIllIlIlIlIl[10]];
        stringArray[u.lIIllIlIlIlIl[6]] = lIIllIlIlIlII[lIIllIlIlIlIl[11]];
        stringArray[u.lIIllIlIlIlIl[8]] = lIIllIlIlIlII[lIIllIlIlIlIl[12]];
        stringArray[u.lIIllIlIlIlIl[9]] = lIIllIlIlIlII[lIIllIlIlIlIl[13]];
        stringArray[u.lIIllIlIlIlIl[10]] = lIIllIlIlIlII[lIIllIlIlIlIl[14]];
        stringArray[u.lIIllIlIlIlIl[11]] = lIIllIlIlIlII[lIIllIlIlIlIl[15]];
        stringArray[u.lIIllIlIlIlIl[12]] = lIIllIlIlIlII[lIIllIlIlIlIl[16]];
        stringArray[u.lIIllIlIlIlIl[13]] = lIIllIlIlIlII[lIIllIlIlIlIl[17]];
        stringArray[u.lIIllIlIlIlIl[14]] = lIIllIlIlIlII[lIIllIlIlIlIl[18]];
        stringArray[u.lIIllIlIlIlIl[15]] = lIIllIlIlIlII[lIIllIlIlIlIl[19]];
        stringArray[u.lIIllIlIlIlIl[16]] = lIIllIlIlIlII[lIIllIlIlIlIl[20]];
        stringArray[u.lIIllIlIlIlIl[17]] = lIIllIlIlIlII[lIIllIlIlIlIl[7]];
        stringArray[u.lIIllIlIlIlIl[18]] = lIIllIlIlIlII[lIIllIlIlIlIl[21]];
        stringArray[u.lIIllIlIlIlIl[19]] = lIIllIlIlIlII[lIIllIlIlIlIl[22]];
        stringArray[u.lIIllIlIlIlIl[20]] = lIIllIlIlIlII[lIIllIlIlIlIl[23]];
        af = List.of(stringArray);
    }

    private static boolean lIllIIIIlIIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIllIIIIlIIIllI(String var2, String var10) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIIllIlIlIlIl[12]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIIllIlIlIlIl[5], var9);
            return new String(var3.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlIIlIll(int n2, int n3) {
        return n2 == n3;
    }
}

