/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.GraphicsObject
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
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.e_Unknown;
import net.runelite.api.Actor;
import net.runelite.api.GraphicsObject;
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

/* TASK: Attack Duke East -> AttackdukeeastTask */
@TaskDesc(name="Attack Duke East", priority=300, blocking=true)
public class AttackDukeEastTask
extends Task {
    final /* synthetic */ SquireDukeSucellus aC;
    final /* synthetic */ a aD;
    private static /* synthetic */ int[] lIllIlllllll;
    private static /* synthetic */ String[] lIllIllllllI;

    private static boolean lllIlIlIIlIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        r var12;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            int n2;
            if (r.lllIlIlIIlIllI(nPC.getName().equals(lIllIllllllI[lIllIlllllll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllllll[1]];
                stringArray[r.lIllIlllllll[0]] = lIllIllllllI[lIllIlllllll[3]];
                if (r.lllIlIlIIlIllI(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllllll[1];
                    0;
                    if (((0x5B ^ 0x65) & ~(0x73 ^ 0x4D)) == ((0xB2 ^ 0x8F) & ~(0x25 ^ 0x18))) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlllllll[0];
            return n2 != 0;
        });
        if (r.lllIlIlIIlIlIl(nPC2)) {
            return lIllIlllllll[0];
        }
        TileObject var15 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lllIlIlIIlIllI(tileObject.getName().equals(lIllIllllllI[lIllIlllllll[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIlllllll[1]];
                stringArray[r.lIllIlllllll[0]] = lIllIllllllI[lIllIlllllll[4]];
                if (r.lllIlIlIIlIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIlllllll[1];
                    0;
                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIlllllll[0];
            return n2 != 0;
        });
        if (r.lllIlIlIIlIlIl(var15)) {
            return lIllIlllllll[0];
        }
        Player var7 = Players.getLocal();
        if (r.lllIlIlIIlIlIl(var7)) {
            return lIllIlllllll[0];
        }
        if (!r.lllIlIlIIlIllI(e.l(var15).contains((Locatable)var7) ? 1 : 0) || r.lllIlIlIIlIlll(e.r(var15) ? 1 : 0)) {
            return lIllIlllllll[0];
        }
        GraphicsObject lllllllllllllllIlIlllIIlIlIllIII = var12.aD.B();
        int var14 = Static.getClient().getTickCount();
        var12.aC.b(lIllIlllllll[1]);
        if (r.lllIlIlIIllIII(var14 - var12.aD.D(), lIllIlllllll[2]) && r.lllIlIlIIllIIl(var14 - var12.aD.C(), lIllIlllllll[3])) {
            void var1;
            int var19;
            int n2;
            Actor var10 = Players.getLocal().getInteracting();
            if (r.lllIlIlIIllIlI(var10) && r.lllIlIlIIlIllI(var10.hasAction(lIllIllllllI[lIllIlllllll[0]]::equals) ? 1 : 0)) {
                n2 = lIllIlllllll[1];
                0;
                if ((0x57 ^ 0x53) == 2) {
                    return false;
                }
            } else {
                n2 = lIllIlllllll[0];
            }
            if (r.lllIlIlIIlIllI(var19 = n2)) {
                return lIllIlllllll[1];
            }
            var1.interact(lIllIllllllI[lIllIlllllll[1]]);
            return lIllIlllllll[1];
        }
        Movement.setDestination((WorldPoint)e.o((TileObject)var2_2));
        return lIllIlllllll[1];
    }

    private static boolean lllIlIlIIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllIlIlIIlIlIl(Object object) {
        return object == null;
    }

    private static void lllIlIlIIlIlII() {
        lIllIlllllll = new int[8];
        r.lIllIlllllll[0] = (0xA9 ^ 0xC1 ^ (0x51 ^ 0x68)) & (0xA2 ^ 0xC0 ^ (0x21 ^ 0x12) ^ -1);
        r.lIllIlllllll[1] = 1;
        r.lIllIlllllll[2] = 2;
        r.lIllIlllllll[3] = 0x45 ^ 0x40;
        r.lIllIlllllll[4] = 3;
        r.lIllIlllllll[5] = 0x4B ^ 0x4F;
        r.lIllIlllllll[6] = 2 ^ 0x2D ^ (0x55 ^ 0x7C);
        r.lIllIlllllll[7] = 0x43 ^ 0x4B;
    }

    private static boolean lllIlIlIIllIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public r(SquireDukeSucellus squireDukeSucellus) {
        this.aC = squireDukeSucellus;
        this.aD = squireDukeSucellus.s();
    }

    private static String lllIlIlIIlIIlI(String var9, String var13) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var11 = var13.toCharArray();
        int var21 = lIllIlllllll[0];
        char[] var16 = var9.toCharArray();
        int var18 = var16.length;
        int var4 = lIllIlllllll[0];
        while (r.lllIlIlIIllIll(var4, var18)) {
            char var17 = var16[var4];
            var3.append((char)(var17 ^ var11[var21 % var11.length]));
            0;
            ++var21;
            ++var4;
            0;
            if (-(19 + 122 - 23 + 18 ^ 105 + 52 - 61 + 44) <= 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private static String lllIlIlIIIllIl(String var6, String var2) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lIllIlllllll[7]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(lIllIlllllll[2], var5);
            return new String(var20.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        r.lllIlIlIIlIlII();
        r.lllIlIlIIlIIll();
    }

    private static boolean lllIlIlIIllIlI(Object object) {
        return object != null;
    }

    private static boolean lllIlIlIIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lllIlIlIIlIIll() {
        lIllIllllllI = new String[lIllIlllllll[6]];
        r.lIllIllllllI[r.lIllIlllllll[0]] = r."Attack";
        r.lIllIllllllI[r.lIllIlllllll[1]] = r."Attack";
        r.lIllIllllllI[r.lIllIlllllll[2]] = r."Gate";
        r.lIllIllllllI[r.lIllIlllllll[4]] = r."Quick-escape";
        r.lIllIllllllI[r.lIllIlllllll[5]] = r."Duke Sucellus";
        r.lIllIllllllI[r.lIllIlllllll[3]] = r."Attack";
    }
}

