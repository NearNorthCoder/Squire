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
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Attacking Akkha Shadow", priority = 25, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.at  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/at.class */
public class C0020at extends AbstractC0016ap {
    private static /* synthetic */ int[] lIlllllIIlI;
    private static /* synthetic */ String[] lIllllIlllI;

    private static boolean lIIllIllIIIlIl(int i) {
        return i == 0;
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0016ap, q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> br() {
        return this.cW.shadowAttackStyle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bq() {
        int[] iArr = new int[lIlllllIIlI[1]];
        iArr[lIlllllIIlI[0]] = lIlllllIIlI[3];
        if (lIIllIllIIIIll(Inventory.contains(iArr) ? 1 : 0)) {
            return lIlllllIIlI[1];
        }
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (lIIllIllIIIlII(fromSlot) && lIIllIllIIIIll(fromSlot.getName().contains(lIllllIlllI[lIlllllIIlI[4]]) ? 1 : 0) && lIIllIllIIlIII(Combat.getMissingHealth(), lIlllllIIlI[5]) && !lIIllIllIIlIIl(Combat.getSpecEnergy(), lIlllllIIlI[6])) {
            return lIlllllIIlI[0];
        }
        ?? r0 = lIlllllIIlI[1];
        "".length();
        return (44 ^ 40) <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    private static boolean lIIllIllIIlIIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIllIllIIIIll(int i) {
        return i != 0;
    }

    private static boolean lIIllIllIIlIII(int i, int i2) {
        return i >= i2;
    }

    private static void lIIllIlIllllIl() {
        lIllllIlllI = new String[lIlllllIIlI[2]];
        lIllllIlllI[lIlllllIIlI[0]] = lIIllIlIllIllI("iPX3eQujQXNbMCd59GqjPg==", "KqlYv");
        lIllllIlllI[lIlllllIIlI[1]] = lIIllIlIllIlll("eaWoyF9IIz0=", "rlhNa");
        lIllllIlllI[lIlllllIIlI[4]] = lIIllIlIllIllI("KnDQmiGM9Tp0lwcx7yvU/g==", "qTphR");
    }

    private static String lIIllIlIllIlll(String llllllllllllllllIlIIlIlIIllllIll, String llllllllllllllllIlIIlIlIIllllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIIllllIlI.getBytes(StandardCharsets.UTF_8)), lIlllllIIlI[7]), "DES");
            Cipher llllllllllllllllIlIIlIlIIlllllIl = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIlIIlllllIl.init(lIlllllIIlI[4], secretKeySpec);
            return new String(llllllllllllllllIlIIlIlIIlllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIlIIlllllII) {
            llllllllllllllllIlIIlIlIIlllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIIIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        if (lIIllIllIIIIll(bu() ? 1 : 0)) {
            return lIlllllIIlI[0];
        }
        WorldPoint a = bx().a(this.cu);
        String[] strArr = new String[lIlllllIIlI[1]];
        strArr[lIlllllIIlI[0]] = lIllllIlllI[lIlllllIIlI[0]];
        NPC nearest = NPCs.getNearest(a, strArr);
        if (!lIIllIllIIIlII(nearest) || lIIllIllIIIlIl(g(nearest) ? 1 : 0)) {
            return lIlllllIIlI[0];
        }
        Player local = Players.getLocal();
        if (lIIllIllIIIllI(local.getInteracting(), nearest) && lIIllIllIIIlIl(local.isMoving() ? 1 : 0) && lIIllIllIIIlll(nearest.distanceTo(local), lIlllllIIlI[2])) {
            g(nearest.getWorldLocation());
            return lIlllllIIlI[1];
        }
        bp();
        nearest.interact(lIllllIlllI[lIlllllIIlI[1]]);
        return lIlllllIIlI[1];
    }

    private static String lIIllIlIllIllI(String llllllllllllllllIlIIlIlIIllIlllI, String llllllllllllllllIlIIlIlIIllIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlIIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllllIIlI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIlIIllIllll) {
            llllllllllllllllIlIIlIlIIllIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIllIIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIllIllIIIlll(int i, int i2) {
        return i > i2;
    }

    @Inject
    protected C0020at(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static void lIIllIllIIIIlI() {
        lIlllllIIlI = new int[8];
        lIlllllIIlI[0] = ((17 ^ 125) ^ (5 ^ 56)) & (((((200 + 27) - 162) + 181) ^ (((164 + 94) - 106) + 15)) ^ (-" ".length()));
        lIlllllIIlI[1] = " ".length();
        lIlllllIIlI[2] = "   ".length();
        lIlllllIIlI[3] = (-((-9233) & 13681)) & (-5) & 31743;
        lIlllllIIlI[4] = "  ".length();
        lIlllllIIlI[5] = (((183 + 85) - 133) + 55) ^ (((75 + 96) - 156) + 155);
        lIlllllIIlI[6] = 90 ^ 10;
        lIlllllIIlI[7] = (117 ^ 48) ^ (67 ^ 14);
    }

    static {
        lIIllIllIIIIlI();
        lIIllIlIllllIl();
    }

    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public ConfigStorageBox<EquipmentSetup> bs() {
        return this.cW.shadowAttackStyle();
    }
}
