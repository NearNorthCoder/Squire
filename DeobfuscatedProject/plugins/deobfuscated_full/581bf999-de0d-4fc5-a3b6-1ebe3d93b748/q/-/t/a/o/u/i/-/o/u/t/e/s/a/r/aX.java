/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aT;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

/* TASK: Dodging volatile baboon -> DodgingvolatilebaboonTask */
@TaskDesc(name="Dodging volatile baboon", priority=100, blocking=true)
public class aX
extends aT {
    private static /* synthetic */ String[] llIllIIIlII;
    private static /* synthetic */ int[] llIllIIIlIl;

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.meleeGearAkkha();
    }

    private static String lIlIlIIIllIlII(String var7, String var17) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var4 = var17.toCharArray();
        int var14 = llIllIIIlIl[1];
        char[] var6 = var7.toCharArray();
        int var15 = var6.length;
        int var8 = llIllIIIlIl[1];
        while (aX.lIlIlIIIllllll(var8, var15)) {
            char var3 = var6[var8];
            var12.append((char)(var3 ^ var4[var14 % var4.length]));
            0;
            ++var14;
            ++var8;
            0;
            if (-1 <= ((0xA1 ^ 0x9C) & ~(0xB ^ 0x36))) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean lIlIlIIIlllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIlIIIllIlll() {
        llIllIIIlII = new String[llIllIIIlIl[3]];
        aX.llIllIIIlII[aX.llIllIIIlIl[1]] = aX."Volatile Baboon";
        aX.llIllIIIlII[aX.llIllIIIlIl[0]] = aX."No safe spot found, tanking baboon";
        aX.llIllIIIlII[aX.llIllIIIlIl[5]] = aX."Volatile Baboon";
    }

    private static boolean lIlIlIIIllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIlIIIllIlIl(String var9, String var13) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), llIllIIIlIl[6]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(llIllIIIlIl[5], var22);
            return new String(var16.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIlllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var3_3;
        aX llllllllllllllllIIlIlllllIIlllll;
        void var10;
        String[] stringArray = new String[llIllIIIlIl[0]];
        stringArray[aX.llIllIIIlIl[1]] = llIllIIIlII[llIllIIIlIl[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aX.lIlIlIIIlllIIl(nPC)) {
            return llIllIIIlIl[1];
        }
        if (aX.lIlIlIIIlllIlI(var10.getAnimation(), llIllIIIlIl[2])) {
            return llIllIIIlIl[1];
        }
        WorldPoint var20 = Players.getLocal().getWorldLocation();
        if (aX.lIlIlIIIlllIll(var20.distanceTo((Locatable)var10), llIllIIIlIl[3])) {
            return llIllIIIlIl[1];
        }
        WorldPoint var11 = var20.toWorldArea().offset(llIllIIIlIl[4]).toWorldPointList().stream().filter(worldPoint -> {
            String[] stringArray = new String[llIllIIIlIl[0]];
            stringArray[aX.llIllIIIlIl[1]] = llIllIIIlII[llIllIIIlIl[5]];
            return NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl2;
                if (aX.lIlIlIIIlllllI(nPC.getAnimation(), llIllIIIlIl[2])) {
                    bl2 = llIllIIIlIl[0];
                    0;
                    if (1 <= -1) {
                        return false;
                    }
                } else {
                    bl2 = llIllIIIlIl[1];
                }
                return bl2;
            }).noneMatch(nPC -> {
                boolean bl2;
                if (aX.lIlIlIIIllllIl(nPC.getWorldLocation().distanceTo(worldPoint), llIllIIIlIl[5])) {
                    bl2 = llIllIIIlIl[0];
                    0;
                    if (2 == 0) {
                        return ((0x62 ^ 0xE ^ (0x1A ^ 0x7A)) & (0x5A ^ 0x61 ^ (8 ^ 0x3F) ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIllIIIlIl[1];
                }
                return bl2;
            });
        }).filter(worldPoint -> {
            boolean bl2;
            if (aX.lIlIlIIIllllII(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = llIllIIIlIl[0];
                0;
                if (-2 > 0) {
                    return ((35 + 66 - 88 + 158 ^ 143 + 4 - 58 + 73) & (35 + 52 - 71 + 127 ^ 89 + 85 - 169 + 129 ^ -1) & ((0x3A ^ 0x77 ^ (0x73 ^ 0xB)) & (51 + 146 - 145 + 111 ^ 115 + 87 - 178 + 126 ^ -1) ^ -1)) != 0;
                }
            } else {
                bl2 = llIllIIIlIl[1];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var20))).orElse(null);
        if (aX.lIlIlIIIlllIIl(var11)) {
            Log.info((String)llIllIIIlII[llIllIIIlIl[0]]);
            return llIllIIIlIl[1];
        }
        this.g((WorldPoint)var3_3);
        return llIllIIIlIl[0];
    }

    private static boolean lIlIlIIIlllIll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected aX(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIlIlIIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlIIIlllIII() {
        llIllIIIlIl = new int[7];
        aX.llIllIIIlIl[0] = 1;
        aX.llIllIIIlIl[1] = (1 + 17 - -85 + 57 ^ 101 + 1 - 63 + 98) & (0x87 ^ 0xAD ^ 3 ^ -1);
        aX.llIllIIIlIl[2] = -1;
        aX.llIllIIIlIl[3] = 3;
        aX.llIllIIIlIl[4] = 0x48 ^ 0x6E ^ (0x11 ^ 0x32);
        aX.llIllIIIlIl[5] = 2;
        aX.llIllIIIlIl[6] = 0xB0 ^ 0xB8;
    }

    private static String lIlIlIIIllIllI(String var1, String var5) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llIllIIIlIl[5], var21);
            return new String(var2.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIIllllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIIlllllI(int n2, int n3) {
        return n2 != n3;
    }

    static {
        aX.lIlIlIIIlllIII();
        aX.lIlIlIIIllIlll();
    }
}

