package s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@TaskDesc(name = "Drink Overload", priority = 20, blocking = true)
/* renamed from: s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.f  reason: invalid package */
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:s/o/r/e/i/t/h/-/z/n/g/u/r/e/m/e/n/i/a/-/q/f.class */
public class f extends Task {
    private static /* synthetic */ String[] lIIIlIIIlllll;
    private static /* synthetic */ int[] lIIIlIIlIIIII;
    private final /* synthetic */ Client N;
    private final /* synthetic */ SquireNightmareZone L;
    private final /* synthetic */ SquireNightmareZoneConfig M;

    private static void lIIllllIlIlllll() {
        lIIIlIIIlllll = new String[lIIIlIIlIIIII[5]];
        lIIIlIIIlllll[lIIIlIIlIIIII[0]] = lIIllllIlIllllI("Ycc8vatvPTavRTQnVpdctnzY6yyBh78l6pkZDxDQHdA=", "XVjhz");
        lIIIlIIIlllll[lIIIlIIlIIIII[3]] = lIIllllIlIllllI("GXmDORw4ykI=", "MPRgq");
        lIIIlIIIlllll[lIIIlIIlIIIII[4]] = lIIllllIlIllllI("ABxi+sS13HyBnxFnBbHfog==", "VLqZC");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean run() {
        if (!lIIllllIllIIIIl(this.M.overload()) && !lIIllllIllIIIIl(this.N.isInInstancedRegion() ? 1 : 0) && !lIIllllIllIIIlI(Static.getClient().getVarbitValue(lIIIlIIlIIIII[1]))) {
            if (lIIllllIllIIIll(Skills.getBoostedLevel(Skill.HITPOINTS), lIIIlIIlIIIII[2])) {
                Log.error(lIIIlIIIlllll[lIIIlIIlIIIII[0]]);
                return lIIIlIIlIIIII[0];
            }
            Item first = Inventory.getFirst(item -> {
                return item.getName().startsWith(lIIIlIIIlllll[lIIIlIIlIIIII[4]]);
            });
            if (lIIllllIllIIlII(first)) {
                return lIIIlIIlIIIII[0];
            }
            first.interact(lIIIlIIIlllll[lIIIlIIlIIIII[3]]);
            return lIIIlIIlIIIII[3];
        }
        return lIIIlIIlIIIII[0];
    }

    private static boolean lIIllllIllIIIIl(int i) {
        return i == 0;
    }

    private static boolean lIIllllIllIIIll(int i, int i2) {
        return i < i2;
    }

    private static void lIIllllIllIIIII() {
        lIIIlIIlIIIII = new int[7];
        lIIIlIIlIIIII[0] = (214 ^ 155) & ((124 ^ 49) ^ (-1));
        lIIIlIIlIIIII[1] = (-8325) & 12279;
        lIIIlIIlIIIII[2] = (154 ^ 150) ^ (163 ^ 156);
        lIIIlIIlIIIII[3] = " ".length();
        lIIIlIIlIIIII[4] = "  ".length();
        lIIIlIIlIIIII[5] = "   ".length();
        lIIIlIIlIIIII[6] = (101 ^ 60) ^ (60 ^ 109);
    }

    private static boolean lIIllllIllIIIlI(int i) {
        return i > 0;
    }

    @Inject
    public f(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.L = squireNightmareZone;
        this.M = squireNightmareZoneConfig;
        this.N = client;
    }

    static {
        lIIllllIllIIIII();
        lIIllllIlIlllll();
    }

    private static boolean lIIllllIllIIlII(Object obj) {
        return obj == null;
    }

    private static String lIIllllIlIllllI(String lllllllllllllllIIIlIIIIIIlIlIIIl, String lllllllllllllllIIIlIIIIIIlIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIlIIIIIIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlIIIIIIlIlIIII.getBytes(StandardCharsets.UTF_8)), lIIIlIIlIIIII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlIIlIIIII[4], lllllllllllllllIIIlIIIIIIlIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlIIIIIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlIIIIIIlIlIIlI) {
            lllllllllllllllIIIlIIIIIIlIlIIlI.printStackTrace();
            return null;
        }
    }
}
