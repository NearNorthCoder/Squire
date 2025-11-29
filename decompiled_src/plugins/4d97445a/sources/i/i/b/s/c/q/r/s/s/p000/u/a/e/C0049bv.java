package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Widget step", priority = 10, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bv  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bv.class */
public class C0049bv extends Task {
    private static /* synthetic */ String[] lIlllIIIl;
    private final /* synthetic */ SquireQuestHelper fY;
    private static /* synthetic */ int[] lIlllIIlI;

    private static void lIlIIIIIIIl() {
        lIlllIIlI = new int[6];
        lIlllIIlI[0] = ((((96 + 45) - 17) + 38) ^ (((105 + 109) - 114) + 44)) & (((202 ^ 137) ^ (112 ^ 1)) ^ (-" ".length()));
        lIlllIIlI[1] = -" ".length();
        lIlllIIlI[2] = " ".length();
        lIlllIIlI[3] = "  ".length();
        lIlllIIlI[4] = "   ".length();
        lIlllIIlI[5] = 88 ^ 92;
    }

    private static String lIIlllllllI(String lIllllIIIIIIIlI, String lIllllIIIIIIllI) {
        String lIllllIIIIIIIlI2 = new String(Base64.getDecoder().decode(lIllllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllllIIIIIIlIl = new StringBuilder();
        char[] charArray = lIllllIIIIIIllI.toCharArray();
        int lIllllIIIIIIIll = lIlllIIlI[0];
        char[] charArray2 = lIllllIIIIIIIlI2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlllIIlI[0];
        while (lIlIIIIIlIl(i2, length)) {
            lIllllIIIIIIlIl.append((char) (charArray2[i2] ^ charArray[lIllllIIIIIIIll % charArray.length]));
            "".length();
            lIllllIIIIIIIll++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lIllllIIIIIIlIl);
    }

    static {
        lIlIIIIIIIl();
        lIlIIIIIIII();
    }

    private static boolean lIlIIIIIIll(Object obj) {
        return obj != null;
    }

    @Inject
    public C0049bv(SquireQuestHelper squireQuestHelper) {
        this.fY = squireQuestHelper;
    }

    private static boolean lIlIIIIIlII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIIIIIllI(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIlIIIIIIlI(int i2) {
        return i2 == 0;
    }

    private static String lIIllllllll(String lIlllIlllllIIlI, String lIlllIlllllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIlllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIlllllIlII = Cipher.getInstance("Blowfish");
            lIlllIlllllIlII.init(lIlllIIlI[3], secretKeySpec);
            return new String(lIlllIlllllIlII.doFinal(Base64.getDecoder().decode(lIlllIlllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIlllllIIll) {
            lIlllIlllllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIIlIl(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIlIIIIIIII() {
        lIlllIIIl = new String[lIlllIIlI[5]];
        lIlllIIIl[lIlllIIlI[0]] = lIIlllllllI("ChYhNhQkIA==", "mdNCd");
        lIlllIIIl[lIlllIIlI[2]] = lIIllllllll("b0XB7P5xMZk=", "fNklG");
        lIlllIIIl[lIlllIIlI[3]] = lIIlllllllI("LTEuAhUOCz4AAA==", "zXJep");
        lIlllIIIl[lIlllIIlI[4]] = lIIllllllll("CBhRllVOfzvUKVJwXm+E2w==", "FEijB");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    public boolean run() {
        Widget C = C(lIlllIIlI[0]);
        if (lIlIIIIIIlI(Widgets.isVisible(C) ? 1 : 0)) {
            return lIlllIIlI[0];
        }
        String[] actions = C.getActions();
        if (!lIlIIIIIIll(actions) || lIlIIIIIIlI(actions.length)) {
            int parentId = C.getParentId();
            if (lIlIIIIIlII(parentId, lIlllIIlI[1])) {
                return lIlllIIlI[0];
            }
            C = Static.getClient().getWidget(parentId);
            if (lIlIIIIIIlI(Widgets.isVisible(C) ? 1 : 0)) {
                return lIlllIIlI[0];
            }
            actions = C.getActions();
            if (!lIlIIIIIIll(actions) || lIlIIIIIIlI(actions.length)) {
                return lIlllIIlI[0];
            }
        }
        String str = actions[lIlllIIlI[0]];
        String[] strArr = actions;
        int length = strArr.length;
        int i2 = lIlllIIlI[0];
        do {
            if (lIlIIIIIlIl(i2, length)) {
                String str2 = strArr[i2];
                if (lIlIIIIIIll(str2)) {
                    str = str2;
                    "".length();
                    if (" ".length() <= ((132 ^ 146) & ((178 ^ 164) ^ (-1)))) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    i2++;
                    "".length();
                }
            }
            C.interact(str);
            return lIlllIIlI[2];
        } while ((-" ".length()) <= 0);
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public List<Object> cM() {
        Object cy = this.fY.cy();
        if (!lIlIIIIIIll(cy) || lIlIIIIIIlI(cy.getClass().getSimpleName().equals(lIlllIIIl[lIlllIIlI[3]]) ? 1 : 0)) {
            return List.of();
        }
        try {
            Field declaredField = cy.getClass().getDeclaredField(lIlllIIIl[lIlllIIlI[4]]);
            declaredField.setAccessible(lIlllIIlI[2]);
            return (List) declaredField.get(cy);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
            return List.of();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public Widget C(int i2) {
        List<Object> cM = cM();
        if (lIlIIIIIllI(cM.size(), i2)) {
            return null;
        }
        Object obj = cM.get(i2);
        try {
            Field declaredField = obj.getClass().getDeclaredField(lIlllIIIl[lIlllIIlI[0]]);
            declaredField.setAccessible(lIlllIIlI[2]);
            Field declaredField2 = obj.getClass().getDeclaredField(lIlllIIIl[lIlllIIlI[2]]);
            declaredField2.setAccessible(lIlllIIlI[2]);
            return Widgets.get(declaredField.getInt(obj), declaredField2.getInt(obj));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        }
    }
}
