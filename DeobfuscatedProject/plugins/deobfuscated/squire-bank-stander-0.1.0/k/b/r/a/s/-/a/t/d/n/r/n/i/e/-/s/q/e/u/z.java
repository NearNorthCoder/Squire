/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import net.runelite.api.TileObject;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Molten Glass (Furnace)", register=true)
public class z
extends a {
    private static /* synthetic */ String[] lllIlIIIlII;
    private static /* synthetic */ int[] lllIlIIIlIl;

    @Inject
    public z(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.FURNACE_GLASS);
    }

    private static boolean lIlIllllIIIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public int i() {
        return lllIlIIIlIl[5];
    }

    private static void lIlIllllIIIllI() {
        lllIlIIIlIl = new int[7];
        z.lllIlIIIlIl[0] = -(0xFFFFBB9F & 0x5D69) & (0xFFFFDFFF & 0x3FFF);
        z.lllIlIIIlIl[1] = 1;
        z.lllIlIIIlIl[2] = -(0xFFFFEC79 & 0x538F) & (0xFFFFDEFF & 0x67FD);
        z.lllIlIIIlIl[3] = (0x5E ^ 0x19) & ~(0xD8 ^ 0x9F);
        z.lllIlIIIlIl[4] = 0x3F ^ 0x74;
        z.lllIlIIIlIl[5] = 8 ^ 0xD;
        z.lllIlIIIlIl[6] = 2;
    }

    private static void lIlIllllIIIlIl() {
        lllIlIIIlII = new String[lllIlIIIlIl[1]];
        z.lllIlIIIlII[z.lllIlIIIlIl[3]] = z."Smelt";
    }

    private static boolean lIlIllllIIlIlI(Object object) {
        return object == null;
    }

    static {
        z.lIlIllllIIIllI();
        z.lIlIllllIIIlIl();
    }

    private static boolean lIlIllllIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIlIIIlIl[0], lllIlIIIlIl[1], lllIlIIIlIl[2], lllIlIIIlIl[1]);
    }

    private static String lIlIllllIIIlII(String llllllllllllllllIIlIIllIIllllIlI, String llllllllllllllllIIlIIllIIlllIlll) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIIlllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIIlllllII = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIIlllllII.init(lllIlIIIlIl[6], llllllllllllllllIIlIIllIIlllllIl);
            return new String(llllllllllllllllIIlIIllIIlllllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIIllllIll) {
            llllllllllllllllIIlIIllIIllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllIIllII(Object object) {
        return object != null;
    }

    private static boolean lIlIllllIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllllIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var1_1;
        if (z.lIlIllllIIIlll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lllIlIIIlIl[3]);
            return lllIlIIIlIl[1];
        }
        if (z.lIlIllllIIIlll(Production.isOpen() ? 1 : 0)) {
            z llllllllllllllllIIlIIllIlIIIIlll;
            Production.choosePreviousOption();
            llllllllllllllllIIlIIllIlIIIIlll.sleep(llllllllllllllllIIlIIllIlIIIIlll.i());
            return lllIlIIIlIl[1];
        }
        if (z.lIlIllllIIlIII(Movement.isRunEnabled() ? 1 : 0) && z.lIlIllllIIlIIl(Movement.getRunEnergy(), lllIlIIIlIl[4])) {
            Movement.toggleRun();
            return lllIlIIIlIl[3];
        }
        TileObject llllllllllllllllIIlIIllIlIIIIllI = TileObjects.getNearest(tileObject -> {
            int n2;
            if (z.lIlIllllIIllII(tileObject.getActions())) {
                String[] stringArray = new String[lllIlIIIlIl[1]];
                stringArray[z.lllIlIIIlIl[3]] = lllIlIIIlII[lllIlIIIlIl[3]];
                if (z.lIlIllllIIIlll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIlIIIlIl[1];
                    0;
                    if (((138 + 124 - 199 + 105 ^ 104 + 188 - 243 + 140) & (0x23 ^ 0x35 ^ 3 ^ -1)) <= 0) return n2 != 0;
                    return ((0xE1 ^ 0x91 ^ (0xE9 ^ 0x94)) & (0xA3 ^ 0x99 ^ (0x1A ^ 0x2D) ^ -1)) != 0;
                }
            }
            n2 = lllIlIIIlIl[3];
            return n2 != 0;
        });
        if (z.lIlIllllIIlIlI(llllllllllllllllIIlIIllIlIIIIllI)) {
            return lllIlIIIlIl[3];
        }
        Inventory.use(item -> {
            boolean bl;
            if (z.lIlIllllIIlIll(item.getId(), lllIlIIIlIl[0])) {
                bl = lllIlIIIlIl[1];
                0;
                if (((0x4D ^ 0x5F ^ (0xC6 ^ 0xC1)) & (77 + 20 - 16 + 50 ^ 30 + 24 - -77 + 19 ^ -1)) >= 2) {
                    return ((0x3D ^ 0x38 ^ (0x98 ^ 0xC4)) & (0x7F ^ 0x5B ^ (0xFB ^ 0x86) ^ -1)) != 0;
                }
            } else {
                bl = lllIlIIIlIl[3];
            }
            return bl;
        }, (Interactable)var1_1);
        0;
        return lllIlIIIlIl[1];
    }
}

