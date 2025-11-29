/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Killing annoying egg -> KillingannoyingeggTask */
@TaskDesc(name="Killing annoying egg", priority=20, register=true, blocking=true)
public class KillingAnnoyingEggTask
extends bh_Unknown {
    private static /* synthetic */ String[] llIlIllIlll;
    private static /* synthetic */ int[] llIlIlllIII;
    private static final /* synthetic */ int eM;
    private static final /* synthetic */ Point eL;

    private static void lIlIlIIIIIIIIl() {
        llIlIllIlll = new String[llIlIlllIII[8]];
        bg.llIlIllIlll[bg.llIlIlllIII[1]] = bg."Wield";
        bg.llIlIllIlll[bg.llIlIlllIII[3]] = bg."Attack";
        bg.llIlIllIlll[bg.llIlIlllIII[2]] = bg."keris";
        bg.llIlIllIlll[bg.llIlIlllIII[4]] = bg."egg";
        bg.llIlIllIlll[bg.llIlIlllIII[0]] = bg."Attack";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var2_2;
        bg var13;
        if (!bg.lIlIlIIIIIIIll(bg.bV() ? 1 : 0) || bg.lIlIlIIIIIIlII(this.bR() ? 1 : 0)) {
            var13.sleep(llIlIlllIII[0]);
            return llIlIlllIII[1];
        }
        WorldPoint var6 = var13.a(eL);
        NPC var8 = NPCs.getAll(nPC -> {
            int n2;
            if (bg.lIlIlIIIIIIlII(nPC.getName().toLowerCase().contains(llIlIllIlll[llIlIlllIII[4]]) ? 1 : 0)) {
                String[] stringArray = new String[llIlIlllIII[3]];
                stringArray[bg.llIlIlllIII[1]] = llIlIllIlll[llIlIlllIII[0]];
                if (bg.lIlIlIIIIIIlII(nPC.hasAction(stringArray) ? 1 : 0) && bg.lIlIlIIIIIIlII(nPC.getWorldLocation().equals((Object)var6) ? 1 : 0) && bg.lIlIlIIIIIIlll(nPC.getId(), llIlIlllIII[5]) && bg.lIlIlIIIIIIIll(nPC.isDead() ? 1 : 0)) {
                    n2 = llIlIlllIII[3];
                    0;
                    if (1 > 0) return n2 != 0;
                    return false;
                }
            }
            n2 = llIlIlllIII[1];
            return n2 != 0;
        }).stream().findFirst().orElse(null);
        if (bg.lIlIlIIIIIIlIl(var8)) {
            return llIlIlllIII[1];
        }
        if (bg.lIlIlIIIIIIIll(var8.getWorldArea().offset(llIlIlllIII[2]).contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIlIlllIII[1];
        }
        Set<WorldPoint> var10 = var13.bU();
        WorldArea var5 = var8.getWorldArea().offset(llIlIlllIII[3]);
        if (bg.lIlIlIIIIIIlII(var10.stream().anyMatch(worldPoint -> var8.getWorldArea().offset(llIlIlllIII[3]).contains(worldPoint)) ? 1 : 0)) {
            WorldPoint var14 = var5.toWorldPointList().stream().filter(worldPoint -> worldPoint.toWorldArea().isInMeleeDistance(var8.getWorldLocation())).filter(worldPoint -> {
                boolean bl2;
                if (bg.lIlIlIIIIIIIll(var10.contains(worldPoint) ? 1 : 0)) {
                    bl2 = llIlIlllIII[3];
                    0;
                    if ((0x4B ^ 0x53 ^ (0x6D ^ 0x71)) <= 2) {
                        return ((0x6F ^ 0x27 ^ (0xF7 ^ 0x9A)) & (28 + 65 - 38 + 99 ^ 27 + 126 - 20 + 58 ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIlIlllIII[1];
                }
                return bl2;
            }).findFirst().orElse(null);
            if (bg.lIlIlIIIIIIlIl(var14)) {
                return llIlIlllIII[1];
            }
            Movement.setDestination((WorldPoint)var14);
            return llIlIlllIII[1];
        }
        var13.bp();
        Item var14 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llIlIllIlll[llIlIlllIII[2]]));
        if (bg.lIlIlIIIIIIllI(var14)) {
            var14.interact(llIlIllIlll[llIlIlllIII[1]]);
        }
        var2_2.interact(llIlIllIlll[llIlIlllIII[3]]);
        return llIlIlllIII[3];
    }

    private static String lIlIIllllllllI(String var12, String var11) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), llIlIlllIII[9]), "DES");
            Cipher var24 = Cipher.getInstance("DES");
            var24.init(llIlIlllIII[2], var25);
            return new String(var24.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlIIIIIIIII(String var4, String var19) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var9 = var19.toCharArray();
        int var15 = llIlIlllIII[1];
        char[] var18 = var4.toCharArray();
        int var7 = var18.length;
        int var3 = llIlIlllIII[1];
        while (bg.lIlIlIIIIIlIII(var3, var7)) {
            char var20 = var18[var3];
            var22.append((char)(var20 ^ var9[var15 % var9.length]));
            0;
            ++var15;
            ++var3;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    @Inject
    public bg(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void lIlIlIIIIIIIlI() {
        llIlIlllIII = new int[10];
        bg.llIlIlllIII[0] = 0x67 ^ 0xC ^ (0x65 ^ 0xA);
        bg.llIlIlllIII[1] = (0x94 ^ 0xBE) & ~(0x12 ^ 0x38);
        bg.llIlIlllIII[2] = 2;
        bg.llIlIlllIII[3] = 1;
        bg.llIlIlllIII[4] = 3;
        bg.llIlIlllIII[5] = -(0xFFFFE137 & 0x5EEF) & (0xFFFFFFF6 & 0x6DFF);
        bg.llIlIlllIII[6] = 0x6D ^ 0x72;
        bg.llIlIlllIII[7] = 0x6B ^ 0x34 ^ (0x25 ^ 0x5E);
        bg.llIlIlllIII[8] = 0x84 ^ 0x81;
        bg.llIlIlllIII[9] = 0x17 ^ 0x1F;
    }

    private static boolean lIlIlIIIIIIllI(Object object) {
        return object != null;
    }

    private static boolean lIlIlIIIIIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIIIIIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIIIIIIlIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIIIIIIlII(int n2) {
        return n2 != 0;
    }

    static {
        bg.lIlIlIIIIIIIlI();
        bg.lIlIlIIIIIIIIl();
        eM = llIlIlllIII[5];
        eL = new Point(llIlIlllIII[6], llIlIlllIII[7]);
    }

    private static String lIlIIlllllllll(String var23, String var2) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var21 = Cipher.getInstance("Blowfish");
            var21.init(llIlIlllIII[2], var16);
            return new String(var21.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }
}

