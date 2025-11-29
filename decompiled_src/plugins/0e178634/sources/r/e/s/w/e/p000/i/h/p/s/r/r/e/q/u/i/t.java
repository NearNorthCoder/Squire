package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Teleporting out", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.t  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/t.class */
public class t extends u {
    @Inject
    private /* synthetic */ C0000a f;
    private static final /* synthetic */ int ab;
    private static /* synthetic */ String[] lIlIllIlIIllI;
    private static /* synthetic */ int[] lIlIllIlIlIIl;

    static {
        llIIIIIlIlIIlIl();
        llIIIIIlIIlllll();
        ab = lIlIllIlIlIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    private boolean c(boolean z) {
        int[] iArr = new int[lIlIllIlIlIIl[2]];
        iArr[lIlIllIlIlIIl[1]] = lIlIllIlIlIIl[5];
        Item first = Inventory.getFirst(iArr);
        if (llIIIIIlIlIlIIl(first)) {
            first.interact(lIlIllIlIIllI[lIlIllIlIlIIl[2]]);
            return lIlIllIlIlIIl[2];
        }
        int[] iArr2 = new int[lIlIllIlIlIIl[6]];
        iArr2[lIlIllIlIlIIl[1]] = lIlIllIlIlIIl[7];
        iArr2[lIlIllIlIlIIl[2]] = lIlIllIlIlIIl[8];
        Item first2 = Inventory.getFirst(iArr2);
        if (llIIIIIlIlIlIIl(first2)) {
            first2.interact(lIlIllIlIIllI[lIlIllIlIlIIl[6]]);
            return lIlIllIlIlIIl[2];
        }
        if (llIIIIIlIlIIllI(z ? 1 : 0)) {
            Item first3 = Inventory.getFirst(item -> {
                return item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[3]]);
            });
            if (llIIIIIlIlIlIIl(first3)) {
                if (!llIIIIIlIlIlIII(Dialog.isViewingOptions() ? 1 : 0)) {
                    first3.interact(lIlIllIlIIllI[lIlIllIlIlIIl[9]]);
                    return lIlIllIlIlIIl[2];
                }
                Dialog.chooseOption(lIlIllIlIlIIl[9]);
                "".length();
                return lIlIllIlIlIIl[2];
            }
        }
        Item first4 = Inventory.getFirst(item2 -> {
            String str = lIlIllIlIIllI[lIlIllIlIlIIl[14]];
            if (llIIIIIlIlIIllI(item2.hasAction((v1) -> {
                return r1.equals(v1);
            }) ? 1 : 0)) {
                String str2 = lIlIllIlIIllI[lIlIllIlIlIIl[15]];
            }
            if (llIIIIIlIlIllII(item2.getId(), lIlIllIlIlIIl[16])) {
                ?? r0 = lIlIllIlIlIIl[2];
                "".length();
                return " ".length() >= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIlIlIIl[1];
        });
        if (llIIIIIlIlIlIIl(first4)) {
            String[] strArr = new String[lIlIllIlIlIIl[6]];
            strArr[lIlIllIlIlIIl[1]] = lIlIllIlIIllI[lIlIllIlIlIIl[10]];
            strArr[lIlIllIlIlIIl[2]] = lIlIllIlIIllI[lIlIllIlIlIIl[11]];
            first4.interact(strArr);
            return lIlIllIlIlIIl[2];
        }
        for (Spell spell : SpellBook.getCurrent().getCastableSpells()) {
            String llllllllllllllIllIlIIIllIlIIlIIl = spell.toString().toLowerCase();
            if (llIIIIIlIlIlIII(llllllllllllllIllIlIIIllIlIIlIIl.contains(lIlIllIlIIllI[lIlIllIlIlIIl[12]]) ? 1 : 0) && llIIIIIlIlIIllI(llllllllllllllIllIlIIIllIlIIlIIl.contains(lIlIllIlIIllI[lIlIllIlIlIIl[13]]) ? 1 : 0)) {
                Magic.cast(spell);
                return lIlIllIlIlIIl[2];
            }
            "".length();
            if (((84 ^ 41) ^ (83 ^ 43)) <= 0) {
                return ((((47 + 184) - 70) + 64) ^ (((15 + 126) - 11) + 52)) & (((24 ^ 126) ^ (185 ^ 136)) ^ (-" ".length()));
            }
        }
        return lIlIllIlIlIIl[1];
    }

