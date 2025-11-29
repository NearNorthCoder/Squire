/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameState
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Lunar
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import net.runelite.api.GameState;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

/* TASK: Logging out -> LoggingoutTask */
@TaskDesc(name="Logging out")
public class j
extends Task {
    private final /* synthetic */ SquireMinerConfig q;
    private final /* synthetic */ SquireMiner p;
    private static /* synthetic */ String[] lllllIlIlIll;
    private final /* synthetic */ int[] r;
    private static /* synthetic */ int[] lllllIlIllII;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean n() {
        int n2;
        block4: {
            block3: {
                block2: {
                    if (!j.lIIlIIllIllIlII(Inventory.contains((int[])this.r) ? 1 : 0)) break block2;
                    int[] nArray = new int[lllllIlIllII[3]];
                    nArray[j.lllllIlIllII[1]] = lllllIlIllII[15];
                    if (!j.lIIlIIllIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[lllllIlIllII[3]];
                    nArray2[j.lllllIlIllII[1]] = lllllIlIllII[16];
                    if (!j.lIIlIIllIllIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[lllllIlIllII[3]];
                nArray[j.lllllIlIllII[1]] = lllllIlIllII[17];
                if (!j.lIIlIIllIllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[lllllIlIllII[3]];
                nArray3[j.lllllIlIllII[1]] = lllllIlIllII[18];
                if (!j.lIIlIIllIllIlIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[lllllIlIllII[3]];
                nArray4[j.lllllIlIllII[1]] = lllllIlIllII[19];
                if (!j.lIIlIIllIllIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = lllllIlIllII[3];
            0;
            if (((96 + 88 - 152 + 103 ^ 68 + 120 - 60 + 11) & (0xAE ^ 0x83 ^ (0xB4 ^ 0x95) ^ -1)) == 0) return n2 != 0;
            return ((0x86 ^ 0xBB ^ (0x97 ^ 0xA1)) & (0xA ^ 6 ^ (0x13 ^ 0x14) ^ -1)) != 0;
        }
        n2 = lllllIlIllII[1];
        return n2 != 0;
    }

    private static boolean lIIlIIllIllIIll(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public j(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        int[] nArray = new int[lllllIlIllII[0]];
        nArray[j.lllllIlIllII[1]] = lllllIlIllII[2];
        nArray[j.lllllIlIllII[3]] = lllllIlIllII[4];
        nArray[j.lllllIlIllII[5]] = lllllIlIllII[6];
        nArray[j.lllllIlIllII[7]] = lllllIlIllII[8];
        this.r = nArray;
        this.p = squireMiner;
        this.q = squireMinerConfig;
    }

    private static boolean lIIlIIllIllIlII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        j var6;
        block11: {
            block10: {
                if (j.lIIlIIllIllIIll(Game.getState(), GameState.LOGGED_IN)) {
                    return lllllIlIllII[1];
                }
                if (j.lIIlIIllIllIIll((Object)var6.q.activity(), (Object)a.GRANITE) && j.lIIlIIllIllIIll((Object)var6.q.activity(), (Object)a.SANDSTONE)) {
                    return lllllIlIllII[1];
                }
                if (!j.lIIlIIllIllIlII(var6.q.waterskins())) break block10;
                int[] nArray = new int[lllllIlIllII[3]];
                nArray[j.lllllIlIllII[1]] = lllllIlIllII[9];
                if (!j.lIIlIIllIllIlII(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
            }
            return lllllIlIllII[1];
        }
        if (j.lIIlIIllIllIlIl(var6.n() ? 1 : 0)) {
            System.out.println(lllllIlIlIll[lllllIlIllII[1]]);
            return lllllIlIllII[1];
        }
        if (j.lIIlIIllIllIlII(var6.q.humidify() ? 1 : 0) && j.lIIlIIllIllIlIl(Magic.canCast((Spell)SpellBook.Lunar.HUMIDIFY) ? 1 : 0)) {
            System.out.println(lllllIlIlIll[lllllIlIllII[3]]);
            Game.logout();
            return lllllIlIllII[3];
        }
        if (j.lIIlIIllIllIlIl(var6.q.humidify() ? 1 : 0)) {
            int[] nArray = new int[lllllIlIllII[3]];
            nArray[j.lllllIlIllII[1]] = lllllIlIllII[10];
            if (j.lIIlIIllIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllllIlIllII[0]];
                nArray2[j.lllllIlIllII[1]] = lllllIlIllII[11];
                nArray2[j.lllllIlIllII[3]] = lllllIlIllII[12];
                nArray2[j.lllllIlIllII[5]] = lllllIlIllII[13];
                nArray2[j.lllllIlIllII[7]] = lllllIlIllII[14];
                if (j.lIIlIIllIllIlIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    System.out.println(lllllIlIlIll[lllllIlIllII[5]]);
                    Game.logout();
                    return lllllIlIllII[3];
                }
            }
        }
        return lllllIlIllII[1];
    }

    private static String lIIlIIllIlIllll(String var2, String var8) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lllllIlIllII[20]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lllllIlIllII[5], var9);
            return new String(var5.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIllIllIIII(String var3, String var10) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lllllIlIllII[5], var4);
            return new String(var11.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static void lIIlIIllIllIIlI() {
        lllllIlIllII = new int[21];
        j.lllllIlIllII[0] = 0xE ^ 0x75 ^ 5 + 102 - -20 + 0;
        j.lllllIlIllII[1] = (0x65 ^ 0x33 ^ (0x2F ^ 0x6D)) & (104 + 188 - 252 + 172 ^ 17 + 89 - 31 + 117 ^ -1);
        j.lllllIlIllII[2] = (0x8F ^ 0x81) + (186 + 72 - 81 + 32) - (0xF1 ^ 0xC6) + (0x26 ^ 0x77);
        j.lllllIlIllII[3] = 1;
        j.lllllIlIllII[4] = 57 + 22 - 39 + 90 + (43 + 53 - -54 + 2) - (85 + 146 - 65 + 23) + (107 + 129 - 89 + 11);
        j.lllllIlIllII[5] = 2;
        j.lllllIlIllII[6] = (0x82 ^ 0xB1) + (0xB7 ^ 0x8B) - -(0x84 ^ 0x90) + (0xC1 ^ 0xBB);
        j.lllllIlIllII[7] = 3;
        j.lllllIlIllII[8] = 243 + 110 - 231 + 133;
        j.lllllIlIllII[9] = -(0xFFFF8227 & 0x7FDF) & (0xFFFFEB5F & Short.MAX_VALUE);
        j.lllllIlIllII[10] = -(0xFFFFBFAB & 0x785D) & (0xFFFFFBFB & 0x3FEF);
        j.lllllIlIllII[11] = -(0xFFFFD1DD & 0x7EF3) & (0xFFFFDFF7 & 0x77FD);
        j.lllllIlIllII[12] = 0xFFFFC7BB & 0x3F67;
        j.lllllIlIllII[13] = 0xFFFFFFED & 0x733;
        j.lllllIlIllII[14] = 0xFFFF97DF & 0x6F3F;
        j.lllllIlIllII[15] = 0xFFFF97B7 & 0x6FDB;
        j.lllllIlIllII[16] = 94 + 46 - 104 + 197;
        j.lllllIlIllII[17] = 0xFFFFEFB6 & 0x13FB;
        j.lllllIlIllII[18] = -(0xFFFFEB5B & 0x17A7) & (0xFFFFBBBF & 0x5FFF);
        j.lllllIlIllII[19] = -(0xFFFFF643 & 0x4BFE) & (0xFFFFFBFF & 0x5EFD);
        j.lllllIlIllII[20] = 0xA2 ^ 0xAA;
    }

    private static boolean lIIlIIllIllIlIl(int n2) {
        return n2 == 0;
    }

    static {
        j.lIIlIIllIllIIlI();
        j.lIIlIIllIllIIIl();
    }

    private static void lIIlIIllIllIIIl() {
        lllllIlIlIll = new String[lllllIlIllII[7]];
        j.lllllIlIlIll[j.lllllIlIllII[1]] = j."We are missing items to properly 3tick";
        j.lllllIlIlIll[j.lllllIlIllII[3]] = j."We are using humidify, but we cannot cast it.";
        j.lllllIlIlIll[j.lllllIlIllII[5]] = j."We are missing waterskins, and can't buy new ones. Logging out.";
    }
}

