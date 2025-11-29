package h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Activating Blood Essence")
/* renamed from: h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.b  reason: invalid package */
/* loaded from: d11e2dee-7190-435e-95f6-a7b9761c02e8.jar:h/s/r/-/r/e/z/n/e/r/r/q/a/a/e/t/-/f/i/c/e/u/u/b.class */
public class b extends Task {
    private static /* synthetic */ String[] lIllIIlllIlII;
    private static /* synthetic */ int[] lIllIIlllIllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    public boolean run() {
        if (llIIIlllIIIIIII(Inventory.isFull() ? 1 : 0)) {
            return lIllIIlllIllI[0];
        }
        int[] iArr = new int[lIllIIlllIllI[1]];
        iArr[lIllIIlllIllI[0]] = lIllIIlllIllI[2];
        if (llIIIlllIIIIIII(Inventory.contains(iArr) ? 1 : 0)) {
            return lIllIIlllIllI[0];
        }
        int[] iArr2 = new int[lIllIIlllIllI[1]];
        iArr2[lIllIIlllIllI[0]] = lIllIIlllIllI[3];
        if (llIIIlllIIIIIIl(Inventory.contains(iArr2) ? 1 : 0)) {
            return lIllIIlllIllI[0];
        }
        int[] iArr3 = new int[lIllIIlllIllI[1]];
        iArr3[lIllIIlllIllI[0]] = lIllIIlllIllI[3];
        Inventory.getFirst(iArr3).interact(lIllIIlllIlII[lIllIIlllIllI[0]]);
        return lIllIIlllIllI[1];
    }

    private static void llIIIllIlllllll() {
        lIllIIlllIllI = new int[4];
        lIllIIlllIllI[0] = ((36 ^ 114) ^ "  ".length()) & (((95 ^ 40) ^ (40 ^ 11)) ^ (-" ".length()));
        lIllIIlllIllI[1] = " ".length();
        lIllIIlllIllI[2] = (-196) & 26587;
        lIllIIlllIllI[3] = (-138) & 26527;
    }

    private static boolean llIIIlllIIIIIII(int i) {
        return i != 0;
    }

    private static boolean llIIIlllIIIIIlI(int i, int i2) {
        return i < i2;
    }

    static {
        llIIIllIlllllll();
        llIIIllIlllllII();
    }

    private static boolean llIIIlllIIIIIIl(int i) {
        return i == 0;
    }

    private static void llIIIllIlllllII() {
        lIllIIlllIlII = new String[lIllIIlllIllI[1]];
        lIllIIlllIlII[lIllIIlllIllI[0]] = llIIIllIllllIll("GwY/CB07ES4=", "ZeKak");
    }

    private static String llIIIllIllllIll(String llllllllllllllIllIIlIIIlIIIlllIl, String llllllllllllllIllIIlIIIlIIIlllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIIIlIIIllIll = new StringBuilder();
        char[] llllllllllllllIllIIlIIIlIIIllIlI = llllllllllllllIllIIlIIIlIIIlllII.toCharArray();
        int llllllllllllllIllIIlIIIlIIIllIIl = lIllIIlllIllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIlllIllI[0];
        while (llIIIlllIIIIIlI(i, length)) {
            char llllllllllllllIllIIlIIIlIIIllllI = charArray[i];
            llllllllllllllIllIIlIIIlIIIllIll.append((char) (llllllllllllllIllIIlIIIlIIIllllI ^ llllllllllllllIllIIlIIIlIIIllIlI[llllllllllllllIllIIlIIIlIIIllIIl % llllllllllllllIllIIlIIIlIIIllIlI.length]));
            "".length();
            llllllllllllllIllIIlIIIlIIIllIIl++;
            i++;
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlIIIlIIIllIll);
    }
}
