/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;

/* TASK: Opening coin pouches -> OpeningcoinpouchesTask */
@TaskDesc(name="Opening coin pouches", priority=0x7FFFFFFF)
public class OpeningCoinPouchesTask
extends Task {
    private /* synthetic */ int y;
    private final /* synthetic */ int x = 22;
    private final /* synthetic */ SquireThievingConfig v;
    private static /* synthetic */ int[] lIIllIllIIllI;
    private final /* synthetic */ int w = 15;
    private static /* synthetic */ String[] lIIllIllIIlIl;

    private static void lIllIIIlIIllIlI() {
        lIIllIllIIllI = new int[11];
        j.lIIllIllIIllI[0] = 0xF5 ^ 0xC4 ^ (0x45 ^ 0x7B);
        j.lIIllIllIIllI[1] = 0x9D ^ 0x8B;
        j.lIIllIllIIllI[2] = (0x54 ^ 0x1A ^ (0xCD ^ 0xB4)) & (64 + 212 - 238 + 204 ^ 88 + 21 - 25 + 113 ^ -1);
        j.lIIllIllIIllI[3] = -1;
        j.lIIllIllIIllI[4] = 1;
        j.lIIllIllIIllI[5] = 2;
        j.lIIllIllIIllI[6] = 3;
        j.lIIllIllIIllI[7] = 0x59 ^ 0x5D;
        j.lIIllIllIIllI[8] = 0xC5 ^ 0xC0;
        j.lIIllIllIIllI[9] = 0x79 ^ 0x7F;
        j.lIIllIllIIllI[10] = 0x22 ^ 0x4F ^ (0xEE ^ 0x8B);
    }

    private static boolean lIllIIIlIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIIlllIl(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIlIIlIllI(String var4, String var10) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIIllIllIIllI[10]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIIllIllIIllI[5], var7);
            return new String(var16.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIlIIllllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        j var2;
        if (j.lIllIIIlIIllIll(Game.getState(), GameState.LOGGED_IN)) {
            return lIIllIllIIllI[2];
        }
        Player var14 = Players.getLocal();
        if (j.lIllIIIlIIlllII(var14.getGraphic(), lIIllIllIIllI[3])) {
            String[] stringArray = new String[lIIllIllIIllI[4]];
            stringArray[j.lIIllIllIIllI[2]] = lIIllIllIIlIl[lIIllIllIIllI[2]];
            if (j.lIllIIIlIIlllIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[lIIllIllIIllI[4]];
                stringArray2[j.lIIllIllIIllI[2]] = lIIllIllIIlIl[lIIllIllIIllI[4]];
                Inventory.getFirst((String[])stringArray2).interact(lIIllIllIIlIl[lIIllIllIIllI[5]]);
                return lIIllIllIIllI[4];
            }
            return lIIllIllIIllI[2];
        }
        String[] stringArray = new String[lIIllIllIIllI[4]];
        stringArray[j.lIIllIllIIllI[2]] = lIIllIllIIlIl[lIIllIllIIllI[6]];
        Item var6 = Inventory.getFirst((String[])stringArray);
        if (j.lIllIIIlIIllllI(var6)) {
            return lIIllIllIIllI[2];
        }
        if (j.lIllIIIlIIlllll(Inventory.getFreeSlots(), lIIllIllIIllI[5])) {
            var6.interact(lIIllIllIIlIl[lIIllIllIIllI[7]]);
            return lIIllIllIIllI[4];
        }
        if (j.lIllIIIlIlIIIII(var6.getQuantity(), var2.y)) {
            return lIIllIllIIllI[2];
        }
        var2_2.interact(lIIllIllIIlIl[lIIllIllIIllI[8]]);
        this.y = Rand.nextInt((int)lIIllIllIIllI[0], (int)lIIllIllIIllI[1]);
        return lIIllIllIIllI[4];
    }

    private static boolean lIllIIIlIIlllII(int n2, int n3) {
        return n2 != n3;
    }

    static {
        j.lIllIIIlIIllIlI();
        j.lIllIIIlIIllIIl();
    }

    private static boolean lIllIIIlIIlllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllIIIlIIlIlll(String var9, String var1) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var20 = var1.toCharArray();
        int var15 = lIIllIllIIllI[2];
        char[] var22 = var9.toCharArray();
        int var3 = var22.length;
        int var13 = lIIllIllIIllI[2];
        while (j.lIllIIIlIlIIIII(var13, var3)) {
            char var21 = var22[var13];
            var17.append((char)(var21 ^ var20[var15 % var20.length]));
            0;
            ++var15;
            ++var13;
            0;
            if ((0x89 ^ 0x98 ^ (0x67 ^ 0x72)) >= -1) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static void lIllIIIlIIllIIl() {
        lIIllIllIIlIl = new String[lIIllIllIIllI[9]];
        j.lIIllIllIIlIl[j.lIIllIllIIllI[2]] = j."Coin pouch";
        j.lIIllIllIIlIl[j.lIIllIllIIllI[4]] = j."Coin pouch";
        j.lIIllIllIIlIl[j.lIIllIllIIllI[5]] = j."Open-all";
        j.lIIllIllIIlIl[j.lIIllIllIIllI[6]] = j."Coin pouch";
        j.lIIllIllIIlIl[j.lIIllIllIIllI[7]] = j."Open-all";
        j.lIIllIllIIlIl[j.lIIllIllIIllI[8]] = j."Open-all";
    }

    private static String lIllIIIlIIllIII(String var18, String var19) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIllIllIIllI[5], var12);
            return new String(var8.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    @Inject
    public j(SquireThievingConfig squireThievingConfig) {
        this.w = lIIllIllIIllI[0];
        this.x = lIIllIllIIllI[1];
        this.y = Rand.nextInt((int)lIIllIllIIllI[0], (int)lIIllIllIIllI[1]);
        this.v = squireThievingConfig;
    }

    private static boolean lIllIIIlIIllIll(Object object, Object object2) {
        return object != object2;
    }
}

