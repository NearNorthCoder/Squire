/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Dialog
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.Y;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.w;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Leave Raid", priority=0x7FFFFF99, blocking=true)
public class ax
extends Y {
    private static /* synthetic */ String[] lIlIlIIllllI;
    private static /* synthetic */ int[] lIlIlIIlllll;
    private final /* synthetic */ SquireChambersPlugin dw;
    private final /* synthetic */ SquireChambersConfig dx;

    private static void llIlllIlIlllII() {
        lIlIlIIllllI = new String[lIlIlIIlllll[6]];
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[0]] = ax."Leave.";
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[1]] = ax."Leave.";
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[2]] = ax."Cannot find steps?";
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[3]] = ax."Climb";
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[4]] = ax."Steps";
        ax.lIlIlIIllllI[ax.lIlIlIIlllll[5]] = ax."Climb";
    }

    @Inject
    public ax(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.dw = squireChambersPlugin;
        this.dx = squireChambersConfig;
    }

    @Override
    public boolean run() {
        if (ax.llIlllIlIllllI((Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bh(), (Object)w.GET_OUT)) {
            return lIlIlIIlllll[0];
        }
        return this.cg();
    }

    private static void llIlllIlIlllIl() {
        lIlIlIIlllll = new int[8];
        ax.lIlIlIIlllll[0] = (1 ^ 0x59) & ~(8 ^ 0x50);
        ax.lIlIlIIlllll[1] = 1;
        ax.lIlIlIIlllll[2] = 2;
        ax.lIlIlIIlllll[3] = 3;
        ax.lIlIlIIlllll[4] = 0xB ^ 0x7C ^ (0x75 ^ 6);
        ax.lIlIlIIlllll[5] = 1 ^ (0x16 ^ 0x12);
        ax.lIlIlIIlllll[6] = 0x91 ^ 0x97;
        ax.lIlIlIIlllll[7] = 0xD0 ^ 0xB2 ^ (0xE2 ^ 0x88);
    }

    private static boolean llIlllIlIlllll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var1_1;
        if (ax.llIlllIlIlllll(this.dw.G() ? 1 : 0)) {
            return lIlIlIIlllll[0];
        }
        if (ax.llIlllIllIIIII(Dialog.isViewingOptions() ? 1 : 0) && ax.llIlllIllIIIII(Dialog.hasOption((String)lIlIlIIllllI[lIlIlIIlllll[0]]) ? 1 : 0)) {
            String[] stringArray = new String[lIlIlIIlllll[1]];
            stringArray[ax.lIlIlIIlllll[0]] = lIlIlIIllllI[lIlIlIIlllll[1]];
            Dialog.chooseOption((String[])stringArray);
            0;
            return lIlIlIIlllll[1];
        }
        TileObject lllllllllllllllIllIlIIIlIlIIIIIl = TileObjects.getNearest(tileObject -> {
            int n2;
            if (ax.llIlllIllIIIII(tileObject.getName().equals(lIlIlIIllllI[lIlIlIIlllll[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIlllll[1]];
                stringArray[ax.lIlIlIIlllll[0]] = lIlIlIIllllI[lIlIlIIlllll[5]];
                if (ax.llIlllIllIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIlllll[1];
                    0;
                    if ((0xF4 ^ 0x91 ^ (0x57 ^ 0x36)) > 0) return n2 != 0;
                    return ((0x2F ^ 0x22 ^ (0xEF ^ 0xB2)) & (0x43 ^ 0x6F ^ (0x70 ^ 0xC) ^ -1)) != 0;
                }
            }
            n2 = lIlIlIIlllll[0];
            return n2 != 0;
        });
        if (ax.llIlllIllIIIIl(lllllllllllllllIllIlIIIlIlIIIIIl)) {
            System.out.println(lIlIlIIllllI[lIlIlIIlllll[2]]);
            return lIlIlIIlllll[0];
        }
        var1_1.interact(lIlIlIIllllI[lIlIlIIlllll[3]]);
        return lIlIlIIlllll[1];
    }

    private static boolean llIlllIllIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIlllIllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        ax.llIlllIlIlllIl();
        ax.llIlllIlIlllII();
    }

    private static boolean llIlllIlIllllI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean llIlllIllIIIIl(Object object) {
        return object == null;
    }

    private static String llIlllIlIllIlI(String lllllllllllllllIllIlIIIlIIllIlIl, String lllllllllllllllIllIlIIIlIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIlIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIlIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIIIlIIlllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIIIlIIlllIIl.init(lIlIlIIlllll[2], lllllllllllllllIllIlIIIlIIlllIlI);
            return new String(lllllllllllllllIllIlIIIlIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIlIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIIIlIIlllIII) {
            lllllllllllllllIllIlIIIlIIlllIII.printStackTrace();
            return null;
        }
    }

    private static String llIlllIlIllIll(String lllllllllllllllIllIlIIIlIIIlIIII, String lllllllllllllllIllIlIIIlIIIIllll) {
        try {
            SecretKeySpec lllllllllllllllIllIlIIIlIIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIIIlIIIIllll.getBytes(StandardCharsets.UTF_8)), lIlIlIIlllll[7]), "DES");
            Cipher lllllllllllllllIllIlIIIlIIIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIllIlIIIlIIIlIlII.init(lIlIlIIlllll[2], lllllllllllllllIllIlIIIlIIIlIlIl);
            return new String(lllllllllllllllIllIlIIIlIIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIIIlIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIIIlIIIlIIll) {
            lllllllllllllllIllIlIIIlIIIlIIll.printStackTrace();
            return null;
        }
    }

    private static String llIlllIlIllIIl(String lllllllllllllllIllIlIIIlIIlIIlll, String lllllllllllllllIllIlIIIlIIlIIllI) {
        lllllllllllllllIllIlIIIlIIlIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIllIlIIIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIlIIIlIIlIIlIl = new StringBuilder();
        char[] lllllllllllllllIllIlIIIlIIlIIlII = lllllllllllllllIllIlIIIlIIlIIllI.toCharArray();
        int lllllllllllllllIllIlIIIlIIlIIIll = lIlIlIIlllll[0];
        char[] lllllllllllllllIllIlIIIlIIIlllIl = lllllllllllllllIllIlIIIlIIlIIlll.toCharArray();
        int lllllllllllllllIllIlIIIlIIIlllII = lllllllllllllllIllIlIIIlIIIlllIl.length;
        int lllllllllllllllIllIlIIIlIIIllIll = lIlIlIIlllll[0];
        while (ax.llIlllIllIIIlI(lllllllllllllllIllIlIIIlIIIllIll, lllllllllllllllIllIlIIIlIIIlllII)) {
            char lllllllllllllllIllIlIIIlIIlIlIII = lllllllllllllllIllIlIIIlIIIlllIl[lllllllllllllllIllIlIIIlIIIllIll];
            lllllllllllllllIllIlIIIlIIlIIlIl.append((char)(lllllllllllllllIllIlIIIlIIlIlIII ^ lllllllllllllllIllIlIIIlIIlIIlII[lllllllllllllllIllIlIIIlIIlIIIll % lllllllllllllllIllIlIIIlIIlIIlII.length]));
            0;
            ++lllllllllllllllIllIlIIIlIIlIIIll;
            ++lllllllllllllllIllIlIIIlIIIllIll;
            0;
            if (-1 != 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIllIlIIIlIIlIIlIl);
    }
}

