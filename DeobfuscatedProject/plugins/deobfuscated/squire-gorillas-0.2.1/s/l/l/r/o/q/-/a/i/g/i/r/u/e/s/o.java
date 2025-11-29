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

@TaskDesc(name="Attacking Gorilla", priority=50)
@Singleton
public class o
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

    private static String lllllIlllllIll(String lllllllllllllllIlIIlllIIlIlllIlI, String lllllllllllllllIlIIlllIIlIlllllI) {
        lllllllllllllllIlIIlllIIlIlllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIIlIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlllIIlIllllIl = new StringBuilder();
        char[] lllllllllllllllIlIIlllIIlIllllII = lllllllllllllllIlIIlllIIlIlllllI.toCharArray();
        int lllllllllllllllIlIIlllIIlIlllIll = llIIllIIIlII[1];
        char[] lllllllllllllllIlIIlllIIlIllIlIl = lllllllllllllllIlIIlllIIlIlllIlI.toCharArray();
        int lllllllllllllllIlIIlllIIlIllIlII = lllllllllllllllIlIIlllIIlIllIlIl.length;
        int lllllllllllllllIlIIlllIIlIllIIll = llIIllIIIlII[1];
        while (o.llllllIIIIIIll(lllllllllllllllIlIIlllIIlIllIIll, lllllllllllllllIlIIlllIIlIllIlII)) {
            char lllllllllllllllIlIIlllIIllIIIIII = lllllllllllllllIlIIlllIIlIllIlIl[lllllllllllllllIlIIlllIIlIllIIll];
            lllllllllllllllIlIIlllIIlIllllIl.append((char)(lllllllllllllllIlIIlllIIllIIIIII ^ lllllllllllllllIlIIlllIIlIllllII[lllllllllllllllIlIIlllIIlIlllIll % lllllllllllllllIlIIlllIIlIllllII.length]));
            0;
            ++lllllllllllllllIlIIlllIIlIlllIll;
            ++lllllllllllllllIlIIlllIIlIllIIll;
            0;
            if (((0xA0 ^ 0xA4) & ~(0x9F ^ 0x9B)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlllIIlIllllIl);
    }

    private static boolean llllllIIIIIIlI(Object object) {
        return object == null;
    }

    private static boolean llllllIIIIIIIl(Object object) {
        return object != null;
    }

    private static String lllllIlllllIlI(String lllllllllllllllIlIIlllIIlIlIlIlI, String lllllllllllllllIlIIlllIIlIlIIlll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIIlIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIIlIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlllIIlIlIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlllIIlIlIllII.init(llIIllIIIlII[4], lllllllllllllllIlIIlllIIlIlIllIl);
            return new String(lllllllllllllllIlIIlllIIlIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlllIIlIlIlIll) {
            lllllllllllllllIlIIlllIIlIlIlIll.printStackTrace();
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

    private static String lllllIllllllII(String lllllllllllllllIlIIlllIIllIIllIl, String lllllllllllllllIlIIlllIIllIIllII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlllIIllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIIllIIllII.getBytes(StandardCharsets.UTF_8)), llIIllIIIlII[12]), "DES");
            Cipher lllllllllllllllIlIIlllIIllIlIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIlllIIllIlIIIl.init(llIIllIIIlII[4], lllllllllllllllIlIIlllIIllIlIIlI);
            return new String(lllllllllllllllIlIIlllIIllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIIllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlllIIllIlIIII) {
            lllllllllllllllIlIIlllIIllIlIIII.printStackTrace();
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
        o lllllllllllllllIlIIlllIIlllIlIlI;
        if (o.lllllIllllllll(Locations.isRegionLoaded((int)llIIllIIIlII[0]) ? 1 : 0)) {
            return llIIllIIIlII[1];
        }
        if (o.lllllIllllllll(Y.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && o.llllllIIIIIIII(lllllllllllllllIlIIlllIIlllIlIlI.N() ? 1 : 0)) {
            Object[] objectArray = new Object[llIIllIIIlII[2]];
            objectArray[o.llIIllIIIlII[1]] = Y.contains(Players.getLocal().getWorldLocation());
            objectArray[o.llIIllIIIlII[3]] = lllllllllllllllIlIIlllIIlllIlIlI.N();
            objectArray[o.llIIllIIIlII[4]] = Players.getLocal().getWorldLocation();
            Log.info((String)llIIllIIIIll[llIIllIIIlII[1]], (Object[])objectArray);
            Movement.setDestination((WorldPoint)Y.getCenter());
            return llIIllIIIlII[3];
        }
        Player lllllllllllllllIlIIlllIIlllIlIIl = Players.getLocal();
        NPC lllllllllllllllIlIIlllIIlllIlIII = NPCs.getNearest(nPC -> {
            int n2;
            if (o.llllllIIIIIIII(nPC.getName().equals(llIIllIIIIll[llIIllIIIlII[6]]) ? 1 : 0) && o.llllllIIIIIlIl(nPC.getInteracting(), lllllllllllllllIlIIlllIIlllIlIIl)) {
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
        if (o.llllllIIIIIIIl(lllllllllllllllIlIIlllIIlllIlIII)) {
            Log.info((String)llIIllIIIIll[llIIllIIIlII[3]]);
            Movement.setDestination((WorldPoint)new WorldPoint(Y.getMinX(), Y.getMinY(), llIIllIIIlII[1]));
            return llIIllIIIlII[3];
        }
        NPC lllllllllllllllIlIIlllIIlllIIlll = NPCs.getNearest(nPC -> {
            int n2;
            if (o.llllllIIIIIlIl(nPC.getInteracting(), Players.getLocal()) && o.llllllIIIIIIII(Y.contains((Locatable)nPC) ? 1 : 0) && o.llllllIIIIIIII(SquireGorillaPlugin.a(nPC.getId()) ? 1 : 0)) {
                n2 = llIIllIIIlII[3];
                0;
                if (-(0x86 ^ 0x82) > 0) {
                    return ((0xB4 ^ 0xB9) & ~(0x44 ^ 0x49)) != 0;
                }
            } else {
                n2 = llIIllIIIlII[1];
            }
            return n2 != 0;
        });
        if (o.llllllIIIIIIlI(lllllllllllllllIlIIlllIIlllIIlll) && o.llllllIIIIIIlI(lllllllllllllllIlIIlllIIlllIIlll = NPCs.getNearest(nPC -> {
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
        void lllllllllllllllIlIIlllIIlllIIIIl;
        int[] nArray = Static.getClient().getMapRegions();
        int n2 = nArray.length;
        int lllllllllllllllIlIIlllIIlllIIIII = llIIllIIIlII[1];
        while (o.llllllIIIIIIll(lllllllllllllllIlIIlllIIlllIIIII, (int)lllllllllllllllIlIIlllIIlllIIIIl)) {
            void lllllllllllllllIlIIlllIIlllIIIlI;
            void lllllllllllllllIlIIlllIIllIlllll = lllllllllllllllIlIIlllIIlllIIIlI[lllllllllllllllIlIIlllIIlllIIIII];
            if (o.llllllIIIIIlII((int)lllllllllllllllIlIIlllIIllIlllll, llIIllIIIlII[0])) {
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
            ++lllllllllllllllIlIIlllIIlllIIIII;
            0;
            if (((0x72 ^ 0x68 ^ (0x4F ^ 0xC)) & (0xA6 ^ 0x9A ^ (0x41 ^ 0x24) ^ -1)) == 0) continue;
            return ((102 + 95 - 86 + 27 ^ 118 + 102 - 180 + 135) & (15 + 125 - 77 + 90 ^ 144 + 10 - -18 + 16 ^ -1)) != 0;
        }
        return llIIllIIIlII[1];
    }
}

