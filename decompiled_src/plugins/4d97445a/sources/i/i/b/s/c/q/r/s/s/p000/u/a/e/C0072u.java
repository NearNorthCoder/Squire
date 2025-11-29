package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Handling prayer", priority = 100)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.u  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/u.class */
public class C0072u extends Task {
    private final /* synthetic */ C0000a aF;
    private static /* synthetic */ int[] lIIlIlIll;
    private static /* synthetic */ String[] lIIlIlIlI;

    @Inject
    private C0072u(C0000a c0000a) {
        this.aF = c0000a;
    }

    private static boolean lIIIIIlIIIl(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIIIIIlIIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIIIIIlIIII(int i2) {
        return i2 != 0;
    }

    private static boolean lIIIIIIllll(Object obj) {
        return obj == null;
    }

    static {
        lIIIIIIllIl();
        lIIIIIIllII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        Prayer j;
        Prayer prayer;
        if (!lIIIIIIlllI(this.aF.k()) || lIIIIIIllll(this.aF.k().y())) {
            Prayers.disableAll();
            return lIIlIlIll[0];
        }
        List<C0057f> i2 = this.aF.i();
        if (!lIIIIIIlllI(i2) || lIIIIIlIIII(i2.isEmpty() ? 1 : 0)) {
            j = this.aF.j();
            "".length();
            if ("   ".length() == " ".length()) {
                return ((((105 + 104) - 33) + 55) ^ (((171 + 141) - 128) + 3)) & (((((151 + 139) - 242) + 176) ^ (((71 + 160) - 186) + 143)) ^ (-" ".length()));
            }
        } else {
            j = i2.get(lIIlIlIll[1]).J().j();
        }
        if (lIIIIIIllll(j)) {
            Log.info(lIIlIlIlI[lIIlIlIll[1]]);
            Prayers.disableAll();
            return lIIlIlIll[0];
        }
        if (lIIIIIlIIII(W() ? 1 : 0)) {
            prayer = Prayer.PIETY;
            "".length();
            if (((240 ^ 199) & ((242 ^ 197) ^ (-1))) < (-" ".length())) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            prayer = Prayer.MYSTIC_MIGHT;
        }
        return Prayers.flick(List.of(prayer, j));
    }

    private static boolean lIIIIIIlllI(Object obj) {
        return obj != null;
    }

    private static String lIIIIIIlIll(String llIIlIIIIlIIlII, String llIIlIIIIlIIIll) {
        String str = new String(Base64.getDecoder().decode(llIIlIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIlIIIIlIIIll.toCharArray();
        int llIIlIIIIlIIIII = lIIlIlIll[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lIIlIlIll[1];
        while (lIIIIIlIIlI(i2, length)) {
            char llIIlIIIIlIIlIl = charArray2[i2];
            sb.append((char) (llIIlIIIIlIIlIl ^ charArray[llIIlIIIIlIIIII % charArray.length]));
            "".length();
            llIIlIIIIlIIIII++;
            i2++;
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIIIIllIl() {
        lIIlIlIll = new int[5];
        lIIlIlIll[0] = " ".length();
        lIIlIlIll[1] = "  ".length() & ("  ".length() ^ (-1));
        lIIlIlIll[2] = 41 ^ 111;
        lIIlIlIll[3] = (-17) & 3925;
        lIIlIlIll[4] = (130 ^ 149) ^ (92 ^ 67);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public boolean W() {
        if (lIIIIIlIIIl(Skills.getLevel(Skill.PRAYER), lIIlIlIll[2]) && lIIIIIlIIIl(Skills.getLevel(Skill.DEFENCE), lIIlIlIll[2]) && lIIIIIlIIIl(Vars.getBit(lIIlIlIll[3]), lIIlIlIll[4])) {
            ?? r0 = lIIlIlIll[0];
            "".length();
            return "   ".length() != "   ".length() ? ((161 ^ 142) ^ (22 ^ 99)) & (((((143 + 9) - (-37)) + 60) ^ (((73 + 129) - 102) + 63)) ^ (-" ".length())) : r0;
        }
        return lIIlIlIll[1];
    }

    private static void lIIIIIIllII() {
        lIIlIlIlI = new String[lIIlIlIll[0]];
        lIIlIlIlI[lIIlIlIll[1]] = lIIIIIIlIll("IgBqOj4NFi84bBgAaiwgBQwhZmwIBjkrLgAGJC1sDQMm", "loJJL");
    }
}
