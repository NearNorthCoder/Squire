package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
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
@TaskDesc(name = "Prayer pot", priority = 110)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.H  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/H.class */
public class H extends w {
    private static /* synthetic */ int[] lIlIllIIIIIll;
    private static /* synthetic */ String[] lIlIllIIIIIlI;

    static {
        llIIIIIIIIIlIII();
        llIIIIIIIIIIlll();
    }

    private static boolean llIIIIIIIIIlIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIIIIIIllII(int i2) {
        return i2 == 0;
    }

    @Inject
    protected H(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private static void llIIIIIIIIIlIII() {
        lIlIllIIIIIll = new int[7];
        lIlIllIIIIIll[0] = 115 ^ 103;
        lIlIllIIIIIll[1] = ((171 ^ 158) ^ (99 ^ 72)) & (((((22 + 86) - (-8)) + 48) ^ (((12 + 134) - (-28)) + 12)) ^ (-" ".length()));
        lIlIllIIIIIll[2] = " ".length();
        lIlIllIIIIIll[3] = (-18467) & 19947;
        lIlIllIIIIIll[4] = "  ".length();
        lIlIllIIIIIll[5] = "   ".length();
        lIlIllIIIIIll[6] = 29 ^ 21;
    }

    private static boolean llIIIIIIIIIlIIl(int i2, int i3) {
        return i2 > i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        if (llIIIIIIIIIlIIl(this.cf.getBoostedSkillLevel(Skill.PRAYER), lIlIllIIIIIll[0])) {
            return lIlIllIIIIIll[1];
        }
        int[] iArr = new int[lIlIllIIIIIll[2]];
        iArr[lIlIllIIIIIll[1]] = lIlIllIIIIIll[3];
        if (llIIIIIIIIIlIlI(Projectiles.getNearest(iArr))) {
            return lIlIllIIIIIll[1];
        }
        Item first = Inventory.getFirst(item -> {
            if (!llIIIIIIIIIllII(item.getName().toLowerCase().contains(lIlIllIIIIIlI[lIlIllIIIIIll[2]]) ? 1 : 0) || llIIIIIIIIIllIl(item.getName().toLowerCase().contains(lIlIllIIIIIlI[lIlIllIIIIIll[4]]) ? 1 : 0)) {
                ?? r0 = lIlIllIIIIIll[2];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIIIIIll[1];
        });
        if (llIIIIIIIIIlIll(first)) {
            return lIlIllIIIIIll[1];
        }
        first.interact(lIlIllIIIIIlI[lIlIllIIIIIll[1]]);
        this.cg.a(this.cf.getTickCount());
        return lIlIllIIIIIll[2];
    }

    private static boolean llIIIIIIIIIllIl(int i2) {
        return i2 != 0;
    }

    private static void llIIIIIIIIIIlll() {
        lIlIllIIIIIlI = new String[lIlIllIIIIIll[5]];
        lIlIllIIIIIlI[lIlIllIIIIIll[1]] = llIIIIIIIIIIlIl("oulGCdUAjac=", "eQeXm");
        lIlIllIIIIIlI[lIlIllIIIIIll[2]] = llIIIIIIIIIIllI("k7fdLfsaHhM=", "wqiyU");
        lIlIllIIIIIlI[lIlIllIIIIIll[4]] = llIIIIIIIIIIlIl("8WsO43IgFLg=", "PeDAs");
    }

    private static String llIIIIIIIIIIllI(String llllllllllllllIllIlIIllllIlIIIlI, String llllllllllllllIllIlIIllllIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIllllIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIllllIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIllllIlIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIllllIlIIlII.init(lIlIllIIIIIll[4], llllllllllllllIllIlIIllllIlIIlIl);
            return new String(llllllllllllllIllIlIIllllIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIllllIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIllllIlIIIll) {
            llllllllllllllIllIlIIllllIlIIIll.printStackTrace();
            return null;
        }
    }

    private static String llIIIIIIIIIIlIl(String llllllllllllllIllIlIIllllIlIllll, String llllllllllllllIllIlIIllllIlIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIllllIlIlllI.getBytes(StandardCharsets.UTF_8)), lIlIllIIIIIll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIIIIIll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIllllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIllllIllIIII) {
            llllllllllllllIllIlIIllllIllIIII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIIIIIlIll(Object obj) {
        return obj == null;
    }
}
