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

@TaskDesc(name="Dodging volatile baboon", priority=100, blocking=true)
public class aX
extends aT {
    private static /* synthetic */ String[] llIllIIIlII;
    private static /* synthetic */ int[] llIllIIIlIl;

    @Override
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.meleeGearAkkha();
    }

    private static String lIlIlIIIllIlII(String llllllllllllllllIIlIllllIllIllIl, String llllllllllllllllIIlIllllIllIllII) {
        llllllllllllllllIIlIllllIllIllIl = new String(Base64.getDecoder().decode(llllllllllllllllIIlIllllIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIllllIllIlIll = new StringBuilder();
        char[] llllllllllllllllIIlIllllIllIlIlI = llllllllllllllllIIlIllllIllIllII.toCharArray();
        int llllllllllllllllIIlIllllIllIlIIl = llIllIIIlIl[1];
        char[] llllllllllllllllIIlIllllIllIIIll = llllllllllllllllIIlIllllIllIllIl.toCharArray();
        int llllllllllllllllIIlIllllIllIIIlI = llllllllllllllllIIlIllllIllIIIll.length;
        int llllllllllllllllIIlIllllIllIIIIl = llIllIIIlIl[1];
        while (aX.lIlIlIIIllllll(llllllllllllllllIIlIllllIllIIIIl, llllllllllllllllIIlIllllIllIIIlI)) {
            char llllllllllllllllIIlIllllIllIlllI = llllllllllllllllIIlIllllIllIIIll[llllllllllllllllIIlIllllIllIIIIl];
            llllllllllllllllIIlIllllIllIlIll.append((char)(llllllllllllllllIIlIllllIllIlllI ^ llllllllllllllllIIlIllllIllIlIlI[llllllllllllllllIIlIllllIllIlIIl % llllllllllllllllIIlIllllIllIlIlI.length]));
            "".length();
            ++llllllllllllllllIIlIllllIllIlIIl;
            ++llllllllllllllllIIlIllllIllIIIIl;
            "".length();
            if (-" ".length() <= ((0xA1 ^ 0x9C) & ~(0xB ^ 0x36))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIllllIllIlIll);
    }

    private static boolean lIlIlIIIlllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIlIIIllIlll() {
        llIllIIIlII = new String[llIllIIIlIl[3]];
        aX.llIllIIIlII[aX.llIllIIIlIl[1]] = aX.lIlIlIIIllIlII("GDgIIz0nOwFiCy81Cy0n", "NWdBI");
        aX.llIllIIIlII[aX.llIllIIIlIl[0]] = aX.lIlIlIIIllIlIl("Y9XaqU/ezNlfpYCoY8DfWSZb3NET963D/+1NcPH9nffpQpGrYhZSrg==", "KCpcc");
        aX.llIllIIIlII[aX.llIllIIIlIl[5]] = aX.lIlIlIIIllIllI("S7itfBKJt82ZOpm0kxMZnQ==", "jZyPx");
    }

    private static boolean lIlIlIIIllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIlIIIllIlIl(String llllllllllllllllIIlIlllllIIIlIII, String llllllllllllllllIIlIlllllIIIIlll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllllIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlllllIIIIlll.getBytes(StandardCharsets.UTF_8)), llIllIIIlIl[6]), "DES");
            Cipher llllllllllllllllIIlIlllllIIIllII = Cipher.getInstance("DES");
            llllllllllllllllIIlIlllllIIIllII.init(llIllIIIlIl[5], llllllllllllllllIIlIlllllIIIllIl);
            return new String(llllllllllllllllIIlIlllllIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlllllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlllllIIIlIll) {
            llllllllllllllllIIlIlllllIIIlIll.printStackTrace();
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
        void llllllllllllllllIIlIlllllIIllllI;
        String[] stringArray = new String[llIllIIIlIl[0]];
        stringArray[aX.llIllIIIlIl[1]] = llIllIIIlII[llIllIIIlIl[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aX.lIlIlIIIlllIIl(nPC)) {
            return llIllIIIlIl[1];
        }
        if (aX.lIlIlIIIlllIlI(llllllllllllllllIIlIlllllIIllllI.getAnimation(), llIllIIIlIl[2])) {
            return llIllIIIlIl[1];
        }
        WorldPoint llllllllllllllllIIlIlllllIIlllIl = Players.getLocal().getWorldLocation();
        if (aX.lIlIlIIIlllIll(llllllllllllllllIIlIlllllIIlllIl.distanceTo((Locatable)llllllllllllllllIIlIlllllIIllllI), llIllIIIlIl[3])) {
            return llIllIIIlIl[1];
        }
        WorldPoint llllllllllllllllIIlIlllllIIlllII = llllllllllllllllIIlIlllllIIlllIl.toWorldArea().offset(llIllIIIlIl[4]).toWorldPointList().stream().filter(worldPoint -> {
            String[] stringArray = new String[llIllIIIlIl[0]];
            stringArray[aX.llIllIIIlIl[1]] = llIllIIIlII[llIllIIIlIl[5]];
            return NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl2;
                if (aX.lIlIlIIIlllllI(nPC.getAnimation(), llIllIIIlIl[2])) {
                    bl2 = llIllIIIlIl[0];
                    "".length();
                    if (" ".length() <= -" ".length()) {
                        return ((0x83 ^ 0x8B) & ~(0x39 ^ 0x31)) != 0;
                    }
                } else {
                    bl2 = llIllIIIlIl[1];
                }
                return bl2;
            }).noneMatch(nPC -> {
                boolean bl2;
                if (aX.lIlIlIIIllllIl(nPC.getWorldLocation().distanceTo(worldPoint), llIllIIIlIl[5])) {
                    bl2 = llIllIIIlIl[0];
                    "".length();
                    if ("  ".length() == 0) {
                        return ((0x62 ^ 0xE ^ (0x1A ^ 0x7A)) & (0x5A ^ 0x61 ^ (8 ^ 0x3F) ^ -" ".length())) != 0;
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
                "".length();
                if (-"  ".length() > 0) {
                    return ((35 + 66 - 88 + 158 ^ 143 + 4 - 58 + 73) & (35 + 52 - 71 + 127 ^ 89 + 85 - 169 + 129 ^ -" ".length()) & ((0x3A ^ 0x77 ^ (0x73 ^ 0xB)) & (51 + 146 - 145 + 111 ^ 115 + 87 - 178 + 126 ^ -" ".length()) ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIllIIIlIl[1];
            }
            return bl2;
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(llllllllllllllllIIlIlllllIIlllIl))).orElse(null);
        if (aX.lIlIlIIIlllIIl(llllllllllllllllIIlIlllllIIlllII)) {
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
        aX.llIllIIIlIl[0] = " ".length();
        aX.llIllIIIlIl[1] = (1 + 17 - -85 + 57 ^ 101 + 1 - 63 + 98) & (0x87 ^ 0xAD ^ "   ".length() ^ -" ".length());
        aX.llIllIIIlIl[2] = -" ".length();
        aX.llIllIIIlIl[3] = "   ".length();
        aX.llIllIIIlIl[4] = 0x48 ^ 0x6E ^ (0x11 ^ 0x32);
        aX.llIllIIIlIl[5] = "  ".length();
        aX.llIllIIIlIl[6] = 0xB0 ^ 0xB8;
    }

    private static String lIlIlIIIllIllI(String llllllllllllllllIIlIllllIllllIll, String llllllllllllllllIIlIllllIlllllII) {
        try {
            SecretKeySpec llllllllllllllllIIlIlllllIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllllIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIllllIlllllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIllllIlllllll.init(llIllIIIlIl[5], llllllllllllllllIIlIlllllIIIIIII);
            return new String(llllllllllllllllIIlIllllIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllllIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIllllIllllllI) {
            llllllllllllllllIIlIllllIllllllI.printStackTrace();
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

