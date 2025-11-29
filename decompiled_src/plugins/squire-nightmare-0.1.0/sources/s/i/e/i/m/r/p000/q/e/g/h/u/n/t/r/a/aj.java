package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Hitsplat;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.WorldType;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.FakeXpDrop;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Attacking Totem", priority = 2, register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.aj  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/aj.class */
public class aj extends al {
    private static /* synthetic */ String[] lllIllIlIIIl;
    private static /* synthetic */ int[] lllIllIlIIlI;
    private static final /* synthetic */ Logger dZ;

    static {
        lIIIllIlIIlIIII();
        lIIIllIlIIIllll();
        dZ = LoggerFactory.getLogger(aj.class);
    }

    private static void lIIIllIlIIlIIII() {
        lllIllIlIIlI = new int[10];
        lllIllIlIIlI[0] = (58 ^ 24) & ((113 ^ 83) ^ (-1));
        lllIllIlIIlI[1] = (-((-8466) & 15317)) & (-25617) & 32767;
        lllIllIlIIlI[2] = ((149 + 183) - 133) + 1;
        lllIllIlIIlI[3] = " ".length();
        lllIllIlIIlI[4] = (2 ^ 126) ^ (17 ^ 100);
        lllIllIlIIlI[5] = "  ".length();
        lllIllIlIIlI[6] = 48 ^ 41;
        lllIllIlIIlI[7] = "   ".length();
        lllIllIlIIlI[8] = (67 ^ 42) ^ (10 ^ 103);
        lllIllIlIIlI[9] = (189 ^ 162) ^ (30 ^ 9);
    }

    private static boolean lIIIllIlIIlIlIl(int i, int i2) {
        return i <= i2;
    }

