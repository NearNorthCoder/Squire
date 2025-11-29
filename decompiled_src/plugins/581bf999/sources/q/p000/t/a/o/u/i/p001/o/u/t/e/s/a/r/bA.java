package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Attacking core", priority = 50, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bA  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bA.class */
public class bA extends bG {
    private /* synthetic */ int fV;
    private static final /* synthetic */ int fS;
    private /* synthetic */ boolean fW;
    private static final /* synthetic */ int fT;
    private static final /* synthetic */ int fP;
    private /* synthetic */ int fU;
    private static /* synthetic */ int[] lIlllIllIlI;
    private static /* synthetic */ String[] lIlllIllIIl;
    private static final /* synthetic */ int fO;
    private static final /* synthetic */ int fR;
    private static final /* synthetic */ int fQ;

    private static void lIIllIIlllIIlI() {
        lIlllIllIIl = new String[lIlllIllIlI[22]];
        lIlllIllIIl[lIlllIllIlI[0]] = lIIllIIllIlllI("Ii0fLTQ=", "uDzAP");
        lIlllIllIIl[lIlllIllIlI[6]] = lIIllIIllIlllI("MiMQOg8=", "vQyTd");
        lIlllIllIIl[lIlllIllIlI[4]] = lIIllIIllIlllI("Fy0eBQg9", "VYjdk");
        lIlllIllIIl[lIlllIllIlI[16]] = lIIllIIllIlllI("FjsdKUolJgAmDzYgBiAPdScfLR07MQs=", "UToLj");
        lIlllIllIIl[lIlllIllIlI[17]] = lIIllIIllIllll("0PUbl4fI3Ls=", "CbGVm");
        lIlllIllIIl[lIlllIllIlI[19]] = lIIllIIlllIIIl("rkzr3MKVIpE=", "Bocnt");
        lIlllIllIIl[lIlllIllIlI[20]] = lIIllIIllIlllI("AjAaCC8o", "CDniL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v45, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v48, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        boolean z;
        NPC co = co();
        if (lIIllIIlllIlIl(co)) {
            return lIlllIllIlI[0];
        }
        if (!lIIllIIlllIllI(co.getAnimation(), lIlllIllIlI[1]) || lIIllIIlllIlll(co.getAnimation(), lIlllIllIlI[2])) {
            this.fU = lIlllIllIlI[3];
            return lIlllIllIlI[0];
        }
        int[] iArr = new int[lIlllIllIlI[4]];
        iArr[lIlllIllIlI[0]] = lIlllIllIlI[5];
        iArr[lIlllIllIlI[6]] = lIlllIllIlI[7];
        Item first = Inventory.getFirst(iArr);
        int[] iArr2 = new int[lIlllIllIlI[4]];
        iArr2[lIlllIllIlI[0]] = lIlllIllIlI[5];
        iArr2[lIlllIllIlI[6]] = lIlllIllIlI[7];
        boolean contains = Equipment.contains(iArr2);
        if ((lIIllIIlllIlIl(first) && !lIIllIIllllIII(contains ? 1 : 0)) || !lIIllIIllllIIl(this.cu.getTickCount() - this.fU, lIlllIllIlI[8] + ((this.fV - lIlllIllIlI[6]) * lIlllIllIlI[9]))) {
            if (lIIllIIllllIlI(this.cW.overlyDraining() ? 1 : 0)) {
                ?? r1 = lIlllIllIlI[6];
                "".length();
                z = r1;
                if (0 != 0) {
                    return ((((102 + 150) - 150) + 58) ^ (((81 + 130) - 144) + 71)) & (((108 ^ 26) ^ (76 ^ 16)) ^ (-" ".length()));
                }
            } else {
                z = lIlllIllIlI[0];
            }
            e(z);
        } else if (lIIllIIllllIlI(contains ? 1 : 0)) {
            first.interact(lIlllIllIIl[lIlllIllIlI[0]]);
            "".length();
            if (" ".length() < " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        if (lIIllIIllllIlI(aZ() ? 1 : 0) && lIIllIIllllIIl(aY(), lIlllIllIlI[10]) && lIIllIIllllIlI(this.cW.overlyDraining() ? 1 : 0)) {
            int[] iArr3 = new int[lIlllIllIlI[4]];
            iArr3[lIlllIllIlI[0]] = lIlllIllIlI[11];
            iArr3[lIlllIllIlI[6]] = lIlllIllIlI[12];
            Item first2 = Inventory.getFirst(iArr3);
            if (lIIllIIllllIll(first2)) {
                first2.interact(lIlllIllIIl[lIlllIllIlI[6]]);
            }
        }
        int[] iArr4 = new int[lIlllIllIlI[6]];
        iArr4[lIlllIllIlI[0]] = lIlllIllIlI[13];
        NPC nearest = NPCs.getNearest(iArr4);
        if (lIIllIIlllIlIl(nearest)) {
            return lIlllIllIlI[6];
        }
        this.aY.a(lIlllIllIlI[14]);
        nearest.interact(lIlllIllIIl[lIlllIllIlI[4]]);
        return lIlllIllIlI[6];
    }

    private static boolean lIIllIIllllIlI(int i) {
        return i == 0;
    }

    private static void lIIllIIlllIlII() {
        lIlllIllIlI = new int[23];
        lIlllIllIlI[0] = (77 ^ 30) & ((202 ^ 153) ^ (-1)) & (((190 ^ 157) & ((172 ^ 143) ^ (-1))) ^ (-1));
        lIlllIllIlI[1] = (-((-9667) & 26615)) & (-6145) & 32764;
        lIlllIllIlI[2] = (-((-16595) & 23251)) & (-16449) & 32766;
        lIlllIllIlI[3] = -" ".length();
        lIlllIllIlI[4] = "  ".length();
        lIlllIllIlI[5] = (-((-1777) & 22258)) & (-481) & 32765;
        lIlllIllIlI[6] = " ".length();
        lIlllIllIlI[7] = (-4101) & 24470;
        lIlllIllIlI[8] = (47 ^ 126) ^ (195 ^ 129);
        lIlllIllIlI[9] = (((137 + 24) - 33) + 58) ^ (((173 + 126) - 251) + 130);
        lIlllIllIlI[10] = (-((-8562) & 14835)) & (-24581) & 31703;
        lIlllIllIlI[11] = (-((-31917) & 32191)) & (-4097) & 31711;
        lIlllIllIlI[12] = (-4117) & 31455;
        lIlllIllIlI[13] = (-((-5275) & 22175)) & (-1) & 28671;
        lIlllIllIlI[14] = 182 ^ 185;
        lIlllIllIlI[15] = (-16953) & 19192;
        lIlllIllIlI[16] = "   ".length();
        lIlllIllIlI[17] = (41 ^ 88) ^ (0 ^ 117);
        lIlllIllIlI[18] = (143 ^ 166) ^ (96 ^ 67);
        lIlllIllIlI[19] = (((40 + 156) - 137) + 117) ^ (((73 + 11) - 6) + 103);
        lIlllIllIlI[20] = (((83 + 10) - 25) + 128) ^ (((48 + 19) - (-111)) + 16);
        lIlllIllIlI[21] = (-4665) & 14334;
        lIlllIllIlI[22] = 167 ^ 160;
    }

    private static String lIIllIIllIllll(String llllllllllllllllIlIIllIIIlIIIlll, String llllllllllllllllIlIIllIIIlIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIllIIIlIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIllIIIlIIlIIl.init(lIlllIllIlI[4], secretKeySpec);
            return new String(llllllllllllllllIlIIllIIIlIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIllIIIlIIlIII) {
            llllllllllllllllIlIIllIIIlIIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlllIllI(int i, int i2) {
        return i != i2;
    }

    private static String lIIllIIllIlllI(String llllllllllllllllIlIIllIIIIlIlIlI, String llllllllllllllllIlIIllIIIIlIlIIl) {
        String llllllllllllllllIlIIllIIIIlIlIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIIllIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIllIIIIlIlIII = new StringBuilder();
        char[] llllllllllllllllIlIIllIIIIlIIlll = llllllllllllllllIlIIllIIIIlIlIIl.toCharArray();
        int llllllllllllllllIlIIllIIIIlIIllI = lIlllIllIlI[0];
        char[] charArray = llllllllllllllllIlIIllIIIIlIlIlI2.toCharArray();
        int length = charArray.length;
        int i = lIlllIllIlI[0];
        while (lIIllIIlllllII(i, length)) {
            llllllllllllllllIlIIllIIIIlIlIII.append((char) (charArray[i] ^ llllllllllllllllIlIIllIIIIlIIlll[llllllllllllllllIlIIllIIIIlIIllI % llllllllllllllllIlIIllIIIIlIIlll.length]));
            "".length();
            llllllllllllllllIlIIllIIIIlIIllI++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIllIIIIlIlIII);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.specialCore();
    }

    @Inject
    protected bA(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.normalCore();
    }

    private static String lIIllIIlllIIIl(String llllllllllllllllIlIIllIIIIlllIlI, String llllllllllllllllIlIIllIIIIllIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIllIIIIllIlll.getBytes(StandardCharsets.UTF_8)), lIlllIllIlI[9]), "DES");
            Cipher llllllllllllllllIlIIllIIIIllllII = Cipher.getInstance("DES");
            llllllllllllllllIlIIllIIIIllllII.init(lIlllIllIlI[4], secretKeySpec);
            return new String(llllllllllllllllIlIIllIIIIllllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIllIIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIllIIIIllIllI) {
            llllllllllllllllIlIIllIIIIllIllI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (lIIllIIlllIlll(projectileSpawned.getProjectile().getId(), lIlllIllIlI[15])) {
            Log.info(lIlllIllIIl[lIlllIllIlI[16]]);
            this.fV += lIlllIllIlI[6];
            this.fU = this.cu.getTickCount();
        }
    }

    private static boolean lIIllIIllllIIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public void r() {
        this.fU = lIlllIllIlI[0];
        this.fW = lIlllIllIlI[0];
        this.fV = lIlllIllIlI[0];
    }

    private static boolean lIIllIIlllllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllIIlllIlIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bG, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bk() {
        String[] strArr = new String[lIlllIllIlI[6]];
        strArr[lIlllIllIlI[0]] = lIlllIllIIl[lIlllIllIlI[17]];
        if (lIIllIIlllIlIl(NPCs.getNearest(strArr)) && lIIllIIllllIll(NPCs.getNearest(npc -> {
            if (lIIllIIllllIII(npc.getName().contains(lIlllIllIIl[lIlllIllIlI[19]]) ? 1 : 0)) {
                String[] strArr2 = new String[lIlllIllIlI[6]];
                strArr2[lIlllIllIlI[0]] = lIlllIllIIl[lIlllIllIlI[20]];
                if (lIIllIIllllIII(npc.hasAction(strArr2) ? 1 : 0)) {
                    ?? r0 = lIlllIllIlI[6];
                    "".length();
                    return ((157 ^ 134) & ((29 ^ 6) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIlllIllIlI[0];
        })) && !lIIllIIlllllII(this.cu.getTickCount() - this.fU, lIlllIllIlI[18])) {
            return lIlllIllIlI[0];
        }
        ?? r0 = lIlllIllIlI[6];
        "".length();
        return (((((184 + 110) - 191) + 85) ^ (((49 + 68) - 91) + 158)) & (((54 ^ 16) ^ (98 ^ 64)) ^ (-" ".length()))) != 0 ? ((94 ^ 86) ^ (94 ^ 71)) & (((104 ^ 64) ^ (170 ^ 147)) ^ (-" ".length())) : r0;
    }

    private static boolean lIIllIIllllIll(Object obj) {
        return obj != null;
    }

    private static boolean lIIllIIlllIlll(int i, int i2) {
        return i == i2;
    }

    static {
        lIIllIIlllIlII();
        lIIllIIlllIIlI();
        fO = lIlllIllIlI[13];
        fT = lIlllIllIlI[10];
        fR = lIlllIllIlI[1];
        fS = lIlllIllIlI[2];
        fQ = lIlllIllIlI[21];
        fP = lIlllIllIlI[15];
    }

    private static boolean lIIllIIllllIII(int i) {
        return i != 0;
    }
}
