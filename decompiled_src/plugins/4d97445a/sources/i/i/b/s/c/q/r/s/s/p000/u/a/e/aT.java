package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.magic.stunalchtp.SquireAlchTeleportConfig;
import gg.squire.basics.magic.stunalchtp.StunAlchTeleport;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Stunning", priority = 3, register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aT  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aT.class */
public class aT extends Task {
    private final /* synthetic */ SquireAlchTeleportConfig eU;
    private static final /* synthetic */ int eT;
    private static /* synthetic */ String[] llIIIIlIl;
    private static /* synthetic */ int[] llIIIIllI;
    private final /* synthetic */ StunAlchTeleport eS;
    private final /* synthetic */ List<Spell> eV = List.of(SpellBook.Standard.STUN, SpellBook.Standard.ENFEEBLE, SpellBook.Standard.VULNERABILITY, SpellBook.Standard.CURSE, SpellBook.Standard.WEAKEN, SpellBook.Standard.CONFUSE);
    private final /* synthetic */ List<Integer> eW = List.of(Integer.valueOf(llIIIIllI[0]), Integer.valueOf(llIIIIllI[1]), Integer.valueOf(llIIIIllI[2]), Integer.valueOf(llIIIIllI[3]), Integer.valueOf(llIIIIllI[4]), Integer.valueOf(llIIIIllI[5]));

    private static boolean lIlIlIlIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIlIlIlII(Object obj) {
        return obj == null;
    }

    @Inject
    public aT(StunAlchTeleport stunAlchTeleport, SquireAlchTeleportConfig squireAlchTeleportConfig) {
        this.eS = stunAlchTeleport;
        this.eU = squireAlchTeleportConfig;
    }

    private static void lIlIlIlIIII() {
        llIIIIlIl = new String[llIIIIllI[9]];
        llIIIIlIl[llIIIIllI[6]] = lIlIlIIlllI("6Rm7QLtHbUE=", "fWIGN");
        llIIIIlIl[llIIIIllI[8]] = lIlIlIIllll("D7u/DHHLSIk=", "TcNbr");
    }

    private static boolean lIlIlIlIIll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlIlIlIIlI(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIlIlIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    public boolean run() {
        Player local = Players.getLocal();
        if (!lIlIlIlIIlI(this.eU.stunAlchOnly() ? 1 : 0) && !lIlIlIlIIll(local.getAnimation(), llIIIIllI[7]) && !lIlIlIlIIlI(this.eS.cl() ? 1 : 0)) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIlIlIlIIlI(npc.getName().equals(llIIIIlIl[llIIIIllI[8]]) ? 1 : 0) && lIlIlIlIlll(npc.getInteracting(), local)) {
                    ?? r0 = llIIIIllI[8];
                    "".length();
                    return (-(42 ^ 46)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIIIllI[6];
            });
            if (lIlIlIlIlII(nearest)) {
                nearest = NPCs.getNearest(npc2 -> {
                    if (lIlIlIlIIlI(npc2.getName().equals(llIIIIlIl[llIIIIllI[6]]) ? 1 : 0) && lIlIlIlIlII(npc2.getInteracting())) {
                        ?? r0 = llIIIIllI[8];
                        "".length();
                        return " ".length() == "   ".length() ? ((((47 + 62) - 105) + 154) ^ (((167 + 46) - 204) + 164)) & (((((55 + 6) - (-37)) + 51) ^ (((39 + 24) - (-53)) + 50)) ^ (-" ".length())) : r0;
                    }
                    return llIIIIllI[6];
                });
                if (lIlIlIlIlII(nearest)) {
                    return llIIIIllI[6];
                }
            }
            Spell spell = null;
            Iterator<Spell> it = this.eV.iterator();
            do {
                if (lIlIlIlIIlI(it.hasNext() ? 1 : 0)) {
                    Spell next = it.next();
                    if (lIlIlIlIIlI(next.canCast() ? 1 : 0)) {
                        spell = next;
                        "".length();
                        if ((-" ".length()) >= (70 ^ 66)) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        "".length();
                    }
                }
                if (lIlIlIlIlII(spell)) {
                    return llIIIIllI[6];
                }
                spell.castOn(nearest);
                sleep(llIIIIllI[8]);
                return llIIIIllI[8];
            } while ("  ".length() >= 0);
            return (true ^ true) & ((true ^ true) ^ true);
        }
        return llIIIIllI[6];
    }

    private static String lIlIlIIllll(String lIllIlllIllllll, String lIllIlllIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlllIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIIllI[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIllllIIIIII) {
            lIllIllllIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlIllI(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    public void a(StatChanged statChanged) {
        if (lIlIlIlIlIl(statChanged.getSkill(), Skill.MAGIC)) {
            return;
        }
        int cm = this.eS.cm();
        int xp = statChanged.getXp();
        this.eS.z(xp);
        int i2 = xp - cm;
        if (!lIlIlIlIllI(i2) && lIlIlIlIIlI(this.eW.contains(Integer.valueOf(i2)) ? 1 : 0)) {
            this.eS.d(llIIIIllI[8]);
        }
    }

    static {
        lIlIlIlIIIl();
        lIlIlIlIIII();
        eT = llIIIIllI[7];
    }

    private static void lIlIlIlIIIl() {
        llIIIIllI = new int[11];
        llIIIIllI[0] = (((62 + 206) - 159) + 129) ^ (((106 + 37) - 138) + 175);
        llIIIIllI[1] = 2 ^ 81;
        llIIIIllI[2] = (166 ^ 162) ^ (56 ^ 112);
        llIIIIllI[3] = 184 ^ 165;
        llIIIIllI[4] = 21 ^ 0;
        llIIIIllI[5] = 1 ^ 12;
        llIIIIllI[6] = ((((87 + 136) - 20) + 3) ^ (((18 + 90) - 44) + 76)) & (((((103 + 75) - 68) + 89) ^ (((126 + 98) - 137) + 46)) ^ (-" ".length()));
        llIIIIllI[7] = (-((-219) & 32219)) & (-33) & 32746;
        llIIIIllI[8] = " ".length();
        llIIIIllI[9] = "  ".length();
        llIIIIllI[10] = "  ".length() ^ (50 ^ 56);
    }

    private static String lIlIlIIlllI(String lIllIlllIllIIlI, String lIllIlllIllIIIl) {
        try {
            SecretKeySpec lIllIlllIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlllIllIIIl.getBytes(StandardCharsets.UTF_8)), llIIIIllI[10]), "DES");
            Cipher lIllIlllIllIlII = Cipher.getInstance("DES");
            lIllIlllIllIlII.init(llIIIIllI[9], lIllIlllIllIlIl);
            return new String(lIllIlllIllIlII.doFinal(Base64.getDecoder().decode(lIllIlllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIlllIllIIll) {
            lIllIlllIllIIll.printStackTrace();
            return null;
        }
    }
}
