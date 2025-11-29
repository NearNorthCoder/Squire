/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

@TaskDesc(name="Using sun keris special", priority=1500)
public class an
extends Z {
    @Inject
    protected /* synthetic */ TOAConfig d;
    private final /* synthetic */ C cT;
    private static /* synthetic */ String[] llIIIIIIlIl;
    private static /* synthetic */ int[] llIIIIIlIII;
    private final /* synthetic */ SquireAutoTOA cS;

    private static void lIIlllIIIlllll() {
        llIIIIIIlIl = new String[llIIIIIlIII[7]];
        an.llIIIIIIlIl[an.llIIIIIlIII[0]] = an."Obelisk";
    }

    private static boolean lIIlllIIlIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        an.lIIlllIIlIIlII();
        an.lIIlllIIIlllll();
    }

    private static boolean lIIlllIIlIlIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlllIIlIIlIl(Object object) {
        return object != null;
    }

    private static boolean lIIlllIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIlIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlllIIlIllII(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    protected an(Client client, SquireAutoTOA squireAutoTOA, C c2) {
        super(client);
        this.cS = squireAutoTOA;
        this.cT = c2;
    }

    private static boolean lIIlllIIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlllIIlIlIll(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlllIIlIIlII() {
        llIIIIIlIII = new int[9];
        an.llIIIIIlIII[0] = (0xA1 ^ 0x94) & ~(0x65 ^ 0x50);
        an.llIIIIIlIII[1] = -(0xFFFFC655 & 0x7BAF) & (0xFFFFEFEF & 0x7FFD);
        an.llIIIIIlIII[2] = 0x6D ^ 9;
        an.llIIIIIlIII[3] = 0xE3 ^ 0xC0;
        an.llIIIIIlIII[4] = -(0xFFFF9D7D & 0x72C7) & (0xFFFFFFEF & 0x3DFE);
        an.llIIIIIlIII[5] = 0x1E ^ 0x30;
        an.llIIIIIlIII[6] = 0x55 ^ 0x4E;
        an.llIIIIIlIII[7] = 1;
        an.llIIIIIlIII[8] = 2;
    }

    private static String lIIlllIIIllllI(String llllllllllllllllIlIIIllllIlIIIll, String llllllllllllllllIlIIIllllIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIIIllllIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIllllIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIIllllIlIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIIllllIlIIlIl.init(llIIIIIlIII[8], llllllllllllllllIlIIIllllIlIIllI);
            return new String(llllllllllllllllIlIIIllllIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIllllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIIllllIlIIlII) {
            llllllllllllllllIlIIIllllIlIIlII.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        an llllllllllllllllIlIIIllllIlIllII;
        NPC nPC = this.cS.b();
        if (an.lIIlllIIlIIlIl(nPC) && an.lIIlllIIlIIllI(nPC.getName().contains(llIIIIIIlIl[llIIIIIlIII[0]]) ? 1 : 0) && an.lIIlllIIlIIllI(this.d.dehydration() ? 1 : 0)) {
            return llIIIIIlIII[0];
        }
        if (an.lIIlllIIlIIllI(llllllllllllllllIlIIIllllIlIllII.aq() ? 1 : 0) && an.lIIlllIIlIIlll(llllllllllllllllIlIIIllllIlIllII.be() ? 1 : 0)) {
            if (an.lIIlllIIlIlIII(llllllllllllllllIlIIIllllIlIllII.aX(), llIIIIIlIII[1]) && an.lIIlllIIlIlIIl(Combat.getSpecEnergy(), llIIIIIlIII[2]) && an.lIIlllIIlIlIlI(Combat.getCurrentHealth(), llIIIIIlIII[3])) {
                return llIIIIIlIII[0];
            }
            if (an.lIIlllIIlIlIll(llllllllllllllllIlIIIllllIlIllII.aX(), llIIIIIlIII[4])) {
                return llIIIIIlIII[0];
            }
            if (an.lIIlllIIlIllII(llllllllllllllllIlIIIllllIlIllII.aX(), llIIIIIlIII[4]) && an.lIIlllIIlIIllI(Inventory.contains(item -> e.AMBROSIA.d(item.getId())) ? 1 : 0)) {
                return llIIIIIlIII[0];
            }
            llllllllllllllllIlIIIllllIlIllII.cS.a(llIIIIIlIII[5]);
        }
        if (an.lIIlllIIlIIllI(llllllllllllllllIlIIIllllIlIllII.be() ? 1 : 0)) {
            llllllllllllllllIlIIIllllIlIllII.cS.a(llIIIIIlIII[6]);
        }
        if (an.lIIlllIIlIlIlI(Combat.getCurrentHealth(), llllllllllllllllIlIIIllllIlIllII.cS.f())) {
            llllllllllllllllIlIIIllllIlIllII.cS.c();
            return llIIIIIlIII[0];
        }
        return this.ba();
    }
}