    private static void llIIIIIlIIlllll() {
        lIlIllIlIIllI = new String[lIlIllIlIlIIl[29]];
        lIlIllIlIIllI[lIlIllIlIlIIl[1]] = llIIIIIlIIllIlI("trUp8QKeKvA=", "jeLZN");
        lIlIllIlIIllI[lIlIllIlIlIIl[2]] = llIIIIIlIIllIll("IQENN0HDK4g=", "dquLA");
        lIlIllIlIIllI[lIlIllIlIlIIl[6]] = llIIIIIlIIllIlI("LXe5+HYbIbV/hn9AF41a3g==", "YylwO");
        lIlIllIlIIllI[lIlIllIlIlIIl[9]] = llIIIIIlIIlllII("CzYB", "YCcWa");
        lIlIllIlIIllI[lIlIllIlIlIIl[10]] = llIIIIIlIIlllII("DTIpFR02JTE=", "YWEpm");
        lIlIllIlIIllI[lIlIllIlIlIIl[11]] = llIIIIIlIIllIll("qAD1+zdfZkI=", "iDybl");
        lIlIllIlIIllI[lIlIllIlIlIIl[12]] = llIIIIIlIIlllII("GzwEMCoAKxw=", "oYhUZ");
        lIlIllIlIIllI[lIlIllIlIlIIl[13]] = llIIIIIlIIllIlI("3HuS9pDtmB4=", "ZYZlI");
        lIlIllIlIIllI[lIlIllIlIlIIl[14]] = llIIIIIlIIllIlI("IuY+vFeDYdISuAJHPStlMQ==", "OfMyA");
        lIlIllIlIIllI[lIlIllIlIlIIl[15]] = llIIIIIlIIlllII("CQQmKSg=", "KvCHC");
        lIlIllIlIIllI[lIlIllIlIlIIl[3]] = llIIIIIlIIllIll("Sl7o/h2kSqk=", "Wnodu");
        lIlIllIlIIllI[lIlIllIlIlIIl[17]] = llIIIIIlIIllIlI("dPB1EX5Te9g=", "RZvqz");
        lIlIllIlIIllI[lIlIllIlIlIIl[18]] = llIIIIIlIIllIlI("UOQWtf639WM=", "eypIB");
        lIlIllIlIIllI[lIlIllIlIlIIl[19]] = llIIIIIlIIlllII("CDU2", "MTBmw");
        lIlIllIlIIllI[lIlIllIlIlIIl[20]] = llIIIIIlIIllIlI("fKuLWJHqhqM=", "ivuef");
        lIlIllIlIIllI[lIlIllIlIlIIl[21]] = llIIIIIlIIlllII("UA==", "ybDWR");
        lIlIllIlIIllI[lIlIllIlIlIIl[22]] = llIIIIIlIIllIlI("Qyt/dsG0rTA=", "aFLzi");
        lIlIllIlIIllI[lIlIllIlIlIIl[23]] = llIIIIIlIIllIll("kVeag73VCwy5EpWWJcj59g==", "NPjAK");
        lIlIllIlIIllI[lIlIllIlIlIIl[24]] = llIIIIIlIIllIlI("vwO0KB7O3GY=", "TYjVf");
        lIlIllIlIIllI[lIlIllIlIlIIl[25]] = llIIIIIlIIlllII("Xw==", "vpmcB");
        lIlIllIlIIllI[lIlIllIlIlIIl[26]] = llIIIIIlIIllIll("7IyZqI7lH6o=", "wrcqx");
        lIlIllIlIIllI[lIlIllIlIlIIl[27]] = llIIIIIlIIllIlI("ItQuqDOpoNE=", "wdWrI");
        lIlIllIlIIllI[lIlIllIlIlIIl[28]] = llIIIIIlIIllIll("4Jap75gV3K4=", "TCyjz");
    }

