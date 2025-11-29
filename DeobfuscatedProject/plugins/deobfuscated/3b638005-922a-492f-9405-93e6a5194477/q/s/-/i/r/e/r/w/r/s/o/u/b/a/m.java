/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package q.s.-.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;

@TaskDesc(name="Restoring prayer", priority=133337)
public class m
extends Task {
    private static /* synthetic */ String[] llllIIIIIIl;
    private final /* synthetic */ SquireBarrows Q;
    private static /* synthetic */ int[] llllIIIIIlI;

    private static boolean lIllIIlIllllll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (m.lIllIIlIlllIlI(this.Q.h() ? 1 : 0)) {
            return llllIIIIIlI[0];
        }
        if (m.lIllIIlIlllIll(Prayers.getPoints())) {
            return llllIIIIIlI[0];
        }
        Item llllllllllllllllIIIllllIllIIIIll = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIIIIIlI[2]];
            stringArray[m.llllIIIIIlI[0]] = llllIIIIIIl[llllIIIIIlI[2]];
            if (m.lIllIIlIlllllI(item.hasAction(stringArray) ? 1 : 0) && (!m.lIllIIlIlllIlI(item.getName().toLowerCase().contains(llllIIIIIIl[llllIIIIIlI[3]]) ? 1 : 0) || m.lIllIIlIlllllI(item.getName().toLowerCase().contains(llllIIIIIIl[llllIIIIIlI[4]]) ? 1 : 0))) {
                n2 = llllIIIIIlI[2];
                0;
                if (((0xEC ^ 0xC4) & ~(0x3D ^ 0x15)) > 2) {
                    return ((0x9E ^ 0x8A) & ~(0x1A ^ 0xE)) != 0;
                }
            } else {
                n2 = llllIIIIIlI[0];
            }
            return n2 != 0;
        });
        if (m.lIllIIlIllllII(llllllllllllllllIIIllllIllIIIIll)) {
            return llllIIIIIlI[0];
        }
        NPC llllllllllllllllIIIllllIllIIIIlI = NPCs.getNearest(d::a);
        if (!m.lIllIIlIllllIl(llllllllllllllllIIIllllIllIIIIlI) || m.lIllIIlIlllllI(llllllllllllllllIIIllllIllIIIIlI.isDead() ? 1 : 0)) {
            return llllIIIIIlI[0];
        }
        var1_1.interact(llllIIIIIIl[llllIIIIIlI[0]]);
        this.sleep(llllIIIIIlI[1]);
        return llllIIIIIlI[2];
    }

    private static String lIllIIlIllIlIl(String llllllllllllllllIIIllllIlIllIllI, String llllllllllllllllIIIllllIlIllIlll) {
        try {
            SecretKeySpec llllllllllllllllIIIllllIlIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllllIlIllIlll.getBytes(StandardCharsets.UTF_8)), llllIIIIIlI[5]), "DES");
            Cipher llllllllllllllllIIIllllIlIlllIlI = Cipher.getInstance("DES");
            llllllllllllllllIIIllllIlIlllIlI.init(llllIIIIIlI[3], llllllllllllllllIIIllllIlIlllIll);
            return new String(llllllllllllllllIIIllllIlIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllllIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllllIlIlllIIl) {
            llllllllllllllllIIIllllIlIlllIIl.printStackTrace();
            return null;
        }
    }

    static {
        m.lIllIIlIlllIIl();
        m.lIllIIlIllIlll();
    }

    private static void lIllIIlIlllIIl() {
        llllIIIIIlI = new int[6];
        m.llllIIIIIlI[0] = (0xD2 ^ 0xC4) & ~(0xA0 ^ 0xB6);
        m.llllIIIIIlI[1] = 102 + 4 - 33 + 60 ^ 105 + 116 - 184 + 92;
        m.llllIIIIIlI[2] = 1;
        m.llllIIIIIlI[3] = 2;
        m.llllIIIIIlI[4] = 3;
        m.llllIIIIIlI[5] = 0x9A ^ 0x92;
    }

    private static boolean lIllIIlIlllIll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIlIlllllI(int n2) {
        return n2 != 0;
    }

    @Inject
    public m(SquireBarrows squireBarrows) {
        this.Q = squireBarrows;
    }

    private static String lIllIIlIllIIll(String llllllllllllllllIIIllllIlIIlIllI, String llllllllllllllllIIIllllIlIIlIlIl) {
        llllllllllllllllIIIllllIlIIlIllI = new String(Base64.getDecoder().decode(llllllllllllllllIIIllllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllllIlIIllIIl = new StringBuilder();
        char[] llllllllllllllllIIIllllIlIIllIII = llllllllllllllllIIIllllIlIIlIlIl.toCharArray();
        int llllllllllllllllIIIllllIlIIlIlll = llllIIIIIlI[0];
        char[] llllllllllllllllIIIllllIlIIlIIIl = llllllllllllllllIIIllllIlIIlIllI.toCharArray();
        int llllllllllllllllIIIllllIlIIlIIII = llllllllllllllllIIIllllIlIIlIIIl.length;
        int llllllllllllllllIIIllllIlIIIllll = llllIIIIIlI[0];
        while (m.lIllIIlIllllll(llllllllllllllllIIIllllIlIIIllll, llllllllllllllllIIIllllIlIIlIIII)) {
            char llllllllllllllllIIIllllIlIIlllII = llllllllllllllllIIIllllIlIIlIIIl[llllllllllllllllIIIllllIlIIIllll];
            llllllllllllllllIIIllllIlIIllIIl.append((char)(llllllllllllllllIIIllllIlIIlllII ^ llllllllllllllllIIIllllIlIIllIII[llllllllllllllllIIIllllIlIIlIlll % llllllllllllllllIIIllllIlIIllIII.length]));
            0;
            ++llllllllllllllllIIIllllIlIIlIlll;
            ++llllllllllllllllIIIllllIlIIIllll;
            0;
            if (((1 ^ (0x51 ^ 0x48)) & (0xEE ^ 0xBE ^ (6 ^ 0x4E) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIllllIlIIllIIl);
    }

    private static String lIllIIlIllIlII(String llllllllllllllllIIIllllIlIlIlIIl, String llllllllllllllllIIIllllIlIlIlIII) {
        try {
            SecretKeySpec llllllllllllllllIIIllllIlIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllllIlIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllllIlIlIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllllIlIlIllIl.init(llllIIIIIlI[3], llllllllllllllllIIIllllIlIlIlllI);
            return new String(llllllllllllllllIIIllllIlIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllllIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllllIlIlIllII) {
            llllllllllllllllIIIllllIlIlIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIllllIl(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIllllII(Object object) {
        return object == null;
    }

    private static void lIllIIlIllIlll() {
        llllIIIIIIl = new String[llllIIIIIlI[1]];
        m.llllIIIIIIl[m.llllIIIIIlI[0]] = m."Drink";
        m.llllIIIIIIl[m.llllIIIIIlI[2]] = m."Drink";
        m.llllIIIIIIl[m.llllIIIIIlI[3]] = m."prayer";
        m.llllIIIIIIl[m.llllIIIIIlI[4]] = m."restore";
    }

    private static boolean lIllIIlIlllIlI(int n2) {
        return n2 == 0;
    }
}

