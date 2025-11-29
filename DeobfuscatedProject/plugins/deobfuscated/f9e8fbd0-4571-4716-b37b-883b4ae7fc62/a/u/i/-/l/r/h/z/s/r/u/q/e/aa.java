/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad;
import a.u.i.-.l.r.h.z.s.r.u.q.e.h;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Panic tping", priority=0x7FFFFFFF, blocking=true)
public class aa
extends ad {
    private static /* synthetic */ int[] lIllIllIlIlll;
    private static /* synthetic */ String[] lIllIllIlIIll;

    private static boolean llIIlIIlIIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void llIIlIIlIIlIIlI() {
        lIllIllIlIIll = new String[lIllIllIlIlll[3]];
        aa.lIllIllIlIIll[aa.lIllIllIlIlll[0]] = aa."Equip";
        aa.lIllIllIlIIll[aa.lIllIllIlIlll[2]] = aa."Wear";
        aa.lIllIllIlIIll[aa.lIllIllIlIlll[1]] = aa."Eat";
    }

    private static boolean llIIlIIlIIlIlll(int n2) {
        return n2 > 0;
    }

    @Inject
    protected aa(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    private static String llIIlIIlIIIllII(String llllllllllllllIllIIIlIlIIIllIlIl, String llllllllllllllIllIIIlIlIIIllIlII) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIlIIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIlIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIlIIIllIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIlIIIllIlll.init(lIllIllIlIlll[1], llllllllllllllIllIIIlIlIIIlllIII);
            return new String(llllllllllllllIllIIIlIlIIIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIlIIIllIllI) {
            llllllllllllllIllIIIlIlIIIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIIllIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean ac() {
        aa llllllllllllllIllIIIlIlIIlIIIIlI;
        if (aa.llIIlIIlIIlIllI(this.aB.isInInstancedRegion() ? 1 : 0)) {
            return lIllIllIlIlll[0];
        }
        int llllllllllllllIllIIIlIlIIlIIIIIl = Inventory.getCount(item -> item.hasAction(lIllIllIlIIll[lIllIllIlIlll[1]]::equals));
        if (aa.llIIlIIlIIlIlll(llllllllllllllIllIIIlIlIIlIIIIIl)) {
            return lIllIllIlIlll[0];
        }
        if (aa.llIIlIIlIIllIII(Combat.getCurrentHealth(), llllllllllllllIllIIIlIlIIlIIIIlI.aA.eatAtHP())) {
            return lIllIllIlIlll[0];
        }
        h[] llllllllllllllIllIIIlIlIIlIIIIII = h.values();
        int llllllllllllllIllIIIlIlIIIllllll = llllllllllllllIllIIIlIlIIlIIIIII.length;
        int llllllllllllllIllIIIlIlIIIlllllI = lIllIllIlIlll[0];
        while (aa.llIIlIIlIIllIIl(llllllllllllllIllIIIlIlIIIlllllI, llllllllllllllIllIIIlIlIIIllllll)) {
            h llllllllllllllIllIIIlIlIIIllllIl = llllllllllllllIllIIIlIlIIlIIIIII[llllllllllllllIllIIIlIlIIIlllllI];
            if (aa.llIIlIIlIIlIllI(Inventory.contains((int[])llllllllllllllIllIIIlIlIIIllllIl.u()) ? 1 : 0) && aa.llIIlIIlIIlIllI(Equipment.contains((int[])llllllllllllllIllIIIlIlIIIllllIl.u()) ? 1 : 0)) {
                0;
                if (null != null) {
                    return ((0x83 ^ 0x9F) & ~(0x55 ^ 0x49)) != 0;
                }
            } else if (aa.llIIlIIlIIllIlI(llllllllllllllIllIIIlIlIIIllllIl.t() ? 1 : 0)) {
                if (aa.llIIlIIlIIllIlI(Inventory.contains((int[])llllllllllllllIllIIIlIlIIIllllIl.u()) ? 1 : 0)) {
                    String[] stringArray = new String[lIllIllIlIlll[1]];
                    stringArray[aa.lIllIllIlIlll[0]] = lIllIllIlIIll[lIllIllIlIlll[0]];
                    stringArray[aa.lIllIllIlIlll[2]] = lIllIllIlIIll[lIllIllIlIlll[2]];
                    Inventory.getFirst((int[])llllllllllllllIllIIIlIlIIIllllIl.u()).interact(stringArray);
                }
                if (aa.llIIlIIlIIllIlI(Equipment.contains((int[])llllllllllllllIllIIIlIlIIIllllIl.u()) ? 1 : 0)) {
                    Equipment.getFirst((int[])llllllllllllllIllIIIlIlIIIllllIl.u()).interact(llllllllllllllIllIIIlIlIIIllllIl.s());
                    0;
                    if (1 >= 0) break;
                    return ((0x71 ^ 0x5E) & ~(0x14 ^ 0x3B)) != 0;
                }
            } else if (aa.llIIlIIlIIllIlI(Inventory.contains((int[])llllllllllllllIllIIIlIlIIIllllIl.u()) ? 1 : 0)) {
                Inventory.getFirst((int[])llllllllllllllIllIIIlIlIIIllllIl.u()).interact(llllllllllllllIllIIIlIlIIIllllIl.s());
                0;
                if (null == null) break;
                return ((25 + 139 - 133 + 160 ^ 74 + 146 - 174 + 124) & (0xEE ^ 0x80 ^ (0x2A ^ 0x51) ^ -1)) != 0;
            }
            ++llllllllllllllIllIIIlIlIIIlllllI;
            0;
            if ((0xB ^ 0xF) >= ((0x19 ^ 0x3A) & ~(0x18 ^ 0x3B))) continue;
            return ((0x5B ^ 0x12) & ~(0x36 ^ 0x7F)) != 0;
        }
        this.E.a(lIllIllIlIlll[2]);
        return lIllIllIlIlll[2];
    }

    private static boolean llIIlIIlIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIlIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        aa.llIIlIIlIIlIlIl();
        aa.llIIlIIlIIlIIlI();
    }

    private static void llIIlIIlIIlIlIl() {
        lIllIllIlIlll = new int[4];
        aa.lIllIllIlIlll[0] = 3 & ~3;
        aa.lIllIllIlIlll[1] = 2;
        aa.lIllIllIlIlll[2] = 1;
        aa.lIllIllIlIlll[3] = 3;
    }

    private static String llIIlIIlIIIlIll(String llllllllllllllIllIIIlIlIIIlIIlIl, String llllllllllllllIllIIIlIlIIIIlllll) {
        llllllllllllllIllIIIlIlIIIlIIlIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIlIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIlIIIlIIIll = new StringBuilder();
        char[] llllllllllllllIllIIIlIlIIIlIIIlI = llllllllllllllIllIIIlIlIIIIlllll.toCharArray();
        int llllllllllllllIllIIIlIlIIIlIIIIl = lIllIllIlIlll[0];
        char[] llllllllllllllIllIIIlIlIIIIllIll = llllllllllllllIllIIIlIlIIIlIIlIl.toCharArray();
        int llllllllllllllIllIIIlIlIIIIllIlI = llllllllllllllIllIIIlIlIIIIllIll.length;
        int llllllllllllllIllIIIlIlIIIIllIIl = lIllIllIlIlll[0];
        while (aa.llIIlIIlIIllIIl(llllllllllllllIllIIIlIlIIIIllIIl, llllllllllllllIllIIIlIlIIIIllIlI)) {
            char llllllllllllllIllIIIlIlIIIlIIllI = llllllllllllllIllIIIlIlIIIIllIll[llllllllllllllIllIIIlIlIIIIllIIl];
            llllllllllllllIllIIIlIlIIIlIIIll.append((char)(llllllllllllllIllIIIlIlIIIlIIllI ^ llllllllllllllIllIIIlIlIIIlIIIlI[llllllllllllllIllIIIlIlIIIlIIIIl % llllllllllllllIllIIIlIlIIIlIIIlI.length]));
            0;
            ++llllllllllllllIllIIIlIlIIIlIIIIl;
            ++llllllllllllllIllIIIlIlIIIIllIIl;
            0;
            if (2 <= (2 ^ 0x34 ^ (0x70 ^ 0x42))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlIlIIIlIIIll);
    }
}

