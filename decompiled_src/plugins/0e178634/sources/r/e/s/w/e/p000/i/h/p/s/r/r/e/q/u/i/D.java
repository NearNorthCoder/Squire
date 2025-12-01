package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Killing set of ghosts", priority = 50, register = true, blocking = true)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.D  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/D.class */
public class D extends u {
    private static /* synthetic */ String[] lIlIllIlIIIll;
    private static /* synthetic */ int[] lIlIllIlIIlIl;
    private final /* synthetic */ Set<NPC> ai = new HashSet();

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        npcSpawned.getNpc();
    }

    private static void llIIIIIlIIlIIIl() {
        lIlIllIlIIlIl = new int[16];
        lIlIllIlIIlIl[0] = (21 ^ 43) & ((191 ^ 129) ^ (-1));
        lIlIllIlIIlIl[1] = "  ".length();
        lIlIllIlIIlIl[2] = " ".length();
        lIlIllIlIIlIl[3] = 155 ^ 159;
        lIlIllIlIIlIl[4] = (-((-22546) & 31967)) & (-16385) & 32719;
        lIlIllIlIIlIl[5] = (-9257) & 29816;
        lIlIllIlIIlIl[6] = (-((-27331) & 28659)) & (-8385) & 30718;
        lIlIllIlIIlIl[7] = "   ".length();
        lIlIllIlIIlIl[8] = (-((-7535) & 15871)) & (-262) & 32223;
        lIlIllIlIIlIl[9] = 91 ^ 5;
        lIlIllIlIIlIl[10] = (-4108) & 16319;
        lIlIllIlIIlIl[11] = (((89 + 120) - 202) + 135) ^ (((104 + 19) - (-9)) + 7);
        lIlIllIlIIlIl[12] = 164 ^ 162;
        lIlIllIlIIlIl[13] = (((78 + 164) - 120) + 58) ^ (((125 + 136) - 85) + 3);
        lIlIllIlIIlIl[14] = (243 ^ 161) ^ (35 ^ 121);
        lIlIllIlIIlIl[15] = (10 ^ 79) ^ (143 ^ 195);
    }

    private static boolean llIIIIIlIIlIlll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        SpellBook.Ancient ancient;
        NPC w = w();
        if (llIIIIIlIIlIIlI(w)) {
            this.ai.clear();
            return lIlIllIlIIlIl[0];
        }
        Item v = v();
        if (llIIIIIlIIlIIll(v)) {
            String[] strArr = new String[lIlIllIlIIlIl[1]];
            strArr[lIlIllIlIIlIl[0]] = lIlIllIlIIIll[lIlIllIlIIlIl[0]];
            strArr[lIlIllIlIIlIl[2]] = lIlIllIlIIIll[lIlIllIlIIlIl[2]];
            v.interact(strArr);
        }
        int[] iArr = new int[lIlIllIlIIlIl[3]];
        iArr[lIlIllIlIIlIl[0]] = lIlIllIlIIlIl[4];
        iArr[lIlIllIlIIlIl[2]] = lIlIllIlIIlIl[5];
        iArr[lIlIllIlIIlIl[1]] = lIlIllIlIIlIl[6];
        iArr[lIlIllIlIIlIl[7]] = lIlIllIlIIlIl[8];
        if (!llIIIIIlIIlIlII(Equipment.contains(iArr) ? 1 : 0)) {
            w.interact(lIlIllIlIIIll[lIlIllIlIIlIl[1]]);
            return lIlIllIlIIlIl[2];
        }
        if (llIIIIIlIIlIlIl(Skills.getBoostedLevel(Skill.MAGIC), lIlIllIlIIlIl[9])) {
            ancient = SpellBook.Ancient.ICE_BARRAGE;
            "".length();
            if (((24 ^ 36) & ((14 ^ 50) ^ (-1))) >= "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            ancient = SpellBook.Ancient.ICE_BLITZ;
        }
        Magic.cast(ancient, w);
        return lIlIllIlIIlIl[2];
    }

    private static boolean llIIIIIlIIlIlIl(int i, int i2) {
        return i >= i2;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        NPC interacting = projectileSpawned.getProjectile().getInteracting();
        if (llIIIIIlIIlIIll(interacting) && llIIIIIlIIlIllI(interacting.getId(), lIlIllIlIIlIl[10])) {
            this.ai.add(interacting);
            "".length();
            if (llIIIIIlIIlIlII(Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getName().contains(lIlIllIlIIIll[lIlIllIlIIlIl[3]]) ? 1 : 0)) {
                this.ai.addAll(NPCs.getAll(npc -> {
                    if (llIIIIIlIIlIllI(npc.getId(), lIlIllIlIIlIl[10]) && llIIIIIlIIlIlll(npc.distanceTo(interacting), lIlIllIlIIlIl[7])) {
                        ?? r0 = lIlIllIlIIlIl[2];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIlIllIlIIlIl[0];
                }));
                "".length();
            }
        }
    }

    private NPC w() {
        if (llIIIIIlIIlIlII(Equipment.fromSlot(EquipmentInventorySlot.WEAPON).getName().contains(lIlIllIlIIIll[lIlIllIlIIlIl[7]]) ? 1 : 0)) {
            return (NPC) NPCs.getAll(npc -> {
                if (llIIIIIlIIllIII(this.ai.contains(npc) ? 1 : 0) && llIIIIIlIIlIllI(npc.getId(), lIlIllIlIIlIl[10]) && llIIIIIlIIllIII(npc.isDead() ? 1 : 0) && llIIIIIlIIlIIll(npc.getOverheadText())) {
                    ?? r0 = lIlIllIlIIlIl[2];
                    "".length();
                    return (-" ".length()) > "   ".length() ? ((74 ^ 23) ^ (87 ^ 54)) & (((185 ^ 166) ^ (7 ^ 36)) ^ (-" ".length())) : r0;
                }
                return lIlIllIlIIlIl[0];
            }).stream().max(Comparator.comparingInt((v0) -> {
                return v0.getWorldY();
            })).orElse(NPCs.getNearest(npc2 -> {
                if (llIIIIIlIIllIII(this.ai.contains(npc2) ? 1 : 0) && llIIIIIlIIlIllI(npc2.getId(), lIlIllIlIIlIl[10]) && llIIIIIlIIllIII(npc2.isDead() ? 1 : 0) && llIIIIIlIIlIIll(npc2.getOverheadText())) {
                    ?? r0 = lIlIllIlIIlIl[2];
                    "".length();
                    return 0 != 0 ? ((((58 + 135) - 164) + 131) ^ (((23 + 69) - (-27)) + 59)) & (((((78 + 114) - 97) + 42) ^ (((82 + 147) - 78) + 4)) ^ (-" ".length())) : r0;
                }
                return lIlIllIlIIlIl[0];
            }));
        }
        NPC nearest = NPCs.getNearest(npc3 -> {
            if (llIIIIIlIIllIII(this.ai.contains(npc3) ? 1 : 0) && llIIIIIlIIlIllI(npc3.getId(), lIlIllIlIIlIl[10]) && llIIIIIlIIllIII(npc3.isDead() ? 1 : 0) && llIIIIIlIIlIIll(npc3.getOverheadText()) && llIIIIIlIIlIlII(npc3.getOverheadText().contains(lIlIllIlIIIll[lIlIllIlIIlIl[12]]) ? 1 : 0)) {
                ?? r0 = lIlIllIlIIlIl[2];
                "".length();
                return "   ".length() < "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIlIIlIl[0];
        });
        if (llIIIIIlIIlIIll(nearest)) {
            return nearest;
        }
        NPC nearest2 = NPCs.getNearest(npc4 -> {
            if (llIIIIIlIIllIII(this.ai.contains(npc4) ? 1 : 0) && llIIIIIlIIlIllI(npc4.getId(), lIlIllIlIIlIl[10]) && llIIIIIlIIllIII(npc4.isDead() ? 1 : 0) && llIIIIIlIIlIIll(npc4.getOverheadText()) && llIIIIIlIIlIlII(npc4.getOverheadText().contains(lIlIllIlIIIll[lIlIllIlIIlIl[11]]) ? 1 : 0)) {
                ?? r0 = lIlIllIlIIlIl[2];
                "".length();
                return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIllIlIIlIl[0];
        });
        return llIIIIIlIIlIIll(nearest2) ? nearest2 : NPCs.getNearest(npc5 -> {
            if (llIIIIIlIIllIII(this.ai.contains(npc5) ? 1 : 0) && llIIIIIlIIlIllI(npc5.getId(), lIlIllIlIIlIl[10])) {
                ?? r0 = lIlIllIlIIlIl[2];
                "".length();
                return 0 != 0 ? ((((213 + 37) - 136) + 133) ^ (((66 + 150) - 116) + 91)) & (((82 ^ 76) ^ (239 ^ 185)) ^ (-" ".length())) : r0;
            }
            return lIlIllIlIIlIl[0];
        });
    }

    private static boolean llIIIIIlIIlIIll(Object obj) {
        return obj != null;
    }

    private Item v() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().toLowerCase().contains(lIlIllIlIIIll[lIlIllIlIIlIl[14]]);
        });
        return llIIIIIlIIlIIll(first) ? first : Inventory.getFirst(item2 -> {
            return item2.getName().toLowerCase().contains(lIlIllIlIIIll[lIlIllIlIIlIl[13]]);
        });
    }

    private static boolean llIIIIIlIIlIIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIIlIIllIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIIlIIlIlII(int i) {
        return i != 0;
    }

    private static String llIIIIIlIIIIllI(String llllllllllllllIllIlIIIllllIIlIII, String llllllllllllllIllIlIIIllllIIIlll) {
        String llllllllllllllIllIlIIIllllIIlIII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIllllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIIIllllIIIlll.toCharArray();
        int llllllllllllllIllIlIIIllllIIIlII = lIlIllIlIIlIl[0];
        char[] charArray2 = llllllllllllllIllIlIIIllllIIlIII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIllIlIIlIl[0];
        while (llIIIIIlIIllIIl(i, length)) {
            char llllllllllllllIllIlIIIllllIIlIIl = charArray2[i];
            sb.append((char) (llllllllllllllIllIlIIIllllIIlIIl ^ charArray[llllllllllllllIllIlIIIllllIIIlII % charArray.length]));
            "".length();
            llllllllllllllIllIlIIIllllIIIlII++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        llIIIIIlIIlIIIl();
        llIIIIIlIIlIIII();
    }

    private static String llIIIIIlIIIIlll(String llllllllllllllIllIlIIIllllIllIII, String llllllllllllllIllIlIIIllllIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIllllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIlIIlIl[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIllllIllIIl) {
            llllllllllllllIllIlIIIllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIIlIllI(int i, int i2) {
        return i == i2;
    }

    private static void llIIIIIlIIlIIII() {
        lIlIllIlIIIll = new String[lIlIllIlIIlIl[15]];
        lIlIllIlIIIll[lIlIllIlIIlIl[0]] = llIIIIIlIIIIllI("MzwpIQw=", "dULMh");
        lIlIllIlIIIll[lIlIllIlIIlIl[2]] = llIIIIIlIIIIlll("WiI3jiOoScM=", "nKbcx");
        lIlIllIlIIIll[lIlIllIlIIlIl[1]] = llIIIIIlIIIIllI("KA4dFQQC", "izitg");
        lIlIllIlIIIll[lIlIllIlIIlIl[7]] = llIIIIIlIIIIllI("Ej8WNwcrKA==", "DZxVs");
        lIlIllIlIIIll[lIlIllIlIIlIl[3]] = llIIIIIlIIIIlll("/auUvx/S1o8=", "xKEVI");
        lIlIllIlIIIll[lIlIllIlIIlIl[11]] = llIIIIIlIIIllIl("kK2J+kdgs4bgOeSTjwFhZQ==", "nLMMt");
        lIlIllIlIIIll[lIlIllIlIIlIl[12]] = llIIIIIlIIIIlll("D4FztplCGeo=", "mAXZU");
        lIlIllIlIIIll[lIlIllIlIIlIl[13]] = llIIIIIlIIIllIl("DHDT+D1AaqA=", "TUGby");
        lIlIllIlIIIll[lIlIllIlIIlIl[14]] = llIIIIIlIIIllIl("4ToPEeFkr+5UU7EL8s8kKQ==", "nHGfP");
    }

    private static boolean llIIIIIlIIllIII(int i) {
        return i == 0;
    }

    private static String llIIIIIlIIIllIl(String llllllllllllllIllIlIIIlllIllIIll, String llllllllllllllIllIlIIIlllIllIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIlllIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIlllIllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIllIlIIlIl[14]), "DES");
            Cipher llllllllllllllIllIlIIIlllIllIlIl = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIlllIllIlIl.init(lIlIllIlIIlIl[1], llllllllllllllIllIlIIIlllIllIllI);
            return new String(llllllllllllllIllIlIIIlllIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIlllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIIlllIllIlII) {
            llllllllllllllIllIlIIIlllIllIlII.printStackTrace();
            return null;
        }
    }
}
