/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Prayer pot", priority=110)
public class H
extends w {
    private static /* synthetic */ int[] lIlIllIIIIIll;
    private static /* synthetic */ String[] lIlIllIIIIIlI;

    static {
        H.llIIIIIIIIIlIII();
        H.llIIIIIIIIIIlll();
    }

    private static boolean llIIIIIIIIIlIlI(Object object) {
        return object != null;
    }

    private static boolean llIIIIIIIIIllII(int n2) {
        return n2 == 0;
    }

    @Inject
    protected H(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    private static void llIIIIIIIIIlIII() {
        lIlIllIIIIIll = new int[7];
        H.lIlIllIIIIIll[0] = 0x73 ^ 0x67;
        H.lIlIllIIIIIll[1] = (0xAB ^ 0x9E ^ (0x63 ^ 0x48)) & (22 + 86 - -8 + 48 ^ 12 + 134 - -28 + 12 ^ -" ".length());
        H.lIlIllIIIIIll[2] = " ".length();
        H.lIlIllIIIIIll[3] = 0xFFFFB7DD & 0x4DEB;
        H.lIlIllIIIIIll[4] = "  ".length();
        H.lIlIllIIIIIll[5] = "   ".length();
        H.lIlIllIIIIIll[6] = 0x1D ^ 0x15;
    }

    private static boolean llIIIIIIIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        if (H.llIIIIIIIIIlIIl(this.cf.getBoostedSkillLevel(Skill.PRAYER), lIlIllIIIIIll[0])) {
            return lIlIllIIIIIll[1];
        }
        int[] nArray = new int[lIlIllIIIIIll[2]];
        nArray[H.lIlIllIIIIIll[1]] = lIlIllIIIIIll[3];
        if (H.llIIIIIIIIIlIlI(Projectiles.getNearest((int[])nArray))) {
            return lIlIllIIIIIll[1];
        }
        Item llllllllllllllIllIlIIllllIlllIIl = Inventory.getFirst(item -> {
            int n2;
            if (!H.llIIIIIIIIIllII(item.getName().toLowerCase().contains(lIlIllIIIIIlI[lIlIllIIIIIll[2]]) ? 1 : 0) || H.llIIIIIIIIIllIl(item.getName().toLowerCase().contains(lIlIllIIIIIlI[lIlIllIIIIIll[4]]) ? 1 : 0)) {
                n2 = lIlIllIIIIIll[2];
                "".length();
                if (null != null) {
                    return ((0x2B ^ 8) & ~(0x77 ^ 0x54)) != 0;
                }
            } else {
                n2 = lIlIllIIIIIll[1];
            }
            return n2 != 0;
        });
        if (H.llIIIIIIIIIlIll(llllllllllllllIllIlIIllllIlllIIl)) {
            return lIlIllIIIIIll[1];
        }
        var1_1.interact(lIlIllIIIIIlI[lIlIllIIIIIll[1]]);
        this.cg.a(this.cf.getTickCount());
        return lIlIllIIIIIll[2];
    }

    private static boolean llIIIIIIIIIllIl(int n2) {
        return n2 != 0;
    }

    private static void llIIIIIIIIIIlll() {
        lIlIllIIIIIlI = new String[lIlIllIIIIIll[5]];
        H.lIlIllIIIIIlI[H.lIlIllIIIIIll[1]] = H.llIIIIIIIIIIlIl("oulGCdUAjac=", "eQeXm");
        H.lIlIllIIIIIlI[H.lIlIllIIIIIll[2]] = H.llIIIIIIIIIIllI("k7fdLfsaHhM=", "wqiyU");
        H.lIlIllIIIIIlI[H.lIlIllIIIIIll[4]] = H.llIIIIIIIIIIlIl("8WsO43IgFLg=", "PeDAs");
    }

    private static String llIIIIIIIIIIllI(String llllllllllllllIllIlIIllllIlIIIlI, String llllllllllllllIllIlIIllllIIlllll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIllllIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIllllIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIllllIlIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIllllIlIIlII.init(lIlIllIIIIIll[4], llllllllllllllIllIlIIllllIlIIlIl);
            return new String(llllllllllllllIllIlIIllllIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIllllIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIllllIlIIIll) {
            llllllllllllllIllIlIIllllIlIIIll.printStackTrace();
            return null;
        }
    }

    private static String llIIIIIIIIIIlIl(String llllllllllllllIllIlIIllllIlIllll, String llllllllllllllIllIlIIllllIlIllII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIllllIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIllllIlIllII.getBytes(StandardCharsets.UTF_8)), lIlIllIIIIIll[6]), "DES");
            Cipher llllllllllllllIllIlIIllllIllIIIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIllllIllIIIl.init(lIlIllIIIIIll[4], llllllllllllllIllIlIIllllIllIIlI);
            return new String(llllllllllllllIllIlIIllllIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIllllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIllllIllIIII) {
            llllllllllllllIllIlIIllllIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIIIIlIll(Object object) {
        return object == null;
    }
}

