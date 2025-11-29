/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

/* TASK: Attack Duke West -> AttackdukewestTask */
@TaskDesc(name="Attack Duke West", priority=300, blocking=true)
public class s
extends Task {
    private static /* synthetic */ String[] lIllIlIIlllI;
    final /* synthetic */ a aF;
    private static /* synthetic */ int[] lIllIlIIllll;
    final /* synthetic */ SquireDukeSucellus aE;

    private static String lllIIlllIllIll(String var14, String var15) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIllIlIIllll[7]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIllIlIIllll[1], var25);
            return new String(var10.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIlllIlllll(int n2) {
        return n2 != 0;
    }

    private static String lllIIlllIllIIl(String var12, String var22) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIllIlIIllll[1], var24);
            return new String(var4.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllIllllI(Object object) {
        return object == null;
    }

    private static boolean lllIIllllIIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lllIIllllIIIll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        s var11;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (s.lllIIlllIlllll(nPC.getName().equals(lIllIlIIlllI[lIllIlIIllll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIllll[3]];
                stringArray[s.lIllIlIIllll[0]] = lIllIlIIlllI[lIllIlIIllll[2]];
                if (s.lllIIlllIlllll(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIllll[3];
                    0;
                    if (((0x7D ^ 0x3A) & ~(0xF7 ^ 0xB0)) == 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlIIllll[0];
            return n2 != 0;
        });
        if (s.lllIIlllIllllI(nPC2)) {
            return lIllIlIIllll[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (s.lllIIlllIlllll(tileObject.getName().equals(lIllIlIIlllI[lIllIlIIllll[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlIIllll[3]];
                stringArray[s.lIllIlIIllll[0]] = lIllIlIIlllI[lIllIlIIllll[4]];
                if (s.lllIIlllIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlIIllll[3];
                    0;
                    if (((0x42 ^ 0x46) & ~(0x34 ^ 0x30)) < 3) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlIIllll[0];
            return n2 != 0;
        });
        if (s.lllIIlllIllllI(var3)) {
            return lIllIlIIllll[0];
        }
        Player var7 = Players.getLocal();
        if (s.lllIIlllIllllI(var7)) {
            return lIllIlIIllll[0];
        }
        if (!s.lllIIlllIlllll(e.l(var3).contains((Locatable)var7) ? 1 : 0) || s.lllIIllllIIIII(e.q(var3) ? 1 : 0)) {
            return lIllIlIIllll[0];
        }
        int var9 = Static.getClient().getTickCount();
        var11.aE.b(lIllIlIIllll[0]);
        if (s.lllIIllllIIIIl(var9 - var11.aF.D(), lIllIlIIllll[1]) && s.lllIIllllIIIlI(var9 - var11.aF.C(), lIllIlIIllll[2])) {
            void var5;
            int var6;
            int n2;
            Actor var8 = Players.getLocal().getInteracting();
            if (s.lllIIllllIIIll(var8) && s.lllIIlllIlllll(var8.hasAction(lIllIlIIlllI[lIllIlIIllll[0]]::equals) ? 1 : 0)) {
                n2 = lIllIlIIllll[3];
                0;
                if (2 != 2) {
                    return ((0x5B ^ 0x46 ^ (0x30 ^ 0x21)) & (111 + 55 - 148 + 137 ^ 86 + 111 - 129 + 83 ^ -1)) != 0;
                }
            } else {
                n2 = lIllIlIIllll[0];
            }
            if (s.lllIIlllIlllll(var6 = n2)) {
                return lIllIlIIllll[3];
            }
            var5.interact(lIllIlIIlllI[lIllIlIIllll[3]]);
            return lIllIlIIllll[3];
        }
        Movement.setDestination((WorldPoint)e.m((TileObject)var2_2));
        return lIllIlIIllll[3];
    }

    private static boolean lllIIllllIIIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public s(SquireDukeSucellus squireDukeSucellus) {
        this.aE = squireDukeSucellus;
        this.aF = squireDukeSucellus.s();
    }

    private static void lllIIlllIlllII() {
        lIllIlIIlllI = new String[lIllIlIIllll[6]];
        s.lIllIlIIlllI[s.lIllIlIIllll[0]] = s."Attack";
        s.lIllIlIIlllI[s.lIllIlIIllll[3]] = s."Attack";
        s.lIllIlIIlllI[s.lIllIlIIllll[1]] = s."Gate";
        s.lIllIlIIlllI[s.lIllIlIIllll[4]] = s."Quick-escape";
        s.lIllIlIIlllI[s.lIllIlIIllll[5]] = s."Duke Sucellus";
        s.lIllIlIIlllI[s.lIllIlIIllll[2]] = s."Attack";
    }

    private static boolean lllIIllllIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllIIlllIllIlI(String var1, String var16) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var23 = var16.toCharArray();
        int var17 = lIllIlIIllll[0];
        char[] var18 = var1.toCharArray();
        int var26 = var18.length;
        int var13 = lIllIlIIllll[0];
        while (s.lllIIllllIIlII(var13, var26)) {
            char var20 = var18[var13];
            var2.append((char)(var20 ^ var23[var17 % var23.length]));
            0;
            ++var17;
            ++var13;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    static {
        s.lllIIlllIlllIl();
        s.lllIIlllIlllII();
    }

    private static void lllIIlllIlllIl() {
        lIllIlIIllll = new int[8];
        s.lIllIlIIllll[0] = (0x2A ^ 0x34) & ~(0x8F ^ 0x91);
        s.lIllIlIIllll[1] = 2;
        s.lIllIlIIllll[2] = 166 + 95 - 259 + 193 ^ 100 + 70 - 151 + 179;
        s.lIllIlIIllll[3] = 1;
        s.lIllIlIIllll[4] = 3;
        s.lIllIlIIllll[5] = 0x32 ^ 0x7F ^ (0xE4 ^ 0xAD);
        s.lIllIlIIllll[6] = 63 + 116 - 60 + 41 ^ 132 + 151 - 184 + 67;
        s.lIllIlIIllll[7] = 0x2E ^ 0x26;
    }
}