    private static boolean llIIIIIlIlIlIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.a] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean run() {
        boolean u;
        boolean z;
        if (llIIIIIlIlIIllI(this.p.b(lIlIllIlIlIIl[0]) ? 1 : 0)) {
            return lIlIllIlIlIIl[1];
        }
        int i = lIlIllIlIlIIl[1];
        if (llIIIIIlIlIIlll(this.W.j())) {
            u = t();
            "".length();
            if ((174 ^ 170) < " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            u = u();
        }
        if (llIIIIIlIlIlIII(u ? 1 : 0)) {
            if (llIIIIIlIlIIllI(Inventory.isFull() ? 1 : 0) && llIIIIIlIlIIlll(this.W.j())) {
                TileItem tileItem = (TileItem) TileItems.getAll().stream().max(Comparator.comparingInt(tileItem2 -> {
                    return tileItem2.getQuantity() * Prices.getItemPrice(tileItem2.getId());
                })).orElse(null);
                if (llIIIIIlIlIlIIl(tileItem)) {
                    tileItem.interact(lIlIllIlIIllI[lIlIllIlIlIIl[1]]);
                    return lIlIllIlIlIIl[2];
                }
            }
            if (llIIIIIlIlIlIIl(this.W.j())) {
                ?? r1 = lIlIllIlIlIIl[2];
                "".length();
                z = r1;
                if (0 != 0) {
                    return ((252 ^ 149) ^ (58 ^ 72)) & (((202 ^ 175) ^ (204 ^ 178)) ^ (-" ".length()));
                }
            } else {
                z = lIlIllIlIlIIl[1];
            }
            if (llIIIIIlIlIlIII(c(z) ? 1 : 0)) {
                this.f.a(lIlIllIlIlIIl[2]);
            }
            return lIlIllIlIlIIl[2];
        }
        return lIlIllIlIlIIl[1];
    }

    private static String llIIIIIlIIlllII(String llllllllllllllIllIlIIIllIIlllIII, String llllllllllllllIllIlIIIllIIllIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIllIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIllIIllIllI = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIIIllIIllIlll.toCharArray();
        int llllllllllllllIllIlIIIllIIllIlII = lIlIllIlIlIIl[1];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllIllIlIIIllIIlIllIl = charArray2.length;
        int i = lIlIllIlIlIIl[1];
        while (llIIIIIlIlIlIlI(i, llllllllllllllIllIlIIIllIIlIllIl)) {
            char llllllllllllllIllIlIIIllIIlllIIl = charArray2[i];
            llllllllllllllIllIlIIIllIIllIllI.append((char) (llllllllllllllIllIlIIIllIIlllIIl ^ charArray[llllllllllllllIllIlIIIllIIllIlII % charArray.length]));
            "".length();
            llllllllllllllIllIlIIIllIIllIlII++;
            i++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIIIllIIllIllI);
    }

    private static String llIIIIIlIIllIlI(String llllllllllllllIllIlIIIllIIIlIllI, String llllllllllllllIllIlIIIllIIIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIllIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIllIIIlIlIl.getBytes(StandardCharsets.UTF_8)), lIlIllIlIlIIl[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIlIlIIl[6], llllllllllllllIllIlIIIllIIIllIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIllIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIllIIIlIlll) {
            llllllllllllllIllIlIIIllIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIlIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIIlIlIIlll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean t() {
        int i = lIlIllIlIlIIl[1];
        if (llIIIIIlIlIlIlI(Inventory.getAll(item -> {
            if (!llIIIIIlIlIIllI(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[27]]) ? 1 : 0) || llIIIIIlIlIlIII(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[28]]) ? 1 : 0)) {
                ?? r0 = lIlIllIlIlIIl[2];
                "".length();
                return 0 != 0 ? ((70 ^ 60) ^ (229 ^ 167)) & (((71 ^ 74) ^ (243 ^ 198)) ^ (-" ".length())) : r0;
            }
            return lIlIllIlIlIIl[1];
        }).stream().mapToInt(item2 -> {
            return Integer.parseInt(item2.getName().split(lIlIllIlIIllI[lIlIllIlIlIIl[24]])[lIlIllIlIlIIl[2]].replace(lIlIllIlIIllI[lIlIllIlIlIIl[25]], lIlIllIlIIllI[lIlIllIlIlIIl[26]]));
        }).sum(), this.i.prayDoses())) {
            i = lIlIllIlIlIIl[2];
        }
        int llllllllllllllIllIlIIIllIlIlIlll = Inventory.getAll(item3 -> {
            return item3.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[23]]);
        }).stream().mapToInt(item4 -> {
            return Integer.parseInt(item4.getName().split(lIlIllIlIIllI[lIlIllIlIlIIl[20]])[lIlIllIlIlIIl[2]].replace(lIlIllIlIIllI[lIlIllIlIlIIl[21]], lIlIllIlIIllI[lIlIllIlIlIIl[22]]));
        }).sum();
        if (llIIIIIlIlIlIlI(llllllllllllllIllIlIIIllIlIlIlll + Inventory.getCount(item5 -> {
            String[] strArr = new String[lIlIllIlIlIIl[2]];
            strArr[lIlIllIlIlIIl[1]] = lIlIllIlIIllI[lIlIllIlIlIIl[19]];
            return item5.hasAction(strArr);
        }), this.i.food())) {
            i = lIlIllIlIlIIl[2];
        }
        return i;
    }

    private static boolean llIIIIIlIlIlIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean u() {
        if ((!llIIIIIlIlIlIll(Prayers.getPoints(), lIlIllIlIlIIl[3]) || !llIIIIIlIlIIllI(Inventory.contains(item -> {
            if (!llIIIIIlIlIIllI(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[17]]) ? 1 : 0) || llIIIIIlIlIlIII(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[18]]) ? 1 : 0)) {
                ?? r0 = lIlIllIlIlIIl[2];
                "".length();
                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIlIlIIl[1];
        }) ? 1 : 0)) && !llIIIIIlIlIlIll(Combat.getCurrentHealth(), lIlIllIlIlIIl[4])) {
            return lIlIllIlIlIIl[1];
        }
        return lIlIllIlIlIIl[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        return lIlIllIlIlIIl[1];
    }

    private static String llIIIIIlIIllIll(String llllllllllllllIllIlIIIllIIlIIIll, String llllllllllllllIllIlIIIllIIlIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIllIIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIllIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIlIlIIl[6], llllllllllllllIllIlIIIllIIlIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIllIIlIIlII) {
            llllllllllllllIllIlIIIllIIlIIlII.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIlIlIIlIl() {
        lIlIllIlIlIIl = new int[30];
        lIlIllIlIlIIl[0] = (-1053) & 11647;
        lIlIllIlIlIIl[1] = ((70 ^ 121) ^ (148 ^ 137)) & (((73 ^ 107) ^ ((48 ^ 20) & ((91 ^ 127) ^ (-1)))) ^ (-" ".length()));
        lIlIllIlIlIIl[2] = " ".length();
        lIlIllIlIlIIl[3] = 125 ^ 119;
        lIlIllIlIlIIl[4] = (93 ^ 119) ^ (8 ^ 60);
        lIlIllIlIlIIl[5] = (-51) & 8063;
        lIlIllIlIlIIl[6] = "  ".length();
        lIlIllIlIlIIl[7] = (-((-4653) & 23341)) & (-4225) & 32701;
        lIlIllIlIlIIl[8] = (-16385) & 26174;
        lIlIllIlIlIIl[9] = "   ".length();
        lIlIllIlIlIIl[10] = (((94 + 42) - 50) + 84) ^ (((148 + 163) - 242) + 105);
        lIlIllIlIlIIl[11] = 13 ^ 8;
        lIlIllIlIlIIl[12] = (((136 + 71) - 173) + 108) ^ (((21 + 121) - 10) + 4);
        lIlIllIlIlIIl[13] = (178 ^ 153) ^ (102 ^ 74);
        lIlIllIlIlIIl[14] = 95 ^ 87;
        lIlIllIlIlIIl[15] = (27 ^ 92) ^ (65 ^ 15);
        lIlIllIlIlIIl[16] = (-321) & 28647;
        lIlIllIlIlIIl[17] = (97 ^ 26) ^ (230 ^ 150);
        lIlIllIlIlIIl[18] = 57 ^ 53;
        lIlIllIlIlIIl[19] = 31 ^ 18;
        lIlIllIlIlIIl[20] = (30 ^ 114) ^ (228 ^ 134);
        lIlIllIlIlIIl[21] = (86 ^ 113) ^ (34 ^ 10);
        lIlIllIlIlIIl[22] = (103 ^ 125) ^ (147 ^ 153);
        lIlIllIlIlIIl[23] = 110 ^ 127;
        lIlIllIlIlIIl[24] = 106 ^ 120;
        lIlIllIlIlIIl[25] = (119 ^ 37) ^ (28 ^ 93);
        lIlIllIlIlIIl[26] = (62 ^ 40) ^ "  ".length();
        lIlIllIlIlIIl[27] = (25 ^ 110) ^ (45 ^ 79);
        lIlIllIlIlIIl[28] = 68 ^ 82;
        lIlIllIlIlIIl[29] = 147 ^ 132;
    }

    private static boolean llIIIIIlIlIIllI(int i) {
        return i == 0;
    }

    private static boolean llIIIIIlIlIlIII(int i) {
        return i != 0;
    }

    private static boolean llIIIIIlIlIllII(int i, int i2) {
        return i != i2;
    }
}
