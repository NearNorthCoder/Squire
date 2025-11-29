package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.magic.stunalchtp.SquireAlchTeleportConfig;
import gg.squire.basics.magic.stunalchtp.StunAlchTeleport;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;
@TaskDesc(name = "Teleporting")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aU  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aU.class */
public class aU extends Task {
    private static /* synthetic */ int[] lIllIlIlI;
    public static /* synthetic */ int fc;
    private static final /* synthetic */ int eY;
    private static final /* synthetic */ int eZ;
    private final /* synthetic */ StunAlchTeleport eX;
    private final /* synthetic */ SquireAlchTeleportConfig fd;
    private final /* synthetic */ List<Spell> fa = List.of(SpellBook.Standard.ARDOUGNE_TELEPORT, SpellBook.Standard.FALADOR_TELEPORT);
    private final /* synthetic */ List<Spell> fb = List.of(SpellBook.Standard.CAMELOT_TELEPORT, SpellBook.Standard.FALADOR_TELEPORT, SpellBook.Standard.LUMBRIDGE_TELEPORT, SpellBook.Standard.VARROCK_TELEPORT);

    static {
        lIIllllIIII();
        eZ = lIllIlIlI[1];
        eY = lIllIlIlI[0];
        fc = Static.getClient().getTickCount();
    }

    private static boolean lIIllllIIll(int i2) {
        return i2 != 0;
    }

    private static boolean lIIllllIlIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIllllIlII(int i2) {
        return i2 >= 0;
    }

    @Inject
    public aU(StunAlchTeleport stunAlchTeleport, SquireAlchTeleportConfig squireAlchTeleportConfig) {
        this.eX = stunAlchTeleport;
        this.fd = squireAlchTeleportConfig;
    }

    private static void lIIllllIIII() {
        lIllIlIlI = new int[5];
        lIllIlIlI[0] = (-6177) & 6889;
        lIllIlIlI[1] = (-((-3073) & 32039)) & (-2050) & 31727;
        lIllIlIlI[2] = (113 ^ 89) & ((34 ^ 10) ^ (-1));
        lIllIlIlI[3] = "  ".length();
        lIllIlIlI[4] = " ".length();
    }

    private static boolean lIIllllIIIl(int i2, int i3) {
        return i2 != i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v49, types: [boolean] */
    public boolean run() {
        List<Spell> list;
        Player local = Players.getLocal();
        if (lIIllllIIIl(local.getAnimation(), lIllIlIlI[0]) && lIIllllIIIl(local.getAnimation(), lIllIlIlI[1]) && lIIllllIIlI(this.fd.stunAlchOnly() ? 1 : 0)) {
            return lIllIlIlI[2];
        }
        if (lIIllllIIll(this.eX.cl() ? 1 : 0)) {
            this.eX.d(lIllIlIlI[2]);
        }
        if (lIIllllIlII(fc - Static.getClient().getTickCount())) {
            return lIllIlIlI[2];
        }
        Spell spell = null;
        if (lIIllllIIll(this.fd.stunAlchOnly() ? 1 : 0)) {
            list = this.fb;
            "".length();
            if ((((123 ^ 26) ^ (51 ^ 6)) & (((127 ^ 110) ^ (134 ^ 195)) ^ (-" ".length()))) != (((109 ^ 2) ^ (57 ^ 52)) & (((((202 + 167) - 286) + 125) ^ (((137 + 74) - 97) + 64)) ^ (-" ".length())))) {
                return ((((45 + 173) - 76) + 89) ^ (((125 + 25) - 97) + 139)) & (((36 ^ 27) ^ (220 ^ 196)) ^ (-" ".length()));
            }
        } else {
            list = this.fa;
        }
        Iterator<Spell> it = list.iterator();
        do {
            if (lIIllllIIll(it.hasNext() ? 1 : 0)) {
                Spell next = it.next();
                if (lIIllllIIll(Magic.canCast(next) ? 1 : 0)) {
                    spell = next;
                    "".length();
                    if (!((true ^ true) ^ (true ^ true))) {
                        return ((79 ^ 96) ^ (38 ^ 81)) & (((((7 + 16) - 2) + 136) ^ (((168 + 57) - 31) + 3)) ^ (-" ".length())) & ((((((49 + 12) - (-40)) + 41) ^ (((82 + 140) - 141) + 78)) & (((66 ^ 109) ^ (118 ^ 72)) ^ (-" ".length()))) ^ (-" ".length()));
                    }
                } else {
                    "".length();
                }
            }
            if (lIIllllIlIl(spell)) {
                return lIllIlIlI[2];
            }
            Magic.cast(spell);
            fc = Static.getClient().getTickCount() + lIllIlIlI[3];
            return lIllIlIlI[4];
        } while (0 == 0);
        return ((221 ^ 133) ^ (24 ^ 115)) & (((((28 + 88) - 72) + 83) ^ (33 ^ 109)) ^ (-" ".length()));
    }

    private static boolean lIIllllIIlI(int i2) {
        return i2 == 0;
    }
}
