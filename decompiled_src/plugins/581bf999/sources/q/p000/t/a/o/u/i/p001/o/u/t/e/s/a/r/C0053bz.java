package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Sun Keris (OBELISK)", priority = 2500, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bz  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bz.class */
public class C0053bz extends AbstractC0052by {
    private static /* synthetic */ int[] llIllIllIII;
    private static final /* synthetic */ int fM;
    private static /* synthetic */ String[] llIllIlIlll;
    private static final /* synthetic */ int fN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        int i;
        int i2;
        if (lIlIlIlIIIlIll(cl() ? 1 : 0)) {
            this.aY.c(llIllIllIII[0]);
            return llIllIllIII[0];
        } else if (lIlIlIlIIIllII(Prayers.getPoints(), llIllIllIII[1])) {
            Item first = Inventory.getFirst(item -> {
                if (lIlIlIlIIIlIll(EnumC0056e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) && lIlIlIlIIIlIll(item.getName().contains(llIllIlIlll[llIllIllIII[19]]) ? 1 : 0) && lIlIlIlIIIlIll(item.getName().contains(llIllIlIlll[llIllIllIII[17]]) ? 1 : 0) && !lIlIlIlIIIlllI(item.getName().contains(llIllIlIlll[llIllIllIII[20]]) ? 1 : 0)) {
                    return llIllIllIII[0];
                }
                ?? r0 = llIllIllIII[2];
                "".length();
                return "  ".length() > "  ".length() ? ((61 ^ 17) ^ (1 ^ 24)) & (((238 ^ 196) ^ (4 ^ 27)) ^ (-" ".length())) : r0;
            });
            if (lIlIlIlIIIllIl(first)) {
                return llIllIllIII[0];
            }
            first.interact(llIllIlIlll[llIllIllIII[0]]);
            return llIllIllIII[2];
        } else {
            if (lIlIlIlIIIlIll(aZ() ? 1 : 0) && lIlIlIlIIIlllI(aq() ? 1 : 0) && lIlIlIlIIIllll(aY(), llIllIllIII[2])) {
                int[] iArr = new int[llIllIllIII[3]];
                iArr[llIllIllIII[0]] = llIllIllIII[4];
                iArr[llIllIllIII[2]] = llIllIllIII[5];
                Item first2 = Inventory.getFirst(iArr);
                if (lIlIlIlIIlIIII(first2)) {
                    first2.interact(llIllIlIlll[llIllIllIII[2]]);
                }
            }
            if (!lIlIlIlIIIlIll(ck() ? 1 : 0) && !lIlIlIlIIIllll(Combat.getCurrentHealth(), cj())) {
                int varp = Vars.getVarp(llIllIllIII[6]);
                if (lIlIlIlIIIlllI(aZ() ? 1 : 0)) {
                    i = llIllIllIII[7];
                    "".length();
                    if ((((9 ^ 26) ^ (68 ^ 14)) & (((36 ^ 53) ^ (252 ^ 180)) ^ (-" ".length()))) != 0) {
                        return ((((104 + 62) - 73) + 107) ^ (((92 + 93) - 159) + 108)) & (((39 ^ 96) ^ (202 ^ 195)) ^ (-" ".length()));
                    }
                } else {
                    i = llIllIllIII[8];
                }
                int i3 = i;
                if (lIlIlIlIIIlllI(this.cW.overlyDraining() ? 1 : 0)) {
                    if (lIlIlIlIIIlllI(aZ() ? 1 : 0)) {
                        i2 = llIllIllIII[9];
                        "".length();
                        if ((((169 ^ 177) ^ (16 ^ 104)) & (((28 ^ 63) ^ (23 ^ 84)) ^ (-" ".length()))) >= (((142 ^ 166) & ((111 ^ 71) ^ (-1))) ^ (113 ^ 117))) {
                            return ((((8 + 154) - (-10)) + 23) ^ (((60 + 25) - (-13)) + 50)) & (((((37 + 177) - 171) + 208) ^ (((5 + 112) - 93) + 148)) ^ (-" ".length()));
                        }
                    } else {
                        i2 = llIllIllIII[10];
                    }
                    i3 = i2;
                }
                if (lIlIlIlIIIllII(varp, i3)) {
                    this.aY.c();
                    return llIllIllIII[0];
                }
                this.aY.c(llIllIllIII[2]);
                Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
                if (!lIlIlIlIIlIIII(fromSlot) || lIlIlIlIIlIIIl(fromSlot.getId(), llIllIllIII[11])) {
                    int[] iArr2 = new int[llIllIllIII[2]];
                    iArr2[llIllIllIII[0]] = llIllIllIII[11];
                    Item first3 = Inventory.getFirst(iArr2);
                    if (lIlIlIlIIIllIl(first3)) {
                        return llIllIllIII[0];
                    }
                    first3.interact(llIllIlIlll[llIllIllIII[3]]);
                }
                Combat.toggleSpec();
                this.aY.c(llIllIllIII[0]);
                return llIllIllIII[0];
            }
            return llIllIllIII[0];
        }
    }

    private static void lIlIlIlIIIlIlI() {
        llIllIllIII = new int[22];
        llIllIllIII[0] = (96 ^ 60) & ((75 ^ 23) ^ (-1));
        llIllIllIII[1] = 104 ^ 91;
        llIllIllIII[2] = " ".length();
        llIllIllIII[3] = "  ".length();
        llIllIllIII[4] = (-((-10821) & 16247)) & (-1) & 32767;
        llIllIllIII[5] = (-(230 ^ 199)) & (-277) & 27647;
        llIllIllIII[6] = (-19474) & 19773;
        llIllIllIII[7] = (-23689) & 24063;
        llIllIllIII[8] = (-((-22678) & 22935)) & (-14353) & 15359;
        llIllIllIII[9] = (-15883) & 16382;
        llIllIllIII[10] = (-30723) & 31722;
        llIllIllIII[11] = (-97) & 27387;
        llIllIllIII[12] = (-((-26805) & 32758)) & (-16385) & 24575;
        llIllIllIII[13] = (-((-12701) & 30623)) & (-12609) & 32767;
        llIllIllIII[14] = 45 ^ 51;
        llIllIllIII[15] = (126 ^ 89) ^ (171 ^ 161);
        llIllIllIII[16] = 194 ^ 132;
        llIllIllIII[17] = 13 ^ 8;
        llIllIllIII[18] = "   ".length();
        llIllIllIII[19] = 120 ^ 124;
        llIllIllIII[20] = 171 ^ 173;
        llIllIllIII[21] = 190 ^ 185;
    }

    private static boolean lIlIlIlIIIllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    private boolean ck() {
        int[] iArr = new int[llIllIllIII[3]];
        iArr[llIllIllIII[0]] = llIllIllIII[12];
        iArr[llIllIllIII[2]] = llIllIllIII[13];
        Projectile projectile = (Projectile) Projectiles.getAll(iArr).stream().filter(projectile2 -> {
            if (!lIlIlIlIIlIIIl(projectile2.getId(), llIllIllIII[12]) || lIlIlIlIIlIIlI(projectile2.getId(), llIllIllIII[13])) {
                ?? r0 = llIllIllIII[2];
                "".length();
                return ((30 ^ 59) & ((87 ^ 114) ^ (-1))) >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIllIllIII[0];
        }).min(Comparator.comparingInt((v0) -> {
            return v0.getRemainingCycles();
        })).orElse(null);
        if (lIlIlIlIIlIIII(projectile) && lIlIlIlIIIllII(projectile.getRemainingCycles(), llIllIllIII[16]) && lIlIlIlIIIllll(projectile.getRemainingCycles(), llIllIllIII[17])) {
            String str = llIllIlIlll[llIllIllIII[18]];
            Object[] objArr = new Object[llIllIllIII[3]];
            objArr[llIllIllIII[0]] = Integer.valueOf(projectile.getId());
            objArr[llIllIllIII[2]] = Integer.valueOf(projectile.getRemainingCycles());
            Log.info(str, objArr);
            return llIllIllIII[2];
        }
        return llIllIllIII[0];
    }

    private static boolean lIlIlIlIIlIIIl(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIlIlIIIllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIlIIIlllI(int i) {
        return i != 0;
    }

    private static String lIlIlIlIIIIlll(String llllllllllllllllIIlIllIIlIlIllII, String llllllllllllllllIIlIllIIlIlIlIll) {
        String llllllllllllllllIIlIllIIlIlIllII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIllIIlIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIllIIlIlIlIlI = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIllIIlIlIlIll.toCharArray();
        int llllllllllllllllIIlIllIIlIlIlIII = llIllIllIII[0];
        char[] charArray2 = llllllllllllllllIIlIllIIlIlIllII2.toCharArray();
        int length = charArray2.length;
        int i = llIllIllIII[0];
        while (lIlIlIlIIIllII(i, length)) {
            char llllllllllllllllIIlIllIIlIlIllIl = charArray2[i];
            llllllllllllllllIIlIllIIlIlIlIlI.append((char) (llllllllllllllllIIlIllIIlIlIllIl ^ charArray[llllllllllllllllIIlIllIIlIlIlIII % charArray.length]));
            "".length();
            llllllllllllllllIIlIllIIlIlIlIII++;
            i++;
            "".length();
            if ("  ".length() == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlIllIIlIlIlIlI);
    }

    private int cj() {
        int[] iArr = new int[llIllIllIII[3]];
        iArr[llIllIllIII[0]] = llIllIllIII[12];
        iArr[llIllIllIII[2]] = llIllIllIII[13];
        Projectile nearest = Projectiles.getNearest(iArr);
        return lIlIlIlIIIllIl(nearest) ? llIllIllIII[2] : lIlIlIlIIlIIlI(nearest.getId(), llIllIllIII[13]) ? llIllIllIII[14] : llIllIllIII[15];
    }

    private static boolean lIlIlIlIIlIIII(Object obj) {
        return obj != null;
    }

    private static String lIlIlIlIIIlIII(String llllllllllllllllIIlIllIIlIllllII, String llllllllllllllllIIlIllIIlIlllIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIllIIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIIlIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIllIIlIlllllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIllIIlIlllllI.init(llIllIllIII[3], llllllllllllllllIIlIllIIlIllllll);
            return new String(llllllllllllllllIIlIllIIlIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllIIlIllllIl) {
            llllllllllllllllIIlIllIIlIllllIl.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIlIIIlIlI();
        lIlIlIlIIIlIIl();
        fM = llIllIllIII[12];
        fN = llIllIllIII[13];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private boolean cl() {
        int[] iArr = new int[llIllIllIII[2]];
        iArr[llIllIllIII[0]] = llIllIllIII[11];
        if (lIlIlIlIIIlIll(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIllIllIII[2]];
            iArr2[llIllIllIII[0]] = llIllIllIII[11];
            if (!lIlIlIlIIIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return llIllIllIII[0];
            }
        }
        ?? r0 = llIllIllIII[2];
        "".length();
        return (-" ".length()) > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) & (((true ^ true) & ((true ^ true) ^ true)) ^ true) : r0;
    }

    @Inject
    protected C0053bz(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIlIlIlIIIllll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIlIlIlIIIlIll(int i) {
        return i == 0;
    }

    private static boolean lIlIlIlIIlIIlI(int i, int i2) {
        return i == i2;
    }

    private static void lIlIlIlIIIlIIl() {
        llIllIlIlll = new String[llIllIllIII[21]];
        llIllIlIlll[llIllIllIII[0]] = lIlIlIlIIIIlll("KgMhACQ=", "nqHnO");
        llIllIlIlll[llIllIllIII[2]] = lIlIlIlIIIlIII("3d+hoM0s/RE=", "gcYfW");
        llIllIlIlll[llIllIllIII[3]] = lIlIlIlIIIlIII("xwaxFDCj/O8=", "IUEke");
        llIllIlIlll[llIllIllIII[18]] = lIlIlIlIIIIlll("GiU4HhotbSMCFSJtMgoCaSM4HExpNipLDTRtLBY=", "IMWkv");
        llIllIlIlll[llIllIllIII[19]] = lIlIlIlIIIIlll("Ax0xLg0DHQ==", "qxBZb");
        llIllIlIlll[llIllIllIII[17]] = lIlIlIlIIIlIII("nrELI/AkAuI=", "zOSCV");
        llIllIlIlll[llIllIllIII[20]] = lIlIlIlIIIlIII("PmkcvKxnGI0=", "MXfsr");
    }
}
