/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.az;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Grabbing Pickaxe", priority=100, blocking=true)
public class aA
extends az {
    private static /* synthetic */ String[] llIIIlllIII;
    private static /* synthetic */ int[] llIIIlllIIl;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var2_2;
        int n2 = Vars.getBit((int)llIIIlllIIl[0]);
        if (aA.lIIlllllIlIIIl(n2)) {
            return llIIIlllIIl[1];
        }
        TileObject llllllllllllllllIlIIIIllIIIlIIII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aA.lIIlllllIlIlIl(tileObject.getId(), llIIIlllIIl[9]) && aA.lIIlllllIlIIll(Reachable.isInteractable((Locatable)tileObject) ? 1 : 0)) {
                n2 = llIIIlllIIl[3];
                0;
                if (2 <= 0) {
                    return ((215 + 12 - 73 + 76 ^ 152 + 90 - 105 + 43) & (0xC9 ^ 0xA6 ^ (0xFF ^ 0xC2) ^ -1)) != 0;
                }
            } else {
                n2 = llIIIlllIIl[1];
            }
            return n2 != 0;
        });
        if (aA.lIIlllllIlIIlI(llllllllllllllllIlIIIIllIIIlIIII)) {
            return llIIIlllIIl[1];
        }
        if (aA.lIIlllllIlIIll(Inventory.isFull() ? 1 : 0)) {
            int llllllllllllllllIlIIIIllIIIIllll = llIIIlllIIl[1];
            List llllllllllllllllIlIIIIllIIIIlllI = Inventory.getAll(item -> {
                int n2;
                if (aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[7]]::equals) ? 1 : 0) && aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[8]]::equals) ? 1 : 0)) {
                    n2 = llIIIlllIIl[3];
                    0;
                    if (-(0x13 ^ 0x17) >= 0) {
                        return ((0x36 ^ 0x2E) & ~(0x8D ^ 0x95)) != 0;
                    }
                } else {
                    n2 = llIIIlllIIl[1];
                }
                return n2 != 0;
            });
            if (aA.lIIlllllIlIIIl(llllllllllllllllIlIIIIllIIIIlllI.isEmpty() ? 1 : 0)) {
                int llllllllllllllllIlIIIIllIIIIllIl = llIIIlllIIl[1];
                while (aA.lIIlllllIlIlII(llllllllllllllllIlIIIIllIIIIllIl, Math.min(llIIIlllIIl[2], llllllllllllllllIlIIIIllIIIIlllI.size() - llIIIlllIIl[3]))) {
                    ((Item)llllllllllllllllIlIIIIllIIIIlllI.get(llllllllllllllllIlIIIIllIIIIllIl)).interact(llIIIlllIII[llIIIlllIIl[1]]);
                    llllllllllllllllIlIIIIllIIIIllll = llIIIlllIIl[3];
                    Object[] objectArray = new Object[llIIIlllIIl[3]];
                    objectArray[aA.llIIIlllIIl[1]] = ((Item)llllllllllllllllIlIIIIllIIIIlllI.get(llllllllllllllllIlIIIIllIIIIllIl)).getName();
                    Log.info((String)llIIIlllIII[llIIIlllIIl[3]], (Object[])objectArray);
                    ++llllllllllllllllIlIIIIllIIIIllIl;
                    0;
                    if (null == null) continue;
                    return (1 & (1 ^ -1)) != 0;
                }
            }
            if (aA.lIIlllllIlIIll(llllllllllllllllIlIIIIllIIIIllll)) {
                return llIIIlllIIl[3];
            }
            List llllllllllllllllIlIIIIllIIIIllIl = Inventory.getAll(item -> {
                int n2;
                if (aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[5]]::equals) ? 1 : 0) && aA.lIIlllllIlIIll(item.hasAction(llIIIlllIII[llIIIlllIIl[6]]::equals) ? 1 : 0)) {
                    n2 = llIIIlllIIl[3];
                    0;
                    if (2 < 0) {
                        return ((51 + 18 - -45 + 13 ^ (0xA7 ^ 0xC1)) & (0x43 ^ 0x54 ^ (0x3A ^ 0x34) ^ -1)) != 0;
                    }
                } else {
                    n2 = llIIIlllIIl[1];
                }
                return n2 != 0;
            });
            if (aA.lIIlllllIlIIIl(llllllllllllllllIlIIIIllIIIIllIl.isEmpty() ? 1 : 0)) {
                int llllllllllllllllIlIIIIllIIIIllII = llIIIlllIIl[1];
                while (aA.lIIlllllIlIlII(llllllllllllllllIlIIIIllIIIIllII, Math.min(llIIIlllIIl[2], llllllllllllllllIlIIIIllIIIIllIl.size() - llIIIlllIIl[3]))) {
                    ((Item)llllllllllllllllIlIIIIllIIIIllIl.get(llllllllllllllllIlIIIIllIIIIllII)).interact(llIIIlllIII[llIIIlllIIl[4]]);
                    ++llllllllllllllllIlIIIIllIIIIllII;
                    0;
                    if (2 != 1) continue;
                    return ((2 + 45 - 32 + 141 ^ 158 + 121 - 255 + 152) & (21 + 50 - -21 + 79 ^ 17 + 122 - 17 + 13 ^ -1)) != 0;
                }
                return llIIIlllIIl[3];
            }
        }
        var2_2.interact(llIIIlllIII[llIIIlllIIl[2]]);
        return llIIIlllIIl[3];
    }

    private static boolean lIIlllllIlIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIlllllIIlllI(String llllllllllllllllIlIIIIlIlllllIll, String llllllllllllllllIlIIIIlIllllIlIl) {
        llllllllllllllllIlIIIIlIlllllIll = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIlllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIIlIlllllIIl = new StringBuilder();
        char[] llllllllllllllllIlIIIIlIlllllIII = llllllllllllllllIlIIIIlIllllIlIl.toCharArray();
        int llllllllllllllllIlIIIIlIllllIlll = llIIIlllIIl[1];
        char[] llllllllllllllllIlIIIIlIllllIIIl = llllllllllllllllIlIIIIlIlllllIll.toCharArray();
        int llllllllllllllllIlIIIIlIllllIIII = llllllllllllllllIlIIIIlIllllIIIl.length;
        int llllllllllllllllIlIIIIlIlllIllll = llIIIlllIIl[1];
        while (aA.lIIlllllIlIlII(llllllllllllllllIlIIIIlIlllIllll, llllllllllllllllIlIIIIlIllllIIII)) {
            char llllllllllllllllIlIIIIlIllllllII = llllllllllllllllIlIIIIlIllllIIIl[llllllllllllllllIlIIIIlIlllIllll];
            llllllllllllllllIlIIIIlIlllllIIl.append((char)(llllllllllllllllIlIIIIlIllllllII ^ llllllllllllllllIlIIIIlIlllllIII[llllllllllllllllIlIIIIlIllllIlll % llllllllllllllllIlIIIIlIlllllIII.length]));
            0;
            ++llllllllllllllllIlIIIIlIllllIlll;
            ++llllllllllllllllIlIIIIlIlllIllll;
            0;
            if ((0xEF ^ 0xB8 ^ (0xF4 ^ 0xA7)) == (0x25 ^ 0x18 ^ (0xBC ^ 0x85))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIIIlIlllllIIl);
    }

    private static boolean lIIlllllIlIIlI(Object object) {
        return object == null;
    }

    private static void lIIlllllIIllll() {
        llIIIlllIII = new String[llIIIlllIIl[10]];
        aA.llIIIlllIII[aA.llIIIlllIIl[1]] = aA."Drop";
        aA.llIIIlllIII[aA.llIIIlllIIl[3]] = aA."Dropped food {}";
        aA.llIIIlllIII[aA.llIIIlllIIl[4]] = aA."Drop";
        aA.llIIIlllIII[aA.llIIIlllIIl[2]] = aA."Take-pickaxe";
        aA.llIIIlllIII[aA.llIIIlllIIl[5]] = aA."Empty";
        aA.llIIIlllIII[aA.llIIIlllIIl[6]] = aA."Drop";
        aA.llIIIlllIII[aA.llIIIlllIIl[7]] = aA."Eat";
        aA.llIIIlllIII[aA.llIIIlllIIl[8]] = aA."Drop";
    }

    private static String lIIlllllIIllII(String llllllllllllllllIlIIIIlIllIllIIl, String llllllllllllllllIlIIIIlIllIlIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIlIllIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIlIllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIIlIllIllIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIIlIllIllIll.init(llIIIlllIIl[4], llllllllllllllllIlIIIIlIllIlllII);
            return new String(llllllllllllllllIlIIIIlIllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIIlIllIllIlI) {
            llllllllllllllllIlIIIIlIllIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIlllllIIllIl(String llllllllllllllllIlIIIIlIlllIIlII, String llllllllllllllllIlIIIIlIlllIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIIIlIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIlIlllIIlIl.getBytes(StandardCharsets.UTF_8)), llIIIlllIIl[10]), "DES");
            Cipher llllllllllllllllIlIIIIlIlllIlIII = Cipher.getInstance("DES");
            llllllllllllllllIlIIIIlIlllIlIII.init(llIIIlllIIl[4], llllllllllllllllIlIIIIlIlllIlIIl);
            return new String(llllllllllllllllIlIIIIlIlllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIlIlllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIIlIlllIIlll) {
            llllllllllllllllIlIIIIlIlllIIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIlllllIlIIII() {
        llIIIlllIIl = new int[11];
        aA.llIIIlllIIl[0] = -(0xFFFFADD5 & 0x53BE) & (0xFFFFB9FB & Short.MAX_VALUE);
        aA.llIIIlllIIl[1] = (121 + 103 - 174 + 148 ^ 93 + 60 - 12 + 18) & (0x22 ^ 0x13 ^ (5 ^ 0x6D) ^ -1);
        aA.llIIIlllIIl[2] = 3;
        aA.llIIIlllIIl[3] = 1;
        aA.llIIIlllIIl[4] = 2;
        aA.llIIIlllIIl[5] = 81 + 12 - 56 + 125 ^ 135 + 97 - 117 + 51;
        aA.llIIIlllIIl[6] = 145 + 120 - 209 + 126 ^ 120 + 133 - 206 + 132;
        aA.llIIIlllIIl[7] = 0x4F ^ 0x65 ^ (0x41 ^ 0x6D);
        aA.llIIIlllIIl[8] = 0x91 ^ 0x96;
        aA.llIIIlllIIl[9] = -(0xFFFFDE22 & 0x6DDF) & (0xFFFFFFDF & 0xFDBD);
        aA.llIIIlllIIl[10] = 0xA4 ^ 0x94 ^ (0xB8 ^ 0x80);
    }

    private static boolean lIIlllllIlIIll(int n2) {
        return n2 != 0;
    }

    @Inject
    protected aA(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    static {
        aA.lIIlllllIlIIII();
        aA.lIIlllllIIllll();
    }

    private static boolean lIIlllllIlIlIl(int n2, int n3) {
        return n2 == n3;
    }
}

