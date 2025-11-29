package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Handling Prayer", priority = 100)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.s  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/s.class */
public class s extends Task {
    private final /* synthetic */ SquireGorillaConfig ae;
    private /* synthetic */ Prayer af = Prayer.PROTECT_FROM_MAGIC;
    private final /* synthetic */ SquireGorillaPlugin ad;
    private static /* synthetic */ String[] llIIlIllIIll;
    private static /* synthetic */ int[] llIIlIllIlII;

    private static boolean lllllIllIllIII(int i, int i2) {
        return i == i2;
    }

    @Inject
    public s(SquireGorillaPlugin squireGorillaPlugin, SquireGorillaConfig squireGorillaConfig) {
        this.ad = squireGorillaPlugin;
        this.ae = squireGorillaConfig;
    }

    private static boolean lllllIllIllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllllIllIllIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    public boolean run() {
        NPC interacting;
        Player local = Players.getLocal();
        if (lllllIllIlIllI(NPCs.getNearest(npc -> {
            if (lllllIllIllIIl(npc.getName().equals(llIIlIllIIll[llIIlIllIlII[1]]) ? 1 : 0) && lllllIllIllIlI(npc.getInteracting(), local)) {
                ?? r0 = llIIlIllIlII[0];
                "".length();
                return " ".length() >= (6 ^ 2) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIllIlII[1];
        }))) {
            Prayers.flick(List.of(Prayer.PROTECT_FROM_MAGIC, Prayer.STEEL_SKIN));
            "".length();
            return llIIlIllIlII[0];
        }
        ArrayList arrayList = new ArrayList();
        if (lllllIllIlIlll(local.getInteracting())) {
            interacting = NPCs.getNearest(npc2 -> {
                if (lllllIllIllIlI(npc2.getInteracting(), local)) {
                    ?? r0 = llIIlIllIlII[0];
                    "".length();
                    return (-"   ".length()) > 0 ? ((((71 + 108) - 44) + 8) ^ (((6 + 57) - (-44)) + 61)) & (((14 ^ 62) ^ (149 ^ 130)) ^ (-" ".length())) : r0;
                }
                return llIIlIllIlII[1];
            });
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            interacting = local.getInteracting();
        }
        NPC npc3 = interacting;
        if (!lllllIllIlIllI(npc3)) {
            if (lllllIllIllIIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
            }
            return llIIlIllIlII[0];
        }
        c a = this.ad.a(npc3);
        if (!lllllIllIlIllI(a)) {
            if (lllllIllIllIIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
            }
            return llIIlIllIlII[0];
        }
        ArrayList arrayList2 = new ArrayList(a.n());
        arrayList2.remove(d.BOULDER);
        "".length();
        if (lllllIllIllIII(arrayList2.size(), llIIlIllIlII[0])) {
            switch (t.ag[((d) arrayList2.get(llIIlIllIlII[1])).ordinal()]) {
                case 1:
                    this.af = Prayer.PROTECT_FROM_MELEE;
                    "".length();
                    if ("   ".length() < " ".length()) {
                        return ((98 ^ 126) ^ (21 ^ 17)) & (((((135 + 57) - 149) + 121) ^ (((178 + 92) - 92) + 10)) ^ (-" ".length()));
                    }
                    break;
                case 2:
                    this.af = Prayer.PROTECT_FROM_MAGIC;
                    "".length();
                    if (0 != 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    break;
                case 3:
                    this.af = Prayer.PROTECT_FROM_MISSILES;
                    break;
            }
            "".length();
            if ("  ".length() <= 0) {
                return ((129 ^ 190) ^ (12 ^ 124)) & (((65 ^ 95) ^ (93 ^ 12)) ^ (-" ".length()));
            }
        } else {
            this.af = Prayer.PROTECT_FROM_MAGIC;
        }
        "".length();
        if (" ".length() == 0) {
            return ((36 ^ 74) ^ (219 ^ 140)) & (((43 ^ 20) ^ (23 ^ 17)) ^ (-" ".length()));
        }
        "".length();
        if ((-((79 ^ 40) ^ (161 ^ 194))) > 0) {
            return ((((53 + 89) - 103) + 104) ^ (((122 + 40) - 157) + 149)) & (("   ".length() ^ (30 ^ 8)) ^ (-" ".length()));
        }
        arrayList.add(O());
        "".length();
        arrayList.add(this.af);
        "".length();
        Prayers.flick(arrayList);
        "".length();
        return llIIlIllIlII[0];
    }

    private Prayer O() {
        int[] iArr;
        EquipmentSetup equipmentSetup = (EquipmentSetup) this.ae.ranged().selected(EquipmentSetup.class);
        if (lllllIllIlIllI(equipmentSetup)) {
            iArr = equipmentSetup.getIds();
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        } else {
            iArr = new int[llIIlIllIlII[1]];
        }
        int[] iArr2 = iArr;
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        return lllllIllIllIIl(IntStream.of(iArr2).anyMatch(i -> {
            if (lllllIllIllIII(i, fromSlot.getId())) {
                ?? r0 = llIIlIllIlII[0];
                "".length();
                return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIllIlII[1];
        }) ? 1 : 0) ? this.ae.rangePrayer().C() : this.ae.meleePrayer().C();
    }

    private static boolean lllllIllIlIlll(Object obj) {
        return obj == null;
    }

    private static boolean lllllIllIlIllI(Object obj) {
        return obj != null;
    }

    private static String lllllIllIlIIll(String lllllllllllllllIlIIlllIlllIIlIII, String lllllllllllllllIlIIlllIlllIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIlllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIllIlII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlllIlllIIlIIl) {
            lllllllllllllllIlIIlllIlllIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lllllIllIlIlIl() {
        llIIlIllIlII = new int[3];
        llIIlIllIlII[0] = " ".length();
        llIIlIllIlII[1] = (42 ^ 99) & ((90 ^ 19) ^ (-1));
        llIIlIllIlII[2] = "  ".length();
    }

    static {
        lllllIllIlIlIl();
        lllllIllIlIlII();
    }

    private static void lllllIllIlIlII() {
        llIIlIllIIll = new String[llIIlIllIlII[0]];
        llIIlIllIIll[llIIlIllIlII[1]] = lllllIllIlIIll("mxHwpVMRkOyG24Uw4f3AdX3MqWce9D6b", "mSwmS");
    }
}
