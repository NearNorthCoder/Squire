package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.p  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/p.class */
public class C0015p implements K {
    private static /* synthetic */ String[] lIlIIIIllI;
    public static /* synthetic */ List<C0003d> bp;
    public static /* synthetic */ int[] cE;
    public static /* synthetic */ WorldArea cF;
    public static /* synthetic */ WorldPoint cK;
    public static /* synthetic */ WorldArea cH;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ int[] lIlIIIIlll;
    public static /* synthetic */ WorldPoint ce;
    public static /* synthetic */ WorldPoint cJ;
    public static /* synthetic */ WorldArea cG;
    public static /* synthetic */ WorldArea cd;
    public static /* synthetic */ WorldPoint cI;
    public static /* synthetic */ boolean cD;

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIIIIllI[lIlIIIIlll[57]];
    }

    public static void aM() {
        if (lIIIlIIlIIIIl(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[8]) && lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIIIlIIlIIIll(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[8]) && lIIIlIIlIIIIl(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[19]) && lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIIIlIIlIIIll(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[8]) && lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[19]) && lIIIlIIlIIIIl(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[36]) && lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIIIlIIlIIIIl(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[37]) && lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[19]) && lIIIlIIlIIIll(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[36]) && lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIIIlIIlIIIll(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[37]) && lIIIlIIlIIIIl(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[37]) && lIIIlIIlIIIll(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[36]) && lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIIIlIIlIIIll(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[37]) && lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[37]) && lIIIlIIlIIIIl(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[40]) && lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIIIlIIlIIIIl(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[2]) && lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[37]) && lIIIlIIlIIIll(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[40]) && lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIIIlIIlIIIll(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[2]) && lIIIlIIlIIIIl(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[2]) && lIIIlIIlIIIll(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[40]) && lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIIIlIIlIIIll(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[2]) && lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[2]) && lIIIlIIlIIIIl(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[4]) && lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIIIlIIlIIIIl(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[3]) && lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[2]) && lIIIlIIlIIIll(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[4]) && lIIIlIIlIlIll(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
    }

    private static boolean lIIIlIIlIllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void ak() {
        if (lIIIlIIlIIllI(lIIIlIIlIlIlI(C0004e.u(), 30.0d))) {
            int[] iArr = new int[lIlIIIIlll[1]];
            iArr[lIlIIIIlll[0]] = lIlIIIIlll[12];
            if (lIIIlIIlIIIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIIIlll[1]];
                iArr2[lIlIIIIlll[0]] = lIlIIIIlll[12];
                Inventory.getFirst(iArr2).interact(lIlIIIIllI[lIlIIIIlll[4]]);
                Time.sleepTicks(lIlIIIIlll[1]);
                "".length();
            }
        }
        C0004e.D();
        if (lIIIlIIlIlIIl(Players.getLocal().getInteracting())) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (!lIIIlIIlIIIlI(npc.getName().contains(lIlIIIIllI[lIlIIIIlll[25]]) ? 1 : 0) || lIIIlIIlIIIII(npc.getName().contains(lIlIIIIllI[lIlIIIIlll[49]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIIIIlll[1]];
                    strArr[lIlIIIIlll[0]] = lIlIIIIllI[lIlIIIIlll[71]];
                    if (lIIIlIIlIIIII(npc.hasAction(strArr) ? 1 : 0) && lIIIlIIlIlIIl(npc.getInteracting()) && lIIIlIIlIIIlI(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lIlIIIIlll[1];
                        "".length();
                        return (-((244 ^ 143) ^ (((118 + 13) - 89) + 85))) > 0 ? ((25 ^ 68) ^ (245 ^ 143)) & (((((102 + 71) - 8) + 19) ^ (((33 + 99) - 13) + 40)) ^ (-" ".length())) : r0;
                    }
                }
                return lIlIIIIlll[0];
            });
            String[] strArr = new String[lIlIIIIlll[1]];
            strArr[lIlIIIIlll[0]] = lIlIIIIllI[lIlIIIIlll[44]];
            List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                if (lIIIlIIlIllIl(npc2.getInteracting(), Players.getLocal())) {
                    ?? r0 = lIlIIIIlll[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIlIIIIlll[0];
            }).collect(Collectors.toList());
            if (lIIIlIIlIIlII(nearest) && lIIIlIIlIIIII(list.isEmpty() ? 1 : 0) && lIIIlIIlIIIlI(Players.getLocal().isMoving() ? 1 : 0)) {
                nearest.interact(lIlIIIIllI[lIlIIIIlll[45]]);
                Time.sleepTicks(lIlIIIIlll[6]);
                "".length();
            }
            if (lIIIlIIlIIIlI(list.isEmpty() ? 1 : 0) && lIIIlIIlIlIIl(Players.getLocal().getInteracting())) {
                ((NPC) list.get(lIlIIIIlll[0])).interact(lIlIIIIllI[lIlIIIIlll[46]]);
                Time.sleepTicks(lIlIIIIlll[6]);
                "".length();
            }
        }
    }

    private static void lIIIlIIIlllIl() {
        lIlIIIIllI = new String[lIlIIIIlll[89]];
        lIlIIIIllI[lIlIIIIlll[0]] = lIIIlIIIllIlI("IQcIDBkEUhgREg4B", "crqew");
        lIlIIIIllI[lIlIIIIlll[1]] = lIIIlIIIllIll("pM2m+10H2V5vEqMZioBQ6shpGZt6AbqAvkQuJJrCFYK+OFTcvJvwa8nqDtoaZgGA4/pPTR048Yk=", "MByBp");
        lIlIIIIllI[lIlIIIIlll[5]] = lIIIlIIIlllII("eYUW6q0mOYX88rkSoRxYHGQqi6Lbf1eK", "DfLwp");
        lIlIIIIllI[lIlIIIIlll[6]] = lIIIlIIIllIll("SjeqPoDel/1VbxCV63v6pO4BLUXZL1f5", "ZFaMA");
        lIlIIIIllI[lIlIIIIlll[8]] = lIIIlIIIlllII("0TN5O0lLty9Ja0J51u6WAuu7bi1LHCf3atsiMlYm5P6h/vqljmdeGbas8yPpVxlf", "HcIfs");
        lIlIIIIllI[lIlIIIIlll[9]] = lIIIlIIIllIlI("Ll8DHAYkCBY=", "Hmsqc");
        lIlIIIIllI[lIlIIIIlll[19]] = lIIIlIIIllIll("TSPegc/BlKc=", "gtdne");
        lIlIIIIllI[lIlIIIIlll[36]] = lIIIlIIIlllII("EW4fh4V+AG6QkT8hZ2glg7cshqixZXH2", "EVhfA");
        lIlIIIIllI[lIlIIIIlll[37]] = lIIIlIIIllIll("SuWWTzRQ4TOHr5S+Lf4YjQ==", "omzPo");
        lIlIIIIllI[lIlIIIIlll[38]] = lIIIlIIIllIll("oUcQka0KeglLJDXzCIxePg==", "xGYJj");
        lIlIIIIllI[lIlIIIIlll[39]] = lIIIlIIIlllII("94yMEqdkOoFx71BcdwHp7w==", "RmMme");
        lIlIIIIllI[lIlIIIIlll[40]] = lIIIlIIIlllII("6Me/pTq12v686YKN5poHJ/5+z5RSphbe", "cduGx");
        lIlIIIIllI[lIlIIIIlll[2]] = lIIIlIIIllIll("uDmgd/NGlBE=", "vHuMG");
        lIlIIIIllI[lIlIIIIlll[41]] = lIIIlIIIllIll("05orNRcreSb6lTb6vuAnPA==", "SWEoq");
        lIlIIIIllI[lIlIIIIlll[3]] = lIIIlIIIllIlI("MhAMJQAYDRYjQxALDzc=", "sdxDc");
        lIlIIIIllI[lIlIIIIlll[4]] = lIIIlIIIllIll("wGza1I9JnUE=", "WpXwU");
        lIlIIIIllI[lIlIIIIlll[44]] = lIIIlIIIllIll("V5+Kppp8UCI=", "kBhZX");
        lIlIIIIllI[lIlIIIIlll[45]] = lIIIlIIIllIll("l2DF+NYWlmw=", "DLPqz");
        lIlIIIIllI[lIlIIIIlll[46]] = lIIIlIIIllIlI("FhMVEjk8", "WgasZ");
        lIlIIIIllI[lIlIIIIlll[47]] = lIIIlIIIlllII("DK+YszOPu0U=", "dDlzL");
        lIlIIIIllI[lIlIIIIlll[20]] = lIIIlIIIllIll("u7w2xKYA1Lw=", "qTFqP");
        lIlIIIIllI[lIlIIIIlll[48]] = lIIIlIIIllIll("nlBxqTiB8cM=", "Cflrh");
        lIlIIIIllI[lIlIIIIlll[50]] = lIIIlIIIllIll("CsMnLiXKLpU=", "TAidw");
        lIlIIIIllI[lIlIIIIlll[51]] = lIIIlIIIllIll("rRL0aT60FT0=", "FKZoy");
        lIlIIIIllI[lIlIIIIlll[52]] = lIIIlIIIllIlI("CSkfeQIoaAo2ATQ=", "GHiYv");
        lIlIIIIllI[lIlIIIIlll[53]] = lIIIlIIIllIll("fmo3RnayEGbXPT+e58q+Lw==", "pvRav");
        lIlIIIIllI[lIlIIIIlll[57]] = lIIIlIIIllIlI("ZEFIRXl6QlJUADAfAhE=", "UsgtM");
        lIlIIIIllI[lIlIIIIlll[59]] = lIIIlIIIlllII("crOykNScuGk=", "dOgxI");
        lIlIIIIllI[lIlIIIIlll[60]] = lIIIlIIIllIll("hVlz8EO6IZA=", "EhKgC");
        lIlIIIIllI[lIlIIIIlll[61]] = lIIIlIIIllIlI("OSEC", "iWRbG");
        lIlIIIIllI[lIlIIIIlll[21]] = lIIIlIIIlllII("qVCcs9x8+g4=", "HvOha");
        lIlIIIIllI[lIlIIIIlll[64]] = lIIIlIIIllIlI("IiI7DAMLNA==", "nGZkv");
        lIlIIIIllI[lIlIIIIlll[65]] = lIIIlIIIllIll("9X8Z/gBLTvY=", "ZcTRx");
        lIlIIIIllI[lIlIIIIlll[66]] = lIIIlIIIlllII("GAjm4udvZZU=", "OoVEL");
        lIlIIIIllI[lIlIIIIlll[67]] = lIIIlIIIllIll("P1IsAp76SPo=", "UzCKJ");
        lIlIIIIllI[lIlIIIIlll[68]] = lIIIlIIIllIlI("Fg03AiUzBg==", "RhVfH");
        lIlIIIIllI[lIlIIIIlll[69]] = lIIIlIIIlllII("dfb4fcTeLIxPTJr2NeDyfA==", "FQAWK");
        lIlIIIIllI[lIlIIIIlll[70]] = lIIIlIIIlllII("hjeRJbZwNrs=", "utjLU");
        lIlIIIIllI[lIlIIIIlll[24]] = lIIIlIIIlllII("NzZWlanSmDo=", "nvtVf");
        lIlIIIIllI[lIlIIIIlll[25]] = lIIIlIIIllIll("uFMR9fSUMOY=", "sdPmX");
        lIlIIIIllI[lIlIIIIlll[49]] = lIIIlIIIllIlI("Fwk9", "TfJKE");
        lIlIIIIllI[lIlIIIIlll[71]] = lIIIlIIIllIll("U8dT0ceq8zo=", "nUGmi");
        lIlIIIIllI[lIlIIIIlll[72]] = lIIIlIIIlllII("MhraHlTFTys=", "uRUhu");
        lIlIIIIllI[lIlIIIIlll[73]] = lIIIlIIIlllII("Pe7dr9TMfZs=", "tJSth");
    }

    private static boolean lIIIlIIlIIIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIIlIIlIIIlI(int i) {
        return i == 0;
    }

    private static String lIIIlIIIllIlI(String llllllllllllllllllllIlIIllllIIII, String llllllllllllllllllllIlIIlllIllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllllIlIIllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIlIIlllIlllI = new StringBuilder();
        char[] llllllllllllllllllllIlIIlllIllIl = llllllllllllllllllllIlIIlllIllll.toCharArray();
        int llllllllllllllllllllIlIIlllIllII = lIlIIIIlll[0];
        char[] charArray = str.toCharArray();
        int llllllllllllllllllllIlIIlllIIlIl = charArray.length;
        int i = lIlIIIIlll[0];
        while (lIIIlIIlIIIIl(i, llllllllllllllllllllIlIIlllIIlIl)) {
            char llllllllllllllllllllIlIIllllIIIl = charArray[i];
            llllllllllllllllllllIlIIlllIlllI.append((char) (llllllllllllllllllllIlIIllllIIIl ^ llllllllllllllllllllIlIIlllIllIl[llllllllllllllllllllIlIIlllIllII % llllllllllllllllllllIlIIlllIllIl.length]));
            "".length();
            llllllllllllllllllllIlIIlllIllII++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllIlIIlllIlllI);
    }

    private static boolean lIIIlIIlIlIII(int i, int i2) {
        return i <= i2;
    }

    static {
        lIIIlIIIllllI();
        lIIIlIIIlllIl();
        bp = new ArrayList();
        int[] iArr = new int[lIlIIIIlll[9]];
        iArr[lIlIIIIlll[0]] = lIlIIIIlll[14];
        iArr[lIlIIIIlll[1]] = lIlIIIIlll[15];
        iArr[lIlIIIIlll[5]] = lIlIIIIlll[17];
        iArr[lIlIIIIlll[6]] = lIlIIIIlll[16];
        iArr[lIlIIIIlll[8]] = lIlIIIIlll[18];
        cE = iArr;
        cF = new WorldArea(lIlIIIIlll[74], lIlIIIIlll[75], lIlIIIIlll[40], lIlIIIIlll[40], lIlIIIIlll[0]);
        cG = new WorldArea(lIlIIIIlll[76], lIlIIIIlll[77], lIlIIIIlll[48], lIlIIIIlll[44], lIlIIIIlll[0]);
        cH = new WorldArea(lIlIIIIlll[78], lIlIIIIlll[79], lIlIIIIlll[80], lIlIIIIlll[21], lIlIIIIlll[0]);
        cI = new WorldPoint(lIlIIIIlll[81], lIlIIIIlll[82], lIlIIIIlll[0]);
        ce = new WorldPoint(lIlIIIIlll[83], lIlIIIIlll[75], lIlIIIIlll[0]);
        cJ = new WorldPoint(lIlIIIIlll[84], lIlIIIIlll[85], lIlIIIIlll[0]);
        cd = new WorldArea(lIlIIIIlll[86], lIlIIIIlll[87], lIlIIIIlll[67], lIlIIIIlll[53], lIlIIIIlll[0]);
        cK = new WorldPoint(lIlIIIIlll[88], lIlIIIIlll[43], lIlIIIIlll[0]);
    }

    private static int lIIIlIIlIlIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIIlIIlIIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlIIlIllII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIlIIlIIlII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlIIlIIlIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[2]) && lIIIlIIlIIIll(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[3]) && lIIIlIIlIIIll(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[4])) {
            ?? r0 = lIlIIIIlll[1];
            "".length();
            return "   ".length() <= "  ".length() ? ((((15 + 182) - (-2)) + 55) ^ (((106 + 16) - 39) + 108)) & (((66 ^ 92) ^ (244 ^ 171)) ^ (-" ".length())) : r0;
        }
        return lIlIIIIlll[0];
    }

    private static boolean lIIIlIIlIlIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIIIIlll[0];
    }

    private static boolean lIIIlIIlIIIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ab, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e5, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x011f, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aK() {
        int[] iArr = new int[lIlIIIIlll[1]];
        iArr[lIlIIIIlll[0]] = lIlIIIIlll[14];
        if (lIIIlIIlIIIlI(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIIIIlll[1]];
            iArr2[lIlIIIIlll[0]] = lIlIIIIlll[14];
        }
        int[] iArr3 = new int[lIlIIIIlll[1]];
        iArr3[lIlIIIIlll[0]] = lIlIIIIlll[15];
        if (lIIIlIIlIIIlI(Equipment.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lIlIIIIlll[1]];
            iArr4[lIlIIIIlll[0]] = lIlIIIIlll[15];
        }
        int[] iArr5 = new int[lIlIIIIlll[1]];
        iArr5[lIlIIIIlll[0]] = lIlIIIIlll[16];
        if (lIIIlIIlIIIlI(Equipment.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lIlIIIIlll[1]];
            iArr6[lIlIIIIlll[0]] = lIlIIIIlll[16];
        }
        int[] iArr7 = new int[lIlIIIIlll[1]];
        iArr7[lIlIIIIlll[0]] = lIlIIIIlll[17];
        if (lIIIlIIlIIIlI(Equipment.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lIlIIIIlll[1]];
            iArr8[lIlIIIIlll[0]] = lIlIIIIlll[17];
        }
        int[] iArr9 = new int[lIlIIIIlll[1]];
        iArr9[lIlIIIIlll[0]] = lIlIIIIlll[18];
        if (lIIIlIIlIIIlI(Equipment.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[lIlIIIIlll[1]];
            iArr10[lIlIIIIlll[0]] = lIlIIIIlll[18];
        }
        int[] iArr11 = new int[lIlIIIIlll[1]];
        iArr11[lIlIIIIlll[0]] = lIlIIIIlll[12];
        if (lIIIlIIlIIIII(Inventory.contains(iArr11) ? 1 : 0)) {
            ?? r0 = lIlIIIIlll[1];
            "".length();
            return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIIIlll[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x02bd, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v145, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v178, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aH() {
        if (lIIIlIIlIIIII(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[0]];
            C0001b.a(bp);
            if (lIIIlIIlIIIIl(bp.size(), lIlIIIIlll[1])) {
                System.out.println(lIlIIIIllI[lIlIIIIlll[1]]);
                bn = lIlIIIIlll[0];
            }
        }
        if (lIIIlIIlIIIlI(bn ? 1 : 0)) {
            if (lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[2]) && lIIIlIIlIIIll(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[3]) && !lIIIlIIlIIIIl(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[4])) {
                return;
            }
            if (lIIIlIIlIIIlI(aK() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIlIIlIIlII(nearest) && lIIIlIIlIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[5]];
                    C0000a.a(nearest);
                }
                if (lIIIlIIlIIlII(nearest) && lIIIlIIlIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[6]];
                    if (lIIIlIIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIIIlll[7]);
                        "".length();
                    }
                    if (lIIIlIIlIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIlIIlIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIIIlll[1]);
                            "".length();
                        }
                        if (lIIIlIIlIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIIIIlll[5]);
                            "".length();
                        }
                        if (lIIIlIIlIIIlI(aL() ? 1 : 0)) {
                            O();
                            System.out.println(lIlIIIIllI[lIlIIIIlll[8]]);
                            bn = lIlIIIIlll[1];
                            return;
                        }
                        if (lIIIlIIlIIIlI(cD ? 1 : 0)) {
                            C0007h.V();
                            cD = lIlIIIIlll[1];
                        }
                        while (lIIIlIIlIIIlI(C0007h.bo ? 1 : 0) && lIIIlIIlIIIlI(AccBuilderShamans.d ? 1 : 0)) {
                            C0007h.d(lIlIIIIllI[lIlIIIIlll[9]]);
                            Time.sleepTicks(lIlIIIIlll[1]);
                            "".length();
                            "".length();
                            if ((-" ".length()) > 0) {
                                return;
                            }
                        }
                        C0000a.a(cE, lIlIIIIlll[1]);
                        C0000a.a(lIlIIIIlll[10], lIlIIIIlll[11]);
                        C0000a.b(C0005f.aU, lIlIIIIlll[1]);
                        if (lIIIlIIlIIIII(Inventory.contains(cE) ? 1 : 0)) {
                            C0000a.a(lIlIIIIlll[12], lIlIIIIlll[13]);
                        }
                    }
                }
            }
            if (lIIIlIIlIIIII(aK() ? 1 : 0)) {
                aJ();
                cD = lIlIIIIlll[0];
                if (lIIIlIIlIIIll(Movement.getRunEnergy(), lIlIIIIlll[4]) && lIIIlIIlIIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                int[] iArr = new int[lIlIIIIlll[1]];
                iArr[lIlIIIIlll[0]] = lIlIIIIlll[14];
                if (lIIIlIIlIIIlI(Equipment.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIIIIlll[1]];
                    iArr2[lIlIIIIlll[0]] = lIlIIIIlll[15];
                    if (lIIIlIIlIIIlI(Equipment.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIlIIIIlll[1]];
                        iArr3[lIlIIIIlll[0]] = lIlIIIIlll[16];
                        if (lIIIlIIlIIIlI(Equipment.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIlIIIIlll[1]];
                            iArr4[lIlIIIIlll[0]] = lIlIIIIlll[17];
                            if (lIIIlIIlIIIlI(Equipment.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIlIIIIlll[1]];
                                iArr5[lIlIIIIlll[0]] = lIlIIIIlll[18];
                            }
                        }
                    }
                }
                aM();
                if (lIIIlIIlIIllI(lIIIlIIIlllll(C0004e.u(), 45.0d))) {
                    int[] iArr6 = new int[lIlIIIIlll[1]];
                    iArr6[lIlIIIIlll[0]] = lIlIIIIlll[12];
                    if (lIIIlIIlIIIII(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIlIIIIlll[1]];
                        iArr7[lIlIIIIlll[0]] = lIlIIIIlll[12];
                        Inventory.getFirst(iArr7).interact(lIlIIIIllI[lIlIIIIlll[19]]);
                        Time.sleepTicks(lIlIIIIlll[1]);
                        "".length();
                    }
                }
                if (lIIIlIIlIIIIl(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[20]) && lIIIlIIlIIIIl(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[20])) {
                    aI();
                }
                if ((lIIIlIIlIIIIl(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[21]) && !lIIIlIIlIIIIl(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[20])) || ((lIIIlIIlIIIIl(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[21]) && !lIIIlIIlIIIIl(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[20])) || ((lIIIlIIlIIIIl(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[21]) && !lIIIlIIlIIIIl(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[20])) || (lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[20]) && lIIIlIIlIIIll(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[20]))))) {
                    aj();
                }
                if (lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[21]) && lIIIlIIlIIIll(Skills.getLevel(Skill.STRENGTH), lIlIIIIlll[21]) && lIIIlIIlIIIll(Skills.getLevel(Skill.DEFENCE), lIlIIIIlll[21])) {
                    ah();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ab, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0102, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0159, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b0, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01ea, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0236, code lost:
        return h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.C0015p.lIlIIIIlll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
        if (lIIIlIIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aL() {
        int[] iArr = new int[lIlIIIIlll[1]];
        iArr[lIlIIIIlll[0]] = lIlIIIIlll[14];
        if (lIIIlIIlIIIlI(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIIIIlll[1]];
            iArr2[lIlIIIIlll[0]] = lIlIIIIlll[14];
            if (lIIIlIIlIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIlIIIIlll[1]];
                iArr3[lIlIIIIlll[0]] = lIlIIIIlll[14];
            }
        }
        int[] iArr4 = new int[lIlIIIIlll[1]];
        iArr4[lIlIIIIlll[0]] = lIlIIIIlll[15];
        if (lIIIlIIlIIIlI(Equipment.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIlIIIIlll[1]];
            iArr5[lIlIIIIlll[0]] = lIlIIIIlll[15];
            if (lIIIlIIlIIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIlIIIIlll[1]];
                iArr6[lIlIIIIlll[0]] = lIlIIIIlll[15];
            }
        }
        int[] iArr7 = new int[lIlIIIIlll[1]];
        iArr7[lIlIIIIlll[0]] = lIlIIIIlll[16];
        if (lIIIlIIlIIIlI(Equipment.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lIlIIIIlll[1]];
            iArr8[lIlIIIIlll[0]] = lIlIIIIlll[16];
            if (lIIIlIIlIIIlI(Inventory.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIlIIIIlll[1]];
                iArr9[lIlIIIIlll[0]] = lIlIIIIlll[16];
            }
        }
        int[] iArr10 = new int[lIlIIIIlll[1]];
        iArr10[lIlIIIIlll[0]] = lIlIIIIlll[17];
        if (lIIIlIIlIIIlI(Equipment.contains(iArr10) ? 1 : 0)) {
            int[] iArr11 = new int[lIlIIIIlll[1]];
            iArr11[lIlIIIIlll[0]] = lIlIIIIlll[17];
            if (lIIIlIIlIIIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIlIIIIlll[1]];
                iArr12[lIlIIIIlll[0]] = lIlIIIIlll[17];
            }
        }
        int[] iArr13 = new int[lIlIIIIlll[1]];
        iArr13[lIlIIIIlll[0]] = lIlIIIIlll[18];
        if (lIIIlIIlIIIlI(Equipment.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIlIIIIlll[1]];
            iArr14[lIlIIIIlll[0]] = lIlIIIIlll[18];
            if (lIIIlIIlIIIlI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIlIIIIlll[1]];
                iArr15[lIlIIIIlll[0]] = lIlIIIIlll[18];
            }
        }
        int[] iArr16 = new int[lIlIIIIlll[1]];
        iArr16[lIlIIIIlll[0]] = lIlIIIIlll[12];
        if (lIIIlIIlIIIlI(Inventory.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lIlIIIIlll[1]];
            iArr17[lIlIIIIlll[0]] = lIlIIIIlll[12];
        }
        ?? r0 = lIlIIIIlll[1];
        "".length();
        return (-" ".length()) > ((48 ^ 71) ^ (255 ^ 140)) ? ((21 ^ 115) ^ (124 ^ 21)) & (((23 ^ 87) ^ (221 ^ 146)) ^ (-" ".length())) : r0;
    }

    public static void aj() {
        if (lIIIlIIlIIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIlIIlIIIlI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[52]];
            Movement.walkTo(cK);
            "".length();
            Time.sleepTicks(lIlIIIIlll[1]);
            "".length();
        }
        if (lIIIlIIlIIIII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[53]];
            ak();
        }
    }

    private static boolean lIIIlIIlIIIIl(int i, int i2) {
        return i < i2;
    }

    public static void O() {
        int[] iArr = new int[lIlIIIIlll[1]];
        iArr[lIlIIIIlll[0]] = lIlIIIIlll[12];
        if (lIIIlIIlIIIlI(Bank.contains(iArr) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIlll[12], lIlIIIIlll[13], lIlIIIIlll[54]));
            "".length();
        }
        int[] iArr2 = new int[lIlIIIIlll[1]];
        iArr2[lIlIIIIlll[0]] = lIlIIIIlll[18];
        if (lIIIlIIlIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIlll[18], lIlIIIIlll[1], lIlIIIIlll[55]));
            "".length();
        }
        int[] iArr3 = new int[lIlIIIIlll[1]];
        iArr3[lIlIIIIlll[0]] = lIlIIIIlll[14];
        if (lIIIlIIlIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIlll[14], lIlIIIIlll[1], lIlIIIIlll[7]));
            "".length();
        }
        int[] iArr4 = new int[lIlIIIIlll[1]];
        iArr4[lIlIIIIlll[0]] = lIlIIIIlll[15];
        if (lIIIlIIlIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIlll[15], lIlIIIIlll[1], lIlIIIIlll[7]));
            "".length();
        }
        int[] iArr5 = new int[lIlIIIIlll[1]];
        iArr5[lIlIIIIlll[0]] = lIlIIIIlll[16];
        if (lIIIlIIlIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIlll[16], lIlIIIIlll[1], lIlIIIIlll[56]));
            "".length();
        }
        int[] iArr6 = new int[lIlIIIIlll[1]];
        iArr6[lIlIIIIlll[0]] = lIlIIIIlll[17];
        if (lIIIlIIlIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIIIlll[17], lIlIIIIlll[1], lIlIIIIlll[56]));
            "".length();
        }
    }

    private static String lIIIlIIIllIll(String llllllllllllllllllllIlIlIIIIIIII, String llllllllllllllllllllIlIIllllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIlIlIIIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIlIlIIIIIIlI.init(lIlIIIIlll[5], secretKeySpec);
            return new String(llllllllllllllllllllIlIlIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIlIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIlIlIIIIIIIl) {
            llllllllllllllllllllIlIlIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIlllII(String llllllllllllllllllllIlIlIIIIllIl, String llllllllllllllllllllIlIlIIIIllII) {
        try {
            SecretKeySpec llllllllllllllllllllIlIlIIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIlIlIIIIllII.getBytes(StandardCharsets.UTF_8)), lIlIIIIlll[37]), "DES");
            Cipher llllllllllllllllllllIlIlIIIIllll = Cipher.getInstance("DES");
            llllllllllllllllllllIlIlIIIIllll.init(lIlIIIIlll[5], llllllllllllllllllllIlIlIIIlIIII);
            return new String(llllllllllllllllllllIlIlIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIlIlIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIlIlIIIIlIIl) {
            llllllllllllllllllllIlIlIIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void ah() {
        WorldArea worldArea = new WorldArea(lIlIIIIlll[22], lIlIIIIlll[23], lIlIIIIlll[24], lIlIIIIlll[25], lIlIIIIlll[0]);
        WorldPoint worldPoint = new WorldPoint(lIlIIIIlll[26], lIlIIIIlll[27], lIlIIIIlll[0]);
        WorldPoint worldPoint2 = new WorldPoint(lIlIIIIlll[28], lIlIIIIlll[29], lIlIIIIlll[0]);
        C0004e.D();
        if (lIIIlIIlIIIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            WorldPoint worldPoint3 = new WorldPoint(lIlIIIIlll[30], lIlIIIIlll[31], lIlIIIIlll[0]);
            WorldPoint worldPoint4 = new WorldPoint(lIlIIIIlll[30], lIlIIIIlll[32], lIlIIIIlll[0]);
            if (!lIIIlIIlIIIlI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || lIIIlIIlIIIII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                WorldPoint worldPoint5 = new WorldPoint(lIlIIIIlll[33], lIlIIIIlll[34], lIlIIIIlll[0]);
                C0004e.c(worldPoint5);
                Time.sleepUntil(() -> {
                    return Players.getLocal().getWorldLocation().equals(worldPoint5);
                }, lIlIIIIlll[35]);
                "".length();
            }
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[36]];
            Movement.walkTo(worldPoint);
            "".length();
            Time.sleepTicks(lIlIIIIlll[1]);
            "".length();
        }
        List all = Players.getAll(player -> {
            return worldArea.contains(player);
        });
        if (lIIIlIIlIIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIIlIIIll(all.size(), lIlIIIIlll[19])) {
            if (lIIIlIIlIIlll(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlIIIIlll[5])) {
                AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[37]];
                Movement.walkTo(worldPoint2);
                "".length();
                Time.sleepTicks(lIlIIIIlll[1]);
                "".length();
            }
            if (lIIIlIIlIlIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint2), lIlIIIIlll[5])) {
                AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[38]];
                B();
            }
        }
        if (lIIIlIIlIIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIlIIlIIIIl(all.size(), lIlIIIIlll[19])) {
            if (lIIIlIIlIIlII(Players.getLocal().getInteracting())) {
                AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[39]];
            }
            if (lIIIlIIlIlIIl(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIIIlIIlIIIII(npc.getName().contains(lIlIIIIllI[lIlIIIIlll[73]]) ? 1 : 0) && lIIIlIIlIlIIl(npc.getInteracting()) && lIIIlIIlIIIlI(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lIlIIIIlll[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIIIlll[0];
                });
                NPC nearest2 = NPCs.getNearest(npc2 -> {
                    if (lIIIlIIlIIIII(npc2.getName().contains(lIlIIIIllI[lIlIIIIlll[72]]) ? 1 : 0) && lIIIlIIlIllIl(npc2.getInteracting(), Players.getLocal()) && lIIIlIIlIIIlI(npc2.isDead() ? 1 : 0)) {
                        ?? r0 = lIlIIIIlll[1];
                        "".length();
                        return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIIIIlll[0];
                });
                if (lIIIlIIlIIlII(nearest) && lIIIlIIlIlIIl(nearest2)) {
                    AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[40]];
                    nearest.interact(lIlIIIIllI[lIlIIIIlll[2]]);
                    Time.sleepTicks(lIlIIIIlll[5]);
                    "".length();
                }
            }
        }
    }

    private static boolean lIIIlIIlIIllI(int i) {
        return i < 0;
    }

    public static void aI() {
        if (lIIIlIIlIIIII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIlIIlIIIlI(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[41]];
            Movement.walkTo(new WorldPoint(lIlIIIIlll[42], lIlIIIIlll[43], lIlIIIIlll[0]));
            "".length();
            Time.sleepTicks(lIlIIIIlll[1]);
            "".length();
        }
        if (lIIIlIIlIIIII(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderShamans.c = lIlIIIIllI[lIlIIIIlll[3]];
            ak();
        }
    }

    private static boolean lIIIlIIlIlIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            aH();
            "".length();
            if ("  ".length() == 0) {
                return ((((86 + 26) - 99) + 175) ^ (((60 + 43) - 33) + 67)) & (((232 ^ 137) ^ (202 ^ 158)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIlIIIIlll[0];
    }

    public static void aJ() {
        C0004e.D();
        if (lIIIlIIlIIIIl(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[9])) {
            int[] iArr = new int[lIlIIIIlll[1]];
            iArr[lIlIIIIlll[0]] = lIlIIIIlll[14];
            if (lIIIlIIlIIIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIlIIIIlll[1]];
                iArr2[lIlIIIIlll[0]] = lIlIIIIlll[14];
                Inventory.getFirst(iArr2).interact(lIlIIIIllI[lIlIIIIlll[47]]);
            }
        }
        if (lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[9]) && lIIIlIIlIIIIl(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[20])) {
            int[] iArr3 = new int[lIlIIIIlll[1]];
            iArr3[lIlIIIIlll[0]] = lIlIIIIlll[15];
            if (lIIIlIIlIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIlIIIIlll[1]];
                iArr4[lIlIIIIlll[0]] = lIlIIIIlll[15];
                Inventory.getFirst(iArr4).interact(lIlIIIIllI[lIlIIIIlll[20]]);
            }
        }
        if (lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[20]) && lIIIlIIlIIIIl(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[21])) {
            int[] iArr5 = new int[lIlIIIIlll[1]];
            iArr5[lIlIIIIlll[0]] = lIlIIIIlll[16];
            if (lIIIlIIlIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIlIIIIlll[1]];
                iArr6[lIlIIIIlll[0]] = lIlIIIIlll[16];
                Inventory.getFirst(iArr6).interact(lIlIIIIllI[lIlIIIIlll[48]]);
            }
        }
        if (lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[21]) && lIIIlIIlIIIIl(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[49])) {
            int[] iArr7 = new int[lIlIIIIlll[1]];
            iArr7[lIlIIIIlll[0]] = lIlIIIIlll[17];
            if (lIIIlIIlIIIII(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIIIIlll[1]];
                iArr8[lIlIIIIlll[0]] = lIlIIIIlll[17];
                Inventory.getFirst(iArr8).interact(lIlIIIIllI[lIlIIIIlll[50]]);
            }
        }
        if (lIIIlIIlIIIll(Skills.getLevel(Skill.ATTACK), lIlIIIIlll[49])) {
            int[] iArr9 = new int[lIlIIIIlll[1]];
            iArr9[lIlIIIIlll[0]] = lIlIIIIlll[18];
            if (lIIIlIIlIIIII(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIlIIIIlll[1]];
                iArr10[lIlIIIIlll[0]] = lIlIIIIlll[18];
                Inventory.getFirst(iArr10).interact(lIlIIIIllI[lIlIIIIlll[51]]);
            }
        }
    }

    private static void lIIIlIIIllllI() {
        lIlIIIIlll = new int[90];
        lIlIIIIlll[0] = (148 ^ 145) & ((163 ^ 166) ^ (-1));
        lIlIIIIlll[1] = " ".length();
        lIlIIIIlll[2] = 107 ^ 103;
        lIlIIIIlll[3] = 124 ^ 114;
        lIlIIIIlll[4] = (38 ^ 57) ^ (11 ^ 27);
        lIlIIIIlll[5] = "  ".length();
        lIlIIIIlll[6] = "   ".length();
        lIlIIIIlll[7] = (-26708) & 31707;
        lIlIIIIlll[8] = (((98 + 88) - 71) + 59) ^ (((70 + 80) - 130) + 150);
        lIlIIIIlll[9] = 197 ^ 192;
        lIlIIIIlll[10] = (-((-675) & 16059)) & (-5) & 16383;
        lIlIIIIlll[11] = (-14359) & 15358;
        lIlIIIIlll[12] = (-((-563) & 32439)) & (-1) & 32255;
        lIlIIIIlll[13] = (72 ^ 16) ^ (71 ^ 123);
        lIlIIIIlll[14] = (-((-8523) & 13279)) & (-65) & 6143;
        lIlIIIIlll[15] = (-2243) & 3567;
        lIlIIIIlll[16] = (-((-20753) & 31191)) & (-521) & 12287;
        lIlIIIIlll[17] = (-8837) & 10167;
        lIlIIIIlll[18] = (-((-17681) & 21979)) & (-25089) & 30719;
        lIlIIIIlll[19] = (191 ^ 129) ^ (9 ^ 49);
        lIlIIIIlll[20] = (((141 + 76) - 62) + 12) ^ (((15 + 97) - (-48)) + 19);
        lIlIIIIlll[21] = (58 ^ 76) ^ (218 ^ 178);
        lIlIIIIlll[22] = (-29317) & 32671;
        lIlIIIIlll[23] = (-((-28699) & 29531)) & (-133) & 4095;
        lIlIIIIlll[24] = 34 ^ 4;
        lIlIIIIlll[25] = 126 ^ 89;
        lIlIIIIlll[26] = (-((-1077) & 30461)) & (-5) & 32765;
        lIlIIIIlll[27] = (-12722) & 15871;
        lIlIIIIlll[28] = (-((-3330) & 32151)) & (-577) & 32767;
        lIlIIIIlll[29] = (-25218) & 28383;
        lIlIIIIlll[30] = (-28722) & 31989;
        lIlIIIIlll[31] = (-((-1935) & 22447)) & (-578) & 24317;
        lIlIIIIlll[32] = (-20837) & 24063;
        lIlIIIIlll[33] = (-((-3669) & 15990)) & (-16897) & 32495;
        lIlIIIIlll[34] = (-((-17557) & 26101)) & (-16389) & 28158;
        lIlIIIIlll[35] = (-((-12499) & 30454)) & (-10313) & 32767;
        lIlIIIIlll[36] = (36 ^ 97) ^ (211 ^ 145);
        lIlIIIIlll[37] = (0 ^ 114) ^ (119 ^ 13);
        lIlIIIIlll[38] = (118 ^ 71) ^ (106 ^ 82);
        lIlIIIIlll[39] = 1 ^ 11;
        lIlIIIIlll[40] = 129 ^ 138;
        lIlIIIIlll[41] = 165 ^ 168;
        lIlIIIIlll[42] = (-12429) & 15598;
        lIlIIIIlll[43] = (-28862) & 32191;
        lIlIIIIlll[44] = (244 ^ 133) ^ (111 ^ 14);
        lIlIIIIlll[45] = 159 ^ 142;
        lIlIIIIlll[46] = (((55 + 97) - 120) + 97) ^ (((56 + 3) - 26) + 114);
        lIlIIIIlll[47] = 137 ^ 154;
        lIlIIIIlll[48] = (80 ^ 55) ^ (243 ^ 129);
        lIlIIIIlll[49] = (116 ^ 50) ^ (84 ^ 58);
        lIlIIIIlll[50] = (((127 + 53) - 36) + 35) ^ (((140 + 70) - 123) + 78);
        lIlIIIIlll[51] = 181 ^ 162;
        lIlIIIIlll[52] = (109 ^ 49) ^ (38 ^ 98);
        lIlIIIIlll[53] = 186 ^ 163;
        lIlIIIIlll[54] = (-((-105) & 4714)) & (-24577) & 29685;
        lIlIIIIlll[55] = (-7256) & 32255;
        lIlIIIIlll[56] = (-353) & 15352;
        lIlIIIIlll[57] = (27 ^ 8) ^ (117 ^ 124);
        lIlIIIIlll[58] = (-18465) & 20414;
        lIlIIIIlll[59] = (96 ^ 64) ^ (248 ^ 195);
        lIlIIIIlll[60] = (((10 + 105) - (-16)) + 57) ^ (((144 + 105) - 193) + 104);
        lIlIIIIlll[61] = 115 ^ 110;
        lIlIIIIlll[62] = (-10790) & 11263;
        lIlIIIIlll[63] = (-((-2369) & 19819)) & (-321) & 18303;
        lIlIIIIlll[64] = (63 ^ 88) ^ (120 ^ 0);
        lIlIIIIlll[65] = (((73 + 46) - 0) + 52) ^ (((113 + 35) - 118) + 109);
        lIlIIIIlll[66] = (26 ^ 22) ^ (101 ^ 72);
        lIlIIIIlll[67] = (((1 + 137) - 128) + 154) ^ (((121 + 98) - 194) + 109);
        lIlIIIIlll[68] = (37 ^ 28) ^ (175 ^ 181);
        lIlIIIIlll[69] = (((68 + 19) - 22) + 114) ^ (((50 + 99) - 9) + 11);
        lIlIIIIlll[70] = (92 ^ 127) ^ (27 ^ 29);
        lIlIIIIlll[71] = 93 ^ 116;
        lIlIIIIlll[72] = 168 ^ 130;
        lIlIIIIlll[73] = 65 ^ 106;
        lIlIIIIlll[74] = (-13093) & 16317;
        lIlIIIIlll[75] = (-16934) & 20223;
        lIlIIIIlll[76] = (-((-2602) & 6765)) & (-16657) & 24063;
        lIlIIIIlll[77] = (-((-1409) & 14245)) & (-16642) & 32757;
        lIlIIIIlll[78] = (-((-28881) & 29151)) & (-641) & 4095;
        lIlIIIIlll[79] = (-9089) & 12255;
        lIlIIIIlll[80] = (6 ^ 11) ^ (52 ^ 9);
        lIlIIIIlll[81] = (-12817) & 16029;
        lIlIIIIlll[82] = (-24833) & 28013;
        lIlIIIIlll[83] = (-((-5362) & 13819)) & (-20545) & 32255;
        lIlIIIIlll[84] = (-289) & 3519;
        lIlIIIIlll[85] = (-((-1073) & 22066)) & (-8471) & 32759;
        lIlIIIIlll[86] = (-((-18751) & 27071)) & (-20493) & 31966;
        lIlIIIIlll[87] = (-28673) & 31991;
        lIlIIIIlll[88] = (-21399) & 24567;
        lIlIIIIlll[89] = 14 ^ 34;
    }

    private static int lIIIlIIIlllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public static void B() {
        Worlds.hopTo(Worlds.getRandom(world -> {
            if (lIIIlIIlIIIlI(world.isMembers() ? 1 : 0) && lIIIlIIlIlIII(world.getPlayerCount(), lIlIIIIlll[58]) && lIIIlIIlIllII(world.getId(), Worlds.getCurrentId()) && lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[59]]) ? 1 : 0) && lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[60]]) ? 1 : 0) && lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[61]]) ? 1 : 0) && lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[21]]) ? 1 : 0) && lIIIlIIlIllII(world.getId(), lIlIIIIlll[62]) && lIIIlIIlIllII(world.getId(), lIlIIIIlll[63]) && lIIIlIIlIllII(world.getId(), lIlIIIIlll[63]) && lIIIlIIlIIIlI(world.getActivity().contains(lIlIIIIllI[lIlIIIIlll[64]]) ? 1 : 0) && lIIIlIIlIIIlI(world.getActivity().contains(lIlIIIIllI[lIlIIIIlll[65]]) ? 1 : 0) && lIIIlIIlIIIlI(world.getActivity().contains(lIlIIIIllI[lIlIIIIlll[66]]) ? 1 : 0) && lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[67]]) ? 1 : 0) && lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[68]]) ? 1 : 0) && lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[69]]) ? 1 : 0) && lIIIlIIlIIIlI(world.getActivity().endsWith(lIlIIIIllI[lIlIIIIlll[70]]) ? 1 : 0) && lIIIlIIlIIIlI(world.getActivity().startsWith(lIlIIIIllI[lIlIIIIlll[24]]) ? 1 : 0) && lIIIlIIlIIlll(world.getPlayerCount(), lIlIIIIlll[21])) {
                ?? r0 = lIlIIIIlll[1];
                "".length();
                return (((136 ^ 149) ^ (8 ^ 94)) & (((((73 + 15) - (-20)) + 101) ^ (((151 + 110) - 147) + 40)) ^ (-" ".length()))) < 0 ? ("  ".length() ^ (104 ^ 70)) & (((((29 + 49) - (-10)) + 78) ^ (((124 + 43) - 103) + 74)) ^ (-" ".length())) : r0;
            }
            return lIlIIIIlll[0];
        }));
    }
}
