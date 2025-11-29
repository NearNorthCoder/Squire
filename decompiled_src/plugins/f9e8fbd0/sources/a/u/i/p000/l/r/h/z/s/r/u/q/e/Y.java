package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
@TaskDesc(name = "Enabling special", priority = 50)
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.Y  reason: invalid package */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/Y.class */
public class Y extends ad {
    private static /* synthetic */ int[] lIllIlllIllIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    @Override // a.u.i.p000.l.r.h.z.s.r.u.q.e.ad
    public boolean ac() {
        if (llIIlIIllIlIIII(Combat.isSpecEnabled() ? 1 : 0)) {
            return lIllIlllIllIl[0];
        }
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (!llIIlIIllIlIIIl(fromSlot) && !llIIlIIllIlIIlI(fromSlot.getId(), lIllIlllIllIl[1])) {
            if (!llIIlIIllIlIIll(Combat.getMissingHealth(), lIllIlllIllIl[2]) || llIIlIIllIlIlII(Combat.getSpecEnergy(), lIllIlllIllIl[3])) {
                return lIllIlllIllIl[0];
            }
            Combat.toggleSpec();
            return lIllIlllIllIl[4];
        }
        return lIllIlllIllIl[0];
    }

    private static boolean llIIlIIllIlIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlIIllIlIIlI(int i, int i2) {
        return i != i2;
    }

    @Inject
    protected Y(C0021v c0021v, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(c0021v, client, squireZulrahConfig);
    }

    private static boolean llIIlIIllIlIIII(int i) {
        return i != 0;
    }

    private static boolean llIIlIIllIlIIIl(Object obj) {
        return obj == null;
    }

    private static void llIIlIIllIIllll() {
        lIllIlllIllIl = new int[5];
        lIllIlllIllIl[0] = (" ".length() ^ (146 ^ 133)) & (((((16 + 92) - 59) + 112) ^ (((138 + 180) - 233) + 98)) ^ (-" ".length()));
        lIllIlllIllIl[1] = (-2050) & 14975;
        lIllIlllIllIl[2] = (72 ^ 53) ^ (69 ^ 50);
        lIllIlllIllIl[3] = (128 ^ 145) ^ (227 ^ 192);
        lIllIlllIllIl[4] = " ".length();
    }

    private static boolean llIIlIIllIlIIll(int i, int i2) {
        return i >= i2;
    }

    static {
        llIIlIIllIIllll();
    }
}
