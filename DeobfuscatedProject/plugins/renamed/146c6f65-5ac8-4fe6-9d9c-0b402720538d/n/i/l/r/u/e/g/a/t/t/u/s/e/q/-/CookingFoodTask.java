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
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.DEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.HerbType;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m_Unknown;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n_Unknown;
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
/* TASK: Cooking food -> CookingfoodTask */
@TaskDesc(name="Cooking food", priority=4, blocking=true)
public class CookingFoodTask
extends n_Unknown {
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
        Item var18;
        B var17;
        void var24;
        void var8;
        m m2 = this.ba.V().av();
        List list = TileItems.getAll(tileItem -> {
            int n2;
            if (B.lllllllllIllll(m2.e(tileItem.getWorldLocation()) ? 1 : 0) && B.lllllllllIllll(i.FISH.aA().contains(tileItem.getId()) ? 1 : 0)) {
                n2 = llIIlllIlIll[0];
                0;
                if (((0x42 ^ 0x2B ^ (7 ^ 0x3F)) & (0x31 ^ 0x73 ^ (0xA7 ^ 0xB4) ^ -1)) != 0) {
                    return ((130 + 8 - 71 + 130 ^ 129 + 98 - 91 + 9) & (0xAC ^ 0x97 ^ (0x14 ^ 0x7B) ^ -1)) != 0;
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
                    0;
                    if ((6 ^ 2) <= 0) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIlIll[1];
                }
                return n2 != 0;
            }).size());
            return llIIlllIlIll[0];
        }
        var8.l(var24.size());
        int var3 = i.FISH.aC();
        if (B.lllllllllIlIll(var3)) {
            var17.bP = llIIlllIlIll[2];
            return llIIlllIlIll[1];
        }
        if (B.lllllllllIllII(var3, var17.bP)) {
            var17.bP = var3;
            Time.sleepTick();
            0;
            return llIIlllIlIll[0];
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> e.aE.contains(tileObject.getId()));
        if (B.lllllllllIllIl(var4)) {
            return llIIlllIlIll[1];
        }
        Player var20 = Players.getLocal();
        if (B.lllllllllIllIl(var20)) {
            return llIIlllIlIll[1];
        }
        if (B.lllllllllIllII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS) - llIIlllIlIll[3]) && B.lllllllllIlllI(var18 = Inventory.getFirst(item -> e.aH.contains(item.getId())))) {
            var18.interact(llIIlllIlIlI[llIIlllIlIll[0]]);
        }
        var4_5.interact(llIIlllIlIlI[llIIlllIlIll[4]]);
        return llIIlllIlIll[0];
    }

    private static void lllllllllIlIIl() {
        llIIlllIlIll = new int[7];
        B.llIIlllIlIll[0] = 1;
        B.llIIlllIlIll[1] = (0x71 ^ 0x53 ^ (0x17 ^ 0x57)) & (33 + 100 - -51 + 59 ^ 86 + 14 - 21 + 66 ^ -1);
        B.llIIlllIlIll[2] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        B.llIIlllIlIll[3] = 0x62 ^ 0xA ^ (0xDD ^ 0xA1);
        B.llIIlllIlIll[4] = 2;
        B.llIIlllIlIll[5] = 3;
        B.llIIlllIlIll[6] = 4 + 133 - 89 + 87 ^ 44 + 87 - 71 + 83;
    }

    private static boolean lllllllllIllIl(Object object) {
        return object == null;
    }

    private static String lllllllllIIllI(String var21, String var10) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llIIlllIlIll[4], var15);
            return new String(var7.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
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

    private static String lllllllllIIlIl(String var12, String var25) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var11 = var25.toCharArray();
        int var6 = llIIlllIlIll[1];
        char[] var19 = var12.toCharArray();
        int var9 = var19.length;
        int var2 = llIIlllIlIll[1];
        while (B.lllllllllIllII(var2, var9)) {
            char var26 = var19[var2];
            var14.append((char)(var26 ^ var11[var6 % var11.length]));
            0;
            ++var6;
            ++var2;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    static {
        B.lllllllllIlIIl();
        B.lllllllllIlIII();
    }

    private static void lllllllllIlIII() {
        llIIlllIlIlI = new String[llIIlllIlIll[5]];
        B.llIIlllIlIlI[B.llIIlllIlIll[1]] = B."Take";
        B.llIIlllIlIlI[B.llIIlllIlIll[0]] = B."Eat";
        B.llIIlllIlIlI[B.llIIlllIlIll[4]] = B."Cook";
    }

    private static boolean lllllllllIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllllllIIlll(String var23, String var16) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), llIIlllIlIll[6]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(llIIlllIlIll[4], var22);
            return new String(var1.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }
}

