package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.NpcChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Attacking Whisperer", register = true)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.n  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/n.class */
public class n extends u {
    private /* synthetic */ int T;
    private static /* synthetic */ int[] lIlIlllIIllII;
    private static /* synthetic */ String[] lIlIlllIIlIll;
    private /* synthetic */ boolean U;

    private static void llIIIIlIIIlIlll() {
        lIlIlllIIlIll = new String[lIlIlllIIllII[7]];
        lIlIlllIIlIll[lIlIlllIIllII[0]] = llIIIIlIIIlIllI("DRE/IT0gF2wzJisVNjB0IR5sIjwnAzwwJisC", "NpLUT");
        lIlIlllIIlIll[lIlIlllIIllII[2]] = llIIIIlIIIlIllI("KjMuDBsA", "kGZmx");
    }

    private static void llIIIIlIIIllIII() {
        lIlIlllIIllII = new int[11];
        lIlIlllIIllII[0] = ((((50 + 133) - 32) + 2) ^ (((14 + 140) - 7) + 21)) & (((191 ^ 137) ^ (159 ^ 152)) ^ (-" ".length()));
        lIlIlllIIllII[1] = (-((-8125) & 24573)) & (-4097) & 32749;
        lIlIlllIIllII[2] = " ".length();
        lIlIlllIIllII[3] = 227 ^ 189;
        lIlIlllIIllII[4] = 144 ^ 148;
        lIlIlllIIllII[5] = (-1101) & 8014;
        lIlIlllIIllII[6] = (-8874) & 29433;
        lIlIlllIIllII[7] = "  ".length();
        lIlIlllIIllII[8] = (-((-14921) & 16122)) & (-10561) & 32767;
        lIlIlllIIllII[9] = "   ".length();
        lIlIlllIIllII[10] = (-((-16003) & 16311)) & (-8194) & 32127;
    }

    private static String llIIIIlIIIlIllI(String llllllllllllllIllIlIIIIIlIIlIIIl, String llllllllllllllIllIlIIIIIlIIlIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIIIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlIIIIIlIIIlllI = llllllllllllllIllIlIIIIIlIIlIIII.toCharArray();
        int llllllllllllllIllIlIIIIIlIIIllIl = lIlIlllIIllII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int llllllllllllllIllIlIIIIIlIIIIlIl = lIlIlllIIllII[0];
        while (llIIIIlIIIlllll(llllllllllllllIllIlIIIIIlIIIIlIl, length)) {
            sb.append((char) (charArray[llllllllllllllIllIlIIIIIlIIIIlIl] ^ llllllllllllllIllIlIIIIIlIIIlllI[llllllllllllllIllIlIIIIIlIIIllIl % llllllllllllllIllIlIIIIIlIIIlllI.length]));
            "".length();
            llllllllllllllIllIlIIIIIlIIIllIl++;
            llllllllllllllIllIlIIIIIlIIIIlIl++;
            "".length();
            if (((76 ^ 54) ^ (101 ^ 27)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v40, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        SpellBook.Ancient ancient;
        SpellBook.Ancient ancient2;
        NPC j = this.W.j();
        if (llIIIIlIIIllIIl(this.U ? 1 : 0) && llIIIIlIIIllIlI(j.getId(), lIlIlllIIllII[1])) {
            int i = this.T - lIlIlllIIllII[2];
            this.T = i;
            if (llIIIIlIIIllIll(i)) {
                return lIlIlllIIllII[2];
            }
            if (llIIIIlIIIlllII(Skills.getBoostedLevel(Skill.MAGIC), lIlIlllIIllII[3])) {
                ancient2 = SpellBook.Ancient.ICE_BARRAGE;
                "".length();
                if (((55 ^ 93) ^ (66 ^ 44)) < 0) {
                    return ((((61 + 34) - 8) + 56) ^ (((31 + 124) - 97) + 77)) & (((((6 + 23) - (-90)) + 24) ^ (((103 + 66) - 157) + 123)) ^ (-" ".length()));
                }
            } else {
                ancient2 = SpellBook.Ancient.ICE_BLITZ;
            }
            SpellBook.Ancient ancient3 = ancient2;
            if (llIIIIlIIIlllIl(ancient3.canCast() ? 1 : 0)) {
                Log.info(lIlIlllIIlIll[lIlIlllIIllII[0]]);
                Magic.cast(ancient3, j);
                this.U = lIlIlllIIllII[2];
                return lIlIlllIIllII[2];
            }
        }
        if (llIIIIlIIIllllI(Players.getLocal().getInteracting())) {
            return lIlIlllIIllII[0];
        }
        this.w.b(this.w.c());
        "".length();
        int[] iArr = new int[lIlIlllIIllII[4]];
        iArr[lIlIlllIIllII[0]] = lIlIlllIIllII[5];
        iArr[lIlIlllIIllII[2]] = lIlIlllIIllII[6];
        iArr[lIlIlllIIllII[7]] = lIlIlllIIllII[8];
        iArr[lIlIlllIIllII[9]] = lIlIlllIIllII[10];
        if (!llIIIIlIIIlllIl(Equipment.contains(iArr) ? 1 : 0)) {
            j.interact(lIlIlllIIlIll[lIlIlllIIllII[2]]);
            return lIlIlllIIllII[2];
        }
        if (llIIIIlIIIlllII(Skills.getBoostedLevel(Skill.MAGIC), lIlIlllIIllII[3])) {
            ancient = SpellBook.Ancient.ICE_BARRAGE;
            "".length();
            if (" ".length() <= 0) {
                return ((((30 + 102) - 96) + 128) ^ (((155 + 56) - 140) + 105)) & (((11 ^ 34) ^ (35 ^ 30)) ^ (-" ".length()));
            }
        } else {
            ancient = SpellBook.Ancient.ICE_BLITZ;
        }
        Magic.cast(ancient, j);
        return lIlIlllIIllII[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(NpcChanged npcChanged) {
        if (llIIIIlIIIllIlI(npcChanged.getNpc().getId(), lIlIlllIIllII[1])) {
            this.U = lIlIlllIIllII[0];
            this.T = lIlIlllIIllII[4];
        }
    }

    private static boolean llIIIIlIIIlllll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIlIIIlllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIIlIIIllIll(int i) {
        return i > 0;
    }

    private static boolean llIIIIlIIIllIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIIlIIIlllIl(int i) {
        return i != 0;
    }

    private static boolean llIIIIlIIIllIIl(int i) {
        return i == 0;
    }

    private static boolean llIIIIlIIIllllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public void e() {
        this.U = lIlIlllIIllII[0];
        this.T = lIlIlllIIllII[0];
    }

    static {
        llIIIIlIIIllIII();
        llIIIIlIIIlIlll();
    }
}
