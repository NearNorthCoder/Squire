package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;
@TaskDesc(name = "Attacking brother", priority = 13337, blocking = true)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.n  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/n.class */
public class n extends Task {
    private static final /* synthetic */ int R;
    private final /* synthetic */ SquireBarrows S;
    private final /* synthetic */ a U;
    private static /* synthetic */ int[] llllIIllIII;
    private final /* synthetic */ SquireBarrowsConfig T;
    private static /* synthetic */ String[] llllIIlIlll;

    private static boolean lIllIlIIIllllI(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIlIIlIIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    public boolean run() {
        int i;
        int i2;
        d s = this.S.s();
        if (lIllIlIIIlllll(s)) {
            return llllIIllIII[4];
        }
        if (!lIllIlIIlIIIII(this.S.i() ? 1 : 0) || lIllIlIIlIIIII(this.S.h() ? 1 : 0)) {
            return llllIIllIII[4];
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (lIllIlIIlIIIII(npc.isDead() ? 1 : 0) && lIllIlIIlIIIIl(npc.getName().contains(s.C()) ? 1 : 0) && lIllIlIIlIIlII(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = llllIIllIII[7];
                "".length();
                return "  ".length() == 0 ? ((2 ^ 28) ^ (191 ^ 183)) & (((228 ^ 146) ^ (10 ^ 106)) ^ (-" ".length())) : r0;
            }
            return llllIIllIII[4];
        });
        if (lIllIlIIIlllll(nearest)) {
            return llllIIllIII[4];
        }
        SpellBook.Standard standard = SpellBook.Standard.IBAN_BLAST;
        int[] iArr = new int[llllIIllIII[5]];
        iArr[llllIIllIII[4]] = llllIIllIII[6];
        iArr[llllIIllIII[7]] = llllIIllIII[8];
        iArr[llllIIllIII[9]] = llllIIllIII[10];
        if (lIllIlIIlIIIIl(Equipment.contains(iArr) ? 1 : 0) && lIllIlIIlIIIIl(Magic.canCast(standard) ? 1 : 0) && lIllIlIIlIIIII(Magic.isAutoCasting() ? 1 : 0)) {
            Log.info(llllIIlIlll[llllIIllIII[4]]);
            Widget widget = Static.getClient().getWidget(llllIIllIII[11]);
            if (lIllIlIIlIIIlI(widget)) {
                widget.interact(llllIIllIII[7], llllIIllIII[12], llllIIllIII[0], llllIIllIII[11]);
            }
            Widget widget2 = Static.getClient().getWidget(llllIIllIII[13]);
            if (lIllIlIIlIIIlI(widget2)) {
                widget2.interact(llllIIllIII[7], llllIIllIII[12], llllIIllIII[14], llllIIllIII[13]);
            }
            return llllIIllIII[7];
        }
        if (lIllIlIIlIIIll(Combat.getSpecEnergy(), e(s))) {
            i = llllIIllIII[7];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((((72 + 68) - 96) + 141) ^ (((19 + 30) - (-23)) + 97)) & (((((131 + 34) - (-1)) + 1) ^ (((71 + 99) - 51) + 64)) ^ (-" ".length()));
            }
        } else {
            i = llllIIllIII[4];
        }
        int i3 = i;
        if (lIllIlIIlIIIIl(f(s) ? 1 : 0) && lIllIlIIlIIIIl(i3)) {
            i2 = llllIIllIII[7];
            "".length();
            if ("   ".length() < ((92 ^ 15) & ((116 ^ 39) ^ (-1)))) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i2 = llllIIllIII[4];
        }
        int i4 = i2;
        if (lIllIlIIlIIIIl(i4)) {
            if (lIllIlIIlIIIII(Gear.isEquipped(this.U.d(s)) ? 1 : 0)) {
                Log.info(llllIIlIlll[llllIIllIII[7]]);
                Gear.swapTo(this.U.d(s));
                "".length();
                return llllIIllIII[7];
            } else if (lIllIlIIlIIIII(Combat.isSpecEnabled() ? 1 : 0)) {
                Log.info(llllIIlIlll[llllIIllIII[9]]);
                Combat.toggleSpec();
                return llllIIllIII[7];
            }
        }
        if (lIllIlIIlIIIII(i4) && lIllIlIIlIIIII(Gear.isEquipped(this.U.c(s)) ? 1 : 0)) {
            Gear.swapTo(this.U.c(s));
            "".length();
        }
        if (lIllIlIIlIIlII(Players.getLocal().getInteracting(), nearest)) {
            return llllIIllIII[7];
        }
        nearest.interact(llllIIlIlll[llllIIllIII[5]]);
        this.S.a(nearest);
        return llllIIllIII[7];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean f(d dVar) {
        if (lIllIlIIlIIlII(dVar, d.AHRIM) && lIllIlIIlIIIIl(this.T.specOnAhrim() ? 1 : 0)) {
            return llllIIllIII[7];
        }
        if (lIllIlIIlIIlII(dVar, d.KARIL) && lIllIlIIlIIIIl(this.T.specOnKaril() ? 1 : 0)) {
            ?? r0 = llllIIllIII[7];
            "".length();
            return (((243 ^ 139) ^ (96 ^ 66)) & (((101 ^ 24) ^ (101 ^ 66)) ^ (-" ".length()))) == ((214 ^ 175) ^ (236 ^ 145)) ? ((((6 + 45) - (-44)) + 48) ^ (((140 + 176) - 304) + 169)) & (((249 ^ 197) ^ (139 ^ 141)) ^ (-" ".length())) : r0;
        }
        return llllIIllIII[4];
    }

    public static int g(int i) {
        return lIllIlIIIllllI(i, llllIIllIII[0]) ? llllIIllIII[1] : Static.getClient().getEnum(llllIIllIII[2]).getIntValue(i) / llllIIllIII[3];
    }

    private static void lIllIlIIIlllII() {
        llllIIlIlll = new String[llllIIllIII[15]];
        llllIIlIlll[llllIIllIII[4]] = lIllIlIIIllIll("OAYFGlMaEgIBGhcUUTwxOD1RNz84ICU=", "ysqus");
        llllIIlIlll[llllIIllIII[7]] = lIllIlIIIllIll("NjYqCBkMLyxYHQphOAgMBmEsHQgX", "eAKxi");
        llllIIlIlll[llllIIllIII[9]] = lIllIlIIIllIll("EAIMKRgtAwxuBzQICA==", "DmkNt");
        llllIIlIlll[llllIIllIII[5]] = lIllIlIIIllIll("AiEtDCko", "CUYmJ");
    }

    private static boolean lIllIlIIlIIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllIlIIlIIIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIlIIlIIIIl(int i) {
        return i != 0;
    }

    private static void lIllIlIIIlllIl() {
        llllIIllIII = new int[16];
        llllIIllIII[0] = -" ".length();
        llllIIllIII[1] = (-((-3117) & 16047)) & (-1) & 14267;
        llllIIllIII[2] = (-20582) & 21487;
        llllIIllIII[3] = 9 ^ 3;
        llllIIllIII[4] = (2 ^ 97) & ((66 ^ 33) ^ (-1));
        llllIIllIII[5] = "   ".length();
        llllIIllIII[6] = (-2685) & 4093;
        llllIIllIII[7] = " ".length();
        llllIIllIII[8] = (-2049) & 14706;
        llllIIllIII[9] = "  ".length();
        llllIIllIII[10] = (-4733) & 6142;
        llllIIllIII[11] = (-((-577) & 30662)) & (-513) & 38893471;
        llllIIllIII[12] = 82 ^ 107;
        llllIIllIII[13] = (-26261) & 13198997;
        llllIIllIII[14] = 52 ^ 27;
        llllIIllIII[15] = (((11 + 2) - (-132)) + 5) ^ (((91 + 24) - 47) + 78);
    }

    static {
        lIllIlIIIlllIl();
        lIllIlIIIlllII();
        R = llllIIllIII[2];
    }

    private static boolean lIllIlIIlIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIIIlllll(Object obj) {
        return obj == null;
    }

    private static String lIllIlIIIllIll(String llllllllllllllllIIIllIlllIlllIll, String llllllllllllllllIIIllIlllIlllIlI) {
        String llllllllllllllllIIIllIlllIlllIll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIlllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIlllIlllIIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIIllIlllIlllIlI.toCharArray();
        int llllllllllllllllIIIllIlllIllIlll = llllIIllIII[4];
        char[] charArray2 = llllllllllllllllIIIllIlllIlllIll2.toCharArray();
        int length = charArray2.length;
        int i = llllIIllIII[4];
        while (lIllIlIIlIIllI(i, length)) {
            char llllllllllllllllIIIllIlllIllllII = charArray2[i];
            llllllllllllllllIIIllIlllIlllIIl.append((char) (llllllllllllllllIIIllIlllIllllII ^ charArray[llllllllllllllllIIIllIlllIllIlll % charArray.length]));
            "".length();
            llllllllllllllllIIIllIlllIllIlll++;
            i++;
            "".length();
            if ((-(94 ^ 90)) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIIllIlllIlllIIl);
    }

    @Inject
    public n(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig, a aVar) {
        this.S = squireBarrows;
        this.T = squireBarrowsConfig;
        this.U = aVar;
    }

    private static boolean lIllIlIIlIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIlIIlIIIII(int i) {
        return i == 0;
    }

    private int e(d dVar) {
        int i;
        if (lIllIlIIlIIlIl(dVar, d.AHRIM) && lIllIlIIlIIlIl(dVar, d.KARIL)) {
            return llllIIllIII[1];
        }
        EquipmentSetup equipmentSetup = (EquipmentSetup) this.T.karilSpecGear().selected(EquipmentSetup.class);
        EquipmentSetup equipmentSetup2 = (EquipmentSetup) this.T.ahrimSpecGear().selected(EquipmentSetup.class);
        int i2 = llllIIllIII[0];
        int i3 = llllIIllIII[0];
        if (lIllIlIIlIIIlI(equipmentSetup2)) {
            i2 = equipmentSetup2.get(EquipmentInventorySlot.WEAPON);
        }
        if (lIllIlIIlIIIlI(equipmentSetup)) {
            i3 = equipmentSetup.get(EquipmentInventorySlot.WEAPON);
        }
        if (lIllIlIIlIIlII(dVar, d.AHRIM)) {
            i = i2;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return (83 ^ 110) & ((3 ^ 62) ^ (-1));
            }
        } else {
            i = i3;
        }
        return g(i);
    }
}
