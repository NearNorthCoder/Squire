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

@TaskDesc(name="Opening coin pouches", priority=0x7FFFFFFF)
public class j
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

    private static String lIllIIIlIIlIllI(String llllllllllllllIlllIllllIIllIlIII, String llllllllllllllIlllIllllIIllIIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllllIIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), lIIllIllIIllI[10]), "DES");
            Cipher llllllllllllllIlllIllllIIllIlIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIllllIIllIlIlI.init(lIIllIllIIllI[5], llllllllllllllIlllIllllIIllIlIll);
            return new String(llllllllllllllIlllIllllIIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllllIIllIlIIl) {
            llllllllllllllIlllIllllIIllIlIIl.printStackTrace();
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
        j llllllllllllllIlllIllllIIlllllll;
        if (j.lIllIIIlIIllIll(Game.getState(), GameState.LOGGED_IN)) {
            return lIIllIllIIllI[2];
        }
        Player llllllllllllllIlllIllllIIllllllI = Players.getLocal();
        if (j.lIllIIIlIIlllII(llllllllllllllIlllIllllIIllllllI.getGraphic(), lIIllIllIIllI[3])) {
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
        Item llllllllllllllIlllIllllIIlllllIl = Inventory.getFirst((String[])stringArray);
        if (j.lIllIIIlIIllllI(llllllllllllllIlllIllllIIlllllIl)) {
            return lIIllIllIIllI[2];
        }
        if (j.lIllIIIlIIlllll(Inventory.getFreeSlots(), lIIllIllIIllI[5])) {
            llllllllllllllIlllIllllIIlllllIl.interact(lIIllIllIIlIl[lIIllIllIIllI[7]]);
            return lIIllIllIIllI[4];
        }
        if (j.lIllIIIlIlIIIII(llllllllllllllIlllIllllIIlllllIl.getQuantity(), llllllllllllllIlllIllllIIlllllll.y)) {
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

    private static String lIllIIIlIIlIlll(String llllllllllllllIlllIllllIIlIllIII, String llllllllllllllIlllIllllIIlIlIlll) {
        llllllllllllllIlllIllllIIlIllIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllIIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllllIIlIlIllI = new StringBuilder();
        char[] llllllllllllllIlllIllllIIlIlIlIl = llllllllllllllIlllIllllIIlIlIlll.toCharArray();
        int llllllllllllllIlllIllllIIlIlIlII = lIIllIllIIllI[2];
        char[] llllllllllllllIlllIllllIIlIIlllI = llllllllllllllIlllIllllIIlIllIII.toCharArray();
        int llllllllllllllIlllIllllIIlIIllIl = llllllllllllllIlllIllllIIlIIlllI.length;
        int llllllllllllllIlllIllllIIlIIllII = lIIllIllIIllI[2];
        while (j.lIllIIIlIlIIIII(llllllllllllllIlllIllllIIlIIllII, llllllllllllllIlllIllllIIlIIllIl)) {
            char llllllllllllllIlllIllllIIlIllIIl = llllllllllllllIlllIllllIIlIIlllI[llllllllllllllIlllIllllIIlIIllII];
            llllllllllllllIlllIllllIIlIlIllI.append((char)(llllllllllllllIlllIllllIIlIllIIl ^ llllllllllllllIlllIllllIIlIlIlIl[llllllllllllllIlllIllllIIlIlIlII % llllllllllllllIlllIllllIIlIlIlIl.length]));
            0;
            ++llllllllllllllIlllIllllIIlIlIlII;
            ++llllllllllllllIlllIllllIIlIIllII;
            0;
            if ((0x89 ^ 0x98 ^ (0x67 ^ 0x72)) >= -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllllIIlIlIllI);
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

    private static String lIllIIIlIIllIII(String llllllllllllllIlllIllllIIlllIlIl, String llllllllllllllIlllIllllIIlllIlII) {
        try {
            SecretKeySpec llllllllllllllIlllIllllIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIIlllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllllIIlllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllllIIlllIlll.init(lIIllIllIIllI[5], llllllllllllllIlllIllllIIllllIII);
            return new String(llllllllllllllIlllIllllIIlllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllllIIlllIllI) {
            llllllllllllllIlllIllllIIlllIllI.printStackTrace();
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