    @Inject
    public aj(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0009f c0009f) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin, c0009f);
    }

    private static boolean lIIIllIlIIlIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIllIlIIlIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIIIllIlIIlIlll(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        Map<Integer, Integer> aa = this.cM.aa();
        if (lIIIllIlIIlIIlI(hitsplatApplied.getActor())) {
            return;
        }
        if (!lIIIllIlIIlIlII(SquireNightmarePlugin.q.contains(Integer.valueOf(hitsplatApplied.getActor().getId())) ? 1 : 0) && lIIIllIlIIlIlII(hitsplat.isMine() ? 1 : 0) && lIIIllIlIIlIIIl(SquireNightmarePlugin.q.contains(Integer.valueOf(hitsplatApplied.getActor().getId())) ? 1 : 0) && lIIIllIlIIlIlll(hitsplatApplied.getHitsplat().getHitsplatType(), lllIllIlIIlI[6])) {
            int id = hitsplatApplied.getActor().getId();
            if (lIIIllIlIIlIIIl(aa.containsKey(Integer.valueOf(id)) ? 1 : 0)) {
                Integer valueOf = Integer.valueOf(aa.get(Integer.valueOf(id)).intValue() - hitsplat.getAmount());
                if (lIIIllIlIIllIII(valueOf.intValue())) {
                    valueOf = Integer.valueOf(lllIllIlIIlI[0]);
                }
                aa.put(Integer.valueOf(id), valueOf);
                "".length();
            }
        }
    }

    private static void lIIIllIlIIIllll() {
        lllIllIlIIIl = new String[lllIllIlIIlI[8]];
        lllIllIlIIIl[lllIllIlIIlI[0]] = lIIIllIlIIIllIl("XTLjZVvIynyVE523dm6qnsQOpiKsjt1dadjIAWTdYX8XWliG1B7PtYydG2CPeAK5K4MDN/Gz1fTAsGqZZKYlgYQdkMTtMfEX8XHnTLYGqzc/zGXicXvA9A==", "gcbkN");
        lllIllIlIIIl[lllIllIlIIlI[3]] = lIIIllIlIIIlllI("Hww1PwknJhUkHCEgHHFIEyhhKhohbS8kHGQ+IC0NZCszJAVkPikqDCs6bWsbLyQxOwEqKmE/BzAoLGsJMDkgKANkOS5rCTIiKC9G", "DMAKh");
        lllIllIlIIIl[lllIllIlIIlI[5]] = lIIIllIlIIIllIl("sL25G+bN0yw=", "QAByg");
        lllIllIlIIIl[lllIllIlIIlI[7]] = lIIIllIlIIIllIl("v6tr1rP3yTM=", "ReLpO");
    }

    private static boolean lIIIllIlIIlIIll(Object obj) {
        return obj != null;
    }

    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public EquipmentSetup cq() {
        return (EquipmentSetup) this.cK.totemGear().selected(EquipmentSetup.class);
    }

    private static boolean lIIIllIlIIlIlII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.al
    public boolean cr() {
        int i;
        int i2;
        int i3;
        int i4;
        if (lIIIllIlIIlIIIl(this.cK.assistantMode() ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        Player local = Players.getLocal();
        int[] array = SquireNightmarePlugin.q.stream().mapToInt((v0) -> {
            return v0.intValue();
        }).toArray();
        if (lIIIllIlIIlIIlI((NPC) NPCs.getAll(array).stream().filter(npc -> {
            if (lIIIllIlIIlIlII(npc.isDead() ? 1 : 0)) {
                ?? r0 = lllIllIlIIlI[3];
                "".length();
                return (((22 ^ 19) ^ (191 ^ 132)) & (((80 ^ 11) ^ (126 ^ 27)) ^ (-" ".length()))) != 0 ? ((218 ^ 153) ^ (187 ^ 188)) & (((124 ^ 117) ^ (25 ^ 84)) ^ (-" ".length())) : r0;
            }
            return lllIllIlIIlI[0];
        }).min(Comparator.comparingInt(npc2 -> {
            return Players.getLocal().getWorldLocation().distanceTo(npc2.getWorldLocation());
        })).orElse(null))) {
            this.cM.a(new ak(this));
            return lllIllIlIIlI[0];
        }
        if (lIIIllIlIIlIIll(this.cM.ai()) && lIIIllIlIIlIIIl(this.cM.ai().getTypes().contains(WorldType.SEASONAL) ? 1 : 0)) {
            i = lllIllIlIIlI[1];
            "".length();
            if (((81 ^ 90) ^ (207 ^ 192)) < (((66 ^ 111) ^ (19 ^ 97)) & (((((21 + 77) - (-52)) + 76) ^ (((45 + 98) - (-21)) + 25)) ^ (-" ".length())))) {
                return ((109 ^ 104) ^ ((66 ^ 122) & ((48 ^ 8) ^ (-1)))) & (((110 ^ 31) ^ (206 ^ 186)) ^ (-" ".length()));
            }
        } else {
            i = lllIllIlIIlI[2];
        }
        int i5 = i;
        NPC npc3 = (NPC) NPCs.getAll(array).stream().filter(npc4 -> {
            if (lIIIllIlIIllIIl(this.cM.ag.get(Integer.valueOf(npc4.getId())).intValue(), i5)) {
                ?? r0 = lllIllIlIIlI[3];
                "".length();
                return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIllIlIIlI[0];
        }).filter(npc5 -> {
            if (lIIIllIlIIlIIIl(t(npc5) ? 1 : 0) && lIIIllIlIIlIIIl(r(npc5) ? 1 : 0) && lIIIllIlIIlIIIl(s(npc5) ? 1 : 0)) {
                ?? r0 = lllIllIlIIlI[3];
                "".length();
                return !(true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIllIlIIlI[0];
        }).filter(npc6 -> {
            if (lIIIllIlIIlIlII(npc6.isDead() ? 1 : 0)) {
                String[] strArr = new String[lllIllIlIIlI[3]];
                strArr[lllIllIlIIlI[0]] = lllIllIlIIIl[lllIllIlIIlI[7]];
                if (lIIIllIlIIlIIIl(npc6.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lllIllIlIIlI[3];
                    "".length();
                    return "   ".length() <= 0 ? ((66 ^ 10) ^ (112 ^ 44)) & (((((121 + 0) - 81) + 98) ^ (((95 + 74) - 14) + 3)) ^ (-" ".length())) : r0;
                }
            }
            return lllIllIlIIlI[0];
        }).min(Comparator.comparingInt(npc7 -> {
            return npc7.getWorldLocation().distanceTo(local.getWorldLocation());
        })).orElse(null);
        if (lIIIllIlIIlIIll(this.cJ.aX())) {
            i2 = lllIllIlIIlI[3];
            "".length();
            if (((85 ^ 1) ^ (117 ^ 37)) <= 0) {
                return ((29 ^ 81) ^ (185 ^ 161)) & (((((6 + 136) - 64) + 148) ^ (((168 + 47) - 117) + 84)) ^ (-" ".length()));
            }
        } else {
            i2 = lllIllIlIIlI[0];
        }
        if (lIIIllIlIIlIIIl(i2)) {
            return lllIllIlIIlI[0];
        }
        if (lIIIllIlIIlIIll(this.cJ.aY())) {
            i3 = lllIllIlIIlI[3];
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i3 = lllIllIlIIlI[0];
        }
        if (!lIIIllIlIIlIlII(i3) || lIIIllIlIIlIIIl(this.cM.T() ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        if (lIIIllIlIIlIIll(this.cJ.aZ())) {
            i4 = lllIllIlIIlI[3];
            "".length();
            if ((((108 ^ 11) ^ (90 ^ 52)) & (((119 ^ 7) ^ (229 ^ 156)) ^ (-" ".length()))) < 0) {
                return ((33 ^ 88) ^ (((25 + 112) - 52) + 42)) & (((119 ^ 61) ^ (197 ^ 137)) ^ (-" ".length()));
            }
        } else {
            i4 = lllIllIlIIlI[0];
        }
        if (lIIIllIlIIlIIIl(i4)) {
            return lllIllIlIIlI[0];
        }
        RectangularArea ay = C0008e.ay();
        if (lIIIllIlIIlIIll(ay) && lIIIllIlIIlIlII(ay.contains(local.getWorldLocation()) ? 1 : 0)) {
            dZ.debug(lllIllIlIIIl[lllIllIlIIlI[0]]);
            return lllIllIlIIlI[0];
        } else if (!lIIIllIlIIlIlII(cu() ? 1 : 0)) {
            return (lIIIllIlIIlIIll(this.cM.aj()) && lIIIllIlIIlIIIl(this.cM.aj().contains(local.getWorldLocation()) ? 1 : 0)) ? lllIllIlIIlI[0] : (!lIIIllIlIIlIIll(npc3) || lIIIllIlIIlIlII(SquireNightmarePlugin.q.contains(Integer.valueOf(npc3.getId())) ? 1 : 0)) ? lllIllIlIIlI[0] : x(npc3);
        } else {
            dZ.debug(lllIllIlIIIl[lllIllIlIIlI[3]]);
            return lllIllIlIIlI[0];
        }
    }

    private static boolean lIIIllIlIIllIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIIIllIlIIIllIl(String lllllllllllllllIIllIIlllIIlIIlIl, String lllllllllllllllIIllIIlllIIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllIIlIIlII.getBytes(StandardCharsets.UTF_8)), lllIllIlIIlI[9]), "DES");
            Cipher lllllllllllllllIIllIIlllIIlIIlll = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlllIIlIIlll.init(lllIllIlIIlI[5], lllllllllllllllIIllIIlllIIlIlIII);
            return new String(lllllllllllllllIIllIIlllIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlllIIlIIllI) {
            lllllllllllllllIIllIIlllIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIlIIlIIIl(int i) {
        return i != 0;
    }

    private static String lIIIllIlIIIlllI(String lllllllllllllllIIllIIlllIIlllIlI, String lllllllllllllllIIllIIlllIIlllIIl) {
        String lllllllllllllllIIllIIlllIIlllIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIIlllIIlllIIl.toCharArray();
        int lllllllllllllllIIllIIlllIIllIllI = lllIllIlIIlI[0];
        char[] charArray2 = lllllllllllllllIIllIIlllIIlllIlI2.toCharArray();
        int length = charArray2.length;
        int i = lllIllIlIIlI[0];
        while (lIIIllIlIIllIIl(i, length)) {
            char lllllllllllllllIIllIIlllIIlIllIl = charArray2[i];
            sb.append((char) (lllllllllllllllIIllIIlllIIlIllIl ^ charArray[lllllllllllllllIIllIIlllIIllIllI % charArray.length]));
            "".length();
            lllllllllllllllIIllIIlllIIllIllI++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Subscribe
    public void a(FakeXpDrop fakeXpDrop) {
        NPC interacting = Players.getLocal().getInteracting();
        if (lIIIllIlIIlIIIl(interacting instanceof NPC ? 1 : 0) && lIIIllIlIIlIIll(interacting.getName()) && lIIIllIlIIlIIIl(interacting.getName().toLowerCase().contains(lllIllIlIIIl[lllIllIlIIlI[5]]) ? 1 : 0)) {
            NPC npc = interacting;
            "".length();
            if ((-" ".length()) >= (-" ".length()) && lIIIllIlIIlIllI(fakeXpDrop.getSkill(), Skill.HITPOINTS)) {
                long max = Math.max(Math.round(Math.ceil(fakeXpDrop.getXp() * 0.75d) * 2.0d), 1L);
                Map<Integer, Integer> aa = this.cM.aa();
                aa.put(Integer.valueOf(npc.getId()), Integer.valueOf((int) (aa.getOrDefault(Integer.valueOf(npc.getId()), Integer.valueOf(lllIllIlIIlI[0])).intValue() + max)));
                "".length();
            }
        }
    }

    private static boolean lIIIllIlIIllIII(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    private boolean r(NPC npc) {
        List<WorldArea> ax = C0008e.ax();
        if (lIIIllIlIIlIIIl(ax.isEmpty() ? 1 : 0)) {
            return lllIllIlIIlI[3];
        }
        WorldPoint worldLocation = npc.getWorldLocation();
        WorldPoint worldLocation2 = Players.getLocal().getWorldLocation();
        return lIIIllIlIIlIIIl(ax.stream().anyMatch(worldArea -> {
            return worldArea.contains(worldLocation2);
        }) ? 1 : 0) ? lllIllIlIIlI[0] : lIIIllIlIIlIlIl(worldLocation2.distanceTo(worldLocation), lllIllIlIIlI[4]) ? lllIllIlIIlI[3] : a(worldLocation2, worldLocation).stream().noneMatch(worldPoint -> {
            return ax.stream().anyMatch(worldArea2 -> {
                return worldArea2.contains(worldPoint);
            });
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    private boolean t(NPC npc) {
        if (lIIIllIlIIlIlII(this.cM.at())) {
            return lllIllIlIIlI[3];
        }
        Player local = Players.getLocal();
        WorldPoint worldLocation = npc.getWorldLocation();
        WorldPoint worldLocation2 = local.getWorldLocation();
        WorldArea aj = this.cM.aj();
        if (lIIIllIlIIlIlIl(worldLocation2.distanceTo(worldLocation), lllIllIlIIlI[4])) {
            return lllIllIlIIlI[3];
        }
        if (lIIIllIlIIlIIlI(aj)) {
            return lllIllIlIIlI[0];
        }
        Stream<WorldPoint> stream = a(Players.getLocal().getWorldLocation(), npc.getWorldLocation()).stream();
        Objects.requireNonNull(aj);
        "".length();
        return stream.noneMatch(this::contains);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    private boolean s(NPC npc) {
        List<WorldPoint> Y = this.cM.Y();
        if (lIIIllIlIIlIIIl(Y.isEmpty() ? 1 : 0)) {
            return lllIllIlIIlI[3];
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lIIIllIlIIlIIIl(Y.stream().anyMatch(worldPoint -> {
            return worldPoint.equals(worldLocation);
        }) ? 1 : 0)) {
            return lllIllIlIIlI[0];
        }
        WorldPoint worldLocation2 = npc.getWorldLocation();
        return lIIIllIlIIlIlIl(worldLocation.distanceTo(worldLocation2), lllIllIlIIlI[4]) ? lllIllIlIIlI[3] : a(worldLocation, worldLocation2).stream().noneMatch(worldPoint2 -> {
            return Y.stream().anyMatch(worldPoint2 -> {
                return worldPoint2.equals(worldPoint2);
            });
        });
    }
}
