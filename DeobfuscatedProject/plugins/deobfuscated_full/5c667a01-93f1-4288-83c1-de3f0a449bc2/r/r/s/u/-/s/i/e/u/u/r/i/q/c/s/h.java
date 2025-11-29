/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.i;

/* TASK: Restoring prayer at Ardougne Monastery -> RestoringprayeratardougnemonasteryTask */
@TaskDesc(name="Restoring prayer at Ardougne Monastery", priority=2147483597, blocking=true)
public class h
extends i {
    private static /* synthetic */ int[] lIIlIllIIIIll;
    private static /* synthetic */ String[] lIIlIllIIIIlI;

    private static void lIlIllIIlIlIlll() {
        lIIlIllIIIIll = new int[9];
        h.lIIlIllIIIIll[0] = (0x83 ^ 0xC5 ^ (0x7D ^ 0x21)) & (0xB ^ 0x69 ^ (0x25 ^ 0x5D) ^ -1);
        h.lIIlIllIIIIll[1] = 2;
        h.lIIlIllIIIIll[2] = 1;
        h.lIIlIllIIIIll[3] = 0x41 ^ 0x4B;
        h.lIIlIllIIIIll[4] = 3;
        h.lIIlIllIIIIll[5] = 0x4E ^ 0x4A;
        h.lIIlIllIIIIll[6] = 0x5A ^ 0x47 ^ (0x5A ^ 0x42);
        h.lIIlIllIIIIll[7] = 0x3D ^ 0x6F ^ (0xCD ^ 0x99);
        h.lIIlIllIIIIll[8] = 0x42 ^ 0x45;
    }

    static {
        h.lIlIllIIlIlIlll();
        h.lIlIllIIlIlIllI();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean d(int n2) {
        void var13;
        int[] nArray = Static.getClient().getMapRegions();
        int n3 = nArray.length;
        int var4 = lIIlIllIIIIll[0];
        while (h.lIlIllIIlIlllII(var4, (int)var13)) {
            void var21;
            void var16;
            void var15 = var16[var4];
            if (h.lIlIllIIlIlllIl((int)var15, (int)var21)) {
                return lIIlIllIIIIll[2];
            }
            ++var4;
            0;
            if (2 >= -1) continue;
            return ((0x67 ^ 0x48 ^ (0x32 ^ 0x4B)) & (136 + 163 - 104 + 32 ^ 156 + 146 - 288 + 167 ^ -1)) != 0;
        }
        return lIIlIllIIIIll[0];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean a() {
        void var1_2;
        h var3;
        if (h.lIlIllIIlIllIII(this.b.ardyCloak() ? 1 : 0)) {
            return lIIlIllIIIIll[0];
        }
        if (h.lIlIllIIlIllIIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), Skills.getLevel((Skill)Skill.PRAYER))) {
            return lIIlIllIIIIll[0];
        }
        if (h.lIlIllIIlIllIII(var3.d(r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.G) ? 1 : 0)) {
            Item var14 = Inventory.getFirst(item -> item.getName().startsWith(lIIlIllIIIIlI[lIIlIllIIIIll[7]]));
            if (h.lIlIllIIlIllIlI(var14)) {
                var14 = Equipment.getFirst(item -> item.getName().startsWith(lIIlIllIIIIlI[lIIlIllIIIIll[6]]));
            }
            if (h.lIlIllIIlIllIlI(var14)) {
                return lIIlIllIIIIll[0];
            }
            String[] stringArray = new String[lIIlIllIIIIll[1]];
            stringArray[h.lIIlIllIIIIll[0]] = lIIlIllIIIIlI[lIIlIllIIIIll[0]];
            stringArray[h.lIIlIllIIIIll[2]] = lIIlIllIIIIlI[lIIlIllIIIIll[2]];
            var14.interact(stringArray);
            return lIIlIllIIIIll[2];
        }
        if (h.lIlIllIIlIllIll(Players.getLocal().distanceTo(r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.H), lIIlIllIIIIll[3])) {
            Movement.setDestination((WorldPoint)r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.H);
            return lIIlIllIIIIll[2];
        }
        TileObject var14 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.lIlIllIIlIllllI(tileObject.getName().equals(lIIlIllIIIIlI[lIIlIllIIIIll[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlIllIIIIll[2]];
                stringArray[h.lIIlIllIIIIll[0]] = lIIlIllIIIIlI[lIIlIllIIIIll[5]];
                if (h.lIlIllIIlIllllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlIllIIIIll[2];
                    0;
                    if (-1 < 3) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlIllIIIIll[0];
            return n2 != 0;
        });
        if (h.lIlIllIIlIllIlI(var14)) {
            return lIIlIllIIIIll[0];
        }
        var1_2.interact(lIIlIllIIIIlI[lIIlIllIIIIll[1]]);
        return lIIlIllIIIIll[2];
    }

    private static boolean lIlIllIIlIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllIIlIllIlI(Object object) {
        return object == null;
    }

    private static String lIlIllIIlIlIlII(String var9, String var20) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(lIIlIllIIIIll[1], var6);
            return new String(var18.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIlIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIlIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIlIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIIlIllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIlIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIIlIlIllI() {
        lIIlIllIIIIlI = new String[lIIlIllIIIIll[8]];
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[0]] = h."Kandarin Monastery";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[2]] = h."Monastery Teleport";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[1]] = h."Pray-at";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[4]] = h."Altar";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[5]] = h."Pray-at";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[6]] = h."Ardougne cloak";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[7]] = h."Ardougne cloak";
    }

    private static String lIlIllIIlIlIlIl(String var17, String var1) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var5 = var1.toCharArray();
        int var19 = lIIlIllIIIIll[0];
        char[] var12 = var17.toCharArray();
        int var11 = var12.length;
        int var10 = lIIlIllIIIIll[0];
        while (h.lIlIllIIlIlllII(var10, var11)) {
            char var7 = var12[var10];
            var2.append((char)(var7 ^ var5[var19 % var5.length]));
            0;
            ++var19;
            ++var10;
            0;
            if (((0x76 ^ 3 ^ (0x21 ^ 0x16)) & (0xF5 ^ 0x8C ^ (0x7A ^ 0x41) ^ -1)) <= 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }
}

