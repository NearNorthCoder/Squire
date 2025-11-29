package e.t.r.i.s.h.q.n.r.u.p000.u.e;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
@TaskDesc(name = "Hunting kebbits", register = true)
/* renamed from: e.t.r.i.s.h.q.n.r.u.-.u.e.o  reason: invalid package */
/* loaded from: e2a56d76-bd9d-40c9-839c-e5b25fb4c3a0.jar:e/t/r/i/s/h/q/n/r/u/-/u/e/o.class */
public class o extends j {
    private static /* synthetic */ int[] lllIllllIllI;
    private static final /* synthetic */ RectangularArea B;
    private static final /* synthetic */ WorldPoint C;
    private /* synthetic */ boolean D;
    private static /* synthetic */ String[] lllIllllIIll;
    private /* synthetic */ int F;
    private /* synthetic */ int E;

    private static String lIIIlllIIIIIlII(String lllllllllllllllIIlIllIlllIllIIII, String lllllllllllllllIIlIllIlllIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlllIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlllIlIllll.getBytes(StandardCharsets.UTF_8)), lllIllllIllI[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllllIllI[1], lllllllllllllllIIlIllIlllIllIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlllIllIIIl) {
            lllllllllllllllIIlIllIlllIllIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    public o(C0000a c0000a, SquireHunterConfig squireHunterConfig) {
        super(c0000a, squireHunterConfig, EnumC0004e.FALCONRY);
        this.E = lllIllllIllI[0];
        this.F = lllIllllIllI[1];
    }

    private static boolean lIIIlllIIIlIIIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    private boolean C() {
        if (lIIIlllIIIIllll(Dialog.getText()) && lIIIlllIIIIlllI(Dialog.getText().contains(lllIllllIIll[lllIllllIllI[9]]) ? 1 : 0)) {
            this.D = lllIllllIllI[2];
            return lllIllllIllI[3];
        } else if (lIIIlllIIIIlllI(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lllIllllIllI[3];
        } else if (lIIIlllIIIIlllI(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption(str -> {
                return str.contains(lllIllllIIll[lllIllllIllI[13]]);
            });
            "".length();
            return lllIllllIllI[3];
        } else {
            String[] strArr = new String[lllIllllIllI[3]];
            strArr[lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[10]];
            NPC nearest = NPCs.getNearest(strArr);
            if (lIIIlllIIIIllll(nearest)) {
                nearest.interact(lllIllllIIll[lllIllllIllI[11]]);
                return lllIllllIllI[3];
            } else if (lIIIlllIIIlIIIl(C.distanceTo(Players.getLocal()), lllIllllIllI[7])) {
                Movement.walkTo(C);
                "".length();
                return lllIllllIllI[3];
            } else {
                return lllIllllIllI[3];
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    @Override // e.t.r.i.s.h.q.n.r.u.p000.u.e.j
    protected boolean x() {
        if (lIIIlllIIIIllIl(z().method(), EnumC0004e.FALCONRY)) {
            return lllIllllIllI[2];
        }
        if (lIIIlllIIIIlllI(this.D ? 1 : 0)) {
            return C();
        }
        if (lIIIlllIIIIlllI(B() ? 1 : 0)) {
            return lllIllllIllI[3];
        }
        if (lIIIlllIIIIlllI(z().buryBones() ? 1 : 0)) {
            String[] strArr = new String[lllIllllIllI[3]];
            strArr[lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[2]];
            Item first = Inventory.getFirst(strArr);
            if (lIIIlllIIIIllll(first)) {
                first.interact(lllIllllIIll[lllIllllIllI[3]]);
            }
        }
        List all = Inventory.getAll(item -> {
            return item.getName().contains(lllIllllIIll[lllIllllIllI[15]]);
        });
        if (lIIIlllIIIlIIII(z().buryBones() ? 1 : 0)) {
            String[] strArr2 = new String[lllIllllIllI[3]];
            strArr2[lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[1]];
            all.addAll(Inventory.getAll(strArr2));
            "".length();
        }
        if (lIIIlllIIIlIIIl(all.size(), this.F)) {
            this.F = Rand.nextInt(lllIllllIllI[3], lllIllllIllI[4]);
            all.forEach(item2 -> {
                item2.interact(lllIllllIIll[lllIllllIllI[14]]);
            });
        }
        NPC hintArrowNpc = Static.getClient().getHintArrowNpc();
        if (lIIIlllIIIIllll(hintArrowNpc)) {
            String[] strArr3 = new String[lllIllllIllI[3]];
            strArr3[lllIllllIllI[2]] = lllIllllIIll[lllIllllIllI[5]];
            if (lIIIlllIIIIlllI(hintArrowNpc.hasAction(strArr3) ? 1 : 0)) {
                hintArrowNpc.interact(lllIllllIIll[lllIllllIllI[6]]);
                return lllIllllIllI[3];
            }
        }
        if (lIIIlllIIIlIIIl(B.getCenter().distanceTo(Players.getLocal()), lllIllllIllI[7])) {
            Movement.setDestination(B.getCenter());
            return lllIllllIllI[3];
        }
        NPC s = h.s();
        if (lIIIlllIIIIllll(s)) {
            s.interact(lllIllllIIll[lllIllllIllI[4]]);
            return lllIllllIllI[3];
        }
        return lllIllllIllI[3];
    }

    private static boolean lIIIlllIIIIlllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean B() {
        if (lIIIlllIIIlIIII(Movement.isRunEnabled() ? 1 : 0) && lIIIlllIIIlIIIl(Movement.getRunEnergy(), this.E)) {
            this.E = Rand.nextInt(lllIllllIllI[4], lllIllllIllI[8]);
            Movement.toggleRun();
            return lllIllllIllI[3];
        }
        return lllIllllIllI[2];
    }

    private static String lIIIlllIIIIIIll(String lllllllllllllllIIlIllIllllIIIlIl, String lllllllllllllllIIlIllIllllIIIlII) {
        String lllllllllllllllIIlIllIllllIIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIllIllllIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIllIllllIIIIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIllIllllIIIlII.toCharArray();
        int lllllllllllllllIIlIllIllllIIIIIl = lllIllllIllI[2];
        char[] charArray2 = lllllllllllllllIIlIllIllllIIIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIllllIllI[2];
        while (lIIIlllIIIlIIlI(i, length)) {
            lllllllllllllllIIlIllIllllIIIIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIllIllllIIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIllIllllIIIIIl++;
            i++;
            "".length();
            if ((61 ^ 57) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIllIllllIIIIll);
    }

    private static boolean lIIIlllIIIlIIII(int i) {
        return i == 0;
    }

    private static boolean lIIIlllIIIlIIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlllIIIIllII() {
        lllIllllIllI = new int[23];
        lllIllllIllI[0] = 105 ^ 125;
        lllIllllIllI[1] = "  ".length();
        lllIllllIllI[2] = (175 ^ 164) & ((13 ^ 6) ^ (-1));
        lllIllllIllI[3] = " ".length();
        lllIllllIllI[4] = 128 ^ 133;
        lllIllllIllI[5] = "   ".length();
        lllIllllIllI[6] = (((6 + 181) - 111) + 119) ^ (((75 + 170) - 71) + 25);
        lllIllllIllI[7] = (223 ^ 159) ^ (223 ^ 149);
        lllIllllIllI[8] = 60 ^ 37;
        lllIllllIllI[9] = 60 ^ 58;
        lllIllllIllI[10] = 66 ^ 69;
        lllIllllIllI[11] = 110 ^ 102;
        lllIllllIllI[12] = (((13 + 38) - (-150)) + 4) ^ (((124 + 33) - 61) + 100);
        lllIllllIllI[13] = 148 ^ 159;
        lllIllllIllI[14] = (41 ^ 17) ^ (133 ^ 177);
        lllIllllIllI[15] = 137 ^ 132;
        lllIllllIllI[16] = (-30338) & 32703;
        lllIllllIllI[17] = (-((-16011) & 32767)) & (-12289) & 32638;
        lllIllllIllI[18] = (-17434) & 19807;
        lllIllllIllI[19] = (-((-553) & 29631)) & (-9) & 32671;
        lllIllllIllI[20] = (-((-23681) & 24251)) & (-21633) & 24575;
        lllIllllIllI[21] = (-((-3653) & 11886)) & (-4485) & 16319;
        lllIllllIllI[22] = (((62 + 41) - 62) + 96) ^ (((55 + 132) - 167) + 115);
    }

    private static boolean lIIIlllIIIIllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIIlllIIIIllIl(chatMessage.getType(), ChatMessageType.PUBLICCHAT) && lIIIlllIIIIlllI(chatMessage.getMessage().contains(lllIllllIIll[lllIllllIllI[12]]) ? 1 : 0)) {
            this.D = lllIllllIllI[3];
        }
        if (lIIIlllIIIIllIl(chatMessage.getType(), ChatMessageType.PUBLICCHAT) && lIIIlllIIIIlllI(chatMessage.getMessage().contains(lllIllllIIll[lllIllllIllI[7]]) ? 1 : 0)) {
            this.D = lllIllllIllI[3];
        }
    }

    private static void lIIIlllIIIIlIII() {
        lllIllllIIll = new String[lllIllllIllI[22]];
        lllIllllIIll[lllIllllIllI[2]] = lIIIlllIIIIIIII("+pQHOyBL8e0=", "BVZtw");
        lllIllllIIll[lllIllllIllI[3]] = lIIIlllIIIIIIll("Gx4rPw==", "YkYFh");
        lllIllllIIll[lllIllllIllI[1]] = lIIIlllIIIIIIII("dtHulS/otEA=", "xCxih");
        lllIllllIIll[lllIllllIllI[5]] = lIIIlllIIIIIlII("XffJVLj7YjhR73OtKGyiFA==", "xoaQX");
        lllIllllIIll[lllIllllIllI[6]] = lIIIlllIIIIIIll("PggEAjMJGxU=", "lmppZ");
        lllIllllIIll[lllIllllIllI[4]] = lIIIlllIIIIIIll("CysSFT0=", "HJfvU");
        lllIllllIIll[lllIllllIllI[9]] = lIIIlllIIIIIIll("NzsIOAdJchsiCkUmAHARAHIOcBEMJk89HBc3TzMSFzcJJR8=", "eRoPs");
        lllIllllIIll[lllIllllIllI[10]] = lIIIlllIIIIIlII("EkY5J+z9at8gZteD4uafYw==", "gDRzy");
        lllIllllIIll[lllIllllIllI[11]] = lIIIlllIIIIIIll("NQgoLX0VBg==", "aiDFP");
        lllIllllIIll[lllIllllIllI[12]] = lIIIlllIIIIIIII("6kvMyn1K5R6xGjkMlBBGiVBuR1rMP7Pm", "HofHo");
        lllIllllIIll[lllIllllIllI[7]] = lIIIlllIIIIIIll("NgEAWRMdF1UNCE8NFA0EB04BEQJPDQccBhsbBxxHDRsBWQ4bThwKRxsBGlkWGgcWEkcJAQdZHgAb", "onuyg");
        lllIllllIIll[lllIllllIllI[13]] = lIIIlllIIIIIIII("nl9K4MmrZTJXmVxqHu53pw==", "Ukisr");
        lllIllllIIll[lllIllllIllI[14]] = lIIIlllIIIIIIII("6lRhs+yUbiA=", "ugfsE");
        lllIllllIIll[lllIllllIllI[15]] = lIIIlllIIIIIlII("EbkJBNJ6hLA=", "GwCzd");
    }

    private static boolean lIIIlllIIIIllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lIIIlllIIIIllII();
        lIIIlllIIIIlIII();
        B = new RectangularArea(new WorldPoint(lllIllllIllI[16], lllIllllIllI[17], lllIllllIllI[2]), new WorldPoint(lllIllllIllI[18], lllIllllIllI[19], lllIllllIllI[2]));
        C = new WorldPoint(lllIllllIllI[20], lllIllllIllI[21], lllIllllIllI[2]);
    }

    private static String lIIIlllIIIIIIII(String lllllllllllllllIIlIllIlllIlIIIll, String lllllllllllllllIIlIllIlllIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlllIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIlllIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIlllIlIIlIl.init(lllIllllIllI[1], secretKeySpec);
            return new String(lllllllllllllllIIlIllIlllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlllIlIIlII) {
            lllllllllllllllIIlIllIlllIlIIlII.printStackTrace();
            return null;
        }
    }
}
