package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.Client;
import net.unethicalite.api.entities.NPCs;
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.ag  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/ag.class */
public abstract class ag extends Task {
    protected final /* synthetic */ SquireZulrahConfig aC;
    @Inject
    protected /* synthetic */ SquireZulrah E;
    private static /* synthetic */ int[] lIllIllIllIII;
    private static /* synthetic */ String[] lIllIllIlIllI;
    private final /* synthetic */ Client aD;

    public abstract boolean ac();

    private static String llIIlIIlIIlIIll(String llllllllllllllIllIIIlIIlllllIIIl, String llllllllllllllIllIIIlIIlllllIIII) {
        String llllllllllllllIllIIIlIIlllllIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIIllllIllll = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIlIIlllllIIII.toCharArray();
        int llllllllllllllIllIIIlIIllllIllIl = lIllIllIllIII[0];
        char[] charArray2 = llllllllllllllIllIIIlIIlllllIIIl2.toCharArray();
        int llllllllllllllIllIIIlIIllllIIllI = charArray2.length;
        int i = lIllIllIllIII[0];
        while (llIIlIIlIIllllI(i, llllllllllllllIllIIIlIIllllIIllI)) {
            llllllllllllllIllIIIlIIllllIllll.append((char) (charArray2[i] ^ charArray[llllllllllllllIllIIIlIIllllIllIl % charArray.length]));
            "".length();
            llllllllllllllIllIIIlIIllllIllIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIlIIllllIllll);
    }

    private static boolean llIIlIIlIIlllll(int i, int i2) {
        return i != i2;
    }

    private static void llIIlIIlIIlIlII() {
        lIllIllIlIllI = new String[lIllIllIllIII[1]];
        lIllIllIlIllI[lIllIllIllIII[0]] = llIIlIIlIIlIIll("Py8NATIN", "eZasS");
    }

    private static void llIIlIIlIIllIll() {
        lIllIllIllIII = new int[4];
        lIllIllIllIII[0] = ((40 ^ 28) ^ (38 ^ 28)) & (((((32 + 119) - 101) + 132) ^ (((22 + 42) - 20) + 140)) ^ (-" ".length()));
        lIllIllIllIII[1] = " ".length();
        lIllIllIllIII[2] = (-2252) & 11259;
        lIllIllIllIII[3] = (-((-26933) & 31157)) & (-2049) & 15279;
    }

    private static boolean llIIlIIlIIlllII(int i) {
        return i == 0;
    }

    static {
        llIIlIIlIIllIll();
        llIIlIIlIIlIlII();
    }

    private static boolean llIIlIIlIlIIIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    public boolean run() {
        if (llIIlIIlIIlllII(ag() ? 1 : 0)) {
            return lIllIllIllIII[0];
        }
        String[] strArr = new String[lIllIllIllIII[1]];
        strArr[lIllIllIllIII[0]] = lIllIllIlIllI[lIllIllIllIII[0]];
        return llIIlIIlIIlllIl(NPCs.getNearest(strArr)) ? lIllIllIllIII[0] : ac();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ag(Client client, SquireZulrahConfig squireZulrahConfig) {
        this.aD = client;
        this.aC = squireZulrahConfig;
    }

    private static boolean llIIlIIlIIlllIl(Object obj) {
        return obj != null;
    }

    private static boolean llIIlIIlIIllllI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    private boolean ag() {
        if (llIIlIIlIIlllII(this.aD.isInInstancedRegion() ? 1 : 0)) {
            this.E.b(lIllIllIllIII[0]);
            return lIllIllIllIII[0];
        }
        int[] mapRegions = this.aD.getMapRegions();
        int length = mapRegions.length;
        int i = lIllIllIllIII[0];
        while (llIIlIIlIIllllI(i, length)) {
            int i2 = mapRegions[i];
            if (!llIIlIIlIIlllll(i2, lIllIllIllIII[2]) || llIIlIIlIlIIIII(i2, lIllIllIllIII[3])) {
                return lIllIllIllIII[1];
            }
            i++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIllIllIllIII[0];
    }
}
