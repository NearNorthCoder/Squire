package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
@TaskDesc(name = "Attacking p1 warden", priority = 10)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bF  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bF.class */
public class bF extends bG {
    private static /* synthetic */ int[] llIlllIIIlI;
    private static /* synthetic */ String[] llIllIllIIl;

    @Inject
    protected bF(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIlIlIlIllllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIlIlIlIlllIlI(Object obj) {
        return obj == null;
    }

    private static String lIlIlIlIIlIlII(String llllllllllllllllIIlIlIllIllIlIII, String llllllllllllllllIIlIlIllIllIIlll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIllIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIllIllIIlll.getBytes(StandardCharsets.UTF_8)), llIlllIIIlI[9]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlllIIIlI[3], llllllllllllllllIIlIlIllIllIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIllIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIllIllIlIIl) {
            llllllllllllllllIIlIlIllIllIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlIIlIlIl() {
        llIllIllIIl = new String[llIlllIIIlI[8]];
        llIllIllIIl[llIlllIIIlI[0]] = lIlIlIlIIlIIll("LR2LVg2zY9A=", "RSSdr");
        llIllIllIIl[llIlllIIIlI[1]] = lIlIlIlIIlIIll("tSC8vXIvdbE=", "kHfpg");
        llIllIllIIl[llIlllIIIlI[3]] = lIlIlIlIIlIlII("cysRlSUCWSziqAsSz/VqC4KJaKwD1asm", "cxbqf");
    }

    private static boolean lIlIlIlIlllIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        NPC co = co();
        if (lIlIlIlIlllIlI(co)) {
            return llIlllIIIlI[0];
        }
        String[] strArr = new String[llIlllIIIlI[1]];
        strArr[llIlllIIIlI[0]] = llIllIllIIl[llIlllIIIlI[0]];
        if (lIlIlIlIlllIll(co.hasAction(strArr) ? 1 : 0)) {
            return llIlllIIIlI[0];
        }
        bp();
        this.aY.a(llIlllIIIlI[2]);
        co.interact(llIllIllIIl[llIlllIIIlI[1]]);
        return llIlllIIIlI[1];
    }

    private static String lIlIlIlIIlIIll(String llllllllllllllllIIlIlIllIlIllIll, String llllllllllllllllIIlIlIllIlIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIllIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIllIlIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIllIlIlllIl.init(llIlllIIIlI[3], secretKeySpec);
            return new String(llllllllllllllllIIlIlIllIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIllIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIllIlIlllII) {
            llllllllllllllllIIlIlIllIlIlllII.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIlIlllIIl();
        lIlIlIlIIlIlIl();
    }

    private static boolean lIlIlIlIllllII(int i, int i2) {
        return i != i2;
    }

    private static void lIlIlIlIlllIIl() {
        llIlllIIIlI = new int[10];
        llIlllIIIlI[0] = (178 ^ 130) & ((119 ^ 71) ^ (-1));
        llIlllIIIlI[1] = " ".length();
        llIlllIIIlI[2] = 61 ^ 33;
        llIlllIIIlI[3] = "  ".length();
        llIlllIIIlI[4] = (-((-11041) & 15155)) & (-16385) & 32255;
        llIlllIIIlI[5] = (-21014) & 32767;
        llIlllIIIlI[6] = (-16387) & 28142;
        llIlllIIIlI[7] = (-((-19617) & 24225)) & (-7) & 16367;
        llIlllIIIlI[8] = "   ".length();
        llIlllIIIlI[9] = (((147 + 82) - 100) + 36) ^ (((15 + 38) - (-17)) + 103);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        String[] strArr = new String[llIlllIIIlI[1]];
        strArr[llIlllIIIlI[0]] = llIllIllIIl[llIlllIIIlI[3]];
        NPC nearest = NPCs.getNearest(strArr);
        if (lIlIlIlIlllIlI(nearest)) {
            return this.cW.mageP2Warden();
        }
        int id = nearest.getId();
        return (!lIlIlIlIllllII(id, llIlllIIIlI[4]) || lIlIlIlIllllIl(id, llIlllIIIlI[5])) ? this.cW.rangedP2Warden() : (!lIlIlIlIllllII(id, llIlllIIIlI[6]) || lIlIlIlIllllIl(id, llIlllIIIlI[7])) ? this.cW.mageP2Warden() : this.cW.mageP2Warden();
    }
}
