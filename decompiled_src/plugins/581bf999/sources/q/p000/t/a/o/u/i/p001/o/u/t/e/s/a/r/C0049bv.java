package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
@TaskDesc(name = "Attacking Obelisk", priority = 50)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bv  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bv.class */
public class C0049bv extends AbstractC0052by {
    private static /* synthetic */ String[] lIllIllIIll;
    private static /* synthetic */ int[] lIllIllIlIl;

    private static void lIIlIllllIlIll() {
        lIllIllIIll = new String[lIllIllIlIl[4]];
        lIllIllIIll[lIllIllIlIl[1]] = lIIlIllllIlIII("KSnsTCthHPo=", "ftVMY");
        lIllIllIIll[lIllIllIlIl[0]] = lIIlIllllIlIIl("k5h4rRRakdc=", "BtJpk");
    }

    private static boolean lIIlIllllIllll(int i) {
        return i != 0;
    }

    private static String lIIlIllllIlIIl(String llllllllllllllllIlIlIIIIlIlIllll, String llllllllllllllllIlIlIIIIlIlIlllI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIIlIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIIlIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllIlIl[4], llllllllllllllllIlIlIIIIlIllIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIIlIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIIlIlIlIll) {
            llllllllllllllllIlIlIIIIlIlIlIll.printStackTrace();
            return null;
        }
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> bs() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bq() {
        if (lIIlIlllllIIll(Combat.getSpecEnergy(), lIllIllIlIl[2])) {
            int[] iArr = new int[lIllIllIlIl[0]];
            iArr[lIllIllIlIl[1]] = lIllIllIlIl[3];
            if (!lIIlIlllllIIIl(Equipment.contains(iArr) ? 1 : 0)) {
                return lIllIllIlIl[1];
            }
        }
        ?? r0 = lIllIllIlIl[0];
        "".length();
        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        String[] strArr = new String[lIllIllIlIl[0]];
        strArr[lIllIllIlIl[1]] = lIllIllIIll[lIllIllIlIl[1]];
        NPC nearest = NPCs.getNearest(strArr);
        if (!lIIlIllllIlllI(nearest) && !lIIlIllllIllll(this.aY.g() ? 1 : 0)) {
            a(nearest, (boolean) lIllIllIlIl[0]);
            "".length();
            if (lIIlIlllllIIII(bg(), lIllIllIlIl[0]) && lIIlIlllllIIIl(nearest.getWorldArea().isInMeleeDistance(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlllllIIlI(TileObjects.getNearest(tileObject -> {
                return fH.contains(Integer.valueOf(tileObject.getId()));
            }))) {
                return lIllIllIlIl[1];
            }
            nearest.interact(lIllIllIIll[lIllIllIlIl[0]]);
            return lIllIllIlIl[0];
        }
        return lIllIllIlIl[1];
    }

    private static String lIIlIllllIlIII(String llllllllllllllllIlIlIIIIlIlIIIlI, String llllllllllllllllIlIlIIIIlIlIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIIlIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIIlIlIIIIl.getBytes(StandardCharsets.UTF_8)), lIllIllIlIl[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIllIlIl[4], llllllllllllllllIlIlIIIIlIlIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIIIIlIlIIIll) {
            llllllllllllllllIlIlIIIIlIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllllIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlllllIIIl(int i) {
        return i == 0;
    }

    private static boolean lIIlIlllllIIII(int i, int i2) {
        return i == i2;
    }

    @Inject
    protected C0049bv(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0052by, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.obeliskGear();
    }

    private static void lIIlIllllIllIl() {
        lIllIllIlIl = new int[6];
        lIllIllIlIl[0] = " ".length();
        lIllIllIlIl[1] = (43 ^ 72) & ((197 ^ 166) ^ (-1));
        lIllIllIlIl[2] = (((133 + 188) - 293) + 193) ^ (((37 + 2) - (-28)) + 118);
        lIllIllIlIl[3] = (-((-11299) & 16035)) & (-2049) & 32759;
        lIllIllIlIl[4] = "  ".length();
        lIllIllIlIl[5] = (((8 + 64) - 22) + 106) ^ (((139 + 132) - 189) + 66);
    }

    private static boolean lIIlIlllllIIll(int i, int i2) {
        return i >= i2;
    }

    static {
        lIIlIllllIllIl();
        lIIlIllllIlIll();
    }

    private static boolean lIIlIllllIlllI(Object obj) {
        return obj == null;
    }
}
