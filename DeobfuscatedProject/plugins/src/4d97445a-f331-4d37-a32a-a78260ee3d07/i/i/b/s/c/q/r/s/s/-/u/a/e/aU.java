/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.client.Static
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

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

@TaskDesc(name="Teleporting")
public class aU
extends Task {
    private final /* synthetic */ List<Spell> fa;
    private static /* synthetic */ int[] lIllIlIlI;
    public static /* synthetic */ int fc;
    private static final /* synthetic */ int eY;
    private static final /* synthetic */ int eZ;
    private final /* synthetic */ StunAlchTeleport eX;
    private final /* synthetic */ List<Spell> fb;
    private final /* synthetic */ SquireAlchTeleportConfig fd;

    static {
        aU.lIIllllIIII();
        eZ = lIllIlIlI[1];
        eY = lIllIlIlI[0];
        fc = Static.getClient().getTickCount();
    }

    private static boolean lIIllllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllllIlIl(Object object) {
        return object == null;
    }

    private static boolean lIIllllIlII(int n2) {
        return n2 >= 0;
    }

    @Inject
    public aU(StunAlchTeleport stunAlchTeleport, SquireAlchTeleportConfig squireAlchTeleportConfig) {
        this.fa = List.of(SpellBook.Standard.ARDOUGNE_TELEPORT, SpellBook.Standard.FALADOR_TELEPORT);
        this.fb = List.of(SpellBook.Standard.CAMELOT_TELEPORT, SpellBook.Standard.FALADOR_TELEPORT, SpellBook.Standard.LUMBRIDGE_TELEPORT, SpellBook.Standard.VARROCK_TELEPORT);
        this.eX = stunAlchTeleport;
        this.fd = squireAlchTeleportConfig;
    }

    private static void lIIllllIIII() {
        lIllIlIlI = new int[5];
        aU.lIllIlIlI[0] = 0xFFFFE7DF & 0x1AE9;
        aU.lIllIlIlI[1] = -(0xFFFFF3FF & 0x7D27) & (0xFFFFF7FE & 0x7BEF);
        aU.lIllIlIlI[2] = (0x71 ^ 0x59) & ~(0x22 ^ 0xA);
        aU.lIllIlIlI[3] = "  ".length();
        aU.lIllIlIlI[4] = " ".length();
    }

    private static boolean lIIllllIIIl(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        List<Spell> list;
        int lIllllIIlIlllII;
        aU lIllllIIlIllllI;
        Player player = Players.getLocal();
        if (aU.lIIllllIIIl(player.getAnimation(), lIllIlIlI[0]) && aU.lIIllllIIIl(player.getAnimation(), lIllIlIlI[1]) && aU.lIIllllIIlI(this.fd.stunAlchOnly() ? 1 : 0)) {
            return lIllIlIlI[2];
        }
        if (aU.lIIllllIIll(lIllllIIlIllllI.eX.cl() ? 1 : 0)) {
            lIllllIIlIllllI.eX.d(lIllIlIlI[2]);
        }
        if (aU.lIIllllIlII(fc - (lIllllIIlIlllII = Static.getClient().getTickCount()))) {
            return lIllIlIlI[2];
        }
        Spell lIllllIIlIllIll = null;
        if (aU.lIIllllIIll(lIllllIIlIllllI.fd.stunAlchOnly() ? 1 : 0)) {
            list = lIllllIIlIllllI.fb;
            "".length();
            if (((0x7B ^ 0x1A ^ (0x33 ^ 6)) & (0x7F ^ 0x6E ^ (0x86 ^ 0xC3) ^ -" ".length())) != ((0x6D ^ 2 ^ (0x39 ^ 0x34)) & (202 + 167 - 286 + 125 ^ 137 + 74 - 97 + 64 ^ -" ".length()))) {
                return ((45 + 173 - 76 + 89 ^ 125 + 25 - 97 + 139) & (0x24 ^ 0x1B ^ (0xDC ^ 0xC4) ^ -" ".length())) != 0;
            }
        } else {
            list = lIllllIIlIllllI.fa;
        }
        List<Spell> lIllllIIlIllIlI = list;
        Iterator<Spell> lIllllIIlIllIIl = lIllllIIlIllIlI.iterator();
        while (aU.lIIllllIIll(lIllllIIlIllIIl.hasNext() ? 1 : 0)) {
            Spell lIllllIIlIllIII = lIllllIIlIllIIl.next();
            if (aU.lIIllllIIll(Magic.canCast((Spell)lIllllIIlIllIII) ? 1 : 0)) {
                lIllllIIlIllIll = lIllllIIlIllIII;
                "".length();
                if ((0x15 ^ 0x2C ^ (0x57 ^ 0x6A)) != 0) break;
                return ((0x4F ^ 0x60 ^ (0x26 ^ 0x51)) & (7 + 16 - 2 + 136 ^ 168 + 57 - 31 + 3 ^ -" ".length()) & ((49 + 12 - -40 + 41 ^ 82 + 140 - 141 + 78) & (0x42 ^ 0x6D ^ (0x76 ^ 0x48) ^ -" ".length()) ^ -" ".length())) != 0;
            }
            "".length();
            if (null == null) continue;
            return ((0xDD ^ 0x85 ^ (0x18 ^ 0x73)) & (28 + 88 - 72 + 83 ^ (0x21 ^ 0x6D) ^ -" ".length())) != 0;
        }
        if (aU.lIIllllIlIl(lIllllIIlIllIll)) {
            return lIllIlIlI[2];
        }
        Magic.cast((Spell)var3_3);
        fc = Static.getClient().getTickCount() + lIllIlIlI[3];
        return lIllIlIlI[4];
    }

    private static boolean lIIllllIIlI(int n2) {
        return n2 == 0;
    }
}

