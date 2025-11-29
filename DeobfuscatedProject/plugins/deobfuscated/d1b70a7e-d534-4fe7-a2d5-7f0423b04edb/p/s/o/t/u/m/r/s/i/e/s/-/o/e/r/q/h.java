/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l;

@TaskDesc(name="Filling empty buckets", priority=10, blocking=true)
public class h
extends l {
    private static /* synthetic */ int[] lIIlllIIIIIll;
    private /* synthetic */ int ak;
    private static /* synthetic */ String[] lIIlllIIIIIII;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ak() {
        int n2;
        if (h.lIllIIlIIIlIIlI(this.ar.l() ? 1 : 0) && h.lIllIIlIIIlIIll(this.ar.L() ? 1 : 0) && h.lIllIIlIIIlIIlI(Inventory.contains(item -> {
            int n2;
            if (h.lIllIIlIIIlIIlI(item.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllIIIIIll[3]];
                stringArray[h.lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[11]];
                if (h.lIllIIlIIIlIIll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllIIIIIll[3];
                    0;
                    if (-1 <= 0) return n2 != 0;
                    return ((0xBA ^ 0xB1) & ~(0x1E ^ 0x15)) != 0;
                }
            }
            n2 = lIIlllIIIIIll[0];
            return n2 != 0;
        }) ? 1 : 0)) {
            int[] nArray = new int[lIIlllIIIIIll[1]];
            nArray[h.lIIlllIIIIIll[0]] = lIIlllIIIIIll[2];
            nArray[h.lIIlllIIIIIll[3]] = lIIlllIIIIIll[4];
            if (h.lIllIIlIIIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = lIIlllIIIIIll[3];
                0;
                if (1 != 0) return n2 != 0;
                return ((21 + 144 - 109 + 142 ^ 43 + 74 - 36 + 50) & (0x1D ^ 0x50 ^ (0x64 ^ 0x6C) ^ -1)) != 0;
            }
        }
        n2 = lIIlllIIIIIll[0];
        return n2 != 0;
    }

    static {
        h.lIllIIlIIIlIIIl();
        h.lIllIIlIIIIllII();
    }

    private static void lIllIIlIIIlIIIl() {
        lIIlllIIIIIll = new int[13];
        h.lIIlllIIIIIll[0] = (0xEE ^ 0xBB) & ~(0xF3 ^ 0xA6);
        h.lIIlllIIIIIll[1] = 2;
        h.lIIlllIIIIIll[2] = 0xFFFFF3DD & 0x6FFF;
        h.lIIlllIIIIIll[3] = 1;
        h.lIIlllIIIIIll[4] = 0xFFFFE7DC & 0x7BFF;
        h.lIIlllIIIIIll[5] = 3;
        h.lIIlllIIIIIll[6] = 0x2E ^ 0x35 ^ (0x92 ^ 0x8D);
        h.lIIlllIIIIIll[7] = 0xB5 ^ 0xB9;
        h.lIIlllIIIIIll[8] = 0xDE ^ 0xB7 ^ (0xA9 ^ 0xC5);
        h.lIIlllIIIIIll[9] = 4 ^ 2;
        h.lIIlllIIIIIll[10] = 0xB ^ 0x1B ^ (0xB ^ 0x1C);
        h.lIIlllIIIIIll[11] = 0x78 ^ 0x6F ^ (0xBD ^ 0xA2);
        h.lIIlllIIIIIll[12] = 0x12 ^ 0x1B;
    }

    private static boolean lIllIIlIIIlIlII(int n2) {
        return n2 > 0;
    }

    private static String lIllIIlIIIIIlIl(String llllllllllllllIlllIllIIllIIIIllI, String llllllllllllllIlllIllIIllIIIIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIllIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllIIIIlll.getBytes(StandardCharsets.UTF_8)), lIIlllIIIIIll[11]), "DES");
            Cipher llllllllllllllIlllIllIIllIIIlIlI = Cipher.getInstance("DES");
            llllllllllllllIlllIllIIllIIIlIlI.init(lIIlllIIIIIll[1], llllllllllllllIlllIllIIllIIIlIll);
            return new String(llllllllllllllIlllIllIIllIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIllIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIllIIIlIIl) {
            llllllllllllllIlllIllIIllIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIIlIIIIIlll(String llllllllllllllIlllIllIIllIIllIII, String llllllllllllllIlllIllIIllIIlIlll) {
        llllllllllllllIlllIllIIllIIllIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIllIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIllIIllIll = new StringBuilder();
        char[] llllllllllllllIlllIllIIllIIllIlI = llllllllllllllIlllIllIIllIIlIlll.toCharArray();
        int llllllllllllllIlllIllIIllIIllIIl = lIIlllIIIIIll[0];
        char[] llllllllllllllIlllIllIIllIIlIIll = llllllllllllllIlllIllIIllIIllIII.toCharArray();
        int llllllllllllllIlllIllIIllIIlIIlI = llllllllllllllIlllIllIIllIIlIIll.length;
        int llllllllllllllIlllIllIIllIIlIIIl = lIIlllIIIIIll[0];
        while (h.lIllIIlIIIlIllI(llllllllllllllIlllIllIIllIIlIIIl, llllllllllllllIlllIllIIllIIlIIlI)) {
            char llllllllllllllIlllIllIIllIIllllI = llllllllllllllIlllIllIIllIIlIIll[llllllllllllllIlllIllIIllIIlIIIl];
            llllllllllllllIlllIllIIllIIllIll.append((char)(llllllllllllllIlllIllIIllIIllllI ^ llllllllllllllIlllIllIIllIIllIlI[llllllllllllllIlllIllIIllIIllIIl % llllllllllllllIlllIllIIllIIllIlI.length]));
            0;
            ++llllllllllllllIlllIllIIllIIllIIl;
            ++llllllllllllllIlllIllIIllIIlIIIl;
            0;
            if (((0x1C ^ 0x11 ^ (0x7F ^ 0x5C)) & (0x62 ^ 0x6E ^ (0x83 ^ 0xA1) ^ -1)) < (0x5D ^ 0xB ^ (0xDC ^ 0x8E))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIIllIIllIll);
    }

    private static boolean lIllIIlIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static void lIllIIlIIIIllII() {
        lIIlllIIIIIII = new String[lIIlllIIIIIll[12]];
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[0]] = h."Fill-bucket";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[3]] = h."Bucket";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[1]] = h."Empty";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[5]] = h."Water pump";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[6]] = h."Fill-bucket";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[8]] = h."Bucket";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[9]] = h."Empty";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[10]] = h."Bucket";
        h.lIIlllIIIIIII[h.lIIlllIIIIIll[11]] = h."Empty";
    }

    private static String lIllIIlIIIIIllI(String llllllllllllllIlllIllIIllIlIllIl, String llllllllllllllIlllIllIIllIlIlIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIllIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIllIlIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIllIlIllll.init(lIIlllIIIIIll[1], llllllllllllllIlllIllIIllIllIIII);
            return new String(llllllllllllllIlllIllIIllIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIllIlIlllI) {
            llllllllllllllIlllIllIIllIlIlllI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        h llllllllllllllIlllIllIIlllIIIIlI;
        Player player = Players.getLocal();
        if (h.lIllIIlIIIlIlII(this.ak)) {
            if (h.lIllIIlIIIlIlIl(player) && h.lIllIIlIIIlIIlI(player.isMoving() ? 1 : 0)) {
                return lIIlllIIIIIll[3];
            }
            llllllllllllllIlllIllIIlllIIIIlI.ak -= lIIlllIIIIIll[3];
            if (h.lIllIIlIIIlIIll(Inventory.contains(item -> {
                int n2;
                if (h.lIllIIlIIIlIIlI(item.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[8]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlllIIIIIll[3]];
                    stringArray[h.lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[9]];
                    if (h.lIllIIlIIIlIIll(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIlllIIIIIll[3];
                        0;
                        if (((0x4A ^ 0xF ^ (0xDF ^ 0x96)) & (0xCF ^ 0x85 ^ (0x3C ^ 0x7A) ^ -1)) == 0) return n2 != 0;
                        return ((0xBB ^ 0xB2 ^ (0x6E ^ 0x6B)) & (0x36 ^ 0x32 ^ (0x2A ^ 0x22) ^ -1)) != 0;
                    }
                }
                n2 = lIIlllIIIIIll[0];
                return n2 != 0;
            }) ? 1 : 0)) {
                llllllllllllllIlllIllIIlllIIIIlI.ak = lIIlllIIIIIll[0];
                return lIIlllIIIIIll[0];
            }
            return lIIlllIIIIIll[3];
        }
        TileObject llllllllllllllIlllIllIIlllIIIIII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.lIllIIlIIIlIIlI(tileObject.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllIIIIIll[3]];
                stringArray[h.lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[6]];
                if (h.lIllIIlIIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0) && h.lIllIIlIIIlIllI(tileObject.getWorldLocation().distanceTo(this.ar.N().ag()), lIIlllIIIIIll[7])) {
                    n2 = lIIlllIIIIIll[3];
                    0;
                    if (1 != -1) return n2 != 0;
                    return ((45 + 74 - 99 + 116 ^ 59 + 55 - 79 + 98) & (86 + 58 - 79 + 83 ^ 110 + 67 - 151 + 127 ^ -1)) != 0;
                }
            }
            n2 = lIIlllIIIIIll[0];
            return n2 != 0;
        });
        if (!h.lIllIIlIIIlIlIl(llllllllllllllIlllIllIIlllIIIIII) || h.lIllIIlIIIlIIlI(llllllllllllllIlllIllIIlllIIIIlI.au.a((Locatable)llllllllllllllIlllIllIIlllIIIIII) ? 1 : 0)) {
            return lIIlllIIIIIll[3];
        }
        if (h.lIllIIlIIIlIIlI(llllllllllllllIlllIllIIlllIIIIlI.au.a((Locatable)llllllllllllllIlllIllIIlllIIIIII) ? 1 : 0)) {
            return llllllllllllllIlllIllIIlllIIIIlI.au.b((SceneEntity)llllllllllllllIlllIllIIlllIIIIII);
        }
        var2_2.interact(lIIlllIIIIIII[lIIlllIIIIIll[0]]);
        int n2 = Inventory.getAll(item -> {
            int n2;
            if (h.lIllIIlIIIlIIlI(item.getName().contains(lIIlllIIIIIII[lIIlllIIIIIll[3]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlllIIIIIll[3]];
                stringArray[h.lIIlllIIIIIll[0]] = lIIlllIIIIIII[lIIlllIIIIIll[1]];
                if (h.lIllIIlIIIlIIll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllIIIIIll[3];
                    0;
                    if (2 < (0xE6 ^ 0xA1 ^ (9 ^ 0x4A))) return n2 != 0;
                    return ((195 + 180 - 343 + 219 ^ 26 + 159 - 83 + 59) & (7 ^ 0x19 ^ (0xFF ^ 0xBB) ^ -1)) != 0;
                }
            }
            n2 = lIIlllIIIIIll[0];
            return n2 != 0;
        }).size();
        this.ak = n2 * lIIlllIIIIIll[1];
        return lIIlllIIIIIll[3];
    }

    @Inject
    protected h(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
        this.ak = lIIlllIIIIIll[0];
    }

    private static boolean lIllIIlIIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIlIIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIIIlIlIl(Object object) {
        return object != null;
    }
}

