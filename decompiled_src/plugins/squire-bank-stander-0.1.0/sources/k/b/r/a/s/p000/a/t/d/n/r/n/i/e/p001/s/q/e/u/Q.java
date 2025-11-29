package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Smithing")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.Q  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/Q.class */
public class Q extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIlIIIIl;
    private static /* synthetic */ String[] lllIIlIIIII;

    private static boolean lIlIllIllIllII(Object obj) {
        return obj != null;
    }

    private static String lIlIllIllIIlIl(String llllllllllllllllIIlIlIIIllIlIIIl, String llllllllllllllllIIlIlIIIllIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIlIIIllIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIlIIIllIlIIll.init(lllIIlIIIIl[4], secretKeySpec);
            return new String(llllllllllllllllIIlIlIIIllIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIllIlIIlI) {
            llllllllllllllllIIlIlIIIllIlIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIllIlIII() {
        lllIIlIIIIl = new int[11];
        lllIIlIIIIl[0] = (-24785) & 27131;
        lllIIlIIIIl[1] = " ".length();
        lllIIlIIIIl[2] = ((40 ^ 3) ^ (20 ^ 116)) & (((226 ^ 151) ^ (248 ^ 198)) ^ (-" ".length()));
        lllIIlIIIIl[3] = 147 ^ 153;
        lllIIlIIIIl[4] = "  ".length();
        lllIIlIIIIl[5] = "   ".length();
        lllIIlIIIIl[6] = (74 ^ 34) ^ (229 ^ 137);
        lllIIlIIIIl[7] = (((129 + 27) - (-2)) + 5) ^ (((63 + 29) - (-59)) + 15);
        lllIIlIIIIl[8] = (104 ^ 115) ^ (97 ^ 124);
        lllIIlIIIIl[9] = (131 ^ 178) ^ (145 ^ 167);
        lllIIlIIIIl[10] = (105 ^ 0) ^ (209 ^ 176);
    }

    @Inject
    public Q(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.SMITHING);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIlIllIllIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount(lllIIlIIIIl[2]);
        }
        if (lIlIllIllIlIlI(Movement.isRunEnabled() ? 1 : 0) && lIlIllIllIlIll(Movement.getRunEnergy(), lllIIlIIIIl[3])) {
            Movement.toggleRun();
            return lllIIlIIIIl[2];
        } else if (!lIlIllIllIllII(Widgets.get(WidgetInfo.SMITHING_INVENTORY_ITEMS_CONTAINER))) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (lIlIllIllIllII(tileObject.getActions())) {
                    String[] strArr = new String[lllIIlIIIIl[1]];
                    strArr[lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[9]];
                    if (lIlIllIllIlIIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lllIIlIIIIl[1];
                        "".length();
                        return "   ".length() <= 0 ? ((93 ^ 84) ^ (49 ^ 33)) & (((((62 + 152) - 130) + 73) ^ (((72 + 131) - 102) + 31)) ^ (-" ".length())) : r0;
                    }
                }
                return lllIIlIIIIl[2];
            });
            if (lIlIllIllIllIl(nearest)) {
                Log.info(lllIIlIIIII[lllIIlIIIIl[7]]);
                return lllIIlIIIIl[2];
            }
            nearest.interact(lllIIlIIIII[lllIIlIIIIl[8]]);
            sleep(lllIIlIIIIl[4]);
            return lllIIlIIIIl[1];
        } else {
            Widget widget = Widgets.get(this.j.smithingProduct().Q());
            String[] strArr = new String[lllIIlIIIIl[1]];
            strArr[lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[2]];
            if (lIlIllIllIlIlI(widget.hasAction(strArr) ? 1 : 0)) {
                Widget widget2 = Widgets.get(this.j.smithingProduct().Q());
                String[] strArr2 = new String[lllIIlIIIIl[1]];
                strArr2[lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[1]];
                if (lIlIllIllIlIlI(widget2.hasAction(strArr2) ? 1 : 0)) {
                    Log.info(lllIIlIIIII[lllIIlIIIIl[4]]);
                    return lllIIlIIIIl[2];
                }
            }
            Widget widget3 = Widgets.get(this.j.smithingProduct().Q());
            String[] strArr3 = new String[lllIIlIIIIl[4]];
            strArr3[lllIIlIIIIl[2]] = lllIIlIIIII[lllIIlIIIIl[5]];
            strArr3[lllIIlIIIIl[1]] = lllIIlIIIII[lllIIlIIIIl[6]];
            widget3.interact(strArr3);
            sleep(i());
            return lllIIlIIIIl[1];
        }
    }

    static {
        lIlIllIllIlIII();
        lIlIllIllIIlll();
    }

    private static boolean lIlIllIllIlIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIllIllIlIlI(int i) {
        return i == 0;
    }

    private static String lIlIllIllIIllI(String llllllllllllllllIIlIlIIIlIllIlII, String llllllllllllllllIIlIlIIIlIllIIll) {
        String llllllllllllllllIIlIlIIIlIllIlII2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIlIIIlIllIIll.toCharArray();
        int llllllllllllllllIIlIlIIIlIllIIII = lllIIlIIIIl[2];
        char[] charArray2 = llllllllllllllllIIlIlIIIlIllIlII2.toCharArray();
        int length = charArray2.length;
        int i = lllIIlIIIIl[2];
        while (lIlIllIllIlllI(i, length)) {
            char llllllllllllllllIIlIlIIIlIllIlIl = charArray2[i];
            sb.append((char) (llllllllllllllllIIlIlIIIlIllIlIl ^ charArray[llllllllllllllllIIlIlIIIlIllIIII % charArray.length]));
            "".length();
            llllllllllllllllIIlIlIIIlIllIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIlIIIIl[5];
    }

    private static boolean lIlIllIllIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIllIllIlllI(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllIllIIlll() {
        lllIIlIIIII = new String[lllIIlIIIIl[10]];
        lllIIlIIIII[lllIIlIIIIl[2]] = lIlIllIllIIlII("TqzGyZzLsN0=", "mlrta");
        lllIIlIIIII[lllIIlIIIIl[1]] = lIlIllIllIIlII("z+ydY8q53SCscZ3kP1OBwA==", "DngUa");
        lllIIlIIIII[lllIIlIIIIl[4]] = lIlIllIllIIlIl("xK5BHk57/cQq/kwIn9zQ4c3BM/i++YMC", "AKOEz");
        lllIIlIIIII[lllIIlIIIIl[5]] = lIlIllIllIIlIl("j9MykQCTShk=", "ekcYk");
        lllIIlIIIII[lllIIlIIIIl[6]] = lIlIllIllIIllI("MhQ9FiRBCjEW", "ayTbL");
        lllIIlIIIII[lllIIlIIIIl[7]] = lIlIllIllIIlII("UEmlixZsMT19xnDVK7E87wIIv76OTNl1", "hGKhW");
        lllIIlIIIII[lllIIlIIIIl[8]] = lIlIllIllIIlII("Xp2EJufChE8=", "HYvqU");
        lllIIlIIIII[lllIIlIIIIl[9]] = lIlIllIllIIllI("AQUzJgA=", "RhZRh");
    }

    private static String lIlIllIllIIlII(String llllllllllllllllIIlIlIIIllIIIlII, String llllllllllllllllIIlIlIIIllIIIIll) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIllIIIIll.getBytes(StandardCharsets.UTF_8)), lllIIlIIIIl[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIlIIIIl[4], llllllllllllllllIIlIlIIIllIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIlIIIllIIIlIl) {
            llllllllllllllllIIlIlIIIllIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIllIllIl(Object obj) {
        return obj == null;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(lllIIlIIIIl[0]), Integer.valueOf(lllIIlIIIIl[1]), Integer.valueOf(this.j.smithingBar().p()), Integer.valueOf(this.j.smithingProduct().R()));
    }
}
