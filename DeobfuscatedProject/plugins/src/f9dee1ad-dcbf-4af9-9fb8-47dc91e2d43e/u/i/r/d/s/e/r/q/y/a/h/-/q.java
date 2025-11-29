/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import u.i.r.d.s.e.r.q.y.a.h.-.a;

@TaskDesc(name="Drinking range potion", priority=20)
public class q
extends Task {
    private static /* synthetic */ String[] llllIIlIIIll;
    private static /* synthetic */ int[] llllIIlIlIll;
    private final /* synthetic */ a at;
    private final /* synthetic */ SquireAlchemicalHydraConfig au;

    private static String lIIIlllllIIlIlI(String lllllllllllllllIIlIlIlIlIlIIlIIl, String lllllllllllllllIIlIlIlIlIlIIIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlIlIlIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIlIlIlIIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIlIlIlIIlIll.init(llllIIlIlIll[4], lllllllllllllllIIlIlIlIlIlIIllII);
            return new String(lllllllllllllllIIlIlIlIlIlIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIlIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIlIlIlIIlIlI) {
            lllllllllllllllIIlIlIlIlIlIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllllllIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIllllllIlllI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        q lllllllllllllllIIlIlIlIlIlIlIlIl;
        if (q.lIIIllllllIlllI(this.at.g() ? 1 : 0)) {
            return llllIIlIlIll[0];
        }
        int lllllllllllllllIIlIlIlIlIlIlIlII = Skills.getBoostedLevel((Skill)Skill.RANGED) - Skills.getLevel((Skill)Skill.RANGED);
        if (q.lIIIllllllIllll(lllllllllllllllIIlIlIlIlIlIlIlII, llllIIlIlIll[1])) {
            return llllIIlIlIll[0];
        }
        Item lllllllllllllllIIlIlIlIlIlIlIIll = Inventory.getFirst(item -> {
            int n2;
            if (!q.lIIIllllllIlllI(item.getName().toLowerCase().contains(llllIIlIIIll[llllIIlIlIll[5]]) ? 1 : 0) || q.lIIIlllllllIIIl(item.getName().toLowerCase().contains(llllIIlIIIll[llllIIlIlIll[6]]) ? 1 : 0)) {
                n2 = llllIIlIlIll[2];
                "".length();
                if ("   ".length() == 0) {
                    return ((0x35 ^ 0x2A) & ~(0x35 ^ 0x2A)) != 0;
                }
            } else {
                n2 = llllIIlIlIll[0];
            }
            return n2 != 0;
        });
        if (q.lIIIlllllllIIII(lllllllllllllllIIlIlIlIlIlIlIIll)) {
            return llllIIlIlIll[0];
        }
        if (q.lIIIllllllIlllI(lllllllllllllllIIlIlIlIlIlIlIIll.getName().contains(llllIIlIIIll[llllIIlIlIll[0]]) ? 1 : 0) && q.lIIIlllllllIIIl(lllllllllllllllIIlIlIlIlIlIlIlIl.au.makeDivines() ? 1 : 0)) {
            String[] stringArray = new String[llllIIlIlIll[2]];
            stringArray[q.llllIIlIlIll[0]] = llllIIlIIIll[llllIIlIlIll[2]];
            if (q.lIIIlllllllIIlI(Inventory.getCount((boolean)llllIIlIlIll[2], (String[])stringArray), llllIIlIlIll[3])) {
                String[] stringArray2 = new String[llllIIlIlIll[2]];
                stringArray2[q.llllIIlIlIll[0]] = llllIIlIIIll[llllIIlIlIll[4]];
                Inventory.getFirst((String[])stringArray2).useOn(lllllllllllllllIIlIlIlIlIlIlIIll);
                return llllIIlIlIll[2];
            }
        }
        var2_2.interact(llllIIlIIIll[llllIIlIlIll[3]]);
        return llllIIlIlIll[2];
    }

    private static boolean lIIIllllllIllll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIlllllIIlIIl(String lllllllllllllllIIlIlIlIlIIllllII, String lllllllllllllllIIlIlIlIlIIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIlIlIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIlIlIIlllIIl.getBytes(StandardCharsets.UTF_8)), llllIIlIlIll[7]), "DES");
            Cipher lllllllllllllllIIlIlIlIlIIlllllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIlIlIIlllllI.init(llllIIlIlIll[4], lllllllllllllllIIlIlIlIlIIllllll);
            return new String(lllllllllllllllIIlIlIlIlIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIlIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIlIlIIllllIl) {
            lllllllllllllllIIlIlIlIlIIllllIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public q(a a2, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.at = a2;
        this.au = squireAlchemicalHydraConfig;
    }

    private static boolean lIIIlllllllIIIl(int n2) {
        return n2 != 0;
    }

    static {
        q.lIIIllllllIllIl();
        q.lIIIlllllIIlIll();
    }

    private static void lIIIlllllIIlIll() {
        llllIIlIIIll = new String[llllIIlIlIll[1]];
        q.llllIIlIIIll[q.llllIIlIlIll[0]] = q.lIIIlllllIIlIIl("6osUl1gKqwg=", "qspxS");
        q.llllIIlIIIll[q.llllIIlIlIll[2]] = q.lIIIlllllIIlIlI("n7yHVD2M6pC5wyxxcMj/5A==", "Xlodm");
        q.llllIIlIIIll[q.llllIIlIlIll[4]] = q.lIIIlllllIIlIIl("meQio7e/UeQUGTbSWsIcXQ==", "HFKuv");
        q.llllIIlIIIll[q.llllIIlIlIll[3]] = q.lIIIlllllIIlIIl("S6D26e9qlGw=", "cxRAO");
        q.llllIIlIIIll[q.llllIIlIlIll[5]] = q.lIIIlllllIIlIIl("HEOcfTUkZWzViMlp/CAvvA==", "vZnta");
        q.llllIIlIIIll[q.llllIIlIlIll[6]] = q.lIIIlllllIIlIlI("3CTpM5RprvEmNkEDWrU4mg==", "tbcAZ");
    }

    private static boolean lIIIlllllllIIII(Object object) {
        return object == null;
    }

    private static void lIIIllllllIllIl() {
        llllIIlIlIll = new int[8];
        q.llllIIlIlIll[0] = (0x57 ^ 0x7D) & ~(0x75 ^ 0x5F);
        q.llllIIlIlIll[1] = 0x55 ^ 0x53;
        q.llllIIlIlIll[2] = " ".length();
        q.llllIIlIlIll[3] = "   ".length();
        q.llllIIlIlIll[4] = "  ".length();
        q.llllIIlIlIll[5] = 0x37 ^ 0x2D ^ (0xD8 ^ 0xC6);
        q.llllIIlIlIll[6] = 0x56 ^ 0x53;
        q.llllIIlIlIll[7] = 0xB2 ^ 0x82 ^ (0x74 ^ 0x4C);
    }
}

