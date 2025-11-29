/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.a;
import -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.b;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

/* TASK: Lighting Brazier -> LightingbrazierTask */
@TaskDesc(name="Lighting Brazier", priority=2, blocking=true, register=true)
public class o
extends Task {
    private static /* synthetic */ int[] lIlIlllllIIII;
    public static final /* synthetic */ int Y;
    private final /* synthetic */ SquireWintertodtConfig aa;
    private final /* synthetic */ b Z;
    private /* synthetic */ int ab;
    private static /* synthetic */ String[] lIlIllllIlllI;

    private static boolean llIIIIllIlIIIll(Object object) {
        return object != null;
    }

    @Inject
    public o(b b2, SquireWintertodtConfig squireWintertodtConfig) {
        this.ab = lIlIlllllIIII[0];
        this.Z = b2;
        this.aa = squireWintertodtConfig;
    }

    private static String llIIIIllIIlIlIl(String var1, String var19) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var10 = var19.toCharArray();
        int var6 = lIlIlllllIIII[0];
        char[] var11 = var1.toCharArray();
        int var5 = var11.length;
        int var13 = lIlIlllllIIII[0];
        while (o.llIIIIllIlIIIII(var13, var5)) {
            char var9 = var11[var13];
            var20.append((char)(var9 ^ var10[var6 % var10.length]));
            0;
            ++var6;
            ++var13;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    static {
        o.llIIIIllIIlllII();
        o.llIIIIllIIlIlll();
        Y = lIlIlllllIIII[7];
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (!o.llIIIIllIIlllIl(string.contains(lIlIllllIlllI[lIlIlllllIIII[2]]) ? 1 : 0) || o.llIIIIllIIlllll(string.contains(lIlIllllIlllI[lIlIlllllIIII[6]]) ? 1 : 0)) {
            o var7;
            var7.sleep(lIlIlllllIIII[0]);
        }
    }

    private static boolean llIIIIllIlIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIIIIllIIlIllI(String var14, String var23) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), lIlIlllllIIII[4]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIlIlllllIIII[6], var16);
            return new String(var21.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIlIIIlI(Object object) {
        return object == null;
    }

    private static boolean llIIIIllIIlllll(int n2) {
        return n2 != 0;
    }

    private static String llIIIIllIIlIlII(String var18, String var2) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lIlIlllllIIII[6], var24);
            return new String(var4.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIlIIlII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIIIllIlIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        o var15;
        if (o.llIIIIllIIlllIl(this.Z.i() ? 1 : 0)) {
            return lIlIlllllIIII[0];
        }
        a var8 = var15.Z.q();
        Player var12 = Players.getLocal();
        if (o.llIIIIllIIllllI(var15.Z.k(), lIlIlllllIIII[1])) {
            if (o.llIIIIllIIlllll(var15.Z.s() ? 1 : 0)) {
                return lIlIlllllIIII[2];
            }
            if (!o.llIIIIllIIlllIl(var12.isMoving() ? 1 : 0) || o.llIIIIllIlIIIII(var8.b().distanceTo((Locatable)var12), lIlIlllllIIII[3])) {
                return lIlIlllllIIII[0];
            }
            Movement.walk((WorldPoint)var8.b());
            return lIlIlllllIIII[2];
        }
        if (o.llIIIIllIlIIIIl(var8.b().distanceTo((Locatable)var12), lIlIlllllIIII[3])) {
            return lIlIlllllIIII[0];
        }
        NPC var25 = NPCs.getNearest((WorldPoint)var8.b(), nPC -> {
            int n2;
            if (o.llIIIIllIlIIlIl(nPC.getId(), lIlIlllllIIII[7]) && o.llIIIIllIlIIlII(nPC.distanceTo(var8.b()), lIlIlllllIIII[5])) {
                n2 = lIlIlllllIIII[2];
                0;
                if ((0xF5 ^ 0xB3 ^ (0x1A ^ 0x58)) != (8 + 47 - -3 + 69 ^ (0xC4 ^ 0xBF))) {
                    return ((0xF ^ 0x3E ^ (0x50 ^ 0x36)) & (181 + 101 - 44 + 14 ^ 78 + 151 - 180 + 122 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlllllIIII[0];
            }
            return n2 != 0;
        });
        if (o.llIIIIllIlIIIlI(var25)) {
            if (o.llIIIIllIlIIIIl(var15.ab, lIlIlllllIIII[4])) {
                var15.Z.r();
                var15.ab = lIlIlllllIIII[0];
                return lIlIlllllIIII[0];
            }
            if (o.llIIIIllIlIIIII(var8.b().distanceTo((Locatable)Players.getLocal()), lIlIlllllIIII[5])) {
                var15.ab += lIlIlllllIIII[2];
            }
            return lIlIlllllIIII[0];
        }
        TileObject var3 = TileObjects.getNearest((WorldPoint)var8.b(), tileObject -> {
            int n2;
            if (o.llIIIIllIlIIIll(tileObject.getName()) && o.llIIIIllIIlllll(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIlIllllIlllI[lIlIlllllIIII[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlllllIIII[2]];
                stringArray[o.lIlIlllllIIII[0]] = lIlIllllIlllI[lIlIlllllIIII[1]];
                if (o.llIIIIllIIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && o.llIIIIllIlIIlII(var8.b().distanceTo((Locatable)tileObject), lIlIlllllIIII[3])) {
                    n2 = lIlIlllllIIII[2];
                    0;
                    if (3 > 2) return n2 != 0;
                    return ((36 + 126 - 157 + 235 ^ 135 + 23 - 46 + 56) & (0xD1 ^ 0xB7 ^ (0x8F ^ 0xB1) ^ -1)) != 0;
                }
            }
            n2 = lIlIlllllIIII[0];
            return n2 != 0;
        });
        if (o.llIIIIllIlIIIlI(var3)) {
            return lIlIlllllIIII[0];
        }
        this.ab = lIlIlllllIIII[0];
        var4_4.interact(lIlIllllIlllI[lIlIlllllIIII[0]]);
        this.sleep(lIlIlllllIIII[6]);
        return lIlIlllllIIII[2];
    }

    private static void llIIIIllIIlIlll() {
        lIlIllllIlllI = new String[lIlIlllllIIII[8]];
        o.lIlIllllIlllI[o.lIlIlllllIIII[0]] = o."Light";
        o.lIlIllllIlllI[o.lIlIlllllIIII[2]] = o."seeps into your bones";
        o.lIlIllllIlllI[o.lIlIlllllIIII[6]] = o."Congratulations";
        o.lIlIllllIlllI[o.lIlIlllllIIII[3]] = o."brazier";
        o.lIlIllllIlllI[o.lIlIlllllIIII[1]] = o."Light";
    }

    private static boolean llIIIIllIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIllIIllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIIIIllIIlllII() {
        lIlIlllllIIII = new int[9];
        o.lIlIlllllIIII[0] = (0x13 ^ 2 ^ (0x12 ^ 0x5F)) & (0xB3 ^ 0xBF ^ (0xF9 ^ 0xA9) ^ -1);
        o.lIlIlllllIIII[1] = 7 ^ 3;
        o.lIlIlllllIIII[2] = 1;
        o.lIlIlllllIIII[3] = 3;
        o.lIlIlllllIIII[4] = 0xB3 ^ 0x8A ^ (0x5D ^ 0x6C);
        o.lIlIlllllIIII[5] = 0x56 ^ 1 ^ (0x3A ^ 0x67);
        o.lIlIlllllIIII[6] = 2;
        o.lIlIlllllIIII[7] = -(0xFFFFE309 & 0x3FF7) & (0xFFFFBFEB & 0x7FDF);
        o.lIlIlllllIIII[8] = 0 + 22 - -140 + 23 ^ 87 + 138 - 223 + 186;
    }

    private static boolean llIIIIllIIlllIl(int n2) {
        return n2 == 0;
    }
}

