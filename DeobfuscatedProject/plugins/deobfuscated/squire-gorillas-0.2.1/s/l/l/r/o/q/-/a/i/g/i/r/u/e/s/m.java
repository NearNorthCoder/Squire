/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.Locations;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.j;

@TaskDesc(name="Restoring stats", priority=101, blocking=true)
public class m
extends j {
    private static /* synthetic */ String[] llIIlIIllIlI;
    private static /* synthetic */ int[] llIIlIIllIll;

    private static String lllllIIllllllI(String lllllllllllllllIlIlIIIIIIIlIlIll, String lllllllllllllllIlIlIIIIIIIlIlIlI) {
        lllllllllllllllIlIlIIIIIIIlIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIIIIIlIlllI = new StringBuilder();
        char[] lllllllllllllllIlIlIIIIIIIlIllIl = lllllllllllllllIlIlIIIIIIIlIlIlI.toCharArray();
        int lllllllllllllllIlIlIIIIIIIlIllII = llIIlIIllIll[1];
        char[] lllllllllllllllIlIlIIIIIIIlIIllI = lllllllllllllllIlIlIIIIIIIlIlIll.toCharArray();
        int lllllllllllllllIlIlIIIIIIIlIIlIl = lllllllllllllllIlIlIIIIIIIlIIllI.length;
        int lllllllllllllllIlIlIIIIIIIlIIlII = llIIlIIllIll[1];
        while (m.lllllIlIIIIlll(lllllllllllllllIlIlIIIIIIIlIIlII, lllllllllllllllIlIlIIIIIIIlIIlIl)) {
            char lllllllllllllllIlIlIIIIIIIllIIIl = lllllllllllllllIlIlIIIIIIIlIIllI[lllllllllllllllIlIlIIIIIIIlIIlII];
            lllllllllllllllIlIlIIIIIIIlIlllI.append((char)(lllllllllllllllIlIlIIIIIIIllIIIl ^ lllllllllllllllIlIlIIIIIIIlIllIl[lllllllllllllllIlIlIIIIIIIlIllII % lllllllllllllllIlIlIIIIIIIlIllIl.length]));
            0;
            ++lllllllllllllllIlIlIIIIIIIlIllII;
            ++lllllllllllllllIlIlIIIIIIIlIIlII;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIIIIIIlIlllI);
    }

    /*
     * WARNING - void declaration
     */
    private boolean M() {
        int lllllllllllllllIlIlIIIIIIlIlIIII;
        Item lllllllllllllllIlIlIIIIIIlIIllll;
        void lllllllllllllllIlIlIIIIIIlIIlllI;
        int n2 = llIIlIIllIll[1];
        Skill[] skillArray = Skill.values();
        int n3 = skillArray.length;
        int lllllllllllllllIlIlIIIIIIlIIllIl = llIIlIIllIll[1];
        while (m.lllllIlIIIIlll(lllllllllllllllIlIlIIIIIIlIIllIl, (int)lllllllllllllllIlIlIIIIIIlIIlllI)) {
            void lllllllllllllllIlIlIIIIIIlIIllII = lllllllllllllllIlIlIIIIIIlIIllll[lllllllllllllllIlIlIIIIIIlIIllIl];
            if (m.lllllIlIIIIlll(Skills.getBoostedLevel((Skill)lllllllllllllllIlIlIIIIIIlIIllII), Skills.getLevel((Skill)lllllllllllllllIlIlIIIIIIlIIllII))) {
                lllllllllllllllIlIlIIIIIIlIlIIII = llIIlIIllIll[2];
            }
            ++lllllllllllllllIlIlIIIIIIlIIllIl;
            0;
            if (-1 < 1) continue;
            return ((0xE7 ^ 0xBB ^ (0x68 ^ 0x56)) & (75 + 7 - 27 + 112 ^ 16 + 20 - -54 + 107 ^ -1)) != 0;
        }
        if (m.lllllIlIIIIIlI(lllllllllllllllIlIlIIIIIIlIlIIII)) {
            return llIIlIIllIll[1];
        }
        lllllllllllllllIlIlIIIIIIlIIllll = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIIlIIllIlI[llIIlIIllIll[6]]));
        if (m.lllllIlIIIIlIl(lllllllllllllllIlIlIIIIIIlIIllll)) {
            return Combat.drinkBoostingPotion((int)llIIlIIllIll[4]);
        }
        skillArray.interact(llIIlIIllIlI[llIIlIIllIll[5]]);
        return llIIlIIllIll[2];
    }

    private static void lllllIlIIIIIIl() {
        llIIlIIllIll = new int[12];
        m.llIIlIIllIll[0] = 0xFFFFF6BE & 0x2F77;
        m.llIIlIIllIll[1] = (0x5D ^ 0x5A ^ (0x12 ^ 0x1E)) & (0x70 ^ 0x26 ^ (0x1C ^ 0x41) ^ -1);
        m.llIIlIIllIll[2] = 1;
        m.llIIlIIllIll[3] = 2;
        m.llIIlIIllIll[4] = 0xB7 ^ 0xBD;
        m.llIIlIIllIll[5] = 3;
        m.llIIlIIllIll[6] = 0x3C ^ 0x38;
        m.llIIlIIllIll[7] = 0x3B ^ 0x3E;
        m.llIIlIIllIll[8] = 66 + 120 - 176 + 169 ^ 136 + 95 - 178 + 128;
        m.llIIlIIllIll[9] = 1 ^ 0x43 ^ (0xF ^ 0x4A);
        m.llIIlIIllIll[10] = 0xA5 ^ 0x9A ^ (0x73 ^ 0x44);
        m.llIIlIIllIll[11] = 0x91 ^ 0x98;
    }

    @Inject
    public m(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    public boolean run() {
        m lllllllllllllllIlIlIIIIIIlIllIlI;
        if (m.lllllIlIIIIIlI(Locations.isRegionLoaded((int)llIIlIIllIll[0]) ? 1 : 0)) {
            return llIIlIIllIll[1];
        }
        if (m.lllllIlIIIIIll(lllllllllllllllIlIlIIIIIIlIllIlI.L() ? 1 : 0)) {
            return llIIlIIllIll[2];
        }
        if (m.lllllIlIIIIIll(lllllllllllllllIlIlIIIIIIlIllIlI.M() ? 1 : 0)) {
            return llIIlIIllIll[2];
        }
        return this.K();
    }

    /*
     * WARNING - void declaration
     */
    private boolean L() {
        void var1_1;
        if (m.lllllIlIIIIllI(Combat.getMissingHealth())) {
            return llIIlIIllIll[1];
        }
        Item lllllllllllllllIlIlIIIIIIlIlIllI = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llIIlIIllIll[2]];
            stringArray[m.llIIlIIllIll[1]] = llIIlIIllIlI[llIIlIIllIll[7]];
            if (!m.lllllIlIIIIIlI(item.hasAction(stringArray) ? 1 : 0) || m.lllllIlIIIIIll(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[8]]) ? 1 : 0)) {
                n2 = llIIlIIllIll[2];
                0;
                if (-(0x11 ^ 0x14) >= 0) {
                    return ((0x14 ^ 0x13) & ~(0x25 ^ 0x22)) != 0;
                }
            } else {
                n2 = llIIlIIllIll[1];
            }
            return n2 != 0;
        });
        if (m.lllllIlIIIIlIl(lllllllllllllllIlIlIIIIIIlIlIllI)) {
            return llIIlIIllIll[1];
        }
        String[] stringArray = new String[llIIlIIllIll[3]];
        stringArray[m.llIIlIIllIll[1]] = llIIlIIllIlI[llIIlIIllIll[2]];
        stringArray[m.llIIlIIllIll[2]] = llIIlIIllIlI[llIIlIIllIll[3]];
        var1_1.interact(stringArray);
        return llIIlIIllIll[2];
    }

    /*
     * WARNING - void declaration
     */
    private boolean K() {
        void var1_1;
        if (m.lllllIlIIIIlII(Skills.getBoostedLevel((Skill)Skill.PRAYER), Skills.getLevel((Skill)Skill.PRAYER))) {
            return llIIlIIllIll[1];
        }
        Item lllllllllllllllIlIlIIIIIIlIllIII = Inventory.getFirst(item -> {
            int n2;
            if (!m.lllllIlIIIIIlI(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[9]]) ? 1 : 0) || m.lllllIlIIIIIll(item.getName().startsWith(llIIlIIllIlI[llIIlIIllIll[10]]) ? 1 : 0)) {
                n2 = llIIlIIllIll[2];
                0;
                if (2 > 2) {
                    return ((44 + 2 - -102 + 27 ^ 95 + 58 - 74 + 79) & (0xA1 ^ 0xA4 ^ (0x4E ^ 0x7A) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlIIllIll[1];
            }
            return n2 != 0;
        });
        if (m.lllllIlIIIIlIl(lllllllllllllllIlIlIIIIIIlIllIII)) {
            return llIIlIIllIll[1];
        }
        var1_1.interact(llIIlIIllIlI[llIIlIIllIll[1]]);
        return llIIlIIllIll[2];
    }

    private static String lllllIIlllllIl(String lllllllllllllllIlIlIIIIIIIlllllI, String lllllllllllllllIlIlIIIIIIIllllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIIIllllIl.getBytes(StandardCharsets.UTF_8)), llIIlIIllIll[10]), "DES");
            Cipher lllllllllllllllIlIlIIIIIIlIIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIIIIIlIIIIlI.init(llIIlIIllIll[3], lllllllllllllllIlIlIIIIIIlIIIIll);
            return new String(lllllllllllllllIlIlIIIIIIlIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIIIIlIIIIIl) {
            lllllllllllllllIlIlIIIIIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllllIlIIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lllllIlIIIIllI(int n2) {
        return n2 <= 0;
    }

    private static boolean lllllIlIIIIIlI(int n2) {
        return n2 == 0;
    }

    static {
        m.lllllIlIIIIIIl();
        m.lllllIlIIIIIII();
    }

    private static String lllllIIlllllll(String lllllllllllllllIlIlIIIIIIIIllIIl, String lllllllllllllllIlIlIIIIIIIIllIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIIIIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIIIIIIlllIl.init(llIIlIIllIll[3], lllllllllllllllIlIlIIIIIIIIllllI);
            return new String(lllllllllllllllIlIlIIIIIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIIIIIIlllII) {
            lllllllllllllllIlIlIIIIIIIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllllIlIIIIIII() {
        llIIlIIllIlI = new String[llIIlIIllIll[11]];
        m.llIIlIIllIlI[m.llIIlIIllIll[1]] = m."Drink";
        m.llIIlIIllIlI[m.llIIlIIllIll[2]] = m."Eat";
        m.llIIlIIllIlI[m.llIIlIIllIll[3]] = m."Drink";
        m.llIIlIIllIlI[m.llIIlIIllIll[5]] = m."Drink";
        m.llIIlIIllIlI[m.llIIlIIllIll[6]] = m."restore";
        m.llIIlIIllIlI[m.llIIlIIllIll[7]] = m."Eat";
        m.llIIlIIllIlI[m.llIIlIIllIll[8]] = m."Saradomin brew";
        m.llIIlIIllIlI[m.llIIlIIllIll[9]] = m."Prayer";
        m.llIIlIIllIlI[m.llIIlIIllIll[10]] = m."Super restore";
    }

    private static boolean lllllIlIIIIIll(int n2) {
        return n2 != 0;
    }
}

