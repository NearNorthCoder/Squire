package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.magic.teleporter.SquireTeleporterConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Teleporting")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aV  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aV.class */
public class aV extends Task {
    private static /* synthetic */ int[] lIlIlIlII;
    private final /* synthetic */ SquireTeleporterConfig fe;

    private static boolean lIIlIlIllIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        Player local = Players.getLocal();
        if (lIIlIlIllIl(local)) {
            return lIlIlIlII[0];
        }
        if (lIIlIlIlllI(local.getAnimation(), lIlIlIlII[1]) && lIIlIlIlllI(local.getAnimation(), lIlIlIlII[2]) && !lIIlIlIllll(local.getAnimation(), lIlIlIlII[3])) {
            if (!lIIlIllIIII(this.fe.teleport(), aW.PROGRESSIVE)) {
                if (lIIlIllIIIl(this.fe.teleport().cn() ? 1 : 0)) {
                    this.fe.teleport().co().cast();
                    return lIlIlIlII[4];
                }
                return lIlIlIlII[0];
            }
            ArrayList<aW> arrayList = new ArrayList(List.of((Object[]) aW.values()));
            Collections.reverse(arrayList);
            for (aW aWVar : arrayList) {
                if (lIIlIllIIIl(aWVar.cn() ? 1 : 0)) {
                    aWVar.co().cast();
                    return lIlIlIlII[4];
                }
                "".length();
                if ("   ".length() <= " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            return lIlIlIlII[0];
        }
        return lIlIlIlII[4];
    }

    private static boolean lIIlIllIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIlIlllI(int i2, int i3) {
        return i2 != i3;
    }

    static {
        lIIlIlIllII();
    }

    private static boolean lIIlIllIIIl(int i2) {
        return i2 != 0;
    }

    private static void lIIlIlIllII() {
        lIlIlIlII = new int[5];
        lIlIlIlII[0] = ((((190 + 56) - 198) + 143) ^ (((116 + 41) - 111) + 136)) & (((((31 + 116) - 143) + 150) ^ (((102 + 61) - 154) + 138)) ^ (-" ".length()));
        lIlIlIlII[1] = (-((-335) & 13663)) & (-18470) & 32511;
        lIlIlIlII[2] = (-((-7133) & 24575)) & (-10245) & 28399;
        lIlIlIlII[3] = (-((-8) & 31039)) & (-1025) & 32767;
        lIlIlIlII[4] = " ".length();
    }

    @Inject
    public aV(SquireTeleporterConfig squireTeleporterConfig) {
        this.fe = squireTeleporterConfig;
    }

    private static boolean lIIlIlIllll(int i2, int i3) {
        return i2 == i3;
    }
}
