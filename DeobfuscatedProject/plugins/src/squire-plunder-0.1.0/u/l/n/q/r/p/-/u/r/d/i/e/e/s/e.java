/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquirePlunderConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Consuming", priority=500, register=true)
public class e
extends Task {
    private final /* synthetic */ SquirePlunderConfig v;
    private static /* synthetic */ int[] lllllllIIIlI;
    private /* synthetic */ Instant x;
    private final /* synthetic */ Duration w;
    private static /* synthetic */ String[] lllllllIIIIl;

    private static void lIIlIlIIllIlIII() {
        lllllllIIIIl = new String[lllllllIIIlI[7]];
        e.lllllllIIIIl[e.lllllllIIIlI[0]] = e.lIIlIlIIllIIlIl("K1wvENgedqkKCDRhIH2C7WUL6tgZxTpRvgXFJZLTUMc=", "uvVgm");
        e.lllllllIIIIl[e.lllllllIIIlI[1]] = e.lIIlIlIIllIIllI("FEa2W2j9ZZ8=", "jpnAU");
        e.lllllllIIIIl[e.lllllllIIIlI[3]] = e.lIIlIlIIllIIllI("pXN4arrgxjtP/W2OJaSc+FmXuFQWGiSjra4AZn66gTA=", "RiiHz");
        e.lllllllIIIIl[e.lllllllIIIlI[4]] = e.lIIlIlIIllIIlll("Ago5AiQ=", "FxPlO");
        e.lllllllIIIIl[e.lllllllIIIlI[2]] = e.lIIlIlIIllIIllI("YOUXt6w8NXw=", "VjNeY");
        e.lllllllIIIIl[e.lllllllIIIlI[6]] = e.lIIlIlIIllIIllI("3XdaJEwP8Ws=", "oWLuN");
    }

    @Inject
    public e(SquirePlunderConfig squirePlunderConfig) {
        this.w = Duration.ofSeconds(12L);
        this.v = squirePlunderConfig;
    }

    private static String lIIlIlIIllIIllI(String lllllllllllllllIIlIIllIIlIIllIll, String lllllllllllllllIIlIIllIIlIIlllII) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIlIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIlIIlllII.getBytes(StandardCharsets.UTF_8)), lllllllIIIlI[8]), "DES");
            Cipher lllllllllllllllIIlIIllIIlIIlllll = Cipher.getInstance("DES");
            lllllllllllllllIIlIIllIIlIIlllll.init(lllllllIIIlI[3], lllllllllllllllIIlIIllIIlIlIIIII);
            return new String(lllllllllllllllIIlIIllIIlIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIlIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIIlIIllllI) {
            lllllllllllllllIIlIIllIIlIIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIlllIIII(int n2) {
        return n2 != 0;
    }

    private static int lIIlIlIIllIlIlI(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static String lIIlIlIIllIIlIl(String lllllllllllllllIIlIIllIIIlllIllI, String lllllllllllllllIIlIIllIIIlllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIllIIIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIllIIIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIllIIIllllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIllIIIllllIlI.init(lllllllIIIlI[3], lllllllllllllllIIlIIllIIIllllIll);
            return new String(lllllllllllllllIIlIIllIIIllllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIllIIIllllIIl) {
            lllllllllllllllIIlIIllIIIllllIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIllIlIIl() {
        lllllllIIIlI = new int[9];
        e.lllllllIIIlI[0] = (0xB7 ^ 0xAC) & ~(0x4C ^ 0x57);
        e.lllllllIIIlI[1] = " ".length();
        e.lllllllIIIlI[2] = 0x52 ^ 0x56;
        e.lllllllIIIlI[3] = "  ".length();
        e.lllllllIIIlI[4] = "   ".length();
        e.lllllllIIIlI[5] = 0x80 ^ 0x8C ^ (0x77 ^ 0x1D);
        e.lllllllIIIlI[6] = 0x51 ^ 0x54;
        e.lllllllIIIlI[7] = 0xAE ^ 0xA8;
        e.lllllllIIIlI[8] = 0x26 ^ 0x2E;
    }

    static {
        e.lIIlIlIIllIlIIl();
        e.lIIlIlIIllIlIII();
    }

    private static boolean lIIlIlIIllIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlIIllIlllI(int n2) {
        return n2 > 0;
    }

    private static String lIIlIlIIllIIlll(String lllllllllllllllIIlIIllIIlIIIlIII, String lllllllllllllllIIlIIllIIlIIIIlll) {
        lllllllllllllllIIlIIllIIlIIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIllIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIllIIlIIIlIll = new StringBuilder();
        char[] lllllllllllllllIIlIIllIIlIIIlIlI = lllllllllllllllIIlIIllIIlIIIIlll.toCharArray();
        int lllllllllllllllIIlIIllIIlIIIlIIl = lllllllIIIlI[0];
        char[] lllllllllllllllIIlIIllIIlIIIIIll = lllllllllllllllIIlIIllIIlIIIlIII.toCharArray();
        int lllllllllllllllIIlIIllIIlIIIIIlI = lllllllllllllllIIlIIllIIlIIIIIll.length;
        int lllllllllllllllIIlIIllIIlIIIIIIl = lllllllIIIlI[0];
        while (e.lIIlIlIIlllIIIl(lllllllllllllllIIlIIllIIlIIIIIIl, lllllllllllllllIIlIIllIIlIIIIIlI)) {
            char lllllllllllllllIIlIIllIIlIIIlllI = lllllllllllllllIIlIIllIIlIIIIIll[lllllllllllllllIIlIIllIIlIIIIIIl];
            lllllllllllllllIIlIIllIIlIIIlIll.append((char)(lllllllllllllllIIlIIllIIlIIIlllI ^ lllllllllllllllIIlIIllIIlIIIlIlI[lllllllllllllllIIlIIllIIlIIIlIIl % lllllllllllllllIIlIIllIIlIIIlIlI.length]));
            "".length();
            ++lllllllllllllllIIlIIllIIlIIIlIIl;
            ++lllllllllllllllIIlIIllIIlIIIIIIl;
            "".length();
            if ("  ".length() != ((0x45 ^ 0x29 ^ (0x19 ^ 0x16)) & (0x6A ^ 0x2E ^ (0xB ^ 0x2C) ^ -" ".length()))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIllIIlIIIlIll);
    }

    private static boolean lIIlIlIIlllIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIllIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIllIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIlIIllIllIl(Object object) {
        return object == null;
    }

    public boolean run() {
        e lllllllllllllllIIlIIllIIlIllIIlI;
        if (e.lIIlIlIIllIlIll(Combat.getCurrentHealth(), this.v.eatAt()) && e.lIIlIlIIllIllII(Combat.isPoisoned() ? 1 : 0)) {
            return lllllllIIIlI[0];
        }
        if (e.lIIlIlIIllIlIll(lllllllllllllllIIlIIllIIlIllIIlI.v.eatAt(), Combat.getCurrentHealth())) {
            Item lllllllllllllllIIlIIllIIlIllIIIl = Inventory.getFirst(item -> {
                int n2;
                if (e.lIIlIlIIllIllll(item.getId(), this.v.foodID())) {
                    String[] stringArray = new String[lllllllIIIlI[1]];
                    stringArray[e.lllllllIIIlI[0]] = lllllllIIIIl[lllllllIIIlI[6]];
                    if (e.lIIlIlIIlllIIII(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllllllIIIlI[1];
                        "".length();
                        if ("  ".length() >= " ".length()) return n2 != 0;
                        return ((0x8B ^ 0x8F ^ (0x7E ^ 0x46)) & (0x1F ^ 0x73 ^ (0x4C ^ 0x1C) ^ -" ".length())) != 0;
                    }
                }
                n2 = lllllllIIIlI[0];
                return n2 != 0;
            });
            if (e.lIIlIlIIllIllIl(lllllllllllllllIIlIIllIIlIllIIIl)) {
                Log.info((String)lllllllIIIIl[lllllllIIIlI[0]]);
                return lllllllIIIlI[0];
            }
            lllllllllllllllIIlIIllIIlIllIIIl.interact(lllllllIIIIl[lllllllIIIlI[1]]);
            lllllllllllllllIIlIIllIIlIllIIlI.sleep(lllllllIIIlI[2]);
            return lllllllIIIlI[1];
        }
        if (e.lIIlIlIIllIllII(Combat.isPoisoned() ? 1 : 0)) {
            return lllllllIIIlI[0];
        }
        System.out.println("time until anti: " + Duration.between(lllllllllllllllIIlIIllIIlIllIIlI.x, Instant.now()).toSeconds());
        if (e.lIIlIlIIllIlllI(e.lIIlIlIIllIlIlI(Duration.between(lllllllllllllllIIlIIllIIlIllIIlI.x, Instant.now()).toSeconds(), lllllllllllllllIIlIIllIIlIllIIlI.w.toSeconds()))) {
            Item lllllllllllllllIIlIIllIIlIllIIIl = Inventory.getFirst(item -> {
                int n2;
                if (e.lIIlIlIIlllIIII(item.getName().startsWith(this.v.antiPoison()) ? 1 : 0)) {
                    String[] stringArray = new String[lllllllIIIlI[1]];
                    stringArray[e.lllllllIIIlI[0]] = lllllllIIIIl[lllllllIIIlI[2]];
                    if (e.lIIlIlIIlllIIII(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lllllllIIIlI[1];
                        "".length();
                        if (-"  ".length() <= 0) return n2 != 0;
                        return ((0xE ^ 0x5C) & ~(0x13 ^ 0x41)) != 0;
                    }
                }
                n2 = lllllllIIIlI[0];
                return n2 != 0;
            });
            if (e.lIIlIlIIllIllIl(lllllllllllllllIIlIIllIIlIllIIIl)) {
                Log.info((String)lllllllIIIIl[lllllllIIIlI[3]]);
                return lllllllIIIlI[0];
            }
            lllllllllllllllIIlIIllIIlIllIIIl.interact(lllllllIIIIl[lllllllIIIlI[4]]);
            lllllllllllllllIIlIIllIIlIllIIlI.sleep(lllllllIIIlI[3]);
            return lllllllIIIlI[1];
        }
        return lllllllIIIlI[0];
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (e.lIIlIlIIllIllll(varbitChanged.getVarpId(), lllllllIIIlI[5])) {
            this.x = Instant.now();
        }
    }
}

