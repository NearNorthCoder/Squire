/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Locations;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

/* TASK: Attacking Gorilla -> AttackinggorillaTask */
@TaskDesc(name="Attacking Gorilla", priority=50)
@Singleton
public class AttackingGorillaTask
extends Task {
    private static final /* synthetic */ int Z;
    private static /* synthetic */ String[] llIIllIIIIll;
    private static /* synthetic */ int[] llIIllIIIlII;
    private static final /* synthetic */ RectangularArea Y;

    private static void lllllIllllllIl() {
        llIIllIIIIll = new String[llIIllIIIlII[11]];
        o.llIIllIIIIll[o.llIIllIIIlII[1]] = o."Moving to gorilla center {} {} - {}";
        o.llIIllIIIIll[o.llIIllIIIlII[3]] = o."Tortured atttacking us, moving...";
        o.llIIllIIIIll[o.llIIllIIIlII[4]] = o."Cannot find a gorilla to attack";
        o.llIIllIIIIll[o.llIIllIIIlII[2]] = o."Attack";
        o.llIIllIIIIll[o.llIIllIIIlII[5]] = o."gorilla";
        o.llIIllIIIIll[o.llIIllIIIlII[6]] = o."Tortured gorilla";
    }

    private static String lllllIlllllIll(String var25, String var20) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var18 = var20.toCharArray();
        int var27 = llIIllIIIlII[1];
        char[] var4 = var25.toCharArray();
        int var10 = var4.length;
        int var21 = llIIllIIIlII[1];
        while (o.llllllIIIIIIll(var21, var10)) {
            char var6 = var4[var21];
            var5.append((char)(var6 ^ var18[var27 % var18.length]));
            0;
            ++var27;
            ++var21;
            0;
            if (((0xA0 ^ 0xA4) & ~(0x9F ^ 0x9B)) == 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static boolean llllllIIIIIIlI(Object object) {
        return object == null;
    }

    private static boolean llllllIIIIIIIl(Object object) {
        return object != null;
    }

    private static String lllllIlllllIlI(String var1, String var15) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(llIIllIIIlII[4], var19);
            return new String(var3.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static void lllllIlllllllI() {
        llIIllIIIlII = new int[13];
        o.llIIllIIIlII[0] = -(0xFFFFD6AF & 0x7DD7) & (0xFFFFF7DE & 0x7CFF);
        o.llIIllIIIlII[1] = (0x61 ^ 0x4A) & ~(0x4F ^ 0x64);
        o.llIIllIIIlII[2] = 3;
        o.llIIllIIIlII[3] = 1;
        o.llIIllIIIlII[4] = 2;
        o.llIIllIIIlII[5] = 0x53 ^ 0x57;
        o.llIIllIIIlII[6] = 40 + 112 - 36 + 42 ^ 132 + 65 - 49 + 7;
        o.llIIllIIIlII[7] = -(0xFFFFF5FD & 0x4ED7) & (0xFFFFDEFF & 0x6DFD);
        o.llIIllIIIlII[8] = 0xFFFFFFAE & 0x1655;
        o.llIIllIIIlII[9] = 0xFFFF89CD & 0x7E7F;
        o.llIIllIIIlII[10] = -(0xFFFFFBD2 & 0x2CEF) & (0xFFFFFEE3 & 0x3FFF);
        o.llIIllIIIlII[11] = 0x37 ^ 0x31;
        o.llIIllIIIlII[12] = 0x6B ^ 0x78 ^ (8 ^ 0x13);
    }

    static {
        o.lllllIlllllllI();
        o.lllllIllllllIl();
        Z = llIIllIIIlII[0];
        Y = new RectangularArea(llIIllIIIlII[7], llIIllIIIlII[8], llIIllIIIlII[9], llIIllIIIlII[10], llIIllIIIlII[1]);
    }

    private static boolean llllllIIIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllIllllllII(String var17, String var22) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), llIIllIIIlII[12]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(llIIllIIIlII[4], var13);
            return new String(var7.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIIIIIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllIllllllll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        o var14;
        if (o.lllllIllllllll(Locations.isRegionLoaded((int)llIIllIIIlII[0]) ? 1 : 0)) {
            return llIIllIIIlII[1];
        }
        if (o.lllllIllllllll(Y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.llllllIIIIIIII(var14.N() ? 1 : 0)) {
            Object[] objectArray = new Object[llIIllIIIlII[2]];
            objectArray[o.llIIllIIIlII[1]] = Y.contains(Players.getLocal().getWorldLocation());
            objectArray[o.llIIllIIIlII[3]] = var14.N();
            objectArray[o.llIIllIIIlII[4]] = Players.getLocal().getWorldLocation();
            Log.info((String)llIIllIIIIll[llIIllIIIlII[1]], (Object[])objectArray);
            Movement.setDestination((WorldPoint)Y.getCenter());
            return llIIllIIIlII[3];
        }
        Player var8 = Players.getLocal();
        NPC var11 = NPCs.getNearest(nPC -> {
            int n2;
            if (o.llllllIIIIIIII(nPC.getName().equals(llIIllIIIIll[llIIllIIIlII[6]]) ? 1 : 0) && o.llllllIIIIIlIl(nPC.getInteracting(), var8)) {
                n2 = llIIllIIIlII[3];
                0;
                if (1 > 1) {
                    return ((0x12 ^ 0x51 ^ (0x25 ^ 0x47)) & (108 + 103 - 78 + 37 ^ 46 + 23 - 14 + 84 ^ -1)) != 0;
                }
            } else {
                n2 = llIIllIIIlII[1];
            }
            return n2 != 0;
        });
        if (o.llllllIIIIIIIl(var11)) {
            Log.info((String)llIIllIIIIll[llIIllIIIlII[3]]);
            Movement.setDestination((WorldPoint)new WorldPoint(Y.getMinX(), Y.getMinY(), llIIllIIIlII[1]));
            return llIIllIIIlII[3];
        }
        NPC var2 = NPCs.getNearest(nPC -> {
            int n2;
            if (o.llllllIIIIIlIl(nPC.getInteracting(), Players.getLocal()) && o.llllllIIIIIIII(Y.contains((Locatable)nPC) ? 1 : 0) && o.llllllIIIIIIII(SquireGorillaPlugin.a(nPC.getId()) ? 1 : 0)) {
                n2 = llIIllIIIlII[3];
                0;
                if (-(0x86 ^ 0x82) > 0) {
                    return false;
                }
            } else {
                n2 = llIIllIIIlII[1];
            }
            return n2 != 0;
        });
        if (o.llllllIIIIIIlI(var2) && o.llllllIIIIIIlI(var2 = NPCs.getNearest(nPC -> {
            int n2;
            if (o.llllllIIIIIIlI(nPC.getInteracting()) && o.llllllIIIIIIII(Y.contains((Locatable)nPC) ? 1 : 0) && o.llllllIIIIIIII(SquireGorillaPlugin.a(nPC.getId()) ? 1 : 0)) {
                n2 = llIIllIIIlII[3];
                0;
                if (-(0x95 ^ 0x8E ^ (0x7A ^ 0x65)) > 0) {
                    return ((128 + 28 - 88 + 171 ^ 52 + 105 - 65 + 75) & (0xAF ^ 0xC0 ^ (0x82 ^ 0xA5) ^ -1)) != 0;
                }
            } else {
                n2 = llIIllIIIlII[1];
            }
            return n2 != 0;
        }))) {
            Log.info((String)llIIllIIIIll[llIIllIIIlII[4]]);
            return llIIllIIIlII[1];
        }
        if (o.llllllIIIIIIIl(Players.getLocal().getInteracting())) {
            return llIIllIIIlII[1];
        }
        var3_3.interact(llIIllIIIIll[llIIllIIIlII[2]]);
        this.sleep(llIIllIIIlII[5]);
        return llIIllIIIlII[3];
    }

    private static boolean llllllIIIIIlII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean N() {
        void var12;
        int[] nArray = Static.getClient().getMapRegions();
        int n2 = nArray.length;
        int var9 = llIIllIIIlII[1];
        while (o.llllllIIIIIIll(var9, (int)var12)) {
            void var16;
            void var26 = var16[var9];
            if (o.llllllIIIIIlII((int)var26, llIIllIIIlII[0])) {
                boolean bl;
                if (o.llllllIIIIIIIl(NPCs.getNearest(nPC -> nPC.getName().toLowerCase().contains(llIIllIIIIll[llIIllIIIlII[5]])))) {
                    bl = llIIllIIIlII[3];
                    0;
                    if (((0x7F ^ 0x2D ^ (0x43 ^ 0x58)) & (27 + 159 - -33 + 17 ^ 33 + 70 - 31 + 93 ^ -1)) != 0) {
                        return ((0x23 ^ 0x67 ^ (0x34 ^ 0x3E)) & (37 + 69 - 31 + 61 ^ 145 + 77 - 142 + 118 ^ -1)) != 0;
                    }
                } else {
                    bl = llIIllIIIlII[1];
                }
                return bl;
            }
            ++var9;
            0;
            if (((0x72 ^ 0x68 ^ (0x4F ^ 0xC)) & (0xA6 ^ 0x9A ^ (0x41 ^ 0x24) ^ -1)) == 0) continue;
            return false;
        }
        return llIIllIIIlII[1];
    }
}

