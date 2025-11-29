/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.C;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j;

@TaskDesc(name="Drinking boost", priority=11)
public class ap
extends C {
    private static /* synthetic */ int[] llllIlIlIIII;
    private static /* synthetic */ String[] llllIlIIllII;

    @Inject
    protected ap(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
    }

    private static boolean lIIlIIIIllIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIlIIIIlIlIIIl(String lllllllllllllllIIlIllIlIIIlIlIII, String lllllllllllllllIIlIllIlIIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIlIIIlIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIlIIIlIlIlI.init(llllIlIlIIII[3], lllllllllllllllIIlIllIlIIIlIlIll);
            return new String(lllllllllllllllIIlIllIlIIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIlIIIlIlIIl) {
            lllllllllllllllIIlIllIlIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIIIlIlIIll(String lllllllllllllllIIlIllIlIIlIIlIlI, String lllllllllllllllIIlIllIlIIlIIlIIl) {
        lllllllllllllllIIlIllIlIIlIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIlIIlIIlIII = new StringBuilder();
        char[] lllllllllllllllIIlIllIlIIlIIIlll = lllllllllllllllIIlIllIlIIlIIlIIl.toCharArray();
        int lllllllllllllllIIlIllIlIIlIIIllI = llllIlIlIIII[0];
        char[] lllllllllllllllIIlIllIlIIlIIIIII = lllllllllllllllIIlIllIlIIlIIlIlI.toCharArray();
        int lllllllllllllllIIlIllIlIIIllllll = lllllllllllllllIIlIllIlIIlIIIIII.length;
        int lllllllllllllllIIlIllIlIIIlllllI = llllIlIlIIII[0];
        while (ap.lIIlIIIIllIlIlI(lllllllllllllllIIlIllIlIIIlllllI, lllllllllllllllIIlIllIlIIIllllll)) {
            char lllllllllllllllIIlIllIlIIlIIlIll = lllllllllllllllIIlIllIlIIlIIIIII[lllllllllllllllIIlIllIlIIIlllllI];
            lllllllllllllllIIlIllIlIIlIIlIII.append((char)(lllllllllllllllIIlIllIlIIlIIlIll ^ lllllllllllllllIIlIllIlIIlIIIlll[lllllllllllllllIIlIllIlIIlIIIllI % lllllllllllllllIIlIllIlIIlIIIlll.length]));
            0;
            ++lllllllllllllllIIlIllIlIIlIIIllI;
            ++lllllllllllllllIIlIllIlIIIlllllI;
            0;
            if (((0xCB ^ 0x87) & ~(0xD9 ^ 0x95)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIllIlIIlIIlIII);
    }

    private static boolean lIIlIIIIllIIllI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIIIIllIIlIl() {
        llllIlIlIIII = new int[11];
        ap.llllIlIlIIII[0] = (4 ^ 0x78 ^ (0x63 ^ 0x25)) & (89 + 54 - -32 + 14 ^ 42 + 113 - 41 + 21 ^ -1);
        ap.llllIlIlIIII[1] = 1;
        ap.llllIlIlIIII[2] = 3;
        ap.llllIlIlIIII[3] = 2;
        ap.llllIlIlIIII[4] = 0x8B ^ 0x8E;
        ap.llllIlIlIIII[5] = 148 + 97 - 213 + 145 ^ 58 + 42 - 40 + 130;
        ap.llllIlIlIIII[6] = 0x48 ^ 0x2C ^ (0x5D ^ 0x4E) & ~(0x1D ^ 0xE);
        ap.llllIlIlIIII[7] = 0x66 ^ 0x62;
        ap.llllIlIlIIII[8] = 135 + 19 - 24 + 59 ^ 36 + 177 - 60 + 34;
        ap.llllIlIlIIII[9] = 0xBA ^ 0xBD;
        ap.llllIlIlIIII[10] = 0x6B ^ 0x63;
    }

    private static boolean lIIlIIIIllIIlll(int n2) {
        return n2 != 0;
    }

    public int a(Skill skill) {
        return llllIlIlIIII[4] + Skills.getLevel((Skill)skill) * llllIlIlIIII[5] / llllIlIlIIII[6];
    }

    private static boolean lIIlIIIIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIIIIlIlIlIl() {
        llllIlIIllII = new String[llllIlIlIIII[9]];
        ap.llllIlIIllII[ap.llllIlIlIIII[0]] = ap."Attack";
        ap.llllIlIIllII[ap.llllIlIlIIII[1]] = ap."Drink";
        ap.llllIlIIllII[ap.llllIlIlIIII[3]] = ap."Drink";
        ap.llllIlIIllII[ap.llllIlIlIIII[2]] = ap."super attack";
        ap.llllIlIIllII[ap.llllIlIlIIII[7]] = ap."super attack";
        ap.llllIlIIllII[ap.llllIlIlIIII[4]] = ap."combat pot";
        ap.llllIlIIllII[ap.llllIlIlIIII[8]] = ap."super strength";
    }

    @Override
    public boolean bY() {
        ap lllllllllllllllIIlIllIlIIllIIIII;
        if (ap.lIIlIIIIllIIllI(this.cL.isInInstancedRegion() ? 1 : 0)) {
            return llllIlIlIIII[0];
        }
        if (ap.lIIlIIIIllIIlll(lllllllllllllllIIlIllIlIIllIIIII.cM.aq() ? 1 : 0)) {
            return llllIlIlIIII[0];
        }
        if (ap.lIIlIIIIllIIllI(lllllllllllllllIIlIllIlIIllIIIII.bZ() ? 1 : 0)) {
            return llllIlIlIIII[0];
        }
        NPC lllllllllllllllIIlIllIlIIlIlllll = SquireNightmarePlugin.d();
        if (ap.lIIlIIIIllIlIII(lllllllllllllllIIlIllIlIIlIlllll)) {
            return llllIlIlIIII[0];
        }
        String[] stringArray = new String[llllIlIlIIII[1]];
        stringArray[ap.llllIlIlIIII[0]] = llllIlIIllII[llllIlIlIIII[0]];
        if (ap.lIIlIIIIllIIllI(lllllllllllllllIIlIllIlIIlIlllll.hasAction(stringArray) ? 1 : 0)) {
            return llllIlIlIIII[0];
        }
        Item lllllllllllllllIIlIllIlIIlIllllI = Inventory.getFirst(item -> {
            boolean bl;
            if (!ap.lIIlIIIIllIIllI(item.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[4]]) ? 1 : 0) || ap.lIIlIIIIllIIlll(item.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[8]]) ? 1 : 0)) {
                bl = llllIlIlIIII[1];
                0;
                if ((49 + 4 - 34 + 132 ^ 94 + 50 - 99 + 101) <= 0) {
                    return ((0xD3 ^ 0x9A ^ (0x6A ^ 0x73)) & (0xE4 ^ 0x83 ^ (0xB0 ^ 0x87) ^ -1)) != 0;
                }
            } else {
                bl = llllIlIlIIII[0];
            }
            return bl;
        });
        if (ap.lIIlIIIIllIlIII(lllllllllllllllIIlIllIlIIlIllllI)) {
            return llllIlIlIIII[0];
        }
        int lllllllllllllllIIlIllIlIIlIlllIl = (int)(0.5 * (double)lllllllllllllllIIlIllIlIIllIIIII.a(Skill.STRENGTH));
        if (ap.lIIlIIIIllIlIIl(Skills.getLevel((Skill)Skill.STRENGTH) + lllllllllllllllIIlIllIlIIlIlllIl, Skills.getBoostedLevel((Skill)Skill.STRENGTH))) {
            lllllllllllllllIIlIllIlIIlIllllI.interact(llllIlIIllII[llllIlIlIIII[1]]);
            lllllllllllllllIIlIllIlIIllIIIII.sleep(llllIlIlIIII[2]);
            return llllIlIlIIII[1];
        }
        int lllllllllllllllIIlIllIlIIlIlllII = (int)(0.5 * (double)lllllllllllllllIIlIllIlIIllIIIII.a(Skill.ATTACK));
        if (ap.lIIlIIIIllIIlll(Inventory.contains(item -> {
            int n3;
            if (ap.lIIlIIIIllIIlll(item.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[7]]) ? 1 : 0) && ap.lIIlIIIIllIlIIl(Skills.getLevel((Skill)Skill.ATTACK) + lllllllllllllllIIlIllIlIIlIlllII, Skills.getBoostedLevel((Skill)Skill.ATTACK))) {
                n3 = llllIlIlIIII[1];
                0;
                if (-3 > 0) {
                    return ((0xFF ^ 0xA0) & ~(0xE9 ^ 0xB6)) != 0;
                }
            } else {
                n3 = llllIlIlIIII[0];
            }
            return n3 != 0;
        }) ? 1 : 0)) {
            Item lllllllllllllllIIlIllIlIIlIllIll = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllIlIIllII[llllIlIlIIII[2]]));
            lllllllllllllllIIlIllIlIIlIllIll.interact(llllIlIIllII[llllIlIlIIII[3]]);
            lllllllllllllllIIlIllIlIIllIIIII.sleep(llllIlIlIIII[2]);
            return llllIlIlIIII[1];
        }
        return llllIlIlIIII[0];
    }

    private static String lIIlIIIIlIIllIl(String lllllllllllllllIIlIllIlIIIllIIll, String lllllllllllllllIIlIllIlIIIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIIIllIIlI.getBytes(StandardCharsets.UTF_8)), llllIlIlIIII[10]), "DES");
            Cipher lllllllllllllllIIlIllIlIIIllIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIlIIIllIlll.init(llllIlIlIIII[3], lllllllllllllllIIlIllIlIIIlllIII);
            return new String(lllllllllllllllIIlIllIlIIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIlIIIllIllI) {
            lllllllllllllllIIlIllIlIIIllIllI.printStackTrace();
            return null;
        }
    }

    static {
        ap.lIIlIIIIllIIlIl();
        ap.lIIlIIIIlIlIlIl();
    }

    private static boolean lIIlIIIIllIlIII(Object object) {
        return object == null;
    }
}

