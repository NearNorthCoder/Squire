/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@Singleton
@TaskDesc(name="Cooking food", priority=4, blocking=true)
public class B
extends n {
    private static /* synthetic */ int[] llIIlllIlIll;
    private /* synthetic */ int bP;
    private static /* synthetic */ String[] llIIlllIlIlI;

    private static boolean lllllllllIllll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var4_5;
        Item lllllllllllllllIlIIlIIIlIllllIll;
        B lllllllllllllllIlIIlIIIllIIIIIIl;
        void lllllllllllllllIlIIlIIIlIlllllll;
        void lllllllllllllllIlIIlIIIllIIIIIII;
        m m2 = this.ba.V().av();
        List list = TileItems.getAll(tileItem -> {
            int n2;
            if (B.lllllllllIllll(m2.e(tileItem.getWorldLocation()) ? 1 : 0) && B.lllllllllIllll(i.FISH.aA().contains(tileItem.getId()) ? 1 : 0)) {
                n2 = llIIlllIlIll[0];
                "".length();
                if (((0x42 ^ 0x2B ^ (7 ^ 0x3F)) & (0x31 ^ 0x73 ^ (0xA7 ^ 0xB4) ^ -" ".length())) != 0) {
                    return ((130 + 8 - 71 + 130 ^ 129 + 98 - 91 + 9) & (0xAC ^ 0x97 ^ (0x14 ^ 0x7B) ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIlllIlIll[1];
            }
            return n2 != 0;
        });
        if (B.lllllllllIlIlI(list.size()) && B.lllllllllIlIlI(Inventory.getFreeSlots())) {
            TileItem tileItem2 = (TileItem)list.get(llIIlllIlIll[1]);
            tileItem2.interact(llIIlllIlIlI[llIIlllIlIll[1]]);
            m2.l(TileItems.getAll(tileItem -> {
                int n2;
                if (B.lllllllllIllll(m2.e(tileItem.getWorldLocation()) ? 1 : 0) && B.lllllllllIllll(i.FISH.aA().contains(tileItem.getId()) ? 1 : 0)) {
                    n2 = llIIlllIlIll[0];
                    "".length();
                    if ((6 ^ 2) <= 0) {
                        return ((0x75 ^ 0x3D) & ~(0x75 ^ 0x3D)) != 0;
                    }
                } else {
                    n2 = llIIlllIlIll[1];
                }
                return n2 != 0;
            }).size());
            return llIIlllIlIll[0];
        }
        lllllllllllllllIlIIlIIIllIIIIIII.l(lllllllllllllllIlIIlIIIlIlllllll.size());
        int lllllllllllllllIlIIlIIIlIllllllI = i.FISH.aC();
        if (B.lllllllllIlIll(lllllllllllllllIlIIlIIIlIllllllI)) {
            lllllllllllllllIlIIlIIIllIIIIIIl.bP = llIIlllIlIll[2];
            return llIIlllIlIll[1];
        }
        if (B.lllllllllIllII(lllllllllllllllIlIIlIIIlIllllllI, lllllllllllllllIlIIlIIIllIIIIIIl.bP)) {
            lllllllllllllllIlIIlIIIllIIIIIIl.bP = lllllllllllllllIlIIlIIIlIllllllI;
            Time.sleepTick();
            "".length();
            return llIIlllIlIll[0];
        }
        TileObject lllllllllllllllIlIIlIIIlIlllllIl = TileObjects.getNearest(tileObject -> e.aE.contains(tileObject.getId()));
        if (B.lllllllllIllIl(lllllllllllllllIlIIlIIIlIlllllIl)) {
            return llIIlllIlIll[1];
        }
        Player lllllllllllllllIlIIlIIIlIlllllII = Players.getLocal();
        if (B.lllllllllIllIl(lllllllllllllllIlIIlIIIlIlllllII)) {
            return llIIlllIlIll[1];
        }
        if (B.lllllllllIllII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS) - llIIlllIlIll[3]) && B.lllllllllIlllI(lllllllllllllllIlIIlIIIlIllllIll = Inventory.getFirst(item -> e.aH.contains(item.getId())))) {
            lllllllllllllllIlIIlIIIlIllllIll.interact(llIIlllIlIlI[llIIlllIlIll[0]]);
        }
        var4_5.interact(llIIlllIlIlI[llIIlllIlIll[4]]);
        return llIIlllIlIll[0];
    }

    private static void lllllllllIlIIl() {
        llIIlllIlIll = new int[7];
        B.llIIlllIlIll[0] = " ".length();
        B.llIIlllIlIll[1] = (0x71 ^ 0x53 ^ (0x17 ^ 0x57)) & (33 + 100 - -51 + 59 ^ 86 + 14 - 21 + 66 ^ -" ".length());
        B.llIIlllIlIll[2] = -" ".length() & (0xFFFFFFFF & Integer.MAX_VALUE);
        B.llIIlllIlIll[3] = 0x62 ^ 0xA ^ (0xDD ^ 0xA1);
        B.llIIlllIlIll[4] = "  ".length();
        B.llIIlllIlIll[5] = "   ".length();
        B.llIIlllIlIll[6] = 4 + 133 - 89 + 87 ^ 44 + 87 - 71 + 83;
    }

    private static boolean lllllllllIllIl(Object object) {
        return object == null;
    }

    private static String lllllllllIIllI(String lllllllllllllllIlIIlIIIlIllIlIll, String lllllllllllllllIlIIlIIIlIllIlIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIIlIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIlIllIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIIIlIllIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIIIlIllIllIl.init(llIIlllIlIll[4], lllllllllllllllIlIIlIIIlIllIlllI);
            return new String(lllllllllllllllIlIIlIIIlIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIlIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIIIlIllIllII) {
            lllllllllllllllIlIIlIIIlIllIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lllllllllIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllllllllIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lllllllllIlllI(Object object) {
        return object != null;
    }

    @Inject
    public B(c c2) {
        d[] dArray = new d[llIIlllIlIll[0]];
        dArray[B.llIIlllIlIll[1]] = d.PREPARE_BOSS_FIGHT;
        super(c2, dArray);
        this.bP = llIIlllIlIll[2];
    }

    private static String lllllllllIIlIl(String lllllllllllllllIlIIlIIIlIlIIlllI, String lllllllllllllllIlIIlIIIlIlIIllIl) {
        lllllllllllllllIlIIlIIIlIlIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIlIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIIIlIlIIllII = new StringBuilder();
        char[] lllllllllllllllIlIIlIIIlIlIIlIll = lllllllllllllllIlIIlIIIlIlIIllIl.toCharArray();
        int lllllllllllllllIlIIlIIIlIlIIlIlI = llIIlllIlIll[1];
        char[] lllllllllllllllIlIIlIIIlIlIIIlII = lllllllllllllllIlIIlIIIlIlIIlllI.toCharArray();
        int lllllllllllllllIlIIlIIIlIlIIIIll = lllllllllllllllIlIIlIIIlIlIIIlII.length;
        int lllllllllllllllIlIIlIIIlIlIIIIlI = llIIlllIlIll[1];
        while (B.lllllllllIllII(lllllllllllllllIlIIlIIIlIlIIIIlI, lllllllllllllllIlIIlIIIlIlIIIIll)) {
            char lllllllllllllllIlIIlIIIlIlIIllll = lllllllllllllllIlIIlIIIlIlIIIlII[lllllllllllllllIlIIlIIIlIlIIIIlI];
            lllllllllllllllIlIIlIIIlIlIIllII.append((char)(lllllllllllllllIlIIlIIIlIlIIllll ^ lllllllllllllllIlIIlIIIlIlIIlIll[lllllllllllllllIlIIlIIIlIlIIlIlI % lllllllllllllllIlIIlIIIlIlIIlIll.length]));
            "".length();
            ++lllllllllllllllIlIIlIIIlIlIIlIlI;
            ++lllllllllllllllIlIIlIIIlIlIIIIlI;
            "".length();
            if ("   ".length() == "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIIIlIlIIllII);
    }

    static {
        B.lllllllllIlIIl();
        B.lllllllllIlIII();
    }

    private static void lllllllllIlIII() {
        llIIlllIlIlI = new String[llIIlllIlIll[5]];
        B.llIIlllIlIlI[B.llIIlllIlIll[1]] = B.lllllllllIIlIl("DiI4Eg==", "ZCSwi");
        B.llIIlllIlIlI[B.llIIlllIlIll[0]] = B.lllllllllIIllI("1nDht6il+zQ=", "WUQQC");
        B.llIIlllIlIlI[B.llIIlllIlIll[4]] = B.lllllllllIIlll("yLvUWUwwVTk=", "LAiXn");
    }

    private static boolean lllllllllIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllllllIIlll(String lllllllllllllllIlIIlIIIlIlIlllII, String lllllllllllllllIlIIlIIIlIlIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIIlIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), llIIlllIlIll[6]), "DES");
            Cipher lllllllllllllllIlIIlIIIlIllIIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIIIlIllIIIII.init(llIIlllIlIll[4], lllllllllllllllIlIIlIIIlIllIIIIl);
            return new String(lllllllllllllllIlIIlIIIlIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIlIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIIIlIlIlllll) {
            lllllllllllllllIlIIlIIIlIlIlllll.printStackTrace();
            return null;
        }
    }
}

