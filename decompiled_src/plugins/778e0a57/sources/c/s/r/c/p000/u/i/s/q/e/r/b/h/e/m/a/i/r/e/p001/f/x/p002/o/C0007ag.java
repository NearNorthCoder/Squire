package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Pickup Dropped Brew", priority = 30000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ag  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/ag.class */
public class C0007ag extends Task {
    private static /* synthetic */ int[] lIlIlIlllIll;
    private final /* synthetic */ SquireChambersConfig cK;
    private static /* synthetic */ String[] lIlIlIlllIlI;
    private final /* synthetic */ SquireChambersPlugin cJ;

    private static boolean llIlllllIlIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean llIlllllIlIlIl(int i, int i2) {
        return i == i2;
    }

    static {
        llIlllllIIlllI();
        llIlllllIIllIl();
    }

    private static boolean llIlllllIIllll(int i) {
        return i == 0;
    }

    private static boolean llIlllllIlIIll(int i) {
        return i > 0;
    }

    private static boolean llIlllllIlIIlI(int i) {
        return i != 0;
    }

    protected int cp() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIlIlIlllIlI[lIlIlIlllIll[8]]);
        });
    }

    protected int cq() {
        return Inventory.getCount(item -> {
            return item.getName().startsWith(lIlIlIlllIlI[lIlIlIlllIll[7]]);
        });
    }

    @Inject
    public C0007ag(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cJ = squireChambersPlugin;
        this.cK = squireChambersConfig;
    }

    private static String llIlllllIIlIll(String lllllllllllllllIllIIllIlIlIIIllI, String lllllllllllllllIllIIllIlIlIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIllIIllIlIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIllIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIlllIll[7], lllllllllllllllIllIIllIlIlIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIllIlIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIllIlIlIIIlll) {
            lllllllllllllllIllIIllIlIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllllIlIlII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    public boolean run() {
        if (!llIlllllIIllll(this.cK.pickupBrews() ? 1 : 0) && !llIlllllIIllll(this.cJ.E() ? 1 : 0) && !llIlllllIlIIII(this.cJ.L().aM(), N.SCAVENGERS)) {
            if (llIlllllIlIIII(this.cJ.L().aM(), N.TIGHTROPE)) {
                String[] strArr = new String[lIlIlIlllIll[1]];
                strArr[lIlIlIlllIll[0]] = lIlIlIlllIlI[lIlIlIlllIll[0]];
                if (llIlllllIIllll(Inventory.contains(strArr) ? 1 : 0)) {
                    return lIlIlIlllIll[0];
                }
            }
            if (!llIlllllIlIIIl(NPCs.getNearest(npc -> {
                String[] strArr2 = new String[lIlIlIlllIll[1]];
                strArr2[lIlIlIlllIll[0]] = lIlIlIlllIlI[lIlIlIlllIll[4]];
                if (llIlllllIlIIlI(npc.hasAction(strArr2) ? 1 : 0) && llIlllllIlIIlI(this.cJ.L().a((Locatable) npc) ? 1 : 0)) {
                    ?? r0 = lIlIlIlllIll[1];
                    "".length();
                    return (-((((30 + 108) - 94) + 107) ^ (((17 + 100) - 107) + 136))) >= 0 ? ((((41 + 102) - (-17)) + 38) ^ (((108 + 118) - 65) + 33)) & (((18 ^ 55) ^ (65 ^ 96)) ^ (-" ".length())) : r0;
                }
                return lIlIlIlllIll[0];
            })) && !llIlllllIlIIlI(Inventory.isFull() ? 1 : 0)) {
                if (llIlllllIlIIII(this.cJ.L().aM(), N.ICE_DEMON) && llIlllllIlIIll((lIlIlIlllIll[2] - this.cJ.K()) + ((lIlIlIlllIll[3] - Skills.getLevel(Skill.WOODCUTTING)) / lIlIlIlllIll[4]))) {
                    return lIlIlIlllIll[0];
                }
                if ((!llIlllllIlIIII(this.cJ.L().aM(), N.THIEVING) || !llIlllllIlIIll((lIlIlIlllIll[5] - this.cJ.J()) + ((lIlIlIlllIll[3] - Skills.getLevel(Skill.THIEVING)) / lIlIlIlllIll[6]))) && !llIlllllIlIIIl(TileItems.getNearest(tileItem -> {
                    if (llIlllllIlIlIl(tileItem.getId(), lIlIlIlllIll[10]) && llIlllllIlIIlI(Reachable.isWalkable(tileItem.getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = lIlIlIlllIll[1];
                        "".length();
                        return ((245 ^ 175) & ((73 ^ 19) ^ (-1))) > (14 ^ 10) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIlIlllIll[0];
                }))) {
                    TileItem nearest = TileItems.getNearest(tileItem2 -> {
                        if (llIlllllIlIIlI(tileItem2.getName().toLowerCase().contains(lIlIlIlllIlI[lIlIlIlllIll[9]]) ? 1 : 0) && llIlllllIlIIlI(this.cJ.L().a((Locatable) tileItem2) ? 1 : 0) && llIlllllIlIIlI(Reachable.isWalkable(tileItem2.getWorldLocation()) ? 1 : 0)) {
                            ?? r0 = lIlIlIlllIll[1];
                            "".length();
                            return " ".length() <= 0 ? ((((127 + 15) - 28) + 15) ^ (((118 + 127) - 224) + 160)) & (((((149 + 18) - 107) + 123) ^ (((43 + 41) - 31) + 78)) ^ (-" ".length())) : r0;
                        }
                        return lIlIlIlllIll[0];
                    });
                    if (llIlllllIlIlII(nearest)) {
                        return lIlIlIlllIll[0];
                    }
                    nearest.interact(lIlIlIlllIlI[lIlIlIlllIll[1]]);
                    return lIlIlIlllIll[1];
                }
                return lIlIlIlllIll[0];
            }
            return lIlIlIlllIll[0];
        }
        return lIlIlIlllIll[0];
    }

    private static boolean llIlllllIlIIIl(Object obj) {
        return obj != null;
    }

    private static void llIlllllIIllIl() {
        lIlIlIlllIlI = new String[lIlIlIlllIll[11]];
        lIlIlIlllIlI[lIlIlIlllIll[0]] = llIlllllIIlIlI("J5djwni7Wik6pNj8wxksoAkI/QLoD/zr", "pNJqX");
        lIlIlIlllIlI[lIlIlIlllIll[1]] = llIlllllIIlIll("c045buXpijE=", "bomrI");
        lIlIlIlllIlI[lIlIlIlllIll[7]] = llIlllllIIlIll("DauP+uLLEO6HuWbSVO8rvA==", "TUeLO");
        lIlIlIlllIlI[lIlIlIlllIll[8]] = llIlllllIIllII("KSccGxZWMU4THBU=", "qBnru");
        lIlIlIlllIlI[lIlIlIlllIll[9]] = llIlllllIIlIll("P9BwUbfpLbYrr4MZSBFx9A==", "nBjRq");
        lIlIlIlllIlI[lIlIlIlllIll[4]] = llIlllllIIllII("LiU8IxoE", "oQHBy");
    }

    private static String llIlllllIIllII(String lllllllllllllllIllIIllIlIllIlIII, String lllllllllllllllIllIIllIlIllIIlll) {
        String lllllllllllllllIllIIllIlIllIlIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIllIlIllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIIllIlIllIIllI = new StringBuilder();
        char[] lllllllllllllllIllIIllIlIllIIlIl = lllllllllllllllIllIIllIlIllIIlll.toCharArray();
        int lllllllllllllllIllIIllIlIlIlllll = lIlIlIlllIll[0];
        char[] charArray = lllllllllllllllIllIIllIlIllIlIII2.toCharArray();
        int length = charArray.length;
        int i = lIlIlIlllIll[0];
        while (llIlllllIlIllI(i, length)) {
            lllllllllllllllIllIIllIlIllIIllI.append((char) (charArray[i] ^ lllllllllllllllIllIIllIlIllIIlIl[lllllllllllllllIllIIllIlIlIlllll % lllllllllllllllIllIIllIlIllIIlIl.length]));
            "".length();
            lllllllllllllllIllIIllIlIlIlllll++;
            i++;
            "".length();
            if (!(true ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIIllIlIllIIllI);
    }

    private static void llIlllllIIlllI() {
        lIlIlIlllIll = new int[13];
        lIlIlIlllIll[0] = (108 ^ 32) & ((47 ^ 99) ^ (-1));
        lIlIlIlllIll[1] = " ".length();
        lIlIlIlllIll[2] = (((7 + 4) - (-87)) + 69) ^ (((43 + 44) - (-38)) + 20);
        lIlIlIlllIll[3] = 38 ^ 66;
        lIlIlIlllIll[4] = (163 ^ 181) ^ (113 ^ 98);
        lIlIlIlllIll[5] = 160 ^ 190;
        lIlIlIlllIll[6] = (165 ^ 192) ^ (175 ^ 192);
        lIlIlIlllIll[7] = "  ".length();
        lIlIlIlllIll[8] = "   ".length();
        lIlIlIlllIll[9] = 29 ^ 25;
        lIlIlIlllIll[10] = (-((-1405) & 25981)) & (-577) & 31725;
        lIlIlIlllIll[11] = 160 ^ 166;
        lIlIlIlllIll[12] = (143 ^ 191) ^ (16 ^ 40);
    }

    private static String llIlllllIIlIlI(String lllllllllllllllIllIIllIlIlIlIIll, String lllllllllllllllIllIIllIlIlIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), lIlIlIlllIll[12]), "DES");
            Cipher lllllllllllllllIllIIllIlIlIlIlIl = Cipher.getInstance("DES");
            lllllllllllllllIllIIllIlIlIlIlIl.init(lIlIlIlllIll[7], secretKeySpec);
            return new String(lllllllllllllllIllIIllIlIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIllIlIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIllIlIlIlIlII) {
            lllllllllllllllIllIIllIlIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlllllIlIIII(Object obj, Object obj2) {
        return obj == obj2;
    }
}
