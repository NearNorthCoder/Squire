package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Pray Flicking", priority = Integer.MAX_VALUE)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.ad  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/ad.class */
public class C0004ad extends Task {
    private /* synthetic */ ArrayList<Prayer> dO = new ArrayList<>();
    private final /* synthetic */ SquireNightmareConfig dM;
    private static final /* synthetic */ Logger dK;
    private static /* synthetic */ String[] llllIlIIlllI;
    private final /* synthetic */ SquireNightmarePlugin dN;
    private static /* synthetic */ int[] llllIlIIllll;
    private final /* synthetic */ Client dL;

    private static boolean lIIlIIIIlIlllll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIIIIllIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIIIIllIIlII(int i) {
        return i != 0;
    }

    private static void lIIlIIIIlIlIllI() {
        llllIlIIlllI = new String[llllIlIIllll[1]];
        llllIlIIlllI[llllIlIIllll[0]] = lIIlIIIIlIlIlII("Bwizx+ccC8s=", "OFFOU");
    }

    private static boolean lIIlIIIIlIllIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIIIllIIIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIIIIlIllIII(int i) {
        return i == 0;
    }

    private static boolean lIIlIIIIlIlllIl(int i, int i2) {
        return i >= i2;
    }

    static {
        lIIlIIIIlIlIlll();
        lIIlIIIIlIlIllI();
        dK = LoggerFactory.getLogger(C0004ad.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean run() {
        if ((!lIIlIIIIlIllIII(Prayers.anyActive() ? 1 : 0) || !lIIlIIIIlIllIII(this.dL.isInInstancedRegion() ? 1 : 0)) && !lIIlIIIIlIllIIl(Skills.getBoostedLevel(Skill.PRAYER))) {
            NPC d = SquireNightmarePlugin.d();
            if (lIIlIIIIlIllIII(this.dL.isInInstancedRegion() ? 1 : 0)) {
                Prayers.disableAll();
                return llllIlIIllll[1];
            } else if (lIIlIIIIlIllIlI(d)) {
                return llllIlIIllll[0];
            } else {
                Prayers.flick(q(d.getAnimation()));
                "".length();
                return llllIlIIllll[1];
            }
        }
        return llllIlIIllll[0];
    }

    private static String lIIlIIIIlIlIlII(String lllllllllllllllIIlIllIlIlIIlIlII, String lllllllllllllllIIlIllIlIlIIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIlIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIlIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIlIIllll[5], lllllllllllllllIIlIllIlIlIIlIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlIlIIlIlIl) {
            lllllllllllllllIIlIllIlIlIIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlIlllII(int i) {
        return i > 0;
    }

    private static boolean lIIlIIIIllIIIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIIIIlIlIlll() {
        llllIlIIllll = new int[14];
        llllIlIIllll[0] = (171 ^ 180) & ((88 ^ 71) ^ (-1));
        llllIlIIllll[1] = " ".length();
        llllIlIIllll[2] = (-((-3393) & 28027)) & (-4097) & 32639;
        llllIlIIllll[3] = (((156 + 89) - 156) + 93) ^ (((17 + 103) - 74) + 144);
        llllIlIIllll[4] = "   ".length();
        llllIlIIllll[5] = "  ".length();
        llllIlIIllll[6] = (-((-17771) & 28027)) & (-17059) & 32766;
        llllIlIIllll[7] = 208 ^ 157;
        llllIlIIllll[8] = 61 ^ 57;
        llllIlIIllll[9] = (140 ^ 150) ^ (53 ^ 41);
        llllIlIIllll[10] = (-16493) & 25086;
        llllIlIIllll[11] = (-20518) & 31671;
        llllIlIIllll[12] = (-((-17987) & 24175)) & (-17473) & 32255;
        llllIlIIllll[13] = (-23618) & 32213;
    }

    @Inject
    public C0004ad(Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.dL = client;
        this.dM = squireNightmareConfig;
        this.dN = squireNightmarePlugin;
    }

    private static boolean lIIlIIIIlIllllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIIIIlIllIll(int i, int i2) {
        return i != i2;
    }

    private List<Prayer> q(int i) {
        ArrayList<Prayer> arrayList = new ArrayList<>();
        if (lIIlIIIIlIllIlI((NPC) NPCs.getAll(SquireNightmarePlugin.q.stream().mapToInt((v0) -> {
            return v0.intValue();
        }).toArray()).stream().filter(npc -> {
            if (lIIlIIIIlIllIII(npc.isDead() ? 1 : 0)) {
                ?? r0 = llllIlIIllll[1];
                "".length();
                return (-"   ".length()) > 0 ? ("   ".length() ^ (95 ^ 2)) & (((((63 + 156) - 134) + 72) ^ (((50 + 159) - 107) + 93)) ^ (-" ".length())) : r0;
            }
            return llllIlIIllll[0];
        }).min(Comparator.comparingInt(npc2 -> {
            return Players.getLocal().getWorldLocation().distanceTo(npc2.getWorldLocation());
        })).orElse(null))) {
            if (lIIlIIIIlIllIll(Static.getClient().getVarbitValue(llllIlIIllll[2]), llllIlIIllll[3])) {
                Prayer[] prayerArr = new Prayer[llllIlIIllll[4]];
                prayerArr[llllIlIIllll[0]] = Prayer.INCREDIBLE_REFLEXES;
                prayerArr[llllIlIIllll[1]] = Prayer.ULTIMATE_STRENGTH;
                prayerArr[llllIlIIllll[5]] = Prayer.STEEL_SKIN;
                arrayList.addAll(Arrays.asList(prayerArr));
                "".length();
                "".length();
                if ("   ".length() != "   ".length()) {
                    return null;
                }
            } else {
                arrayList.add(Prayer.PIETY);
                "".length();
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
        } else if (lIIlIIIIlIlllII(Vars.getBit(llllIlIIllll[6])) && lIIlIIIIlIlllIl(Skills.getLevel(Skill.PRAYER), llllIlIIllll[7])) {
            arrayList.add(Prayer.AUGURY);
            "".length();
            "".length();
            if (0 != 0) {
                return null;
            }
        } else {
            arrayList.add(Prayer.MYSTIC_MIGHT);
            "".length();
        }
        NPC d = SquireNightmarePlugin.d();
        NPC nearest = NPCs.getNearest(npc3 -> {
            if (lIIlIIIIllIIlII(npc3.getName().equalsIgnoreCase(llllIlIIlllI[llllIlIIllll[0]]) ? 1 : 0) && lIIlIIIIlIllIII(npc3.isDead() ? 1 : 0)) {
                ?? r0 = llllIlIIllll[1];
                "".length();
                return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIlIIllll[0];
        });
        if (lIIlIIIIlIllllI(nearest) && lIIlIIIIlIlllll(this.dN.Q(), llllIlIIllll[8]) && ((!lIIlIIIIllIIIII(this.dN.R(), llllIlIIllll[9]) || lIIlIIIIllIIIIl(this.dN.R(), llllIlIIllll[8])) && (!lIIlIIIIlIllIll(i, llllIlIIllll[10]) || lIIlIIIIllIIIlI(this.dN.S(), Prayer.PROTECT_FROM_MELEE)))) {
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
            "".length();
            if ((((30 ^ 99) ^ (35 ^ 103)) & (((((110 + 78) - 65) + 52) ^ (((61 + 140) - 51) + 0)) ^ (-" ".length()))) != 0) {
                return null;
            }
        } else if (lIIlIIIIlIllllI(nearest) && lIIlIIIIlIlllll(this.dN.Q(), llllIlIIllll[8]) && (!lIIlIIIIllIIIII(this.dN.R(), llllIlIIllll[9]) || lIIlIIIIllIIIIl(this.dN.R(), llllIlIIllll[4]))) {
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
            "".length();
            if ((-"   ".length()) >= 0) {
                return null;
            }
        } else if (lIIlIIIIlIllllI(nearest) && (!lIIlIIIIllIIIII(this.dN.R(), llllIlIIllll[9]) || lIIlIIIIllIIIIl(this.dN.R(), llllIlIIllll[4]))) {
            arrayList.add(Prayer.PROTECT_FROM_MAGIC);
            "".length();
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        } else if (lIIlIIIIlIlllll(d.getId(), llllIlIIllll[11])) {
            arrayList.add(Prayer.REDEMPTION);
            "".length();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        } else if (lIIlIIIIlIllIII(this.dN.al() ? 1 : 0)) {
            if (lIIlIIIIlIlllll(i, llllIlIIllll[12])) {
                arrayList.add(Prayer.PROTECT_FROM_MAGIC);
                "".length();
                this.dN.a(Prayer.PROTECT_FROM_MAGIC);
            }
            if (lIIlIIIIlIlllll(i, llllIlIIllll[13])) {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);
                "".length();
                this.dN.a(Prayer.PROTECT_FROM_MISSILES);
            }
            if (lIIlIIIIlIlllll(i, llllIlIIllll[10])) {
                arrayList.add(Prayer.PROTECT_FROM_MELEE);
                "".length();
                this.dN.a(Prayer.PROTECT_FROM_MELEE);
                "".length();
                if (0 != 0) {
                    return null;
                }
            }
        } else {
            if (lIIlIIIIlIlllll(i, llllIlIIllll[12])) {
                arrayList.add(Prayer.PROTECT_FROM_MELEE);
                "".length();
                this.dN.a(Prayer.PROTECT_FROM_MELEE);
            }
            if (lIIlIIIIlIlllll(i, llllIlIIllll[13])) {
                arrayList.add(Prayer.PROTECT_FROM_MAGIC);
                "".length();
            }
            if (lIIlIIIIlIlllll(i, llllIlIIllll[10])) {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);
                "".length();
            }
        }
        if (lIIlIIIIllIIIll(arrayList.size(), llllIlIIllll[1])) {
            this.dO = arrayList;
        }
        if (lIIlIIIIllIIIll(arrayList.size(), llllIlIIllll[1])) {
            "".length();
            if (((125 ^ 89) & ((122 ^ 94) ^ (-1))) > "  ".length()) {
                return null;
            }
            return arrayList;
        }
        return this.dO;
    }

    private static boolean lIIlIIIIllIIIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIIIlIllIIl(int i) {
        return i <= 0;
    }
}
