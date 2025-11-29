package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
@Singleton
@TaskDesc(name = "Attacking final warden", priority = 40)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bL  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bL.class */
public class bL extends bM {
    private final /* synthetic */ C gL;
    private static /* synthetic */ String[] llIllIIllll;
    private static /* synthetic */ int[] llIllIlIIII;
    private /* synthetic */ boolean gM;
    private final /* synthetic */ C0076y gK;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v24, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v37, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v37, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        boolean z;
        int i;
        int[] iArr = new int[llIllIlIIII[1]];
        iArr[llIllIlIIII[0]] = llIllIlIIII[2];
        iArr[llIllIlIIII[3]] = llIllIlIIII[4];
        NPC nearest = NPCs.getNearest(iArr);
        if (lIlIlIIllIIlII(nearest)) {
            return llIllIlIIII[0];
        }
        if (lIlIlIIllIIlIl(cq() ? 1 : 0)) {
            if (lIlIlIIllIIllI(this.gM ? 1 : 0)) {
                this.gM = llIllIlIIII[3];
                this.gK.h(llIllIlIIII[0]);
            }
            if (lIlIlIIllIIllI(this.gL.as() ? 1 : 0)) {
                return llIllIlIIII[0];
            }
        }
        boolean isInMeleeDistance = nearest.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation());
        if (!lIlIlIIllIIlIl(cq() ? 1 : 0) || lIlIlIIllIIlIl(isInMeleeDistance ? 1 : 0)) {
            ?? r0 = llIllIlIIII[3];
            "".length();
            z = r0;
            if (" ".length() == 0) {
                return ((125 ^ 108) ^ (71 ^ 18)) & (((4 ^ 28) ^ (8 ^ 84)) ^ (-" ".length()));
            }
        } else {
            z = llIllIlIIII[0];
        }
        a(nearest, z);
        "".length();
        nearest.interact(llIllIIllll[llIllIlIIII[0]]);
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (lIlIlIIllIIlIl(cq() ? 1 : 0)) {
            i = llIllIlIIII[3];
            "".length();
            if (((178 ^ 162) & ((139 ^ 155) ^ (-1))) == "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if (lIlIlIIllIIlll(fromSlot) && lIlIlIIllIIlIl(Q(fromSlot) ? 1 : 0)) {
            i = llIllIlIIII[5];
            "".length();
            if ((-"  ".length()) >= 0) {
                return ((218 ^ 174) ^ (217 ^ 167)) & (((112 ^ 19) ^ (8 ^ 97)) ^ (-" ".length()));
            }
        } else {
            i = llIllIlIIII[6];
        }
        sleep(i);
        return llIllIlIIII[3];
    }

    private static void lIlIlIIllIIIlI() {
        llIllIIllll = new String[llIllIlIIII[5]];
        llIllIIllll[llIllIlIIII[0]] = lIlIlIIllIIIII("2j9rY2aoYn8=", "Yntwp");
        llIllIIllll[llIllIlIIII[3]] = lIlIlIIllIIIIl("3pqEb3vahlM=", "hHlFG");
        llIllIIllll[llIllIlIIII[1]] = lIlIlIIllIIIIl("SO2a/Ku+Gog3vPWWjtn9dw==", "GIYfF");
        llIllIIllll[llIllIlIIII[6]] = lIlIlIIllIIIII("IqiLCCMUZKA=", "LHyLN");
    }

    private static String lIlIlIIllIIIII(String llllllllllllllllIIlIllIlllIIIllI, String llllllllllllllllIIlIllIlllIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIlllIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlllIIIlIl.getBytes(StandardCharsets.UTF_8)), llIllIlIIII[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllIlIIII[1], llllllllllllllllIIlIllIlllIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllIlllIIIlll) {
            llllllllllllllllIIlIllIlllIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIIllIIlIl(int i) {
        return i != 0;
    }

    private static boolean lIlIlIIllIIlII(Object obj) {
        return obj == null;
    }

    static {
        lIlIlIIllIIIll();
        lIlIlIIllIIIlI();
    }

    private static boolean lIlIlIIllIIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean Q(Item item) {
        String lowerCase = item.getName().toLowerCase();
        if (lIlIlIIllIIllI(lowerCase.contains(llIllIIllll[llIllIlIIII[3]]) ? 1 : 0) && lIlIlIIllIIllI(lowerCase.contains(llIllIIllll[llIllIlIIII[1]]) ? 1 : 0) && !lIlIlIIllIIlIl(lowerCase.contains(llIllIIllll[llIllIlIIII[6]]) ? 1 : 0)) {
            return llIllIlIIII[0];
        }
        ?? r0 = llIllIlIIII[3];
        "".length();
        return (-" ".length()) >= "  ".length() ? ((40 ^ 66) ^ (30 ^ 41)) & (((101 ^ 37) ^ (112 ^ 109)) ^ (-" ".length())) : r0;
    }

    private static void lIlIlIIllIIIll() {
        llIllIlIIII = new int[9];
        llIllIlIIII[0] = ((59 ^ 39) ^ (170 ^ 131)) & (((179 ^ 146) ^ (20 ^ 0)) ^ (-" ".length()));
        llIllIlIIII[1] = "  ".length();
        llIllIlIIII[2] = (-16389) & 28149;
        llIllIlIIII[3] = " ".length();
        llIllIlIIII[4] = (-16385) & 28146;
        llIllIlIIII[5] = 92 ^ 88;
        llIllIlIIII[6] = "   ".length();
        llIllIlIIII[7] = 149 ^ 167;
        llIllIlIIII[8] = (142 ^ 174) ^ (143 ^ 167);
    }

    private static boolean lIlIlIIllIIlll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.gM = llIllIlIIII[0];
    }

    private static String lIlIlIIllIIIIl(String llllllllllllllllIIlIllIlllIlIIll, String llllllllllllllllIIlIllIlllIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIllIlllIlIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIllIlllIlIlIl.init(llIllIlIIII[1], secretKeySpec);
            return new String(llllllllllllllllIIlIllIlllIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllIlllIlIlII) {
            llllllllllllllllIIlIllIlllIlIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected bL(Client client, C0077z c0077z, TOAConfig tOAConfig, C0076y c0076y, C c) {
        super(client, c0077z, tOAConfig);
        this.gM = llIllIlIIII[0];
        this.gK = c0076y;
        this.gL = c;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public int bt() {
        if (lIlIlIIllIIlIl(cq() ? 1 : 0)) {
            int i = llIllIlIIII[7];
            "".length();
            return 0 != 0 ? ((((62 + 126) - 187) + 153) ^ (((143 + 65) - 68) + 33)) & (((107 ^ 54) ^ (122 ^ 16)) ^ (-" ".length())) : i;
        }
        return llIllIlIIII[3];
    }
}
