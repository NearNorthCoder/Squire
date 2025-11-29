/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;

/* TASK: Checking State -> CheckingstateTask */
@TaskDesc(name="Checking State", priority=2147482310)
public class m
extends Task {
    private final /* synthetic */ a aq;
    private static /* synthetic */ int[] llIllllII;
    private static /* synthetic */ String[] llIlllIll;
    private final /* synthetic */ SquireCerberus ao;
    private final /* synthetic */ SquireCerberusConfig ap;

    private static boolean lIlllllllll(int n2) {
        return n2 == 0;
    }

    @Inject
    public m(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, a a2) {
        this.ao = squireCerberus;
        this.ap = squireCerberusConfig;
        this.aq = a2;
    }

    private static void lIllllllIlI() {
        llIllllII = new int[12];
        m.llIllllII[0] = (0x24 ^ 0x69) & ~(0xF ^ 0x42);
        m.llIllllII[1] = 1;
        m.llIllllII[2] = -(0xFFFFF21D & 0x7FF7) & (0xFFFFFF7F & 0x7B9D);
        m.llIllllII[3] = 2;
        m.llIllllII[4] = 3;
        m.llIllllII[5] = 0xA1 ^ 0xA5;
        m.llIllllII[6] = 0x61 ^ 0x64;
        m.llIllllII[7] = 0x60 ^ 0x66;
        m.llIllllII[8] = 0xA3 ^ 0xA4;
        m.llIllllII[9] = 0x5D ^ 0x55;
        m.llIllllII[10] = 0x29 ^ 0x61 ^ (0x2F ^ 0x6E);
        m.llIllllII[11] = 0x67 ^ 0x56 ^ (0x8E ^ 0xB5);
    }

    public boolean run() {
        Item lIlIlllIIIlllIl;
        m lIlIlllIIlIIIII;
        if (m.lIllllllIll(Game.getState(), GameState.LOGGED_IN)) {
            return llIllllII[0];
        }
        if (m.lIlllllllII(Players.getLocal())) {
            return llIllllII[0];
        }
        int[] nArray = new int[llIllllII[1]];
        nArray[m.llIllllII[0]] = llIllllII[2];
        Item lIlIlllIIIlllll = Inventory.getFirst((int[])nArray);
        if (m.lIlllllllIl(lIlIlllIIIlllll)) {
            lIlIlllIIIlllll.interact(llIlllIll[llIllllII[0]]);
        }
        if (m.lIllllllllI(lIlIlllIIlIIIII.ao.r() ? 1 : 0)) {
            return llIllllII[0];
        }
        if (m.lIlllllllIl(lIlIlllIIlIIIII.aq.k())) {
            return llIllllII[0];
        }
        if (m.lIlllllllll(lIlIlllIIlIIIII.ao.p().isEmpty() ? 1 : 0)) {
            return llIllllII[0];
        }
        if (m.llIIIIIIIII(Inventory.getCount(item -> {
            int n2;
            if (m.lIlllllllll(item.getName().contains(llIlllIll[llIllllII[9]]) ? 1 : 0)) {
                String[] stringArray = new String[llIllllII[1]];
                stringArray[m.llIllllII[0]] = llIlllIll[llIllllII[10]];
                if (m.lIllllllllI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llIllllII[1];
                    0;
                    if ((0x9A ^ 0x9E) > 2) return n2 != 0;
                    return false;
                }
            }
            n2 = llIllllII[0];
            return n2 != 0;
        }), lIlIlllIIlIIIII.ap.bankUnderAmount())) {
            Log.info((String)llIlllIll[llIllllII[1]]);
            lIlIlllIIlIIIII.ao.b(llIllllII[1]);
        }
        Item lIlIlllIIIllllI = Inventory.getFirst(item -> {
            int n2;
            block3: {
                block2: {
                    if (!m.lIlllllllll(item.getName().toLowerCase().contains(llIlllIll[llIllllII[6]]) ? 1 : 0)) break block2;
                    if (!m.lIllllllllI(item.getName().toLowerCase().contains(llIlllIll[llIllllII[7]]) ? 1 : 0)) break block3;
                    String[] stringArray = new String[llIllllII[1]];
                    stringArray[m.llIllllII[0]] = llIlllIll[llIllllII[8]];
                    if (!m.lIllllllllI(item.hasAction(stringArray) ? 1 : 0)) break block3;
                }
                n2 = llIllllII[1];
                0;
                if (3 >= 0) return n2 != 0;
                return false;
            }
            n2 = llIllllII[0];
            return n2 != 0;
        });
        if (m.lIlllllllll(Prayers.getPoints()) && m.lIlllllllII(lIlIlllIIIllllI)) {
            Log.info((String)llIlllIll[llIllllII[3]]);
            lIlIlllIIlIIIII.ao.b(llIllllII[1]);
        }
        if (m.lIlllllllII(lIlIlllIIIlllIl = Inventory.getFirst(item -> {
            String[] stringArray = new String[llIllllII[1]];
            stringArray[m.llIllllII[0]] = llIlllIll[llIllllII[5]];
            return item.hasAction(stringArray);
        })) && m.llIIIIIIIII(Combat.getCurrentHealth(), lIlIlllIIlIIIII.ap.eatAtHealth())) {
            Log.info((String)llIlllIll[llIllllII[4]]);
            lIlIlllIIlIIIII.ao.b(llIllllII[1]);
        }
        return llIllllII[0];
    }

    private static boolean lIllllllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllllIl(Object object) {
        return object != null;
    }

    private static String lIlllllIllI(String lIlIllIlllIlIlI, String lIlIllIlllIlIll) {
        try {
            SecretKeySpec lIlIllIlllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIlllIlIll.getBytes(StandardCharsets.UTF_8)), llIllllII[9]), "DES");
            Cipher lIlIllIlllIlllI = Cipher.getInstance("DES");
            lIlIllIlllIlllI.init(llIllllII[3], lIlIllIlllIllll);
            return new String(lIlIllIlllIlllI.doFinal(Base64.getDecoder().decode(lIlIllIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIlllIllIl) {
            lIlIllIlllIllIl.printStackTrace();
            return null;
        }
    }

    private static void lIllllllIIl() {
        llIlllIll = new String[llIllllII[11]];
        m.llIlllIll[m.llIllllII[0]] = m."Drop";
        m.llIlllIll[m.llIllllII[1]] = m."We're low on food, need to bank";
        m.llIlllIll[m.llIllllII[3]] = m."No prayer points, need to bank";
        m.llIlllIll[m.llIllllII[4]] = m."No food or not enough food";
        m.llIlllIll[m.llIllllII[5]] = m."Eat";
        m.llIlllIll[m.llIllllII[6]] = m."prayer";
        m.llIlllIll[m.llIllllII[7]] = m."restore";
        m.llIlllIll[m.llIllllII[8]] = m."Drink";
        m.llIlllIll[m.llIllllII[9]] = m."Summer pie";
        m.llIlllIll[m.llIllllII[10]] = m."Eat";
    }

    private static boolean lIllllllIll(Object object, Object object2) {
        return object != object2;
    }

    static {
        m.lIllllllIlI();
        m.lIllllllIIl();
    }

    private static boolean llIIIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllllIlll(String lIlIlllIIIIllll, String lIlIlllIIIIlllI) {
        try {
            SecretKeySpec lIlIlllIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllIIIlIIll = Cipher.getInstance("Blowfish");
            lIlIlllIIIlIIll.init(llIllllII[3], lIlIlllIIIlIlII);
            return new String(lIlIlllIIIlIIll.doFinal(Base64.getDecoder().decode(lIlIlllIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlllIIIlIIlI) {
            lIlIlllIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllllII(Object object) {
        return object == null;
    }

    private static String lIllllllIII(String lIlIlllIIIIIIIl, String lIlIllIlllllIll) {
        lIlIlllIIIIIIIl = new String(Base64.getDecoder().decode(lIlIlllIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIllllllll = new StringBuilder();
        char[] lIlIllIlllllllI = lIlIllIlllllIll.toCharArray();
        int lIlIllIllllllIl = llIllllII[0];
        char[] lIlIllIllllIlll = lIlIlllIIIIIIIl.toCharArray();
        int lIlIllIllllIllI = lIlIllIllllIlll.length;
        int lIlIllIllllIlIl = llIllllII[0];
        while (m.llIIIIIIIII(lIlIllIllllIlIl, lIlIllIllllIllI)) {
            char lIlIlllIIIIIIlI = lIlIllIllllIlll[lIlIllIllllIlIl];
            lIlIllIllllllll.append((char)(lIlIlllIIIIIIlI ^ lIlIllIlllllllI[lIlIllIllllllIl % lIlIllIlllllllI.length]));
            0;
            ++lIlIllIllllllIl;
            ++lIlIllIllllIlIl;
            0;
            if (((0x2D ^ 0) & ~(0x56 ^ 0x7B)) <= 0) continue;
            return null;
        }
        return String.valueOf(lIlIllIllllllll);
    }
}

