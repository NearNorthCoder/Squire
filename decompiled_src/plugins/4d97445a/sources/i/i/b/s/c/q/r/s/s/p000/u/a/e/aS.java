package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.magic.stunalchtp.SquireAlchTeleportConfig;
import gg.squire.basics.magic.stunalchtp.StunAlchTeleport;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Alching", priority = 2)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aS  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aS.class */
public class aS extends Task {
    private final /* synthetic */ SquireAlchTeleportConfig eP;
    private static /* synthetic */ int[] lIllIlI;
    private final /* synthetic */ StunAlchTeleport eO;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    public boolean run() {
        SpellBook.Standard standard;
        if (lIllIlIII(this.eO.cl() ? 1 : 0) && lIllIlIII(this.eP.stunAlchOnly() ? 1 : 0)) {
            return lIllIlI[0];
        }
        if (lIllIlIIl(this.eP.stunAlchOnly() ? 1 : 0) && lIllIlIlI(Players.getLocal().getAnimation(), lIllIlI[1])) {
            return lIllIlI[0];
        }
        Item first = Inventory.getFirst((v0) -> {
            return v0.isNoted();
        });
        if (lIllIlIll(first)) {
            first = Inventory.getFirst(item -> {
                if (lIllIllIl(item.getSlot(), lIllIlI[4])) {
                    ?? r0 = lIllIlI[3];
                    "".length();
                    return "  ".length() != "  ".length() ? ((62 ^ 20) ^ (243 ^ 128)) & (((((90 + 55) - 134) + 212) ^ (((95 + 0) - 69) + 108)) ^ (-" ".length())) : r0;
                }
                return lIllIlI[0];
            });
            if (lIllIlIll(first)) {
                return lIllIlI[0];
            }
        }
        if (lIllIllII(Skills.getLevel(Skill.MAGIC), lIllIlI[2])) {
            standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            standard = SpellBook.Standard.LOW_LEVEL_ALCHEMY;
        }
        Magic.cast(standard, first);
        return lIllIlI[3];
    }

    private static boolean lIllIlIIl(int i2) {
        return i2 != 0;
    }

    private static boolean lIllIlIII(int i2) {
        return i2 == 0;
    }

    @Inject
    public aS(StunAlchTeleport stunAlchTeleport, SquireAlchTeleportConfig squireAlchTeleportConfig) {
        this.eO = stunAlchTeleport;
        this.eP = squireAlchTeleportConfig;
    }

    private static boolean lIllIllIl(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIllIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lIllIlIlI(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIllIllII(int i2, int i3) {
        return i2 >= i3;
    }

    static {
        lIllIIlll();
    }

    private static void lIllIIlll() {
        lIllIlI = new int[5];
        lIllIlI[0] = (67 ^ 100) & ((33 ^ 6) ^ (-1));
        lIllIlI[1] = -" ".length();
        lIllIlI[2] = 188 ^ 139;
        lIllIlI[3] = " ".length();
        lIllIlI[4] = (((93 + 56) - 119) + 97) ^ (19 ^ 99);
    }
}
